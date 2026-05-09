# Complete Git Commands Cheat Sheet

## Setup & Configuration

| Command | Description |
|---------|-------------|
| `git config --global user.name "[name]"` | Set username for all commits |
| `git config --global user.email "[email]"` | Set email for all commits |
| `git config --global color.ui auto` | Enable colored output |
| `git config --list` | Show current configuration |
| `git config [key]` | Get a specific config value |

## Starting a Repository

| Command | Description |
|---------|-------------|
| `git init` | Create new local repository |
| `git clone [url]` | Copy remote repository locally |
| `git clone --depth 1 [url]` | Shallow clone (only latest commit) |

## Basic Snapshots

| Command | Description |
|---------|-------------|
| `git status` | Show working directory status |
| `git add [file]` | Stage file for commit |
| `git add .` | Stage all changes (new, modified, deleted) |
| `git add -A` | Stage everything (including untracked) |
| `git add -p` | Stage changes interactively (hunk by hunk) |
| `git commit -m "[message]"` | Commit staged changes |
| `git commit -a -m "[message]"` | Stage all tracked files & commit |
| `git commit --amend -m "[new]"` | Modify last commit (message or content) |
| `git reset [file]` | Unstage file (keep changes) |
| `git reset --soft HEAD~1` | Undo last commit, keep changes staged |
| `git reset --mixed HEAD~1` | Undo last commit, keep changes unstaged |
| `git reset --hard HEAD~1` | Undo last commit, discard changes |
| `git rm [file]` | Delete file and stage removal |
| `git mv [old] [new]` | Rename file and stage |

## Branching & Merging

| Command | Description |
|---------|-------------|
| `git branch` | List local branches (* = current) |
| `git branch -r` | List remote branches |
| `git branch -a` | List all branches (local + remote) |
| `git branch [name]` | Create new branch |
| `git branch -d [name]` | Delete branch (safe) |
| `git branch -D [name]` | Force delete branch |
| `git branch -m [new]` | Rename current branch |
| `git checkout [branch]` | Switch branch |
| `git checkout -b [new]` | Create & switch to new branch |
| `git switch [branch]` | Newer alternative to checkout |
| `git switch -c [new]` | Create & switch (newer) |
| `git merge [branch]` | Merge branch into current |
| `git merge --abort` | Cancel merge in progress |
| `git merge --no-ff [branch]` | Merge without fast-forward |
| `git log --graph --oneline --decorate` | Visualize branch structure |

## Inspection & Comparison

| Command | Description |
|---------|-------------|
| `git log` | Show commit history |
| `git log --oneline` | Compact one-line log |
| `git log -p [file]` | Show changes per commit for file |
| `git log --since="2 days ago"` | Filter log by date |
| `git diff` | Show unstaged changes |
| `git diff --staged` | Show staged changes (vs last commit) |
| `git diff [commit1] [commit2]` | Diff between two commits |
| `git diff [branch1] [branch2]` | Diff between branches |
| `git show [commit]` | Show details of a commit |
| `git show HEAD~2` | Show third-last commit |
| `git blame [file]` | Show who changed each line |
| `git shortlog -sn` | Sorted commit count per author |

## Stashing

| Command | Description |
|---------|-------------|
| `git stash` | Save uncommitted changes |
| `git stash push -m "[name]"` | Stash with message |
| `git stash list` | List all stashes |
| `git stash apply` | Reapply latest stash (keep stash) |
| `git stash pop` | Reapply latest stash (delete stash) |
| `git stash drop stash@{0}` | Delete specific stash |
| `git stash clear` | Delete all stashes |
| `git stash branch [branch]` | Create branch from stash |

## Remote Repositories

| Command | Description |
|---------|-------------|
| `git remote -v` | List remotes with URLs |
| `git remote add [name] [url]` | Add remote (usually "origin") |
| `git remote remove [name]` | Remove remote |
| `git remote rename [old] [new]` | Rename remote |
| `git fetch [remote]` | Download objects without merging |
| `git fetch --prune` | Delete remote-tracking branches that don't exist remotely |
| `git pull` | Fetch + merge into current branch |
| `git pull --rebase` | Fetch + rebase instead of merge |
| `git push [remote] [branch]` | Upload local branch to remote |
| `git push -u [remote] [branch]` | Push and set upstream tracking |
| `git push --all [remote]` | Push all branches |
| `git push --tags` | Push tags |
| `git push origin --delete [branch]` | Delete remote branch |
| `git push --force` | Force push (dangerous - overwrites remote) |

## Tagging

| Command | Description |
|---------|-------------|
| `git tag` | List all tags |
| `git tag [name]` | Create lightweight tag at current commit |
| `git tag -a [name] -m "[msg]"` | Annotated tag with message |
| `git tag -d [name]` | Delete local tag |
| `git push [remote] [tagname]` | Push specific tag |
| `git push --tags` | Push all tags |
| `git show [tagname]` | View tag details |

## Rebasing & Advanced History

| Command | Description |
|---------|-------------|
| `git rebase [branch]` | Reapply commits on top of another branch |
| `git rebase -i HEAD~3` | Interactive rebase last 3 commits (squash, reword, drop) |
| `git rebase --continue` | Continue after fixing conflicts |
| `git rebase --skip` | Skip problematic commit |
| `git rebase --abort` | Cancel rebase |
| `git cherry-pick [commit]` | Apply specific commit to current branch |
| `git revert [commit]` | Create inverse commit (safe undo) |

## Cleaning & Recovery

| Command | Description |
|---------|-------------|
| `git clean -n` | Dry-run: show untracked files to delete |
| `git clean -f` | Delete untracked files |
| `git clean -fd` | Delete untracked files + directories |
| `git reflog` | Show reference log (recover lost commits) |
| `git reflog expire --expire=now --all` | Clear reflog (prune) |
| `git fsck --lost-found` | Find dangling commits/blobs |
| `git gc` | Garbage collect & optimize local repo |

## Submodules

| Command | Description |
|---------|-------------|
| `git submodule add [url]` | Add submodule |
| `git submodule update --init` | Clone & checkout submodules |
| `git submodule update --remote` | Update submodule to latest commit |
| `git submodule foreach [cmd]` | Run command in each submodule |

## Patching

| Command | Description |
|---------|-------------|
| `git format-patch [commit]` | Create patch files |
| `git apply [file.patch]` | Apply patch |
| `git am [file.patch]` | Apply mailbox patch as commit |
| `git diff > changes.patch` | Create patch of unstaged changes |

## Git Bisect (Bug hunting)

| Command | Description |
|---------|-------------|
| `git bisect start` | Start bisect session |
| `git bisect bad` | Mark current commit as broken |
| `git bisect good [commit]` | Mark good commit |
| `git bisect reset` | End session and return to original commit |

## Aliases (Custom shortcuts)

| Command | Description |
|---------|-------------|
| `git config --global alias.co checkout` | Example: `git co` = `git checkout` |
| `git config --global alias.br branch` | `git br` = `git branch` |
| `git config --global alias.st status` | `git st` = `git status` |
| `git config --global alias.lg "log --oneline --graph"` | Custom log visualizer |

---