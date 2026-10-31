package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.eyf;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CheckoutViewJS extends h implements v2j0 {
    public static final int CHECKOUT_COUNTRY_FIELD_NUMBER = 4;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_CONTEXT_FIELD_NUMBER = 3;
    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    private static final CheckoutViewJS DEFAULT_INSTANCE;
    public static final int GRAYED_OUT_PROVIDERS_FIELD_NUMBER = 12;
    public static final int HAS_STORED_DETAILS_FIELD_NUMBER = 5;
    public static final int HIGHLIGHTED_PROVIDER_FIELD_NUMBER = 10;
    public static final int INITIAL_PROVIDER_FIELD_NUMBER = 9;
    public static final int NUMBER_OF_STORED_DETAILS_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 11;
    public static final int PROVIDERS_FIELD_NUMBER = 8;
    public static final int STORED_METHOD_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean hasStoredDetails_;
    private int numberOfStoredDetails_;
    private String checkoutViewId_ = "";
    private String clientId_ = "";
    private String clientContext_ = "";
    private String checkoutCountry_ = "";
    private String storedMethod_ = "";
    private h290 providers_ = h.emptyProtobufList();
    private String initialProvider_ = "";
    private String highlightedProvider_ = "";
    private String paymentSessionId_ = "";
    private h290 grayedOutProviders_ = h.emptyProtobufList();

    static {
        CheckoutViewJS checkoutViewJS = new CheckoutViewJS();
        DEFAULT_INSTANCE = checkoutViewJS;
        h.registerDefaultInstance(CheckoutViewJS.class, checkoutViewJS);
    }

    private CheckoutViewJS() {
    }

    public static eyf p() {
        return (eyf) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007င\u0006\b\u001a\tဈ\u0007\nဈ\b\u000bဈ\t\f\u001a", new Object[]{"bitField0_", "checkoutViewId_", "clientId_", "clientContext_", "checkoutCountry_", "hasStoredDetails_", "storedMethod_", "numberOfStoredDetails_", "providers_", "initialProvider_", "highlightedProvider_", "paymentSessionId_", "grayedOutProviders_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutViewJS();
        }
        if (iOrdinal == 4) {
            return new eyf(DEFAULT_INSTANCE);
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
        synchronized (CheckoutViewJS.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.grayedOutProviders_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.grayedOutProviders_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.providers_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.providers_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.checkoutCountry_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.checkoutViewId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.clientContext_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.clientId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.bitField0_ |= 16;
        this.hasStoredDetails_ = z;
    }

    public final void v(int i) {
        this.bitField0_ |= 64;
        this.numberOfStoredDetails_ = i;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.paymentSessionId_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.storedMethod_ = str;
    }
}
