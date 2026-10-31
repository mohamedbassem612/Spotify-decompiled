package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.StringValue;
import com.google.protobuf.h;
import p.a3g1;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Tracking extends h implements v2j0 {
    public static final int CREATED_BY_PARTNER_FIELD_NUMBER = 5;
    public static final int CREATION_FLOW_FIELD_NUMBER = 2;
    public static final int CREATION_POINT_FIELD_NUMBER = 1;
    private static final Tracking DEFAULT_INSTANCE;
    public static final int MOBILE_PRODUCT_TEST_FIELD_NUMBER = 6;
    public static final int ORIGIN_SURFACE_FIELD_NUMBER = 8;
    public static final int ORIGIN_VERTICAL_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 4;
    public static final int REFERRER_FIELD_NUMBER = 3;
    private int bitField0_;
    private StringValue createdByPartner_;
    private StringValue creationFlow_;
    private String creationPoint_ = "";
    private StringValue mobileProductTest_;
    private StringValue originSurface_;
    private StringValue originVertical_;
    private StringValue partner_;
    private StringValue referrer_;

    static {
        Tracking tracking = new Tracking();
        DEFAULT_INSTANCE = tracking;
        h.registerDefaultInstance(Tracking.class, tracking);
    }

    private Tracking() {
    }

    public static a3g1 n() {
        return (a3g1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006", new Object[]{"bitField0_", "creationPoint_", "creationFlow_", "referrer_", "partner_", "createdByPartner_", "mobileProductTest_", "originVertical_", "originSurface_"});
        }
        if (iOrdinal == 3) {
            return new Tracking();
        }
        if (iOrdinal == 4) {
            return new a3g1(DEFAULT_INSTANCE);
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
        synchronized (Tracking.class) {
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

    public final void o(StringValue stringValue) {
        stringValue.getClass();
        this.createdByPartner_ = stringValue;
        this.bitField0_ |= 8;
    }

    public final void p() {
        this.creationPoint_ = "client_mobile";
    }

    public final void q(StringValue stringValue) {
        stringValue.getClass();
        this.mobileProductTest_ = stringValue;
        this.bitField0_ |= 16;
    }

    public final void r(StringValue stringValue) {
        stringValue.getClass();
        this.referrer_ = stringValue;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
