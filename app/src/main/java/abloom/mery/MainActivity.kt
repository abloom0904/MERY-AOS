package abloom.mery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.firestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Firebase.firestore

        // permission 에러로 보류
//        val docRef = db.collection("questions").document("102")
//        docRef.get()
//            .addOnSuccessListener { document ->
//                if (document != null) {
//                    Log.d("test", "DocumentSnapshot data: ${document.data}")
//                } else {
//                    Log.d("test", "No such document")
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.d("test", "get failed with ", exception)
//            }

    }
}