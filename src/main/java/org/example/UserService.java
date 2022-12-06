package org.example;

public class UserService {
    public int getUserScore(String[] records, String email) {
        String substring = "";
        for (int i = 0; i < records.length; i++) {
            int index = records[i].indexOf(":");
            substring = records[i].substring(++index);
            String substring1 = records[i].substring(0, --index);
            if (substring1.equals(email)) {
                return Integer.parseInt(substring);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
