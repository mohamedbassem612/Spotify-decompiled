package com.spotify.ad.detection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AdDetectionOuterClass$TimestampResult extends h implements v2j0 {
    private static final AdDetectionOuterClass$TimestampResult DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_TYPE_FIELD_NUMBER = 2;
    private int timestampMs_;
    private int timestampType_;

    static {
        AdDetectionOuterClass$TimestampResult adDetectionOuterClass$TimestampResult = new AdDetectionOuterClass$TimestampResult();
        DEFAULT_INSTANCE = adDetectionOuterClass$TimestampResult;
        h.registerDefaultInstance(AdDetectionOuterClass$TimestampResult.class, adDetectionOuterClass$TimestampResult);
    }

    private AdDetectionOuterClass$TimestampResult() {
    }

    public static AdDetectionOuterClass$TimestampResult n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"timestampMs_", "timestampType_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$TimestampResult();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (AdDetectionOuterClass$TimestampResult.class) {
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

    public final int o() {
        return this.timestampMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
