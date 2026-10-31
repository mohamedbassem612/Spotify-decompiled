package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xve0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Login5PermanentErrorNonAuth extends h implements v2j0 {
    private static final Login5PermanentErrorNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int FROM_CORE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int errorCode_;
    private String errorMessage_ = "";
    private boolean fromCore_;

    static {
        Login5PermanentErrorNonAuth login5PermanentErrorNonAuth = new Login5PermanentErrorNonAuth();
        DEFAULT_INSTANCE = login5PermanentErrorNonAuth;
        h.registerDefaultInstance(Login5PermanentErrorNonAuth.class, login5PermanentErrorNonAuth);
    }

    private Login5PermanentErrorNonAuth() {
    }

    public static xve0 n() {
        return (xve0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "errorCode_", "errorMessage_", "fromCore_"});
        }
        if (iOrdinal == 3) {
            return new Login5PermanentErrorNonAuth();
        }
        if (iOrdinal == 4) {
            return new xve0(DEFAULT_INSTANCE);
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
        synchronized (Login5PermanentErrorNonAuth.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 1;
        this.errorCode_ = i;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorMessage_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
