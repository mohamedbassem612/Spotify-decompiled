package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.upj0;
import p.v2j0;
import p.vpj0;
import p.wpj0;
import p.xpj0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MetricMeasurement extends com.google.protobuf.h implements v2j0 {
    public static final int ASPECT_FIELD_NUMBER = 3;
    private static final MetricMeasurement DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 5;
    public static final int EXPERIENCE_FIELD_NUMBER = 2;
    public static final int MEASUREMENT_ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 6;
    public static final int METRICS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private String aspect_;
    private int bitField0_;
    private qng0 dimensions_;
    private String experience_;
    private String measurementId_;
    private qng0 metadata_;
    private qng0 metrics_;

    static {
        MetricMeasurement metricMeasurement = new MetricMeasurement();
        DEFAULT_INSTANCE = metricMeasurement;
        com.google.protobuf.h.registerDefaultInstance(MetricMeasurement.class, metricMeasurement);
    }

    private MetricMeasurement() {
        qng0 qng0Var = qng0.b;
        this.metrics_ = qng0Var;
        this.dimensions_ = qng0Var;
        this.metadata_ = qng0Var;
        this.measurementId_ = "";
        this.experience_ = "";
        this.aspect_ = "";
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static upj0 q() {
        return (upj0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0003\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042\u00052\u00062", new Object[]{"bitField0_", "measurementId_", "experience_", "aspect_", "metrics_", xpj0.a, "dimensions_", vpj0.a, "metadata_", wpj0.a});
        }
        if (iOrdinal == 3) {
            return new MetricMeasurement();
        }
        if (iOrdinal == 4) {
            return new upj0(DEFAULT_INSTANCE);
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
        synchronized (MetricMeasurement.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.dimensions_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.dimensions_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.metadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metadata_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 p() {
        qng0 qng0Var = this.metrics_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metrics_ = qng0VarH;
        return qng0VarH;
    }

    public final void r() {
        this.bitField0_ |= 4;
        this.aspect_ = "scroll_performance";
    }

    public final void s() {
        this.bitField0_ |= 2;
        this.experience_ = "page_session";
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.measurementId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
