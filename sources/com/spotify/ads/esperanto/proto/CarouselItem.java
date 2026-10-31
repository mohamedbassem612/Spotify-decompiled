package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class CarouselItem extends h implements v2j0 {
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 3;
    private static final CarouselItem DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 4;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 6;
    public static final int SALE_PRICE_FIELD_NUMBER = 7;
    public static final int TAGLINE_FIELD_NUMBER = 2;
    public static final int VIDEO_FIELD_NUMBER = 5;
    private Object media_;
    private Object pricing_;
    private int mediaCase_ = 0;
    private int pricingCase_ = 0;
    private String itemId_ = "";
    private String tagline_ = "";
    private String clickthroughUrl_ = "";

    static {
        CarouselItem carouselItem = new CarouselItem();
        DEFAULT_INSTANCE = carouselItem;
        h.registerDefaultInstance(CarouselItem.class, carouselItem);
    }

    private CarouselItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0001\u0007<\u0001", new Object[]{"media_", "mediaCase_", "pricing_", "pricingCase_", "itemId_", "tagline_", "clickthroughUrl_", AdMedia.class, AdMedia.class, ItemPrice.class, ItemSalePrice.class});
        }
        if (iOrdinal == 3) {
            return new CarouselItem();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 21);
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

    public final String n() {
        return this.clickthroughUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AdMedia o() {
        return this.mediaCase_ == 4 ? (AdMedia) this.media_ : AdMedia.o();
    }

    public final String p() {
        return this.itemId_;
    }

    public final ItemPrice q() {
        return this.pricingCase_ == 6 ? (ItemPrice) this.pricing_ : ItemPrice.n();
    }

    public final ItemSalePrice r() {
        return this.pricingCase_ == 7 ? (ItemSalePrice) this.pricing_ : ItemSalePrice.n();
    }

    public final String s() {
        return this.tagline_;
    }

    public final AdMedia t() {
        return this.mediaCase_ == 5 ? (AdMedia) this.media_ : AdMedia.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.mediaCase_ == 4;
    }

    public final boolean v() {
        return this.pricingCase_ == 6;
    }

    public final boolean w() {
        return this.pricingCase_ == 7;
    }

    public final boolean x() {
        return this.mediaCase_ == 5;
    }
}
