package com.github.liaowang11.learnintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.liaowang11.learnintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
