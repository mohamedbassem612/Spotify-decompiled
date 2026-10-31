package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jsz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficEvents$RequestReadyEvent extends h implements v2j0 {
    public static final int CONNECTION_INFO_FIELD_NUMBER = 2;
    private static final EsTrafficEvents$RequestReadyEvent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsTrafficConnectionInfo$ConnectionInfo connectionInfo_;
    private EsTrafficRequestInfo$RequestInfo request_;

    static {
        EsTrafficEvents$RequestReadyEvent esTrafficEvents$RequestReadyEvent = new EsTrafficEvents$RequestReadyEvent();
        DEFAULT_INSTANCE = esTrafficEvents$RequestReadyEvent;
        h.registerDefaultInstance(EsTrafficEvents$RequestReadyEvent.class, esTrafficEvents$RequestReadyEvent);
    }

    private EsTrafficEvents$RequestReadyEvent() {
    }

    public static EsTrafficEvents$RequestReadyEvent o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static jsz q() {
        return (jsz) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "connectionInfo_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$RequestReadyEvent();
        }
        if (iOrdinal == 4) {
            return new jsz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$RequestReadyEvent.class) {
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

    public final EsTrafficConnectionInfo$ConnectionInfo n() {
        EsTrafficConnectionInfo$ConnectionInfo esTrafficConnectionInfo$ConnectionInfo = this.connectionInfo_;
        return esTrafficConnectionInfo$ConnectionInfo == null ? EsTrafficConnectionInfo$ConnectionInfo.o() : esTrafficConnectionInfo$ConnectionInfo;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsTrafficRequestInfo$RequestInfo p() {
        EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo = this.request_;
        return esTrafficRequestInfo$RequestInfo == null ? EsTrafficRequestInfo$RequestInfo.p() : esTrafficRequestInfo$RequestInfo;
    }

    public final void r(EsTrafficConnectionInfo$ConnectionInfo esTrafficConnectionInfo$ConnectionInfo) {
        esTrafficConnectionInfo$ConnectionInfo.getClass();
        this.connectionInfo_ = esTrafficConnectionInfo$ConnectionInfo;
        this.bitField0_ |= 2;
    }

    public final void s(EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo) {
        this.request_ = esTrafficRequestInfo$RequestInfo;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
