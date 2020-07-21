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
 * Use the {@link Technology#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Technology extends Fragment {

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

    public Technology() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Technology.
     */
    // TODO: Rename and change types and number of parameters
    public static Technology newInstance(String param1, String param2) {
        Technology fragment = new Technology();
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
        items.add("Ink helps drive democracy in Asia\n" +
                "\n" +
                "The Kyrgyz Republic, a small, mountainous state of the former Soviet republic, is using invisible ink and ultraviolet readers in the country's elections as part of a drive to prevent multiple voting.\n" +
                "\n" +
                "This new technology is causing both worries and guarded optimism among different sectors of the population. In an effort to live up to its reputation in the 1990s as \"an island of democracy\", the Kyrgyz President, Askar Akaev, pushed through the law requiring the use of ink during the upcoming Parliamentary and Presidential elections. The US government agreed to fund all expenses associated with this decision.\n" +
                "\n" +
                "The Kyrgyz Republic is seen by many experts as backsliding from the high point it reached in the mid-1990s with a hastily pushed through referendum in 2003, reducing the legislative branch to one chamber with 75 deputies. The use of ink is only one part of a general effort to show commitment towards more open elections - the German Embassy, the Soros Foundation and the Kyrgyz government have all contributed to purchase transparent ballot boxes.\n" +
                "\n" +
                "The actual technology behind the ink is not that complicated. The ink is sprayed on a person's left thumb. It dries and is not visible under normal light.\n" +
                "\n" +
                "However, the presence of ultraviolet light (of the kind used to verify money) causes the ink to glow with a neon yellow light. At the entrance to each polling station, one election official will scan voter's fingers with UV lamp before allowing them to enter, and every voter will have his/her left thumb sprayed with ink before receiving the ballot. If the ink shows under the UV light the voter will not be allowed to enter the polling station. Likewise, any voter who refuses to be inked will not receive the ballot. These elections are assuming even greater significance because of two large factors - the upcoming parliamentary elections are a prelude to a potentially regime changing presidential election in the Autumn as well as the echo of recent elections in other former Soviet Republics, notably Ukraine and Georgia. The use of ink has been controversial - especially among groups perceived to be pro-government.\n" +
                "\n" +
                "Widely circulated articles compared the use of ink to the rural practice of marking sheep - a still common metaphor in this primarily agricultural society.\n" +
                "\n" +
                "The author of one such article began a petition drive against the use of the ink. The greatest part of the opposition to ink has often been sheer ignorance. Local newspapers have carried stories that the ink is harmful, radioactive or even that the ultraviolet readers may cause health problems. Others, such as the aggressively middle of the road, Coalition of Non-governmental Organizations, have lauded the move as an important step forward. This type of ink has been used in many elections in the world, in countries as varied as Serbia, South Africa, Indonesia and Turkey. The other common type of ink in elections is indelible visible ink - but as the elections in Afghanistan showed, improper use of this type of ink can cause additional problems. The use of \"invisible\" ink is not without its own problems. In most elections, numerous rumors have spread about it.\n" +
                "\n" +
                "In Serbia, for example, both Christian and Islamic leaders assured their populations that its use was not contrary to religion. Other rumours are associated with how to remove the ink - various soft drinks, solvents and cleaning products are put forward. However, in reality, the ink is very effective at getting under the cuticle of the thumb and difficult to wash off. The ink stays on the finger for at least 72 hours and for up to a week. The use of ink and readers by itself is not a panacea for election ills. The passage of the inking law is, nevertheless, a clear step forward towards free and fair elections.\" The country's widely watched parliamentary elections are scheduled for 27 February.\n" +
                "\n" +
                "David Mikosz works for the IFES, an international, non-profit organisation that supports the building of democratic societies.\n");
        items.add("China net cafe culture crackdown\n" +
                "\n" +
                "Chinese authorities closed 12,575 net cafes in the closing months of 2004, the country's government said.\n" +
                "\n" +
                "According to the official news agency most of the net cafes were closed down because they were operating illegally. Chinese net cafes operate under a set of strict guidelines and many of those most recently closed broke rules that limit how close they can be to schools. The move is the latest in a series of steps the Chinese government has taken to crack down on what it considers to be immoral net use.\n" +
                "\n" +
                "The official Xinhua News Agency said the crackdown was carried out to create a \"safer environment for young people in China\". Rules introduced in 2002 demand that net cafes be at least 200 metres away from middle and elementary schools. The hours that children can use net cafes are also tightly regulated. China has long been worried that net cafes are an unhealthy influence on young people. The 12,575 cafes were shut in the three months from October to December. China also tries to dictate the types of computer games people can play to limit the amount of violence people are exposed to.\n" +
                "\n" +
                "Net cafes are hugely popular in China because the relatively high cost of computer hardware means that few people have PCs in their homes. This is not the first time that the Chinese government has moved against net cafes that are not operating within its strict guidelines. All the 100,000 or so net cafes in the country are required to use software that controls what websites users can see. Logs of sites people visit are also kept. Laws on net cafe opening hours and who can use them were introduced in 2002 following a fire at one cafe that killed 25 people. During the crackdown following the blaze authorities moved to clean up net cafes and demanded that all of them get permits to operate. In August 2004 Chinese authorities shut down 700 websites and arrested 224 people in a crackdown on net porn. At the same time it introduced new controls to block overseas sex sites. The Reporters Without Borders group said in a report that Chinese government technologies for e-mail interception and net censorship are among the most highly developed in the world.\n");
        items.add("Microsoft seeking spyware trojan\n" +
                "\n" +
                "Microsoft is investigating a trojan program that attempts to switch off the firm's anti-spyware software.\n" +
                "\n" +
                "The spyware tool was only released by Microsoft in the last few weeks and has been downloaded by six million people. Stephen Toulouse, a security manager at Microsoft, said the malicious program was called Bankash-A Trojan and was being sent as an e-mail attachment. Microsoft said it did not believe the program was widespread and recommended users to use an anti-virus program. The program attempts to disable or delete Microsoft's anti-spyware tool and suppress warning messages given to users.\n" +
                "\n" +
                "It may also try to steal online banking passwords or other personal information by tracking users' keystrokes.\n" +
                "\n" +
                "Microsoft said in a statement it is investigating what it called a criminal attack on its software. Earlier this week, Microsoft said it would buy anti-virus software maker Sybari Software to improve its security in its Windows and e-mail software. Microsoft has said it plans to offer its own paid-for anti-virus software but it has not yet set a date for its release. The anti-spyware program being targeted is currently only in beta form and aims to help users find and remove spyware - programs which monitor internet use, causes advert pop-ups and slow a PC's performance.\n");
        items.add("Digital guru floats sub-$100 PC\n" +
                "\n" +
                "Nicholas Negroponte, chairman and founder of MIT's Media Labs, says he is developing a laptop PC that will go on sale for less than $100 (£53).\n" +
                "\n" +
                "He told the BBC World Service programme Go Digital he hoped it would become an education tool in developing countries. He said one laptop per child could be \" very important to the development of not just that child but now the whole family, village and neighbourhood\". He said the child could use the laptop like a text book. He described the device as a stripped down laptop, which would run a Linux-based operating system, \"We have to get the display down to below $20, to do this we need to rear project the image rather than using an ordinary flat panel.\n" +
                "\n" +
                "\"The second trick is to get rid of the fat , if you can skinny it down you can gain speed and the ability to use smaller processors and slower memory.\" The device will probably be exported as a kit of parts to be assembled locally to keep costs down. Mr Negroponte said this was a not for profit venture, though he recognised that the manufacturers of the components would be making money. In 1995 Mr Negroponte published the bestselling Being Digital, now widely seen as predicting the digital age. The concept is based on experiments in the US state of Maine, where children were given laptop computers to take home and do their work on.\n" +
                "\n" +
                "While the idea was popular amongst the children, it initially received some resistance from the teachers and there were problems with laptops getting broken. However, Mr Negroponte has adapted the idea to his own work in Cambodia where he set up two schools together with his wife and gave the children laptops. \"We put in 25 laptops three years ago , only one has been broken, the kids cherish these things, it's also a TV a telephone and a games machine, not just a textbook.\" Mr Negroponte wants the laptops to become more common than mobile phones but conceded this was ambitious. \"Nokia make 200 million cell phones a year, so for us to claim we're going to make 200 million laptops is a big number, but we're not talking about doing it in three or five years, we're talking about months.\" He plans to be distributing them by the end of 2006 and is already in discussion with the Chinese education ministry who are expected to make a large order. \"In China they spend $17 per child per year on textbooks. That's for five or six years, so if we can distribute and sell laptops in quantities of one million or more to ministries of education that's cheaper and the marketing overheads go away.\"\n");
        items.add("Technology gets the creative bug\n" +
                "\n" +
                "The hi-tech and the arts worlds have for some time danced around each other and offered creative and technical help when required.\n" +
                "\n" +
                "Often this help has come in the form of corporate art sponsorship or infrastructure provision. But that dance is growing more intimate as hi-tech firms look to the creative industries for inspiration. And vice versa. UK telco BT is serious about the idea and has launched its Connected World initiative. The idea, says BT, is to shape a \"21st Century model\" which will help cement the art, technology, and business worlds together. \"We are hoping to understand the creative industry that has a natural thirst for broadband technology,\" said Frank Stone, head of the BT's business sector programmes. He looks after several \"centres of excellence\" which the telco has set up with other institutions and organisations, one of which is focused on creative industries.\n" +
                "\n" +
                "To mark the initiative's launch, a major international art installation is to open on 15 April in Brussels, with a further exhibit in Madrid later in the summer. They have both been created using the telco's technology that it has been incubating at its research and development arm, including a sophisticated graphics rendering program. Using a 3D graphics engine, the type commonly used in gaming, Bafta-winning artists Langlands & Bell have created a virtual, story-based, 3D model of Brussels' Coudenberg Cellars.\n" +
                "\n" +
                "They have recently been excavated and are thought to be the remnants of Coudenberg Palace, an historical seat of European power. The 3D world can be navigated using a joystick and offers an immersive experience of a landscape that historically had a river running through it until it was bricked up in the 19th Century. \"The river was integral to the city's survival for hundreds of years and it was equally essential to the city that it disappeared,\" said the artists. \"We hope that by uncovering the river, we can greater understand the connections between the past and the present, and appreciate the flow of modernity, once concealing, but now revealing the River Senne.\" In their previous works they used the Quake game graphics engine. The game engine is the core component of a video game because it handles graphics rendering, game AI, and how objects behave and relate to each other in a game. They are so time-consuming and expensive to create, the engines can be licensed out to handle other graphics-intensive games. BT's own engine, Tara (Total Abstract Rendering Architecture) has been in development since 2001 and has been used to recreate virtual interactive models of buildings for planners. It was also used in 2003 in Encounter, an urban-based, pervasive game that combined both virtual play in conjunction with physical, on-the-street action. Because the artists wanted video and interactive elements in their worlds, new features were added to Tara in order to handle the complex data sets. But collaboration between art and digital technology is by no means new, and many keen coders, designers, games makers and animators argue that what they create is art itself.\n" +
                "\n" +
                "As more tools for self-expression are given to the person on the street, enabling people to take photos with a phone and upload them to the web for instance, creativity will become an integral part of technology. The Orange Expressionist exhibition last year, for example, displayed thousands of picture messages from people all over the UK to create an interactive installation.\n" +
                "\n" +
                "Technology as a way of unleashing creativity has massive potential, not least because it gives people something to do with their technology. Big businesses know it is good for them to get in on the creative vein too. The art world is \"fantastically rich\", said Mr Stone, with creative people and ideas which means traditional companies like BT want to get in with them. Between 1997 and 2002, the creative industry brought £21 billion to London alone. It is an industry that is growing by 6% a year too. The partnership between artists and technologists is part of trying to understand the creative potential of technologies like broadband net, according to Mr Stone. \"This is not just about putting art galleries and museums online,\" he said. \"It is about how can everyone have the best seat in house and asking if technology has a role in solving that problem.\" With broadband penetration reaching 100% in the UK, businesses with a stake in the technology want to give people reasons to want and use it. The creative drive is not purely altruistic obviously. It is about both industries borrowing strategies and creative ideas together which can result in better business practices for creative industries, or more patent ideas for tech companies. \"What we are trying to do is have outside-in thinking. \"We are creating a future cultural drive for the economy,\" said Mr Stone.\n");
        items.add("Wi-fi web reaches farmers in Peru\n" +
                "\n" +
                "A network of community computer centres, linked by wireless technology, is providing a helping hand for poor farmers in Peru.\n" +
                "\n" +
                "The pilot scheme in the Huaral Valley, 80 kilometres north of the capital Lima, aims to offer the 6,000-strong community up-to-date information on agricultural market prices and trends. The Agricultural Information Project for Farmers of the Chancay-Huaral Valley also provides vital links between local organisations in charge of water irrigation, enabling them to coordinate their actions. More than 13,000 rural inhabitants, as well as 18,000 students in the region, will also benefit from the telecoms infrastructure.\n" +
                "\n" +
                "The 14 telecentres uses only free open source software and affordable computer equipment. The network has been three years in the making and was officially inaugurated in September.\n" +
                "\n" +
                "The non-government organisation, Cepes (Peruvian Centre for Social Studies) led the $200,000 project, also backed by local institutions, the Education and Agriculture ministries, and European development organisations. \"The plan includes training on computers and internet skills for both operators and users of the system,\" said Carlos Saldarriaga, technical coordinator at Cepes. Farmers are also taking extra lessons on how to apply the new information to make the most of their plots of land. The Board of Irrigation Users which runs the computer centres, aims to make the network self-sustainable within three years, through the cash generated by using the telecentres as internet cafes.\n" +
                "\n" +
                "One of the key elements of the project is the Agricultural Information System, with its flagship huaral.org website. There, farmers can find the prices for local produce, as well as information on topics ranging from plague prevention to the latest farming techniques. The system also helps the inhabitants of the Chancay-Huaral Valley to organise their vital irrigation systems. \"Water is the main element that unites them all. It is a precious element in Peru's coastal areas, because it is so scarce, and therefore it is necessary to have proper irrigation systems to make the most of it,\" Mr Saldarriaga told the BBC News website. The information network also allows farmers to look beyond their own region, and share experiences with other colleagues from the rest of Peru and even around the world.\n" +
                "\n" +
                "Cepes says the involvement of the farmers has been key in the project's success. \"Throughout the last three years, the people have provided a vital thrust to the project; they feel it belongs to them,\" said Mr Saldarriaga. The community training sessions, attended by an equal number of men and women, have been the perfect showcase for their enthusiasm. \"We have had an excellent response, mainly from young people. But we have also had a great feedback when we trained 40 or 50-year old women, who were seeing a computer for the first time in their lives.\" So far, the Huaral programme promoters say the experience has been very positive, and are already planning on spreading the model among other farmers' organisations in Peru. \"This is a pilot project, and we have been very keen on its cloning potential in other places,\" underlined Mr Saldarriaga.\n" +
                "\n" +
                "The Cepes researcher recalls what happened in Cuyo, a 50-family community with no electricity, during the construction of the local telecentre site. There it was necessary to build a mini-hydraulic dam in order to generate 2kW worth of power for the computers, the communications equipment and the cabin lights. \"It was already dark when the technicians realised they didn't have any light bulbs to test the generator, so they turned up to the local store to buy light bulbs,\" recalls Carlos Saldarriaga. \"The logical answer was 'we don't sell any', so they had to wait until the next morning to do the testing.\" Now, with the wireless network, Cuyo as well as the other communities is no longer isolated.\n");

        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        cardadapter = new CardAdapter(view.getContext(), items);
        recyclerView.setAdapter(cardadapter);

        return view;
    }
}