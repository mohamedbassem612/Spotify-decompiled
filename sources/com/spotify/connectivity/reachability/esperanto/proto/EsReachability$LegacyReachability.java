package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qqz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsReachability$LegacyReachability extends h implements v2j0 {
    private static final EsReachability$LegacyReachability DEFAULT_INSTANCE;
    public static final int NOT_REACHABLE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REACHABLE_FIELD_NUMBER = 1;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsReachability$LegacyReachability esReachability$LegacyReachability = new EsReachability$LegacyReachability();
        DEFAULT_INSTANCE = esReachability$LegacyReachability;
        h.registerDefaultInstance(EsReachability$LegacyReachability.class, esReachability$LegacyReachability);
    }

    private EsReachability$LegacyReachability() {
    }

    public static qqz n() {
        return (qqz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", EsReachable$LegacyReachable.class, EsNotReachable$LegacyNotReachable.class});
        }
        if (iOrdinal == 3) {
            return new EsReachability$LegacyReachability();
        }
        if (iOrdinal == 4) {
            return new qqz(DEFAULT_INSTANCE);
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
        synchronized (EsReachability$LegacyReachability.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(EsNotReachable$LegacyNotReachable esNotReachable$LegacyNotReachable) {
        esNotReachable$LegacyNotReachable.getClass();
        this.type_ = esNotReachable$LegacyNotReachable;
        this.typeCase_ = 2;
    }

    public final void p(EsReachable$LegacyReachable esReachable$LegacyReachable) {
        esReachable$LegacyReachable.getClass();
        this.type_ = esReachable$LegacyReachable;
        this.typeCase_ = 1;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
