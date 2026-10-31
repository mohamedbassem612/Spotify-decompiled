package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EngagementExplanation extends h implements v2j0 {
    public static final int ACTION_TYPE_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 3;
    public static final int BODY_SECONDARY_FIELD_NUMBER = 7;
    public static final int CTA_FIELD_NUMBER = 4;
    private static final EngagementExplanation DEFAULT_INSTANCE;
    public static final int DISMISS_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IS_PRICE_DISPLAYED_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isPriceDisplayed_;
    private AudiobookPriceOuterClass$AudiobookPrice price_;
    private String header_ = "";
    private String title_ = "";
    private String body_ = "";
    private String cta_ = "";
    private String dismiss_ = "";
    private String actionType_ = "";
    private String bodySecondary_ = "";

    static {
        EngagementExplanation engagementExplanation = new EngagementExplanation();
        DEFAULT_INSTANCE = engagementExplanation;
        h.registerDefaultInstance(EngagementExplanation.class, engagementExplanation);
    }

    private EngagementExplanation() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EngagementExplanation s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000\t\u0007", new Object[]{"bitField0_", "header_", "title_", "body_", "cta_", "dismiss_", "actionType_", "bodySecondary_", "price_", "isPriceDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new EngagementExplanation();
        }
        if (iOrdinal == 4) {
            return new c8x((byte) 5);
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
        synchronized (EngagementExplanation.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.actionType_;
    }

    public final String p() {
        return this.body_;
    }

    public final String q() {
        return this.bodySecondary_;
    }

    public final String r() {
        return this.cta_;
    }

    public final String t() {
        return this.dismiss_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.header_;
    }

    public final boolean v() {
        return this.isPriceDisplayed_;
    }

    public final AudiobookPriceOuterClass$AudiobookPrice w() {
        AudiobookPriceOuterClass$AudiobookPrice audiobookPriceOuterClass$AudiobookPrice = this.price_;
        return audiobookPriceOuterClass$AudiobookPrice == null ? AudiobookPriceOuterClass$AudiobookPrice.o() : audiobookPriceOuterClass$AudiobookPrice;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }
}
