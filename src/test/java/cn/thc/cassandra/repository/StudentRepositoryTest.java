package cn.thc.cassandra.repository;

import cn.thc.SpringbootestApplication;
import cn.thc.cassandra.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by thc on 2017/2/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootestApplication.class)
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testFindByName() throws Exception {
        Student student = studentRepository.findById(1);
        System.out.println(student.getS_name()+"=====================");
    }
}