package com.howtodoinjava.demo.controller;
 
import com.howtodoinjava.demo.model.XMLConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.howtodoinjava.demo.model.EmployeeListVO;
import com.howtodoinjava.demo.model.EmployeeVO;
import userProfile.ListDef;
import userProfile.ListItemDef;
import userProfile.UserProfiles;

@RestController
public class EmployeeRESTController 
{
    @RequestMapping(value = "/employees")
    public @ResponseBody EmployeeListVO getAllEmployees() 
    {
        EmployeeListVO employees = new EmployeeListVO();
         
        EmployeeVO empOne = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2,"Amit","Singhal","asinghal@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3,"Kirti","Mishra","kmishra@gmail.com");
         
         
        employees.getEmployees().add(empOne);
        employees.getEmployees().add(empTwo);
        employees.getEmployees().add(empThree);
         
        return employees;
    }
     
    @RequestMapping(value = "/employees/{id}")
    @ResponseBody
    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id) 
    {
        if (id <= 3) {
            EmployeeVO employee = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/userProfile/users")
    public @ResponseBody
    UserProfiles getUserProfiles()
    {
        UserProfiles userProfiles = null;
        try {
            ApplicationContext appContext = new ClassPathXmlApplicationContext("App.xml");
            XMLConverter converter = (XMLConverter) appContext.getBean("XMLConverter");

            userProfiles = (UserProfiles) converter.convertFromXMLToObject("userprofiles.xml");
            System.out.println("userProfiles:"+userProfiles);
//            System.out.println("Done");
//
//            ListItemDef listItemDef = new ListItemDef();
//            listItemDef.setEntryUri("U-UCCUID1@ucc1.com");
//            ListDef listDef = new ListDef();
//
//            userProfiles.setKeyList(listDef);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return userProfiles;
    }
}