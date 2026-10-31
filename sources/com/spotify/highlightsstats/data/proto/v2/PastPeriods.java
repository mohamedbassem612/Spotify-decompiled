package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PastPeriods extends h implements v2j0 {
    private static final PastPeriods DEFAULT_INSTANCE;
    public static final int EMPTY_PERIOD_FIELD_NUMBER = 3;
    public static final int INDIVIDUAL_AVAILABLE_PERIOD_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOCIAL_AVAILABLE_PERIOD_FIELD_NUMBER = 2;
    private int periodsCase_ = 0;
    private Object periods_;

    static {
        PastPeriods pastPeriods = new PastPeriods();
        DEFAULT_INSTANCE = pastPeriods;
        h.registerDefaultInstance(PastPeriods.class, pastPeriods);
    }

    private PastPeriods() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"periods_", "periodsCase_", AvailablePeriod.class, SocialAvailablePeriod.class, EmptyPeriod.class});
        }
        if (iOrdinal == 3) {
            return new PastPeriods();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (PastPeriods.class) {
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

    public final EmptyPeriod n() {
        return this.periodsCase_ == 3 ? (EmptyPeriod) this.periods_ : EmptyPeriod.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AvailablePeriod o() {
        return this.periodsCase_ == 1 ? (AvailablePeriod) this.periods_ : AvailablePeriod.p();
    }

    public final int p() {
        int i = this.periodsCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final SocialAvailablePeriod q() {
        return this.periodsCase_ == 2 ? (SocialAvailablePeriod) this.periods_ : SocialAvailablePeriod.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
