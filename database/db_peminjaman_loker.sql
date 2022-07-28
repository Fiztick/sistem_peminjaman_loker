-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.4.17-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for peminjaman_loker
DROP DATABASE IF EXISTS `peminjaman_loker`;
CREATE DATABASE IF NOT EXISTS `peminjaman_loker` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `peminjaman_loker`;

-- Dumping structure for table peminjaman_loker.loker
DROP TABLE IF EXISTS `loker`;
CREATE TABLE IF NOT EXISTS `loker` (
  `id_loker` tinyint(1) NOT NULL,
  `status_loker` tinyint(1) unsigned NOT NULL DEFAULT 1,
  PRIMARY KEY (`id_loker`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table peminjaman_loker.loker: ~8 rows (approximately)
/*!40000 ALTER TABLE `loker` DISABLE KEYS */;
INSERT INTO `loker` (`id_loker`, `status_loker`) VALUES
	(1, 1),
	(2, 1),
	(3, 1),
	(4, 1),
	(5, 1),
	(6, 1),
	(7, 1),
	(8, 1);
/*!40000 ALTER TABLE `loker` ENABLE KEYS */;

-- Dumping structure for table peminjaman_loker.peminjaman
DROP TABLE IF EXISTS `peminjaman`;
CREATE TABLE IF NOT EXISTS `peminjaman` (
  `id_loker` tinyint(1) NOT NULL,
  `nama_peminjam` varchar(50) NOT NULL DEFAULT '',
  `nomor_telepon_peminjam` varchar(12) DEFAULT NULL,
  `tanggal_dipinjam` date NOT NULL DEFAULT curdate(),
  `tanggal_kembali` date DEFAULT NULL,
  `status_peminjaman` tinyint(1) NOT NULL DEFAULT 1,
  KEY `FK_id_loker` (`id_loker`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table peminjaman_loker.peminjaman: ~8 rows (approximately)
/*!40000 ALTER TABLE `peminjaman` DISABLE KEYS */;
INSERT INTO `peminjaman` (`id_loker`, `nama_peminjam`, `nomor_telepon_peminjam`, `tanggal_dipinjam`, `tanggal_kembali`, `status_peminjaman`) VALUES
	(1, '123', 'asdf', '2022-07-28', NULL, 0),
	(2, '123', 'asdf', '2022-07-28', NULL, 0),
	(3, '123', 'asdf', '2022-07-28', NULL, 0),
	(7, '123', 'asdf', '2022-07-28', NULL, 0),
	(6, '123', 'asdf', '2022-07-28', NULL, 0),
	(1, '123', 'fdas', '2022-07-28', NULL, 0),
	(2, '123', 'fdas', '2022-07-28', NULL, 0),
	(6, '123', 'fdas', '2022-07-28', NULL, 0);
/*!40000 ALTER TABLE `peminjaman` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
