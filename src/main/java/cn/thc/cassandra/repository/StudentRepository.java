package cn.thc.cassandra.repository;

import cn.thc.cassandra.entity.Student;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by thc on 2017/2/27
 */
public interface StudentRepository extends CrudRepository<Student,String> {

    @Query("select * from student where id = :id")
    public Student findById(@Param("id") long id);

}
