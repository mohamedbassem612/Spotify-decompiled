package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class OfferCard extends h implements v2j0 {
    public static final int BUTTON_TEXT_FIELD_NUMBER = 6;
    public static final int BUTTON_URI_FIELD_NUMBER = 7;
    public static final int COLOR_FIELD_NUMBER = 2;
    private static final OfferCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ITEM_DISCLAIMER_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 3;
    private String name_ = "";
    private String color_ = "";
    private String price_ = "";
    private String description_ = "";
    private String itemDisclaimer_ = "";
    private String buttonText_ = "";
    private String buttonUri_ = "";

    static {
        OfferCard offerCard = new OfferCard();
        DEFAULT_INSTANCE = offerCard;
        h.registerDefaultInstance(OfferCard.class, offerCard);
    }

    private OfferCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static OfferCard q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"name_", "color_", "price_", "description_", "itemDisclaimer_", "buttonText_", "buttonUri_"});
        }
        if (iOrdinal == 3) {
            return new OfferCard();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (OfferCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.buttonText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.buttonUri_;
    }

    public final String p() {
        return this.color_;
    }

    public final String r() {
        return this.itemDisclaimer_;
    }

    public final String s() {
        return this.price_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
