package org.demo.app.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.demo.app.dto.EmployeeDto;
import org.demo.app.util.EmployeeUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class EmployeeService {


    public List<EmployeeDto> createRandomList(int size) {
        List<EmployeeDto> employeeDtoList = EmployeeUtil.getEmployeeDtoList(size);
        return employeeDtoList;
    }


    public List<EmployeeDto> findList() {
        List<EmployeeDto> employeeDtoList = EmployeeUtil.getEmployeeDtoList(20);
        return employeeDtoList;
    }


    public EmployeeDto findById(Long id) {
        EmployeeDto employeeDto = EmployeeUtil.createRandomEmployeeDto();
        employeeDto.setId(id);
        return employeeDto;
    }

    public Long count() {
        return 3000L;
    }


    public EmployeeDto createOrUpdate(EmployeeDto employeeDto) {
        return employeeDto;
    }


    public String delete(String id) {
        return id;
    }

}
