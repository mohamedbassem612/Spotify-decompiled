package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ple1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TimeFilter extends h implements v2j0 {
    private static final TimeFilter DEFAULT_INSTANCE;
    public static final int MAX_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int MIN_TIMESTAMP_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Timestamp maxTimestamp_;
    private Timestamp minTimestamp_;

    static {
        TimeFilter timeFilter = new TimeFilter();
        DEFAULT_INSTANCE = timeFilter;
        h.registerDefaultInstance(TimeFilter.class, timeFilter);
    }

    private TimeFilter() {
    }

    public static ple1 n() {
        return (ple1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "minTimestamp_", "maxTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new TimeFilter();
        }
        if (iOrdinal == 4) {
            return new ple1(DEFAULT_INSTANCE);
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
        synchronized (TimeFilter.class) {
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

    public final void o(Timestamp timestamp) {
        timestamp.getClass();
        this.maxTimestamp_ = timestamp;
        this.bitField0_ |= 2;
    }

    public final void p(Timestamp timestamp) {
        timestamp.getClass();
        this.minTimestamp_ = timestamp;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
