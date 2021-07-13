import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<DanhBa> listDanhBa = new ArrayList<>();

    public static void add() {
        System.out.println("Nhập số điện thoại");
        String phone = Regex.getPhone();
        System.out.println("Nhập nhóm danh bạ");
        String group = Regex.getString();
        System.out.println("Nhập họ tên");
        String name = Regex.getString();
        System.out.println("Nhập giới tính");
        String gender = Regex.getString();
        System.out.println("Nhập địa chỉ");
        String address = Regex.getString();
        System.out.println("Nhập ngày sinh");
        String birthDay = Regex.getString();
        System.out.println("Nhập email");
        String email = Regex.getEmail();
        listDanhBa.add(new DanhBa(phone, group, name, gender, address, birthDay, email));

    }

    public static void edit() {

        System.out.println("Nhập số điện thoại cần sửa");
        String phone = Regex.getPhone();
        int check = -1;
        for (int i = 0; i < listDanhBa.size(); i++) {
            if (listDanhBa.get(i).getPhone().equals(phone)) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("không tìm thấy danh bạ với số điện thoại trên");

        } else {
            System.out.println("Nhập nhóm danh bạ");
            String group = Regex.getString();
            System.out.println("Nhập họ tên");
            String name = Regex.getString();
            System.out.println("Nhập giới tính");
            String gender = Regex.getString();
            System.out.println("Nhập địa chỉ");
            String address = Regex.getString();
            System.out.println("Nhập ngày sinh");
            String birthDay = Regex.getString();
            System.out.println("Nhập email");
            String email = Regex.getEmail();
            listDanhBa.get(check).setGroup(group);
            listDanhBa.get(check).setName(name);
            listDanhBa.get(check).setGender(gender);
            listDanhBa.get(check).setAddress(address);
            listDanhBa.get(check).setBirthDay(birthDay);
            listDanhBa.get(check).setEmail(email);
        }

    }

    public static void remove() throws IOException, ClassNotFoundException {

        System.out.println("Nhập số điện thoại cần xoá");
        String phone = Regex.getPhone();
        int check = -1;
        for (int i = 0; i < listDanhBa.size(); i++) {
            if (listDanhBa.get(i).getPhone().equals(phone)) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("không tìm thấy danh bạ với số điện thoại trên");
        } else {
            System.out.println("Nhập y nếu muốn xoá");
            String checkY = scanner.nextLine();
            if (checkY.equals("y")) {
                listDanhBa.remove(check);
                System.out.println("Đã xoá");
            } else {
                System.out.println("chưa xoá");
                Main.menu();}
        }

    }

    public static void find() {

        System.out.println("Nhập name");
        String name = Regex.getString();
        int check = -1;
        for (int i = 0; i < listDanhBa.size(); i++) {
            if (listDanhBa.get(i).getName().equals(name)) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("không tìm thấy tên");
        } else {
            System.out.println(listDanhBa.get(check).toString());
        }
    }

    public static void show() {

        for (DanhBa danhBa : listDanhBa) {
            System.out.println(danhBa);
        }
    }

}
