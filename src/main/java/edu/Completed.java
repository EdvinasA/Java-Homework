package edu;

public class Completed implements State{

    PullRequestFlow flow;

    public Completed(PullRequestFlow flow) {
        this.flow = flow;
    }

    @Override
    public void handleOpen() {
        flow.setState(flow.setOpenPullRequest());
        System.out.println("Pull request is OPEN.");
    }

    @Override
    public void handleDraft() {
        System.out.println("Completed state can only be changed to OPEN.");
    }

    @Override
    public void handleAbandon() {
        System.out.println("Completed state can only be changed to OPEN.");
    }

    @Override
    public void handleRequestChanges() {
        System.out.println("Completed state can only be changed to OPEN.");
    }

    @Override
    public void handlePassedPolicy() {
        System.out.println("Completed state can only be changed to OPEN.");
    }

    @Override
    public void handleCompletedPullRequest() {
        System.out.println("Completed state can only be changed to OPEN.");
    }
}
