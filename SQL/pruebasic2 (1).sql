-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-01-2022 a las 06:15:06
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebasic2`
--
CREATE DATABASE IF NOT EXISTS `pruebasic2` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `pruebasic2`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE `empleado` (
  `numempleado` int(10) NOT NULL,
  `dependencia` varchar(10) NOT NULL,
  `fecha` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- RELACIONES PARA LA TABLA `empleado`:
--

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`numempleado`, `dependencia`, `fecha`) VALUES
(999, 'CHIA', '22/01/2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE `persona` (
  `numdocpersona` int(10) NOT NULL,
  `tipodoc` varchar(10) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- RELACIONES PARA LA TABLA `persona`:
--

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`numdocpersona`, `tipodoc`, `nombre`, `apellido`, `telefono`, `direccion`, `email`) VALUES
(222, 'cc', 'DAVID', 'ALVAREZ', '300101111', 'CLA 78# 879 ', 'KAHSFJ@SDF.COM'),
(1111, 'cc', 'DAVID', 'ALVAREZ', '300101111', 'CLA 78# 879 ', 'KAHSFJ@SDF.COM');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tramite`
--

DROP TABLE IF EXISTS `tramite`;
CREATE TABLE `tramite` (
  `numtramite` int(10) NOT NULL,
  `ano` int(4) NOT NULL,
  `nombretramite` varchar(60) NOT NULL,
  `descripcion` varchar(600) NOT NULL,
  `numempleado` int(10) NOT NULL,
  `numdocpersona` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- RELACIONES PARA LA TABLA `tramite`:
--   `numdocpersona`
--       `persona` -> `numdocpersona`
--   `numempleado`
--       `empleado` -> `numempleado`
--

--
-- Volcado de datos para la tabla `tramite`
--

INSERT INTO `tramite` (`numtramite`, `ano`, `nombretramite`, `descripcion`, `numempleado`, `numdocpersona`) VALUES
(5, 2022, 'TRANSPASO', 'TRANSPASO DE PROPUEDAD', 999, 1111),
(6, 2021, 'VENTAS', 'VEDNTA ', 999, 1111);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`numempleado`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`numdocpersona`);

--
-- Indices de la tabla `tramite`
--
ALTER TABLE `tramite`
  ADD PRIMARY KEY (`numtramite`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
