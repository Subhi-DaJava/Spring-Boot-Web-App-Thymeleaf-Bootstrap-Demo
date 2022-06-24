DROP DATABASE  IF EXISTS `employee_directory`;

CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Dumping data for table `users`
--
-- NOTE: The passwords are encrypted using BCrypt
--
-- A generation tool is avail at:
--
-- Default passwords here are: 12345
--

INSERT INTO `users`(username, password, enabled)
VALUES
    ('user1','$2a$12$NeVNMbFUhrSFruZybveszOwoNZF2gx255Y/IeXHPylqDrYgDOKF/6',true),
    ('user2','$2a$12$NeVNMbFUhrSFruZybveszOwoNZF2gx255Y/IeXHPylqDrYgDOKF/6',true),
    ('admin','$2a$12$NeVNMbFUhrSFruZybveszOwoNZF2gx255Y/IeXHPylqDrYgDOKF/6',true),
    ('manager','$2a$12$NeVNMbFUhrSFruZybveszOwoNZF2gx255Y/IeXHPylqDrYgDOKF/6',true);

--
-- Table structure for table `authorities`
--

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities`(user_id, role_id)
VALUES
    (1,1),
    (2,1),
    (4,2),
    (3,3);

INSERT INTO `roles`(name)
VALUES
    ('ROLE_EMPLOYEE'),
    ('ROLE_MANAGER'),
    ('ROLE_ADMIN');

