package com.spotify.checkout.proto.model.v1.proto;

import p.b3d1;
import p.bf40;
import p.jf40;
import p.kl40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetCheckoutPageRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final GetCheckoutPageRequest DEFAULT_INSTANCE;
    public static final int GPB_COUNTRY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SUPPORTS_GPB_FIELD_NUMBER = 2;
    public static final int TRACKING_DATA_FIELD_NUMBER = 15;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String gpbCountry_ = "";
    private int supportsGpb_;
    private TrackingData trackingData_;

    static {
        GetCheckoutPageRequest getCheckoutPageRequest = new GetCheckoutPageRequest();
        DEFAULT_INSTANCE = getCheckoutPageRequest;
        com.google.protobuf.h.registerDefaultInstance(GetCheckoutPageRequest.class, getCheckoutPageRequest);
    }

    private GetCheckoutPageRequest() {
    }

    public static kl40 o() {
        return (kl40) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u000f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u000fဉ\u0000", new Object[]{"bitField0_", "checkoutSessionId_", "supportsGpb_", "gpbCountry_", "trackingData_"});
        }
        if (iOrdinal == 3) {
            return new GetCheckoutPageRequest();
        }
        if (iOrdinal == 4) {
            return new kl40(DEFAULT_INSTANCE);
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
        synchronized (GetCheckoutPageRequest.class) {
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
        return this.checkoutSessionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.checkoutSessionId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.gpbCountry_ = str;
    }

    public final void r(b3d1 b3d1Var) {
        this.supportsGpb_ = b3d1Var.getNumber();
    }

    public final void s(TrackingData trackingData) {
        trackingData.getClass();
        this.trackingData_ = trackingData;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
