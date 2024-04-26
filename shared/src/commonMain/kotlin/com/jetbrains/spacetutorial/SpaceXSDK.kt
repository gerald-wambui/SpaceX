package com.jetbrains.spacetutorial

import com.jetbrains.spacetutorial.cache.Database
import com.jetbrains.spacetutorial.cache.DatabaseDriverFactory
import com.jetbrains.spacetutorial.network.SpaceXApi

class SpaceXSDK (databaseDriverFactory: DatabaseDriverFactory, val api: SpaceXApi){
    private val database = Database(databaseDriverFactory)
}