CREATE TABLE imgmp (
    id SERIAL PRIMARY KEY,
    title TEXT,
    is_active BOOLEAN DEFAULT true
);

CREATE TABLE tags_img (
    id SERIAL PRIMARY KEY,
    name TEXT,
    is_active BOOLEAN DEFAULT true
);

CREATE TABLE images_data (
    id SERIAL PRIMARY KEY,
    title TEXT,
    mapping INT REFERENCES imgmp(id),
    cre_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    mod_date TIMESTAMP,
    mod_by INT,
    is_active BOOLEAN DEFAULT true
);

CREATE TABLE images (
    img_id SERIAL PRIMARY KEY,
    record_id INT REFERENCES images_data(id) ON DELETE CASCADE,
    url TEXT NOT NULL,
    title TEXT,
    description TEXT,
    alt TEXT,
    img_order INT,
    tag_id INT REFERENCES tags_img(id),
    is_active BOOLEAN DEFAULT true
);
