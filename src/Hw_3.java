public class Hw_3 {
        public static void main (String[] args) {
            //
            double[] numbers = {8.5, 7.3, -2.1, -4.0, 2.2, 3.3, 6.6, -7.7, 4.4, -1.1, 5.5, -3.3, 1.1, 9.9, -8.8};

             boolean foundFirstNegative = false;
             double sum = 0;
             int count = 0;

             for (double num : numbers ) {
                if (!foundFirstNegative) {

                    if (num > 0) {
                        foundFirstNegative = true;
                    }
                } else {

                    if (num > 0) {
                        sum += num;
                        count++;
                    }
                }
             }
             if (count > 0) {
                 double average = sum / count;
                 System.out.println("Среднее арифметическое положительных чисел после первого отрицательного" + average );
             } else {
                 System.out.println("Положительных чисел после первого отрицательного не найдено. ");

             }
        }
    }

