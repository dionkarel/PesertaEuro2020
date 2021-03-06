package com.dicoding.pesertaeuro2020

object DataPeserta {
    private val groupA = arrayOf(
        "Italia",
        "Wales",
        "Swiss",
        "Turki"
    )

    private val groupB = arrayOf(
        "Belgia",
        "Denmark",
        "Finlandia",
        "Rusia"
    )

    private val groupC = arrayOf(
        "Belanda",
        "Austria",
        "Ukraina",
        "Makedonia Utara"
    )

    private val groupD = arrayOf(
        "Inggris",
        "Kroasia",
        "Ceko",
        "Skotlandia"
    )

    private val groupE = arrayOf(
        "Swedia",
        "Spanyol",
        "Slowakia",
        "Polandia"
    )

    private val groupF = arrayOf(
        "Perancis",
        "Jerman",
        "Portugal",
        "Hongaria"
    )

    private val dataA = arrayOf(
        "Roberto Mancini",
        "Ryan Giggs",
        "Vladimir Petkovic",
        "Senol Gunes"
    )

    private val dataB = arrayOf(
        "Roberto Martinez",
        "Kasper Hjulmand",
        "Markku Kanerva",
        "Stanislav Cherchesov"
    )

    private val dataC = arrayOf(
        "Frank de Boer",
        "Franco Foda",
        "Andriy Shevchenko",
        "Igor Angelovski"
    )

    private val dataD = arrayOf(
        "Zlatko Dalic",
        "Gareth Southgate",
        "Jaroslav Silhavy",
        "Steve Clarke"
    )

    private val dataE = arrayOf(
        "Janne Andersson",
        "Luis Enrique",
        "Stefan Tarkovi",
        "Paulo Sousa"
    )

    private val dataF = arrayOf(
        "Didier Deschamps",
        "Joachim Low",
        "Fernando Santos",
        "Marco Rossi"
    )

