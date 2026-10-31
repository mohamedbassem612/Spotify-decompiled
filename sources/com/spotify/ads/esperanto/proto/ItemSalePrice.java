package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ItemSalePrice extends h implements v2j0 {
    private static final ItemSalePrice DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 1;
    public static final int SALE_PRICE_FIELD_NUMBER = 2;
    private String price_ = "";
    private String salePrice_ = "";

    static {
        ItemSalePrice itemSalePrice = new ItemSalePrice();
        DEFAULT_INSTANCE = itemSalePrice;
        h.registerDefaultInstance(ItemSalePrice.class, itemSalePrice);
    }

    private ItemSalePrice() {
    }

    public static ItemSalePrice n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"price_", "salePrice_"});
        }
        if (iOrdinal == 3) {
            return new ItemSalePrice();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (ItemSalePrice.class) {
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
        return this.price_;
    }

    public final String p() {
        return this.salePrice_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
