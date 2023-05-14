package com.example.action;

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
public class ActionMapperImpl implements ActionMapper {

    @Override
    public Action mapToEntity(ActionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Action action = new Action();

        action.setId( dto.getId() );
        action.setName( dto.getName() );
        action.setOrganization( dto.getOrganization() );
        action.setDescription( dto.getDescription() );
        action.setPlace( dto.getPlace() );

        return action;
    }

    @Override
    public ActionDTO mapToDto(Action action) {
        if ( action == null ) {
            return null;
        }

        ActionDTO actionDTO = new ActionDTO();

        actionDTO.setId( action.getId() );
        actionDTO.setName( action.getName() );
        actionDTO.setOrganization( action.getOrganization() );
        actionDTO.setDescription( action.getDescription() );
        actionDTO.setPlace( action.getPlace() );

        return actionDTO;
    }

    @Override
    public List<ActionDTO> mapToDto(List<Action> actions) {
        if ( actions == null ) {
            return null;
        }

        List<ActionDTO> list = new ArrayList<ActionDTO>( actions.size() );
        for ( Action action : actions ) {
            list.add( mapToDto( action ) );
        }

        return list;
    }
}
