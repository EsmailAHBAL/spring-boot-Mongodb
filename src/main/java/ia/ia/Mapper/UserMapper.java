package ia.ia.Mapper;

import ia.ia.DTO.UserDto;
import ia.ia.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "username",target = "username_dto")
    @Mapping(source = "email",target = "email_dto")
    @Mapping(source = "password",target = "password__dto")
    @Mapping(source = "id",target = "id_dto")
    UserDto modelToDto (User user);
    @Mapping(source = "username",target = "username_dto")
    @Mapping(source = "email",target = "email_dto")
    @Mapping(source = "password",target = "password__dto")
    @Mapping(source = "id",target = "id_dto")
    List<UserDto> LmodelToDto (List<User> user);
    @Mapping(target = "username",source = "username_dto")
    @Mapping(target = "email",source = "email_dto")
    @Mapping(target = "password",source = "password__dto")
    @Mapping(target = "id",source = "id_dto")
     User DtoTomodel (UserDto user);
}

