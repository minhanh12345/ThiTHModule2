import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        menu();
    }

    public static void menu() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ---");
            System.out.println("Chọn chức năng theo số để tiếp tục:");
            System.out.println("1.Xem danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xoá");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Đọc từ file");
            System.out.println("7.Ghi từ file");
            System.out.println("8.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Manager.show();
                    break;
                case 2:
                    Manager.add();
                    break;
                case 3:
                    Manager.edit();
                    break;
                case 4:
                    Manager.remove();
                    break;
                case 5:
                    Manager.find();
                    break;
                case 6:
                    for (DanhBa danhBa : ReadWriteToFile.readFile("fileCSV.csv")) {
                        System.out.println(danhBa);
                    }
                    break;
                case 7:
                    ReadWriteToFile.writeFile("fileCSV.csv", Manager.listDanhBa);
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
