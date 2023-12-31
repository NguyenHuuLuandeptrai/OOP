--Tao csdl QLSV
CREATE DATABASE QLSV

--Su dung CSDL
USE QLSV

--Xoa csdl QLSV
DROP DATABASE QLSV


--1/Tao bang CT_DaoTao
CREATE TABLE CT_DaoTao
(
	MaCTDT varchar(10)not null,
	TenCTDT nvarchar(50)
)


--2/Tao bang KhoaHoc
CREATE TABLE KhoaHoc
(
	MaKH varchar(10)not null,
	MaCTDT varchar(10)not null,
	TenKH nvarchar(50)
)

--3/Tao bang Lop
CREATE TABLE Lop
(
	MaLop varchar(10)not null,
	MaKH varchar(10)not null,
	TenLop nvarchar(50)
)

--4/Tao bang MonHoc
CREATE TABLE MonHoc
(
	MaMH varchar(10)not null,
	TenMH nvarchar(50)
)

--5/Tao bang SinhVien
CREATE TABLE SinhVien
(
	MaSV varchar(10)not null,
	HoTen nvarchar(50),
	GioiTinh nvarchar(10),
	NgaySinh datetime,
	NoiSinh nvarchar(30),
	MaLop varchar(10)not null
)

--6/Tao bang KetQuaThi
CREATE TABLE KetQuaThi
(
	MaSV varchar(10)not null,
	MaMH varchar(10)not null,
	LanThi int not null,
	DiemThi float
)

--Xem tat ca cac bang

SELECT *
FROM CT_DaoTao

SELECT *
FROM KhoaHoc

SELECT *
FROM Lop

SELECT *
FROM MonHoc

SELECT *
FROM SinhVien

SELECT *
FROM KetQuaThi

--Tao khoa chinh
ALTER TABLE CT_DaoTao ADD CONSTRAINT PK_CT_DaoTao PRIMARY KEY(MaCTDT)  
ALTER TABLE KhoaHoc ADD CONSTRAINT PK_KhoaHoc PRIMARY KEY(MaKH) 
ALTER TABLE Lop ADD CONSTRAINT PK_Lop PRIMARY KEY(MaLop) 
ALTER TABLE MonHoc ADD CONSTRAINT PK_MonHoc PRIMARY KEY(MaMH)
ALTER TABLE SinhVien ADD CONSTRAINT PK_SinhVien PRIMARY KEY(MaSV)
ALTER TABLE KetQuaThi ADD CONSTRAINT PK_KetQuaThi PRIMARY KEY(MaSV,MaMH,LanThi)

--Tao khoa ngoai
ALTER TABLE KhoaHoc ADD CONSTRAINT FK_KH_MaCTDT FOREIGN KEY (MaCTDT) REFERENCES CT_DaoTao(MaCTDT)
ALTER TABLE Lop ADD CONSTRAINT FK_Lop_MaKH FOREIGN KEY (MaKH) REFERENCES KhoaHoc(MaKH)
ALTER TABLE SinhVien ADD CONSTRAINT FK_SinhVien_MaLop FOREIGN KEY (MaLop) REFERENCES Lop(MaLop)
ALTER TABLE KetQuaThi ADD CONSTRAINT FK_KetQuaThi_MaSV FOREIGN KEY (MaSV) REFERENCES SinhVien(MaSV)
ALTER TABLE KetQuaThi ADD CONSTRAINT FK_KetQuaThi_MaMH FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)

--Them vao bang MonHoc mot bo gia tri
INSERT INTO MonHoc 
VALUES('TH112',N'Kiến trúc máy tính')

--Them du lieu vao bang CT_DaoTao
INSERT INTO CT_DaoTao VALUES('1',N'Cử Nhân')
INSERT INTO CT_DaoTao VALUES('2',N'Cao Đẳng')
INSERT INTO CT_DaoTao VALUES('3',N'Trung Cấp')

--Them du lieu vao bang KhoaHoc
INSERT INTO KhoaHoc VALUES('1','1',N'Khóa 1 năm 2005')
INSERT INTO KhoaHoc VALUES('2','1',N'Khóa 2 năm 2006')
INSERT INTO KhoaHoc VALUES('3','2',N'Khóa 1 năm 2007')
INSERT INTO KhoaHoc VALUES('4','3',N'Khóa 1 năm 2008')
INSERT INTO KhoaHoc VALUES('5','2',N'Khóa 2 năm 2008')

--Them du lieu vao bang Lop
INSERT INTO Lop VALUES('1','1','K1_1')
INSERT INTO Lop VALUES('2','1','K2_1')
INSERT INTO Lop VALUES('3','1','K3_1')
INSERT INTO Lop VALUES('4','2','K3_2')

--Them du lieu vao bang SinhVien
INSERT INTO SinhVien VALUES('K116',N'Đinh Nguyễn Vân Anh',N'Nữ','1985-12-18',N'Bình Thuận','1')
INSERT INTO SinhVien VALUES('K117',N'Trần Hoàng Anh',N'Nữ','1986-8-4',N'Bình Dương','1')
INSERT INTO SinhVien VALUES('K118',N'Bùi Thanh Bình',N'Nam','1985-10-23',N'Đồng Nai','1')
INSERT INTO SinhVien VALUES('K119',N'Phạm Nhật Tân',N'Nam','1985-1-15',N'Đồng Tháp','2')
INSERT INTO SinhVien VALUES('K120',N'Định Thiện Hòa',N'Nam','1985-12-8',N'Vĩnh Long','3')
INSERT INTO SinhVien VALUES('K121',N'Nguyễn Anh Khoa',N'Nam','1985-11-14',N'Vũng Tàu','3')
INSERT INTO SinhVien VALUES('K122',N'Trương Mộng Thúy',N'Nữ','1986-5-12',N'Cần Thơ','2')
INSERT INTO SinhVien VALUES('K123',N'Võ Anh Thi',N'Nữ','1986-5-23',N'Bến Tre','2')

