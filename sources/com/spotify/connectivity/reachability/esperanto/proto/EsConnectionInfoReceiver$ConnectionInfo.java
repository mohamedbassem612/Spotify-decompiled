package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wlz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsConnectionInfoReceiver$ConnectionInfo extends h implements v2j0 {
    public static final int CONNECTION_AVAILABILITY_FIELD_NUMBER = 3;
    public static final int CONNECTION_STATUS_FIELD_NUMBER = 2;
    private static final EsConnectionInfoReceiver$ConnectionInfo DEFAULT_INSTANCE;
    public static final int FORCED_OFFLINE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EsConnectionAvailability.ConnectionAvailability connectionAvailability_;
    private EsConnectionInfoReceiver$ConnectionStatus connectionStatus_;
    private boolean forcedOffline_;

    static {
        EsConnectionInfoReceiver$ConnectionInfo esConnectionInfoReceiver$ConnectionInfo = new EsConnectionInfoReceiver$ConnectionInfo();
        DEFAULT_INSTANCE = esConnectionInfoReceiver$ConnectionInfo;
        h.registerDefaultInstance(EsConnectionInfoReceiver$ConnectionInfo.class, esConnectionInfoReceiver$ConnectionInfo);
    }

    private EsConnectionInfoReceiver$ConnectionInfo() {
    }

    public static wlz o() {
        return (wlz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "forcedOffline_", "connectionStatus_", "connectionAvailability_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionInfoReceiver$ConnectionInfo();
        }
        if (iOrdinal == 4) {
            return new wlz(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionInfoReceiver$ConnectionInfo.class) {
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

    public final boolean n() {
        return this.forcedOffline_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(EsConnectionAvailability.ConnectionAvailability connectionAvailability) {
        connectionAvailability.getClass();
        this.connectionAvailability_ = connectionAvailability;
        this.bitField0_ |= 2;
    }

    public final void q(EsConnectionInfoReceiver$ConnectionStatus esConnectionInfoReceiver$ConnectionStatus) {
        esConnectionInfoReceiver$ConnectionStatus.getClass();
        this.connectionStatus_ = esConnectionInfoReceiver$ConnectionStatus;
        this.bitField0_ |= 1;
    }

    public final void r(boolean z) {
        this.forcedOffline_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
