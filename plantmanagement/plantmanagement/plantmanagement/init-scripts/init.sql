SET NAMES 'utf8mb4';
SET CHARACTER SET utf8mb4;

USE plantdb;

CREATE TABLE plantdb.plants (
                                         id INT NOT NULL AUTO_INCREMENT,
                                         polish_name VARCHAR(100) NULL,
                                         latin_name VARCHAR(100) NULL,
                                         watering INT NULL,
                                         blooming VARCHAR(10) NULL,
                                         PRIMARY KEY (id));


INSERT INTO plantdb.plants (polish_name, latin_name, watering, blooming)
VALUES
    ('Róża', 'Rosa', 2, 'Yes'),
    ('Tulipan', 'Tulipa', 1, 'Yes'),
    ('Fiołek', 'Viola', 3, 'Yes'),
    ('Stokrotka', 'Bellis perennis', 2, 'Yes'),
    ('Hiacynt', 'Hyacinthus', 1, 'Yes'),
    ('Lilia', 'Lilium', 2, 'Yes'),
    ('Storczyk', 'Orchidaceae', 1, 'Yes'),
    ('Aloes', 'Aloe vera', 0, 'No'),
    ('Fikus', 'Ficus elastica', 1, 'No'),
    ('Juka', 'Yucca elephantipes', 0, 'No'),
    ('Bamboo', 'Bambusoideae', 0, 'No'),
    ('Lawenda', 'Lavandula', 1, 'Yes'),
    ('Kaktus', 'Cactaceae', 0, 'Yes'),
    ('Bluszcz', 'Hedera', 1, 'No'),
    ('Ostrokrzew', 'Ilex', 2, 'No'),
    ('Chryzantema', 'Chrysanthemum', 1, 'Yes'),
    ('Dracena', 'Dracaena', 0, 'No'),
    ('Fiołek afrykański', 'Saintpaulia', 2, 'Yes'),
    ('Stefanotis', 'Stephanotis floribunda', 1, 'Yes'),
    ('Paproć', 'Polypodiopsida', 2, 'No'),
    ('Pepinia', 'Peperomia', 1, 'No'),
    ('Kwiat doniczkowy', 'Spathiphyllum', 1, 'Yes'),
    ('Sukulent', 'Succulent', 0, 'No'),
    ('Bonsai', 'Bonsai', 0, 'No'),
    ('Orzech włoski', 'Juglans regia', 1, 'No'),
    ('Jagoda', 'Vaccinium corymbosum', 2, 'Yes'),
    ('Mirt', 'Myrtus', 1, 'Yes'),
    ('Ruta', 'Ruta', 1, 'Yes'),
    ('Ślaz', 'Althaea officinalis', 2, 'Yes'),
    ('Truskawka', 'Fragaria', 2, 'Yes');
