package com.tzachz.commentcounter.apifacade;

import com.tzachz.commentcounter.apifacade.jsonobjects.GHComment;
import com.tzachz.commentcounter.apifacade.jsonobjects.GHOrg;
import com.tzachz.commentcounter.apifacade.jsonobjects.GHPullRequest;
import com.tzachz.commentcounter.apifacade.jsonobjects.GHRepo;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: tzachz
 * Date: 10/08/13
 * Time: 14:35
 */
public interface GitHubApiFacade {

    GHOrg getOrg(String orgName);

    Set<GHRepo> getOrgRepos(String orgName);

    Collection<GHComment> getRepoComments(String orgName, String repoName, Date since);

    Collection<GHPullRequest> getPullRequests(String orgName, String repoName, Date since);

    GHPullRequest getPullRequest(String url);

    EmojisMap getEmojiMap();
}
