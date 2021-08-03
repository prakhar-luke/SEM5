 
-- Sol 1 @ 2
select *
from departments

-- Sol 3
select *
from employees

-- Sol 4
select employee_id, last_name, job_id, hire_date
from employees

-- Sol 5
select job_id
from employees

-- Sol 6
SELECT last_name || ' ,' || job_id  AS "Employee and Title" FROM employees;

-- Sol 7
select 
EMPLOYEE_ID|| ',' ||
FIRST_NAME|| ',' ||
LAST_NAME|| ',' ||	
EMAIL|| ',' ||
PHONE_NUMBER || ',' ||
HIRE_DATE|| ',' ||
EMPLOYEE_ID|| ',' ||
FIRST_NAME|| ',' ||
LAST_NAME|| ',' ||
EMAIL|| ',' ||
PHONE_NUMBER || ',' ||
HIRE_DATE|| ',' ||
SALARY AS DETAILS FROM employees;