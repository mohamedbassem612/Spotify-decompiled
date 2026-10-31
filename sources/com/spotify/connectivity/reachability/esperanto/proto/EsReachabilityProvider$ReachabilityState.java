package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;
import p.zjy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsReachabilityProvider$ReachabilityState extends h implements v2j0 {
    public static final int CONNECTION_AVAILABILITY_FIELD_NUMBER = 3;
    private static final EsReachabilityProvider$ReachabilityState DEFAULT_INSTANCE;
    public static final int NOT_REACHABLE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REACHABLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsConnectionAvailability$ConnectionAvailability connectionAvailability_;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsReachabilityProvider$ReachabilityState esReachabilityProvider$ReachabilityState = new EsReachabilityProvider$ReachabilityState();
        DEFAULT_INSTANCE = esReachabilityProvider$ReachabilityState;
        h.registerDefaultInstance(EsReachabilityProvider$ReachabilityState.class, esReachabilityProvider$ReachabilityState);
    }

    private EsReachabilityProvider$ReachabilityState() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsReachabilityProvider$ReachabilityState s(byte[] bArr) {
        return (EsReachabilityProvider$ReachabilityState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{"type_", "typeCase_", "bitField0_", EsReachabilityProvider$Reachable.class, EsReachabilityProvider$NotReachable.class, "connectionAvailability_"});
        }
        if (iOrdinal == 3) {
            return new EsReachabilityProvider$ReachabilityState();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 22);
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
        synchronized (EsReachabilityProvider$ReachabilityState.class) {
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

    public final EsConnectionAvailability$ConnectionAvailability o() {
        EsConnectionAvailability$ConnectionAvailability esConnectionAvailability$ConnectionAvailability = this.connectionAvailability_;
        return esConnectionAvailability$ConnectionAvailability == null ? EsConnectionAvailability$ConnectionAvailability.o() : esConnectionAvailability$ConnectionAvailability;
    }

    public final EsReachabilityProvider$NotReachable p() {
        return this.typeCase_ == 2 ? (EsReachabilityProvider$NotReachable) this.type_ : EsReachabilityProvider$NotReachable.o();
    }

    public final EsReachabilityProvider$Reachable q() {
        return this.typeCase_ == 1 ? (EsReachabilityProvider$Reachable) this.type_ : EsReachabilityProvider$Reachable.p();
    }

    public final int r() {
        return zjy.d(this.typeCase_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
