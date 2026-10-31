package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PremiumOfferCTA extends h implements v2j0 {
    public static final int CTA_CLICK_EVENT_FIELD_NUMBER = 2;
    private static final PremiumOfferCTA DEFAULT_INSTANCE;
    public static final int FLAVOR_PAGE_VIEW_MODEL_FIELD_NUMBER = 4;
    public static final int LOGGING_INFO_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RENDER_SECONDARY_AS_PRIMARY_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private CTAClickEvent ctaClickEvent_;
    private FlavorPageViewModel flavorPageViewModel_;
    private LoggingInfo loggingInfo_;
    private boolean renderSecondaryAsPrimary_;
    private String title_ = "";

    static {
        PremiumOfferCTA premiumOfferCTA = new PremiumOfferCTA();
        DEFAULT_INSTANCE = premiumOfferCTA;
        h.registerDefaultInstance(PremiumOfferCTA.class, premiumOfferCTA);
    }

    private PremiumOfferCTA() {
    }

    public static PremiumOfferCTA o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003\u0007\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "title_", "ctaClickEvent_", "renderSecondaryAsPrimary_", "flavorPageViewModel_", "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumOfferCTA();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (PremiumOfferCTA.class) {
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

    public final CTAClickEvent n() {
        CTAClickEvent cTAClickEvent = this.ctaClickEvent_;
        return cTAClickEvent == null ? CTAClickEvent.o() : cTAClickEvent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final FlavorPageViewModel p() {
        FlavorPageViewModel flavorPageViewModel = this.flavorPageViewModel_;
        return flavorPageViewModel == null ? FlavorPageViewModel.p() : flavorPageViewModel;
    }

    public final LoggingInfo q() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.o() : loggingInfo;
    }

    public final boolean r() {
        return this.renderSecondaryAsPrimary_;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
