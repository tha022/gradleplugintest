package com.seniordev.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by vervik on 6/21/15.
 */
class GreetingTask extends DefaultTask {

    String greeting = 'hello RONK from GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }
}
