package com.example.apexlater;

public class Information {
    Data data;
    public Information(Data data) {
        this.data = data;
    }

    private static class Data {
        PlatformInfo platformInfo;

        private static class PlatformInfo {
            private String platformSlug;
            private String platformUserId;
            private String platformUserHandle;
            private String platformUserIdentifier;
            private String avatarUrl;
            private String additionalParameters;
        }
    }
}
