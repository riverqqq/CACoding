package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.login.LoginState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.StringJoiner;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        ClearState clearState = clearViewModel.getState();
        StringJoiner joiner = new StringJoiner("\n");

        for (String s : response.getUsernames()) {
            joiner.add(s);
        }

        clearState.setUsernames(joiner.toString());
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {

    }
}
