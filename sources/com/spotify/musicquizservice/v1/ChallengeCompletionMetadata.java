package com.spotify.musicquizservice.v1;

import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ChallengeCompletionMetadata extends com.google.protobuf.h implements v2j0 {
    private static final ChallengeCompletionMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RUNNER_UP_DISPLAY_NAME_FIELD_NUMBER = 5;
    public static final int RUNNER_UP_PROFILE_PICTURE_FIELD_NUMBER = 4;
    public static final int RUNNER_UP_SCORE_PERCENTAGE_VALUE_FIELD_NUMBER = 6;
    public static final int RUNNER_UP_TIME_FIELD_NUMBER = 8;
    public static final int WINNER_DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int WINNER_PROFILE_PICTURE_FIELD_NUMBER = 1;
    public static final int WINNER_SCORE_PERCENTAGE_VALUE_FIELD_NUMBER = 3;
    public static final int WINNER_TIME_FIELD_NUMBER = 7;
    private String winnerProfilePicture_ = "";
    private String winnerDisplayName_ = "";
    private String winnerScorePercentageValue_ = "";
    private String runnerUpProfilePicture_ = "";
    private String runnerUpDisplayName_ = "";
    private String runnerUpScorePercentageValue_ = "";
    private String winnerTime_ = "";
    private String runnerUpTime_ = "";

    static {
        ChallengeCompletionMetadata challengeCompletionMetadata = new ChallengeCompletionMetadata();
        DEFAULT_INSTANCE = challengeCompletionMetadata;
        com.google.protobuf.h.registerDefaultInstance(ChallengeCompletionMetadata.class, challengeCompletionMetadata);
    }

    private ChallengeCompletionMetadata() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"winnerProfilePicture_", "winnerDisplayName_", "winnerScorePercentageValue_", "runnerUpProfilePicture_", "runnerUpDisplayName_", "runnerUpScorePercentageValue_", "winnerTime_", "runnerUpTime_"});
        }
        if (iOrdinal == 3) {
            return new ChallengeCompletionMetadata();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ChallengeCompletionMetadata.class) {
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
