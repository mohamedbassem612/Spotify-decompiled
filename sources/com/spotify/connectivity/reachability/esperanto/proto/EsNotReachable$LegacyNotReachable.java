package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ooz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsNotReachable$LegacyNotReachable extends h implements v2j0 {
    private static final EsNotReachable$LegacyNotReachable DEFAULT_INSTANCE;
    public static final int FORCED_OFFLINE_FIELD_NUMBER = 1;
    public static final int NO_INTERNET_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsNotReachable$LegacyNotReachable esNotReachable$LegacyNotReachable = new EsNotReachable$LegacyNotReachable();
        DEFAULT_INSTANCE = esNotReachable$LegacyNotReachable;
        h.registerDefaultInstance(EsNotReachable$LegacyNotReachable.class, esNotReachable$LegacyNotReachable);
    }

    private EsNotReachable$LegacyNotReachable() {
    }

    public static ooz n() {
        return (ooz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", EsNotReachable$LegacyForcedOffline.class, EsNotReachable$LegacyNoInternet.class});
        }
        if (iOrdinal == 3) {
            return new EsNotReachable$LegacyNotReachable();
        }
        if (iOrdinal == 4) {
            return new ooz(DEFAULT_INSTANCE);
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
        synchronized (EsNotReachable$LegacyNotReachable.class) {
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

    public final void o(EsNotReachable$LegacyForcedOffline esNotReachable$LegacyForcedOffline) {
        esNotReachable$LegacyForcedOffline.getClass();
        this.type_ = esNotReachable$LegacyForcedOffline;
        this.typeCase_ = 1;
    }

    public final void p(EsNotReachable$LegacyNoInternet esNotReachable$LegacyNoInternet) {
        esNotReachable$LegacyNoInternet.getClass();
        this.type_ = esNotReachable$LegacyNoInternet;
        this.typeCase_ = 2;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
