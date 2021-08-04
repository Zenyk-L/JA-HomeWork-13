package ua.lviv.lgs.dao;

import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.shared.AbstractCRUD;

public interface UserDAO  extends AbstractCRUD<User> {
	User getUserByEmail(String email);
}
