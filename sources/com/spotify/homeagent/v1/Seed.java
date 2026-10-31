package com.spotify.homeagent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Seed extends h implements v2j0 {
    private static final Seed DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SEED_TEXT_FIELD_NUMBER = 2;
    public static final int SEED_URI_FIELD_NUMBER = 1;
    private int seedTypeCase_ = 0;
    private Object seedType_;

    static {
        Seed seed = new Seed();
        DEFAULT_INSTANCE = seed;
        h.registerDefaultInstance(Seed.class, seed);
    }

    private Seed() {
    }

    public static Seed n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"seedType_", "seedTypeCase_"});
        }
        if (iOrdinal == 3) {
            return new Seed();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (Seed.class) {
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

    public final String o() {
        return this.seedTypeCase_ == 2 ? (String) this.seedType_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
