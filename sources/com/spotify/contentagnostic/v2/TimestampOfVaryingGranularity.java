package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.p3d1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TimestampOfVaryingGranularity extends h implements v2j0 {
    private static final TimestampOfVaryingGranularity DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int YEAR_AND_MONTH_FIELD_NUMBER = 2;
    public static final int YEAR_FIELD_NUMBER = 1;
    public static final int YEAR_MONTH_AND_DAY_FIELD_NUMBER = 3;
    private int timestampCase_ = 0;
    private Object timestamp_;

    static {
        TimestampOfVaryingGranularity timestampOfVaryingGranularity = new TimestampOfVaryingGranularity();
        DEFAULT_INSTANCE = timestampOfVaryingGranularity;
        h.registerDefaultInstance(TimestampOfVaryingGranularity.class, timestampOfVaryingGranularity);
    }

    private TimestampOfVaryingGranularity() {
    }

    public static TimestampOfVaryingGranularity o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"timestamp_", "timestampCase_", Year.class, YearMonth.class, YearMonthDay.class});
        }
        if (iOrdinal == 3) {
            return new TimestampOfVaryingGranularity();
        }
        if (iOrdinal == 4) {
            return new nzd1();
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
        synchronized (TimestampOfVaryingGranularity.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        return p3d1.a(this.timestampCase_);
    }

    public final Year q() {
        return this.timestampCase_ == 1 ? (Year) this.timestamp_ : Year.o();
    }

    public final YearMonth r() {
        return this.timestampCase_ == 2 ? (YearMonth) this.timestamp_ : YearMonth.o();
    }

    public final YearMonthDay s() {
        return this.timestampCase_ == 3 ? (YearMonthDay) this.timestamp_ : YearMonthDay.p();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
