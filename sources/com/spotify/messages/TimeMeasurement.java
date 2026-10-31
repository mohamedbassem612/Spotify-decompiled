package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jne1;
import p.kne1;
import p.lne1;
import p.mne1;
import p.nne1;
import p.one1;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class TimeMeasurement extends h implements v2j0 {
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final TimeMeasurement DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 2;
    public static final int FEATURE_ID_FIELD_NUMBER = 6;
    public static final int MEASUREMENT_ID_FIELD_NUMBER = 7;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int PARENT_EPOCH_OFFSET_FIELD_NUMBER = 9;
    public static final int PARENT_MEASUREMENT_ID_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int POINT_DURATIONS_FIELD_NUMBER = 4;
    public static final int POINT_FEATURE_IDS_FIELD_NUMBER = 5;
    public static final int POINT_TIMESTAMPS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String category_;
    private qng0 dimensions_;
    private String featureId_;
    private String measurementId_;
    private qng0 metadata_;
    private long parentEpochOffset_;
    private String parentMeasurementId_;
    private qng0 pointDurations_;
    private qng0 pointFeatureIds_;
    private qng0 pointTimestamps_;

    static {
        TimeMeasurement timeMeasurement = new TimeMeasurement();
        DEFAULT_INSTANCE = timeMeasurement;
        h.registerDefaultInstance(TimeMeasurement.class, timeMeasurement);
    }

    private TimeMeasurement() {
        qng0 qng0Var = qng0.b;
        this.dimensions_ = qng0Var;
        this.pointTimestamps_ = qng0Var;
        this.pointDurations_ = qng0Var;
        this.pointFeatureIds_ = qng0Var;
        this.metadata_ = qng0Var;
        this.category_ = "";
        this.featureId_ = "";
        this.measurementId_ = "";
        this.parentMeasurementId_ = "";
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static jne1 s() {
        return (jne1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0005\u0000\u0000\u0001ဈ\u0000\u00022\u00032\u00042\u00052\u0006ဈ\u0001\u0007ဈ\u0002\bဈ\u0003\tဂ\u0004\n2", new Object[]{"bitField0_", "category_", "dimensions_", kne1.a, "pointTimestamps_", one1.a, "pointDurations_", mne1.a, "pointFeatureIds_", nne1.a, "featureId_", "measurementId_", "parentMeasurementId_", "parentEpochOffset_", "metadata_", lne1.a});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurement();
        }
        if (iOrdinal == 4) {
            return new jne1(DEFAULT_INSTANCE);
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
        synchronized (TimeMeasurement.class) {
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
        qng0 qng0Var = this.pointDurations_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.pointDurations_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 q() {
        qng0 qng0Var = this.pointFeatureIds_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.pointFeatureIds_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 r() {
        qng0 qng0Var = this.pointTimestamps_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.pointTimestamps_ = qng0VarH;
        return qng0VarH;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.category_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.featureId_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.measurementId_ = str;
    }
}
