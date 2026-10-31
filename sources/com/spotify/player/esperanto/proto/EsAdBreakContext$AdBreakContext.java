package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsAdBreakContext$AdBreakContext extends h implements v2j0 {
    private static final EsAdBreakContext$AdBreakContext DEFAULT_INSTANCE;
    public static final int MAX_SECONDS_REMAINING_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_IN_CURRENT_AD_BREAK_FIELD_NUMBER = 2;
    public static final int TOTAL_ADS_IN_BREAK_ESTIMATE_FIELD_NUMBER = 3;
    private long maxSecondsRemaining_;
    private long positionInCurrentAdBreak_;
    private long totalAdsInBreakEstimate_;

    static {
        EsAdBreakContext$AdBreakContext esAdBreakContext$AdBreakContext = new EsAdBreakContext$AdBreakContext();
        DEFAULT_INSTANCE = esAdBreakContext$AdBreakContext;
        h.registerDefaultInstance(EsAdBreakContext$AdBreakContext.class, esAdBreakContext$AdBreakContext);
    }

    private EsAdBreakContext$AdBreakContext() {
    }

    public static EsAdBreakContext$AdBreakContext o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003", new Object[]{"maxSecondsRemaining_", "positionInCurrentAdBreak_", "totalAdsInBreakEstimate_"});
        }
        if (iOrdinal == 3) {
            return new EsAdBreakContext$AdBreakContext();
        }
        if (iOrdinal == 4) {
            return new rdz((byte) 10);
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
        synchronized (EsAdBreakContext$AdBreakContext.class) {
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

    public final long p() {
        return this.maxSecondsRemaining_;
    }

    public final long q() {
        return this.positionInCurrentAdBreak_;
    }

    public final long r() {
        return this.totalAdsInBreakEstimate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
