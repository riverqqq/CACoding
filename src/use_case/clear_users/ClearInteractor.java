package use_case.clear_users;

// TODO Complete me


public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }
    @Override
    public void execute(){
        userDataAccessObject.deleteAllUsers();
        ClearOutputData clearOutputData = new ClearOutputData(user.getName(), now.toString(), false);
        userPresenter.prepareSuccessView(ClearOutputData);
    }

}
