package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rve1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Timestamp extends h implements v2j0 {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int DYNAMIC_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RAW_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private long dynamicTimestampMs_;
    private long rawTimestampMs_;

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        h.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    public static rve1 p() {
        return (rve1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"dynamicTimestampMs_", "rawTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new Timestamp();
        }
        if (iOrdinal == 4) {
            return new rve1(DEFAULT_INSTANCE);
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
        synchronized (Timestamp.class) {
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

    public final long n() {
        return this.dynamicTimestampMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.rawTimestampMs_;
    }

    public final void q(long j) {
        this.dynamicTimestampMs_ = j;
    }

    public final void r(long j) {
        this.rawTimestampMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
