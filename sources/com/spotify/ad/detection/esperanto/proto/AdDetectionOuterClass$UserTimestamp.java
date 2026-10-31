package com.spotify.ad.detection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AdDetectionOuterClass$UserTimestamp extends h implements v2j0 {
    private static final AdDetectionOuterClass$UserTimestamp DEFAULT_INSTANCE;
    public static final int IS_FALLBACK_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USER_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private boolean isFallback_;
    private int userTimestampMs_;

    static {
        AdDetectionOuterClass$UserTimestamp adDetectionOuterClass$UserTimestamp = new AdDetectionOuterClass$UserTimestamp();
        DEFAULT_INSTANCE = adDetectionOuterClass$UserTimestamp;
        h.registerDefaultInstance(AdDetectionOuterClass$UserTimestamp.class, adDetectionOuterClass$UserTimestamp);
    }

    private AdDetectionOuterClass$UserTimestamp() {
    }

    public static AdDetectionOuterClass$UserTimestamp n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"userTimestampMs_", "isFallback_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$UserTimestamp();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (AdDetectionOuterClass$UserTimestamp.class) {
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

    public final boolean o() {
        return this.isFallback_;
    }

    public final int p() {
        return this.userTimestampMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
