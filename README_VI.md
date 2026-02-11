# Hệ Thống Quản Lý Quán Cà Phê

Ứng dụng Android toàn diện để quản lý hoạt động quán cà phê, được xây dựng bằng Java và Android SDK.

## 📋 Tổng Quan Dự Án

Đây là một ứng dụng di động được thiết kế để giúp chủ quán và nhân viên quán cà phê quản lý các hoạt động hàng ngày một cách hiệu quả. Hệ thống cung cấp các tính năng quản lý nhân viên, thực đơn, bàn ăn và theo dõi thống kê doanh số.

## ✨ Tính Năng

### 1. **Xác Thực Người Dùng**
- Hệ thống đăng nhập với tên đăng nhập và mật khẩu
- Khôi phục mật khẩu qua email
- Chức năng đổi mật khẩu
- Hai vai trò người dùng: Quản lý và Nhân viên

### 2. **Trang Chủ**
- Truy cập nhanh các tính năng chính
- Tổng quan trạng thái quán cà phê

### 3. **Quản Lý Bàn**
- Xem tất cả các bàn trong quán
- Theo dõi trạng thái bàn (đang sử dụng/trống)
- Quản lý đơn hàng theo từng bàn
- Xem tổng tiền hóa đơn của mỗi bàn

### 4. **Quản Lý Loại Món**
- Thêm, xem, sửa và xóa danh mục thực đơn
- Các danh mục mặc định: Cà Phê, Trà, Trà sữa

### 5. **Quản Lý Thực Đơn**
- Thêm món mới với tên, giá và loại
- Cập nhật món hiện có
- Xóa món
- Liên kết món với danh mục
- Hỗ trợ tải ảnh lên qua Cloudinary

### 6. **Quản Lý Nhân Viên**
- Thêm nhân viên mới với các thông tin:
  - Họ tên
  - Số điện thoại
  - Email
  - Tên đăng nhập
  - Mật khẩu
  - Loại tài khoản
- Xem danh sách nhân viên
- Sửa thông tin nhân viên
- Xóa nhân viên

### 7. **Thống Kê & Báo Cáo**
- **Doanh Thu**: Xem tổng doanh số và doanh thu
- **Đồ Uống Chạy Nhất**: Theo dõi các món bán chạy nhất

### 8. **Cài Đặt Người Dùng**
- Đổi mật khẩu
- Đăng xuất

## 🛠️ Công Nghệ Sử Dụng

- **Ngôn ngữ**: Java
- **Nền tảng**: Android
- **SDK Tối thiểu**: 28 (Android 9.0 Pie)
- **SDK Mục tiêu**: 33 (Android 13)
- **SDK Biên dịch**: 33
- **Công cụ Build**: Gradle 8.1.2

### Thư Viện & Phụ Thuộc Chính

- **AndroidX AppCompat** (1.6.1): Tương thích ngược
- **Material Design Components** (1.5.0): Các component UI hiện đại
- **ConstraintLayout** (2.1.4): Thiết kế layout linh hoạt
- **Cloudinary Android SDK** (2.3.1): Tải và quản lý hình ảnh
- **JavaMail API**: Chức năng email để khôi phục mật khẩu
- **JUnit** (4.13.2): Kiểm thử đơn vị
- **Espresso** (3.5.1): Kiểm thử UI

## 📊 Cấu Trúc Cơ Sở Dữ Liệu

Ứng dụng sử dụng cơ sở dữ liệu SQLite với các bảng sau:

### NHANVIEN (Nhân Viên)
- `maNhanVien` (INTEGER, PRIMARY KEY): Mã nhân viên
- `hoTen` (TEXT): Họ tên
- `soDienThoai` (TEXT): Số điện thoại
- `email` (TEXT): Địa chỉ email
- `tenDangNhap` (TEXT): Tên đăng nhập
- `matKhau` (TEXT): Mật khẩu
- `loaiTaiKhoan` (TEXT): Loại tài khoản (quản lý/nhân viên)

### LOAIMON (Loại Món)
- `maLoai` (INTEGER, PRIMARY KEY): Mã loại
- `tenLoai` (TEXT): Tên loại

