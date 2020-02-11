package com.niggatechdeveloper.comicrepublic.Fragements


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.niggatechdeveloper.comicrepublic.ComicRepublicNewsActivity
import com.niggatechdeveloper.comicrepublic.LatestMessagesActivity

import com.niggatechdeveloper.comicrepublic.R
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_profile, container, false)



        view.edit_account_settings_btn.setOnClickListener {
            startActivity(Intent(context, ComicRepublicNewsActivity::class.java)
            )

        }


        return view
    }


}
