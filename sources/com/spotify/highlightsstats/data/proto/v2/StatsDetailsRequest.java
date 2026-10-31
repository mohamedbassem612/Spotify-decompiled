package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ssb1;
import p.tnt;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class StatsDetailsRequest extends h implements v2j0 {
    private static final StatsDetailsRequest DEFAULT_INSTANCE;
    public static final int DETAILS_TYPE_FIELD_NUMBER = 3;
    public static final int LOOK_BACK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int detailsType_;
    private int lookBack_;
    private String timeZone_ = "";
    private Timestamp timestamp_;

    static {
        StatsDetailsRequest statsDetailsRequest = new StatsDetailsRequest();
        DEFAULT_INSTANCE = statsDetailsRequest;
        h.registerDefaultInstance(StatsDetailsRequest.class, statsDetailsRequest);
    }

    private StatsDetailsRequest() {
    }

    public static ssb1 n() {
        return (ssb1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004ဉ\u0000", new Object[]{"bitField0_", "lookBack_", "timeZone_", "detailsType_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new StatsDetailsRequest();
        }
        if (iOrdinal == 4) {
            return new ssb1(DEFAULT_INSTANCE);
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
        synchronized (StatsDetailsRequest.class) {
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

    public final void o(tnt tntVar) {
        this.detailsType_ = tntVar.getNumber();
    }

    public final void p(int i) {
        this.lookBack_ = i;
    }

    public final void q(String str) {
        this.timeZone_ = str;
    }

    public final void r(Timestamp timestamp) {
        this.timestamp_ = timestamp;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
