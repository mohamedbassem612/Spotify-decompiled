package com.spotify.messages;

import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wiq0;
import p.xiq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class OopsMetricEventNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int AGGREGATED_VALUE_FIELD_NUMBER = 12;
    public static final int AGGREGATION_TYPE_FIELD_NUMBER = 5;
    public static final int ATTRIBUTES_FIELD_NUMBER = 15;
    public static final int BATCH_COLLECTION_ID_FIELD_NUMBER = 17;
    private static final OopsMetricEventNonAuth DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 9;
    public static final int FLUSH_REASON_FIELD_NUMBER = 4;
    public static final int HISTOGRAM_FIELD_NUMBER = 14;
    public static final int INSTRUMENT_TYPE_FIELD_NUMBER = 11;
    public static final int METRIC_ID_FIELD_NUMBER = 1;
    public static final int METRIC_KEY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SCOPE_FIELD_NUMBER = 16;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    public static final int START_MONOTONIC_FIELD_NUMBER = 8;
    public static final int START_WALLCLOCK_FIELD_NUMBER = 7;
    public static final int TARGET_INTERVAL_FIELD_NUMBER = 6;
    public static final int TIME_SERIES_FIELD_NUMBER = 13;
    public static final int UNIT_FIELD_NUMBER = 10;
    private double aggregatedValue_;
    private String batchCollectionId_;
    private int bitField0_;
    private long duration_;
    private phc histogram_;
    private String scope_;
    private int segment_;
    private long startMonotonic_;
    private long startWallclock_;
    private long targetInterval_;
    private phc timeSeries_;
    private qng0 attributes_ = qng0.b;
    private String metricId_ = "";
    private String metricKey_ = "";
    private String flushReason_ = "";
    private String aggregationType_ = "";
    private String unit_ = "";
    private String instrumentType_ = "";

    static {
        OopsMetricEventNonAuth oopsMetricEventNonAuth = new OopsMetricEventNonAuth();
        DEFAULT_INSTANCE = oopsMetricEventNonAuth;
        com.google.protobuf.h.registerDefaultInstance(OopsMetricEventNonAuth.class, oopsMetricEventNonAuth);
    }

    private OopsMetricEventNonAuth() {
        hhc hhcVar = phc.b;
        this.timeSeries_ = hhcVar;
        this.histogram_ = hhcVar;
        this.scope_ = "";
        this.batchCollectionId_ = "";
    }

    public static xiq0 n() {
        return (xiq0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(long j) {
        this.bitField0_ |= 32;
        this.targetInterval_ = j;
    }

    public final void B(phc phcVar) {
        this.bitField0_ |= 4096;
        this.timeSeries_ = phcVar;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.unit_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0001\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဈ\t\u000bဈ\n\fက\u000b\rည\f\u000eည\r\u000f2\u0010ဈ\u000e\u0011ဈ\u000f", new Object[]{"bitField0_", "metricId_", "segment_", "metricKey_", "flushReason_", "aggregationType_", "targetInterval_", "startWallclock_", "startMonotonic_", "duration_", "unit_", "instrumentType_", "aggregatedValue_", "timeSeries_", "histogram_", "attributes_", wiq0.a, "scope_", "batchCollectionId_"});
        }
        if (iOrdinal == 3) {
            return new OopsMetricEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new xiq0(DEFAULT_INSTANCE);
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
        synchronized (OopsMetricEventNonAuth.class) {
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

    public final void o(double d) {
        this.bitField0_ |= 2048;
        this.aggregatedValue_ = d;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.aggregationType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.batchCollectionId_ = str;
    }

    public final void r(long j) {
        this.bitField0_ |= 256;
        this.duration_ = j;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.flushReason_ = str;
    }

    public final void t(phc phcVar) {
        this.bitField0_ |= 8192;
        this.histogram_ = phcVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.instrumentType_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.metricId_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.metricKey_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.scope_ = str;
    }

    public final void y(long j) {
        this.bitField0_ |= 128;
        this.startMonotonic_ = j;
    }

    public final void z(long j) {
        this.bitField0_ |= 64;
        this.startWallclock_ = j;
    }
}
