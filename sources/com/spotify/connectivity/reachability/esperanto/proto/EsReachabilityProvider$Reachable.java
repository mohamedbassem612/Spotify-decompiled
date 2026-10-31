package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.pvc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsReachabilityProvider$Reachable extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 2;
    private static final EsReachabilityProvider$Reachable DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private static final c290 capabilities_converter_ = new pvc((byte) 9);
    private int bitField0_;
    private int capabilitiesMemoizedSerializedSize;
    private b290 capabilities_ = h.emptyIntList();
    private EsConnectionType.ConnectionType connectionType_;

    static {
        EsReachabilityProvider$Reachable esReachabilityProvider$Reachable = new EsReachabilityProvider$Reachable();
        DEFAULT_INSTANCE = esReachabilityProvider$Reachable;
        h.registerDefaultInstance(EsReachabilityProvider$Reachable.class, esReachabilityProvider$Reachable);
    }

    private EsReachabilityProvider$Reachable() {
    }

    public static EsReachabilityProvider$Reachable p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002ဉ\u0000", new Object[]{"bitField0_", "capabilities_", "connectionType_"});
        }
        if (iOrdinal == 3) {
            return new EsReachabilityProvider$Reachable();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 23);
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
        synchronized (EsReachabilityProvider$Reachable.class) {
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

    public final d290 o() {
        return new d290(this.capabilities_, capabilities_converter_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
