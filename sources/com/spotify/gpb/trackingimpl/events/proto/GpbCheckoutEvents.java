package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.h;
import p.b550;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GpbCheckoutEvents extends h implements v2j0 {
    public static final int ACCEPT_LANGUAGE_FIELD_NUMBER = 14;
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int BILLING_CHOICE_FIELD_NUMBER = 7;
    public static final int CURRENT_STEP_FIELD_NUMBER = 2;
    private static final GpbCheckoutEvents DEFAULT_INSTANCE;
    public static final int GPB_SESSION_ID_FIELD_NUMBER = 10;
    public static final int G_ORDER_ID_FIELD_NUMBER = 9;
    public static final int OFFER_COUNTRY_FIELD_NUMBER = 5;
    public static final int OFFER_TYPE_ID_FIELD_NUMBER = 12;
    public static final int OFFER_UUID_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_SDK_VIEW_ID_FIELD_NUMBER = 13;
    public static final int PREMIUM_CHECKOUT_PAGE_CORRELATION_ID_FIELD_NUMBER = 15;
    public static final int PURCHASE_STATUS_FIELD_NUMBER = 8;
    public static final int REGISTRATION_COUNTRY_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int VARIANT_FIELD_NUMBER = 11;
    private int bitField0_;
    private String action_ = "";
    private String currentStep_ = "";
    private String source_ = "";
    private String registrationCountry_ = "";
    private String offerCountry_ = "";
    private String offerUuid_ = "";
    private String billingChoice_ = "";
    private String purchaseStatus_ = "";
    private String gOrderId_ = "";
    private String gpbSessionId_ = "";
    private String variant_ = "";
    private String offerTypeId_ = "";
    private String paymentSdkViewId_ = "";
    private String acceptLanguage_ = "";
    private String premiumCheckoutPageCorrelationId_ = "";

    static {
        GpbCheckoutEvents gpbCheckoutEvents = new GpbCheckoutEvents();
        DEFAULT_INSTANCE = gpbCheckoutEvents;
        h.registerDefaultInstance(GpbCheckoutEvents.class, gpbCheckoutEvents);
    }

    private GpbCheckoutEvents() {
    }

    public static b550 n() {
        return (b550) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e", new Object[]{"bitField0_", "action_", "currentStep_", "source_", "registrationCountry_", "offerCountry_", "offerUuid_", "billingChoice_", "purchaseStatus_", "gOrderId_", "gpbSessionId_", "variant_", "offerTypeId_", "paymentSdkViewId_", "acceptLanguage_", "premiumCheckoutPageCorrelationId_"});
        }
        if (iOrdinal == 3) {
            return new GpbCheckoutEvents();
        }
        if (iOrdinal == 4) {
            return new b550(DEFAULT_INSTANCE);
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
        synchronized (GpbCheckoutEvents.class) {
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
        this.bitField0_ |= 1;
        this.action_ = str;
    }

    public final void p() {
        this.bitField0_ |= 64;
        this.billingChoice_ = "SPOTIFY";
    }

    public final void q() {
        this.bitField0_ |= 2;
        this.currentStep_ = "native_billing_client";
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.gOrderId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 512;
        this.gpbSessionId_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 128;
        this.purchaseStatus_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 4;
        this.source_ = str;
    }
}
