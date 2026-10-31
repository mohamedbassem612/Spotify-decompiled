package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h12;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AddressCollectionView extends h implements v2j0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    public static final int ADDRESS_VIEW_FIELD_NUMBER = 6;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 4;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int COUNTRY_FIELD_NUMBER = 3;
    private static final AddressCollectionView DEFAULT_INSTANCE;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String addressCollectionViewId_ = "";
    private String context_ = "";
    private String country_ = "";
    private String checkoutViewId_ = "";
    private String externalId_ = "";
    private String addressView_ = "";

    static {
        AddressCollectionView addressCollectionView = new AddressCollectionView();
        DEFAULT_INSTANCE = addressCollectionView;
        h.registerDefaultInstance(AddressCollectionView.class, addressCollectionView);
    }

    private AddressCollectionView() {
    }

    public static h12 n() {
        return (h12) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "addressCollectionViewId_", "context_", "country_", "checkoutViewId_", "externalId_", "addressView_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionView();
        }
        if (iOrdinal == 4) {
            return new h12(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionView.class) {
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
        this.addressCollectionViewId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.addressView_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.context_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 4;
        this.country_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.externalId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
