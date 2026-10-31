package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Pricing extends h implements v2j0 {
    private static final Pricing DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_BODY_FIELD_NUMBER = 1;
    public static final int TWO_ROWS_FIELD_NUMBER = 2;
    private int layoutCase_ = 0;
    private Object layout_;

    static {
        Pricing pricing = new Pricing();
        DEFAULT_INSTANCE = pricing;
        h.registerDefaultInstance(Pricing.class, pricing);
    }

    private Pricing() {
    }

    public static Pricing n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"layout_", "layoutCase_", TitleBodyPricing.class, TwoRowPricing.class});
        }
        if (iOrdinal == 3) {
            return new Pricing();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (Pricing.class) {
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

    public final TitleBodyPricing o() {
        return this.layoutCase_ == 1 ? (TitleBodyPricing) this.layout_ : TitleBodyPricing.o();
    }

    public final TwoRowPricing p() {
        return this.layoutCase_ == 2 ? (TwoRowPricing) this.layout_ : TwoRowPricing.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
