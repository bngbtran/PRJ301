CREATE DATABASE ProgressTest1_DB

USE ProgressTest1_DB
GO

ALTER LOGIN sa WITH PASSWORD = '123456789', CHECK_POLICY = OFF;

CREATE TABLE TinTuc 
	(
		id INT IDENTITY(1, 1) PRIMARY KEY,
		tieuDe NVARCHAR(500),
		noiDung NVARCHAR(500),
		tacGia NVARCHAR(50),
		luotXem INT,
		ngayTao DATE DEFAULT GETDATE(),
		xem NVARCHAR(50) DEFAULT N'Xem chi tiết'
	)
GO

INSERT INTO dbo.TinTuc
	(
		tieuDe,
		noiDung,
		tacGia,
		luotXem,
		ngayTao,
		xem
	)
VALUES
	(   
		N'Sống chung với ô nhiễm ở bãi rác lớn nhất TP HCM',   
		N'Ô nhiễm không khí từ bãi rác gần 700 ha ở Củ Chi phát tán ra bán kính 10km ...',    
		N'Minh Anh',    
		129,    
		DEFAULT, 
		DEFAULT  
    ),
	(   
		N'Cao tốc Dầu Giây - Phan Thiết ngập sâu, ùn tắc kéo dài',    
		N'Nước dâng cao sau mưa trên cao tốc Dầu Giây ...',   
		N'Phạm Thảo',   
		18,    
		DEFAULT, 
		DEFAULT  
    ),
	(
		N'Nhiều tỉnh thiệt hại nặng do hạn hán',   
		N'Mưa ít, nắng nóng kéo dài khiến Lào Cai thiệt hại hơn 750 tỷ đồng ...',    
		N'Thu Minh',   
		872,   
		GETDATE() + 1,
		DEFAULT 
    )

SELECT * FROM dbo.TinTuc








