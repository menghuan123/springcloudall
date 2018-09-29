select wwt.name work_type,format(sum(wwc.working_time),2) fill_time ,format((sum(wwc.working_time)/(select sum(working_time) from wems_working_content where updated_date between '2018-06-13' AND DATE_ADD('2018-09-25',INTERVAL 1 DAY))),4) fill_rate
				from wems_working_type wwt left join wems_working_content wwc on wwt.id = wwc.wtid where wwc.updated_date between '2018-06-13' AND DATE_ADD('2018-09-25',INTERVAL 1 DAY) group by wwt.name ORDER BY wwt.name asc
				
				startdate:2018-06-13   enddate:2018-09-25
				
				
				
				
			
				
				
				
				
	select  wwt.name work_type_name,convert(sum(working_time)/(select sum(working_time) from wems_working_content wct where updated_date between '2018-06-13' AND DATE_ADD('2018-09-25',INTERVAL 1 DAY)),decimal(6,4)) proportion
from wems_working_type wwt left join wems_working_content wwc on wwt.id = wwc.wtid where wwc.updated_date between '2018-06-13' AND DATE_ADD('2018-09-25',INTERVAL 1 DAY) group by name order by proportion desc limit 5 