package com.digital.MockGenerator;

import com.github.javafaker.Faker;

public class FakerGenerator {

    Faker faker = new Faker();


    public String randomFirstName(){
        return faker.name().firstName();
    }
    public String randomLastName(){
        return faker.name().lastName();
    }

    public String randomEmail(){
        return faker.internet().emailAddress();
    }

    public String randomUserName(){
        return faker.name().username();
    }

    public String randomBio(){
        return faker.chuckNorris().fact();
    }

    public  String randomPassword(){
        return faker.internet().password(8,12,true,true,true);
    }


    public static void main(String[] args) {
            FakerGenerator fakerGenerator = new FakerGenerator();

        System.out.println(fakerGenerator.randomFirstName());
    }
}