--Them du lieu vao bang MonHoc
INSERT INTO MonHoc VALUES('TH101',N'Tin học đại cương')
INSERT INTO MonHoc VALUES('TH110',N'Toán rời rạc')
INSERT INTO MonHoc VALUES('TH102',N'Cơ sở dữ liệu')
--Them du lieu vao bang KetQuaThi
INSERT INTO KetQuaThi VALUES('K116','TH101','1','8')
INSERT INTO KetQuaThi VALUES('K117','TH101','1','4')
INSERT INTO KetQuaThi VALUES('K118','TH101','1','6.5')
INSERT INTO KetQuaThi VALUES('K119','TH102','1','5')
INSERT INTO KetQuaThi VALUES('K120','TH102','1','7')
INSERT INTO KetQuaThi VALUES('K116','TH110','1','7')
INSERT INTO KetQuaThi VALUES('K118','TH102','1','9')
INSERT INTO KetQuaThi VALUES('K119','TH101','1','6')
INSERT INTO KetQuaThi VALUES('K120','TH101','1','5')
INSERT INTO KetQuaThi VALUES('K116','TH102','1','7.5')
INSERT INTO KetQuaThi VALUES('K117','TH101','2','7')

--II Thuc hien cac yeu cau bang ngon ngu SQL
--1/Them vao bang SinhVien cot GhiChu
ALTER TABLE SinhVien ADD GhiChu
varchar(20)

--2/Them vao bang MonHoc mot bo gia tri (TH112, Kien truc may tinh)
INSERT INTO MonHoc 
VALUES('TH112',N'Kiến trúc máy tính')

--3/ Trong bang KetQuaThi, sua diem thi mon hoc co ma TH101 cua sinh vien co ma so K116 thanh 7.5
UPDATE KetQuaThi SET DiemThi = '7.5'
WHERE MaSV = 'K116'

--4/ Liet ke ma sinh vien, ho ten cua tat cac cac sinh vien
SELECT MaSV, HoTen
FROM SinhVien

--5/ Liet ke danh sach cac mon hoc 
SELECT TenMH
FROM MonHoc

-- 6/ In ra danh sach cac sinh vien thuoc lop 'K1_1'
SELECT *
FROM SinhVien INNER JOIN Lop
ON SinhVien.MaLop = Lop.MaLop
WHERE Lop.TenLop = 'K1_1'

--7/ In ra DSSV sinh nam 1985 
SELECT*
FROM SinhVien
WHERE YEAR(NgaySinh) = '1985'

--8/In ra DSSV thuoc chuong trinh dao tao "Cử nhân"
SELECT *
FROM CT_DaoTao INNER JOIN KhoaHoc 
ON CT_DaoTao.MaCTDT = KhoaHoc.MaCTDT
INNER JOIN Lop 
ON KhoaHoc.MaKH = Lop.MaKH
INNER JOIN SinhVien
ON Lop.MaLop = SinhVien.MaLop
WHERE CT_DaoTao.TenCTDT = N'Cử Nhân'

--9/Liet ke ma sinh vien, ho ten cung voi diem thi cua mon "Tin hoc dai cuong"
SELECT HoTen, DiemThi
FROM MonHoc INNER JOIN KetQuaThi
ON MonHoc.MaMH = KetQuaThi.MaMH
INNER JOIN SinhVien
ON KetQuaThi.MaSV = SinhVien.MaSV
WHERE MonHoc.TenMH = N'Tin học đại cương'

--10/Cho biet so luong sinh vien cua lop 'K3_1'
SELECT COUNT(*)
FROM SinhVien INNER JOIN Lop
ON SinhVien.MaLop = Lop.MaLop
WHERE Lop.TenLop = 'K3_1'

--11/Cho biet so luong sinh vien cua tung lop
SELECT Lop.TenLop,SinhVien.MaLop,COUNT(SinhVien.MaLop)AS soluong  --AS la dat ten cho mot cot chua so luong 
FROM SinhVien INNER JOIN Lop
ON SinhVien.MaLop = Lop.MaLop
GROUP BY SinhVien.MaLop, Lop.TenLop

--12/Thong ke so luong sinh vien theo gioi tinh
SELECT SinhVien.GioiTinh, COUNT(SinhVien.GioiTinh)AS soluong
FROM SinhVien
GROUP BY SinhVien.GioiTinh

--13/Thống kê số lượng sinh viên theo nơi sinh
SELECT SinhVien.NoiSinh, COUNT(SinhVien.NoiSinh)AS soluong
FROM SinhVien
GROUP BY SinhVien.NoiSinh

--14/Thong ke so luong sinh vien theo tung CTDT
SELECT CT_DaoTao.TenCTDT ,Lop.MaLop, COUNT(SinhVien.MaLop)AS soluong
FROM CT_DaoTao INNER JOIN KhoaHoc 
ON CT_DaoTao.MaCTDT = KhoaHoc.MaCTDT
INNER JOIN Lop 
ON KhoaHoc.MaKH = Lop.MaKH
INNER JOIN SinhVien
ON Lop.MaLop = SinhVien.MaLop
GROUP BY SinhVien.MaLop, CT_DaoTao.TenCTDT, Lop.MaLop

--19/Liet ke ten sinh vien cung ten mon hoc phai thi 2 lan tro len
SELECT HoTen, TenMH
FROM SinhVien, KetQuaThi,MonHoc
WHERE SinhVien.MaSV = KetQuaThi.MaSV
AND KetQuaThi.MaMH = MonHoc.MaMH
AND LanThi = '2'