package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rd41;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class SavedAddress extends com.google.protobuf.h implements v2j0 {
    public static final int ADDRESS_LINE_FIELD_NUMBER = 1;
    private static final SavedAddress DEFAULT_INSTANCE;
    public static final int EDIT_CTA_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 addressLine_ = com.google.protobuf.h.emptyProtobufList();
    private String editCta_ = "";

    static {
        SavedAddress savedAddress = new SavedAddress();
        DEFAULT_INSTANCE = savedAddress;
        com.google.protobuf.h.registerDefaultInstance(SavedAddress.class, savedAddress);
    }

    private SavedAddress() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SavedAddress q() {
        return DEFAULT_INSTANCE;
    }

    public static rd41 s() {
        return (rd41) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"addressLine_", "editCta_"});
        }
        if (iOrdinal == 3) {
            return new SavedAddress();
        }
        if (iOrdinal == 4) {
            return new rd41(DEFAULT_INSTANCE);
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
        synchronized (SavedAddress.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.addressLine_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.addressLine_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o() {
        this.addressLine_ = com.google.protobuf.h.emptyProtobufList();
    }

    public final h290 p() {
        return this.addressLine_;
    }

    public final String r() {
        return this.editCta_;
    }

    public final void t() {
        this.editCta_ = "Edit";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
