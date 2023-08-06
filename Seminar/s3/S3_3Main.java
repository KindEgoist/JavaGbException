package Exception.Seminar.s3;

import java.io.IOException;

public class S3_3Main {
    public static void main(String[] args) throws Exception {


//        try {
//            s.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        S3_3 s2 = new S3_3();
//        s2.add();
//        s2.close();
//        s2.add();

        try(S3_3 s = new S3_3();) {
            s.add();
            System.out.println(s.getNumber());
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
}
