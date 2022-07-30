package ia.ia.Service;

import ia.ia.DTO.UserDto;

import java.util.List;

public interface IUserService {
    boolean findUser(String email);
    UserDto getUser(String id);
    List<UserDto> getUsers();
    UserDto insertUser (UserDto userDto);
    String deleteUser(String id);
    UserDto UpdateUser(UserDto userDto);
}
