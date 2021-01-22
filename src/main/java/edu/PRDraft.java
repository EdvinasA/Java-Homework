package edu;

public class PRDraft implements State{

    PullRequestFlow flow;

    public PRDraft(PullRequestFlow flow) {
        this.flow = flow;
    }

    @Override
    public void handleOpen() {
        flow.setState(flow.setOpenPullRequest());
        System.out.println("Pull request is OPEN.");
    }

    @Override
    public void handleDraft() {
        System.out.println("When pull request is draft, you can't use this command.");
    }

    @Override
    public void handleAbandon() {
        flow.setState(flow.setPullRequestAbandoned());
        System.out.println("Pull request is ABANDONED.");
    }

    @Override
    public void handleRequestChanges() {
        System.out.println("When pull request is draft you can't ask for changes");
    }

    @Override
    public void handlePassedPolicy() {
        System.out.println("When pull request is draft send it to be reade to complete.");
    }

    @Override
    public void handleCompletedPullRequest() {
        System.out.println("Draft pull request can't be completed.");
    }
}
