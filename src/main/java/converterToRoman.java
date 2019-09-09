import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class converterToRoman{

    @Test
    void shouldConvert1toI(){
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldConvert2toII(){
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvert3toIII(){
        assertEquals("III", toRoman(3));
    }

    @Test
    void shouldConvert4toIV(){
        assertEquals("IV", toRoman(4));
    }

    @Test
    void shouldConvert5toV(){
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldConvert9toIX(){
        assertEquals("IX", toRoman(9));
    }

    @Test
    void shouldConvert10toX(){
        assertEquals("X", toRoman(10));
    }

    @Test
    void shouldConvert1999toMCMXCIX(){
        assertEquals("MCMXCIX", toRoman(1999));
    }

    @Test
    void shouldConvert2394toMMCCCXCIV(){
        assertEquals("MMCCCXCIV", toRoman(2394));
    }

    private String toRoman(int number) {

        // Need to find a better way than if sentences to solve this.
/*        if(number == 1){
            return "I";
        } else if(number == 2){
            return "II";
        } else if(number == 3){
            return "III";
        } else if(number == 4){
            return "IV";
        } else if(number == 5){
            return "V";
        } else if(number == 9){
            return "IX";
        } else if(number == 10){
            return "X";
        } else {
            return null;
        }
*/


        // WhileLoop testing...DONE
        // Easiest to start with the largest integer. In this case we'll start with 1000 = M

        // String to save our Roman numerals after every check is completed.
        // Ex. 1999 = MCMXCIX
        // This program will keep to the "simple" roman numerals using M = 1000 as the highest roman numeral.

        String romanOutput = "";

        while (number >= 1000){
            romanOutput += "M";
            number -= 1000;
        }

        while (number >= 900){
            romanOutput += "CM";
            number -= 900;
        }

        while (number >= 500){
            romanOutput += "D";
            number -= 500;
        }

        while (number >= 400){
            romanOutput += "CD";
            number -= 400;
        }

        while (number >= 100){
            romanOutput += "C";
            number -= 100;
        }

        while (number >= 90){
            romanOutput += "XC";
            number -= 90;
        }

        while (number >= 50){
            romanOutput += "L";
            number -= 50;
        }

        while (number >= 40){
            romanOutput += "XL";
            number -= 40;
        }

        while (number >= 10){
            romanOutput += "X";
            number -= 10;
        }

        while (number >= 9){
            romanOutput += "IX";
            number -= 9;
        }

        while (number >= 5){
            romanOutput += "V";
            number -= 5;
        }

        while (number >= 4){
            romanOutput += "IV";
            number -= 4;
        }

        while (number >= 1){
            romanOutput += "I";
            number -= 1;
        }

        System.out.println(romanOutput);
        return romanOutput;

    }
}