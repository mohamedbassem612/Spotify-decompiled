package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.gq40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetSpotifyCheckoutPageRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final GetSpotifyCheckoutPageRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACKING_DATA_FIELD_NUMBER = 15;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private TrackingData trackingData_;

    static {
        GetSpotifyCheckoutPageRequest getSpotifyCheckoutPageRequest = new GetSpotifyCheckoutPageRequest();
        DEFAULT_INSTANCE = getSpotifyCheckoutPageRequest;
        com.google.protobuf.h.registerDefaultInstance(GetSpotifyCheckoutPageRequest.class, getSpotifyCheckoutPageRequest);
    }

    private GetSpotifyCheckoutPageRequest() {
    }

    public static GetSpotifyCheckoutPageRequest n() {
        return DEFAULT_INSTANCE;
    }

    public static gq40 o() {
        return (gq40) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u000f\u0002\u0000\u0000\u0000\u0001Ȉ\u000fဉ\u0000", new Object[]{"bitField0_", "checkoutSessionId_", "trackingData_"});
        }
        if (iOrdinal == 3) {
            return new GetSpotifyCheckoutPageRequest();
        }
        if (iOrdinal == 4) {
            return new gq40(DEFAULT_INSTANCE);
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
        synchronized (GetSpotifyCheckoutPageRequest.class) {
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

    public final void p(String str) {
        str.getClass();
        this.checkoutSessionId_ = str;
    }

    public final void q(TrackingData trackingData) {
        trackingData.getClass();
        this.trackingData_ = trackingData;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
