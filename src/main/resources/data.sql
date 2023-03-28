-- Create the roles table if it doesn't exist
CREATE TABLE IF NOT EXISTS roles (
                                     id   BIGINT PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL
);

-- Insert the admin role if it doesn't exist
INSERT INTO roles (id, name) VALUES (1, 'admin')
ON CONFLICT (id) DO NOTHING;

-- Insert the breeder role if it doesn't exist
INSERT INTO roles (id, name) VALUES (2, 'breeder')
ON CONFLICT (id) DO NOTHING;


-- Create the users table if it doesn't exist
CREATE TABLE IF NOT EXISTS users (
                                     id BIGSERIAL PRIMARY KEY,
                                     first_name VARCHAR(255) NOT NULL,
                                     last_name VARCHAR(255) NOT NULL,
                                     email VARCHAR(255) NOT NULL,
                                     phone_number BIGINT NOT NULL,
                                     registration_tica_id VARCHAR(255) NOT NULL,
                                     password VARCHAR(255) NOT NULL,
                                     created_at TIMESTAMP NOT NULL DEFAULT now(),
                                     deleted_at TIMESTAMP,
                                     approved BOOLEAN NOT NULL DEFAULT false
);

-- Insert sample data
INSERT INTO users (id, first_name, last_name, email, phone_number, registration_tica_id, password, created_at, deleted_at, approved)
VALUES
    (1, 'Alena', 'Elhajassaad', 'luxurykittensusa@yahoo.com', 9172881654, '1480352', 'abc', now(), NULL, true),
    (2, 'Jane', 'Doe', 'janedoe@example.com', 0987654321, '12345', 'abc1', now(), NULL, true)
ON CONFLICT (id) DO NOTHING;

-- Insert sample user roles
INSERT INTO user_roles (user_id, role_id) VALUES
                                              (1, 1),
                                              (1, 2),
                                              (2, 2);

INSERT INTO address (state, city, street, zip_code, user_id)
VALUES ('South Carolina', 'Greer', '124 Hartwood lake lane', 29650, 1);

INSERT INTO address (state, city, street, zip_code, user_id)
VALUES ('Texas', 'Austin', '456 Elm St', 78702, 2);

CREATE TABLE IF NOT EXISTS kitten_post_images (
                                                  id SERIAL PRIMARY KEY,
                                                  kitten_post_id INTEGER REFERENCES kitten_post(id),
                                                  images VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS kitten_post (
                                           id SERIAL PRIMARY KEY,
                                           breed VARCHAR(255) NOT NULL,
                                           dob DATE NOT NULL,
                                           color VARCHAR(255) NOT NULL,
                                           gender VARCHAR(255) NOT NULL,
                                           status VARCHAR(255) NOT NULL,
                                           description TEXT NOT NULL,
                                           price INTEGER NOT NULL,
                                           states VARCHAR(255) NOT NULL,
                                           created_at TIMESTAMP NOT NULL,
                                           deleted_at TIMESTAMP,
                                           user_id INTEGER NOT NULL,
                                           flagged BOOLEAN NOT NULL,
                                           approved BOOLEAN NOT NULL,
                                           video_url VARCHAR(255),
                                           CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id)
);

INSERT INTO kitten_post (breed, dob, color, gender, status, description, price, states, created_at, deleted_at, user_id, flagged, approved, video_url)
VALUES
    ('PERSIAN', '2022-01-01', 'WHITE', 'MALE', 'AVAILABLE', 'Cute kitten for sale', 500, 'NEW YORK', NOW(), NULL, 1, false, true, 'https://example.com/video1.mp4'),
    ('SIAMESE', '2022-02-01', 'GRAY', 'FEMALE', 'SOLD', 'Lovely kitten sold', 700, 'NEW JERSEY', NOW(), NULL, 1, false, true, 'https://example.com/video2.mp4'),
    ('BENGAL', '2022-03-01', 'BROWN', 'MALE', 'AVAILABLE', 'Adorable kitten for sale', 600, 'NEW YORK', NOW(), NULL, 1, false, true, 'https://example.com/video3.mp4'),
    ('PERSIAN', '2022-04-01', 'BLACK', 'FEMALE', 'AVAILABLE', 'Beautiful kitten for sale', 550, 'NEW YORK', NOW(), NULL, 2, false, true, 'https://example.com/video4.mp4'),
    ('SIAMESE', '2022-05-01', 'WHITE', 'MALE', 'AVAILABLE', 'Cute kitten for sale', 500, 'NEW JERSEY', NOW(), NULL, 2, false, true, 'https://example.com/video5.mp4'),
    ('BENGAL', '2022-06-01', 'BROWN', 'FEMALE', 'SOLD', 'Lovely kitten sold', 700, 'NEW YORK', NOW(), NULL, 2, false, true, 'https://example.com/video6.mp4');

INSERT INTO kitten_post_images (kitten_post_id, images)
VALUES
    (1, 'https://example.com/kitten1.jpg'),
    (1, 'https://example.com/kitten2.jpg'),
    (2, 'https://example.com/kitten3.jpg'),
    (2, 'https://example.com/kitten4.jpg'),
    (3, 'https://example.com/kitten5.jpg'),
    (3, 'https://example.com/kitten6.jpg');