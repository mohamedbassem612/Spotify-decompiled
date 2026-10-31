package com.spotify.connectivity.quality.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zlz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsConnectionQualityService$ConnectionQualityEvent extends h implements v2j0 {
    public static final int CONNECTION_QUALITY_FIELD_NUMBER = 1;
    private static final EsConnectionQualityService$ConnectionQualityEvent DEFAULT_INSTANCE;
    public static final int LAST_KNOWN_QUALITY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int connectionQuality_;
    private int lastKnownQuality_;

    static {
        EsConnectionQualityService$ConnectionQualityEvent esConnectionQualityService$ConnectionQualityEvent = new EsConnectionQualityService$ConnectionQualityEvent();
        DEFAULT_INSTANCE = esConnectionQualityService$ConnectionQualityEvent;
        h.registerDefaultInstance(EsConnectionQualityService$ConnectionQualityEvent.class, esConnectionQualityService$ConnectionQualityEvent);
    }

    private EsConnectionQualityService$ConnectionQualityEvent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsConnectionQualityService$ConnectionQualityEvent q(byte[] bArr) {
        return (EsConnectionQualityService$ConnectionQualityEvent) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"connectionQuality_", "lastKnownQuality_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionQualityService$ConnectionQualityEvent();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 19);
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
        synchronized (EsConnectionQualityService$ConnectionQualityEvent.class) {
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

    public final zlz o() {
        zlz zlzVarA = zlz.a(this.connectionQuality_);
        return zlzVarA == null ? zlz.UNRECOGNIZED : zlzVarA;
    }

    public final zlz p() {
        zlz zlzVarA = zlz.a(this.lastKnownQuality_);
        return zlzVarA == null ? zlz.UNRECOGNIZED : zlzVarA;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
