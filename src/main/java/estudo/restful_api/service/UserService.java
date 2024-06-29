package estudo.restful_api.service;

import estudo.restful_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
