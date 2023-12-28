/*CREATE DATABASE IF NOT EXISTS areeba;
USE areeba;

-- Create a user and grant privileges (replace 'your_user' and 'your_password' with your preferred values)
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON areeba.* TO 'admin'@'localhost';
FLUSH PRIVILEGES;*/
*/
-- Create the customer table
CREATE TABLE customer (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          last_name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL,
                          phone_number VARCHAR(20),
                          operator VARCHAR(250) NOT NULL,
                          country_code VARCHAR(5)
);
