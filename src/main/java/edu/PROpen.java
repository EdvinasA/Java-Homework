package edu;

public class PROpen implements State {

    private PullRequestFlow flow;

    public PROpen(PullRequestFlow flow) {
        this.flow = flow;
    }

    @Override
    public void handleOpen() {
        System.out.println("Pull request is already OPEN");
    }

    @Override
    public void handleDraft() {
        flow.setState(flow.setDraftPullRequest());
        System.out.println("Pull request is DRAFT");
    }

    @Override
    public void handleAbandon() {
        flow.setState(flow.getState());
        System.out.println("Pull request is ABANDONED");
    }

    @Override
    public void handleRequestChanges() {
        flow.setState(flow.setChangesRequestedState());
        System.out.println("Pull request is set to state CHANGES REQUESTED.");
    }

    @Override
    public void handlePassedPolicy() {
        flow.setState(flow.setReadyToCompleteState());
        System.out.println("Pull request is READY TO BE COMPLETED.");
    }

    @Override
    public void handleCompletedPullRequest() {
        System.out.println("When pull request is opened it can't be completed.");
    }
}
