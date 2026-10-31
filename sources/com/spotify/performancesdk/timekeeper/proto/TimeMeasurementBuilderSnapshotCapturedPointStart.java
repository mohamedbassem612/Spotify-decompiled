package com.spotify.performancesdk.timekeeper.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class TimeMeasurementBuilderSnapshotCapturedPointStart extends h implements v2j0 {
    private static final TimeMeasurementBuilderSnapshotCapturedPointStart DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 2;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int IS_REQUIRED_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isRequired_;
    private long timestamp_;
    private String identifier_ = "";
    private String featureId_ = "";

    static {
        TimeMeasurementBuilderSnapshotCapturedPointStart timeMeasurementBuilderSnapshotCapturedPointStart = new TimeMeasurementBuilderSnapshotCapturedPointStart();
        DEFAULT_INSTANCE = timeMeasurementBuilderSnapshotCapturedPointStart;
        h.registerDefaultInstance(TimeMeasurementBuilderSnapshotCapturedPointStart.class, timeMeasurementBuilderSnapshotCapturedPointStart);
    }

    private TimeMeasurementBuilderSnapshotCapturedPointStart() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u0002\u0004\u0007", new Object[]{"bitField0_", "identifier_", "featureId_", "timestamp_", "isRequired_"});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementBuilderSnapshotCapturedPointStart();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (TimeMeasurementBuilderSnapshotCapturedPointStart.class) {
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

    public final long getTimestamp() {
        return this.timestamp_;
    }

    public final String n() {
        return this.featureId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.identifier_;
    }

    public final boolean p() {
        return this.isRequired_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
