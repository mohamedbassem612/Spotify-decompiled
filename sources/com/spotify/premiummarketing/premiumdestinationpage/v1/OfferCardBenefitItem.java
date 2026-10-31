package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class OfferCardBenefitItem extends h implements v2j0 {
    private static final OfferCardBenefitItem DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private String icon_ = "";
    private String textColor_ = "";
    private String state_ = "";

    static {
        OfferCardBenefitItem offerCardBenefitItem = new OfferCardBenefitItem();
        DEFAULT_INSTANCE = offerCardBenefitItem;
        h.registerDefaultInstance(OfferCardBenefitItem.class, offerCardBenefitItem);
    }

    private OfferCardBenefitItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "text_", "icon_", "textColor_", "state_"});
        }
        if (iOrdinal == 3) {
            return new OfferCardBenefitItem();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (OfferCardBenefitItem.class) {
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
        return this.icon_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.state_;
    }

    public final String p() {
        return this.text_;
    }

    public final String q() {
        return this.textColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
