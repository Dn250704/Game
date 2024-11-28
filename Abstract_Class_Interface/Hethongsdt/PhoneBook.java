    package Java.Abstract_Class_Interface.Hethongsdt;

    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.Collections;

    public class PhoneBook extends Phone {
        ArrayList<String> PhoneList = new ArrayList<>();
        @Override
        void insertPhone(String name, String phone) {
            boolean found = false;
            for (String s : PhoneList ) {
                if (s.contains(name)) {
                    found = true;
                    if (!s.contains(name)) {
                        s += " : " + phone;
                    }
                    else {
                        System.out.println("Danh ba nay da co san");
                    }
                }
            }
            if (!found) {
                PhoneList.add(name + "," + phone);
            }
        }
        @Override
        void removePhone(String name){
            boolean searched = false;
            for (String s : PhoneList) {
                if (name.equals(s.substring(0,s.indexOf(",")))) {
                    searched = true;
                    PhoneList.remove(s);
                    System.out.println("Removed");
                    break;
                }
            }
            if (!searched) {
                System.out.println("Not found person with name: " + name);
            }
        }
        @Override
        void updatePhone(String name, String newPhone){
            String s = name;
            s = s.substring(0, s.indexOf(", ")); // Bỏ số điện thoại cũ (chỉ giữ lại tên)
            PhoneList.set(PhoneList.indexOf(s), s + "," + newPhone);
            System.out.println("Updated");
        }
        @Override
        void searchPhone(String name){
            boolean searched = false;
            for (String s : PhoneList) {
                if (s.contains(name)) {
                    searched = true;
                    System.out.println(s.toString());
                    break;
                }
            }
            if (!searched) {
                System.out.println("Not found person");
            }
        }
        @Override
        void sort(){
            if (PhoneList.size() == 0) {
                System.out.println("PhoneList is empty");
            }
            else {
                // Sắp xếp tăng dần theo tên
                Collections.sort(PhoneList, new Comparator<String>() {
                    @Override
                    public int compare (String s, String t1) {
                        return s.compareTo(t1);
                    }
                });
                System.out.println("Sort Ascending by name: ");
                for (String s : PhoneList) {
                    System.out.println(s);
                }
                // Sắp xếp giảm dần theo tên
                Collections.sort(PhoneList, new Comparator<String>() {
                    @Override
                    public int compare (String s, String t1) {
                        return t1.compareTo(s);
                    }
                });
                System.out.println("Sort Descending by name: ");
                for (String s : PhoneList) {
                    System.out.println(s);
                }
            }
        }
    }