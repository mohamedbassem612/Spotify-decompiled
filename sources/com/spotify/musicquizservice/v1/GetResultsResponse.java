package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class GetResultsResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ANIMATIONS_FIELD_NUMBER = 8;
    public static final int ARTIST_DISPLAY_INFO_FIELD_NUMBER = 4;
    public static final int BACKGROUND_MUSIC_URL_FIELD_NUMBER = 7;
    public static final int CHALLENGE_FIELD_NUMBER = 3;
    private static final GetResultsResponse DEFAULT_INSTANCE;
    public static final int FOREGROUND_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int HUMAN_VERIFIED_FIELD_NUMBER = 9;
    public static final int IS_PLAY_ANOTHER_QUIZ_ENABLED_FIELD_NUMBER = 11;
    public static final int MOTIVATIONAL_MESSAGE_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_NAME_FIELD_NUMBER = 10;
    public static final int QUIZ_URI_FIELD_NUMBER = 5;
    public static final int SOLO_FIELD_NUMBER = 2;
    public static final int USER_RESULT_FIELD_NUMBER = 1;
    private ResultAnimations animations_;
    private ArtistDisplayInfo artistDisplayInfo_;
    private int bitField0_;
    private Object completionType_;
    private boolean humanVerified_;
    private boolean isPlayAnotherQuizEnabled_;
    private Result userResult_;
    private int completionTypeCase_ = 0;
    private String quizUri_ = "";
    private String foregroundImageUrl_ = "";
    private String backgroundMusicUrl_ = "";
    private String quizName_ = "";
    private String motivationalMessage_ = "";

    static {
        GetResultsResponse getResultsResponse = new GetResultsResponse();
        DEFAULT_INSTANCE = getResultsResponse;
        com.google.protobuf.h.registerDefaultInstance(GetResultsResponse.class, getResultsResponse);
    }

    private GetResultsResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005Ȉ\u0006ለ\u0002\u0007Ȉ\bဉ\u0003\t\u0007\nȈ\u000b\u0007\fȈ", new Object[]{"completionType_", "completionTypeCase_", "bitField0_", "userResult_", SoloCompletion.class, ChallengeCompletion.class, "artistDisplayInfo_", "quizUri_", "foregroundImageUrl_", "backgroundMusicUrl_", "animations_", "humanVerified_", "quizName_", "isPlayAnotherQuizEnabled_", "motivationalMessage_"});
        }
        if (iOrdinal == 3) {
            return new GetResultsResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (GetResultsResponse.class) {
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

    public final ResultAnimations n() {
        ResultAnimations resultAnimations = this.animations_;
        return resultAnimations == null ? ResultAnimations.o() : resultAnimations;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundMusicUrl_;
    }

    public final ChallengeCompletion p() {
        return this.completionTypeCase_ == 3 ? (ChallengeCompletion) this.completionType_ : ChallengeCompletion.n();
    }

    public final int q() {
        int i = this.completionTypeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final boolean r() {
        return this.humanVerified_;
    }

    public final boolean s() {
        return this.isPlayAnotherQuizEnabled_;
    }

    public final String t() {
        return this.motivationalMessage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.quizName_;
    }

    public final String v() {
        return this.quizUri_;
    }

    public final Result w() {
        Result result = this.userResult_;
        return result == null ? Result.o() : result;
    }
}
