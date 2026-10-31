package com.spotify.mostplayed.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Chart extends h implements v2j0 {
    private static final Chart DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 4;
    public static final int ENTRIES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_COUNT_FIELD_NUMBER = 2;
    public static final int START_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp end_;
    private h290 entries_ = h.emptyProtobufList();
    private int playCount_;
    private Timestamp start_;

    static {
        Chart chart = new Chart();
        DEFAULT_INSTANCE = chart;
        h.registerDefaultInstance(Chart.class, chart);
    }

    private Chart() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "entries_", ChartEntry.class, "playCount_", "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new Chart();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (Chart.class) {
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

    public final h290 n() {
        return this.entries_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
