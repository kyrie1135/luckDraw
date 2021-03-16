package com.company;

import java.util.Scanner;

public class Dos {
    static boolean logined = false;

    public static void main(String[] args) {
        User user = new User();
        int k = 0;
        while ((k = Main(user)) >= 1 && k < 5) {
            switch (k) {
                case 1:
                    System.out.print((k = user.login(user)) == -1 ? "此用户不存在!\n" : "");
                    System.out.print((k == -2) ? "===<<警告>>用户：[" + user.userName + "]已处于登录状态，无需重复登录！\n" : "");
                    break;
                case 2:
                    user.regist();
                    break;
                case 3:
                    user.getLuckly();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    static int Main(User user){
        System.out.println("**********************************************");
        System.out.println("********************主菜单********************");
        System.out.println("**********************************************");
        System.out.println("******          <1> 登   录             ******");
        System.out.println("******          <2> 注   册             ******");
        System.out.println("******          <3> 抽   奖             ******");
        System.out.println("******          <4> 退   出             ******");
        System.out.println("**********************************************");
        System.out.println("==============================================");
        System.out.println(logined ? "-[已登录]-  （1）用户名:"+user.userName+"   （2）用户账号:"+user.userId:"-[未登录]-   （1）用户名:NaN   （2）用户账号:NaN");
        System.out.println("==============================================");
        System.out.print("###===>请输入您的选择：");
        return (new Scanner(System.in)).nextInt();
    }
}