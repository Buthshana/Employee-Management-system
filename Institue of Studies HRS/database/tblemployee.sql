-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2023 at 08:57 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hr management sis`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblemployee`
--

CREATE TABLE `tblemployee` (
  `EPF_no` varchar(15) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Age` int(5) NOT NULL,
  `Designation` varchar(20) NOT NULL,
  `Department` varchar(50) NOT NULL,
  `Salary` int(50) NOT NULL,
  `Contact` int(15) NOT NULL,
  `qualification` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblemployee`
--

INSERT INTO `tblemployee` (`EPF_no`, `Name`, `Age`, `Designation`, `Department`, `Salary`, `Contact`, `qualification`) VALUES
('003', 'Dananjaya', 30, 'Regional Manager', '', 500000, 112729729, ''),
('004', 'Wanindu', 28, 'HR Manager', '', 150000, 117777888, ''),
('005', 'Natasha', 22, 'HR Assistance', '', 100000, 119119155, ''),
('007', 'Keelz', 11, 'Teacher', '', 75000, 12345678, ''),
('014', 'Buthshana', 23, 'Cws', '', 230000, 911564785, ''),
('016', 'Imeth', 19, 'Homew', '', 750000, 11811911, 'SLIT'),
('019', 'shanuka', 30, 'Security', '', 50000, 719760869, 'Al passed'),
('020', 'Siri', 11, 'king', 'Service', 500000, 112833244, 'cdwdw'),
('021', 'manoj', 11, 'king', 'Service', 500000, 112833244, 'cdwdw'),
('030', '', 23, 'president', 'Ministry', 250000, 754789555, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblemployee`
--
ALTER TABLE `tblemployee`
  ADD PRIMARY KEY (`EPF_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
