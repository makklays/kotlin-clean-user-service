-- Create schema if it doesn't exist (optional, depending on your database setup)
-- CREATE SCHEMA IF NOT EXISTS public;

-- V1__create_users_table.sql
-- Migration #1: create table users

-- Creating table 'users' for storing main user data
CREATE TABLE IF NOT EXISTS users (
    id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    username     VARCHAR(50) NOT NULL UNIQUE,
    email        VARCHAR(100) NOT NULL UNIQUE,
    password     VARCHAR(255) NOT NULL,
    salary       VARCHAR(255) NOT NULL,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

