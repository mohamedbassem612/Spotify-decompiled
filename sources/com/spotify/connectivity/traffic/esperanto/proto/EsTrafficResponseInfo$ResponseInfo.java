package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tsz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficResponseInfo$ResponseInfo extends h implements v2j0 {
    public static final int BYTES_RECEIVED_FIELD_NUMBER = 2;
    private static final EsTrafficResponseInfo$ResponseInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private long bytesReceived_;
    private int statusCode_;

    static {
        EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo = new EsTrafficResponseInfo$ResponseInfo();
        DEFAULT_INSTANCE = esTrafficResponseInfo$ResponseInfo;
        h.registerDefaultInstance(EsTrafficResponseInfo$ResponseInfo.class, esTrafficResponseInfo$ResponseInfo);
    }

    private EsTrafficResponseInfo$ResponseInfo() {
    }

    public static EsTrafficResponseInfo$ResponseInfo o() {
        return DEFAULT_INSTANCE;
    }

    public static tsz p() {
        return (tsz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0002", new Object[]{"statusCode_", "bytesReceived_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficResponseInfo$ResponseInfo();
        }
        if (iOrdinal == 4) {
            return new tsz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficResponseInfo$ResponseInfo.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    public final long n() {
        return this.bytesReceived_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(long j) {
        this.bytesReceived_ = j;
    }

    public final void setStatusCode(int i) {
        this.statusCode_ = i;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
