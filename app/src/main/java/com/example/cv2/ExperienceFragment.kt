package com.example.cv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cv2.ExperienceAdapter
import com.example.cv2.Experiences


class ExperienceFragment : Fragment() {

    lateinit var ExperienceRecycler: RecyclerView
    lateinit var ExperienceAdapter: ExperienceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_experience, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        ExperienceRecycler = view.findViewById(R.id.ExperienceRecycler)!!


        var ExperienceList : MutableList<Experiences> = ArrayList()

        ExperienceList.add(Experiences(ExpPic = R.drawable.ic_logo_amazon,ExpName = "AMAZONE",ExpLoc = "United States",ExpFirstDate = "01/09/2019",ExpLastDate = "TODAY",ExpDesc = "AMAZONE"))
        ExperienceList.add(Experiences(ExpPic = R.drawable.ic_logo_esprit,ExpName = "ESPRIT",ExpLoc = "Tunisie",ExpFirstDate = "01/09/2019",ExpLastDate = "TODAY",ExpDesc = "ESPRIT"))
        ExperienceList.add(Experiences(ExpPic = R.drawable.ic_logo_facebook,ExpName = "Facebook",ExpLoc = "United States",ExpFirstDate = "01/09/2019",ExpLastDate = "TODAY",ExpDesc = "FACEBOOK"))

        ExperienceAdapter = ExperienceAdapter(ExperienceList)
        ExperienceRecycler.adapter = ExperienceAdapter
        ExperienceRecycler.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL ,false)
    }

}