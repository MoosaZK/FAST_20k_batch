select e.first_name||' '||e.last_name, j.job_title,
e.salary*12,d.department_id, d.department_name as name 
from employees e,departments d, jobs j where e.salary*12=60000 or
j.job_title != 'ANALYST';

-- 12--
select distinct e.* from employees e1, employees e2
where e1.employee_id = e2.manager_id ;

--13 --
select distinct d.department_id ,d.department_name from departments d join employees e on d.DEPARTMENT_ID not in e.DEPARTMENT_ID;

-- 14
select e.first_name, e.salary, d.department_name from employees e 
left outer join departments d on e.department_id = d.department_id;

-- 15
select e.first_name, e.job_id, d.department_name, l.street_address, l.city
from employees e 
inner join departments d on e.department_id=d.department_id
inner join locations l on l.location_id=d.location_id 
where l.state_province is null;

-- 16
select first_name||' '||last_name as Name from employees e
left join job_history j on j.employee_id = e.employee_id
where j.employee_id is null;


--17
select distinct e.first_name||' '|| e.last_name as Name,c.country_name, l.state_province
from employees e 
inner join departments d on e.department_id = d.department_id
inner join locations l on l.location_id = d.location_id 
inner join countries c on c.country_id = l.country_id
where c.country_name = 'United States of America'
and l.state_province <> 'Washington';
