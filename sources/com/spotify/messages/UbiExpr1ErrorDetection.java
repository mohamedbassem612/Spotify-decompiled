package com.spotify.messages;

import p.bf40;
import p.c7h1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class UbiExpr1ErrorDetection extends com.google.protobuf.h implements v2j0 {
    public static final int BREADCRUMBS_FIELD_NUMBER = 2;
    private static final UbiExpr1ErrorDetection DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private String reason_ = "";
    private String breadcrumbs_ = "";

    static {
        UbiExpr1ErrorDetection ubiExpr1ErrorDetection = new UbiExpr1ErrorDetection();
        DEFAULT_INSTANCE = ubiExpr1ErrorDetection;
        com.google.protobuf.h.registerDefaultInstance(UbiExpr1ErrorDetection.class, ubiExpr1ErrorDetection);
    }

    private UbiExpr1ErrorDetection() {
    }

    public static c7h1 n() {
        return (c7h1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "reason_", "breadcrumbs_"});
        }
        if (iOrdinal == 3) {
            return new UbiExpr1ErrorDetection();
        }
        if (iOrdinal == 4) {
            return new c7h1(DEFAULT_INSTANCE);
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
        synchronized (UbiExpr1ErrorDetection.class) {
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

    public final void o(String str) {
        this.bitField0_ |= 2;
        this.breadcrumbs_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.reason_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
