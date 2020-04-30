package Control;

import bean.Student;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    public static void App(List<Student> StudentList ){
        System.out.println("请选择操作： ");
        System.out.println("*****************************");
        System.out.println("*1：插入                    *");
        System.out.println("*2：查找                    *");
        System.out.println("*3：删除                    *");
        System.out.println("*4：修改                    *");
        System.out.println("*5：输出                    *");
        System.out.println("*6：退出                    *");
        System.out.println("*****************************");
        System.out.println("进行操作：");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            //插入学生
            case 1:
                System.out.print("输入学号：");
                Scanner SId = new Scanner(System.in);
                int Id = SId.nextInt();
                System.out.print("输入姓名：");
                Scanner SName = new Scanner(System.in);
                String Name = SName.nextLine();
                System.out.print("输入出生日期：");
                Scanner SbirDate = new Scanner(System.in);
                String birDate = SbirDate.nextLine();
                System.out.print("输入性别：");
                Scanner Sgender = new Scanner(System.in);
                String S = Sgender.nextLine();
                boolean gender;
                if(S.equals("男")){
                    gender=true;
                }
                else{
                    gender=false;
                }
                StudentList.add(new Student(Id,Name,birDate,gender));
                System.out.println("添加成功");
                //每次插入后都按升序排列
                Collections.sort(StudentList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        int i=o1.getSId()-o2.getSId();
                        return i;
                    }
                });
                App(StudentList);
                break;
            //查找学生
            case 2:
                System.out.print("请输入查询学生的姓名：");
                Scanner CName = new Scanner(System.in);
                String CstudentName = CName.nextLine();
                boolean isfindData = false;
                for (int i = 0; i < StudentList.size(); i++) {
                    if(CstudentName.equals(StudentList.get(i).getSName())){
                        System.out.println("名字:"+StudentList.get(i).getSName());
                        System.out.println("学号:"+StudentList.get(i).getSId());
                        System.out.println("出生日期:"+StudentList.get(i).getSDate());
                        System.out.print("性别:");
                        if(StudentList.get(i).isSex()==true){
                            System.out.println("男");
                        }
                        else{
                            System.out.println("女");
                        }
                        isfindData = true;
                    }
                }
                if(!isfindData){
                    System.out.println("未找到");
                }
                App(StudentList);
                break;
            //删除学生
            case 3:
                System.out.print("请输入删除学生的姓名：");
                Scanner CName1 = new Scanner(System.in);
                String CstudentName1 = CName1.nextLine();
                boolean isfindDelete = false;
                for (int i = 0; i < StudentList.size(); i++) {
                    if(CstudentName1.equals(StudentList.get(i).getSName())){
                        System.out.println("正在删除该学生");
                        StudentList.remove(i);
                        System.out.println("删除成功");
                        isfindDelete =true;
                    }
                }
                if(!isfindDelete){
                    System.out.println("未找到");
                }
                App(StudentList);
                break;
            //修改
            case 4:
                System.out.print("请输入修改成绩学生的姓名：");
                Scanner CName2 = new Scanner(System.in);
                String CstudentName2 = CName2.nextLine();
                boolean isfindChange = false;
                for (int j = 0; j < StudentList.size(); j++) {
                    if(CstudentName2.equals(StudentList.get(j).getSName())){
                        System.out.println("正在修改该学生");
                        System.out.println("学生原学号为"+StudentList.get(j).getSId());
                        System.out.print("请输入修改后学生的学号：");
                        Scanner GId = new Scanner(System.in);
                        String CId = GId.nextLine();
                        StudentList.get(j).setSDate(CId);
                        System.out.println("学生原出生日期为"+StudentList.get(j).getSDate());
                        System.out.print("请输入修改后学生的出生日期：");
                        Scanner GbirDate = new Scanner(System.in);
                        String CbirDate = GbirDate.nextLine();
                        StudentList.get(j).setSDate(CbirDate);
                        System.out.println("修改成功!!!");
                        isfindChange =true;
                    }else{
                    }
                }
                if(!isfindChange){
                    System.out.println("未找到");
                }
                App(StudentList);
                break;
            //输出所有学生信息
            case 5:
                for (int i = 0; i < StudentList.size(); i++) {
                        System.out.println("名字:"+StudentList.get(i).getSName());
                        System.out.println("学号:"+StudentList.get(i).getSId());
                        System.out.println("出生日期:"+StudentList.get(i).getSDate());
                        System.out.print("性别:");
                        if(StudentList.get(i).isSex()==true){
                            System.out.println("男");
                        }
                        else{
                            System.out.println("女");
                        }
                    }
                App(StudentList);
                break;
            //退出
            case 6:
                System.out.println("成功退出");
                break;
            default:
                System.out.println("您输入的数字有误，请重新输入：");
                App(StudentList);
                break;
        }

    }
}




