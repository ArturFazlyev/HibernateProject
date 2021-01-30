package auto.service;

import auto.dao.UserDao;
import auto.model.Auto;
import auto.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserService {
    private UserDao userDao = new UserDao();

    public User findUser(int id) {
        return userDao.findById(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    public Auto findById(int id) {
        return userDao.findAutoById(id);

    }
}
