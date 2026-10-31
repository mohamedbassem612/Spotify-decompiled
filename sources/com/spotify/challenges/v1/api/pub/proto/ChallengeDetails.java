package com.spotify.challenges.v1.api.pub.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ChallengeDetails extends h implements v2j0 {
    public static final int CHALLENGE_ID_FIELD_NUMBER = 1;
    private static final ChallengeDetails DEFAULT_INSTANCE;
    public static final int NATIVE_CHALLENGE_LAUNCHER_FIELD_NUMBER = 102;
    private static volatile qzr0 PARSER = null;
    public static final int WEB_CHALLENGE_LAUNCHER_FIELD_NUMBER = 101;
    private Object challengeLauncher_;
    private int challengeLauncherCase_ = 0;
    private String challengeId_ = "";

    static {
        ChallengeDetails challengeDetails = new ChallengeDetails();
        DEFAULT_INSTANCE = challengeDetails;
        h.registerDefaultInstance(ChallengeDetails.class, challengeDetails);
    }

    private ChallengeDetails() {
    }

    public static ChallengeDetails o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001f\u0003\u0000\u0000\u0000\u0001Ȉe<\u0000f<\u0000", new Object[]{"challengeLauncher_", "challengeLauncherCase_", "challengeId_", WebChallengeLauncher.class, NativeChallengeLauncher.class});
        }
        if (iOrdinal == 3) {
            return new ChallengeDetails();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (ChallengeDetails.class) {
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

    public final WebChallengeLauncher p() {
        return this.challengeLauncherCase_ == 101 ? (WebChallengeLauncher) this.challengeLauncher_ : WebChallengeLauncher.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
