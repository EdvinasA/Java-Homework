package edu;

public class PullRequestFlow {

    private final State pROpenState;
    private final State pRDraftState;
    private final State changesRequestedState;
    private final State pRAbandonedState;
    private final State readyToCompleteState;
    private final State completedState;

    private State state;

    public PullRequestFlow() {
        this.pROpenState = new PROpen(this);
        this.pRDraftState = new PRDraft(this);
        this.changesRequestedState = new ChangesRequested(this);
        this.pRAbandonedState = new PRAbandoned(this);
        this.readyToCompleteState = new ReadyToComplete(this);
        this.completedState = new Completed(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State setOpenPullRequest() {
        return pROpenState;
    }

    public State setDraftPullRequest() {
        return pRDraftState;
    }

    public State setChangesRequestedState() {
        return changesRequestedState;
    }

    public State setPullRequestAbandoned() {
        return pRAbandonedState;
    }

    public State setReadyToCompleteState() {
        return readyToCompleteState;
    }

    public State setCompletedState() {
        return completedState;
    }

}
