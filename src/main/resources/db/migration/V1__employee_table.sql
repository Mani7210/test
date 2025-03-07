-- Create authentication table
CREATE TABLE authentication (
    id VARCHAR(36) NOT NULL,
    created_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) DEFAULT 'ACTIVE',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Insert into authentication table
INSERT INTO authentication (id, email, password)
VALUES 
('1', 'admin@gmail.com', '00ffc84ac19d18984c0c4a8c94aa753f');	

-- Create employee table
CREATE TABLE employee (
    id VARCHAR(36) NOT NULL,
    created_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    name VARCHAR(36) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
