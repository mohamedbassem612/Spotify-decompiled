package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ulz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsConnectionAvailability$ConnectionAvailability extends h implements v2j0 {
    private static final EsConnectionAvailability$ConnectionAvailability DEFAULT_INSTANCE;
    public static final int IS_CELLULAR_ENABLED_FIELD_NUMBER = 1;
    public static final int IS_WIFI_ENABLED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private boolean isCellularEnabled_;
    private boolean isWifiEnabled_;

    static {
        EsConnectionAvailability$ConnectionAvailability esConnectionAvailability$ConnectionAvailability = new EsConnectionAvailability$ConnectionAvailability();
        DEFAULT_INSTANCE = esConnectionAvailability$ConnectionAvailability;
        h.registerDefaultInstance(EsConnectionAvailability$ConnectionAvailability.class, esConnectionAvailability$ConnectionAvailability);
    }

    private EsConnectionAvailability$ConnectionAvailability() {
    }

    public static EsConnectionAvailability$ConnectionAvailability o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ulz r() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"isCellularEnabled_", "isWifiEnabled_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionAvailability$ConnectionAvailability();
        }
        if (iOrdinal == 4) {
            return new ulz();
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
        synchronized (EsConnectionAvailability$ConnectionAvailability.class) {
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

    public final boolean p() {
        return this.isCellularEnabled_;
    }

    public final boolean q() {
        return this.isWifiEnabled_;
    }

    public final void s(boolean z) {
        this.isCellularEnabled_ = z;
    }

    public final void t(boolean z) {
        this.isWifiEnabled_ = z;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
