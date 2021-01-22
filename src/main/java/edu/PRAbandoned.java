package edu;

import javax.sound.midi.Soundbank;

public class PRAbandoned implements State {

    PullRequestFlow flow;

    public PRAbandoned(PullRequestFlow flow) {
        this.flow = flow;
    }

    @Override
    public void handleOpen() {
        flow.setState(flow.setOpenPullRequest());
        System.out.println("Pull request is OPEN.");
    }

    @Override
    public void handleDraft() {
        System.out.println("Abandoned pull request can't be changed to draft.");
    }

    @Override
    public void handleAbandon() {
        System.out.println("Pull request is already ABANDONED.");
    }

    @Override
    public void handleRequestChanges() {
        System.out.println("Abandoned pull request can't be changed to request changes.");
    }

    @Override
    public void handlePassedPolicy() {
        System.out.println("Abandoned pull request can't be changed to ready to complete.");
    }

    @Override
    public void handleCompletedPullRequest() {
        System.out.println("Abandoned pull request can't be changed to completed");
    }
}
