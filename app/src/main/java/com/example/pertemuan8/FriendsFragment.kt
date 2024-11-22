package com.example.pertemuan8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FriendsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FriendsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var friendAdapter: MyFriendAdapter
    private val friends = mutableListOf<MyFriend>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_friends, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        setupRecyclerView()
        return view
    }

    private fun setupRecyclerView() {
        friends.addAll(
            listOf(
                MyFriend("Bintang", "081216779801", "bintang.@email.com"),
                MyFriend("Maftuh", "081234567890", "maftuh@email.com"),
                MyFriend("Boloo", "082234256768", "boloo@email.com"),
                MyFriend("Aril", "081212131415", "aril.@email.com"),
                MyFriend("Budi", "081298979696", "idub@email.com"),
                MyFriend("Surya", "082233445566", "suryakretek@email.com"),
                MyFriend("DjiSamSoe", "08121231232", "rokok123.@email.com"),
                MyFriend("Redmyie", "081298749322", "xyauomyie@email.com"),
                MyFriend("Marlbiri", "082267392788", "Marlboro@email.com"),
                MyFriend("Dokcarr", "081266782437", "dokarjaran.@email.com"),
                MyFriend("Beckcack", "081467386873", "rudo3@email.com"),
                MyFriend("Jackpoct", "082310101010", "ngeslotgg@email.com")
            )
        )
        friendAdapter = MyFriendAdapter(friends)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = friendAdapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FriendsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FriendsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}