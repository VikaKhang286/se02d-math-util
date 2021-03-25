/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VikaKhang286.mathutil;

/**
 *
 * @author Loc
 */
public class MathUtility {
    // đây là class mô phỏng lại clas Math, chứa các hàm xài chung
    // hàm xài chung, ko lưu lại điều gì -> STATIC
    public static final double PI = 3.1415;
    
    //hàm tính n!
    //n! tăng rất nhanh về giá trị.
    //21! tràn kiểu long, hơn 18 số 0
    // bài này ta tính từ 0..20!. Âm ko tính đc, 0! = 1! = 1
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        
       //sửa code, sửa hàm giai thừa cho gọn, dùng đệ quy
       
       if(n==0 || n==1)
           return 1; //0! = 1! = 1
       return n * getFactorial(n - 1);
       //đệ quy, vòng lại chính mình với quy mô khác
       //recursion. Làm khéo nếu ko nó đi mãi mãi
       //STACKOVERFLOW.COM
       
        //n! = n * (n - 1)!
//       long result = 1; //XANH LOCAL VÀ SERVER //giả bộ = 0
//        for (int i = 2; i <= n; i++)
//            result *= i;
//                
//        return result; //nhân từ 2 3 4 5 6 7....
    }
}
