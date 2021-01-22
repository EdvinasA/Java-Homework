package edu;

public class ChangesRequested implements State {

    PullRequestFlow flow;

    public ChangesRequested(PullRequestFlow flow) {
        this.flow = flow;
    }

    @Override
    public void handleOpen() {
        System.out.println("Changes request state can only be changed to DRAFT or ABANDONED.");
    }

    @Override
    public void handleDraft() {
        flow.setState(flow.setDraftPullRequest());
        System.out.println("Pull request is DRAFT");
    }

    @Override
    public void handleAbandon() {
        flow.setState(flow.setPullRequestAbandoned());
        System.out.println("Pull request is ABANDONED");
    }

    @Override
    public void handleRequestChanges() {
        System.out.println("Changes request state can only be changed to DRAFT or ABANDONED.");
    }

    @Override
    public void handlePassedPolicy() {
        System.out.println("Changes request state can only be changed to DRAFT or ABANDONED.");
    }

    @Override
    public void handleCompletedPullRequest() {
        System.out.println("Changes request state can only be changed to DRAFT or ABANDONED.");
    }
}
