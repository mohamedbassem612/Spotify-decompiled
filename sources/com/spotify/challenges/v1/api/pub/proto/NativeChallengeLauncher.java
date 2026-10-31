package com.spotify.challenges.v1.api.pub.proto;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import p.bf40;
import p.fin0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class NativeChallengeLauncher extends h implements v2j0 {
    private static final NativeChallengeLauncher DEFAULT_INSTANCE;
    public static final int EMAIL_VERIFICATION_FIELD_NUMBER = 101;
    private static volatile qzr0 PARSER;
    private int challengeDataCase_ = 0;
    private Object challengeData_;

    static {
        NativeChallengeLauncher nativeChallengeLauncher = new NativeChallengeLauncher();
        DEFAULT_INSTANCE = nativeChallengeLauncher;
        h.registerDefaultInstance(NativeChallengeLauncher.class, nativeChallengeLauncher);
    }

    private NativeChallengeLauncher() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000ee\u0001\u0000\u0000\u0000e<\u0000", new Object[]{"challengeData_", "challengeDataCase_", Empty.class});
        }
        if (iOrdinal == 3) {
            return new NativeChallengeLauncher();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (NativeChallengeLauncher.class) {
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
