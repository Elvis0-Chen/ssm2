package com.example.dao;

import com.example.BaseTest;
import com.example.bean.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentTest extends BaseTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() throws Exception{
        long bookId = 1000;
        long studentId = 1234567890L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert="+insert);

    }

    @Test
    public void testQueryByKeyWithBook() throws Exception{
        long bookId = 1000;
        long studentId = 1234567890L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());

    }

}
