package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.csv0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PremiumDestinationPageRequest extends h implements v2j0 {
    public static final int APP_STORE_FIELD_NUMBER = 16;
    public static final int BUILD_MODEL_FIELD_NUMBER = 6;
    public static final int CLIENT_TIME_ZONE_FIELD_NUMBER = 8;
    private static final PremiumDestinationPageRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    public static final int EXPERIMENTAL_RESOURCE_ID_FIELD_NUMBER = 2;
    public static final int MANUFACTURER_FIELD_NUMBER = 15;
    public static final int OVERRIDE_COUNTRY_FIELD_NUMBER = 11;
    public static final int OVERRIDE_ELIGIBILITY_FIELD_NUMBER = 10;
    public static final int OVERRIDE_HEADER_OFFER_UTC_STOP_DATE_FIELD_NUMBER = 13;
    public static final int OVERRIDE_PAGE_SOURCE_FIELD_NUMBER = 12;
    public static final int OVERRIDE_TIME_FIELD_NUMBER = 9;
    public static final int PAGE_ID_FIELD_NUMBER = 17;
    private static volatile qzr0 PARSER = null;
    public static final int PARTNER_ID_FIELD_NUMBER = 4;
    public static final int PREMIUM_PAGE_LOCALE_FIELD_NUMBER = 1;
    public static final int PREVIEW_ID_FIELD_NUMBER = 7;
    public static final int REFERRER_ID_FIELD_NUMBER = 5;
    public static final int SHOW_UNSAFE_UNPUBLISHED_CONTENT_FIELD_NUMBER = 14;
    private int bitField0_;
    private boolean showUnsafeUnpublishedContent_;
    private String premiumPageLocale_ = "";
    private String experimentalResourceId_ = "";
    private String deviceId_ = "";
    private String partnerId_ = "";
    private String referrerId_ = "";
    private String buildModel_ = "";
    private String previewId_ = "";
    private String clientTimeZone_ = "";
    private String overrideTime_ = "";
    private String overrideEligibility_ = "";
    private String overrideCountry_ = "";
    private String overridePageSource_ = "";
    private String overrideHeaderOfferUtcStopDate_ = "";
    private String manufacturer_ = "";
    private String appStore_ = "";
    private String pageId_ = "";

    static {
        PremiumDestinationPageRequest premiumDestinationPageRequest = new PremiumDestinationPageRequest();
        DEFAULT_INSTANCE = premiumDestinationPageRequest;
        h.registerDefaultInstance(PremiumDestinationPageRequest.class, premiumDestinationPageRequest);
    }

    private PremiumDestinationPageRequest() {
    }

    public static csv0 n() {
        return (csv0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.partnerId_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.premiumPageLocale_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.referrerId_ = str;
    }

    public final void D(boolean z) {
        this.bitField0_ |= 4096;
        this.showUnsafeUnpublishedContent_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006ለ\u0004\u0007ለ\u0005\bለ\u0006\tለ\u0007\nለ\b\u000bለ\t\fለ\n\rለ\u000b\u000eဇ\f\u000fለ\r\u0010ለ\u000e\u0011ለ\u000f", new Object[]{"bitField0_", "premiumPageLocale_", "experimentalResourceId_", "deviceId_", "partnerId_", "referrerId_", "buildModel_", "previewId_", "clientTimeZone_", "overrideTime_", "overrideEligibility_", "overrideCountry_", "overridePageSource_", "overrideHeaderOfferUtcStopDate_", "showUnsafeUnpublishedContent_", "manufacturer_", "appStore_", "pageId_"});
        }
        if (iOrdinal == 3) {
            return new PremiumDestinationPageRequest();
        }
        if (iOrdinal == 4) {
            return new csv0(DEFAULT_INSTANCE);
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
        synchronized (PremiumDestinationPageRequest.class) {
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
        this.bitField0_ |= 16384;
        this.appStore_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.buildModel_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.clientTimeZone_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.deviceId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 1;
        this.experimentalResourceId_ = str;
    }

    public final void setPreviewId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.previewId_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 8192;
        this.manufacturer_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 512;
        this.overrideCountry_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.overrideEligibility_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.overrideHeaderOfferUtcStopDate_ = str;
    }

    public final void x(String str) {
        this.bitField0_ |= 1024;
        this.overridePageSource_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.overrideTime_ = str;
    }

    public final void z(String str) {
        this.bitField0_ |= 32768;
        this.pageId_ = str;
    }
}
