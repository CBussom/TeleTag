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
     + Our Updated Living Document(Software Architecture) - TeleTag-m4
     + Our Updated Living Document(Alpha Release)
   
# ***Solidifying our Toolchain and Processes***
1. ## **Version Control**
   + Our project is created using Android Studio that has a built in support for Git which is what handles our version control. We created a public repository called "TeleTag" and use Android Studio to create and run our program.
   + To open up our project in Android Studio, you access our public repository and hit the green button called Code. Then you open up the repository using Github Desktop and click clone the project. Once the project has been cloned, you click fetch origin to ensure you have the latest version of the project. Once the origin has been fetched, you will see a tab that says "Open Your Repository In Your External Editor" and next to it will say Android Studio. Click on the Android Studio button and the project will open up in the IDE. If it does not, you can click on options, choose Android Studio as your IDE, click save, and do the step above.
   + Once the program opens, you can now test and run our code. Any changes being made can be pushed to the repository and you can access the history of the different versions of the project using the history tab in Github Desktop. Any changes being pushed will be shown in the repository.
2. ## **Bug Tracking**
   + For our bug tracking we are using Github Issues. Using this we are able to keep track of all the issues we have to work on or have been fixed. This helps us know where exactly our problem lie and we can fix it one by one. Once an issue is solved we can close it which helps us keep track of the ones we have solved.
3. ## **Build System**
   + The build system we use for our project is Gradle. In order to build the system, open the project in Android Studios. The directions on how to do this can be found in the Version Control section. After that is done, follow the directions in the READ.me file of the repository to build the system.
4. ## **Testing Infrastructure**
   + The testing infrastructure we are using for the project is JUnit. In order to test the program, follow the instructions provided under Testing in the Read.me file of the repository.
5. ## **CI - Continuous Integration**
   + The continuous integration is implemented for our program using Github Actions. We created a YML file that handles all of our CI needs. The CI build will execute the tests below:
        + Kotlin Unit Tests
        + Integration Tests
        + UI Tests
        + End-to-End Tests
        + Performance and Load Tests
   
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
      +  ![image](https://github.com/CBussom/TeleTag/assets/143213640/ca75960a-f6c1-47f2-b60f-039842302192)

   4. Build the Project
      + Click on the "Build" menu in Android Studio and select "Rebuild Project"(picture below). This ensures that the project is cleaned and rebuilt, compiling the source coude and resolving dependencies.
      +  ![image](https://github.com/CBussom/TeleTag/assets/143213640/81172e85-6cdd-4772-b4cb-02e3516c680e)

   5. Resolve Issues
      + If there are any issues that occured when the project was being rebuilt, the IDE will display the errors in the "Messages" pane at the bottom under the Problems tab. If there are any errors, maxy necessary fixes.
        
   6. Run on a Device or Emulator
      + Once the project is successfully built, you can run the program on an emulator or an actual Android device. Press the Green Play Button at the top of the IDE and the app will be deployed. To see how to run the program step by step, read the instructions under the "Running the System" section below. 
   7. Test the Bluetooth Functionality
      + Make sure the Bluetooth is functioning properly. Check if you can scan for devices and connect to the device that you choose. Once the two devices are connected, the device that you just connected to should show up underneath the "Connected Devices" list. 
        

# ***How To Test The System***
#### Before testing the system, make sure to follow every step for how to build a system. 
#### To test the system follow the steps below: 
   1. To add a new test to the code base, navigate to the main/java/Test folder in the source folder.
   2. Create a new Kotlin class file and name it to the test you want to create.
   3. Create a the class, then the function that contains the test.
   4. After writing the test, write @Test above the function
   5. Push the changes to GitHub so the test can be ran. 

# ***How To Run The System***
#### Make sure to download Android Studio Giraffe 2022.3.1 Patch 2 using the following link - https://developer.android.com/studio 
#### Before Running the System, make sure you have the project opened in Android Studio and you have built the system following the instructions above. 
#### To run the system, follow the steps below using either an Emulator or an Android Device:
#### To run the app using the Emulator:
   1. Click the green play button that when you hover over it will say "Run Main Activity". Once you run the program, at the bottom it will say the gradle is building and once that is done, you will get a notification saying "The App Is Getting Ready to Launch." Once it launches, the app will be deployed onto your screen as shown below.
      ![image](https://github.com/CBussom/TeleTag/assets/143213640/6451864a-26dd-4530-b391-d789df28ae25)
#### To run the app using an Android Device: 
   2. If you do have an actual Android Device, using a USBC cable connect your phone to your laptop/computer. Once it is connected your phone's name should pop up at the top(pictured below). Once the name pops up, click on the green play button, which when you hover over it will say "Run Main Activity". This will deploy the app onto your Android Device.
      + ![image](https://github.com/CBussom/TeleTag/assets/143213640/1e1f0cb9-61b5-4a4d-811b-2bfced8b6c11)
      + If you get an error about your SDK location, make sure you have a file called "local.properties" and it has the correct location for your SDK directory. The example is below.
      + ![image](https://github.com/CBussom/TeleTag/assets/143213640/6e301108-bbc2-485a-9b58-5cb0661e7e4e)

# ***Use Case(s) That Are Operational***
1. Use Case 1: User Starts a Game
   + The user can use the app to scan for other devices. Then they can click on the device they want to connect to and once connected, it will be added to the list of Connected Devices.

# ***Use Case(s) That Are Not Operational***
1. Use Case 2: User Leaves Game
2. Use Case 3: The Host Ends the Game
3. Use Case 4: A User is 'Tagged'
