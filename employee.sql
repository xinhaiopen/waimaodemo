-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.35-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.3.0.5043
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 demo 的数据库结构
CREATE DATABASE IF NOT EXISTS `demo` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `demo`;

-- 导出  表 demo.employee 结构
CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `sex` enum('male','female') NOT NULL DEFAULT 'female',
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `interest` varchar(255) DEFAULT NULL,
  `salary` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- 正在导出表  demo.employee 的数据：~8 rows (大约)
DELETE FROM `employee`;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`, `name`, `code`, `sex`, `age`, `birthday`, `nationality`, `interest`, `salary`) VALUES
	(1, 'kong', 'sda', 'female', 12, '2016-03-12', 'dada', 'dada', 12323.23);

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
