package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g12;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AddressCollectionSuccess extends h implements v2j0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    private static final AddressCollectionSuccess DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USING_AUTOCOMPLETE_FIELD_NUMBER = 2;
    private String addressCollectionViewId_ = "";
    private int bitField0_;
    private boolean usingAutocomplete_;

    static {
        AddressCollectionSuccess addressCollectionSuccess = new AddressCollectionSuccess();
        DEFAULT_INSTANCE = addressCollectionSuccess;
        h.registerDefaultInstance(AddressCollectionSuccess.class, addressCollectionSuccess);
    }

    private AddressCollectionSuccess() {
    }

    public static g12 n() {
        return (g12) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "addressCollectionViewId_", "usingAutocomplete_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionSuccess();
        }
        if (iOrdinal == 4) {
            return new g12(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionSuccess.class) {
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

    public final void p(boolean z) {
        this.bitField0_ |= 2;
        this.usingAutocomplete_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
