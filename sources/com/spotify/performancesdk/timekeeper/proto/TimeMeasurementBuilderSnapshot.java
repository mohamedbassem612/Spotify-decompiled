package com.spotify.performancesdk.timekeeper.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.h290;
import p.jf40;
import p.nzd1;
import p.qne1;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.rne1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class TimeMeasurementBuilderSnapshot extends h implements v2j0 {
    public static final int CAPTURED_POINTS_FIELD_NUMBER = 4;
    public static final int CAPTURED_POINT_ENDS_FIELD_NUMBER = 3;
    public static final int CAPTURED_POINT_STARTS_FIELD_NUMBER = 2;
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final TimeMeasurementBuilderSnapshot DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 6;
    public static final int EPOCH_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 capturedPointEnds_;
    private h290 capturedPointStarts_;
    private h290 capturedPoints_;
    private String category_;
    private qng0 dimensions_;
    private long epochTimestamp_;
    private qng0 metadata_;

    static {
        TimeMeasurementBuilderSnapshot timeMeasurementBuilderSnapshot = new TimeMeasurementBuilderSnapshot();
        DEFAULT_INSTANCE = timeMeasurementBuilderSnapshot;
        h.registerDefaultInstance(TimeMeasurementBuilderSnapshot.class, timeMeasurementBuilderSnapshot);
    }

    private TimeMeasurementBuilderSnapshot() {
        qng0 qng0Var = qng0.b;
        this.dimensions_ = qng0Var;
        this.metadata_ = qng0Var;
        this.category_ = "";
        this.capturedPointStarts_ = h.emptyProtobufList();
        this.capturedPointEnds_ = h.emptyProtobufList();
        this.capturedPoints_ = h.emptyProtobufList();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static TimeMeasurementBuilderSnapshot u(byte[] bArr) {
        return (TimeMeasurementBuilderSnapshot) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0002\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\u001b\u0005ဃ\u0000\u00062\u00072", new Object[]{"bitField0_", "category_", "capturedPointStarts_", TimeMeasurementBuilderSnapshotCapturedPointStart.class, "capturedPointEnds_", TimeMeasurementBuilderSnapshotCapturedPointEnd.class, "capturedPoints_", TimeMeasurementBuilderSnapshotCapturedPoint.class, "epochTimestamp_", "dimensions_", qne1.a, "metadata_", rne1.a});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementBuilderSnapshot();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (TimeMeasurementBuilderSnapshot.class) {
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

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    public final h290 n() {
        return this.capturedPointEnds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.capturedPointStarts_;
    }

    public final h290 p() {
        return this.capturedPoints_;
    }

    public final String q() {
        return this.category_;
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.dimensions_);
    }

    public final long s() {
        return this.epochTimestamp_;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
