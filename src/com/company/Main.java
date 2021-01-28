package com.company;

public class Main {

    public static void main(String[] args) {
	int yearOfBirthday = 2002;
	int monthOfBirthday = 11;
	int dayOfBirthday = 23;
	int sum = yearOfBirthday+monthOfBirthday+dayOfBirthday;
	System.out.println("Сумма моеих года, месяца и дня рождения: "+sum);
	boolean monthBiggerDay=monthOfBirthday>dayOfBirthday;
	System.out.println("Месяц моего дня рождения больше дня: "+monthBiggerDay);
	char[] name = {'К','и','р','и','л','л'};
    System.out.print("Моё имя: ");
    int i =0;
    while (i<6) {
    	System.out.print(name[i]);
    	i++;
		}
    System.out.println();
    double myAge = 18;
    double partYear = 2.0/12.0;
	myAge=myAge+partYear;
    System.out.println("Мне "+myAge+" лет");
    }
}
