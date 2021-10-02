# Interview Check (Java)
Sample Java project for verifying interview setup

## Requirements
 - docker
 - vscode

## Open in dev container
1. Clone this repository
2. Open the directory in VS Code
3. Click the "Open a Remote Window" icon on the bottom-left corner of VS Code
4. Select "Reopen in Container"

Check out this [Link](https://github.com/sourceallies/interviews/blob/main/docs/interview-environment.md) for more information on using a dev container. 

A development container image will be built according to the configuration in the .devcontainer folder. Nothing is installed on your host OS. Everything can be cleaned up by deleting the development container and corresponding image.

## Run project
You can run the project by typing the following in the console.
```
./mvnw compile exec:java
```

## Test Project 
You can run the projects test by typing the following in the console. 

```
./mvnw test
```