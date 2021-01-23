package edu;

public class Demo {
    public static void main(String[] args) {
        PullRequestFlow pullRequestFlow = new PullRequestFlow();

        pullRequestFlow.setOpenPullRequest().handleOpen();

    }
}
