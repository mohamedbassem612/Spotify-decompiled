package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class OfferRow extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int ADDITIONAL_INFO_FIELD_NUMBER = 4;
    private static final OfferRow DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int PROVIDER_LOGO_URL_FIELD_NUMBER = 2;
    public static final int SALE_TYPE_FIELD_NUMBER = 3;
    private OfferAction action_;
    private PlaceHolderText additionalInfo_;
    private int bitField0_;
    private String providerDisplayName_ = "";
    private String providerLogoUrl_ = "";
    private String saleType_ = "";

    static {
        OfferRow offerRow = new OfferRow();
        DEFAULT_INSTANCE = offerRow;
        h.registerDefaultInstance(OfferRow.class, offerRow);
    }

    private OfferRow() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "providerDisplayName_", "providerLogoUrl_", "saleType_", "additionalInfo_", "action_"});
        }
        if (iOrdinal == 3) {
            return new OfferRow();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (OfferRow.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
