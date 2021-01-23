package edu;

public class ReadyToComplete implements State{

    PullRequestFlow flow;

    public ReadyToComplete(PullRequestFlow flow) {
        this.flow = flow;
    }

    @Override
    public void handleOpen() {
        System.out.println("Ready to complete state can only be changed to DRAFT or ABANDONED or COMPLETED.");
    }

    @Override
    public void handleDraft() {
        flow.setState(flow.setDraftPullRequest());
        System.out.println("Pull request is DRAFT.");
    }

    @Override
    public void handleAbandon() {
        flow.setState(flow.setPullRequestAbandoned());
        System.out.println("Pull request is ABANDONED.");
    }

    @Override
    public void handleRequestChanges() {
        System.out.println("Ready to complete state can only be changed to DRAFT or ABANDONED.");
    }

    @Override
    public void handlePassedPolicy() {
        System.out.println("Ready to complete state can only be changed to DRAFT or ABANDONED or COMPLETED.");
    }

    @Override
    public void handleCompletedPullRequest() {
        flow.setState(flow.setCompletedState());
        System.out.println("Pull request is COMPLETED.");
    }
}
