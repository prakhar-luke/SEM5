-- 1.	Write  a query to display the last name and salary of employees earning more than  12,000
SELECT last_name, salary
FROM employees
WHERE salary>12000

-- Create a query to display the employee last name and department id for employee id   176.
SELECT last_name, department_id
FROM employees
WHERE employee_id = 176

-- Display the last name and salary for all employees whose salary is not in the range of 5,000 and 12,000
SELECT last_name, salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000

--Display the last name and department id  of all employees in departments 20 and 50 in alphabetical order by last _name.
SELECT last_name, department_id
FROM employees
WHERE department_id = 20 OR department_id = 50
ORDER BY last_name

-- Write  a query to display last name and salary of employees who earn between  5,000 and 12,000, and are in department 20 or 50.Label the columns Employee  and Monthly Salary, respectively. 
SELECT last_name AS "Employee", salary AS "Monthly Salary"
FROM employees
WHERE (salary BETWEEN 5000 AND 12000) AND (department_id = 20 OR department_id = 50)

-- Display the last name and job id of all employees who do not have a manager.
SELECT last_name, job_id
FROM employees
WHERE manager_id IS NULL

-- Display the last name, salary, and commission pct for all employees who earn commissions. Sort data in descending order of salary and commissions.
SELECT last_name, salary, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL
ORDER BY salary, commission_pct DESC
