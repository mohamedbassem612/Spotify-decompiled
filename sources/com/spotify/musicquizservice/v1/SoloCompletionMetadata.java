package com.spotify.musicquizservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SoloCompletionMetadata extends h implements v2j0 {
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 4;
    private static final SoloCompletionMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SCORE_PERCENTAGE_VALUE_FIELD_NUMBER = 5;
    public static final int SCORE_PREFIX_FIELD_NUMBER = 2;
    public static final int SCORE_SUBTITLE_FIELD_NUMBER = 3;
    public static final int USER_DISPLAY_NAME_FIELD_NUMBER = 6;
    public static final int USER_PROFILE_PICTURE_FIELD_NUMBER = 1;
    private String userProfilePicture_ = "";
    private String scorePrefix_ = "";
    private String scoreSubtitle_ = "";
    private String callToAction_ = "";
    private String scorePercentageValue_ = "";
    private String userDisplayName_ = "";

    static {
        SoloCompletionMetadata soloCompletionMetadata = new SoloCompletionMetadata();
        DEFAULT_INSTANCE = soloCompletionMetadata;
        h.registerDefaultInstance(SoloCompletionMetadata.class, soloCompletionMetadata);
    }

    private SoloCompletionMetadata() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"userProfilePicture_", "scorePrefix_", "scoreSubtitle_", "callToAction_", "scorePercentageValue_", "userDisplayName_"});
        }
        if (iOrdinal == 3) {
            return new SoloCompletionMetadata();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (SoloCompletionMetadata.class) {
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
