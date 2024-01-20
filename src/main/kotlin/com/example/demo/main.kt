package com.example.demo

import org.springframework.boot.Banner
import org.springframework.boot.runApplication

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}