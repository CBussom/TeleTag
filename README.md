# TagApp

# ***Idea of the Project***
+ #### TeleTag is a mobile app that people can download to play tag with their friends. The game will have different rooms that players can join to play tag with each other. Their phones’ Bluetooth will help them find other players and once they are in range their tag button will be enabled. Once the player is out of the range to tag another player, their button will be disabled. There will be a leader board that displays the player’s rankings, wins, and losses.

# ***Goals of the Project***
1. #### Set up bluetooth to detect players range among other each other.
2. #### Be able to connect to bluetooth devices and send data through them.
3. #### Recognize only devices that are currently in the game.
4. #### be able to see the history of the game in a history tab
5. #### Create a database to store players information which will be connected to the leaderboard. 
6. #### Create a leaderboard that displays players' losses, wins, and ranking.

# ***Stretch Goals of the Project***
1. #### Have different game modes such as elimination round, multiple taggers, etc.
2. #### Have a map system that shows all the players within the proxitmity of the tagger. 

# ***Layout of Git-Repo***
1. #### We have a file called Weekly Reports to store the weekly updates due every Wednesday.
2. #### We have two files called App and Idea which are the files containing our code to the phone app we have up and running at the moment.
3. #### We have a README.md file that providies a basic description of our project idea and the goals we have with this project. It also provides a basic outline of our Github-repo. 
4. #### We have a folder called Living Documents that contain three PDFS:
     + Our Proposal Document - TeleTag_Proposal
     + Our Original Requirements Document - TeleTag_Requirements_487W
     + Our Updated Requirements Document(Softwaer Architecture) - TeleTag-m4

# ***How To Build The System***
#### Using the directions found under the version control(can be found in our Living Document or in this Read.me File) open up the project in Android Studio. Using Android Studion, build the system using the steps as follows:
   1. Locate the 'build.gradle' Files.
      + There are usually two 'build.gradle' files that can be found in an Android Studio Project. One file is for the project and one for the app module.
      + Project 'build.gradle' file - This file, located in the root of the project, includes all the settings and configurations for the project. For this project you have to apply the Android Gradle plugin and the Kotlin Android Extensions plug in in this file. Enter it into the file as follows:
        ![image](https://github.com/CBussom/TeleTag/assets/143213640/2ff66931-4796-49b8-bb6c-ae9ccf495b32)

      + App module 'build.gradle' file - This file includes all the configurations that are tied to the Android Application itself, in this case our TeleTag app. Do it as follows:
        ![image](https://github.com/CBussom/TeleTag/assets/143213640/7b48e272-fbff-48ad-9e19-b8332f7bb5e9)
        ![image](https://github.com/CBussom/TeleTag/assets/143213640/ed296673-c637-4123-a5cf-f9f522b323f1)
        
   2. Configure the Dependiencies
      + Inside the 'build.gradle' file for the app module, specify the dependencies for the project. Since this project uses Bluetooth function, make sure to add necessary dependencies related to Bluetooth functionailty. Add the dependencies as follows underneath the configurations that were added in step 1:
        ![image](https://github.com/CBussom/TeleTag/assets/143213640/185c2079-c2fa-4c96-8e11-50ca73ef8ed4)

   3. Synch the Gradle Files
      + After the files have been created, click on the "Sync Now" link that is at the top right of the Android Studio app to synch the gradle files(picture below). This is essential as it makes sure that the project is updated with the latest configurations and dependencies. 
      
           ![image](https://github.com/CBussom/TeleTag/assets/143213640/ca75960a-f6c1-47f2-b60f-039842302192)


# ***How To Test The System***
1. start here

# ***How To Run The System***
1. start here

# ***Use Case(s) That Are Operational***
1. start here
