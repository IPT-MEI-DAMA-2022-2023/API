package pt.ipt.dama.api.model


import com.google.gson.annotations.SerializedName

class Note(
    @SerializedName("title") val title: String,
    @SerializedName("description")  val description: String
    )

// the @SerializedName tag is used to express the name
// of your data that came from the API
