package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RgbaColor extends h implements v2j0 {
    public static final int A_FIELD_NUMBER = 4;
    public static final int B_FIELD_NUMBER = 3;
    private static final RgbaColor DEFAULT_INSTANCE;
    public static final int G_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int R_FIELD_NUMBER = 1;
    private int a_;
    private int b_;
    private int g_;
    private int r_;

    static {
        RgbaColor rgbaColor = new RgbaColor();
        DEFAULT_INSTANCE = rgbaColor;
        h.registerDefaultInstance(RgbaColor.class, rgbaColor);
    }

    private RgbaColor() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static RgbaColor q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"r_", "g_", "b_", "a_"});
        }
        if (iOrdinal == 3) {
            return new RgbaColor();
        }
        if (iOrdinal == 4) {
            return new u831();
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
        synchronized (RgbaColor.class) {
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

    public final int o() {
        return this.a_;
    }

    public final int p() {
        return this.b_;
    }

    public final int r() {
        return this.g_;
    }

    public final int s() {
        return this.r_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
