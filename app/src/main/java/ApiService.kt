import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class SignupRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val nic: String,
    val password: String,
    val contactNumber: String,
    val experience: String
)

data class SignupResponse(
    val message: String
)

interface ApiService {
    @POST("signup")
    fun signup(@Body request: SignupRequest): Call<SignupResponse>
}
