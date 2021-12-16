-- hrd
CREATE TABLE hrd (
		idhrd serial PRIMARY KEY,
		nama varchar(50) NOT NULL,
		jeniskelamin varchar(15) NOT NULL,
		nohandphone varchar(15) NOT NULL,
		asalkota varchar(15) NOT NULL);

INSERT INTO hrd (nama, jeniskelamin, nohandphone, asalkota)
VALUES ('Sugeng', 'Pria', '081778455662', 'Surabaya');

SELECT * FROM hrd order by idhrd;

UPDATE hrd set nohandphone = '085336778990' WHERE idhrd = 1;

DELETE FROM hrd WHERE idhrd = 1;


-- karyawan
CREATE TABLE karyawan (
		idkaryawan serial PRIMARY KEY,
		idhrd int NOT NULL,
		idjabatan int NOT NULL,
		nama varchar(50) NOT NULL,
		jeniskelamin varchar(15) NOT NULL,
		asalkota varchar(15) NOT NULL,
		nohandphone varchar(15) NOT NULL,
		periode varchar(15) NOT NULL);
		
INSERT INTO karyawan (idhrd, idjabatan, nama, jeniskelamin, asalkota, nohandphone, periode)
VALUES (1, 1, 'Budianto', 'Pria', 'Banyuwangi', '088290445477', '2021'),
(1, 2, 'Teguh', 'Pria', 'Jember', '081233445667', '2021'),
(1, 3, 'Hermanto', 'Pria', 'Banyuwangi', '085236283230', '2021'),
(1, 3, 'Tantri', 'Wanita', 'Jember', '081223670900', '2021'),
(1, 3, 'Ayulista', 'Wanita', 'Banyuwangi', '085334212976', '2021');

SELECT * FROM karyawan order by idkaryawan;

UPDATE karyawan SET nohandphone = '081234567890' WHERE idkaryawan = 1;

DELETE FROM karyawan WHERE idkaryawan = 3;

-- jabatan
CREATE TABLE jabatan (
		idjabatan serial PRIMARY KEY,
		divisi varchar(15) NOT NULL,
		jabatan varchar(15) NOT NULL);

INSERT INTO jabatan (divisi, jabatan)
VALUES ('Keuangan', 'Accounting'),
('Marketing', 'Branding'),
('Produksi', 'CEO Produksi'),
('Marketing', 'CS'),
('Marketing', 'Sales');

SELECT * FROM jabatan;


-- absensi
CREATE TABLE absensi (
		idabsensi serial PRIMARY KEY,
		idkaryawan int NOT NULL,
		sakit int NOT NULL,
		masuk int NOT NULL,
		izin int NOT NULL,
		cuti int NOT NULL,
		jamlembur int NOT NULL);
		
INSERT INTO absensi (idkaryawan, sakit, masuk, izin, cuti, jamlembur)
VALUES (1, 2, 28, 0, 0, 2), (2, 1, 26, 2, 1, 1), (3, 0, 30, 0, 0, 2),
(4, 0, 30, 0, 0, 2), (5, 1, 29, 0, 0, 1);
		
SELECT * FROM absensi;


-- gaji
CREATE TABLE gaji (
		idgaji serial PRIMARY KEY,
		idkaryawan int NOT NULL,
		golongan int NOT NULL,
		gajipokok int NOT NULL,
		tunjangan int NOT NULL,
		cicilanpinjaman int NOT NULL);
		
INSERT INTO gaji (idkaryawan, golongan, gajipokok, tunjangan, cicilanpinjaman)
VALUES (1, 4, 3000000, 400000, 0), (2, 3, 2500000, 350000, 200000),
(3, 2, 2100000, 300000, 0), (4, 2, 2100000, 300000, 0),
(5, 2, 2100000, 300000, 150000);
		
SELECT * FROM gaji;



