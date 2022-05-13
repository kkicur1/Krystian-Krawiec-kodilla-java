package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Powiadomienie sms do " + user);
    }

}
