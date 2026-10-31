package com.spotify.contentagnostic.v2;

import p.bf40;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Disallowed extends com.google.protobuf.h implements v2j0 {
    private static final Disallowed DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;

    static {
        Disallowed disallowed = new Disallowed();
        DEFAULT_INSTANCE = disallowed;
        com.google.protobuf.h.registerDefaultInstance(Disallowed.class, disallowed);
    }

    private Disallowed() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
        }
        if (iOrdinal == 3) {
            return new Disallowed();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (Disallowed.class) {
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
