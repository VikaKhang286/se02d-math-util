/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vikakhang286.mathutil.test;

import com.VikaKhang286.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Loc
 */
public class MathUtilityTest {
    
    @Test //biến hàm này thành main(), shift-F6 để chạy
    //gọi hàm getF() như thường lệ, hay hơn là tự động so sánh giùm
    //expected và actual coi có khớp nhau ko??? có thảy màu xanh
    //ko khớp nhau thảy màu đỏ. Ta chỉ nhìn màu mà ko cần mất công
    //so sánh nữa!!!
    public void testFactorialRightArgumentRunsWell(){
        long expected = 120; //em muốn biết 5! đúng là 120 ko?
        int n = 5;          //em đưa 5 đấy
        long actual = MathUtility.getFactorial(n); //tính thiệt coi
        //và so giùm tớ luôn
        assertEquals(expected, actual); //tớ chỉ thích đèn báo giao thông thôi
        //tui sẽ test các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6)); //6! có phải 720?
        assertEquals(24, MathUtility.getFactorial(4)); 
        assertEquals(6, MathUtility.getFactorial(3)); 
        assertEquals(2, MathUtility.getFactorial(2)); 
        assertEquals(1, MathUtility.getFactorial(1)); 
        assertEquals(1, MathUtility.getFactorial(0));
        //0! là 1 tình huống cần test
        //1! là 1 tình huống khác cần test
        //6! là 1 tình huống khác cần test
        //TÌNH HUỐNG: TEST CASE. NGHỀ TESTER/QC LÀ NGHỀ NGHĨ RA CÁC TEST CASE,
        //SAU ĐÓ THỬ NGHIỆM
        
        //assertEquals(0, MathUtility.getFactorial(0));
        //equivalent partitioning: kĩ thuật phân vùng tương đương        
    }    
    //kì vọng sai, tính đúng -> 1 màu đỏ, không khớp nhau
    //kì vọng đúng, tính sai -> 1 màu đỏ
    //tao hi vọng 5! = 120, mày tính ra mấy, hàm mày tính ra mấy?
    
    //ta test phần ngoại lệ - exception
    //Exception là tình huống bất thường xảy ra trong app, trong code, khi app chạy.
    //Nó ko phải là 1 value để có thề so sánh.
    //Lỗi SQL trùng key, sai khoá ngoại, null trên cột yêu cầu khác null
    //đều là lỗi liên quan SQL nhưng ko thể nói thằng nào bằng thằng nào?
    //Đối với Exception, chỉ có thể đo nó bằng câu hỏi:  MÀY CÓ XUẤT HIỆN KO?
    //ko dùng assertEquals() so-sánh-coi-có-bằng-nhau-hay-ko
    //trong thiết kế của hàm getFactorial() thì nếu đưa vào n<0 hoặc n>21
    //thì hàm ném ra, sẽ new 1 ngoại lệ
    //cứ đưa n vi phạm, nhận về ngoại lệ
    //vậy nếu có ngoại lệ xảy ra khi n đưa vào cà chớn <0 >21
    //CÓ NGHĨA RẰNG HÀM CHẠY ĐÚNG, THẤY NGOẠI LỆ TA LẠI ĂN MỪNG,
    //VÌ CHẠY NHƯ THIẾT KÉ -> ĐÚNG CÓ NGOẠI LỆ TA CẦN NÓ XUẤT HIỆN -> MÀU XANH
    //SẼ CÓ TEST CASE, TÌNH HUỐNG TEST: XEM NGOẠI LỆ CÓ XH KO, CÓ -> XANH
    //                                           KO XH NHƯ DỰ KIẾN -> ĐỎ    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(30);   //phải xh Exception
        MathUtility.getFactorial(-10);  //phải xh Exception
        MathUtility.getFactorial(21);   //phải xh Exception
        MathUtility.getFactorial(40);   //phải xh Exception
    }    //nếu xh exception như kì vọng, thì phải XANH
        //vì màu xanh here hàm ý rằng hàm chạy nhu thiết kế,
        //ném ngoại lệ khi đưa n cà chớn!!!
        //TA CẦN KĨ THUẬT ĐỂ BẮT NGOẠI LỆ, ĐÚNG NGOẠI LỆ CẦN BẮT XUẤT HIỆN
        //TA CÓ XANH    
}

// QUY ƯỚC XANH: Nếu tất cả các lời gọi hàm getFactorial()
// đều trả ra giá trị đúng như kì vọng, nói cách khác tất cả các
// hàm assertEquals() đều so sánh khớp expected vs. equal
// thì có màu xanh

//XANH: KHI TẤT CẢ CÁC TÌNH HUỐNG TEST HÀM ĐỀU, ĐỀU CHẠY ĐÚNG
// ĐỎ: Chỉ cần 1 trong đám này sai, coi như ĐỎ CHO TẤT CẢ
//Lí do phía sau: Đã TEST HÀM THÌ HÀM PHẢI ĐÚNG CHO CÁC TÌNH HUỐNG 
// TEST ĐƯỢC ĐƯA RA,
// ĐÃ TEST THÌ PHẢI ĐÚNG CHO CÁC TRƯỜNG HỢP ĐC ĐƯA RA
// KO chơi trò: hầu hết hàm đúng, lâu lâu mới sai...