    private val pemainA = arrayOf(
        "Kiper :\n" +
                "Gianluigi Donnarumma (Milan), Alex Meret (Napoli), Salvatore Sirigu (Torino)\n" +
                "\n" +
                "Bek  :\n" +
                "Francesco Acerbi (Lazio), Alessandro Bastoni (Inter), Leonardo Bonucci (Juventus), Giorgio Chiellini (Juventus), Giovanni Di Lorenzo (Napoli), Emerson Palmieri (Chelsea), Alessandro Florenzi (PSG), Leonardo Spinazzola (Roma), Rafael Toloi (Atalanta)\n" +
                "\n" +
                "Gelandang :\n" +
                "Nicol?? Barella (Inter), Bryan Cristante (Roma), Jorginho (Chelsea), Manuel Locatelli (Sassuolo), Lorenzo Pellegrini (Roma), Stefano Sensi (Inter), Marco Verratti (PSG)\n" +
                "\n" +
                "Penyerang  :\n" +
                "Andrea Belotti (Torino), Domenico Bernardi (Sassuolo), Federico Bernardeschi (Juventus), Federico Chiesa (Juventus), Ciro Immobile (Lazio), Lorenzo Insigne (Napoli), Giacomo Raspadori (Sassuolo)\n",
        "Kiper :\n" +
                "Wayne Hennessey (Crystal Palace), Danny Ward (Leicester City), Adam Davies (Stoke City)\n" +
                "\n" +
                "Bek :\n" +
                "Ben Davies (Tottenham), Joe Rodon (Tottenham), Chris Mepham (Bournemouth), Chris Gunter (Charlton Athletic), Rhys Norrington-Davies (Sheffield United), Neco Williams (Liverpool), Connor Roberts (Swansea City), Ben Cabango (Swansea City), Tom Lockyer (Luton Town)\n" +
                "\n" +
                "Gelandang :\n" +
                "Joe Allen (Stoke City), Joe Morrell (Luton Town), Ethan Ampadu (Chelsea), Matthew Smith (Manchester City), Jonny Williams (Cardiff City), Aaron Ramsey (Juventus), Dylan Levitt (Manchester United), Rubin Colwill (Cardiff City), David Brooks (Bournemouth), Harry Wilson (Liverpool)\n" +
                "\n" +
                "Penyerang :\n" +
                "Kieffer Moore (Cardiff City), Gareth Bale (Real Madrid), Tyler Roberts (Leeds United), Daniel James (Manchester United)\n\n",
        "Kiper :\n" +
                "Yann Sommer (M??nchengladbach), Yvon Mvogo (PSV), Jonas Omlin (Montpellier)\n" +
                "\n" +
                "Bek :\n" +
                "Manuel Akanji (Dortmund), Loris Benito (Bordeaux), Eray C??mert (Basel), Nico Elvedi (M??nchengladbach), Jordan Lotomba (Nice), Kevin Mbabu (Wolfsburg), Becir Omeragic (Z??rich), Ricardo Rodr??guez (Torino), Fabian Sch??r (Newcastle United), Silvan Widmer (Basel)\n" +
                "\n" +
                "Gelandang :\n" +
                "Christian Fassnacht (Young Boys), Edimilson Fernandes (Mainz), Remo Freuler (Atalanta), Admir Mehmedi (Wolfsburg), Xherdan Shaqiri (Liverpool), Djibril Sow (Frankfurt), Ruben Vargas (Augsburg), Granit Xhaka (Arsenal), Denis Zakaria (M??nchengladbach), Steven Zuber (Frankfurt)\n" +
                "\n" +
                "Penyerang :\n" +
                "Breel Embolo (M??nchengladbach), Mario Gavranovi?? (Dinamo Zagreb), Haris Seferovi?? (Benfica)\n",
        "Kiper :\n" +
                "Altay Bay??nd??r (Fenerbah??e), Mert G??nok (??stanbul Ba??ak??ehir), U??urcan ??ak??r (Trabzonspor)\n" +
                "Bek : Zeki ??elik (LOSC Lille), ??a??lar S??y??nc?? (Leicester), Kaan Ayhan (Sassuolo), Merih Demiral (Juventus), Mert M??ld??r (Sassuolo), Ozan Kabak (Liverpool), R??dvan Y??lmaz (Be??ikta??), Umut Mera?? (Le Havre)\n" +
                "\n" +
                "Gelandang :\n" +
                "Yusuf Yaz??c?? (LOSC Lille), Dorukhan Tok??z (Be??ikta??), ??rfan Can Kahveci (Fenerbah??e), Okay Yoku??lu (West Brom), Orkun K??k???? (Feyenoord), Ozan Tufan (Fenerbah??e), Taylan Antalyal?? (Galatasaray), Hakan ??alhano??lu (AC Milan)\n" +
                "\n" +
                "Penyerang :\n" +
                "Burak Y??lmaz (LOSC Lille), Cengiz ??nder (Leicester), Enes ??nal (Getafe), Abd??lkadir ??m??r (Trabzonspor), Kerem Akt??rko??lu (Galatasaray), Halil ??brahim Dervi??o??lu (Brentford), Kenan Karaman (Fortuna D??sseldorf)\n"
    )
    private val pemainB = arrayOf(
        "Kiper :\n" +
                "Thibaut Courtois (Real Madrid), Simon Mignolet (Club Brugge), Matz Sels (Strasbourg)\n" +
                "\n" +
                "Bek :\n" +
                "Toby Alderweireld (Tottenham), Dedryck Boyata (Hertha Berlin), Timothy Castagne (Leicester), Jason Denayer (Lyon), Thomas Meunier (Dortmund), Thomas Vermaelen (Vissel Kobe), Jan Vertonghen (Benfica)\n" +
                "\n" +
                "Gelandang :\n" +
                "Nacer Chadli (??stanbul Ba??ak??ehir), Yannick Carrasco (Atl??tico Madrid), Kevin De Bruyne (Manchester City), Leander Dendoncker (Wolves), Eden Hazard (Real Madrid), Thorgan Hazard (Dortmund), Dennis Praet (Leicester), Youri Tielemans (Leicester), Hans Vanaken (Club Brugge), Axel Witsel (Dortmund)\n" +
                "\n" +
                "Penyerang :\n" +
                "Michy Batshuayi (Crystal Palace), Christian Benteke (Crystal Palace), Jeremy Doku (Rennes), Romelu Lukaku (Inter Milan), Dries Mertens (Napoli), Leandro Trossard (Brighton)\n",
        "Kiper :\n" +
                "Kasper Schmeichel (Leicester), Jonas L??ssl (Midtjylland), Frederik R??nnow (Schalke)\n" +
                "\n" +
                "Bek :\n" +
                "Jens Stryger Larsen (Udinese), Simon Kj??r (AC Milan), Andreas Christensen (Chelsea), Joachim Andersen (Fulham), Daniel Wass (Valencia), Mathias J??rgensen (Copenhagen), Joakim M??hle (Atalanta), Jannik Vestergaard (Southampton), Nicolai Boilesen (Copenhagen)\n" +
                "\n" +
                "Gelandang :\n" +
                "Mathias Jensen (Brentford), Christian N??rgaard (Brentford), Pierre-Emile H??jbjerg (Tottenham), Thomas Delaney (Dortmund), Anders Christiansen (Malm??), Christian Eriksen (Inter Milan), Mikkel Damsgaard (Sampdoria), Robert Skov (Hoffenheim)\n" +
                "\n" +
                "Penyerang :\n" +
                "Martin Braithwaite (Barcelona), Andreas Cornelius (Parma), Andreas Skov Olsen (Bologna), Yussuf Poulsen (Leipzig), Kasper Dolberg (Nice), Jonas Wind (Copenhagen)\n",
        "Kiper :\n" +
                "Lukas Hradecky (Leverkusen), Jesse Joronen (Brescia), Anssi Jaakkola (Bristol Rovers)\n" +
                "\n" +
                "Bek :\n" +
                "Paulus Arajuuri (Pafos), Daniel O???Shaugnessy (HJK Helsinki), Joona Toivio (H??cken), Leo V??is??nen (Elfsborg), Sauli V??is??nen (Chievo), Robert Ivanov (Warta Pozna??), Jere Uronen (Genk), Nikolai Alho (MTK Budapest), Jukka Raitala (Minnesota United), Pyry Soiri (Esbjerg)\n" +
                "\n" +
                "Gelandang : \n" +
                "Glen Kamara (Rangers), Robert Taylor (Brann), Robin Lod (Minnesota United), Joni Kauko (Esbjerg), Onni Valakari (Pafos), Rasmus Sch??ller (Djurg??rden), Thomas Lam (Zwolle), Tim Sparv (Larissa), Fredrik Jensen (Augsburg), Lassi Lappalainen (Montr??al)\n" +
                "\n" +
                "Penyerang :\n" +
                "Joel Pohjanpalo (Union Berlin), Marcus Forss (Brentford), Teemu Pukki (Norwich)\n",
        "Pelatih : Stanislav Cherchesov\n" +
                "Kiper : \n" +
                "Yuri Dyupin (Rubin), Matvei Safonov (Krasnodar), Anton Shunin (Dinamo Moskva)\n" +
                "\n" +
                "Bek :\n" +
                "Igor Diveev (CSKA Moskva), Georgi Dzhikiya (Spartak Moskva), Mario Fernandes (CSKA Moskva), Vyacheslav Karavaev (Zenit), Fedor Kudryashov (Antalyaspor), Andrei Semenov (Akhmat)\n" +
                "\n" +
                "Gelandang :\n" +
                "Dmitri Barinov (Lokomotiv Moskva), Denis Cheryshev (Valencia), Daniil Fomin (Dinamo Moskva), Aleksandr Golovin (Monaco), Daler Kuzyaev (Zenit), Andrei Mostovoy (Zenit), Maksim Mukhin (CSKA Moskva), Magomed Ozdoev (Zenit), Rifat Zhemaletdinov (Lokomotiv Moskva), Yuri Zhirkov (Zenit), Roman Zobnin (Spartak Moskva)\n" +
                "\n" +
                "Penyerang :\n" +
                "Artem Dzyuba (Zenit), Aleksei Ionov (Krasnodar), Denis Makarov (Rubin), Aleksei Miranchuk (Atalanta), Aleksandr Sobolev (Spartak Moskva), Anton Zabolotny (CSKA Moskva)\n"
    )
    private val pemainC = arrayOf(
        "Kiper :\n" +
                "Marco Bizot (AZ), Tim Krul (Norwich), Maarten Stekelenburg (Ajax)\n" +
                "\n" +
                "Bek :\n" +
                "Patrick van Aanholt (Crystal Palace), Nathan Ak?? (Manchester City), Daley Blind (Ajax), Denzel Dumfries (PSV), Matthijs de Ligt (Juventus), Jurri??n Timber (Ajax), Jo??l Veltman (Brighton), Stefan de Vrij (Inter Milan), Owen Wijndal (AZ)\n" +
                "\n" +
                "Gelandang :\n" +
                "Donny van de Beek (Manchester United), Ryan Gravenberch (Ajax), Frenkie de Jong (Barcelona), Davy Klaassen (Ajax), Teun Koopmeiners (AZ), Marten de Roon (Atalanta), Georginio Wijnaldum (Liverpool)\n" +
                "\n" +
                "Penyerang :\n" +
                "Steven Berghuis (Feyenoord), Cody Gakpo (PSV), Luuk de Jong (Sevilla), Donyell Malen (PSV Eindhoven), Memphis Depay (Lyon), Quincy Promes (Spartak Moskva), Wout Weghorst (Wolfsburg)\n",
        "Pelatih : Franco Foda\n" +
                "Kiper :\n" +
                "Daniel Bachmann (Watford), Pavao Pervan (Wolfsburg), Alexander Schlager (LASK)\n" +
                "\n" +
                "Bek :\n" +
                "David Alaba (Bayern), Aleksandar Dragovi?? (Leverkusen), Marco Friedl (Werder Bremen), Martin Hinteregger (Frankfurt), Stefan Lainer (M??nchengladbach), Philipp Lienhart (Freiburg), Stefan Posch (Hoffenheim), Christopher Trimmel (Union Berlin), Andreas Ulmer (Salzburg)\n" +
                "\n" +
                "Gelandang :\n" +
                "Julian Baumgartlinger (Leverkusen), Christoph Baumgartner (Hoffenheim), Florian Grillitsch (Hoffenheim), Stefan Ilsanker (Frankfurt), Konrad Laimer (Leipzig), Valentino Lazaro (Internazionale), Marcel Sabitzer (Leipzig), Louis Schaub (Luzern), Xaver Schlager (Wolfsburg), Alessandro Sch??pf (Schalke)\n" +
                "\n" +
                "Penyerang :\n" +
                "Marko Arnautovi?? (Shanghai Port), Michael Gregoritsch (Augsburg), Sasa Kalajdzic (Stuttgart), Karim Onisiwo (Mainz)\n",
        "Kiper :\n" +
                "Georgiy Bushchan (Dynamo Kyiv), Andriy Pyatov (Shakhtar Donetsk), Anatolii Trubin (Shakhtar Donetsk)\n" +
                "\n" +
                "Bek :\n" +
                "Eduard Sobol (Club Brugge), Illia Zabarnyi (Dynamo Kyiv), Serhiy Kryvtsov (Shakhtar Donetsk), Denys Popov (Dynamo Kyiv), Oleksandr Tymchyk (Dynamo Kyiv), Vitaliy Mykolenko (Dynamo Kyiv), Oleksandr Karavaev (Dynamo Kyiv), Mykola Matviyenko (Shakhtar Donetsk)\n" +
                "\n" +
                "Gelandang :\n" +
                "Serhiy Sydorchuk (Dynamo Kyiv), Ruslan Malinovskyi (Atalanta), Mykola Shaparenko (Dynamo Kyiv), Marlos (Shakhtar Donetsk), Yevhen Makarenko (Kortrijk), Oleksandr Zinchenko (Manchester City), Viktor Tsygankov (Dynamo Kyiv), Taras Stepanenko (Shakhtar Donetsk), Andriy Yarmolenko (West Ham), Oleksandr Zubkov (Ferencv??ros), Heorhii Sudakov (Shakhtar Donetsk), Roman Bezus (Gent)\n" +
                "\n" +
                "Penyerang :\n" +
                "Roman Yaremchuk (Gent), Artem Besedin (Dynamo Kyiv), Artem Dovbyk (Dnipro-1)\n",
        "Kiper :\n" +
                "Stole Dimitrievski (Rayo Vallecano), Damjan Siskovski (Doxa Katokopia), Riste Jankov (Rabotnicki)\n" +
                "\n" +
                "Bek :\n" +
                "Stefan Ristovski (Dinamo Zagreb), Visar Musliu (Feh??rv??r), Egzon Bejtulai (Shk??ndija), Kire Ristevski (??jpest), Gjoko Zajkov (Charleroi), Darko Velkovski (Rijeka), Ezdzan Alioski (Leeds)\n" +
                "\n" +
                "Gelandang :\n" +
                "Arijan Ademi (Dinamo Zagreb), Enis Bardhi (Levante), Stefan Spirovski (AEK Larnaca), Boban Nikolov (Lecce), Tihomir Kostadinov (Ru??omberok), Ferhan Hasani (Partizani), Eljif Elmas (Napoli), Daniel Avramovski (Kayserispor), Darko Curlinov (Stuttgart), Marjan Radeski (Akademija Pandev)\n" +
                "\n" +
                "Penyerang :\n" +
                "Goran Pandev (Genoa), Aleksandar Trajkovski (Mallorca), Ivan Trickovski (AEK Larnaca), Vlatko Stojanovski (Chambly), Krste Velkovski (Sarajevo), Milan Ristovski (Spartak Trnava)\n"
    )
    private val pemainD = arrayOf(
        "Kiper :\n" +
                "Dean Henderson (Manchester United), Sam Johnstone (West Bromwich Albion), Jordan Pickford (Everton)\n" +
                "\n" +
                "Bek :\n" +
                "Ben Chilwell (Chelsea), Conor Coady (Wolves), Reece James (Chelsea), Harry Maguire (Manchester United), Tyrone Mings (Aston Villa), Luke Shaw (Manchester United), John Stones (Manchester City), Kieran Trippier (Atl??tico), Kyle Walker (Manchester City)\n" +
                "\n" +
                "Gelandang :\n" +
                "Jude Bellingham (Dortmund), Jordan Henderson (Liverpool), Mason Mount (Chelsea), Kalvin Phillips (Leeds United), Declan Rice (West Ham)\n" +
                "\n" +
                "Penyerang :\n" +
                "Dominic Calvert-Lewin (Everton), Phil Foden (Manchester City), Jack Grealish (Aston Villa), Harry Kane (Tottenham), Marcus Rashford (Manchester United), Bukayo Saka (Arsenal), Jadon Sancho (Dortmund), Raheem Sterling (Manchester City)\n",
        "Kiper :\n" +
                "Dominik Livakovi?? (Dinamo Zagreb), Lovre Kalini?? (Hajduk Split), Simon Sluga (Luton)\n" +
                "\n" +
                "Bek :\n" +
                "??ime Vrsaljko (Atl??tico Madrid), Borna Bari??i?? (Rangers), Duje ??aleta-Car (Marseille), Dejan Lovren (Zenit), Josip Juranovi?? (Legia Warszawa), Domagoj Vida (Be??ikta??), Jo??ko Gvardiol (Leipzig), Domagoj Bradari?? (LOSC Lille), Mile ??kori?? (Osijek)\n" +
                "\n" +
                "Gelandang :\n" +
                "Mateo Kova??i?? (Chelsea), Luka Modri?? (Real Madrid), Marcelo Brozovi?? (Inter Milan), Milan Badelj (Genoa), Nikola Vla??i?? (CSKA Moskva), Mario Pa??ali?? (Atalanta), Ivan Peri??i?? (Inter Milan), Josip Brekalo (Wolfsburg), Mislav Or??i?? (Dinamo Zagreb), Luka Ivanu??ec (Dinamo Zagreb)\n" +
                "\n" +
                "Penyerang :\n" +
                "Ante Rebi?? (AC Milan), Bruno Petkovi?? (Dinamo Zagreb), Ante Budimir (Osasuna), Andrej Kramari?? (Hoffenheim)\n",
        "Kiper :\n" +
                "Tom???? Vacl??k (Sevilla), Ji???? Pavlenka (Werder Bremen), Ale?? Mandous (Olomouc)\n" +
                "\n" +
                "Bek :\n" +
                "Vladim??r Coufal (West Ham), Pavel Kade????bek (Hoffenheim), Ond??ej ??el??stka (Sparta Praha), Tom???? Kalas (Bristol City), David Zima (Slavia Praha), Jan Bo??il (Slavia Praha), Ale?? Mat??j?? (Brescia), Jakub Brabec (Viktoria Plze??)\n" +
                "\n" +
                "Gelandang :\n" +
                "Luk???? Masopust (Slavia Praha), Vladim??r Darida (Hertha Berlin), Tom???? Sou??ek (West Ham), Anton??n Bar??k (Verona), Alex Kr??l (Spartak Moskva), Tom???? Hole?? (Slavia Praha), Petr ??ev????k (Slavia Praha), Jakub Jankto (Sampdoria), Adam Hlo??ek (Sparta Praha), Jakub Pe??ek (Liberec), Michal Sad??lek (Liberec)\n" +
                "\n" +
                "Penyerang :\n" +
                "Patrik Schick (Leverkusen), Michael Krmen????k (PAOK), Mat??j Vydra (Burnley), Tom???? Pekhart (Legia)\n",
        "Kiper :\n" +
                "Craig Gordon (Heart of Midlothian), David Marshall (Derby), Jon McLaughlin (Rangers)\n" +
                "\n" +
                "Bek :\n" +
                "Liam Cooper (Leeds), Declan Gallagher (Motherwell), Grant Hanley (Norwich), Jack Hendry (Celtic), Scott McKenna (Nottingham Forest), Stephen O'Donnell (Motherwell), Nathan Patterson (Rangers), Andy Robertson (Liverpool), Greg Taylor (Celtic), Kieran Tierney (Arsenal)\n" +
                "\n" +
                "Gelandang :\n" +
                "Stuart Armstrong (Southampton), Ryan Christie (Celtic), John Fleck (Sheffield United), Billy Gilmour (Chelsea), John McGinn (Aston Villa), Callum McGregor (Celtic), Scott McTominay (Manchester United), David Turnbull (Celtic)\n" +
                "\n" +
                "Penyerang :\n" +
                "Ch?? Adams (Southampton), Lyndon Dykes (QPR), James Forrest (Celtic), Ryan Fraser (Newcastle United), Kevin Nisbet (Hibernian)\n"
    )
    private val pemainE = arrayOf(
        "Kiper :\n" +
                "Karl-Johan Johnsson (K??benhavn), Kristoffer Nordfeldt (Gen??lerbirli??i), Robin Olsen (Everton)\n" +
                "\n" +
                "Bek :\n" +
                "Emil Krafth (Newcastle United), Victor Lindel??f (Manchester United), Marcus Danielson (Dalian Yifang), Pierre Bengtsson (Vejle), Ludwig Augustinsson (Werder Bremen), Pontus Jansson (Brentford), Filip Helander (Rangers), Mikael Lustig (AIK), Andreas Granqvist (Helsingborg)\n" +
                "\n" +
                "Gelandang :\n" +
                "Emil Forsberg (Leipzig), Ken Sema (Watford), Viktor Claesson (Krasnodar), Dejan Kulusevski (Juventus), Sebastian Larsson (AIK), Albin Ekdal (Sampdoria), Kristoffer Olsson (Krasnodar), Jens-Lys Cajuste (Midtjylland), Mattias Svanberg (Bologna), Gustav Svensson (Guangzhou)\n" +
                "\n" +
                "Penyerang :\n" +
                "Marcus Berg (Krasnodar), Alexander Isak (Real Sociedad), Robin Quaison (Mainz), Jordan Larsson (Spartak Moskva)\n",
        "Kiper :\n" +
                "David de Gea (Manchester United), Unai Sim??n (Athletic), Robert S??nchez (Brighton & Hove Albion)\n" +
                "\n" +
                "Bek :\n" +
                "Jos?? Gay?? (Valencia), Jordi Alba (Barcelona), Pau Torres (Villarreal), Aymeric Laporte (Manchester City), Eric Garc??a (Manchester City), Diego Llorente (Leeds United), C??sar Azpilicueta (Chelsea), Marcos Llorente (Atl??tico)\n" +
                "\n" +
                "Gelandang :\n" +
                "Sergio Busquets (Barcelona), Rodri Hern??ndez (Manchester City), Pedri (Barcelona), Thiago Alc??ntara (Liverpool), Koke (Atl??tico), Fabi??n Ruiz (Napoli)\n" +
                "\n" +
                "Penyerang :\n" +
                "Dani Olmo (Leipzig), Mikel Oyarzabal (Real Sociedad), Gerard Moreno (Villarreal), ??lvaro Morata (Juventus), Ferran Torres (Manchester City), Adama Traor?? (Wolves), Pablo Sarabia (PSG)\n",
        "Kiper :\n" +
                "Martin D??bravka (Newcastle), Du??an Kuciak (Lechia Gda??sk), Marek Rod??k (Fulham)\n" +
                "\n" +
                "Bek :\n" +
                "D??vid Hancko (Sparta Praha), Tom???? Hubo??an (Omonoia), Martin Kosceln??k (Liberec), Peter Pekar??k (Hertha Berlin), ??ubom??r ??atka (Lech Pozna??), Milan ??kriniar (Inter Milan), Martin Valjent (Mallorca), Denis Vavro (Huesca)\n" +
                "\n" +
                "Gelandang :\n" +
                "L??szl?? B??nes (Augsburg), Ondrej Duda (K??ln), J??n Gregu?? (Minnesota), Marek Ham????k (IFK G??teborg), Luk???? Harasl??n (Sassuolo), Jakub Hromada (Slavia Praha), Patrik Hro??ovsk?? (Genk), Juraj Kucka (Parma), Stanislav Lobotka (Napoli), Tom???? Suslov (Groningen), Vladim??r Weiss (Slovan Bratislava)\n" +
                "\n" +
                "Penyerang :\n" +
                "R??bert Bo??en??k (Feyenoord), Michal ??uri?? (Omonoia), R??bert Mak (Ferencv??ros), Ivan Schranz (Jablonec)\n",
        "Kiper :\n" +
                "??ukasz Fabia??ski (West Ham), ??ukasz Skorupski (Bologna), Wojciech Szcz??sny (Juventus)\n" +
                "\n" +
                "Bek :\n" +
                "Jan Bednarek (Southampton), Bartosz Bereszy??ski (Sampdoria), Kamil Glik (Benevento), Micha?? Helik (Barnsley), Tomasz K??dziora (Dynamo Kyiv), Kamil Pi??tkowski (Rak??w Cz??stochowa), Tymoteusz Puchacz (Lech Pozna??), Maciej Rybus (Lokomotiv Moskva)\n" +
                "\n" +
                "Gelandang :\n" +
                "Pawe?? Dawidowicz (Verona), Przemys??aw Frankowski (Chicago Fire), Kamil J????wiak (Derby), Mateusz Klich (Leeds), Kacper Koz??owski (Pogo?? Szczecin), Grzegorz Krychowiak (Lokomotiv Moskva), Karol Linetty (Torino), Jakub Moder (Brighton), Przemys??aw P??acheta (Norwich), Piotr Zieli??ski (Napoli)\n" +
                "\n" +
                "Penyerang :\n" +
                "Dawid Kownacki (Fortuna D??sseldorf), Robert Lewandowski (Bayern), Arkadiusz Milik (Marseille), Karol ??widerski (PAOK), Jakub ??wierczok (Piast Gliwice)\n"
    )
    private val pemainF = arrayOf(
        "Kiper :\n" +
                "Hugo Lloris (Tottenham), Steve Mandanda (Marseille), Mike Maignan (Milan)\n" +
                "\n" +
                "Bek :\n" +
                "Lucas Digne (Everton), L??o Dubois (Lyon), Lucas Hernandez (Bayern), Presnel Kimpembe (PSG), Jules Kound?? (Sevilla), Cl??ment Lenglet (Barcelona), Benjamin Pavard (Bayern), Rapha??l Varane (Real Madrid), Kurt Zouma (Chelsea)\n" +
                "\n" +
                "Gelandang :\n" +
                "N'Golo Kant?? (Chelsea), Thomas Lemar (Atl??tico Madrid), Paul Pogba (Manchester United), Adrien Rabiot (Juventus), Moussa Sissoko (Tottenham), Corentin Tolisso (Bayern)\n" +
                "\n" +
                "Penyerang :\n" +
                "Wissam Ben Yedder (Monaco), Karim Benzema (Real Madrid), Kingsley Coman (Bayern), Ousmane Demb??l?? (Barcelona), Olivier Giroud (Chelsea), Antoine Griezmann (Barcelona), Kylian Mbapp?? (PSG), Marcus Thuram (M??nchengladbach)\n",
        "Kiper :\n" +
                "Manuel Neuer (Bayern), Bernd Leno (A\trsenal), Kevin Trapp (Frankfurt)\n" +
                "\n" +
                "Bek :\n" +
                "Matthias Ginter (M??nchengladbach), Antonio R??diger (Chelsea), Robin Gosens (Atalanta), Christian G??nter (Freiburg), Marcel Halstenberg (Leipzig), Mats Hummels (Dortmund), Lukas Klostermann (Leipzig), Robin Koch (Leeds), Niklas S??le (Bayern)\n" +
                "\n" +
                "Gelandang :\n" +
                "??lkay G??ndo??an (Manchester City), Toni Kroos (Real Madrid), Emre Can (Dortmund), Joshua Kimmich (Bayern), Thomas M??ller (Bayern), Jamal Musiala (Bayern), Serge Gnabry (Bayern), Leon Goretzka (Bayern), Kai Havertz (Chelsea), Jonas Hofmann (M??nchengladbach), Leroy San?? (Bayern), Florian Neuhaus (M??nchengladbach)\n" +
                "\n" +
                "Penyerang :\n" +
                "Timo Werner (Chelsea), Kevin Volland (Monaco)\n",
        "Kiper :\n" +
                "Anthony Lopes (Lyon), Rui Patr??cio (Wolves), Rui Silva (Granada)\n" +
                "\n" +
                "Bek :\n" +
                "Jo??o Cancelo (Manchester City), N??lson Semedo (Wolves), Jos?? Fonte (LOSC Lille), Pepe (Porto), R??ben Dias (Manchester City), Nuno Mendes (Sporting CP), Raphael Guerreiro (Dortmund)\n" +
                "\n" +
                "Gelandang :\n" +
                "Danilo Pereira (PSG), Jo??o Palhinha (Sporting CP), R??ben Neves (Wolves), Bruno Fernandes (Manchester United), Jo??o Moutinho (Wolves), Renato Sanches (LOSC Lille), S??rgio Oliveira (Porto), William Carvalho (Real Betis)\n" +
                "\n" +
                "Penyerang :\n" +
                "Pedro Gon??alves (Sporting CP), Andr?? Silva (Eintracht Frankfurt), Bernardo Silva (Manchester City), Cristiano Ronaldo (Juventus), Diogo Jota (Liverpool), Gon??alo Guedes (Valencia), Jo??o F??lix (Atl??tico Madrid), Rafa Silva (Benfica)\n",
        "Kiper :\n" +
                "P??ter Gul??csi (Leipzig), D??nes Dibusz (Ferencv??ros), ??d??m Bogd??n (Ferencv??ros)\n" +
                "\n" +
                "Bek :\n" +
                "Gerg?? Lovrencsics (Ferencv??ros), Endre Botka (Ferencv??ros), ??d??m Lang (Omonia Nicosia), ??kos Kecsk??s (Lugano), Attila Fiola (Feh??rv??r), Willi Orb??n (Leipzig), Attila Szalai (Fenerbah??e), Bendeg??z Bolla (Feh??rv??r)\n" +
                "\n" +
                "Gelandang :\n" +
                "Lo??c N??go (Feh??rv??r), ??d??m Nagy (Bristol City), L??szl?? Kleinheisler (Osijek), D??vid Sig??r (Ferencv??ros), D??niel Gazdag (Philadelphia Union), Andr??s Sch??fer (Dunajsk?? Streda) Tam??s Cseri (Mez??k??vesd), Filip Holender (Partizan)\n" +
                "\n" +
                "Penyerang :\n" +
                "??d??m Szalai (Mainz), Roland Sallai (Freiburg), Nemanja Nikoli?? (Feh??rv??r), Kevin Varga (Kas??mpa??a), Roland Varga (MTK Budapest), Szabolcs Sch??n (FC Dallas), J??nos Hahn (Paks)\n"
    )

