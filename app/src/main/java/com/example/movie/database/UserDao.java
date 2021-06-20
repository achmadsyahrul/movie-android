package com.example.movie.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Insert
    void registerUser(UserTable userTable);

    @Query("SELECT * from user where username=(:username) and password=(:password)")
    UserTable login(String username, String password);
}
