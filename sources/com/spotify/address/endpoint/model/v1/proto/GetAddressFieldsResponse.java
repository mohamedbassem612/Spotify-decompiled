package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.pk40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GetAddressFieldsResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ADDRESSFIELDS_FIELD_NUMBER = 1;
    private static final GetAddressFieldsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 addressFields_ = com.google.protobuf.h.emptyProtobufList();

    static {
        GetAddressFieldsResponse getAddressFieldsResponse = new GetAddressFieldsResponse();
        DEFAULT_INSTANCE = getAddressFieldsResponse;
        com.google.protobuf.h.registerDefaultInstance(GetAddressFieldsResponse.class, getAddressFieldsResponse);
    }

    private GetAddressFieldsResponse() {
    }

    public static pk40 p() {
        return (pk40) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"addressFields_", FieldValue.class});
        }
        if (iOrdinal == 3) {
            return new GetAddressFieldsResponse();
        }
        if (iOrdinal == 4) {
            return new pk40(DEFAULT_INSTANCE);
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
        synchronized (GetAddressFieldsResponse.class) {
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
        h290 h290VarMutableCopy = this.addressFields_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.addressFields_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.addressFields_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
