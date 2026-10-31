package com.spotify.musicquizservice.v1;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class GetQuizMetadataResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_DISPLAY_INFO_FIELD_NUMBER = 2;
    public static final int BACKGROUND_MUSIC_URL_FIELD_NUMBER = 5;
    private static final GetQuizMetadataResponse DEFAULT_INSTANCE;
    public static final int FAILED_LOADING_ANIMATION_FIELD_NUMBER = 8;
    public static final int FAILED_LOADING_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int HUMAN_VERIFIED_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_NAME_FIELD_NUMBER = 6;
    public static final int ROUNDS_FIELD_NUMBER = 1;
    private ArtistDisplayInfo artistDisplayInfo_;
    private int bitField0_;
    private LottieAnimation failedLoadingAnimation_;
    private boolean humanVerified_;
    private h290 rounds_ = com.google.protobuf.h.emptyProtobufList();
    private String failedLoadingImageUrl_ = "";
    private String backgroundMusicUrl_ = "";
    private String quizName_ = "";

    public static final class RoundMetadata extends com.google.protobuf.h implements v2j0 {
        private static final RoundMetadata DEFAULT_INSTANCE;
        public static final int DISPLAY_TEXT_FIELD_NUMBER = 2;
        public static final int FACT_FIELD_NUMBER = 3;
        public static final int IMAGE_URL_FIELD_NUMBER = 1;
        public static final int LOADING_ANIMATION_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int PLAY_BUTTON_TEXT_FIELD_NUMBER = 4;
        private int bitField0_;
        private LottieAnimation loadingAnimation_;
        private String imageUrl_ = "";
        private String displayText_ = "";
        private h290 fact_ = com.google.protobuf.h.emptyProtobufList();
        private String playButtonText_ = "";

        static {
            RoundMetadata roundMetadata = new RoundMetadata();
            DEFAULT_INSTANCE = roundMetadata;
            com.google.protobuf.h.registerDefaultInstance(RoundMetadata.class, roundMetadata);
        }

        private RoundMetadata() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ\u0005ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "displayText_", "fact_", "playButtonText_", "loadingAnimation_"});
            }
            if (iOrdinal == 3) {
                return new RoundMetadata();
            }
            if (iOrdinal == 4) {
                return new j(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (RoundMetadata.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        public final String n() {
            return this.displayText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.fact_;
        }

        public final LottieAnimation p() {
            LottieAnimation lottieAnimation = this.loadingAnimation_;
            return lottieAnimation == null ? LottieAnimation.n() : lottieAnimation;
        }

        public final String q() {
            return this.playButtonText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GetQuizMetadataResponse getQuizMetadataResponse = new GetQuizMetadataResponse();
        DEFAULT_INSTANCE = getQuizMetadataResponse;
        com.google.protobuf.h.registerDefaultInstance(GetQuizMetadataResponse.class, getQuizMetadataResponse);
    }

    private GetQuizMetadataResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\bဉ\u0001", new Object[]{"bitField0_", "rounds_", RoundMetadata.class, "artistDisplayInfo_", "failedLoadingImageUrl_", "backgroundMusicUrl_", "quizName_", "humanVerified_", "failedLoadingAnimation_"});
        }
        if (iOrdinal == 3) {
            return new GetQuizMetadataResponse();
        }
        if (iOrdinal == 4) {
            return new i(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (GetQuizMetadataResponse.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String n() {
        return this.backgroundMusicUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LottieAnimation o() {
        LottieAnimation lottieAnimation = this.failedLoadingAnimation_;
        return lottieAnimation == null ? LottieAnimation.n() : lottieAnimation;
    }

    public final boolean p() {
        return this.humanVerified_;
    }

    public final String q() {
        return this.quizName_;
    }

    public final h290 r() {
        return this.rounds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
