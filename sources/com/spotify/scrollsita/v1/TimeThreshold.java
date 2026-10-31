package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class TimeThreshold extends h implements v2j0 {
    private static final TimeThreshold DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SECONDS_BEFORE_END_FIELD_NUMBER = 2;
    public static final int SECONDS_FROM_START_FIELD_NUMBER = 1;
    private int anchorCase_ = 0;
    private Object anchor_;

    static {
        TimeThreshold timeThreshold = new TimeThreshold();
        DEFAULT_INSTANCE = timeThreshold;
        h.registerDefaultInstance(TimeThreshold.class, timeThreshold);
    }

    private TimeThreshold() {
    }

    public static TimeThreshold o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00014\u0000\u00024\u0000", new Object[]{"anchor_", "anchorCase_"});
        }
        if (iOrdinal == 3) {
            return new TimeThreshold();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (TimeThreshold.class) {
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

    public final int n() {
        int i = this.anchorCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final float p() {
        if (this.anchorCase_ == 2) {
            return ((Float) this.anchor_).floatValue();
        }
        return 0.0f;
    }

    public final float q() {
        if (this.anchorCase_ == 1) {
            return ((Float) this.anchor_).floatValue();
        }
        return 0.0f;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
