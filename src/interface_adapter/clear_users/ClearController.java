package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearAllUseCaseInteractor;

    public ClearController(ClearInputBoundary clearAllUseCaseInteractor) {
        this.clearAllUseCaseInteractor = clearAllUseCaseInteractor;
    }

    public void execute() {


        clearAllUseCaseInteractor.execute();
    }
}