/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.unittestexample.Operations;
/**
 *
 * @author nicov
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void NextNumber_UserNumberGTown_AddedANumber() {
     
     //arrange
     int userNumber=10;
     int expectedResult=11;
     
     //act
     int result=Operations.NextNumber(userNumber);
     
     
     //Assert
     
     
     assertEquals(11,result);
     }
     
     
     @Test
     public void IsDivisible_TwoIntegerNumbers_IsDivisible() {
     
     //arrange
     int FirstNumber=5;
     int SecondNumber=6;
     
     
     
     //act
     boolean Methodresult=Operations.IsDivisible(FirstNumber,SecondNumber);
     
     
     //Assert
     
     assertFalse(Methodresult);
     }
     
     
     
     
     
     
     
     
     @Test
     public void Volume_UserVolumeCalculate_CalculateVolume(){
         
    //arange
     double radio=2;
             
     double altura=2;
     
     //act
             
     double result=Operations.calcularVolumen(radio, altura);
         
     //Assert
     
     assertEquals(25.132741228718345,result);
}
     
     @Test
     public void TypeNumber_UserTypenumber_PositiveOrnegativoOrzero(){
         
    //arange
     double typenumber=2;
             
     
     
     //act
             
     String result=Operations.Determinarnumero(typenumber);
         
     //Assert
     
     assertEquals("Positive", result);
}
     
     
     
     
}
