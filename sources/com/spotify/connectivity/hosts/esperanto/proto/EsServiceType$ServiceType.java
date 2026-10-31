package com.spotify.connectivity.hosts.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.grz;
import p.hrz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsServiceType$ServiceType extends h implements v2j0 {
    private static final EsServiceType$ServiceType DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SERVICETYPE_FIELD_NUMBER = 1;
    private int serviceType_;

    static {
        EsServiceType$ServiceType esServiceType$ServiceType = new EsServiceType$ServiceType();
        DEFAULT_INSTANCE = esServiceType$ServiceType;
        h.registerDefaultInstance(EsServiceType$ServiceType.class, esServiceType$ServiceType);
    }

    private EsServiceType$ServiceType() {
    }

    public static grz n() {
        return (grz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"serviceType_"});
        }
        if (iOrdinal == 3) {
            return new EsServiceType$ServiceType();
        }
        if (iOrdinal == 4) {
            return new grz(DEFAULT_INSTANCE);
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
        synchronized (EsServiceType$ServiceType.class) {
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

    public final void o(hrz hrzVar) {
        this.serviceType_ = hrzVar.getNumber();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
