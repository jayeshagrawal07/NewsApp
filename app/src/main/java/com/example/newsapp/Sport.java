package com.example.newsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newsapp.ui.main.CardAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Sport#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Sport extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    CardAdapter cardadapter;
    ArrayList<String> items;

    public Sport() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Sport.
     */
    // TODO: Rename and change types and number of parameters
    public static Sport newInstance(String param1, String param2) {
        Sport fragment = new Sport();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        items = new ArrayList<>();
        items.add("Claxton hunting first major medal\n" +
                "\n" +
                "British hurdler Sarah Claxton is confident she can win her first major medal at next month's European Indoor Championships in Madrid.\n" +
                "\n" +
                "The 25-year-old has already smashed the British record over 60m hurdles twice this season, setting a new mark of 7.96 seconds to win the AAAs title. \"I am quite confident,\" said Claxton. \"But I take each race as it comes. \"As long as I keep up my training but not do too much I think there is a chance of a medal.\" Claxton has won the national 60m hurdles title for the past three years but has struggled to translate her domestic success to the international stage. Now, the Scotland-born athlete owns the equal fifth-fastest time in the world this year. And at last week's Birmingham Grand Prix, Claxton left European medal favourite Russian Irina Shevchenko trailing in sixth spot.\n" +
                "\n" +
                "For the first time, Claxton has only been preparing for a campaign over the hurdles - which could explain her leap in form. In previous seasons, the 25-year-old also contested the long jump but since moving from Colchester to London she has re-focused her attentions. Claxton will see if her new training regime pays dividends at the European Indoors which take place on 5-6 March.\n");
        items.add("O'Sullivan could run in Worlds\n" +
                "\n" +
                "Sonia O'Sullivan has indicated that she would like to participate in next month's World Cross Country Championships in St Etienne.\n" +
                "\n" +
                "Athletics Ireland have hinted that the 35-year-old Cobh runner may be included in the official line-up for the event in France on 19-20 March. Provincial teams were selected after last Saturday's Nationals in Santry and will be officially announced this week. O'Sullivan is at present preparing for the London marathon on 17 April. The participation of O'Sullivan, currentily training at her base in Australia, would boost the Ireland team who won the bronze three years agio. The first three at Santry last Saturday, Jolene Byrne, Maria McCambridge and Fionnualla Britton, are automatic selections and will most likely form part of the long-course team. O'Sullivan will also take part in the Bupa Great Ireland Run on 9 April in Dublin.\n");
        items.add("Greene sets sights on world title\n" +
                "\n" +
                "Maurice Greene aims to wipe out the pain of losing his Olympic 100m title in Athens by winning a fourth World Championship crown this summer.\n" +
                "\n" +
                "He had to settle for bronze in Greece behind fellow American Justin Gatlin and Francis Obikwelu of Portugal. \"It really hurts to look at that medal. It was my mistake. I lost because of the things I did,\" said Greene, who races in Birmingham on Friday. \"It's never going to happen again. My goal - I'm going to win the worlds.\" Greene crossed the line just 0.02 seconds behind Gatlin, who won in 9.87 seconds in one of the closest and fastest sprints of all time. But Greene believes he lost the race and his title in the semi-finals. \"In my semi-final race, I should have won the race but I was conserving energy. \"That's when Francis Obikwelu came up and I took third because I didn't know he was there. \"I believe that's what put me in lane seven in the final and, while I was in lane seven, I couldn't feel anything in the race.\n" +
                "\n" +
                "\"I just felt like I was running all alone. \"I believe if I was in the middle of the race I would have been able to react to people that came ahead of me.\" Greene was also denied Olympic gold in the 4x100m men's relay when he could not catch Britain's Mark Lewis-Francis on the final leg. The Kansas star is set to go head-to-head with Lewis-Francis again at Friday's Norwich Union Grand Prix. The pair contest the 60m, the distance over which Greene currently holds the world record of 6.39 seconds. He then has another indoor meeting in France before resuming training for the outdoor season and the task of recapturing his world title in Helsinki in August. Greene believes Gatlin will again prove the biggest threat to his ambitions in Finland. But he also admits he faces more than one rival for the world crown. \"There's always someone else coming. I think when I was coming up I would say there was me and Ato (Boldon) in the young crowd,\" Greene said. \"Now you've got about five or six young guys coming up at the same time.\"\n");
        items.add("IAAF launches fight against drugs\n" +
                "\n" +
                "The IAAF - athletics' world governing body - has met anti-doping officials, coaches and athletes to co-ordinate the fight against drugs in sport.\n" +
                "\n" +
                "Two task forces have been set up to examine doping and nutrition issues. It was also agreed that a programme to \"de-mystify\" the issue to athletes, the public and the media was a priority. \"Nothing was decided to change things - it was more to have a forum of the stakeholders allowing them to express themselves,\" said an IAAF spokesman. \"Getting everyone together gave us a lot of food for thought.\" About 60 people attended Sunday's meeting in Monaco, including IAAF chief Lamine Diack and Namibian athlete Frankie Fredericks, now a member of the Athletes' Commission. \"I am very happy to see you all, members of the athletics family, respond positively to the IAAF call to sit together and discuss what more we can do in the fight against doping,\" said Diack. \"We are the leading Federation in this field and it is our duty to keep our sport clean.\" The two task forces will report back to the IAAF Council, at its April meeting in Qatar.\n");
        items.add("Dibaba breaks 5,000m world record\n" +
                "\n" +
                "Ethiopia's Tirunesh Dibaba set a new world record in winning the women's 5,000m at the Boston Indoor Games.\n" +
                "\n" +
                "Dibaba won in 14 minutes 32.93 seconds to erase the previous world indoor mark of 14:39.29 set by another Ethiopian, Berhane Adera, in Stuttgart last year. But compatriot Kenenisa Bekele's record hopes were dashed when he miscounted his laps in the men's 3,000m and staged his sprint finish a lap too soon. Ireland's Alistair Cragg won in 7:39.89 as Bekele battled to second in 7:41.42. \"I didn't want to sit back and get out-kicked,\" said Cragg. \"So I kept on the pace. The plan was to go with 500m to go no matter what, but when Bekele made the mistake that was it. The race was mine.\" Sweden's Carolina Kluft, the Olympic heptathlon champion, and Slovenia's Jolanda Ceplak had winning performances, too. Kluft took the long jump at 6.63m, while Ceplak easily won the women's 800m in 2:01.52.\n");
        items.add("Isinbayeva claims new world best\n" +
                "\n" +
                "Pole vaulter Yelena Isinbayeva broke her own indoor world record by clearing 4.89 metres in Lievin on Saturday.\n" +
                "\n" +
                "It was the Russian's 12th world record of her career and came just a few days after she cleared 4.88m at the Norwich Union Grand Prix in Birmingham. The Olympic champion went on to attempt 5.05m at the meeting on France but failed to clear that height. In the men's 60m, former Olympic 100m champion Maurice Greene could only finish second to Leonard Scott. It was Greene's second consecutive defeat at the hands of his fellow American, who also won in Birmingham last week. \"I ran my race perfectly,\" said Scott, who won in 6.46secs, his best time indoors. \"I am happy even if I know that Maurice is a long way from being at his peak at the start of the season.\"\n");

        View view = inflater.inflate(R.layout.fragment_sport, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        cardadapter = new CardAdapter(view.getContext(),items);
        recyclerView.setAdapter(cardadapter);

        return view;
    }
}