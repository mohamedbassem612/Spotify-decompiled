package com.spotify.quizaccessservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ChallengeMetadata extends h implements v2j0 {
    public static final int CHALLENGER_USERNAME_FIELD_NUMBER = 1;
    public static final int CHALLENGE_ID_FIELD_NUMBER = 2;
    private static final ChallengeMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String challengerUsername_ = "";
    private String challengeId_ = "";

    static {
        ChallengeMetadata challengeMetadata = new ChallengeMetadata();
        DEFAULT_INSTANCE = challengeMetadata;
        h.registerDefaultInstance(ChallengeMetadata.class, challengeMetadata);
    }

    private ChallengeMetadata() {
    }

    public static ChallengeMetadata p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"challengerUsername_", "challengeId_"});
        }
        if (iOrdinal == 3) {
            return new ChallengeMetadata();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (ChallengeMetadata.class) {
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

    public final String o() {
        return this.challengerUsername_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
