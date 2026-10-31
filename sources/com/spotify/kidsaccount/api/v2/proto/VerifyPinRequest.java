package com.spotify.kidsaccount.api.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o3j1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class VerifyPinRequest extends h implements v2j0 {
    private static final VerifyPinRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PIN_FIELD_NUMBER = 2;
    private String pin_ = "";

    static {
        VerifyPinRequest verifyPinRequest = new VerifyPinRequest();
        DEFAULT_INSTANCE = verifyPinRequest;
        h.registerDefaultInstance(VerifyPinRequest.class, verifyPinRequest);
    }

    private VerifyPinRequest() {
    }

    public static o3j1 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"pin_"});
        }
        if (iOrdinal == 3) {
            return new VerifyPinRequest();
        }
        if (iOrdinal == 4) {
            return new o3j1();
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
        synchronized (VerifyPinRequest.class) {
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

    public final void p(String str) {
        this.pin_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
