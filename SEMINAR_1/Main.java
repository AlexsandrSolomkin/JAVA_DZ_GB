// package Seminar1;

// import java.text.*;
// import java.time.LocalTime;
// import java.util.Date;
// import java.util.Scanner;


// public class Main {
//     public static <SimpleDateFormatter> void main(String[] args) {
//         System.out.println("Hello world!");

//         Date dateNow = new Date();
//         SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
//         System.out.println("Текущая дата " + formatForDateNow.format(dateNow));

//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Ваше имя?: ");
//         String userName = scanner.next();
//         System.out.println("Привет, "+userName);

//         int hour = LocalTime.now().getHour();

//         if (hour>=5 && hour<12){
//             System.out.print("Доброе утро, ");
//         } else if (hour>=12 && hour<18) {
//             System.out.print("Добрый день, ");
//         } else if (hour>=18 && hour<23) {
//             System.out.print("Добрый вечер, ");
//         } else{
//             System.out.print("Доброй ночи, ");
//         }
//         System.out.println(userName);
//     }
// }