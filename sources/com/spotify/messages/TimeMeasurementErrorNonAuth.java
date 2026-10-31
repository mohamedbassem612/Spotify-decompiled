package com.spotify.messages;

import p.aoe1;
import p.bf40;
import p.boe1;
import p.coe1;
import p.doe1;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne1;
import p.wne1;
import p.xne1;
import p.yne1;
import p.zne1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class TimeMeasurementErrorNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int CATEGORY_FIELD_NUMBER = 5;
    private static final TimeMeasurementErrorNonAuth DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 6;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int ERROR_DATA_FIELD_NUMBER = 2;
    public static final int FEATURE_ID_FIELD_NUMBER = 10;
    public static final int MEASUREMENT_ID_FIELD_NUMBER = 11;
    public static final int METADATA_FIELD_NUMBER = 14;
    public static final int ONGOING_POINT_FEATURE_IDS_FIELD_NUMBER = 4;
    public static final int ONGOING_POINT_TIMESTAMPS_FIELD_NUMBER = 3;
    public static final int PARENT_EPOCH_OFFSET_FIELD_NUMBER = 13;
    public static final int PARENT_MEASUREMENT_ID_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int POINT_DURATIONS_FIELD_NUMBER = 8;
    public static final int POINT_FEATURE_IDS_FIELD_NUMBER = 9;
    public static final int POINT_TIMESTAMPS_FIELD_NUMBER = 7;
    private int bitField0_;
    private String category_;
    private qng0 dimensions_;
    private int errorCode_;
    private qng0 errorData_;
    private String featureId_;
    private String measurementId_;
    private qng0 metadata_;
    private qng0 ongoingPointFeatureIds_;
    private qng0 ongoingPointTimestamps_;
    private long parentEpochOffset_;
    private String parentMeasurementId_;
    private qng0 pointDurations_;
    private qng0 pointFeatureIds_;
    private qng0 pointTimestamps_;

    static {
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = new TimeMeasurementErrorNonAuth();
        DEFAULT_INSTANCE = timeMeasurementErrorNonAuth;
        com.google.protobuf.h.registerDefaultInstance(TimeMeasurementErrorNonAuth.class, timeMeasurementErrorNonAuth);
    }

    private TimeMeasurementErrorNonAuth() {
        qng0 qng0Var = qng0.b;
        this.errorData_ = qng0Var;
        this.ongoingPointTimestamps_ = qng0Var;
        this.ongoingPointFeatureIds_ = qng0Var;
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

    public static vne1 v() {
        return (vne1) DEFAULT_INSTANCE.createBuilder();
    }

    public static vne1 w(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        return (vne1) DEFAULT_INSTANCE.createBuilder(timeMeasurementErrorNonAuth);
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.measurementId_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.parentMeasurementId_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\b\u0000\u0000\u0001င\u0000\u00022\u00032\u00042\u0005ဈ\u0001\u00062\u00072\b2\t2\nဈ\u0002\u000bဈ\u0003\fဈ\u0004\rဂ\u0005\u000e2", new Object[]{"bitField0_", "errorCode_", "errorData_", xne1.a, "ongoingPointTimestamps_", aoe1.a, "ongoingPointFeatureIds_", zne1.a, "category_", "dimensions_", wne1.a, "pointTimestamps_", doe1.a, "pointDurations_", boe1.a, "pointFeatureIds_", coe1.a, "featureId_", "measurementId_", "parentMeasurementId_", "parentEpochOffset_", "metadata_", yne1.a});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementErrorNonAuth();
        }
        if (iOrdinal == 4) {
            return new vne1(DEFAULT_INSTANCE);
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
        synchronized (TimeMeasurementErrorNonAuth.class) {
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
        qng0 qng0Var = this.errorData_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.errorData_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 p() {
        qng0 qng0Var = this.metadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metadata_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 q() {
        qng0 qng0Var = this.ongoingPointFeatureIds_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.ongoingPointFeatureIds_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 r() {
        qng0 qng0Var = this.ongoingPointTimestamps_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.ongoingPointTimestamps_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 s() {
        qng0 qng0Var = this.pointDurations_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.pointDurations_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 t() {
        qng0 qng0Var = this.pointFeatureIds_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.pointFeatureIds_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final qng0 u() {
        qng0 qng0Var = this.pointTimestamps_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.pointTimestamps_ = qng0VarH;
        return qng0VarH;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.category_ = str;
    }

    public final void y(int i) {
        this.bitField0_ |= 1;
        this.errorCode_ = i;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.featureId_ = str;
    }
}
