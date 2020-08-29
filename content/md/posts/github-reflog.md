{:title "Github's Reflog" 
:layout :post 
:date "2014-12-08" 
:tags ["tech-tips" "github" "git"] 
:author "Sankara"}

## Github's Reflog

##### Or how to recover lost commits that were not available in local

(Post copied as is from my _medium_ blog. Not tested to see if it still works)

Git’s [_reflog_ is a very powerful tool](/git-reflog) and can be used to correct
most mistakes. What about the scenario where you inadvertently force pushed a
local branch without fetching your coworkers changes first? One option of
course, is to recover those commits from the coworkers local branch but if
you are using Github there’s a way out.

*First, find the commit id before you pushed your changes by using the 
[Events API](https://developer.github.com/v3/activity/events/#list-repository-events).*
 
```shell script
curl -u <username> https://api.github.com/repos/:owner/:repo/events
```

This will return a JSON blob of the most recent events in the repo — pretty
much like the reflog command. You would have to sift through the blob to
locate your commit(s) that was lost. You can these use the ref/sha to create
a new branch.

*Create a new branch for the ref using the 
[Create Reference API](https://developer.github.com/v3/git/refs/#create-a-reference):*

```shell script
curl -u <github-username> -X POST -d ‘{“ref”:”refs/heads/<new-branch-name>”, “sha”:”<sha-from-step-1>"}’ https://api.github.com/repos/:owner/:repo/git/refs
```   
