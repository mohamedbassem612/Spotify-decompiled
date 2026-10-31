package com.spotify.upselloffer.endpointimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class UpsellOffer extends h implements v2j0 {
    public static final int CTA_LINK_FIELD_NUMBER = 2;
    public static final int CTA_TEXT_FIELD_NUMBER = 1;
    private static final UpsellOffer DEFAULT_INSTANCE;
    public static final int LEGAL_DISCLAIMER_FIELD_NUMBER = 5;
    public static final int OFFER_END_DATE_FIELD_NUMBER = 4;
    public static final int OFFER_UUID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String ctaText_ = "";
    private String ctaLink_ = "";
    private String offerUuid_ = "";
    private String offerEndDate_ = "";
    private String legalDisclaimer_ = "";

    static {
        UpsellOffer upsellOffer = new UpsellOffer();
        DEFAULT_INSTANCE = upsellOffer;
        h.registerDefaultInstance(UpsellOffer.class, upsellOffer);
    }

    private UpsellOffer() {
    }

    public static UpsellOffer p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ȉ\u0004ለ\u0002\u0005ለ\u0003", new Object[]{"bitField0_", "ctaText_", "ctaLink_", "offerUuid_", "offerEndDate_", "legalDisclaimer_"});
        }
        if (iOrdinal == 3) {
            return new UpsellOffer();
        }
        if (iOrdinal == 4) {
            return new sug1(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (UpsellOffer.class) {
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
        return this.ctaLink_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ctaText_;
    }

    public final String q() {
        return this.legalDisclaimer_;
    }

    public final String r() {
        return this.offerEndDate_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }
}
