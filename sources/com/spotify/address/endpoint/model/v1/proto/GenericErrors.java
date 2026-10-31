package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GenericErrors extends com.google.protobuf.h implements v2j0 {
    private static final GenericErrors DEFAULT_INSTANCE;
    public static final int GENERIC_ERROR_FIELD_NUMBER = 1;
    public static final int INVALID_ADDRESS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int UNAUTHENTICATED_FIELD_NUMBER = 2;
    private String genericError_ = "";
    private String unauthenticated_ = "";
    private String invalidAddress_ = "";

    static {
        GenericErrors genericErrors = new GenericErrors();
        DEFAULT_INSTANCE = genericErrors;
        com.google.protobuf.h.registerDefaultInstance(GenericErrors.class, genericErrors);
    }

    private GenericErrors() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"genericError_", "unauthenticated_", "invalidAddress_"});
        }
        if (iOrdinal == 3) {
            return new GenericErrors();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (GenericErrors.class) {
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
