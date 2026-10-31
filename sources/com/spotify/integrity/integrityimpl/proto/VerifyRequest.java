package com.spotify.integrity.integrityimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r3j1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class VerifyRequest extends h implements v2j0 {
    public static final int CORRELATION_ID_FIELD_NUMBER = 2;
    private static final VerifyRequest DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private String token_ = "";
    private String correlationId_ = "";
    private String packageName_ = "";

    static {
        VerifyRequest verifyRequest = new VerifyRequest();
        DEFAULT_INSTANCE = verifyRequest;
        h.registerDefaultInstance(VerifyRequest.class, verifyRequest);
    }

    private VerifyRequest() {
    }

    public static r3j1 n() {
        return (r3j1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"token_", "correlationId_", "packageName_"});
        }
        if (iOrdinal == 3) {
            return new VerifyRequest();
        }
        if (iOrdinal == 4) {
            return new r3j1(DEFAULT_INSTANCE);
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
        synchronized (VerifyRequest.class) {
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
        this.correlationId_ = str;
    }

    public final void p(String str) {
        this.packageName_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.token_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
