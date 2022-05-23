
use Project
CREATE TABLE Account(
	AccountID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	username varchar(30) NOT NULL,
	[password] varchar(30) NULL,
	name varchar(30) NOT NULL,
	amount float NULL,
	)  drop table Account
GO
CREATE TABLE Category(
	CategoryID int IDENTITY(1,1)  NOT NULL PRIMARY KEY,
	Categoryname nvarchar(50) NULL
	)   drop table Category
GO
CREATE TABLE Product(
	ProductID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	name nvarchar(50) NULL,
	price float NULL,
	discount int NULL,
	[image] varchar(50) NULL,
	color varchar(55) NULL,
	Size int NULL,
	quantity int NULL,
	CategoryID int FOREIGN KEY REFERENCES Category(CategoryID)
	)  drop table Product
GO
CREATE TABLE [Order](
	OrderID int IDENTITY(1,1)  NOT NULL PRIMARY KEY,
	[Date] varchar(50),
	Total float,
    AccountID int FOREIGN KEY REFERENCES Account(AccountID)
	)  drop table [Order]
GO
CREATE TABLE OrderDetail(
	OrderDetailID int IDENTITY(1,1)  NOT NULL PRIMARY KEY,
    ProductID int FOREIGN KEY REFERENCES Product(ProductID),
	OrderID int FOREIGN KEY REFERENCES [Order](OrderID),
	Quantity int,
	ProductPrice float,
	)     drop table OrderDetail

GO
INSERT Account  VALUES ('admin', 'admin', 'ADMIN', 145000)
INSERT Account  VALUES ('duc', '123', 'ANH DUC', 230000)
INSERT Account  VALUES ('ha', '123', 'BAO HA', 234500)
INSERT Account  VALUES ('duy', '123', 'HAI DUY', 126000)
INSERT Account  VALUES ('huyen', '123', 'NGUYEN HUYEN', 765000)
INSERT Account  VALUES ('viet', '123', 'LE VIET', 335000)

GO
INSERT Category  VALUES ( 'Iphone SE')
INSERT Category  VALUES ( 'Iphone 7')
INSERT Category  VALUES ( 'Iphone 8')
INSERT Category  VALUES ( 'Iphone XSM')
INSERT Category  VALUES ( 'Iphone 11')
INSERT Category  VALUES ( 'Iphone 12')
INSERT Category  VALUES ( 'Iphone 13')

GO
INSERT Product  VALUES ( N'Iphone SE', 4700, 10, 'images/se2020.jpg', 'white', 64, 100, 1)
INSERT Product  VALUES ( N'Iphone 7G', 3000, 20, 'images/7g.jpg', 'black', 32, 50, 2)
INSERT Product  VALUES ( N'Iphone 7 Plus',  4500, 10, 'images/7plus.jpg', 'pink', 64, 100, 2)
INSERT Product  VALUES ( N'Iphone 8G', 4000, 10, 'images/8g.jpg', 'red', 32, 60, 3)
INSERT Product  VALUES ( N'Iphone 8 Plus', 5000, 15, 'images/8plus.jpg', 'pink', 128, 60, 3)
INSERT Product  VALUES ( N'Iphone XSM', 9000, 15, 'images/xsm.jpg', 'gold', 64, 70, 4)
INSERT Product  VALUES ( N'Iphone XSM GRAY', 9500, 20, 'images/xsmg.jpg', 'black', 64, 80, 4)
INSERT Product  VALUES ( N'Iphone 11', 11000, 25, 'images/11.jpg', 'white', 64, 90, 5)
INSERT Product  VALUES ( N'Iphone 11 PRO', 13000, 15, 'images/11pro.jpg', 'white', 64, 100, 5)
INSERT Product  VALUES ( N'Iphone 11 PRM', 16000, 30, 'images/11prm.jpg', 'black', 128, 50, 5)
INSERT Product  VALUES ( N'Iphone 12', 19000, 25, 'images/12.jpg', 'blue', 128, 60, 6)
INSERT Product  VALUES ( N'Iphone 12 PRM', 22000, 25, 'images/12prm.jpg', 'gold', 256, 60, 6)
INSERT Product  VALUES ( N'Iphone 13', 24000, 10, 'images/13.jpg', 'pink', 512, 70, 7)
INSERT Product  VALUES ( N'Iphone 13 PRM', 29000, 15, 'images/13prm.jpg', 'gold', 1024, 50, 7)
 
GO
INSERT [Order]  VALUES ( '24/03/2021', 19000, 1)
INSERT [Order]  VALUES ( '15/01/2021', 22000, 2)
INSERT [Order]  VALUES ( '22/08/2021', 4500, 3)
INSERT [Order]  VALUES ( '14/02/2021', 16000, 4)
INSERT [Order]  VALUES ( '17/09/2021', 9500, 5)
INSERT [Order]  VALUES ( '19/06/2021', 9000, 6)

GO
INSERT OrderDetail  VALUES (5, 1, 2, 5000)
INSERT OrderDetail  VALUES (4, 2, 1, 4000)
INSERT OrderDetail  VALUES (9, 3, 3, 13000)
INSERT OrderDetail  VALUES (12, 4, 2, 22000)
INSERT OrderDetail  VALUES (3, 5, 1, 4500)
INSERT OrderDetail  VALUES (1, 6, 2, 4700)
