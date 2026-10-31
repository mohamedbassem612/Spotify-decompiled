package com.spotify.contentagnostic.v2;

import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Capability extends com.google.protobuf.h implements v2j0 {
    public static final int ALLOWED_FIELD_NUMBER = 1;
    private static final Capability DEFAULT_INSTANCE;
    public static final int DISALLOWED_FIELD_NUMBER = 2;
    public static final int IRRELEVANT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RESTRICTED_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    static {
        Capability capability = new Capability();
        DEFAULT_INSTANCE = capability;
        com.google.protobuf.h.registerDefaultInstance(Capability.class, capability);
    }

    private Capability() {
    }

    public static Capability n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"value_", "valueCase_", Allowed.class, Disallowed.class, Restricted.class, Irrelevant.class});
        }
        if (iOrdinal == 3) {
            return new Capability();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (Capability.class) {
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

    public final Restricted o() {
        return this.valueCase_ == 3 ? (Restricted) this.value_ : Restricted.o();
    }

    public final int p() {
        int i = this.valueCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
