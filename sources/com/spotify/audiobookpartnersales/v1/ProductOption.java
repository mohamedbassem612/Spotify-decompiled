package com.spotify.audiobookpartnersales.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ProductOption extends h implements v2j0 {
    public static final int BOOKSHOP_FIELD_NUMBER = 6;
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int CURRENCY_FIELD_NUMBER = 9;
    private static final ProductOption DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 8;
    public static final int PRIORITY_FIELD_NUMBER = 7;
    public static final int PRODUCT_URL_FIELD_NUMBER = 3;
    public static final int SOURCE_NAME_FIELD_NUMBER = 5;
    private int bitField0_;
    private double price_;
    private int priority_;
    private Object vendorDetails_;
    private int vendorDetailsCase_ = 0;
    private String format_ = "";
    private String currency_ = "";
    private String productUrl_ = "";
    private String coverImageUrl_ = "";
    private String sourceName_ = "";

    static {
        ProductOption productOption = new ProductOption();
        DEFAULT_INSTANCE = productOption;
        h.registerDefaultInstance(ProductOption.class, productOption);
    }

    private ProductOption() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001ለ\u0000\u0003ለ\u0003\u0004ለ\u0004\u0005ለ\u0005\u0006<\u0000\u0007င\u0006\bက\u0001\tለ\u0002", new Object[]{"vendorDetails_", "vendorDetailsCase_", "bitField0_", "format_", "productUrl_", "coverImageUrl_", "sourceName_", BookshopDetails.class, "priority_", "price_", "currency_"});
        }
        if (iOrdinal == 3) {
            return new ProductOption();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ProductOption.class) {
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

    public final String getFormat() {
        return this.format_;
    }

    public final BookshopDetails n() {
        return this.vendorDetailsCase_ == 6 ? (BookshopDetails) this.vendorDetails_ : BookshopDetails.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.coverImageUrl_;
    }

    public final String p() {
        return this.currency_;
    }

    public final double q() {
        return this.price_;
    }

    public final int r() {
        return this.priority_;
    }

    public final String s() {
        return this.productUrl_;
    }

    public final String t() {
        return this.sourceName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.vendorDetailsCase_ == 6;
    }

    public final boolean v() {
        return (this.bitField0_ & 64) != 0;
    }
}
