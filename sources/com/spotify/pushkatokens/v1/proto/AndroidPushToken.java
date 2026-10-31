package com.spotify.pushkatokens.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iz4;
import p.jf40;
import p.jz4;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AndroidPushToken extends h implements v2j0 {
    private static final AndroidPushToken DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int source_;
    private String token_ = "";

    static {
        AndroidPushToken androidPushToken = new AndroidPushToken();
        DEFAULT_INSTANCE = androidPushToken;
        h.registerDefaultInstance(AndroidPushToken.class, androidPushToken);
    }

    private AndroidPushToken() {
    }

    public static iz4 n() {
        return (iz4) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"token_", "source_"});
        }
        if (iOrdinal == 3) {
            return new AndroidPushToken();
        }
        if (iOrdinal == 4) {
            return new iz4(DEFAULT_INSTANCE);
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
        synchronized (AndroidPushToken.class) {
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

    public final void o(jz4 jz4Var) {
        this.source_ = jz4Var.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.token_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
