package Java.Buoi6;
import java.util.*;
class Bai1 {
    // 1. Nhập mảng số nguyên n phần tử
    public static void input(int a[], int n) {
        for ( int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }
    
    // 2. Xuất các giá trị của mảng
    public static void output(int a[], int n) {
        for ( int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    // 3. Sắp xếp mảng
    public static void sort(int a[], int n) {
        Arrays.sort(a);
        System.out.println("Sap xep mang: " + Arrays.toString(a));
    }

    // 4. Tìm kiếm một phần tử k trong dãy đưa ra vị trí tìm thấy
    public static int find(int a[], int n, int k) {
        int vitri = Arrays.binarySearch(a,k);
        return vitri;
    }

    // 5. Thay thế mảng đã nhập bằng một số bất kì
    public static void replace(int a[], int n) {
        System.out.print("Nhap so can thay the co mang: ");
        int thay = new Scanner(System.in).nextInt();
        Arrays.fill(a, thay);
        System.out.println("Mang thay the: " + Arrays.toString(a));
    }

    public static void main(String[] args) {
        System.out.print("Nhap so phan tu: "); 
        int n = new Scanner(System.in).nextInt();
        int a[] = new int[n];
        System.out.println("================================");
        input(a, n);
        System.out.println("================================");
        output(a, n);
        System.out.println("================================");
        sort(a, n);
        System.out.println("================================");
        System.out.print("Nhap so can tim: ");
        int k = new Scanner(System.in).nextInt();
        System.out.println("Vi tri: " + find(a, n, k));
        System.out.println("================================");
        replace(a, n);
    }
}