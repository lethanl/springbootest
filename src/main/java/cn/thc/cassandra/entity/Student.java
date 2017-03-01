package cn.thc.cassandra.entity;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by thc on 2017/2/27
 */
@Table
public class Student {
    @PrimaryKey
    private long id;
    private String s_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Student(long id, String s_name) {
        this.id = id;
        this.s_name = s_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", s_name='" + s_name + '\'' +
                '}';
    }
}
