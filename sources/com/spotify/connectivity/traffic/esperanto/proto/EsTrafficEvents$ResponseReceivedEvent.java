package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ksz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficEvents$ResponseReceivedEvent extends h implements v2j0 {
    private static final EsTrafficEvents$ResponseReceivedEvent DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsTrafficConnectionMetrics$ConnectionMetrics metrics_;
    private EsTrafficRequestInfo$RequestInfo request_;
    private EsTrafficResponseInfo$ResponseInfo response_;

    static {
        EsTrafficEvents$ResponseReceivedEvent esTrafficEvents$ResponseReceivedEvent = new EsTrafficEvents$ResponseReceivedEvent();
        DEFAULT_INSTANCE = esTrafficEvents$ResponseReceivedEvent;
        h.registerDefaultInstance(EsTrafficEvents$ResponseReceivedEvent.class, esTrafficEvents$ResponseReceivedEvent);
    }

    private EsTrafficEvents$ResponseReceivedEvent() {
    }

    public static EsTrafficEvents$ResponseReceivedEvent n() {
        return DEFAULT_INSTANCE;
    }

    public static ksz p() {
        return (ksz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "request_", "response_", "metrics_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$ResponseReceivedEvent();
        }
        if (iOrdinal == 4) {
            return new ksz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$ResponseReceivedEvent.class) {
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

    public final EsTrafficResponseInfo$ResponseInfo o() {
        EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo = this.response_;
        return esTrafficResponseInfo$ResponseInfo == null ? EsTrafficResponseInfo$ResponseInfo.o() : esTrafficResponseInfo$ResponseInfo;
    }

    public final void q(EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo) {
        this.response_ = esTrafficResponseInfo$ResponseInfo;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
