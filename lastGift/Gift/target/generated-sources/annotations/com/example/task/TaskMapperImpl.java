package com.example.task;

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
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task mapToEntity(TaskDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Task task = new Task();

        task.setId( dto.getId() );
        task.setTitle( dto.getTitle() );
        task.setDescription( dto.getDescription() );
        task.setStatus( dto.getStatus() );

        return task;
    }

    @Override
    public TaskDTO mapToDto(Task entity) {
        if ( entity == null ) {
            return null;
        }

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setActionId( entityActionId( entity ) );
        taskDTO.setId( entity.getId() );
        taskDTO.setTitle( entity.getTitle() );
        taskDTO.setDescription( entity.getDescription() );
        taskDTO.setStatus( entity.getStatus() );

        return taskDTO;
    }

    @Override
    public List<TaskDTO> mapToDto(List<Task> tasks) {
        if ( tasks == null ) {
            return null;
        }

        List<TaskDTO> list = new ArrayList<TaskDTO>( tasks.size() );
        for ( Task task : tasks ) {
            list.add( mapToDto( task ) );
        }

        return list;
    }

    private Long entityActionId(Task task) {
        if ( task == null ) {
            return null;
        }
        Action action = task.getAction();
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