    private val fotoGroupA = intArrayOf(
        R.drawable.italia,
        R.drawable.wales,
        R.drawable.swiss,
        R.drawable.turki
    )

    private val fotoGroupB = intArrayOf(
        R.drawable.belgia,
        R.drawable.denmark,
        R.drawable.finlandia,
        R.drawable.rusia
    )

    private val fotoGroupC = intArrayOf(
        R.drawable.belanda,
        R.drawable.austria,
        R.drawable.ukraina,
        R.drawable.makedonia_utara
    )

    private val fotoGroupD = intArrayOf(
        R.drawable.inggris,
        R.drawable.kroasia,
        R.drawable.ceko,
        R.drawable.skotlandia
    )

    private val fotoGroupE = intArrayOf(
        R.drawable.swedia,
        R.drawable.spanyol,
        R.drawable.slowakia,
        R.drawable.polandia
    )

    private val fotoGroupF = intArrayOf(
        R.drawable.perancis,
        R.drawable.jerman,
        R.drawable.portugal,
        R.drawable.hongaria
    )

    val listDataA: ArrayList<PesertaA>
        get() {
            val listA = arrayListOf<PesertaA>()
            for (position in groupA.indices) {
                val peserta = PesertaA()
                peserta.nameA = groupA[position]
                peserta.detailA = dataA[position]
                peserta.fotoA = fotoGroupA[position]
                peserta.pemainA = pemainA[position]
                listA.add(peserta)
            }
            return listA
        }

