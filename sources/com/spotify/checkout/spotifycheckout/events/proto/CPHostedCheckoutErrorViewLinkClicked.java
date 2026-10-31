package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.ync;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CPHostedCheckoutErrorViewLinkClicked extends h implements v2j0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPHostedCheckoutErrorViewLinkClicked DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String destination_ = "";

    static {
        CPHostedCheckoutErrorViewLinkClicked cPHostedCheckoutErrorViewLinkClicked = new CPHostedCheckoutErrorViewLinkClicked();
        DEFAULT_INSTANCE = cPHostedCheckoutErrorViewLinkClicked;
        h.registerDefaultInstance(CPHostedCheckoutErrorViewLinkClicked.class, cPHostedCheckoutErrorViewLinkClicked);
    }

    private CPHostedCheckoutErrorViewLinkClicked() {
    }

    public static ync n() {
        return (ync) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "checkoutSessionId_", "destination_"});
        }
        if (iOrdinal == 3) {
            return new CPHostedCheckoutErrorViewLinkClicked();
        }
        if (iOrdinal == 4) {
            return new ync(DEFAULT_INSTANCE);
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
        synchronized (CPHostedCheckoutErrorViewLinkClicked.class) {
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

    public final void setDestination(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.destination_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
