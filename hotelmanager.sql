-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2022 at 08:58 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelmanager`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `name` varchar(25) NOT NULL,
  `room_ID` int(3) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `nationalID` varchar(14) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `city` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`name`, `room_ID`, `nationality`, `nationalID`, `address`, `phone`, `city`, `email`) VALUES
('mhmd', 0, 'egy', '111111111111', 'warraq', '01151317960', 'giza', 'kdbflkjds@gmail.com'),
('mohamed', 0, 'egyption', '111111111112', 'warraq', '01111111111', 'giza', 'dhsbfhbdfs@gmail.com'),
('omar', 0, 'egy', '123412341234', 'fwesfgsg', '0123456789', 'cairo', 'dsgrgdslkf@gmail.com'),
('Omar', 0, 'asd', 'asd', 'asd', 'asd', 'asd', 'asd'),
('Omar', 0, 'asd', 'asd', 'asd', 'asd', 'asd', 'asd'),
('Omar', 0, 'asd', 'asd', 'asd', 'asd', 'asd', 'asd'),
('', 0, '', '', '', '', '', ''),
('', 0, '', '', '', '', '', ''),
('taha', 0, 'talbawy', '123', '123', '123', 'altalbia', '123'),
('ahmed', 0, 'egy', '1111', 'waraq', '1234', 'giza', 'dasd'),
('ahmed', 0, 'egy', '1111', 'waraq', '1234', 'giza', 'dasd'),
('ahmed', 0, 'egy', '1111', 'waraq', '1234', 'giza', 'dasd'),
('omar', 0, 'egy', '123', '12', '231', 'cai', 'dg'),
('omar', 0, 'egy', '123', '12', '231', 'cai', 'dg'),
('omar', 0, 'egy', '123', '12', '231', 'cai', 'dg'),
('omar', 0, 'egy', '123', '12', '231', 'cai', 'dg'),
('omar', 0, 'egy', '123', '12', '231', 'cai', 'dg'),
('omar', 0, 'egy', '123', '12', '231', 'cai', 'dg'),
('omar', 0, 'egy', '123', '12', '231', 'cai', 'dg'),
('oams', 0, 'asd', '123', '123', '123', '123', '123'),
('oams', 0, 'asd', '123', '123', '123', '123', '123'),
('oams', 0, 'asd', '123', '123', '123', '123', '123'),
('oams', 0, 'asd', '123', '123', '123', '123', '123'),
('oams', 0, 'asd', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123123', '1123', '123', '123', '123'),
('123', 0, '123', '123', '123', '13', '13', '13'),
('123', 0, '123', '123', '123', '13', '13', '13'),
('123', 0, '123', '123', '123', '13', '13', '13'),
('123', 0, '123', '123', '123', '13', '13', '13'),
('123', 0, '123', '123', '123', '13', '13', '13'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('23', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '12312312', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('1123123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('12', 0, '2', '2', '2', '2', '2', '2'),
('12', 0, '2', '2', '2', '2', '2', '2'),
('12', 0, '2', '2', '2', '2', '2', '2'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('123', 0, '123', '123', '123', '123', '123', '123'),
('zeko', 0, '123', '123', '123', '123', '123', '123'),
('zeko', 0, '123', '123', '123123', '123', '123', '123'),
('rr', 0, '12', '123', '123', '123', '123', '123'),
('rr', 0, '12', '123', '123', '123', '123', '123'),
('rr', 0, '12', '123', '123', '123', '123', '123'),
('12', 31, '23', '23', '23', '32', '23', '23'),
('zakaria', 31, '123', '123', '123', '12', '213', '123'),
('123', 11, '123', '123', '123', '123', '123', '123'),
('alhon', 22, '213', '123', '123', '123', '123', '123'),
('alhooon', 22, '12312', '312', '3123', '123', '123', '123'),
('llll', 22, '123', '123', '123123', '123', '123', '123'),
('zekooo', 11, '123', '123', '123', '123', '123', '123'),
('123', 22, '123', '123', '123', '123', '123', '123123'),
('omarrrr', 11, '123', '123', '213', '123', '123', '213'),
('123', 11, '123', '123', '123', '123', '123', '123'),
('123', 11, '123', '123', '123', '123', '123', '123'),
('123', 22, '123', '123', '123', '123', '123', '2123'),
('123', 11, '123', '123', '123', '213', '123', '123'),
('123', 11, '123', '123', '123', '213', '123', '123'),
('ZEKO', 11, 'egyptian', '123', '123', '123', 'cairo', '123'),
('taha', 12, 'talbawy', '123', '123', '12311', 'cairo', '123');

-- --------------------------------------------------------

--
-- Table structure for table `food`
--

CREATE TABLE `food` (
  `ID` int(11) NOT NULL,
  `RoomID` varchar(3) NOT NULL,
  `breakfast` tinyint(1) NOT NULL,
  `lunch` tinyint(1) NOT NULL,
  `dinner` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `food`
--

INSERT INTO `food` (`ID`, `RoomID`, `breakfast`, `lunch`, `dinner`) VALUES
(1, '5', 1, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `roomID` int(3) NOT NULL,
  `roomType` varchar(10) NOT NULL,
  `isBooked` varchar(45) NOT NULL DEFAULT 'false',
  `num_of_Days` int(3) NOT NULL,
  `owner` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`roomID`, `roomType`, `isBooked`, `num_of_Days`, `owner`) VALUES
(1, 'VIP', 'false', 0, 'false'),
(2, 'VIP', 'false', 0, 'false'),
(3, 'VIP', 'false', 0, ' false'),
(4, 'VIP', 'false', 0, ' false'),
(5, 'VIP', 'false', 0, 'false'),
(6, 'VIP', 'false', 0, 'false'),
(7, 'VIP', 'false', 0, 'false'),
(8, 'VIP', 'false', 0, 'false'),
(9, 'VIP', 'false', 0, 'false'),
(10, 'VIP', 'false', 0, 'false'),
(11, 'Normal', 'true', 5, 'ZEKO'),
(12, 'Normal', 'true', 4, 'taha'),
(13, 'Normal', 'false', 0, 'false'),
(14, 'Normal', 'false', 0, 'false'),
(15, 'Normal', 'false', 0, 'false'),
(16, 'Normal', 'false', 0, 'false'),
(17, 'Normal', 'false', 0, 'false'),
(18, 'Normal', 'false', 0, 'false'),
(19, 'Normal', 'false', 0, 'false'),
(20, 'Normal', 'false', 0, 'false'),
(21, 'Economy', 'false', 0, 'false'),
(22, 'Economy', 'false', 0, 'false'),
(23, 'Economy', 'false', 0, 'false'),
(24, 'Economy', 'false', 0, 'false'),
(25, 'Economy', 'false', 0, 'false'),
(26, 'Economy', '0', 0, ''),
(27, 'Economy', '0', 0, ''),
(28, 'Economy', '0', 0, ''),
(29, 'Economy', '0', 0, ''),
(30, 'Economy', '0', 0, ''),
(31, 'Normal', 'false', 0, '');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `username` varchar(35) NOT NULL,
  `password` varchar(35) NOT NULL,
  `privilege` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `username`, `password`, `privilege`) VALUES
(1, 'Omar', 'root', 'admin'),
(2, 'taha', 'tahtoha', 'user'),
(3, 'Abdelgawad', 'abogoda', 'user'),
(4, 'akwah', 'akwoha', 'user'),
(5, 'mohammed', 'me7o', 'user'),
(6, 'Kamel', 'kamola', 'user'),
(7, 'abofahd', 'ghadod', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`roomID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `UNIQUE` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `roomID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;