package pl.noble.gift.action;

import org.springframework.stereotype.Service;

@Service
public class ActionService {
    private final ActionRepository actionRepository;
    private final ActionMapper actionMapper;

    public ActionService(ActionRepository actionRepository, ActionMapper actionMapper) {
        this.actionRepository = actionRepository;
        this.actionMapper = actionMapper;
    }
}
