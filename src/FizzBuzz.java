public class FizzBuzz {
    int num;
    public String kiemTraFizzBuzz(int num){
        if (num>0){
            if (num%3==0&&num%5==0){
                return docSoHaiChuSo(num)+ " : FizzBuzz ";
            }else
            if (num%3==0){
                return docSoHaiChuSo(num)+ " : Fizz ";
            }else
            if (num%5==0){
                return docSoHaiChuSo(num)+ " : Buzz ";
            }
        }
        return "Số không hợp lệ ";
    }
    public String docSo(int num){
        String ten="";
        if (num>0&&num<=10){
            switch (num){
                case 1:
                    ten =  "một";
                    break;
                case 2:
                    ten =  "hai";
                    break;
                case 3:
                    ten =  "ba";
                    break;
                case 4:
                    ten =  "bốn";
                    break;
                case 5:
                    ten =  "năm";
                    break;
                case 6:
                    ten =  "sáu";
                    break;
                case 7:
                    ten =  "bảy";
                    break;
                case 8:
                    ten =  "tám";
                    break;
                case 9:
                    ten =  "chín";
                    break;
                case 10:
                    ten =  "mười";
                    break;
            }
        }

        return ten;
    }
    public String docSoHaiChuSo(int num){
        int donVi = num%10;
        int chuc = (num-donVi)/10;
        if (num>0&&num<=10){
            return docSo(num);
        }else if (num>10&&num<20){
            return "Mười "+docSo(donVi);
        }else if (num>=20&&num<100){
            return docSo(chuc)+" "+docSo(donVi);
        }
      return "Nhập lại";
    }
}
