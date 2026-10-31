package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yp40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetSessionStatusRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final GetSessionStatusRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String checkoutSessionId_ = "";

    static {
        GetSessionStatusRequest getSessionStatusRequest = new GetSessionStatusRequest();
        DEFAULT_INSTANCE = getSessionStatusRequest;
        com.google.protobuf.h.registerDefaultInstance(GetSessionStatusRequest.class, getSessionStatusRequest);
    }

    private GetSessionStatusRequest() {
    }

    public static yp40 n() {
        return (yp40) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"checkoutSessionId_"});
        }
        if (iOrdinal == 3) {
            return new GetSessionStatusRequest();
        }
        if (iOrdinal == 4) {
            return new yp40(DEFAULT_INSTANCE);
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
        synchronized (GetSessionStatusRequest.class) {
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
        this.checkoutSessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
