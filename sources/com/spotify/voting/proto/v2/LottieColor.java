package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class LottieColor extends h implements v2j0 {
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final LottieColor DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STROKE_COLOR_FIELD_NUMBER = 2;
    private int valueCase_ = 0;
    private Object value_;

    static {
        LottieColor lottieColor = new LottieColor();
        DEFAULT_INSTANCE = lottieColor;
        h.registerDefaultInstance(LottieColor.class, lottieColor);
    }

    private LottieColor() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"value_", "valueCase_", Color.class, StrokeColor.class});
        }
        if (iOrdinal == 3) {
            return new LottieColor();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (LottieColor.class) {
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

    public final Color n() {
        return this.valueCase_ == 1 ? (Color) this.value_ : Color.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final StrokeColor o() {
        return this.valueCase_ == 2 ? (StrokeColor) this.value_ : StrokeColor.o();
    }

    public final int p() {
        int i = this.valueCase_;
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
