-- V1__create_tables.sql

CREATE TABLE Personal_trainers (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    created_at TIMESTAMP,
    age INT,
    note TEXT
);

CREATE TABLE Students (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    created_at TIMESTAMP,
    age INT
);

CREATE TABLE Training_plans (
    id BIGSERIAL PRIMARY KEY,
    personal_trainer_id BIGINT,
    goals TEXT,
    times_completed INT,
    max_time_completed INT,
    note TEXT,
    CONSTRAINT fk_personal_trainer
        FOREIGN KEY (personal_trainer_id)
        REFERENCES Personal_trainers(id)
);

CREATE TABLE Training_plan_students (
    training_plan_id BIGINT,
    student_id BIGINT,
    PRIMARY KEY (training_plan_id, student_id),
    CONSTRAINT fk_training_plan
        FOREIGN KEY (training_plan_id)
        REFERENCES Training_plans(id),
    CONSTRAINT fk_student
        FOREIGN KEY (student_id)
        REFERENCES Students(id)
);

CREATE TABLE Exercises (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    sets INT,
    reps INT,
    weight VARCHAR(50),
    rest VARCHAR(50),
    note TEXT
);

CREATE TABLE Exercise_training_plans (
    exercise_id BIGINT,
    training_plan_id BIGINT,
    PRIMARY KEY (exercise_id, training_plan_id),
    CONSTRAINT fk_exercise
        FOREIGN KEY (exercise_id)
        REFERENCES Exercises(id),
    CONSTRAINT fk_training_plan_exercise
        FOREIGN KEY (training_plan_id)
        REFERENCES Training_plans(id)
);

CREATE TABLE Student_personal_trainers (
    student_id BIGINT,
    personal_trainer_id BIGINT,
    PRIMARY KEY (student_id, personal_trainer_id),
    CONSTRAINT fk_student_pt
        FOREIGN KEY (student_id)
        REFERENCES Students(id),
    CONSTRAINT fk_personal_trainer_student
        FOREIGN KEY (personal_trainer_id)
        REFERENCES Personal_trainers(id)
);