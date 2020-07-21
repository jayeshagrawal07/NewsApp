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
 * Use the {@link Politics#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Politics extends Fragment {

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

    public Politics() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Politics.
     */
    // TODO: Rename and change types and number of parameters
    public static Politics newInstance(String param1, String param2) {
        Politics fragment = new Politics();
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

        items = new ArrayList<>();
        items.add("Labour plans maternity pay rise\n" +
                "\n" +
                "Maternity pay for new mothers is to rise by £1,400 as part of new proposals announced by the Trade and Industry Secretary Patricia Hewitt.\n" +
                "\n" +
                "It would mean paid leave would be increased to nine months by 2007, Ms Hewitt told GMTV's Sunday programme. Other plans include letting maternity pay be given to fathers and extending rights to parents of older children. The Tories dismissed the maternity pay plan as \"desperate\", while the Liberal Democrats said it was misdirected.\n" +
                "\n" +
                "Ms Hewitt said: \"We have already doubled the length of maternity pay, it was 13 weeks when we were elected, we have already taken it up to 26 weeks. \"We are going to extend the pay to nine months by 2007 and the aim is to get it right up to the full 12 months by the end of the next Parliament.\" She said new mothers were already entitled to 12 months leave, but that many women could not take it as only six of those months were paid. \"We have made a firm commitment. We will definitely extend the maternity pay, from the six months where it now is to nine months, that's the extra £1,400.\" She said ministers would consult on other proposals that could see fathers being allowed to take some of their partner's maternity pay or leave period, or extending the rights of flexible working to carers or parents of older children. The Shadow Secretary of State for the Family, Theresa May, said: \"These plans were announced by Gordon Brown in his pre-budget review in December and Tony Blair is now recycling it in his desperate bid to win back women voters.\"\n" +
                "\n" +
                "She said the Conservatives would announce their proposals closer to the General Election. Liberal Democrat spokeswoman for women Sandra Gidley said: \"While mothers would welcome any extra maternity pay the Liberal Democrats feel this money is being misdirected.\" She said her party would boost maternity pay in the first six months to allow more women to stay at home in that time.\n" +
                "\n" +
                "Ms Hewitt also stressed the plans would be paid for by taxpayers, not employers. But David Frost, director general of the British Chambers of Commerce, warned that many small firms could be \"crippled\" by the move. \"While the majority of any salary costs may be covered by the government's statutory pay, recruitment costs, advertising costs, retraining costs and the strain on the company will not be,\" he said. Further details of the government's plans will be outlined on Monday. New mothers are currently entitled to 90% of average earnings for the first six weeks after giving birth, followed by £102.80 a week until the baby is six months old.\n");
        items.add("Watchdog probes e-mail deletions\n" +
                "\n" +
                "The information commissioner says he is urgently asking for details of Cabinet Office orders telling staff to delete e-mails more than three months old.\n" +
                "\n" +
                "Richard Thomas \"totally condemned\" the deletion of e-mails to prevent their disclosure under freedom of information laws coming into force on 1 January. Government guidance said e-mails should only be deleted if they served \"no current purpose\", Mr Thomas said. The Tories and the Lib Dems have questioned the timing of the new rules.\n" +
                "\n" +
                "Tory leader Michael Howard has written to Tony Blair demanding an explanation of the new rules on e-mail retention. On Monday Lib Dem constitutional affairs committee chairman Alan Beith warned that the deletion of millions of government e-mails could harm the ability of key probes like the Hutton Inquiry. The timing of the new rules just before the Freedom of Information Act comes into forces was \"too unlikely to have been a coincidence\", Mr Beith said. But a Cabinet Office spokeswoman said the move was not about the new laws or \"the destruction of important records\". Mr Beith urged the information commissioner to look at how the \"e-mail regime\" could \"support the freedom of information regime\".\n" +
                "\n" +
                "Mr Thomas said: \"The new Act of Parliament makes it very clear that to destroy records in order to prevent their disclosure becomes a criminal offence.\" He said there was already clear guidance on the retention of e-mails contained in a code of practice from the lord chancellor. All e-mails are subject to the freedom of information laws, but the important thing was the content of the e-mail, said Mr Thomas.\n" +
                "\n" +
                "\"If in doubt retain, that has been the long-standing principle of the civil service and public authorities. It's only when you've got no further use for the particular record that it may be legitimate to destroy it. \"But any deliberate destruction to avoid the possibility of later disclosure is to be totally condemned.\" The Freedom of Information Act will cover England, Wales and Northern Ireland from next year. Similar measures are being brought in at the same time in Scotland. It provides the public with a right of access to information held by about 100,000 public bodies, subject to various exemptions. Its implementation will be monitored by the information commissioner.\n");
        items.add("Hewitt decries 'career sexism'\n" +
                "\n" +
                "Plans to extend paid maternity leave beyond six months should be prominent in Labour's election manifesto, the Trade and Industry Secretary has said.\n" +
                "\n" +
                "Patricia Hewitt said the cost of the proposals was being evaluated, but it was an \"increasingly high priority\" and a \"shared goal across government\". Ms Hewitt was speaking at a gender and productivity seminar organised by the Equal Opportunities Commission (EOC). Mothers can currently take up to six months' paid leave - and six unpaid. Ms Hewitt told the seminar: \"Clearly, one of the things we need to do in the future is to extend the period of payment for maternity leave beyond the first six months into the second six months. \"We are looking at how quickly we can do that, because obviously there are cost implications because the taxpayer reimburses the employers for the cost of that.\"\n" +
                "\n" +
                "Ms Hewitt also announced a new drive to help women who want to work in male dominated sectors, saying sexism at work was still preventing women reaching their full potential. Plans include funding for universities to help female science and engineering graduates find jobs and \"taster courses\" for men and women in non-traditional jobs. Women in full-time work earn 19% less than men, according to the Equal Opportunities Commission (EOC).\n" +
                "\n" +
                "The minister told delegates that getting rid of \"career sexism\" was vital to closing the gender pay gap.\n" +
                "\n" +
                "\"Career sexism limits opportunities for women of all ages and prevents them from achieving their full potential. \"It is simply wrong to assume someone cannot do a job on the grounds of their sex,\" she said. Earlier, she told BBC Radio 4's Today programme: \"What we are talking about here is the fact that about six out of 20 women work in jobs that are low-paid and typically dominated by women, so we have got very segregated employment. \"Unfortunately, in some cases, this reflects very old-fashioned and stereotypical ideas about the appropriate jobs for women, or indeed for men. \"Career sexism is about saying that engineering, for instance, where only 10% of employees are women, is really a male-dominated industry. Construction is even worse. \"But it is also about saying childcare jobs are really there for women and not suitable for men. Career sexism goes both ways.\"\n" +
                "\n" +
                "She added that while progress had been made, there was still a gap in pay figures. \"The average woman working full-time is being paid about 80p for every pound a man is earning. For women working part-time it is 60p.\" The Department for Trade and Industry will also provide funding to help a new pay experts panel run by the TUC.\n" +
                "\n" +
                "It has been set up to advise hundreds of companies on equal wage policies. Research conducted by the EOC last year revealed that many Britons believe the pay gap between men and women is the result of \"natural differences\" between the sexes. Women hold less than 10% of the top positions in FTSE 100 companies, the police, the judiciary and trade unions, according to their figures. And retired women have just over half the income of their male counterparts on average.\n");
        items.add("Labour chooses Manchester\n" +
                "\n" +
                "The Labour Party will hold its 2006 autumn conference in Manchester and not Blackpool, it has been confirmed.\n" +
                "\n" +
                "The much trailed decision was ratified by Labour's ruling National Executive Committee in a break with the traditional choice of a seaside venue. It will be the first time since 1917 that the party has chosen Manchester to host the annual event. Blackpool will get the much smaller February spring conference instead in what will be seen as a placatory move.\n" +
                "\n" +
                "For years the main political parties have rotated between Blackpool, Bournemouth and Brighton. And the news the much larger annual conference is not to gather in Blackpool will be seen as a blow in the coastal resort. In 1998 the party said it would not return to Blackpool but did so in 2002. The following year Bournemouth hosted the event before the party signed a two year deal for Brighton to host the autumn conference.\n" +
                "\n" +
                "Colin Asplin, Blackpool Hotel Association said: \"We have tried very hard to make sure they come back to Blackpool. \"Obviously we have failed in that. I just hope Manchester can handle the crowds. \"It amazes me that the Labour Party, which is a working class party, doesn't want to come to the main working class resort in the country.\" The exact cost to Blackpool in terms of lost revenue for hotel accommodation is not yet known but it is thought that block bookings will be taken at the major Manchester hotels after the official announcement.\n");
        items.add("Brown ally rejects Budget spree\n" +
                "\n" +
                "Chancellor Gordon Brown's closest ally has denied suggestions there will be a Budget giveaway on 16 March.\n" +
                "\n" +
                "Ed Balls, ex-chief economic adviser to the Treasury, said there would be no spending spree before polling day. But Mr Balls, a prospective Labour MP, said he was confident the chancellor would meet his fiscal rules. He was speaking as Sir Digby Jones, CBI director general, warned Mr Brown not to be tempted to use any extra cash on pre-election bribes.\n" +
                "\n" +
                "Mr Balls, who stepped down from his Treasury post to stand as a Labour candidate in the election, had suggested that Mr Brown would meet his golden economic rule - \"with a margin to spare\". He said he hoped more would be done to build on current tax credit rules.\n" +
                "\n" +
                "He also stressed rise in interest rates ahead of an expected May election would not affect the Labour Party's chances of winning. Expectations of a rate rise have gathered pace after figures showed house prices are still rising. Consumer borrowing rose at a near-record pace in January. \"If the MPC (the Bank of England's Monetary Policy Committee) were to judge that a rate rise was justified before the election because of the strength of the economy - and I'm not predicting that they will - I do not believe that this will be a big election issue in Britain for Labour,\" he told a Parliamentary lunch. \"This is a big change in our political culture.\"\n" +
                "\n" +
                "During an interview with BBC Radio 4's Today programme, Mr Balls said he was sure Mr Brown's Budget would not put at risk the stability of the economy. \"I don't think we'll see a pre-election spending spree - we certainly did not see that before 2001,\" he said.\n" +
                "\n" +
                "His assurances came after Sir Digby Jones said stability was all important and any extra cash should be spent on improving workers' skills. His message to the chancellor was: \"Please don't give it away in any form of electioneering.\" Sir Digby added: \"I don't think he will. I have to say he has been a prudent chancellor right the way through. Stability is the key word - British business needs boring stability more than anything. \"We would say to him 'don't increase your public spending, don't give it away. But if you are going to anywhere, just add something to the competitiveness of Britain, put it into skilling our people'. \"That would be a good way to spend any excess.\"\n" +
                "\n" +
                "Mr Balls refused to say whether Mr Brown would remain as chancellor after the election, amid speculation he will be offered the job of Foreign Secretary. \"I think that Gordon Brown wants to be part of the successful Labour government which delivers in the third term for the priorities of the people and sees off a Conservative Party that will take Britain backwards,\" Mr Balls told Today. Prime Minister Tony Blair has yet to name the date of the election, but most pundits are betting on 5 May.\n");
        items.add("'Errors' doomed first Dome sale\n" +
                "\n" +
                "The initial attempt to sell the Millennium Dome failed due to a catalogue of errors, a report by the government's finance watchdog says.\n" +
                "\n" +
                "The report said too many parties were involved in decision-making when the attraction first went on sale after the Millennium exhibition ended. The National Audit Office said the Dome cost taxpayers £28.7m to maintain and sell in the four years after it closed. Finally, a deal to turn it into a sport and entertainment venue was struck. More than £550m could now be returned to the public sector in the wake of the deal to regenerate the site in Greenwich, London.\n" +
                "\n" +
                "The NAO report said that this sale went through because it avoided many of the problems of the previous attempt to sell the Dome. Deputy Prime Minister John Prescott said a good deal had been secured. \"Delivery of the many benefits secured through this deal will continue the substantial progress already made at the Millennium Village and elsewhere on the peninsula,\" he said. But Edward Leigh, who is chairman of the Commons public accounts committee, warned the government would have to work hard to ensure taxpayers would get full benefit from the Dome deal. He said: \"This report also shows that the first attempt to sell the Dome proved a complete fiasco. Every arm of government seems to have had a finger in the pie. The process was confused and muddled.\" He added: \"Four years after the Millennium Exhibition closed, the Government finally has a deal to find a use for what has been a white elephant since it closed in a deal that, incredible as it may seem, should bring in some money and provide a benefit for the local area and the country as whole. However, it was more a question of luck that a strong bid turned up after thefirst abortive attempt.\" NAO head Sir John Bourn said: \"In difficult circumstances following the failure of the first competition, English Partnerships and the office of the deputy prime minister have worked hard to get a deal.\"\n");

        View view = inflater.inflate(R.layout.fragment_politics, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        cardadapter = new CardAdapter(view.getContext(),items);
        recyclerView.setAdapter(cardadapter);

        return view;
    }
}