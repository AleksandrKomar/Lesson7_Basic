package hometasks.task2;

import hometasks.task3.Price;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Worker[] worker = new Worker[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < worker.length; i++) {

            System.out.print("������� �.�.�. ��������� = ");
            String fio = br.readLine();

            System.out.print("������� ��������� = ");
            String post = br.readLine();

            System.out.print("������� ��� �������� �� ������ = ");
            String year = br.readLine();

            if (isThisDateValid(year, "yyyy")) {
                worker[i] = new Worker(fio, post, Integer.parseInt(year));
            } else {
                worker[i] = new Worker(fio, post, 0);
            }
        }

        //��������� �� ���
        Arrays.sort(worker, Comparator.comparing(Worker::getFio));

        //������� ��������������� ������
        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].toString());
        }

        System.out.println("������� ��������:");
        int value = Integer.parseInt(br.readLine());

        //������� �����
        br.close();

        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (Worker temp: worker) {

            int year = temp.getYear();
            int stage = yearNow - year;

            if (stage > value) {
                System.out.println("��� = " + temp.getFio());
            }

        }
    }

    public static boolean isThisDateValid(String dateToValidate, String dateFromat) {

        if (dateToValidate == null) return false;

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
