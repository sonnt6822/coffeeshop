package com.example.coffeeshop.fragment;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.coffeeshop.DAO.NhanVienDao;
import com.example.coffeeshop.DTO.NhanVien;
import com.example.coffeeshop.R;
import com.google.android.material.textfield.TextInputEditText;

public class ThongTinCaNhanFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thongtincanhan_fragment, container, false);
        
        TextInputEditText edtHoTen = view.findViewById(R.id.edtHoTen);
        TextInputEditText edtSoDienThoai = view.findViewById(R.id.edtSoDienThoai);
        TextInputEditText edtEmail = view.findViewById(R.id.edtEmail);
        TextInputEditText edtTenDangNhap = view.findViewById(R.id.edtTenDangNhap);
        Button btnCapNhat = view.findViewById(R.id.btnCapNhat);

        // Get current user from SharedPreferences
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("INFO", MODE_PRIVATE);
        String tenDangNhap = sharedPreferences.getString("userLogin", "");

        // Load user data
        NhanVienDao nhanVienDao = new NhanVienDao(requireContext());
        NhanVien nhanVien = nhanVienDao.getNhanVienByUsername(tenDangNhap);

        if (nhanVien != null) {
            edtHoTen.setText(nhanVien.getHoTen());
            edtSoDienThoai.setText(nhanVien.getSdt());
            edtEmail.setText(nhanVien.getEmail());
            edtTenDangNhap.setText(nhanVien.getTaiKhoan());
        }

        btnCapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoTen = edtHoTen.getText().toString().trim();
                String sdt = edtSoDienThoai.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();

                // Validation
                if (hoTen.isEmpty() || sdt.isEmpty() || email.isEmpty()) {
                    Toast.makeText(requireContext(), "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Validate email format
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(requireContext(), "Email không hợp lệ", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Validate phone number (basic validation)
                if (sdt.length() < 10) {
                    Toast.makeText(requireContext(), "Số điện thoại không hợp lệ", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Update profile
                boolean check = nhanVienDao.capNhatThongTinCaNhan(tenDangNhap, hoTen, sdt, email);
                if (check) {
                    Toast.makeText(requireContext(), "Cập nhật thông tin thành công", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(requireContext(), "Cập nhật thông tin không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}
