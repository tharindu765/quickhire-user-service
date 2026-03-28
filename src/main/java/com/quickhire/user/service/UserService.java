package com.quickhire.user.service;

import com.quickhire.user.dto.UserRequestDTO;
import com.quickhire.user.dto.UserResponseDTO;
import java.util.List;

public interface UserService {
    UserResponseDTO registerUser(UserRequestDTO dto);
    UserResponseDTO getUserById(Long id);
    UserResponseDTO updateUser(Long id, UserRequestDTO dto);
    List<UserResponseDTO> getAllUsers();
    void deleteUser(Long id);
}