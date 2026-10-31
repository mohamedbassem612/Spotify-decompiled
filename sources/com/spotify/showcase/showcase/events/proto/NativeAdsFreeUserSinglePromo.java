package com.spotify.showcase.showcase.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gln0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class NativeAdsFreeUserSinglePromo extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int CONTENT_URI_FIELD_NUMBER = 3;
    private static final NativeAdsFreeUserSinglePromo DEFAULT_INSTANCE;
    public static final int FLIGHT_ID_FIELD_NUMBER = 2;
    public static final int HAS_ON_DEMAND_ACCESS_FIELD_NUMBER = 4;
    public static final int NATIVE_AD_PROMOTION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean hasOnDemandAccess_;
    private String adId_ = "";
    private String flightId_ = "";
    private String contentUri_ = "";
    private String nativeAdPromotion_ = "";

    static {
        NativeAdsFreeUserSinglePromo nativeAdsFreeUserSinglePromo = new NativeAdsFreeUserSinglePromo();
        DEFAULT_INSTANCE = nativeAdsFreeUserSinglePromo;
        h.registerDefaultInstance(NativeAdsFreeUserSinglePromo.class, nativeAdsFreeUserSinglePromo);
    }

    private NativeAdsFreeUserSinglePromo() {
    }

    public static gln0 n() {
        return (gln0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "adId_", "flightId_", "contentUri_", "hasOnDemandAccess_", "nativeAdPromotion_"});
        }
        if (iOrdinal == 3) {
            return new NativeAdsFreeUserSinglePromo();
        }
        if (iOrdinal == 4) {
            return new gln0(DEFAULT_INSTANCE);
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
        synchronized (NativeAdsFreeUserSinglePromo.class) {
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
        this.adId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.contentUri_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.flightId_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 8;
        this.hasOnDemandAccess_ = z;
    }

    public final void s() {
        this.bitField0_ |= 16;
        this.nativeAdPromotion_ = "showcase";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
