package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.hq40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetSpotifyCheckoutPageResponse extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKOUT_ITEM_UNAVAILABLE_FIELD_NUMBER = 2;
    public static final int CHECKOUT_STATUS_FIELD_NUMBER = 3;
    private static final GetSpotifyCheckoutPageResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECT_FIELD_NUMBER = 4;
    public static final int SPOTIFY_CHECKOUT_NATIVE_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse = new GetSpotifyCheckoutPageResponse();
        DEFAULT_INSTANCE = getSpotifyCheckoutPageResponse;
        com.google.protobuf.h.registerDefaultInstance(GetSpotifyCheckoutPageResponse.class, getSpotifyCheckoutPageResponse);
    }

    private GetSpotifyCheckoutPageResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static hq40 t() {
        return (hq40) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"response_", "responseCase_", SpotifyCheckoutNative.class, CheckoutItemUnavailable.class, CheckoutStatus.class, Redirect.class, Error.class});
        }
        if (iOrdinal == 3) {
            return new GetSpotifyCheckoutPageResponse();
        }
        if (iOrdinal == 4) {
            return new hq40(DEFAULT_INSTANCE);
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
        synchronized (GetSpotifyCheckoutPageResponse.class) {
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

    public final CheckoutItemUnavailable n() {
        return this.responseCase_ == 2 ? (CheckoutItemUnavailable) this.response_ : CheckoutItemUnavailable.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CheckoutStatus o() {
        return this.responseCase_ == 3 ? (CheckoutStatus) this.response_ : CheckoutStatus.p();
    }

    public final Error p() {
        return this.responseCase_ == 5 ? (Error) this.response_ : Error.s();
    }

    public final Redirect q() {
        return this.responseCase_ == 4 ? (Redirect) this.response_ : Redirect.n();
    }

    public final int r() {
        int i = this.responseCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final SpotifyCheckoutNative s() {
        return this.responseCase_ == 1 ? (SpotifyCheckoutNative) this.response_ : SpotifyCheckoutNative.r();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(CheckoutItemUnavailable checkoutItemUnavailable) {
        checkoutItemUnavailable.getClass();
        this.response_ = checkoutItemUnavailable;
        this.responseCase_ = 2;
    }

    public final void v(CheckoutStatus checkoutStatus) {
        checkoutStatus.getClass();
        this.response_ = checkoutStatus;
        this.responseCase_ = 3;
    }

    public final void w(Error error) {
        error.getClass();
        this.response_ = error;
        this.responseCase_ = 5;
    }

    public final void x(Redirect redirect) {
        redirect.getClass();
        this.response_ = redirect;
        this.responseCase_ = 4;
    }

    public final void y(SpotifyCheckoutNative spotifyCheckoutNative) {
        spotifyCheckoutNative.getClass();
        this.response_ = spotifyCheckoutNative;
        this.responseCase_ = 1;
    }
}
