package com.spotify.adsinternal.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fzd;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CarouselItem extends h implements v2j0 {
    private static final CarouselItem DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RENDER_POSITION_FIELD_NUMBER = 2;
    private String itemId_ = "";
    private int renderPosition_;

    static {
        CarouselItem carouselItem = new CarouselItem();
        DEFAULT_INSTANCE = carouselItem;
        h.registerDefaultInstance(CarouselItem.class, carouselItem);
    }

    private CarouselItem() {
    }

    public static fzd n() {
        return (fzd) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"itemId_", "renderPosition_"});
        }
        if (iOrdinal == 3) {
            return new CarouselItem();
        }
        if (iOrdinal == 4) {
            return new fzd(DEFAULT_INSTANCE);
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
        synchronized (CarouselItem.class) {
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
        this.itemId_ = str;
    }

    public final void p(int i) {
        this.renderPosition_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
