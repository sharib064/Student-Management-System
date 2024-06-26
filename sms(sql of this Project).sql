-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2024 at 06:09 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `course` varchar(20) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`course`, `password`) VALUES
('sda', '1234'),
('os', '1234'),
('prob', '1234'),
('psy', '1234'),
('or', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `gpa`
--

CREATE TABLE `gpa` (
  `rolllno` varchar(8) NOT NULL,
  `sem1` float NOT NULL,
  `sem2` float NOT NULL,
  `sem3` float NOT NULL,
  `sem4` float NOT NULL,
  `sem5` float NOT NULL,
  `sem6` float NOT NULL,
  `sem7` float NOT NULL,
  `sem8` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gpa`
--

INSERT INTO `gpa` (`rolllno`, `sem1`, `sem2`, `sem3`, `sem4`, `sem5`, `sem6`, `sem7`, `sem8`) VALUES
('k213882', 0, 0, 0, 0, 0, 0, 0, 0),
('k213895', 0, 0, 0, 0, 0, 0, 0, 0),
('1234', 0, 0, 0, 0, 0, 0, 0, 0),
('k21', 0, 0, 0, 0, 0, 0, 0, 0),
('k8765', 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `name` varchar(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `nic` bigint(13) NOT NULL,
  `batch` varchar(5) NOT NULL,
  `depart` varchar(20) NOT NULL,
  `rollno` varchar(8) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`name`, `fname`, `nic`, `batch`, `depart`, `rollno`, `password`) VALUES
('Azam ul Haq', 'Abdul haq', 12345, 'SE', '21', 'k213882', '1234'),
('Sarib', 'Shakeel', 123456, 'SE', '21', 'k213895', '1234'),
('abc', 'abc', 1234, '21', 'se', 'abc', '123'),
('abcd', 'abc', 123, 'se', '23', '1234', '1234'),
('abcde', 'abc', 12345676, 'se', '23', 'k21', '1234'),
('xyz', 'xyz', 98765, 'se', '23', 'k8765', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `opr`
--

CREATE TABLE `opr` (
  `rolllno` varchar(8) NOT NULL,
  `mid1` int(2) NOT NULL,
  `mid2` int(2) NOT NULL,
  `assigment` int(2) NOT NULL,
  `project` int(2) NOT NULL,
  `quiz` int(2) NOT NULL,
  `final` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `opr`
--

INSERT INTO `opr` (`rolllno`, `mid1`, `mid2`, `assigment`, `project`, `quiz`, `final`) VALUES
('k213882', 0, 0, 0, 0, 0, 0),
('k213895', 0, 0, 0, 0, 0, 0),
('1234', 0, 0, 0, 0, 0, 0),
('k21', 0, 0, 0, 0, 0, 0),
('k8765', 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `ora`
--

CREATE TABLE `ora` (
  `date` varchar(20) NOT NULL,
  `k213882` varchar(10) DEFAULT NULL,
  `k213895` varchar(10) DEFAULT NULL,
  `k21` varchar(10) DEFAULT NULL,
  `k8765` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `os`
--

CREATE TABLE `os` (
  `rolllno` varchar(8) NOT NULL,
  `mid1` int(2) NOT NULL,
  `mid2` int(2) NOT NULL,
  `assigment` int(2) NOT NULL,
  `project` int(2) NOT NULL,
  `quiz` int(2) NOT NULL,
  `final` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `os`
--

INSERT INTO `os` (`rolllno`, `mid1`, `mid2`, `assigment`, `project`, `quiz`, `final`) VALUES
('k213882', 0, 0, 0, 0, 0, 0),
('k213895', 0, 0, 0, 0, 0, 0),
('1234', 0, 0, 0, 0, 0, 0),
('k21', 0, 0, 0, 0, 0, 0),
('k8765', 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `osa`
--

CREATE TABLE `osa` (
  `date` varchar(20) NOT NULL,
  `k213882` varchar(10) DEFAULT NULL,
  `k213895` varchar(10) DEFAULT NULL,
  `k21` varchar(10) DEFAULT NULL,
  `k8765` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `prob`
--

CREATE TABLE `prob` (
  `rolllno` varchar(8) NOT NULL,
  `mid1` int(2) NOT NULL,
  `mid2` int(2) NOT NULL,
  `assigment` int(2) NOT NULL,
  `project` int(2) NOT NULL,
  `quiz` int(2) NOT NULL,
  `final` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prob`
--

INSERT INTO `prob` (`rolllno`, `mid1`, `mid2`, `assigment`, `project`, `quiz`, `final`) VALUES
('k213882', 0, 0, 0, 0, 0, 0),
('k213895', 0, 0, 0, 0, 0, 0),
('1234', 0, 0, 0, 0, 0, 0),
('k21', 0, 0, 0, 0, 0, 0),
('k8765', 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `proba`
--

CREATE TABLE `proba` (
  `date` varchar(20) NOT NULL,
  `k213882` varchar(10) DEFAULT NULL,
  `k213895` varchar(10) DEFAULT NULL,
  `k21` varchar(10) DEFAULT NULL,
  `k8765` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `psy`
--

CREATE TABLE `psy` (
  `rolllno` varchar(8) NOT NULL,
  `mid1` int(2) NOT NULL,
  `mid2` int(2) NOT NULL,
  `assigment` int(2) NOT NULL,
  `project` int(2) NOT NULL,
  `quiz` int(2) NOT NULL,
  `final` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `psy`
--

INSERT INTO `psy` (`rolllno`, `mid1`, `mid2`, `assigment`, `project`, `quiz`, `final`) VALUES
('k213882', 0, 0, 0, 0, 0, 0),
('k213895', 0, 0, 0, 0, 0, 0),
('1234', 0, 0, 0, 0, 0, 0),
('k21', 0, 0, 0, 0, 0, 0),
('k8765', 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `psya`
--

CREATE TABLE `psya` (
  `date` varchar(20) NOT NULL,
  `k213882` varchar(10) DEFAULT NULL,
  `k213895` varchar(10) DEFAULT NULL,
  `k21` varchar(10) DEFAULT NULL,
  `k8765` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sda`
--

CREATE TABLE `sda` (
  `rolllno` varchar(8) NOT NULL,
  `mid1` int(2) NOT NULL,
  `mid2` int(2) NOT NULL,
  `assigment` int(2) NOT NULL,
  `project` int(2) NOT NULL,
  `quiz` int(2) NOT NULL,
  `final` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sda`
--

INSERT INTO `sda` (`rolllno`, `mid1`, `mid2`, `assigment`, `project`, `quiz`, `final`) VALUES
('k213882', 12, 0, 0, 0, 0, 0),
('k213895', 0, 0, 0, 0, 0, 0),
('1234', 0, 0, 0, 0, 0, 0),
('k21', 0, 0, 0, 0, 0, 0),
('k8765', 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `sdaa`
--

CREATE TABLE `sdaa` (
  `date` varchar(20) NOT NULL,
  `k213882` varchar(10) DEFAULT NULL,
  `k213895` varchar(10) DEFAULT NULL,
  `k21` varchar(10) DEFAULT NULL,
  `k8765` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sdaa`
--

INSERT INTO `sdaa` (`date`, `k213882`, `k213895`, `k21`, `k8765`) VALUES
('11-4-23', NULL, NULL, NULL, NULL),
('11-5-22', NULL, NULL, NULL, NULL),
('11-5-23', 'Present', '', NULL, NULL),
('11-5-23', 'Present', 'Present', NULL, NULL),
('11-5-23', '', 'Present', NULL, NULL),
('11-5-23', '', '', NULL, NULL),
('11-5-23', 'Present', 'Absent', NULL, NULL),
('11-5-23', 'Present', 'Present', NULL, NULL),
('11-5-23', 'Present', 'Present', NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
