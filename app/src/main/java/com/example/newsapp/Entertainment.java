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
 * Use the {@link Entertainment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Entertainment extends Fragment {

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

    public Entertainment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Entertainment.
     */
    // TODO: Rename and change types and number of parameters
    public static Entertainment newInstance(String param1, String param2) {
        Entertainment fragment = new Entertainment();
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
        items.add("Gallery unveils interactive tree\n" +
                "\n" +
                "A Christmas tree that can receive text messages has been unveiled at London's Tate Britain art gallery.\n" +
                "\n" +
                "The spruce has an antenna which can receive Bluetooth texts sent by visitors to the Tate. The messages will be \"unwrapped\" by sculptor Richard Wentworth, who is responsible for decorating the tree with broken plates and light bulbs. It is the 17th year that the gallery has invited an artist to dress their Christmas tree. Artists who have decorated the Tate tree in previous years include Tracey Emin in 2002.\n" +
                "\n" +
                "The plain green Norway spruce is displayed in the gallery's foyer. Its light bulb adornments are dimmed, ordinary domestic ones joined together with string. The plates decorating the branches will be auctioned off for the children's charity ArtWorks. Wentworth worked as an assistant to sculptor Henry Moore in the late 1960s. His reputation as a sculptor grew in the 1980s, while he has been one of the most influential teachers during the last two decades. Wentworth is also known for his photography of mundane, everyday subjects such as a cigarette packet jammed under the wonky leg of a table.\n");
        items.add("Jarre joins fairytale celebration\n" +
                "\n" +
                "French musician Jean-Michel Jarre is to perform at a concert in Copenhagen to mark the bicentennial of the birth of writer Hans Christian Andersen.\n" +
                "\n" +
                "Denmark is holding a three-day celebration of the life of the fairy-tale author, with a concert at Parken stadium on 2 April. Other stars are expected to join the line-up in the coming months, and the Danish royal family will attend. \"Christian Andersen's fairy tales are timeless and universal,\" said Jarre. \"For all of us, at any age there is always - beyond the pure enjoyment of the tale - a message to learn.\" There are year-long celebrations planned across the world to celebrate Andersen and his work, which includes The Emperor's New Clothes and The Little Mermaid. Denmark's Crown Prince Frederik and Crown Princess Mary visited New York on Monday to help promote the festivities. The pair were at a Manhattan library to honour US literary critic Harold Bloom \"the international icon we thought we knew so well\".\n" +
                "\n" +
                "\"Bloom recognizes the darker aspects of Andersen's authorship,\" Prince Frederik said. Bloom is to be formally presented with the Hans Christian Andersen Award this spring in Anderson's hometown of Odense. The royal couple also visited the Hans Christian Anderson School complex, where Queen Mary read The Ugly Duckling to the young audience. Later at a gala dinner, Danish supermodel Helena Christensen was named a Hans Christian Andersen ambassador. Other ambassadors include actors Harvey Keitel and Sir Roger Moore, athlete Cathy Freeman and Brazilian soccer legend Pele.\n");
        items.add("Musical treatment for Capra film\n" +
                "\n" +
                "The classic film It's A Wonderful Life is to be turned into a musical by the producer of the controversial hit show Jerry Springer - The Opera.\n" +
                "\n" +
                "Frank Capra's 1946 movie starring James Stewart, is being turned into a £7m musical by producer Jon Thoday. He is working with Steve Brown, who wrote the award-winning musical Spend Spend Spend. A spokeswoman said the plans were in the \"very early stages\", with no cast, opening date or theatre announced.\n" +
                "\n" +
                "A series of workshops have been held in London, and on Wednesday a cast of singers unveiled the musical to a select group of potential investors. Mr Thoday said the idea of turning the film into a musical had been an ambition of his for almost 20 years. It's a Wonderful Life was based on a short story, The Greatest Gift, by Philip van Doren Stern. Mr Thoday managed to buy the rights to the story from Van Doren Stern's family in 1999, following Mr Brown's success with Spend Spend Spend. He later secured the film rights from Paramount, enabling them to use the title It's A Wonderful Life.\n");
        items.add("Richard and Judy choose top books\n" +
                "\n" +
                "The 10 authors shortlisted for a Richard and Judy book award in 2005 are hoping for a boost in sales following the success of this year's winner.\n" +
                "\n" +
                "The TV couple's interest in the book world coined the term \"the Richard & Judy effect\" and created the top two best-selling paperbacks of 2004 so far. The finalists for 2005 include Andrew Taylor's The American Boy and Robbie Williams' autobiography Feel. This year's winner, Alice Sebold's The Lovely Bones, sold over one million. Joseph O'Connor's Star of the Sea came second and saw sales increase by 350%. The best read award, on Richard Madeley and Judy Finnigan's Channel 4 show, is part of the British Book Awards. David Mitchell's Booker-shortlisted novel, Cloud Atlas, makes it into this year's top 10 along with several lesser known works.\n" +
                "\n" +
                "\"There's no doubt that this year's selection of book club entries is the best yet. If anything, the choice is even wider than last time,\" said Madeley. \"It was very hard to follow last year's extremely successful list, but we think this year's books will do even better,\" said Richard and Judy executive producer Amanda Ross. \"We were spoiled for choice and it was tough getting down to only 10 from the 301 submitted.\"\n");
        items.add("Poppins musical gets flying start\n" +
                "\n" +
                "The stage adaptation of children's film Mary Poppins has had its opening night in London's West End.\n" +
                "\n" +
                "Sir Cameron Mackintosh's lavish production, which has cost £9m to bring to the stage, was given a 10-minute standing ovation. Lead actress Laura Michelle Kelly soared over the heads of the audience holding the nanny's trademark umbrella. Technical hitches had prevented Mary Poppins' flight into the auditorium during preview performances. A number of celebrities turned out for the musical's premiere, including actress Barbara Windsor, comic Graham Norton and Sir Richard Attenborough.\n" +
                "\n" +
                "The show's director Richard Eyre issued a warning earlier in the week that the show was unsuitable for children under seven, while under-threes are barred. Mary Poppins was originally created by author Pamela Travers, who is said to have cried when she saw Disney's 1964 film starring Julie Andrews. Travers had intended the story to be a lot darker than the perennial family favourite. Theatre impresario Sir Cameron Mackintosh has said he hopes the musical is a blend of the sweet-natured film and the original book.\n");
        items.add("Bennett play takes theatre prizes\n" +
                "\n" +
                "The History Boys by Alan Bennett has been named best new play in the Critics' Circle Theatre Awards.\n" +
                "\n" +
                "Set in a grammar school, the play also earned a best actor prize for star Richard Griffiths as teacher Hector. The Producers was named best musical, Victoria Hamilton was best actress for Suddenly Last Summer and Festen's Rufus Norris was named best director. The History Boys also won the best new comedy title at the Theatregoers' Choice Awards.\n" +
                "\n" +
                "Partly based upon Alan Bennett's experience as a teacher, The History Boys has been at London's National Theatre since last May. The Critics' Circle named Rebecca Lenkiewicz its most promising playwright for The Night Season, and Eddie Redmayne most promising newcomer for The Goat or, Who is Sylvia?\n" +
                "\n" +
                "Paul Rhys was its best Shakespearean performer for Measure for Measure at the National Theatre and Christopher Oram won the design award for Suddenly Last Summer. Both the Critics' Circle and Whatsonstage.com Theatregoers' Choice award winners were announced on Tuesday. Chosen by more than 11,000 theatre fans, the Theatregoers' Choice Awards named US actor Christian Slater best actor for One Flew Over the Cuckoo's Nest. Diana Rigg was best actress for Suddenly Last Summer, Dame Judi Dench was best supporting actress for the RSC's All's Well That Ends Well and The History Boys' Samuel Barnett was best supporting actor.\n");

        View view = inflater.inflate(R.layout.fragment_entertainment, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        cardadapter = new CardAdapter(view.getContext(),items);
        recyclerView.setAdapter(cardadapter);

        return view;
    }
}