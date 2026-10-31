package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.InclusiveInterval;
import p.bf40;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class StatsDetailsIntervalRequest extends h implements v2j0 {
    private static final StatsDetailsIntervalRequest DEFAULT_INSTANCE;
    public static final int DETAILS_TYPE_FIELD_NUMBER = 3;
    public static final int INTERVAL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int detailsType_;
    private InclusiveInterval interval_;
    private String timeZone_ = "";

    static {
        StatsDetailsIntervalRequest statsDetailsIntervalRequest = new StatsDetailsIntervalRequest();
        DEFAULT_INSTANCE = statsDetailsIntervalRequest;
        h.registerDefaultInstance(StatsDetailsIntervalRequest.class, statsDetailsIntervalRequest);
    }

    private StatsDetailsIntervalRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f", new Object[]{"bitField0_", "interval_", "timeZone_", "detailsType_"});
        }
        if (iOrdinal == 3) {
            return new StatsDetailsIntervalRequest();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (StatsDetailsIntervalRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
