CREATE TABLE users(
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `username` varchar(255) NOT NULL,
   `email` varchar(255) NOT NULL,
   `password` varchar(255) NOT NULL,
   `created_at` datetime(3) NOT NULL DEFAULT current_timestamp(3),
   `updated_at` datetime(3) NOT NULL DEFAULT current_timestamp(3),
    PRIMARY KEY (`id`),
    UNIQUE KEY `email` (`email`),
    UNIQUE KEY `username` (`username`)
);