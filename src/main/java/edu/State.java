package edu;

public interface State {

    void handleDraft();
    void handleAbandon();
    void handleRequestChanges();
    void handlePassedPolicy();
    void handleCompletedPullRequest();
    void handleOpen();

}
