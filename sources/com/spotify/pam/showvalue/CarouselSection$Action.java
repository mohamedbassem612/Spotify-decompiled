package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.g0e;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CarouselSection$Action extends h implements v2j0 {
    private static final CarouselSection$Action DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String label_ = "";
    private int type_;

    static {
        CarouselSection$Action carouselSection$Action = new CarouselSection$Action();
        DEFAULT_INSTANCE = carouselSection$Action;
        h.registerDefaultInstance(CarouselSection$Action.class, carouselSection$Action);
    }

    private CarouselSection$Action() {
    }

    public static CarouselSection$Action n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"bitField0_", "type_", "label_"});
        }
        if (iOrdinal == 3) {
            return new CarouselSection$Action();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (CarouselSection$Action.class) {
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

    public final String o() {
        return this.label_;
    }

    public final g0e p() {
        g0e g0eVar;
        int i = this.type_;
        if (i == 0) {
            g0eVar = g0e.ACTION_UNKNOWN;
        } else if (i == 1) {
            g0eVar = g0e.ACTION_DOWNLOAD;
        } else if (i == 2) {
            g0eVar = g0e.ACTION_SAVE;
        } else if (i != 3) {
            g0eVar = i != 4 ? null : g0e.ACTION_ADD_TO_QUEUE;
        } else {
            g0eVar = g0e.ACTION_MIX;
        }
        return g0eVar == null ? g0e.UNRECOGNIZED : g0eVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
