package httpurlconnection;

import static httpurlconnection.UserCrudApp.*;

public class HttpURLConnectionMain {
    public static void main(String[] args) {
//        System.out.println(createUser());
//        System.out.println(deleteUser(1));
//        System.out.println(findUserById(5));
//        System.out.println(updateUser(2));
//        System.out.println(findUserByUsername("Karianne"));
//        System.out.println(getAllUsers());

        getCommentsForLastPostByUser(1);

    }
}
