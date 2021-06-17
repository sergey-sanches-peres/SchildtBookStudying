package Multithreading;
       //                                                             ТЕМА:
public class NewThread implements Runnable{//                  РЕАЛИЗАЦИЯ RUNNABLE

          Thread t;

          NewThread(){
              //создать новый второй поток исполнения
              t = new Thread(this, "Демонстрационный поток");
              System.out.println("Дочерний поток создан: " + t);
              t.start(); //запуск потока исполнения
          }

           @Override
           public void run() {
               try {
                   for (int i = 5; i > 0; i--) {
                       System.out.println("Дочерний поток: " + i);
                       Thread.sleep(1000);
                   }
               }catch (InterruptedException e){
                   System.out.println("Дочерний поток прерван");
               }
               System.out.println("Дочерний поток завершен.");
           }

       }
       class ThreadDemo{
           public static void main(String[] args) {
               new NewThread(); // создать новый поток

               try {
                   for (int i = 5; i > 0; i--) {
                       System.out.println("Главный поток: " + i);
                       Thread.sleep(1000);
                   }
               }catch (InterruptedException e){
                   System.out.println("Главный поток прерван");
               }
               System.out.println("Главный поток завершен.");
           }
      }


