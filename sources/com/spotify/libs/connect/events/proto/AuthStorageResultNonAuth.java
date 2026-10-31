package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yh8;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AuthStorageResultNonAuth extends h implements v2j0 {
    private static final AuthStorageResultNonAuth DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private String failureReason_ = "";
    private boolean success_;

    static {
        AuthStorageResultNonAuth authStorageResultNonAuth = new AuthStorageResultNonAuth();
        DEFAULT_INSTANCE = authStorageResultNonAuth;
        h.registerDefaultInstance(AuthStorageResultNonAuth.class, authStorageResultNonAuth);
    }

    private AuthStorageResultNonAuth() {
    }

    public static yh8 n() {
        return (yh8) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "success_", "failureReason_"});
        }
        if (iOrdinal == 3) {
            return new AuthStorageResultNonAuth();
        }
        if (iOrdinal == 4) {
            return new yh8(DEFAULT_INSTANCE);
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
        synchronized (AuthStorageResultNonAuth.class) {
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
        this.bitField0_ |= 2;
        this.failureReason_ = str;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
