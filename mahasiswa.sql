-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 28, 2025 at 07:45 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` int(11) NOT NULL,
  `nim` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  `waifu` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nim`, `nama`, `jenis_kelamin`, `waifu`, `hobby`) VALUES
(1, '2203999', 'Amelia Zalfa Julianti', 'Perempuan', 'Diluc', 'Writing'),
(2, '2202292', 'Muhammad Iqbal Fadhilah', 'Laki-laki', 'Furiri', 'Gaming'),
(3, '2202346', 'Muhammad Rifky Afandi', 'Laki-laki', 'Nilou', 'Reading'),
(4, '2210239', 'Muhammad Hanif Abdillah', 'Laki-laki', 'Clorinde', 'Cycling'),
(5, '2202046', 'Nurainun', 'Perempuan', 'Al-Haitam', 'Reading'),
(6, '2205101', 'Kelvin Julian Putra', 'Laki-laki', 'Clorinde', 'Gaming'),
(7, '2200163', 'Rifanny Lysara Annastasya', 'Perempuan', 'Childe', 'Reading'),
(8, '2202869', 'Revana Faliha Salma', 'Perempuan', 'Al-Haitam', 'Writing'),
(9, '2209489', 'Rakha Dhifiargo Hariadi', 'Laki-laki', 'Furiri', 'Gaming'),
(10, '2203142', 'Roshan Syalwan Nurilham', 'Laki-laki', 'Nilou', 'Cycling'),
(11, '2200311', 'Raden Rahman Ismail', 'Laki-laki', 'Nilou', 'Cycling'),
(12, '2200978', 'Ratu Syahirah Khairunnisa', 'Perempuan', 'Al-Haitam', 'Reading'),
(13, '2204509', 'Muhammad Fahreza Fauzan', 'Laki-laki', 'Furiri', 'Gaming'),
(14, '2205027', 'Muhammad Rizki Revandi', 'Laki-laki', 'Clorinde', 'Cycling'),
(15, '2203484', 'Arya Aydin Margono', 'Laki-laki', 'Clorinde', 'Gaming'),
(16, '2200481', 'Marvel Ravindra Dioputra', 'Laki-laki', 'Nilou', 'Reading'),
(17, '2209889', 'Muhammad Fadlul Hafiizh', 'Laki-laki', 'Furiri', 'Writing'),
(18, '2206697', 'Rifa Sania', 'Perempuan', 'Al-Haitam', 'Reading'),
(19, '2207260', 'Imam Chalish Rafidhul Haque', 'Laki-laki', 'Furiri', 'Cycling'),
(20, '2204343', 'Meiva Labibah Ransya', 'Perempuan', 'Al-Haitam', 'Gaming');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
