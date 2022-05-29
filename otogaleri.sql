-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 29 May 2022, 17:48:24
-- Sunucu sürümü: 8.0.29
-- PHP Sürümü: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `otogaleri`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `arac`
--

CREATE TABLE `arac` (
  `aId` int NOT NULL,
  `marka` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL,
  `model` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL,
  `durum` int NOT NULL,
  `yil` int NOT NULL,
  `yakit` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL,
  `vites` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL,
  `km` int NOT NULL,
  `kasaTipi` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL,
  `fiyat` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `arac`
--

INSERT INTO `arac` (`aId`, `marka`, `model`, `durum`, `yil`, `yakit`, `vites`, `km`, `kasaTipi`, `fiyat`) VALUES
(11, 'Renault', '1.5 dCi Touch', 2, 2015, 'Dizel', 'Manuel', 118, 'Sedan', 295),
(12, 'Renault', '1.5 dCi Authentique', 2, 2011, 'Dizel', 'Manuel', 232, 'Hatchback 5 Kapı', 149),
(13, 'Mercedes-Benz', 'c 200 AMG', 0, 2018, 'Benzin', 'Otomatik', 0, 'Coupe', 1000),
(14, 'Renault ', '1.5 dCi Privilege', 2, 2008, 'Dizel', 'Manuel', 350, 'Sedan', 172),
(15, 'BMW', '320i ED 40Th Year Edition', 2, 2015, 'Benzin', 'Yarı Otomatik', 119, 'Sedan', 831),
(16, 'Seat', '1.2 TSI Style ', 2, 2016, 'Benzin', 'Manuel', 60, 'Hatchback 5 Kapı', 406),
(17, 'Volkswagen ', '1.6 TDI BlueMotion Comfortline', 2, 2017, 'Dizel', 'Yarı Otomatik', 135, 'Sedan', 570),
(18, 'Ford ', '1.6 TDCi Titanium ', 2, 2012, 'Dizel', 'Manuel', 260, 'Hatchback 5 Kapı', 228),
(19, 'Volkswagen', '1.6 TDI BlueMotion Impression ', 2, 2017, 'Dizel', 'Yarı Otomatik ', 139, 'Sedan', 550),
(20, 'Opel', '1.3 CDTI Essentia', 2, 2011, 'Dizel', 'Manuel', 110, 'Hatchback 5 Kapı', 225),
(21, 'BMW', '320i ED 40th Year Edition', 2, 2016, 'Benzin', 'Yarı Otomatik', 79, 'Sedan', 920),
(22, 'Fiat ', '1.3 Multijet Urban ', 2, 2015, 'Dizel', 'Manuel', 125, 'Sedan', 228);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici`
--

CREATE TABLE `kullanici` (
  `kId` int NOT NULL,
  `kullanici_adi` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `sifre` varchar(50) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `kullanici`
--

INSERT INTO `kullanici` (`kId`, `kullanici_adi`, `sifre`) VALUES
(1, 'nurgul', '1234');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `pId` int NOT NULL,
  `kullanici_adi` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL,
  `sifre` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL,
  `yetki` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`pId`, `kullanici_adi`, `sifre`, `yetki`) VALUES
(1, 'ahmet', 'aras', 'Satış Temsilcisi');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `arac`
--
ALTER TABLE `arac`
  ADD PRIMARY KEY (`aId`);

--
-- Tablo için indeksler `kullanici`
--
ALTER TABLE `kullanici`
  ADD PRIMARY KEY (`kId`);

--
-- Tablo için indeksler `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`pId`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `arac`
--
ALTER TABLE `arac`
  MODIFY `aId` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici`
--
ALTER TABLE `kullanici`
  MODIFY `kId` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `personel`
--
ALTER TABLE `personel`
  MODIFY `pId` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
