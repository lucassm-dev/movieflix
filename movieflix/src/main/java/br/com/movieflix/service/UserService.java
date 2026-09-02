package br.com.movieflix.service;

import br.com.movieflix.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import br.com.movieflix.entity.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
}
