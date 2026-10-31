package com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ValuePropSummary extends h implements v2j0 {
    private static final ValuePropSummary DEFAULT_INSTANCE;
    public static final int FOR_USER_WITHOUT_ACCESS_FIELD_NUMBER = 1;
    public static final int FOR_USER_WITH_ACCESS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String forUserWithoutAccess_ = "";
    private String forUserWithAccess_ = "";

    static {
        ValuePropSummary valuePropSummary = new ValuePropSummary();
        DEFAULT_INSTANCE = valuePropSummary;
        h.registerDefaultInstance(ValuePropSummary.class, valuePropSummary);
    }

    private ValuePropSummary() {
    }

    public static ValuePropSummary n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "forUserWithoutAccess_", "forUserWithAccess_"});
        }
        if (iOrdinal == 3) {
            return new ValuePropSummary();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ValuePropSummary.class) {
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
        return this.forUserWithAccess_;
    }

    public final String p() {
        return this.forUserWithoutAccess_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
