package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.h;
import p.aoc;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CPHostedCheckoutPaymentEjectedToWeb extends h implements v2j0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPHostedCheckoutPaymentEjectedToWeb DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_METHOD_ID_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 2;
    public static final int WEB_URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String paymentSessionId_ = "";
    private String paymentMethodId_ = "";
    private String webUrl_ = "";

    static {
        CPHostedCheckoutPaymentEjectedToWeb cPHostedCheckoutPaymentEjectedToWeb = new CPHostedCheckoutPaymentEjectedToWeb();
        DEFAULT_INSTANCE = cPHostedCheckoutPaymentEjectedToWeb;
        h.registerDefaultInstance(CPHostedCheckoutPaymentEjectedToWeb.class, cPHostedCheckoutPaymentEjectedToWeb);
    }

    private CPHostedCheckoutPaymentEjectedToWeb() {
    }

    public static aoc n() {
        return (aoc) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "checkoutSessionId_", "paymentSessionId_", "paymentMethodId_", "webUrl_"});
        }
        if (iOrdinal == 3) {
            return new CPHostedCheckoutPaymentEjectedToWeb();
        }
        if (iOrdinal == 4) {
            return new aoc(DEFAULT_INSTANCE);
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
        synchronized (CPHostedCheckoutPaymentEjectedToWeb.class) {
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
        str.getClass();
        this.bitField0_ |= 1;
        this.checkoutSessionId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.paymentMethodId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.paymentSessionId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 8;
        this.webUrl_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