### MON (Món)
- `maMon` (INTEGER, PRIMARY KEY): Mã món
- `tenMon` (TEXT): Tên món
- `giaTien` (INTEGER): Giá tiền
- `maLoai` (INTEGER, FOREIGN KEY): Tham chiếu loại món

### BAN (Bàn)
- `maBan` (INTEGER, PRIMARY KEY): Mã bàn
- `maNhanVien` (INTEGER, FOREIGN KEY): Tham chiếu nhân viên
- `maMon` (INTEGER, FOREIGN KEY): Tham chiếu món
- `tinhTrang` (INTEGER): Tình trạng (0=trống, 1=đang sử dụng)
- `tongTien` (INTEGER): Tổng tiền hóa đơn

## 🚀 Cài Đặt & Thiết Lập

### Yêu Cầu
- Android Studio Arctic Fox hoặc mới hơn
- Java Development Kit (JDK) 8 hoặc cao hơn
- Android SDK với API level 28 hoặc cao hơn
- Thiết bị Android hoặc giả lập chạy Android 9.0 trở lên

### Các Bước Chạy Ứng Dụng

1. **Clone repository**
   ```bash
   git clone https://github.com/sonnt6822/coffeeshop.git
   cd coffeeshop
   ```

2. **Mở trong Android Studio**
   - Mở Android Studio
   - Click "Open an Existing Project"
   - Điều hướng đến thư mục đã clone và chọn nó

3. **Đồng bộ Gradle**
   - Đợi Android Studio tự động đồng bộ các file Gradle
   - Nếu cần, click "Sync Now" trong thanh thông báo

4. **Thêm Các File JAR Cần Thiết**
   - Đảm bảo các file JAR sau có trong `app/libs/`:
     - `activation.jar`
     - `additionnal.jar`
     - `mail.jar`

5. **Chạy Ứng Dụng**
   - Kết nối thiết bị Android qua USB với chế độ USB debugging được bật, hoặc khởi động giả lập
   - Click nút "Run" (biểu tượng play màu xanh) trong Android Studio
   - Chọn thiết bị của bạn và đợi ứng dụng cài đặt

## 👤 Tài Khoản Mặc Định

Ứng dụng đi kèm với hai tài khoản được cấu hình sẵn:

### Tài Khoản Quản Lý
- **Tên đăng nhập**: `admin`
- **Mật khẩu**: `123456`
- **Họ tên**: Trọng Đức
- **Điện thoại**: 0373783569
- **Email**: duc43059@gmail.com

### Tài Khoản Nhân Viên
- **Tên đăng nhập**: `nhanvien`
- **Mật khẩu**: `123456`
- **Họ tên**: Minh Khoa
- **Điện thoại**: 0382876909
- **Email**: vkhoa30102004@gmail.com

## 📱 Luồng Ứng Dụng

1. **Màn Hình Chờ** (3 giây) → Màn Hình Đăng Nhập
2. **Đăng Nhập** → Màn Hình Chính với Navigation Drawer
3. **Navigation Drawer** cung cấp truy cập đến tất cả tính năng:
   - Trang chủ
   - Quản lý bàn
   - Quản lý loại món
   - Quản lý nhân viên (Chỉ Quản lý)
   - Thống kê
   - Cài đặt người dùng

## 🏗️ Cấu Trúc Dự Án

```
app/src/main/java/com/example/coffeeshop/
├── DAO/                    # Data Access Objects
│   ├── BanDao.java
│   ├── LoaiMonDao.java
│   ├── NhanVienDao.java
│   └── ThucDonDao.java
├── DTO/                    # Data Transfer Objects
│   ├── Ban.java
│   ├── LoaiMon.java
│   ├── Mon.java
│   └── NhanVien.java
├── Database/               # Database helper
│   └── DbHelper.java
├── adapter/                # RecyclerView Adapters
│   ├── BanAdapter.java
│   ├── LoaiMonadapter.java
│   ├── NhanVienAdapter.java
│   └── ThucDonAdapter.java
├── email/                  # Chức năng email
│   └── SendMail.java
├── fragment/               # UI Fragments
│   ├── BanFragment.java
│   ├── DoiMatKhauFragment.java
│   ├── LoaiMonFragment.java
│   ├── MonChayNhatFragment.java
│   ├── NhanvienFragment.java
│   ├── ThoatFragment.java
│   ├── ThongKeFragment.java
│   ├── ThucDonFragment.java
│   └── TrangChuFragment.java
├── HomeActivity.java       # Activity chính với navigation
├── LoginActivity.java      # Màn hình đăng nhập
└── MainActivity.java       # Màn hình chờ
```