    val listDataB: ArrayList<PesertaB>
        get() {
            val listB = arrayListOf<PesertaB>()
            for (position in groupB.indices) {
                val pesertaB = PesertaB()
                pesertaB.nameB = groupB[position]
                pesertaB.detailB = dataB[position]
                pesertaB.fotoB = fotoGroupB[position]
                pesertaB.pemainB = pemainB[position]
                listB.add(pesertaB)
            }
            return listB
        }

    val listDataC: ArrayList<PesertaC>
        get() {
            val listC = arrayListOf<PesertaC>()
            for (position in groupC.indices) {
                val pesertaC = PesertaC()
                pesertaC.nameC = groupC[position]
                pesertaC.detailC = dataC[position]
                pesertaC.fotoC = fotoGroupC[position]
                pesertaC.pemainC = pemainC[position]
                listC.add(pesertaC)
            }
            return listC
        }

    val listDataD: ArrayList<PesertaD>
        get() {
            val listD = arrayListOf<PesertaD>()
            for (position in groupD.indices) {
                val pesertaD = PesertaD()
                pesertaD.nameD = groupD[position]
                pesertaD.detailD = dataD[position]
                pesertaD.fotoD = fotoGroupD[position]
                pesertaD.pemainD = pemainD[position]
                listD.add(pesertaD)
            }
            return listD
        }

    val listDataE: ArrayList<PesertaE>
        get() {
            val listE = arrayListOf<PesertaE>()
            for (position in groupE.indices) {
                val pesertaE = PesertaE()
                pesertaE.nameE = groupE[position]
                pesertaE.detailE = dataE[position]
                pesertaE.fotoE = fotoGroupE[position]
                pesertaE.pemainE = pemainE[position]
                listE.add(pesertaE)
            }
            return listE
        }

    val listDataF: ArrayList<PesertaF>
        get() {
            val listF = arrayListOf<PesertaF>()
            for (position in groupF.indices) {
                val pesertaF = PesertaF()
                pesertaF.nameF = groupF[position]
                pesertaF.detailF = dataF[position]
                pesertaF.fotoF = fotoGroupF[position]
                pesertaF.pemainF = pemainF[position]
                listF.add(pesertaF)
            }
            return listF
        }
}
