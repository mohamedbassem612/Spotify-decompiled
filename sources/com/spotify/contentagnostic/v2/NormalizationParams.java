package com.spotify.contentagnostic.v2;

import p.bf40;
import p.fin0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class NormalizationParams extends com.google.protobuf.h implements v2j0 {
    private static final NormalizationParams DEFAULT_INSTANCE;
    public static final int LOUDNESS_DB_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRUE_PEAK_DB_FIELD_NUMBER = 2;
    private float loudnessDb_;
    private float truePeakDb_;

    static {
        NormalizationParams normalizationParams = new NormalizationParams();
        DEFAULT_INSTANCE = normalizationParams;
        com.google.protobuf.h.registerDefaultInstance(NormalizationParams.class, normalizationParams);
    }

    private NormalizationParams() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"loudnessDb_", "truePeakDb_"});
        }
        if (iOrdinal == 3) {
            return new NormalizationParams();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (NormalizationParams.class) {
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
