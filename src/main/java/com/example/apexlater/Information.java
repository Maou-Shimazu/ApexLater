package com.example.apexlater;

public class Information {
    Global global;
    Rank rank;
    Arena arena;
    Battlepass battlepass;
    private static int internalParsingVersion;
    Badges badges;
    Realtime realtime;
    Legends legends; // add everything for the legends https://stackoverflow.com/questions/10292514/how-to-deserialize-a-json-array-of-objects-using-gson-library
    Mozambique_Internal mozambiquehere_internal;
    ALS als; // add alias for this with the lib
    Total total;
    private static class Imgassets {
        private static String icon;
        private static String banner;
    }

    private static class Global {
        private static String name;
        private static int uid;
        private static String avatar;
        private static String platform;
        private static int level;
        private static int toNextLevelPercent;
        private static int internalUpdateCount;
        Bans bans;
        private static class Bans {
            private static boolean isActive;
            private static int remainingSeconds;
            private static String last_banReason;
        }
    }
    private static class Rank {
        private static int rankScore;
        private static String rankName;
        private static int rankDiv;
        private static int ladderPosPlatform;
        private static String rankImg;
        private static String rankedSeason;
    }
    private static class Arena {
        private static int rankScore;
        private static String rankName;
        private static int rankDiv;
        private static int ladderPosPlatform;
        private static String rankImg;
        private static String rankedSeason;
    }
    private static class Battlepass {
        private static String level;
        History history;
        private static class History {
            private static int season1;
            private static int season2;
            private static int season3;
            private static int season4;
            private static int season5;
            private static int season6;
            private static int season7;
            private static int season8;
            private static int season9;
            private static int season10;
            private static int season11;
            private static int season12;
            private static int season13;
            private static int season14;
        }
    }
    private static class Badges {} // handle in constructor or elsewhere
    private static class Realtime {
        private static String lobbyState;
        private static int isOnline;
        private static int isInGame;
        private static int canJoin;
        private static int partyFull;
        private static String selectedLegend;
        private static String currentState;
        private static int currentStateSinceTimestamp;
        private static String currentStateAsText;

    }
    private static class Legends {
        Selected selected;
        All all;
        private static class Selected {
            private static String LegendName;
            private static String[] data;
            GameInfo gameInfo;
            private static class GameInfo {
                private static String skin;
                private static String skinRarity;
                private static String frame;
                private static String frameRarity;
                private static String pose;
                private static String poseRarity;
                private static String intro;
                private static String introRarity;

            }
            Imgassets ImgAssets;
        }
        private static class All {
            LAssets Revenant;
            LAssets Crypto;
            LAssets Horizon;
            LAssets Gibralter;
            LAssets Wattson;
            LAssets Fuse;
            LAssets Bangalore;

            private static class LAssets {
                Imgassets ImgAssets;
            }
        }
    }
    private static class Mozambique_Internal{}
    private static class ALS {}
    private static class Total {}

}
