package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.m1i;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PDPComponent extends h implements v2j0 {
    public static final int BENEFITS_FIELD_NUMBER = 5;
    public static final int COMPONENT_TYPE_FIELD_NUMBER = 1;
    private static final PDPComponent DEFAULT_INSTANCE;
    public static final int FEATURE_CARD_FIELD_NUMBER = 8;
    public static final int GROUPED_OFFER_CARDS_FIELD_NUMBER = 9;
    public static final int HEADER_CTA_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int LEGAL_TEXT_FIELD_NUMBER = 4;
    public static final int OFFER_CARD_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_HEADER_FIELD_NUMBER = 6;
    private int componentCase_ = 0;
    private int componentType_;
    private Object component_;

    static {
        PDPComponent pDPComponent = new PDPComponent();
        DEFAULT_INSTANCE = pDPComponent;
        h.registerDefaultInstance(PDPComponent.class, pDPComponent);
    }

    private PDPComponent() {
    }

    public static PDPComponent p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"component_", "componentCase_", "componentType_", PremiumPageHeader.class, HeaderCTA.class, PremiumLegalText.class, PremiumBenefitsSection.class, PremiumSectionHeader.class, PremiumOfferCard.class, PremiumFeatureCard.class, GroupedOfferCards.class});
        }
        if (iOrdinal == 3) {
            return new PDPComponent();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (PDPComponent.class) {
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

    public final PremiumBenefitsSection n() {
        return this.componentCase_ == 5 ? (PremiumBenefitsSection) this.component_ : PremiumBenefitsSection.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final m1i o() {
        m1i m1iVar;
        switch (this.componentType_) {
            case 0:
                m1iVar = m1i.UNKNOWN;
                break;
            case 1:
                m1iVar = m1i.HEADER;
                break;
            case 2:
                m1iVar = m1i.HEADER_CTA;
                break;
            case 3:
                m1iVar = m1i.LEGAL_TEXT;
                break;
            case 4:
                m1iVar = m1i.BENEFITS;
                break;
            case 5:
                m1iVar = m1i.SECTION_HEADER;
                break;
            case 6:
                m1iVar = m1i.OFFER_CARD;
                break;
            case 7:
                m1iVar = m1i.GROUPED_OFFER_CARDS;
                break;
            case 8:
                m1iVar = m1i.FEATURE_CARD;
                break;
            default:
                m1iVar = null;
                break;
        }
        return m1iVar == null ? m1i.UNRECOGNIZED : m1iVar;
    }

    public final PremiumFeatureCard q() {
        return this.componentCase_ == 8 ? (PremiumFeatureCard) this.component_ : PremiumFeatureCard.p();
    }

    public final GroupedOfferCards r() {
        return this.componentCase_ == 9 ? (GroupedOfferCards) this.component_ : GroupedOfferCards.o();
    }

    public final PremiumPageHeader s() {
        return this.componentCase_ == 2 ? (PremiumPageHeader) this.component_ : PremiumPageHeader.n();
    }

    public final HeaderCTA t() {
        return this.componentCase_ == 3 ? (HeaderCTA) this.component_ : HeaderCTA.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final PremiumLegalText u() {
        return this.componentCase_ == 4 ? (PremiumLegalText) this.component_ : PremiumLegalText.n();
    }

    public final PremiumOfferCard v() {
        return this.componentCase_ == 7 ? (PremiumOfferCard) this.component_ : PremiumOfferCard.q();
    }

    public final PremiumSectionHeader w() {
        return this.componentCase_ == 6 ? (PremiumSectionHeader) this.component_ : PremiumSectionHeader.n();
    }
}
