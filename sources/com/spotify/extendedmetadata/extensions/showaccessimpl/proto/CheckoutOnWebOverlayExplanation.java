package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CheckoutOnWebOverlayExplanation extends h implements v2j0 {
    public static final int CTA_FIELD_NUMBER = 1;
    private static final CheckoutOnWebOverlayExplanation DEFAULT_INSTANCE;
    public static final int IS_PRICE_DISPLAYED_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 5;
    public static final int SNACKBAR_ERROR_FIELD_NUMBER = 3;
    public static final int SNACKBAR_FULFILMENT_COMPLETE_FIELD_NUMBER = 4;
    public static final int SNACKBAR_SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isPriceDisplayed_;
    private AudiobookPriceOuterClass$AudiobookPrice price_;
    private String cta_ = "";
    private String snackbarSuccess_ = "";
    private String snackbarError_ = "";
    private String snackbarFulfilmentComplete_ = "";

    static {
        CheckoutOnWebOverlayExplanation checkoutOnWebOverlayExplanation = new CheckoutOnWebOverlayExplanation();
        DEFAULT_INSTANCE = checkoutOnWebOverlayExplanation;
        h.registerDefaultInstance(CheckoutOnWebOverlayExplanation.class, checkoutOnWebOverlayExplanation);
    }

    private CheckoutOnWebOverlayExplanation() {
    }

    public static CheckoutOnWebOverlayExplanation p() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006\u0007", new Object[]{"bitField0_", "cta_", "snackbarSuccess_", "snackbarError_", "snackbarFulfilmentComplete_", "price_", "isPriceDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutOnWebOverlayExplanation();
        }
        if (iOrdinal == 4) {
            return new hhe((byte) 18);
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
        synchronized (CheckoutOnWebOverlayExplanation.class) {
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

    public final String o() {
        return this.cta_;
    }

    public final boolean q() {
        return this.isPriceDisplayed_;
    }

    public final AudiobookPriceOuterClass$AudiobookPrice r() {
        AudiobookPriceOuterClass$AudiobookPrice audiobookPriceOuterClass$AudiobookPrice = this.price_;
        return audiobookPriceOuterClass$AudiobookPrice == null ? AudiobookPriceOuterClass$AudiobookPrice.o() : audiobookPriceOuterClass$AudiobookPrice;
    }

    public final String s() {
        return this.snackbarError_;
    }

    public final String t() {
        return this.snackbarFulfilmentComplete_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.snackbarSuccess_;
    }
}
