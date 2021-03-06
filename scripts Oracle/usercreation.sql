alter session set "_oracle_script"=true;

CREATE USER NEXOS_USER IDENTIFIED BY NEXOS;

GRANT CONNECT TO NEXOS_USER;

GRANT CREATE SESSION, GRANT ANY PRIVILEGE TO NEXOS_USER;

GRANT UNLIMITED TABLESPACE TO NEXOS_USER;

GRANT CREATE TABLE TO NEXOS_USER;
