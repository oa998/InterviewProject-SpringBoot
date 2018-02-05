CREATE TABLE STAFF(
   ID               SERIAL PRIMARY KEY NOT NULL,
   FIRST_NAME       TEXT NOT NULL,
   LAST_NAME        TEXT NOT NULL,
   GENDER           TEXT NOT NULL,
   DEPARTMENT       TEXT NOT NULL,
   JOB_TITLE            TEXT NOT NULL,
   HIRE_DATE        BIGINT NOT NULL,
   SALARY           INTEGER NOT NULL
);


--Auto increment staff id's
CREATE SEQUENCE STAFF_ID
  start 1
  increment 1;


INSERT INTO STAFF (ID, FIRST_NAME, LAST_NAME, GENDER, DEPARTMENT, JOB_TITLE, HIRE_DATE, SALARY) VALUES (nextval('STAFF_ID'), 'Ford','Falconbridge','Male','Support','Senior Financial Analyst','937944053','339500');