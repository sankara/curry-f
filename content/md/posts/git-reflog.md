{:title "Git reflog" 
:layout :post 
:date "2013-08-23" 
:tags ["tech-tips" "git"] 
:author "Sankara"}
## Git Reflog 

#### Safety Net-For screw-ups

(Post copied from my _medium_ blog as is. Will edit later to add more
 scenarios and useful tips on how to use reflog)

How many times have you screwed up a commit or a merge and wished you didn’t do 
it? If you use git or any VCS for that matter, that number would definitely be > 0. 
I really love the simplicity of git (I’m serious — that’s a post for another day). 
One of the most amazing features of git which could only be possible by its simplicity is

```text
git reflog
```

Git maintains a list of checkpoints which can accessed using reflog. You can use 
reflog to undo merges, recover lost commits or branches and a lot more. 

```text
NAME
       git-reflog - Manage reflog information

SYNOPSIS
       git reflog <subcommand> <options>


DESCRIPTION
       The command takes various subcommands, and different options depending on the subcommand:

           git reflog [show] [log-options] [<ref>]
           git reflog expire [--expire=<time>] [--expire-unreachable=<time>]
                   [--rewrite] [--updateref] [--stale-fix]
                   [--dry-run | -n] [--verbose] [--all | <refs>...]
           git reflog delete [--rewrite] [--updateref]
                   [--dry-run | -n] [--verbose] ref@{specifier}...
           git reflog exists <ref>


       Reference logs, or "reflogs", record when the tips of branches and other references were updated in the local repository. Reflogs are useful in various Git commands, to specify the old value of a reference. For example, HEAD@{2}
       means "where HEAD used to be two moves ago", master@{one.week.ago} means "where master used to point to one week ago in this local repository", and so on. See gitrevisions(7) for more details.
```