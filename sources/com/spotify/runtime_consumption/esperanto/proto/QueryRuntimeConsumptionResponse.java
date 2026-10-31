package com.spotify.runtime_consumption.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class QueryRuntimeConsumptionResponse extends h implements v2j0 {
    private static final QueryRuntimeConsumptionResponse DEFAULT_INSTANCE;
    public static final int MS_PLAYED_LOCAL_FIELD_NUMBER = 1;
    public static final int MS_PLAYED_NOMINAL_LOCAL_FIELD_NUMBER = 2;
    public static final int MS_PLAYED_NOMINAL_SENT_FIELD_NUMBER = 4;
    public static final int MS_PLAYED_SENT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private long msPlayedLocal_;
    private long msPlayedNominalLocal_;
    private long msPlayedNominalSent_;
    private long msPlayedSent_;

    static {
        QueryRuntimeConsumptionResponse queryRuntimeConsumptionResponse = new QueryRuntimeConsumptionResponse();
        DEFAULT_INSTANCE = queryRuntimeConsumptionResponse;
        h.registerDefaultInstance(QueryRuntimeConsumptionResponse.class, queryRuntimeConsumptionResponse);
    }

    private QueryRuntimeConsumptionResponse() {
    }

    public static QueryRuntimeConsumptionResponse o(byte[] bArr) {
        return (QueryRuntimeConsumptionResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"msPlayedLocal_", "msPlayedNominalLocal_", "msPlayedSent_", "msPlayedNominalSent_"});
        }
        if (iOrdinal == 3) {
            return new QueryRuntimeConsumptionResponse();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (QueryRuntimeConsumptionResponse.class) {
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

    public final long n() {
        return this.msPlayedNominalLocal_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
