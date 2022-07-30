package ia.ia.Service;

import ia.ia.DTO.UserDto;
import ia.ia.Mapper.UserMapper;
import ia.ia.Repository.UserRepository;
import ia.ia.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDto getUser(String id) {
        User u = this.userRepository.findById(id).get();
        return this.userMapper.modelToDto(u);
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> users = this.userRepository.findAll();

        return this.userMapper.LmodelToDto(users);
    }

    @Override
    public UserDto insertUser(UserDto userDto) {

        boolean isTrue =this.findUser(userDto.getEmail_dto());

        if (isTrue==true ){

            throw new RuntimeException("deja");
        }

        User insert = this.userMapper.DtoTomodel(userDto);
        this.userRepository.save(insert);
        return  userDto;

    }


    public boolean ifUserExists(String id) {
     Optional<UserDto>  userDto = Optional.ofNullable(this.getUser(id));
     if(userDto.isPresent()){

      return  true;
     }
     return  false;
    }

    @Override
    public String deleteUser(String id) {
      boolean userExist = this.ifUserExists(id);
      if (userExist == true){
          this.userRepository.deleteById(id);
          System.out.println("##### Deleted #######");
          return  "##### Deleted #######";
      }
      else
      {
          throw  new RuntimeException("User Not in database for deleting");

      }
    }

    @Override
    public UserDto UpdateUser(UserDto userDto) {

   return  userDto;
    }

    @Override
    public boolean findUser(String email) {
       Optional<User> user = Optional.ofNullable(this.userRepository.findByEmail(email));
        return user.isPresent();
    }
}
