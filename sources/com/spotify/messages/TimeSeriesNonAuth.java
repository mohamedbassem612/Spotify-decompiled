package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uoe1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class TimeSeriesNonAuth extends com.google.protobuf.h implements v2j0 {
    private static final TimeSeriesNonAuth DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 4;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    public static final int TIMESERIES_ID_FIELD_NUMBER = 1;
    public static final int TIMESERIES_KEY_FIELD_NUMBER = 3;
    private int bitField0_;
    private int segment_;
    private String timeseriesId_ = "";
    private String timeseriesKey_ = "";
    private phc points_ = phc.b;

    static {
        TimeSeriesNonAuth timeSeriesNonAuth = new TimeSeriesNonAuth();
        DEFAULT_INSTANCE = timeSeriesNonAuth;
        com.google.protobuf.h.registerDefaultInstance(TimeSeriesNonAuth.class, timeSeriesNonAuth);
    }

    private TimeSeriesNonAuth() {
    }

    public static uoe1 n() {
        return (uoe1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"bitField0_", "timeseriesId_", "segment_", "timeseriesKey_", "points_"});
        }
        if (iOrdinal == 3) {
            return new TimeSeriesNonAuth();
        }
        if (iOrdinal == 4) {
            return new uoe1(DEFAULT_INSTANCE);
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
        synchronized (TimeSeriesNonAuth.class) {
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

    public final void o(phc phcVar) {
        this.bitField0_ |= 8;
        this.points_ = phcVar;
    }

    public final void p(int i) {
        this.bitField0_ |= 2;
        this.segment_ = i;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.timeseriesId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.timeseriesKey_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
