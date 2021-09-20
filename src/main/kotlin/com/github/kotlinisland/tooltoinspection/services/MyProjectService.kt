package com.github.kotlinisland.tooltoinspection.services

import com.intellij.openapi.project.Project
import com.github.kotlinisland.tooltoinspection.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
