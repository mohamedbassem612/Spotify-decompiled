package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.o64;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AndroidAutoConnected extends com.google.protobuf.h implements v2j0 {
    private static final AndroidAutoConnected DEFAULT_INSTANCE;
    public static final int IS_CONNECTED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean isConnected_;

    static {
        AndroidAutoConnected androidAutoConnected = new AndroidAutoConnected();
        DEFAULT_INSTANCE = androidAutoConnected;
        com.google.protobuf.h.registerDefaultInstance(AndroidAutoConnected.class, androidAutoConnected);
    }

    private AndroidAutoConnected() {
    }

    public static o64 n() {
        return (o64) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isConnected_"});
        }
        if (iOrdinal == 3) {
            return new AndroidAutoConnected();
        }
        if (iOrdinal == 4) {
            return new o64(DEFAULT_INSTANCE);
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
        synchronized (AndroidAutoConnected.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 1;
        this.isConnected_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
