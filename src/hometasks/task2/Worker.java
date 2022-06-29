package hometasks.task2;

public class Worker {

   private String fio;
   private String post;
    private int year;

    public Worker(String fio, String post, int year) {
        this.fio = fio;
        this.post = post;
        this.year = year;
    }

    public String getFio() {
        return fio;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ФИО = " + this.fio + ", Должность = " + this.post + ", Год принятия = " + this.year;
    }

}
