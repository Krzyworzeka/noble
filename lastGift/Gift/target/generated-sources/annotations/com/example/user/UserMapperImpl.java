package com.example.user;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-14T18:47:17+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Private Build)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapToEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setMail( dto.getMail() );
        user.setPhone( dto.getPhone() );

        return user;
    }

    @Override
    public UserDto mapToDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( entity.getId() );
        userDto.setMail( entity.getMail() );
        userDto.setPhone( entity.getPhone() );

        return userDto;
    }

    @Override
    public List<UserDto> mapToDto(List<User> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( entities.size() );
        for ( User user : entities ) {
            list.add( mapToDto( user ) );
        }

        return list;
    }
}
