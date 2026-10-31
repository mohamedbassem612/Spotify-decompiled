package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.jf40;
import p.jwf;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CheckoutItemUnavailable extends com.google.protobuf.h implements v2j0 {
    public static final int CTA_LABEL_FIELD_NUMBER = 3;
    private static final CheckoutItemUnavailable DEFAULT_INSTANCE;
    public static final int LINE_ITEM_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private LineItem lineItem_;
    private String title_ = "";
    private String ctaLabel_ = "";

    static {
        CheckoutItemUnavailable checkoutItemUnavailable = new CheckoutItemUnavailable();
        DEFAULT_INSTANCE = checkoutItemUnavailable;
        com.google.protobuf.h.registerDefaultInstance(CheckoutItemUnavailable.class, checkoutItemUnavailable);
    }

    private CheckoutItemUnavailable() {
    }

    public static CheckoutItemUnavailable o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static jwf q() {
        return (jwf) DEFAULT_INSTANCE.createBuilder();
    }

    public static CheckoutItemUnavailable r(byte[] bArr) {
        return (CheckoutItemUnavailable) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "title_", "lineItem_", "ctaLabel_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutItemUnavailable();
        }
        if (iOrdinal == 4) {
            return new jwf(DEFAULT_INSTANCE);
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
        synchronized (CheckoutItemUnavailable.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.ctaLabel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LineItem p() {
        LineItem lineItem = this.lineItem_;
        return lineItem == null ? LineItem.n() : lineItem;
    }

    public final void s(String str) {
        this.ctaLabel_ = str;
    }

    public final void t(LineItem lineItem) {
        lineItem.getClass();
        this.lineItem_ = lineItem;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.title_ = str;
    }
}
