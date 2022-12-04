package mhk.app.multiflavor_firebaseappdistribution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* All the configurations can be run locally */

        /*
        * To Distribute app using Firebase App Distribution
        * run: fastlane distribute
        *
        * */


        /*
        * To Take Screenshots
        * run: fastlane grab_screens
        * 
        *
        *  Add Following in Fastlane/Screengrabfile
            # Set the path to the Android SDK
            android_home('$PATH')
            * // export JAVA_HOME="/Applications/Android Studio.app/Contents/jre/Contents/Home"
              //  export PATH="$PATH:/Users/humza/Documents/Android/sdk/platform-tools"

            # Start ADB in root mode, giving you elevated permissions to write to the device
            use_adb_root(true)

            # Your project’s package name
            app_package_name('mhk.app.multiflavor_firebaseappdistribution')

            # Paths for APK files, which you are creating via fastlane
            ˙pp_apk_path('./app/build/outputs/apk/dev/debug/app-dev-debug.apk')
            tests_apk_path('./app/build/outputs/apk/androidTest/beta/debug/app-beta-debug-androidTest.apk')

            # Locations where you want to create screenshots. Add locales as required.
            #locales(['en-US', 'fr-FR', 'it-IT'])

            # Clears all previously generated screenshots before creating new ones
            clear_previous_screenshots(true)
        
        * */

//        REF # https://github.com/nuhkoca/kotlin-android-fastlane-firebase-app-distribution#run-the-lane
//        REF # https://www.kodeco.com/26869030-fastlane-tutorial-for-android-getting-started
    }
}