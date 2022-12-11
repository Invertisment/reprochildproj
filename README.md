This repro consists of two projects:

1. The sources dependency (will be checked out using tools.deps): https://github.com/Invertisment/repro-parentproj
1. The child dependency: https://github.com/Invertisment/reprochildproj.git

Repro:

1. Check out this project: https://github.com/Invertisment/reprochildproj.git
1. Run `bb proj-repl` to launch REPL
1. Open your editor and go to `src/com/github/invertisment/childproj/file.clj`
1. Loading should not work because `analyzer.clj` is not loading but `core.clj` is loading

