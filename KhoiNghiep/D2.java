package Java.KhoiNghiep;
import java.util.Scanner;
public class D2 {
        public static int[] nhapMang(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        return a;
    }

    public static void xuatMang(int a[], int n) {
        System.out.println("Xuat mang:");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    public static void timMinMax(int[] a) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int num : a) {
        if (num % 2 == 0 && num < min) {
            min = num;
        }
        if (num % 2 == 1 && num > max) {
            max = num;
        }
    }

    if (min != Integer.MAX_VALUE) {
        System.out.println("Min của so chan la: " + min);
    } else {
        System.out.println("Khong co so chan trong mang.");
    }

    if (max != Integer.MIN_VALUE) {
        System.out.println("Max cua so le la: " + max);
    } else {
        System.out.println("Khong co so le trong mang.");
    }
}


    public static void tong(int a[], int n) {
        int tong = 0, tbc = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
            if (a[i] % 2 == 0) {
                tbc += a[i];
                dem++;
            }
        }
        System.out.println("Tong cua mang: " + tong);
        if (dem > 0) {
            System.out.println("Trung binh cong cua so chan trong mang: " + (tbc / dem));
        } else {
            System.out.println("Khong co so chan trong mang.");
        }
    }

    public static void tim(int a[], int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri k can tim: ");
        int k = scanner.nextInt();
        boolean tim=false;
        for (int i = 0; i < n; i++) {
            if (k == a[i]) {
                System.out.println("Gia tri k vua nhap o vi tri: " + i);
                tim=true;
            }
        }
        if(!tim){
            System.out.println("Khong tim thay gia trị"+k+"trong mang!!!");
        }
    }

    public static void sapXepTangDan(int a[], int n) {
        int temp;
        System.out.println("Sap xep tang dan: ");
        for ( int i = 0; i < n; i++) {
            for ( int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                   temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("Sap xep giam dan: ");
        for ( int i = 0; i < n; i++) {
            for ( int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }

    public static int[] xoaPhanTu(int[] a,int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phan tu can xoa: ");
        int phanTuCanXoa = scanner.nextInt();
        int count = 0;
        for (int num : a) {
            if (num != phanTuCanXoa) {
                count++;
            }
        }
        if (count == a.length) {
            System.out.println("Khong tim thay phan tu co gia tri " + phanTuCanXoa + " de xoa.");
            return a;
        }

        int[] newArray = new int[count];
        int k = 0;
        for (int num : a) {
            if (num != phanTuCanXoa) {
                newArray[k++] = num;
            }
        }
        System.out.println("Mang da duoc xoa: ");
        xuatMang(a,n);
        return newArray;
    }

    public static void sapXepLeTangDan(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] % 2 == 1 && a[j] % 2 == 1 && a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    System.out.println("Mang so le sap xep tang dan:");
    xuatMang(a, n);
    }

    public static void tangGiaTri(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] += 3;
        }
        System.out.println("Gia tri moi cua mang sau khi tang len 3 gia tri:");
        xuatMang(a, n);
    }

    public static boolean laSoNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void hienSoNguyenTo(int a[], int n) {
        System.out.println("Cac so nguyen to trong mang: ");
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = null;
        System.out.print("Nhap so phan tu cua mang: ");
        int n = input.nextInt();
        while (true) {
            System.out.println("         -------------MENU-------------          ");
            System.out.println(" _______________________________________________");
            System.out.println("| 1. Nhap va hien thi mang so nguyen            |");
            System.out.println("| 2. Tim max cua so le va min cua so chan       |");
            System.out.println("| 3. Tinh tong va trung binh cong cua so chan   |");
            System.out.println("| 4. Tim va dua ra vi tri cua k                 |");
            System.out.println("| 5. Sap xep mang tang va giam dan              |");
            System.out.println("| 6. Xoa phan tu co gia tri thu k               |");
            System.out.println("| 7. Hien mang so le sap xep tang dan           |");
            System.out.println("| 8. Tang cac gia tri mang len 3 don vi         |");
            System.out.println("| 9. Lay ra cac phan tu la so nguyen to         |");
            System.out.println("| 0. Thoat khoi chuong trinh                    |");
            System.out.println("'-----------------------------------------------'");
            System.out.print("Moi ban lua chon: ");
            int chon = input.nextInt();
            switch (chon) {
                case 1:
                    a = nhapMang(n);
                    break;
                case 2:
                    if (a != null) {
                        timMinMax(a);
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 3:
                    if (a != null) {
                        tong(a, n);
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 4:
                    if (a != null) {
                        tim(a, n);
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 5:
                    if (a != null) {
                        sapXepTangDan(a, n);
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 6:
                    if (a != null) {                        
                        xoaPhanTu(a,n);                        
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 7:
                    if (a != null) {
                        sapXepLeTangDan(a, n);
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 8:
                    if (a != null) {
                        tangGiaTri(a, n);
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 9:
                    if (a != null) {
                        hienSoNguyenTo(a, n);
                    } else {
                        System.out.println("Vui long nhap mang truoc.");
                    }
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai!!");
                    break;
                }
            }
        }
    }
