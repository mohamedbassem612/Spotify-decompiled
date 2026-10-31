package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.noz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsNotReachable$LegacyNoInternet extends h implements v2j0 {
    private static final EsNotReachable$LegacyNoInternet DEFAULT_INSTANCE;
    public static final int MOBILE_DATA_DISABLED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int WIFI_DISABLED_FIELD_NUMBER = 1;
    private boolean mobileDataDisabled_;
    private boolean wifiDisabled_;

    static {
        EsNotReachable$LegacyNoInternet esNotReachable$LegacyNoInternet = new EsNotReachable$LegacyNoInternet();
        DEFAULT_INSTANCE = esNotReachable$LegacyNoInternet;
        h.registerDefaultInstance(EsNotReachable$LegacyNoInternet.class, esNotReachable$LegacyNoInternet);
    }

    private EsNotReachable$LegacyNoInternet() {
    }

    public static noz n() {
        return (noz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"wifiDisabled_", "mobileDataDisabled_"});
        }
        if (iOrdinal == 3) {
            return new EsNotReachable$LegacyNoInternet();
        }
        if (iOrdinal == 4) {
            return new noz(DEFAULT_INSTANCE);
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
        synchronized (EsNotReachable$LegacyNoInternet.class) {
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

    public final void o(boolean z) {
        this.mobileDataDisabled_ = z;
    }

    public final void p(boolean z) {
        this.wifiDisabled_ = z;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
