DROP TABLE IF EXISTS employee ;
 
CREATE TABLE employee (
  employee_id INT AUTO_INCREMENT  PRIMARY KEY,
  employee_name VARCHAR(50) NOT NULL,
  title VARCHAR(50) NOT NULL,
  business_unit VARCHAR(50) NOT NULL,
  place VARCHAR(50) DEFAULT NULL,
  supervisor_id VARCHAR(10) DEFAULT NULL,
  competencies int(8),
  salary int(8)
);
 
