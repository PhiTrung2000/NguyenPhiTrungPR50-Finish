CREATE DATABASE NGUYENPHITRUNG;
CREATE TABLE Products (
    proId INT AUTO_INCREMENT PRIMARY KEY,
    proName VARCHAR(255),
    Unitprice INT
);
CREATE TABLE Orders (
    orderId INT AUTO_INCREMENT PRIMARY KEY,
    orderDate DATE,
    customerName VARCHAR(255)
);
CREATE TABLE OrdersDetails (
    orderDetailsId INT AUTO_INCREMENT PRIMARY KEY,
    orderId INT,
    proId INT,
    quantity INT,
    FOREIGN KEY (orderId) REFERENCES Orders(orderId),
    FOREIGN KEY (proId) REFERENCES Products(proId)
);
INSERT INTO Products (proName, Unitprice)
VALUES
    ('Áo thun nam', 250000),
    ('Áo sơ mi nữ', 350000),
    ('Quần jeans nam', 450000),
    ('Áo khoác dù unisex', 600000),
    ('Giày thể thao', 300000);
INSERT INTO Orders (orderDate, customerName)
VALUES
    ('2023-10-01', 'Nguyễn Thị Hằng'),
    ('2023-10-02', 'Trần Văn Minh'),
    ('2023-10-03', 'Lê Đức Trung'),
    ('2023-10-04', 'Phạm Thị Mai'),
    ('2023-10-05', 'Nguyễn Văn Dũng');
INSERT INTO OrdersDetails (orderId, proId, quantity)
VALUES
    (1, 1, 2),
    (1, 2, 3),
    (2, 3, 1),
    (3, 4, 4),
    (4, 5, 2);
