package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.h;
import p.b12;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AddressCollectionError extends h implements v2j0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    private static final AddressCollectionError DEFAULT_INSTANCE;
    public static final int ERROR_ID_FIELD_NUMBER = 4;
    public static final int ERROR_INPUT_FIELD_FIELD_NUMBER = 2;
    public static final int ERROR_KEY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String addressCollectionViewId_ = "";
    private String errorInputField_ = "";
    private String errorKey_ = "";
    private String errorId_ = "";

    static {
        AddressCollectionError addressCollectionError = new AddressCollectionError();
        DEFAULT_INSTANCE = addressCollectionError;
        h.registerDefaultInstance(AddressCollectionError.class, addressCollectionError);
    }

    private AddressCollectionError() {
    }

    public static b12 n() {
        return (b12) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "addressCollectionViewId_", "errorInputField_", "errorKey_", "errorId_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionError();
        }
        if (iOrdinal == 4) {
            return new b12(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionError.class) {
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
        str.getClass();
        this.bitField0_ |= 8;
        this.errorId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorInputField_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
