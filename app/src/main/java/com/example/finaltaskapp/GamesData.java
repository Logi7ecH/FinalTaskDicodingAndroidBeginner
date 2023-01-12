package com.example.finaltaskapp;

import java.util.ArrayList;

public class GamesData {
    private static String[] gamesName = {
            "Fallout 1",
            "Fallout 2",
            "Fallout 3",
            "Fallout New Vegas",
            "Fallout 4",
            "Fallout 76",
            "The Elder Scrolls 3: Morrowind",
            "The Elder Scrolls 4: Oblivion",
            "The Elder Scrolls 5: Skyrim",
            "The Outer Worlds"
    };

    private static String[] releaseDate = {
      "1997","1998","2008","2010","2015","2018","2002","2006","2011","2020"
    };

    private static String[] rating = {
            "8/10",
            "9/10",
            "7.5/10",
            "9.5/10",
            "8/10",
            "5/10",
            "8/10",
            "8.5/10",
            "9/10",
            "8/10"
    };

    private static String[] description = {
            "Fallout 1 adalah permainan video role-playing 1997 yang dikembangkan dan diterbitkan oleh Interplay Productions.",
            "Fallout 2 adalah permainan video role-playing tahun 1998 yang dikembangkan oleh Black Isle Studios dan diterbitkan oleh Interplay Productions. Sekuel Fallout, yang telah dirilis tahun sebelumnya, sebagian besar menggunakan grafis dan mekanik permainan yang serupa.",
            "Fallout 3 adalah game role-playing aksi tahun 2008 yang dikembangkan oleh Bethesda Game Studios dan diterbitkan oleh Bethesda Softworks. Angsuran besar ketiga dalam seri Fallout, ini adalah game pertama yang dikembangkan oleh Bethesda setelah memperoleh hak waralaba dari Interplay Entertainment.",
            "Fallout: New Vegas adalah permainan aksi peran tahun 2010 yang dikembangkan oleh Obsidian Entertainment dan diterbitkan oleh Bethesda Softworks. Itu diumumkan pada bulan April 2009 dan dirilis untuk Microsoft Windows, PlayStation 3, dan Xbox 360 pada tanggal 19 Oktober 2010.",
            "Fallout 4 is a 2015 action role-playing game developed by Bethesda Game Studios and published by Bethesda Softworks. It is the fourth main game in the Fallout series and was released worldwide on November 10, 2015, for Microsoft Windows, PlayStation 4 and Xbox One. The game is set within an open world post-apocalyptic environment that encompasses the city of Boston and the surrounding Massachusetts region known as \"The Commonwealth\". It makes use of a number of local landmarks, including Bunker Hill, Fort Independence, and Old North Bridge near Concord, as the bridge out of Sanctuary Hills.",
            "Fallout 76 is a 2018 online action role-playing video game developed by Bethesda Game Studios and published by Bethesda Softworks. It is an installment in the Fallout series and a prequel to previous entries.[b] Fallout 76 is Bethesda Game Studios's first multiplayer game; players explore the open world, which has been torn apart by nuclear war, with others. Bethesda developed the game using a modified version of its Creation Engine, which allowed the accommodation of multiplayer gameplay and a more detailed game world than in previous games.",
            "The Elder Scrolls III: Morrowind is an open-world action role-playing video game developed by Bethesda Game Studios and published by Bethesda Softworks. It is the third installment in the Elder Scrolls series, following 1996's The Elder Scrolls II: Daggerfall, and was released in 2002 for Microsoft Windows and Xbox. The main story takes place on Vvardenfell, an island in the Dunmer (Dark Elf) province of Morrowind, part of the continent of Tamriel. The central quests concern the demigod Dagoth Ur, housed within the volcanic Red Mountain, who seeks to gain power and break Morrowind free from Imperial reign.",
            "The Elder Scrolls IV: Oblivion is an open-world action role-playing video game developed by Bethesda Game Studios, and published by Bethesda Softworks and 2K Games. It is the fourth installment in the Elder Scrolls series, following 2002's The Elder Scrolls III: Morrowind, and was released for Microsoft Windows and Xbox 360 in 2006, followed by PlayStation 3 in 2007. Taking place within the fictional province of Cyrodiil, the game's main story focuses on the player character's efforts to thwart a fanatical cult known as the Mythic Dawn that plans to open portal gates to a demonic realm known as Oblivion.",
            "The Elder Scrolls V: Skyrim is an action role-playing video game developed by Bethesda Game Studios and published by Bethesda Softworks. It is the fifth main installment in The Elder Scrolls series, following 2006's The Elder Scrolls IV: Oblivion, and was released worldwide for Microsoft Windows, PlayStation 3, and Xbox 360 on November 11, 2011.",
            "The Outer Worlds is a 2019 action role-playing game developed by Obsidian Entertainment and published by Private Division. The game was released for PlayStation 4, Xbox One, and Microsoft Windows in October 2019, with a Nintendo Switch version released in June 2020. The game received generally favorable reviews from critics and sold over 4 million units by August 2021."
    };
    private static int[] gamesImage = {
            R.drawable.fallout1,
            R.drawable.fallout2,
            R.drawable.fallout3,
            R.drawable.falloutnv,
            R.drawable.fallout4,
            R.drawable.fallout76,
            R.drawable.morrowind,
            R.drawable.oblivion,
            R.drawable.skyrim,
            R.drawable.outerworld
    };

    static ArrayList<Game> getListData(){
        ArrayList<Game> list = new ArrayList<>();
        for(int position = 0;position<gamesName.length;position++){
            Game game = new Game();
            game.setName(gamesName[position]);
            game.setReleaseDate(releaseDate[position]);
            game.setRating(rating[position]);
            game.setDescription(description[position]);
            game.setPhoto(gamesImage[position]);
            list.add(game);
        }
        return list;
    }
}
