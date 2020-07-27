CREATE TABLE IF NOT EXISTS coins (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
	code VARCHAR(255) NOT NULL,
	year VARCHAR(31),
	diameter VARCHAR(31),
	shape VARCHAR(255),
	inscription VARCHAR(255),
	circulation VARCHAR(255),
	metal VARCHAR(255),
	fineness VARCHAR(255),
	weight VARCHAR(255),
	stamp VARCHAR(255),
	border VARCHAR(255),
	comment VARCHAR(255),
	photo VARCHAR(255)
);

-- in the future use also as Spring Security
CREATE TABLE IF NOT EXISTS users (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS collections (
	id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT NOT NULL,
	coin_id INT NOT NULL,
	condition VARCHAR(255),
	price VARCHAR(255),
	comment VARCHAR(255)
);
