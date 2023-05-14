package com.example.actionInfo;

import com.example.action.Action;
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
public class ActionInfoMapperImpl implements ActionInfoMapper {

    @Override
    public ActionInfo mapToEntity(ActionInfoDto dto) {
        if ( dto == null ) {
            return null;
        }

        ActionInfo actionInfo = new ActionInfo();

        return actionInfo;
    }

    @Override
    public ActionInfoDto mapToDto(ActionInfo action) {
        if ( action == null ) {
            return null;
        }

        Long actionId = null;
        String description = null;

        actionId = actionActionId( action );
        description = action.getDescription();

        ActionInfoDto actionInfoDto = new ActionInfoDto( actionId, description );

        return actionInfoDto;
    }

    @Override
    public List<ActionInfoDto> mapToDto(List<ActionInfo> actions) {
        if ( actions == null ) {
            return null;
        }

        List<ActionInfoDto> list = new ArrayList<ActionInfoDto>( actions.size() );
        for ( ActionInfo actionInfo : actions ) {
            list.add( mapToDto( actionInfo ) );
        }

        return list;
    }

    private Long actionActionId(ActionInfo actionInfo) {
        if ( actionInfo == null ) {
            return null;
        }
        Action action = actionInfo.getAction();
        if ( action == null ) {
            return null;
        }
        Long id = action.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
