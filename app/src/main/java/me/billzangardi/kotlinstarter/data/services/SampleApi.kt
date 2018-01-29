package me.billzangardi.kotlinstarter.data.services

import io.reactivex.Single
import me.billzangardi.kotlinstarter.data.model.Response
import retrofit2.http.GET

/**
 * Created by zangardiw on 12/22/17.
 */

interface SampleApi {
    @GET("")
    fun getFoo(): Single<Response>
}