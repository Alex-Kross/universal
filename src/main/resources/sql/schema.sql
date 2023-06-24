-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `universe` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `universe` ;

-- -----------------------------------------------------
-- Table `universe`.`galaxy`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universe`.`galaxy` (
                                                   `id` BIGINT NOT NULL AUTO_INCREMENT,
                                                   `distance_from_earth` DOUBLE NULL DEFAULT NULL,
                                                   `galaxy_type` VARCHAR(255) NULL DEFAULT NULL,
                                                   `major_axis_diameter` DOUBLE NULL DEFAULT NULL,
                                                   `minor_axis_diameter` DOUBLE NULL DEFAULT NULL,
                                                   `name` VARCHAR(255) NULL DEFAULT NULL,
                                                   PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `universe`.`star`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universe`.`star` (
                                                 `id` BIGINT NOT NULL AUTO_INCREMENT,
                                                 `luminosity` DOUBLE NULL DEFAULT NULL,
                                                 `name` VARCHAR(255) NULL DEFAULT NULL,
                                                 `solar_mass` DOUBLE NULL DEFAULT NULL,
                                                 `solar_radius` DOUBLE NULL DEFAULT NULL,
                                                 `temperature` DOUBLE NULL DEFAULT NULL,
                                                 `galaxy_id` BIGINT NULL DEFAULT NULL,
                                                 PRIMARY KEY (`id`),
                                                 INDEX `FKol8sl9hdlkm9u7pv4154dbx1g` (`galaxy_id` ASC) VISIBLE,
                                                 CONSTRAINT `FKol8sl9hdlkm9u7pv4154dbx1g`
                                                     FOREIGN KEY (`galaxy_id`)
                                                         REFERENCES `universe`.`galaxy` (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
