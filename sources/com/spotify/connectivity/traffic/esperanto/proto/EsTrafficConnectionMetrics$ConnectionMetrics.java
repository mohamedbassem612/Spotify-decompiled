package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.esz;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficConnectionMetrics$ConnectionMetrics extends h implements v2j0 {
    public static final int CONNECTION_TASK_END_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int CONNECTION_TASK_START_TIMESTAMP_FIELD_NUMBER = 3;
    private static final EsTrafficConnectionMetrics$ConnectionMetrics DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECT_COUNT_FIELD_NUMBER = 2;
    public static final int TRANSACTIONS_FIELD_NUMBER = 5;
    private long connectionTaskEndTimestamp_;
    private long connectionTaskStartTimestamp_;
    private double durationSeconds_;
    private int redirectCount_;
    private h290 transactions_ = h.emptyProtobufList();

    static {
        EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics = new EsTrafficConnectionMetrics$ConnectionMetrics();
        DEFAULT_INSTANCE = esTrafficConnectionMetrics$ConnectionMetrics;
        h.registerDefaultInstance(EsTrafficConnectionMetrics$ConnectionMetrics.class, esTrafficConnectionMetrics$ConnectionMetrics);
    }

    private EsTrafficConnectionMetrics$ConnectionMetrics() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsTrafficConnectionMetrics$ConnectionMetrics q() {
        return DEFAULT_INSTANCE;
    }

    public static esz u() {
        return (esz) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0000\u0002\u000b\u0003\u0002\u0004\u0002\u0005\u001b", new Object[]{"durationSeconds_", "redirectCount_", "connectionTaskStartTimestamp_", "connectionTaskEndTimestamp_", "transactions_", EsTrafficTransactionMetrics$TransactionMetrics.class});
        }
        if (iOrdinal == 3) {
            return new EsTrafficConnectionMetrics$ConnectionMetrics();
        }
        if (iOrdinal == 4) {
            return new esz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficConnectionMetrics$ConnectionMetrics.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.transactions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.transactions_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.connectionTaskEndTimestamp_;
    }

    public final long p() {
        return this.connectionTaskStartTimestamp_;
    }

    public final double r() {
        return this.durationSeconds_;
    }

    public final int s() {
        return this.redirectCount_;
    }

    public final h290 t() {
        return this.transactions_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void v(long j) {
        this.connectionTaskEndTimestamp_ = j;
    }

    public final void w(long j) {
        this.connectionTaskStartTimestamp_ = j;
    }

    public final void x(double d) {
        this.durationSeconds_ = d;
    }

    public final void y(int i) {
        this.redirectCount_ = i;
    }
}
