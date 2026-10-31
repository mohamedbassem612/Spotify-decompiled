package com.spotify.fingerprintfilterservice;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AdPlacement extends h implements v2j0 {
    private static final AdPlacement DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int ROLL_POSITION_FIELD_NUMBER = 3;
    public static final int START_MS_FIELD_NUMBER = 1;
    private int durationMs_;
    private int rollPosition_;
    private int startMs_;

    static {
        AdPlacement adPlacement = new AdPlacement();
        DEFAULT_INSTANCE = adPlacement;
        h.registerDefaultInstance(AdPlacement.class, adPlacement);
    }

    private AdPlacement() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"startMs_", "durationMs_", "rollPosition_"});
        }
        if (iOrdinal == 3) {
            return new AdPlacement();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (AdPlacement.class) {
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

    public final int n() {
        return this.durationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.rollPosition_;
    }

    public final int p() {
        return this.startMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
