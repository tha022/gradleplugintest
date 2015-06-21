package com.seniordev.gradle

//import com.android.ddmlib.testrunner.IRemoteAndroidTestRunner
//import com.squareup.spoon.SpoonRunner
import org.gradle.api.Plugin
import org.gradle.api.Project
/*import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.api.TestVariant
import org.gradle.api.plugins.JavaBasePlugin*/

class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("Yeah, MY Plugin! project = "+project)
    }

    /*static void applyExtensions(final Project project) {
        project.extensions.create('spoon', SpoonPluginExtension, project)
        project.afterEvaluate {
            applyTasks(project)
        }
    }*/
}