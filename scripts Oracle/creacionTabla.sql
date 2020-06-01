CREATE TABLE personas (
  id NUMBER(5),
  nombre VARCHAR2(100),
  apellido VARCHAR2(100),
  email VARCHAR2(100),
  recidencia VARCHAR2(100),
  parentezco VARCHAR2(100),
  fecha_nacimiento DATE,
  tipo_documento VARCHAR2(2),
  numero_documento NUMBER(10),
  created_date DATE,
  created_by VARCHAR2(100),
  modified_date DATE,
  modified_by VARCHAR2(100),
  CONSTRAINT pk_personas PRIMARY KEY (id)
);

INSERT INTO personas (id, nombre, apellido, email, recidencia, parentezco, fecha_nacimiento, tipo_documento, numero_documento, created_date, created_by) VALUES(1, 'Andres', 'Guzman', 'andresguzman@gmail.com', 'Bogotá', 'Padre', TO_DATE('1950/08/28', 'yyyy/mm/dd'), 'CC', 4568934, TO_DATE(sysdate), 'Nexos');
INSERT INTO personas (id, nombre, apellido, email, recidencia, parentezco, fecha_nacimiento, tipo_documento, numero_documento, created_date, created_by) VALUES(2, 'Leidy', 'Zamora', 'lzamora@gmail.com', 'Bogotá', 'Madre', TO_DATE('1954/07/20', 'yyyy/mm/dd'), 'CC', 5467056, TO_DATE(sysdate), 'Nexos');
INSERT INTO personas (id, nombre, apellido, email, recidencia, parentezco, fecha_nacimiento, tipo_documento, numero_documento, created_date, created_by) VALUES(3, 'Gabriel', 'Guzman', 'gguzman@gmail.com', 'Bogotá', 'Hijo', TO_DATE('2010/03/02', 'yyyy/mm/dd'), 'TI', 200302563, TO_DATE(sysdate), 'Nexos');
INSERT INTO personas (id, nombre, apellido, email, recidencia, parentezco, fecha_nacimiento, tipo_documento, numero_documento, created_date, created_by) VALUES(4, 'Maria', 'Guzman', 'mguzman@gmail.com', 'Tunja', 'Hija', TO_DATE('1994/12/14', 'yyyy/mm/dd'), 'CC', 1012435876, TO_DATE(sysdate), 'Nexos');
INSERT INTO personas (id, nombre, apellido, email, recidencia, parentezco, fecha_nacimiento, tipo_documento, numero_documento, created_date, created_by) VALUES(5, 'Oscar', 'Zamora', 'ozamora1@gmail.com', 'Neiva', 'Tio', TO_DATE('1970/05/06', 'yyyy/mm/dd'), 'CC', 7844678, TO_DATE(sysdate), 'Nexos');
INSERT INTO personas (id, nombre, apellido, email, recidencia, parentezco, fecha_nacimiento, tipo_documento, numero_documento, created_date, created_by) VALUES(6, 'Edna', 'Zamora', 'ednaz@gmail.com', 'Madrid', 'Prima', TO_DATE('1995/08/08', 'yyyy/mm/dd'), 'CE', 45871, TO_DATE(sysdate), 'Nexos');

COMMIT;