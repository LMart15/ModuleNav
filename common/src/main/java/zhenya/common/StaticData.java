package zhenya.common;

import java.util.Arrays;
import java.util.List;

public class StaticData {



    private static List<String> images = Arrays.asList(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Asia_on_the_globe_%28Asia_centered%29.svg/2000px-Asia_on_the_globe_%28Asia_centered%29.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Africa_%28orthographic_projection%29.svg/550px-Africa_%28orthographic_projection%29.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Location_North_America.svg/2000px-Location_North_America.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/South_America_%28orthographic_projection%29.svg/200px-South_America_%28orthographic_projection%29.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Antarctica_%28orthographic_projection%29.svg/250px-Antarctica_%28orthographic_projection%29.svg.png",
            "https://static5.depositphotos.com/1003974/484/i/950/depositphotos_4843070-stock-photo-europe-territory-on-globe-map.jpg",
            "https://www.wpclipart.com/geography/Country_Maps/global_location/Australia/Australia_on_globe.png"
    );

    private static List<String> titles = Arrays.asList(
            "Asia",
            "Africa",
            "North America",
            "South America",
            "Antarctica",
            "Europe",
            "Australia"
    );

    private static List<String> descriptions = Arrays.asList(
            "Asia (/ˈeɪʒə, ˈeɪʃə/ (About this sound listen)) is Earth's largest and most populous continent, located primarily in the Eastern and Northern Hemispheres. It shares the continental landmass of Eurasia with the continent of Europe and the continental landmass of Afro-Eurasia with both Europe and Africa. Asia covers an area of 44,579,000 square kilometres (17,212,000 sq mi), about 30% of Earth's total land area and 8.7% of the Earth's total surface area. The continent, which has long been home to the majority of the human population,[5] was the site of many of the first civilizations. Asia is notable for not only its overall large size and population, but also dense and large settlements, as well as vast barely populated regions. Its 4.5 billion people constitute roughly 60% of the world's population.",
            "Africa is the world's second largest and second most-populous continent (the first being Asia in both categories). At about 30.3 million km2 (11.7 million square miles) including adjacent islands, it covers 6% of Earth's total surface area and 20% of its total land area.[3] With 1.2 billion people[1] as of 2016, it accounts for about 16% of the world's human population. The continent is surrounded by the Mediterranean Sea to the north, the Isthmus of Suez and the Red Sea to the northeast, the Indian Ocean to the southeast and the Atlantic Ocean to the west. The continent includes Madagascar and various archipelagos. It contains 54 fully recognised sovereign states (countries), nine territories and two de facto independent states with limited or no recognition.[4] The majority of the continent and its countries are in the Northern Hemisphere, with a substantial portion and number of countries in the Southern Hemisphere.",
            "North America is a continent entirely within the Northern Hemisphere and almost all within the Western Hemisphere; it is also considered by some to be a northern subcontinent of the Americas.[3][4] It is bordered to the north by the Arctic Ocean, to the east by the Atlantic Ocean, to the west and south by the Pacific Ocean, and to the southeast by South America and the Caribbean Sea.",
            "South America is a continent located in the Western Hemisphere, mostly in the Southern Hemisphere, with a relatively small portion in the Northern Hemisphere. It may also be considered a subcontinent of the Americas,[3][4] which is how it is viewed in the Spanish and Portuguese-speaking regions of the Americas. The reference to South America instead of other regions (like Latin America or the Southern Cone) has increased in the last decades due to changing geopolitical dynamics (in particular, the rise of Brazil).",
            "Antarctica (UK: /ænˈtɑːrktɪkə/ or /ænˈtɑːrtɪkə/, US: /æntˈɑːrktɪkə/ (About this sound listen))[note 1] is Earth's southernmost continent. It contains the geographic South Pole and is situated in the Antarctic region of the Southern Hemisphere, almost entirely south of the Antarctic Circle, and is surrounded by the Southern Ocean. At 14,000,000 square kilometres (5,400,000 square miles), it is the fifth-largest continent. For comparison, Antarctica is nearly twice the size of Australia. About 98% of Antarctica is covered by ice that averages 1.9 km (1.2 mi; 6,200 ft) in thickness,[5] which extends to all but the northernmost reaches of the Antarctic Peninsula.",
            "Europe is a continent located entirely in the Northern Hemisphere and mostly in the Eastern Hemisphere. It is bordered by the Arctic Ocean to the north, the Atlantic Ocean to the west, and the Mediterranean Sea to the south. It comprises the westernmost part of Eurasia.",
            "Australia (/əˈstreɪliə, ɒ-/ (About this sound listen)),[10][11] officially the Commonwealth of Australia,[12] is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania and numerous smaller islands. It is the largest country in Oceania and the world's sixth-largest country by total area. The neighbouring countries are Papua New Guinea, Indonesia and East Timor to the north; the Solomon Islands and Vanuatu to the north-east; and New Zealand to the south-east. Australia's capital is Canberra, and its largest city is Sydney."

    );

    public static List<String> getImages() {
        return images;
    }

    public static List<String> getTitles() {
        return titles;
    }

    public static List<String> getDescriptions() {
        return descriptions;
    }
}