## 🔐 Quyền Truy Cập

Ứng dụng yêu cầu các quyền sau:
- **INTERNET**: Cho chức năng email và tải ảnh lên Cloudinary
- **READ_EXTERNAL_STORAGE**: Để chọn ảnh từ bộ nhớ thiết bị

## 🌐 Ngôn Ngữ

Ứng dụng chủ yếu bằng **Tiếng Việt**, phù hợp cho các quán cà phê tại Việt Nam.

## 🎯 Mục Đích Dự Án

Đây là một dự án **ứng dụng quản lý quán cà phê** toàn diện, được phát triển nhằm mục đích:

1. **Học tập**: Minh họa các khái niệm phát triển ứng dụng Android với Java
2. **Thực tế**: Giải quyết các vấn đề quản lý thực tế của quán cà phê
3. **Chuyên nghiệp**: Sử dụng các thư viện và công cụ hiện đại trong phát triển Android

### Điểm Nổi Bật

- ✅ **Giao diện thân thiện**: Sử dụng Material Design
- ✅ **Quản lý toàn diện**: Từ nhân viên đến thực đơn và bàn
- ✅ **Bảo mật**: Hệ thống đăng nhập và phân quyền
- ✅ **Thống kê**: Báo cáo doanh thu và món bán chạy
- ✅ **Đa phương tiện**: Tích hợp upload ảnh cho món ăn
- ✅ **Email**: Khôi phục mật khẩu qua email

## 🤝 Đóng Góp

Nếu bạn muốn đóng góp cho dự án này:
1. Fork repository
2. Tạo nhánh tính năng (`git checkout -b feature/TinhNangMoi`)
3. Commit thay đổi (`git commit -m 'Thêm tính năng mới'`)
4. Push lên nhánh (`git push origin feature/TinhNangMoi`)
5. Mở Pull Request

## 📄 Giấy Phép

Dự án này có sẵn cho mục đích giáo dục. Vui lòng kiểm tra với chủ sở hữu repository để biết các điều khoản giấy phép cụ thể.

## 👨‍💻 Tác Giả

- Trọng Đức
- Minh Khoa

## 📞 Hỗ Trợ

Để được hỗ trợ hoặc có câu hỏi, vui lòng liên hệ:
- Email: duc43059@gmail.com
- Email: vkhoa30102004@gmail.com

---

## 💡 Đánh Giá Dự Án

**Đây là một dự án Coffee Shop Management xuất sắc** với các điểm mạnh sau:

### Ưu Điểm
1. **Cấu trúc rõ ràng**: Dự án được tổ chức theo mô hình DAO/DTO, dễ bảo trì
2. **Chức năng đầy đủ**: Bao gồm tất cả tính năng cần thiết cho một quán cà phê
3. **UI/UX tốt**: Sử dụng Material Design và Navigation Drawer
4. **Bảo mật cơ bản**: Có hệ thống đăng nhập và phân quyền
5. **Tích hợp thư viện**: Sử dụng Cloudinary cho upload ảnh, JavaMail cho email

### Gợi Ý Cải Tiến
1. Thêm mã hóa mật khẩu (hiện đang lưu plain text)
2. Thêm validation cho input
3. Thêm chức năng in hóa đơn
4. Tích hợp thanh toán điện tử
5. Thêm backup/restore database
6. Thêm đa ngôn ngữ (hiện chỉ có tiếng Việt)

**Tổng kết**: Đây là một dự án học tập/thực hành tốt, thể hiện kiến thức vững về Android development và thiết kế cơ sở dữ liệu.
