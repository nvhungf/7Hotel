USE [master]
GO
create database QuanLyKhachSan
use QuanLyKhachSan

CREATE TABLE [dbo].[DICHVU](
	[MaDV] [nchar](10) NOT NULL,
	[TenDV] [nvarchar](50) NOT NULL,
	[DonGia] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HOADON]    Script Date: 07/12/2020 10:33:23 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADON](
	[MaHD] [int] IDENTITY(1,1) NOT NULL,
	[MaPhong] [nchar](10) NOT NULL,
	[NgayThue] [date] NOT NULL,
	[NgayTra] [date] NOT NULL,
	[TenKhachHang] [nvarchar](50) NOT NULL,
	[TongTien] [float] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 07/12/2020 10:33:23 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[CMND] [nvarchar](50) NOT NULL,
	[TenKH] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LOAIPHONG]    Script Date: 07/12/2020 10:33:23 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAIPHONG](
	[MaLoai] [nchar](10) NOT NULL,
	[TenLoaiPhong] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 07/12/2020 10:33:23 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[MaNV] [nvarchar](50) NOT NULL,
	[TenNV] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[DiaChi] [nvarchar](200) NOT NULL,
	[DienThoai] [nvarchar](50) NOT NULL,
	[NgaySinh] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK__NHANVIEN__2725D70A90EA6F10] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHONG]    Script Date: 07/12/2020 10:33:23 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHONG](
	[MaPhong] [nchar](10) NOT NULL,
	[DonGia] [nvarchar](50) NOT NULL,
	[DonGiaTheoGio] [nvarchar](50) NULL,
	[MaLoai] [nchar](10) NOT NULL,
	[GhiChu] [nvarchar](200) NOT NULL,
 CONSTRAINT [PK__PHONG__20BD5E5BEE2F3B1E] PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHONGDATHUE]    Script Date: 07/12/2020 10:33:23 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHONGDATHUE](
	[MaPhong] [nchar](10) NOT NULL,
	[GiaPhong] [nvarchar](50) NOT NULL,
	[LoaiPhong] [nvarchar](50) NOT NULL,
	[TenKH] [nvarchar](50) NOT NULL,
	[CMND] [nvarchar](50) NOT NULL,
	[LoaiThue] [nvarchar](50) NOT NULL,
	[SoLuong] [nvarchar](50) NOT NULL,
	[NgayThue] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_PHONGDATHUE] PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[USERS]    Script Date: 07/12/2020 10:33:24 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[USERS](
	[username] [nvarchar](12) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[role] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[DICHVU] ([MaDV], [TenDV], [DonGia]) VALUES (N'DV1       ', N'Dọn phòng', N'100000')
INSERT [dbo].[DICHVU] ([MaDV], [TenDV], [DonGia]) VALUES (N'DV2       ', N'Bữa sáng', N'100000')
INSERT [dbo].[DICHVU] ([MaDV], [TenDV], [DonGia]) VALUES (N'DV3       ', N'Báo thức', N'50000')
INSERT [dbo].[DICHVU] ([MaDV], [TenDV], [DonGia]) VALUES (N'DV4       ', N'Gym', N'100000')
INSERT [dbo].[DICHVU] ([MaDV], [TenDV], [DonGia]) VALUES (N'DV5       ', N'Giặt ủi', N'50000')
SET IDENTITY_INSERT [dbo].[HOADON] ON 

INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (1, N'01        ', CAST(N'2020-12-03' AS Date), CAST(N'2020-12-05' AS Date), N'HUNG', 1)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (2, N'02        ', CAST(N'2020-12-10' AS Date), CAST(N'2020-12-15' AS Date), N'HAO', 5)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (3, N'03        ', CAST(N'2020-12-20' AS Date), CAST(N'2020-12-25' AS Date), N'SANG', 7)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (6, N'04        ', CAST(N'2020-11-20' AS Date), CAST(N'2020-11-20' AS Date), N'HHH', 2)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (7, N'05        ', CAST(N'2020-11-02' AS Date), CAST(N'2020-11-05' AS Date), N'DF', 5)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (9, N'07        ', CAST(N'2020-11-20' AS Date), CAST(N'2020-11-20' AS Date), N'FDSFSDF', 10)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (10, N'08        ', CAST(N'2019-11-20' AS Date), CAST(N'2019-11-20' AS Date), N'SFSF', 1)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (11, N'09        ', CAST(N'2019-12-20' AS Date), CAST(N'2019-12-20' AS Date), N'FDSF', 2)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (13, N'01        ', CAST(N'2020-12-20' AS Date), CAST(N'2020-12-20' AS Date), N'sdfsdf', 2)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (14, N'08        ', CAST(N'2020-12-05' AS Date), CAST(N'2020-12-05' AS Date), N'fdgg', 2)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (8, N'06        ', CAST(N'2020-11-20' AS Date), CAST(N'2020-11-28' AS Date), N'GFSDGDF', 6)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (15, N'dlx1      ', CAST(N'2020-07-12' AS Date), CAST(N'2020-07-12' AS Date), N'sangne', 0)
INSERT [dbo].[HOADON] ([MaHD], [MaPhong], [NgayThue], [NgayTra], [TenKhachHang], [TongTien]) VALUES (16, N'dlx2      ', CAST(N'2020-07-12' AS Date), CAST(N'2020-07-12' AS Date), N'', 0)
SET IDENTITY_INSERT [dbo].[HOADON] OFF
INSERT [dbo].[KHACHHANG] ([CMND], [TenKH]) VALUES (N'303134650', N'Hung')
INSERT [dbo].[KHACHHANG] ([CMND], [TenKH]) VALUES (N'123456789', N'ABC')
INSERT [dbo].[KHACHHANG] ([CMND], [TenKH]) VALUES (N'301737675', N'Sang')
INSERT [dbo].[KHACHHANG] ([CMND], [TenKH]) VALUES (N'378523655', N'Lê Văn A')
INSERT [dbo].[KHACHHANG] ([CMND], [TenKH]) VALUES (N'123123123', N'sangne')
INSERT [dbo].[KHACHHANG] ([CMND], [TenKH]) VALUES (N'', N'')
INSERT [dbo].[LOAIPHONG] ([MaLoai], [TenLoaiPhong]) VALUES (N'DLX       ', N'Phòng Deluxe')
INSERT [dbo].[LOAIPHONG] ([MaLoai], [TenLoaiPhong]) VALUES (N'STD       ', N'Phòng Standard')
INSERT [dbo].[LOAIPHONG] ([MaLoai], [TenLoaiPhong]) VALUES (N'SUP       ', N'Phòng Superior')
INSERT [dbo].[LOAIPHONG] ([MaLoai], [TenLoaiPhong]) VALUES (N'SUT       ', N'Phòng Suite')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [DienThoai], [NgaySinh]) VALUES (N'NV1       ', N'Đỗ Thành Sang', 1, N'Q12', N'0354216205', N'6/12/2001')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [DienThoai], [NgaySinh]) VALUES (N'NV2       ', N'Nguyễn Văn Hùng', 1, N'Q12', N'0352539533', N'6/6/2001')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [DienThoai], [NgaySinh]) VALUES (N'NV3       ', N'Nguyễn Nhật Hào', 1, N'Q12', N'0333222111', N'1/1/2001')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [DienThoai], [NgaySinh]) VALUES (N'NV4       ', N'Nguyễn Hoàng Phúc', 0, N'Q12', N'0987654321', N'10/10/2001')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'DLX1      ', N'1000000', N'300000', N'DLX       ', N'Chưa thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'DLX2      ', N'1000000', N'300000', N'DLX       ', N'Chưa thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'DLX3      ', N'1000000', N'300000', N'DLX       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'STD1      ', N'500000', N'200000', N'STD       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'STD2      ', N'500000', N'200000', N'STD       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'STD3      ', N'500000', N'200000', N'STD       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'SUP1      ', N'700000', N'250000', N'SUP       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'SUP2      ', N'700000', N'250000', N'SUP       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'SUP3      ', N'700000', N'250000', N'SUP       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'SUT1      ', N'2000000', N'500000', N'SUT       ', N'Đã thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'SUT2      ', N'2000000', N'500000', N'SUT       ', N'Chưa thuê')
INSERT [dbo].[PHONG] ([MaPhong], [DonGia], [DonGiaTheoGio], [MaLoai], [GhiChu]) VALUES (N'SUT3      ', N'2000000', N'500000', N'SUT       ', N'Chưa thuê')
INSERT [dbo].[PHONGDATHUE] ([MaPhong], [GiaPhong], [LoaiPhong], [TenKH], [CMND], [LoaiThue], [SoLuong], [NgayThue]) VALUES (N'SUP2      ', N'700000', N'SUP', N'ABC', N'123456789', N'Theo giờ', N'3', N'30')
INSERT [dbo].[PHONGDATHUE] ([MaPhong], [GiaPhong], [LoaiPhong], [TenKH], [CMND], [LoaiThue], [SoLuong], [NgayThue]) VALUES (N'SUT1      ', N'2e+006', N'SUT', N'Hung', N'303134650', N'Theo ngày', N'1', N'23')
INSERT [dbo].[USERS] ([username], [password], [role]) VALUES (N'sang612', N'123', N'admin')
ALTER TABLE [dbo].[PHONG]  WITH CHECK ADD  CONSTRAINT [FK__PHONG__MaLoai__3B75D760] FOREIGN KEY([MaLoai])
REFERENCES [dbo].[LOAIPHONG] ([MaLoai])
GO
ALTER TABLE [dbo].[PHONG] CHECK CONSTRAINT [FK__PHONG__MaLoai__3B75D760]
GO
ALTER TABLE [dbo].[PHONGDATHUE]  WITH CHECK ADD  CONSTRAINT [FK_PHONGDATHUE_PHONG] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[PHONG] ([MaPhong])
GO
ALTER TABLE [dbo].[PHONGDATHUE] CHECK CONSTRAINT [FK_PHONGDATHUE_PHONG]
GO
/****** Object:  StoredProcedure [dbo].[sp_DoanhThuNam]    Script Date: 07/12/2020 10:33:24 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create PROC [dbo].[sp_DoanhThuNam] (@Nam varchar(10))
AS BEGIN
	SELECT 
		@Nam nam,
		SUM(TongTien) DoanhThu
	FROM HOADON
	WHERE YEAR(NgayTra) = @nam 
END
GO
/****** Object:  StoredProcedure [dbo].[sp_DoanhThuNgay]    Script Date: 07/12/2020 10:33:24 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_DoanhThuNgay] @ngay varchar(50)
AS BEGIN
	SELECT 
	@ngay ngay,
		SUM(TongTien) DoanhThu
	FROM HOADON
	WHERE NgayTra = @ngay
END
GO
/****** Object:  StoredProcedure [dbo].[sp_DoanhThuThang]    Script Date: 07/12/2020 10:33:24 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_DoanhThuThang] (@Nam varchar(10), @Thang varchar(10))
AS BEGIN
	SELECT 
		@Thang Thang,
		SUM(TongTien) DoanhThu
	FROM HOADON
	WHERE YEAR(NgayTra) = @nam AND MONTH(NgayTra) = @Thang
END
GO
USE [master]
GO
ALTER DATABASE [QuanLyKhachSan] SET  READ_WRITE 
GO
