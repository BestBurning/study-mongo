package com.us.dao;

import com.us.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Bruce on 16/7/21.
 */
public interface PersonDao extends MongoRepository<Person,String> {

    Person findByName(String name);

    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);

}
