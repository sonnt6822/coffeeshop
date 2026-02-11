# Coffee Shop Management System

A comprehensive Android application for managing coffee shop operations, built with Java and Android SDK.

## 📋 Project Overview

This is a mobile application designed to help coffee shop owners and staff manage their daily operations efficiently. The system provides features for managing employees, menu items, tables, and tracking sales statistics.

## ✨ Features

### 1. **User Authentication**
- Login system with username and password
- Password recovery via email
- Change password functionality
- Two user roles: Manager (quản lý) and Staff (nhân viên)

### 2. **Home Dashboard (Trang chủ)**
- Quick access to main features
- Overview of the coffee shop status

### 3. **Table Management (Quản Lý Bàn)**
- View all tables in the coffee shop
- Track table status (occupied/available)
- Manage orders per table
- View total bill amount for each table

### 4. **Menu Category Management (Quản Lý Loại Món)**
- Create, read, update, and delete menu categories
- Default categories: Coffee (Cà Phê), Tea (Trà), Milk Tea (Trà sữa)

### 5. **Menu Item Management (Thực đơn)**
- Add new menu items with name, price, and category
- Update existing menu items
- Delete menu items
- Associate items with categories
- Image upload support via Cloudinary integration

### 6. **Employee Management (Quản lý nhân viên)**
- Add new employees with details:
  - Full name (Họ Tên)
  - Phone number (Số Điện Thoại)
  - Email
  - Username (Tên Đăng Nhập)
  - Password (Mật Khẩu)
  - Account type (Loại Tài Khoản)
- View employee list
- Edit employee information
- Delete employees

### 7. **Statistics & Reports (Thống kê)**
- **Revenue Tracking (Doanh thu)**: View total sales and revenue
- **Best Selling Items (Đồ uống chạy nhất)**: Track which items are most popular

### 8. **User Settings**
- Change password (Đổi mật khẩu)
- Logout (Đăng xuất)

## 🛠️ Technology Stack

- **Language**: Java
- **Platform**: Android
- **Minimum SDK**: 28 (Android 9.0 Pie)
- **Target SDK**: 33 (Android 13)
- **Compile SDK**: 33
- **Build Tool**: Gradle 8.1.2

### Key Libraries & Dependencies

- **AndroidX AppCompat** (1.6.1): Backward compatibility
- **Material Design Components** (1.5.0): Modern UI components
- **ConstraintLayout** (2.1.4): Flexible layout design
- **Cloudinary Android SDK** (2.3.1): Image upload and management
- **JavaMail API**: Email functionality for password recovery
- **JUnit** (4.13.2): Unit testing
- **Espresso** (3.5.1): UI testing

## 📊 Database Schema

The application uses SQLite database with the following tables:

### NHANVIEN (Employees)
- `maNhanVien` (INTEGER, PRIMARY KEY): Employee ID
- `hoTen` (TEXT): Full name
- `soDienThoai` (TEXT): Phone number
- `email` (TEXT): Email address
- `tenDangNhap` (TEXT): Username
- `matKhau` (TEXT): Password
- `loaiTaiKhoan` (TEXT): Account type (quan ly/nhan vien)

### LOAIMON (Menu Categories)
- `maLoai` (INTEGER, PRIMARY KEY): Category ID
- `tenLoai` (TEXT): Category name

### MON (Menu Items)
- `maMon` (INTEGER, PRIMARY KEY): Item ID
- `tenMon` (TEXT): Item name
- `giaTien` (INTEGER): Price
- `maLoai` (INTEGER, FOREIGN KEY): Category reference

### BAN (Tables)
- `maBan` (INTEGER, PRIMARY KEY): Table ID
- `maNhanVien` (INTEGER, FOREIGN KEY): Employee reference
- `maMon` (INTEGER, FOREIGN KEY): Menu item reference
- `tinhTrang` (INTEGER): Status (0=available, 1=occupied)
- `tongTien` (INTEGER): Total bill amount

## 🚀 Installation & Setup

### Prerequisites
- Android Studio Arctic Fox or later
- Java Development Kit (JDK) 8 or higher
- Android SDK with API level 28 or higher
- An Android device or emulator running Android 9.0 or higher

### Steps to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/sonnt6822/coffeeshop.git
   cd coffeeshop
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Click "Open an Existing Project"
   - Navigate to the cloned repository and select it

3. **Sync Gradle**
   - Wait for Android Studio to sync Gradle files automatically
   - If needed, click "Sync Now" in the notification bar

4. **Add Required JAR Files**
   - Ensure the following JAR files are present in `app/libs/`:
     - `activation.jar`
     - `additionnal.jar`
     - `mail.jar`

5. **Run the Application**
   - Connect an Android device via USB with USB debugging enabled, or start an emulator
   - Click the "Run" button (green play icon) in Android Studio
   - Select your device and wait for the app to install

## 👤 Default Credentials

The application comes with two pre-configured accounts:

### Manager Account
- **Username**: `admin`
- **Password**: `123456`
- **Full Name**: Trọng Đức
- **Phone**: 0373783569
- **Email**: duc43059@gmail.com

### Staff Account
- **Username**: `nhanvien`
- **Password**: `123456`
- **Full Name**: Minh Khoa
- **Phone**: 0382876909
- **Email**: vkhoa30102004@gmail.com

## 📱 Application Flow

1. **Splash Screen** (3 seconds) → Login Screen
2. **Login** → Home Screen with Navigation Drawer
3. **Navigation Drawer** provides access to all features:
   - Home
   - Table Management
   - Menu Category Management
   - Employee Management (Manager only)
   - Statistics
   - User Settings

## 🏗️ Project Structure

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
├── email/                  # Email functionality
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
├── HomeActivity.java       # Main activity with navigation
├── LoginActivity.java      # Login screen
└── MainActivity.java       # Splash screen
```

## 🔐 Permissions

The application requires the following permissions:
- **INTERNET**: For email functionality and Cloudinary image uploads
- **READ_EXTERNAL_STORAGE**: For selecting images from device storage

## 🌐 Language

The application is primarily in **Vietnamese** (Tiếng Việt), making it suitable for Vietnamese coffee shop businesses.

## 🤝 Contributing

If you'd like to contribute to this project:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is available for educational purposes. Please check with the repository owner for specific license terms.

## 👨‍💻 Authors

- Trọng Đức
- Minh Khoa

## 📞 Support

For support or questions, please contact:
- Email: duc43059@gmail.com
- Email: vkhoa30102004@gmail.com

---

**Note**: This is a student/learning project demonstrating Android application development with Java, SQLite database management, and Material Design principles.
