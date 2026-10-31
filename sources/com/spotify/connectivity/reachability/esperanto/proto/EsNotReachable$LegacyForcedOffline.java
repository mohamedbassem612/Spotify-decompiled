package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsNotReachable$LegacyForcedOffline extends h implements v2j0 {
    private static final EsNotReachable$LegacyForcedOffline DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;

    static {
        EsNotReachable$LegacyForcedOffline esNotReachable$LegacyForcedOffline = new EsNotReachable$LegacyForcedOffline();
        DEFAULT_INSTANCE = esNotReachable$LegacyForcedOffline;
        h.registerDefaultInstance(EsNotReachable$LegacyForcedOffline.class, esNotReachable$LegacyForcedOffline);
    }

    private EsNotReachable$LegacyForcedOffline() {
    }

    public static EsNotReachable$LegacyForcedOffline o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new EsNotReachable$LegacyForcedOffline();
        }
        if (iOrdinal == 4) {
            return new onz((byte) 17);
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
        synchronized (EsNotReachable$LegacyForcedOffline.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
