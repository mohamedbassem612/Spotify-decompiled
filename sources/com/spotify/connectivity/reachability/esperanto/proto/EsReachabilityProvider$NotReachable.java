package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.lqc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsReachabilityProvider$NotReachable extends h implements v2j0 {
    private static final EsReachabilityProvider$NotReachable DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 1;
    private static final c290 reasons_converter_ = new lqc((byte) 9);
    private int reasonsMemoizedSerializedSize;
    private b290 reasons_ = h.emptyIntList();

    static {
        EsReachabilityProvider$NotReachable esReachabilityProvider$NotReachable = new EsReachabilityProvider$NotReachable();
        DEFAULT_INSTANCE = esReachabilityProvider$NotReachable;
        h.registerDefaultInstance(EsReachabilityProvider$NotReachable.class, esReachabilityProvider$NotReachable);
    }

    private EsReachabilityProvider$NotReachable() {
    }

    public static EsReachabilityProvider$NotReachable o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"reasons_"});
        }
        if (iOrdinal == 3) {
            return new EsReachabilityProvider$NotReachable();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 21);
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
        synchronized (EsReachabilityProvider$NotReachable.class) {
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

    public final List p() {
        return new d290(this.reasons_, reasons_converter_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
