package com.example.cv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cv2.Education
import com.example.cv2.EducationAdapter


class EducationFragment : Fragment() {

    lateinit var EducationRecycler: RecyclerView
    lateinit var EducationAdapter: EducationAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_education, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        EducationRecycler = view.findViewById(R.id.EducationRecycler)!!


        var EducationList : MutableList<Education> = ArrayList()

        EducationList.add(Education(EduPic = R.drawable.ic_logo_harvard,EduName = "Oxford",EduLoc = "United States",EduFirstDate = "01/09/2019",EduLastDate = "TODAY"))
        EducationList.add(Education(EduPic = R.drawable.ic_logo_harvard,EduName = "Harvard",EduLoc = "United States",EduFirstDate = "01/09/2019",EduLastDate = "TODAY"))
        EducationList.add(Education(EduPic = R.drawable.ic_logo_stanford,EduName = "Standford",EduLoc = "United States",EduFirstDate = "01/09/2019",EduLastDate = "TODAY"))

        EducationAdapter = EducationAdapter(EducationList)
        EducationRecycler.adapter = EducationAdapter
        EducationRecycler.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL ,false)

    }


}