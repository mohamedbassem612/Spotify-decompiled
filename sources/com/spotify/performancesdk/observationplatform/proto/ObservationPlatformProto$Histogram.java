package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.e290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.t190;
import p.v2j0;
import p.vhp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ObservationPlatformProto$Histogram extends h implements v2j0 {
    public static final int BOUNDARIES_FIELD_NUMBER = 1;
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final ObservationPlatformProto$Histogram DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 4;
    private long count_;
    private double sum_;
    private int boundariesMemoizedSerializedSize = -1;
    private int bucketCountsMemoizedSerializedSize = -1;
    private t190 boundaries_ = h.emptyDoubleList();
    private e290 bucketCounts_ = h.emptyLongList();

    static {
        ObservationPlatformProto$Histogram observationPlatformProto$Histogram = new ObservationPlatformProto$Histogram();
        DEFAULT_INSTANCE = observationPlatformProto$Histogram;
        h.registerDefaultInstance(ObservationPlatformProto$Histogram.class, observationPlatformProto$Histogram);
    }

    private ObservationPlatformProto$Histogram() {
    }

    public static vhp0 p() {
        return (vhp0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001#\u0002%\u0003\u0002\u0004\u0000", new Object[]{"boundaries_", "bucketCounts_", "count_", "sum_"});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$Histogram();
        }
        if (iOrdinal == 4) {
            return new vhp0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$Histogram.class) {
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

    public final void n(Iterable iterable) {
        t190 t190VarMutableCopy = this.boundaries_;
        if (!((i9) t190VarMutableCopy).a) {
            t190VarMutableCopy = h.mutableCopy(t190VarMutableCopy);
            this.boundaries_ = t190VarMutableCopy;
        }
        s8.addAll(iterable, t190VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        e290 e290VarMutableCopy = this.bucketCounts_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.bucketCounts_ = e290VarMutableCopy;
        }
        s8.addAll(arrayList, e290VarMutableCopy);
    }

    public final void q(long j) {
        this.count_ = j;
    }

    public final void r(double d) {
        this.sum_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
