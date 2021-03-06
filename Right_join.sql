select * from employees;

select * from departments;

select * from jobs;

select * from job_history;



select concat(employees.first_name,employees.last_name) as Name ,employees.salary, departments.department_name, departments.department_id from employees

right join departments on employees.department_id = departments.department_id;

order by employees.first_name asc;



select max(department_id) from employees;

select * from employees where department_id> '110';



select job_history.employee_id, jobs.job_title, job_history.start_date, job_history.end_date, jobs.max_salary from jobs

right join job_history on jobs.job_id = job_history.job_id
order by jobs.max_salary desc;
