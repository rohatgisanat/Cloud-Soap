-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 16, 2015 at 11:22 AM
-- Server version: 5.6.11
-- PHP Version: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tab`
--
CREATE DATABASE IF NOT EXISTS `tab` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `tab`;

-- --------------------------------------------------------

--
-- Table structure for table `table0`
--

CREATE TABLE IF NOT EXISTS `table0` (
  `Names` varchar(8) NOT NULL,
  `Age` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table0`
--

INSERT INTO `table0` (`Names`, `Age`) VALUES
('ABCD', 12),
('Gewrty', 34);

-- --------------------------------------------------------

--
-- Table structure for table `table1`
--

CREATE TABLE IF NOT EXISTS `table1` (
  `Names` varchar(8) NOT NULL,
  `Age` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table1`
--

INSERT INTO `table1` (`Names`, `Age`) VALUES
('HUIJ', 45),
('Noiui', 32),
('IHJB', 21),
('KGH', 2);

-- --------------------------------------------------------

--
-- Table structure for table `table2`
--

CREATE TABLE IF NOT EXISTS `table2` (
  `Names` varchar(8) NOT NULL,
  `Age` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table2`
--

INSERT INTO `table2` (`Names`, `Age`) VALUES
('Sanat', 23),
('Sameer', 50),
('Rohatgi', 12),
('Piki', 48),
('Sanat', 23);

-- --------------------------------------------------------

--
-- Table structure for table `table3`
--

CREATE TABLE IF NOT EXISTS `table3` (
  `Names` varchar(8) NOT NULL,
  `Age` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table3`
--

INSERT INTO `table3` (`Names`, `Age`) VALUES
('Vaishali', 45),
('Zerghn', 98);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
