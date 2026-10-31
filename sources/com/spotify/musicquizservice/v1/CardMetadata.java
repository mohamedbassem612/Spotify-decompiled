package com.spotify.musicquizservice.v1;

import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class CardMetadata extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_ARTWORK_URL_FIELD_NUMBER = 8;
    public static final int BACKGROUND_COLOUR_1_FIELD_NUMBER = 4;
    public static final int BACKGROUND_COLOUR_2_FIELD_NUMBER = 5;
    public static final int BACKGROUND_COLOUR_3_FIELD_NUMBER = 6;
    public static final int BASE_TEXT_COLOUR_FIELD_NUMBER = 11;
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    private static final CardMetadata DEFAULT_INSTANCE;
    public static final int FOREGROUND_ARTWORK_URL_FIELD_NUMBER = 7;
    public static final int FOREGROUND_TEXT_COLOUR_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_LOGO_URL_FIELD_NUMBER = 9;
    public static final int QUIZ_NAME_FIELD_NUMBER = 3;
    public static final int SOLO_FIELD_NUMBER = 1;
    public static final int SPOTIFY_LOGO_URL_FIELD_NUMBER = 12;
    private Object specificMetadata_;
    private int specificMetadataCase_ = 0;
    private String quizName_ = "";
    private String backgroundColour1_ = "";
    private String backgroundColour2_ = "";
    private String backgroundColour3_ = "";
    private String foregroundArtworkUrl_ = "";
    private String backgroundArtworkUrl_ = "";
    private String quizLogoUrl_ = "";
    private String foregroundTextColour_ = "";
    private String baseTextColour_ = "";
    private String spotifyLogoUrl_ = "";

    static {
        CardMetadata cardMetadata = new CardMetadata();
        DEFAULT_INSTANCE = cardMetadata;
        com.google.protobuf.h.registerDefaultInstance(CardMetadata.class, cardMetadata);
    }

    private CardMetadata() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ", new Object[]{"specificMetadata_", "specificMetadataCase_", SoloCompletionMetadata.class, ChallengeCompletionMetadata.class, "quizName_", "backgroundColour1_", "backgroundColour2_", "backgroundColour3_", "foregroundArtworkUrl_", "backgroundArtworkUrl_", "quizLogoUrl_", "foregroundTextColour_", "baseTextColour_", "spotifyLogoUrl_"});
        }
        if (iOrdinal == 3) {
            return new CardMetadata();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (CardMetadata.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
