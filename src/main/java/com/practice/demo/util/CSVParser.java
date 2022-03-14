package com.practice.demo.util;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.practice.demo.POJO.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CSVParser {

    public static List<User> parseCsv() {
        List<User> users = new ArrayList<>();
        try {
            CSVReader csvReader = new CSVReaderBuilder(new FileReader("C:/apps/data.csv"))
                    .withSkipLines(1)
                    .build();

            users = csvReader.readAll().stream().map(data -> {
                User user1 = new User();
                user1.setFirstName(data[0]);
                user1.setLastName(data[1]);
                user1.setEmail(data[3]);
                user1.setCompany(data[4]);
                user1.setPhone(data[5]);
                user1.setDept(data[6]);
                user1.setTitle(data[7]);
                user1.setPassword(data[8]);
                user1.setConfirmPassword(data[9]);
                user1.setApps(data[10]);
                user1.setCustomer(data[11]);
                user1.setRole(data[12]);
                return user1;
            }).collect(Collectors.toList());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
