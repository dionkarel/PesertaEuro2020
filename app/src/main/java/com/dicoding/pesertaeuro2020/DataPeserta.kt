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
                "Nicolò Barella (Inter), Bryan Cristante (Roma), Jorginho (Chelsea), Manuel Locatelli (Sassuolo), Lorenzo Pellegrini (Roma), Stefano Sensi (Inter), Marco Verratti (PSG)\n" +
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
                "Yann Sommer (Mönchengladbach), Yvon Mvogo (PSV), Jonas Omlin (Montpellier)\n" +
                "\n" +
                "Bek :\n" +
                "Manuel Akanji (Dortmund), Loris Benito (Bordeaux), Eray Cömert (Basel), Nico Elvedi (Mönchengladbach), Jordan Lotomba (Nice), Kevin Mbabu (Wolfsburg), Becir Omeragic (Zürich), Ricardo Rodríguez (Torino), Fabian Schär (Newcastle United), Silvan Widmer (Basel)\n" +
                "\n" +
                "Gelandang :\n" +
                "Christian Fassnacht (Young Boys), Edimilson Fernandes (Mainz), Remo Freuler (Atalanta), Admir Mehmedi (Wolfsburg), Xherdan Shaqiri (Liverpool), Djibril Sow (Frankfurt), Ruben Vargas (Augsburg), Granit Xhaka (Arsenal), Denis Zakaria (Mönchengladbach), Steven Zuber (Frankfurt)\n" +
                "\n" +
                "Penyerang :\n" +
                "Breel Embolo (Mönchengladbach), Mario Gavranović (Dinamo Zagreb), Haris Seferović (Benfica)\n",
        "Kiper :\n" +
                "Altay Bayındır (Fenerbahçe), Mert Günok (İstanbul Başakşehir), Uğurcan Çakır (Trabzonspor)\n" +
                "Bek : Zeki Çelik (LOSC Lille), Çağlar Söyüncü (Leicester), Kaan Ayhan (Sassuolo), Merih Demiral (Juventus), Mert Müldür (Sassuolo), Ozan Kabak (Liverpool), Rıdvan Yılmaz (Beşiktaş), Umut Meraş (Le Havre)\n" +
                "\n" +
                "Gelandang :\n" +
                "Yusuf Yazıcı (LOSC Lille), Dorukhan Toköz (Beşiktaş), İrfan Can Kahveci (Fenerbahçe), Okay Yokuşlu (West Brom), Orkun Kökçü (Feyenoord), Ozan Tufan (Fenerbahçe), Taylan Antalyalı (Galatasaray), Hakan Çalhanoğlu (AC Milan)\n" +
                "\n" +
                "Penyerang :\n" +
                "Burak Yılmaz (LOSC Lille), Cengiz Ünder (Leicester), Enes Ünal (Getafe), Abdülkadir Ömür (Trabzonspor), Kerem Aktürkoğlu (Galatasaray), Halil İbrahim Dervişoğlu (Brentford), Kenan Karaman (Fortuna Düsseldorf)\n"
    )
    private val pemainB = arrayOf(
        "Kiper :\n" +
                "Thibaut Courtois (Real Madrid), Simon Mignolet (Club Brugge), Matz Sels (Strasbourg)\n" +
                "\n" +
                "Bek :\n" +
                "Toby Alderweireld (Tottenham), Dedryck Boyata (Hertha Berlin), Timothy Castagne (Leicester), Jason Denayer (Lyon), Thomas Meunier (Dortmund), Thomas Vermaelen (Vissel Kobe), Jan Vertonghen (Benfica)\n" +
                "\n" +
                "Gelandang :\n" +
                "Nacer Chadli (İstanbul Başakşehir), Yannick Carrasco (Atlético Madrid), Kevin De Bruyne (Manchester City), Leander Dendoncker (Wolves), Eden Hazard (Real Madrid), Thorgan Hazard (Dortmund), Dennis Praet (Leicester), Youri Tielemans (Leicester), Hans Vanaken (Club Brugge), Axel Witsel (Dortmund)\n" +
                "\n" +
                "Penyerang :\n" +
                "Michy Batshuayi (Crystal Palace), Christian Benteke (Crystal Palace), Jeremy Doku (Rennes), Romelu Lukaku (Inter Milan), Dries Mertens (Napoli), Leandro Trossard (Brighton)\n",
        "Kiper :\n" +
                "Kasper Schmeichel (Leicester), Jonas Lössl (Midtjylland), Frederik Rønnow (Schalke)\n" +
                "\n" +
                "Bek :\n" +
                "Jens Stryger Larsen (Udinese), Simon Kjær (AC Milan), Andreas Christensen (Chelsea), Joachim Andersen (Fulham), Daniel Wass (Valencia), Mathias Jørgensen (Copenhagen), Joakim Mæhle (Atalanta), Jannik Vestergaard (Southampton), Nicolai Boilesen (Copenhagen)\n" +
                "\n" +
                "Gelandang :\n" +
                "Mathias Jensen (Brentford), Christian Nørgaard (Brentford), Pierre-Emile Højbjerg (Tottenham), Thomas Delaney (Dortmund), Anders Christiansen (Malmö), Christian Eriksen (Inter Milan), Mikkel Damsgaard (Sampdoria), Robert Skov (Hoffenheim)\n" +
                "\n" +
                "Penyerang :\n" +
                "Martin Braithwaite (Barcelona), Andreas Cornelius (Parma), Andreas Skov Olsen (Bologna), Yussuf Poulsen (Leipzig), Kasper Dolberg (Nice), Jonas Wind (Copenhagen)\n",
        "Kiper :\n" +
                "Lukas Hradecky (Leverkusen), Jesse Joronen (Brescia), Anssi Jaakkola (Bristol Rovers)\n" +
                "\n" +
                "Bek :\n" +
                "Paulus Arajuuri (Pafos), Daniel O’Shaugnessy (HJK Helsinki), Joona Toivio (Häcken), Leo Väisänen (Elfsborg), Sauli Väisänen (Chievo), Robert Ivanov (Warta Poznań), Jere Uronen (Genk), Nikolai Alho (MTK Budapest), Jukka Raitala (Minnesota United), Pyry Soiri (Esbjerg)\n" +
                "\n" +
                "Gelandang : \n" +
                "Glen Kamara (Rangers), Robert Taylor (Brann), Robin Lod (Minnesota United), Joni Kauko (Esbjerg), Onni Valakari (Pafos), Rasmus Schüller (Djurgården), Thomas Lam (Zwolle), Tim Sparv (Larissa), Fredrik Jensen (Augsburg), Lassi Lappalainen (Montréal)\n" +
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
                "Patrick van Aanholt (Crystal Palace), Nathan Aké (Manchester City), Daley Blind (Ajax), Denzel Dumfries (PSV), Matthijs de Ligt (Juventus), Jurriën Timber (Ajax), Joël Veltman (Brighton), Stefan de Vrij (Inter Milan), Owen Wijndal (AZ)\n" +
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
                "David Alaba (Bayern), Aleksandar Dragović (Leverkusen), Marco Friedl (Werder Bremen), Martin Hinteregger (Frankfurt), Stefan Lainer (Mönchengladbach), Philipp Lienhart (Freiburg), Stefan Posch (Hoffenheim), Christopher Trimmel (Union Berlin), Andreas Ulmer (Salzburg)\n" +
                "\n" +
                "Gelandang :\n" +
                "Julian Baumgartlinger (Leverkusen), Christoph Baumgartner (Hoffenheim), Florian Grillitsch (Hoffenheim), Stefan Ilsanker (Frankfurt), Konrad Laimer (Leipzig), Valentino Lazaro (Internazionale), Marcel Sabitzer (Leipzig), Louis Schaub (Luzern), Xaver Schlager (Wolfsburg), Alessandro Schöpf (Schalke)\n" +
                "\n" +
                "Penyerang :\n" +
                "Marko Arnautović (Shanghai Port), Michael Gregoritsch (Augsburg), Sasa Kalajdzic (Stuttgart), Karim Onisiwo (Mainz)\n",
        "Kiper :\n" +
                "Georgiy Bushchan (Dynamo Kyiv), Andriy Pyatov (Shakhtar Donetsk), Anatolii Trubin (Shakhtar Donetsk)\n" +
                "\n" +
                "Bek :\n" +
                "Eduard Sobol (Club Brugge), Illia Zabarnyi (Dynamo Kyiv), Serhiy Kryvtsov (Shakhtar Donetsk), Denys Popov (Dynamo Kyiv), Oleksandr Tymchyk (Dynamo Kyiv), Vitaliy Mykolenko (Dynamo Kyiv), Oleksandr Karavaev (Dynamo Kyiv), Mykola Matviyenko (Shakhtar Donetsk)\n" +
                "\n" +
                "Gelandang :\n" +
                "Serhiy Sydorchuk (Dynamo Kyiv), Ruslan Malinovskyi (Atalanta), Mykola Shaparenko (Dynamo Kyiv), Marlos (Shakhtar Donetsk), Yevhen Makarenko (Kortrijk), Oleksandr Zinchenko (Manchester City), Viktor Tsygankov (Dynamo Kyiv), Taras Stepanenko (Shakhtar Donetsk), Andriy Yarmolenko (West Ham), Oleksandr Zubkov (Ferencváros), Heorhii Sudakov (Shakhtar Donetsk), Roman Bezus (Gent)\n" +
                "\n" +
                "Penyerang :\n" +
                "Roman Yaremchuk (Gent), Artem Besedin (Dynamo Kyiv), Artem Dovbyk (Dnipro-1)\n",
        "Kiper :\n" +
                "Stole Dimitrievski (Rayo Vallecano), Damjan Siskovski (Doxa Katokopia), Riste Jankov (Rabotnicki)\n" +
                "\n" +
                "Bek :\n" +
                "Stefan Ristovski (Dinamo Zagreb), Visar Musliu (Fehérvár), Egzon Bejtulai (Shkëndija), Kire Ristevski (Újpest), Gjoko Zajkov (Charleroi), Darko Velkovski (Rijeka), Ezdzan Alioski (Leeds)\n" +
                "\n" +
                "Gelandang :\n" +
                "Arijan Ademi (Dinamo Zagreb), Enis Bardhi (Levante), Stefan Spirovski (AEK Larnaca), Boban Nikolov (Lecce), Tihomir Kostadinov (Ružomberok), Ferhan Hasani (Partizani), Eljif Elmas (Napoli), Daniel Avramovski (Kayserispor), Darko Curlinov (Stuttgart), Marjan Radeski (Akademija Pandev)\n" +
                "\n" +
                "Penyerang :\n" +
                "Goran Pandev (Genoa), Aleksandar Trajkovski (Mallorca), Ivan Trickovski (AEK Larnaca), Vlatko Stojanovski (Chambly), Krste Velkovski (Sarajevo), Milan Ristovski (Spartak Trnava)\n"
    )
    private val pemainD = arrayOf(
        "Kiper :\n" +
                "Dean Henderson (Manchester United), Sam Johnstone (West Bromwich Albion), Jordan Pickford (Everton)\n" +
                "\n" +
                "Bek :\n" +
                "Ben Chilwell (Chelsea), Conor Coady (Wolves), Reece James (Chelsea), Harry Maguire (Manchester United), Tyrone Mings (Aston Villa), Luke Shaw (Manchester United), John Stones (Manchester City), Kieran Trippier (Atlético), Kyle Walker (Manchester City)\n" +
                "\n" +
                "Gelandang :\n" +
                "Jude Bellingham (Dortmund), Jordan Henderson (Liverpool), Mason Mount (Chelsea), Kalvin Phillips (Leeds United), Declan Rice (West Ham)\n" +
                "\n" +
                "Penyerang :\n" +
                "Dominic Calvert-Lewin (Everton), Phil Foden (Manchester City), Jack Grealish (Aston Villa), Harry Kane (Tottenham), Marcus Rashford (Manchester United), Bukayo Saka (Arsenal), Jadon Sancho (Dortmund), Raheem Sterling (Manchester City)\n",
        "Kiper :\n" +
                "Dominik Livaković (Dinamo Zagreb), Lovre Kalinić (Hajduk Split), Simon Sluga (Luton)\n" +
                "\n" +
                "Bek :\n" +
                "Šime Vrsaljko (Atlético Madrid), Borna Barišić (Rangers), Duje Ćaleta-Car (Marseille), Dejan Lovren (Zenit), Josip Juranović (Legia Warszawa), Domagoj Vida (Beşiktaş), Joško Gvardiol (Leipzig), Domagoj Bradarić (LOSC Lille), Mile Škorić (Osijek)\n" +
                "\n" +
                "Gelandang :\n" +
                "Mateo Kovačić (Chelsea), Luka Modrić (Real Madrid), Marcelo Brozović (Inter Milan), Milan Badelj (Genoa), Nikola Vlašić (CSKA Moskva), Mario Pašalić (Atalanta), Ivan Perišić (Inter Milan), Josip Brekalo (Wolfsburg), Mislav Oršić (Dinamo Zagreb), Luka Ivanušec (Dinamo Zagreb)\n" +
                "\n" +
                "Penyerang :\n" +
                "Ante Rebić (AC Milan), Bruno Petković (Dinamo Zagreb), Ante Budimir (Osasuna), Andrej Kramarić (Hoffenheim)\n",
        "Kiper :\n" +
                "Tomáš Vaclík (Sevilla), Jiří Pavlenka (Werder Bremen), Aleš Mandous (Olomouc)\n" +
                "\n" +
                "Bek :\n" +
                "Vladimír Coufal (West Ham), Pavel Kadeřábek (Hoffenheim), Ondřej Čelůstka (Sparta Praha), Tomáš Kalas (Bristol City), David Zima (Slavia Praha), Jan Bořil (Slavia Praha), Aleš Matějů (Brescia), Jakub Brabec (Viktoria Plzeň)\n" +
                "\n" +
                "Gelandang :\n" +
                "Lukáš Masopust (Slavia Praha), Vladimír Darida (Hertha Berlin), Tomáš Souček (West Ham), Antonín Barák (Verona), Alex Král (Spartak Moskva), Tomáš Holeš (Slavia Praha), Petr Ševčík (Slavia Praha), Jakub Jankto (Sampdoria), Adam Hložek (Sparta Praha), Jakub Pešek (Liberec), Michal Sadílek (Liberec)\n" +
                "\n" +
                "Penyerang :\n" +
                "Patrik Schick (Leverkusen), Michael Krmenčík (PAOK), Matěj Vydra (Burnley), Tomáš Pekhart (Legia)\n",
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
                "Ché Adams (Southampton), Lyndon Dykes (QPR), James Forrest (Celtic), Ryan Fraser (Newcastle United), Kevin Nisbet (Hibernian)\n"
    )
    private val pemainE = arrayOf(
        "Kiper :\n" +
                "Karl-Johan Johnsson (København), Kristoffer Nordfeldt (Gençlerbirliği), Robin Olsen (Everton)\n" +
                "\n" +
                "Bek :\n" +
                "Emil Krafth (Newcastle United), Victor Lindelöf (Manchester United), Marcus Danielson (Dalian Yifang), Pierre Bengtsson (Vejle), Ludwig Augustinsson (Werder Bremen), Pontus Jansson (Brentford), Filip Helander (Rangers), Mikael Lustig (AIK), Andreas Granqvist (Helsingborg)\n" +
                "\n" +
                "Gelandang :\n" +
                "Emil Forsberg (Leipzig), Ken Sema (Watford), Viktor Claesson (Krasnodar), Dejan Kulusevski (Juventus), Sebastian Larsson (AIK), Albin Ekdal (Sampdoria), Kristoffer Olsson (Krasnodar), Jens-Lys Cajuste (Midtjylland), Mattias Svanberg (Bologna), Gustav Svensson (Guangzhou)\n" +
                "\n" +
                "Penyerang :\n" +
                "Marcus Berg (Krasnodar), Alexander Isak (Real Sociedad), Robin Quaison (Mainz), Jordan Larsson (Spartak Moskva)\n",
        "Kiper :\n" +
                "David de Gea (Manchester United), Unai Simón (Athletic), Robert Sánchez (Brighton & Hove Albion)\n" +
                "\n" +
                "Bek :\n" +
                "José Gayà (Valencia), Jordi Alba (Barcelona), Pau Torres (Villarreal), Aymeric Laporte (Manchester City), Eric García (Manchester City), Diego Llorente (Leeds United), César Azpilicueta (Chelsea), Marcos Llorente (Atlético)\n" +
                "\n" +
                "Gelandang :\n" +
                "Sergio Busquets (Barcelona), Rodri Hernández (Manchester City), Pedri (Barcelona), Thiago Alcántara (Liverpool), Koke (Atlético), Fabián Ruiz (Napoli)\n" +
                "\n" +
                "Penyerang :\n" +
                "Dani Olmo (Leipzig), Mikel Oyarzabal (Real Sociedad), Gerard Moreno (Villarreal), Álvaro Morata (Juventus), Ferran Torres (Manchester City), Adama Traoré (Wolves), Pablo Sarabia (PSG)\n",
        "Kiper :\n" +
                "Martin Dúbravka (Newcastle), Dušan Kuciak (Lechia Gdańsk), Marek Rodák (Fulham)\n" +
                "\n" +
                "Bek :\n" +
                "Dávid Hancko (Sparta Praha), Tomáš Hubočan (Omonoia), Martin Koscelník (Liberec), Peter Pekarík (Hertha Berlin), Ľubomír Šatka (Lech Poznań), Milan Škriniar (Inter Milan), Martin Valjent (Mallorca), Denis Vavro (Huesca)\n" +
                "\n" +
                "Gelandang :\n" +
                "László Bénes (Augsburg), Ondrej Duda (Köln), Ján Greguš (Minnesota), Marek Hamšík (IFK Göteborg), Lukáš Haraslín (Sassuolo), Jakub Hromada (Slavia Praha), Patrik Hrošovský (Genk), Juraj Kucka (Parma), Stanislav Lobotka (Napoli), Tomáš Suslov (Groningen), Vladimír Weiss (Slovan Bratislava)\n" +
                "\n" +
                "Penyerang :\n" +
                "Róbert Boženík (Feyenoord), Michal Ďuriš (Omonoia), Róbert Mak (Ferencváros), Ivan Schranz (Jablonec)\n",
        "Kiper :\n" +
                "Łukasz Fabiański (West Ham), Łukasz Skorupski (Bologna), Wojciech Szczęsny (Juventus)\n" +
                "\n" +
                "Bek :\n" +
                "Jan Bednarek (Southampton), Bartosz Bereszyński (Sampdoria), Kamil Glik (Benevento), Michał Helik (Barnsley), Tomasz Kędziora (Dynamo Kyiv), Kamil Piątkowski (Raków Częstochowa), Tymoteusz Puchacz (Lech Poznań), Maciej Rybus (Lokomotiv Moskva)\n" +
                "\n" +
                "Gelandang :\n" +
                "Paweł Dawidowicz (Verona), Przemysław Frankowski (Chicago Fire), Kamil Jóźwiak (Derby), Mateusz Klich (Leeds), Kacper Kozłowski (Pogoń Szczecin), Grzegorz Krychowiak (Lokomotiv Moskva), Karol Linetty (Torino), Jakub Moder (Brighton), Przemysław Płacheta (Norwich), Piotr Zieliński (Napoli)\n" +
                "\n" +
                "Penyerang :\n" +
                "Dawid Kownacki (Fortuna Düsseldorf), Robert Lewandowski (Bayern), Arkadiusz Milik (Marseille), Karol Świderski (PAOK), Jakub Świerczok (Piast Gliwice)\n"
    )
    private val pemainF = arrayOf(
        "Kiper :\n" +
                "Hugo Lloris (Tottenham), Steve Mandanda (Marseille), Mike Maignan (Milan)\n" +
                "\n" +
                "Bek :\n" +
                "Lucas Digne (Everton), Léo Dubois (Lyon), Lucas Hernandez (Bayern), Presnel Kimpembe (PSG), Jules Koundé (Sevilla), Clément Lenglet (Barcelona), Benjamin Pavard (Bayern), Raphaël Varane (Real Madrid), Kurt Zouma (Chelsea)\n" +
                "\n" +
                "Gelandang :\n" +
                "N'Golo Kanté (Chelsea), Thomas Lemar (Atlético Madrid), Paul Pogba (Manchester United), Adrien Rabiot (Juventus), Moussa Sissoko (Tottenham), Corentin Tolisso (Bayern)\n" +
                "\n" +
                "Penyerang :\n" +
                "Wissam Ben Yedder (Monaco), Karim Benzema (Real Madrid), Kingsley Coman (Bayern), Ousmane Dembélé (Barcelona), Olivier Giroud (Chelsea), Antoine Griezmann (Barcelona), Kylian Mbappé (PSG), Marcus Thuram (Mönchengladbach)\n",
        "Kiper :\n" +
                "Manuel Neuer (Bayern), Bernd Leno (A\trsenal), Kevin Trapp (Frankfurt)\n" +
                "\n" +
                "Bek :\n" +
                "Matthias Ginter (Mönchengladbach), Antonio Rüdiger (Chelsea), Robin Gosens (Atalanta), Christian Günter (Freiburg), Marcel Halstenberg (Leipzig), Mats Hummels (Dortmund), Lukas Klostermann (Leipzig), Robin Koch (Leeds), Niklas Süle (Bayern)\n" +
                "\n" +
                "Gelandang :\n" +
                "İlkay Gündoğan (Manchester City), Toni Kroos (Real Madrid), Emre Can (Dortmund), Joshua Kimmich (Bayern), Thomas Müller (Bayern), Jamal Musiala (Bayern), Serge Gnabry (Bayern), Leon Goretzka (Bayern), Kai Havertz (Chelsea), Jonas Hofmann (Mönchengladbach), Leroy Sané (Bayern), Florian Neuhaus (Mönchengladbach)\n" +
                "\n" +
                "Penyerang :\n" +
                "Timo Werner (Chelsea), Kevin Volland (Monaco)\n",
        "Kiper :\n" +
                "Anthony Lopes (Lyon), Rui Patrício (Wolves), Rui Silva (Granada)\n" +
                "\n" +
                "Bek :\n" +
                "João Cancelo (Manchester City), Nélson Semedo (Wolves), José Fonte (LOSC Lille), Pepe (Porto), Rúben Dias (Manchester City), Nuno Mendes (Sporting CP), Raphael Guerreiro (Dortmund)\n" +
                "\n" +
                "Gelandang :\n" +
                "Danilo Pereira (PSG), João Palhinha (Sporting CP), Rúben Neves (Wolves), Bruno Fernandes (Manchester United), João Moutinho (Wolves), Renato Sanches (LOSC Lille), Sérgio Oliveira (Porto), William Carvalho (Real Betis)\n" +
                "\n" +
                "Penyerang :\n" +
                "Pedro Gonçalves (Sporting CP), André Silva (Eintracht Frankfurt), Bernardo Silva (Manchester City), Cristiano Ronaldo (Juventus), Diogo Jota (Liverpool), Gonçalo Guedes (Valencia), João Félix (Atlético Madrid), Rafa Silva (Benfica)\n",
        "Kiper :\n" +
                "Péter Gulácsi (Leipzig), Dénes Dibusz (Ferencváros), Ádám Bogdán (Ferencváros)\n" +
                "\n" +
                "Bek :\n" +
                "Gergő Lovrencsics (Ferencváros), Endre Botka (Ferencváros), Ádám Lang (Omonia Nicosia), Ákos Kecskés (Lugano), Attila Fiola (Fehérvár), Willi Orbán (Leipzig), Attila Szalai (Fenerbahçe), Bendegúz Bolla (Fehérvár)\n" +
                "\n" +
                "Gelandang :\n" +
                "Loïc Négo (Fehérvár), Ádám Nagy (Bristol City), László Kleinheisler (Osijek), Dávid Sigér (Ferencváros), Dániel Gazdag (Philadelphia Union), András Schäfer (Dunajská Streda) Tamás Cseri (Mezőkövesd), Filip Holender (Partizan)\n" +
                "\n" +
                "Penyerang :\n" +
                "Ádám Szalai (Mainz), Roland Sallai (Freiburg), Nemanja Nikolić (Fehérvár), Kevin Varga (Kasımpaşa), Roland Varga (MTK Budapest), Szabolcs Schön (FC Dallas), János Hahn (Paks)\n"
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
