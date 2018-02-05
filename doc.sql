CREATE TABLE STAFF(
   ID               SERIAL PRIMARY KEY NOT NULL,
   FIRST_NAME       TEXT NOT NULL,
   LAST_NAME        TEXT NOT NULL,
   GENDER           TEXT NOT NULL,
   DEPARTMENT       TEXT NOT NULL,
   TITLE            TEXT NOT NULL,
   HIRE_DATE        BIGINT NOT NULL,
   SALARY           INTEGER NOT NULL
);


--Auto increment staff id's
CREATE SEQUENCE STAFF_ID
  start 1
  increment 1;


--Add staff row
INSERT INTO STAFF (ID, FIRST_NAME, LAST_NAME, GENDER, DEPARTMENT, TITLE, HIRE_DATE, SALARY) VALUES (nextval('STAFF_ID'), F, L, G, D, T, H, S);


--Drop liquibase!!
DROP TABLE databasechangelog;
DROP TABLE databasechangeloglock;
DROP SEQUENCE staff_id;
DROP TABLE staff;