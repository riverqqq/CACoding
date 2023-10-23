package use_case.clear_users;

// TODO Complete me


import java.util.ArrayList;

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
        ArrayList<String> usernames = userDataAccessObject.deleteAllUsers();
        ClearOutputData clearOutputData = new ClearOutputData(usernames);
        userPresenter.prepareSuccessView(clearOutputData);
    }

}
