package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ShareTarget extends com.google.protobuf.h implements v2j0 {
    public static final int CHALLENGE_ID_FIELD_NUMBER = 3;
    private static final ShareTarget DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_ID_FIELD_NUMBER = 2;
    public static final int SHARE_URL_FIELD_NUMBER = 1;
    private String shareUrl_ = "";
    private String quizId_ = "";
    private String challengeId_ = "";

    static {
        ShareTarget shareTarget = new ShareTarget();
        DEFAULT_INSTANCE = shareTarget;
        com.google.protobuf.h.registerDefaultInstance(ShareTarget.class, shareTarget);
    }

    private ShareTarget() {
    }

    public static ShareTarget o() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"shareUrl_", "quizId_", "challengeId_"});
        }
        if (iOrdinal == 3) {
            return new ShareTarget();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ShareTarget.class) {
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
        return this.challengeId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
