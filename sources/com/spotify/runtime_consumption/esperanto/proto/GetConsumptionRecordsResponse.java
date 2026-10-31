package com.spotify.runtime_consumption.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetConsumptionRecordsResponse extends h implements v2j0 {
    private static final GetConsumptionRecordsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RECORDS_FIELD_NUMBER = 1;
    private h290 records_ = h.emptyProtobufList();

    static {
        GetConsumptionRecordsResponse getConsumptionRecordsResponse = new GetConsumptionRecordsResponse();
        DEFAULT_INSTANCE = getConsumptionRecordsResponse;
        h.registerDefaultInstance(GetConsumptionRecordsResponse.class, getConsumptionRecordsResponse);
    }

    private GetConsumptionRecordsResponse() {
    }

    public static GetConsumptionRecordsResponse o(byte[] bArr) {
        return (GetConsumptionRecordsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"records_", ConsumptionRecord.class});
        }
        if (iOrdinal == 3) {
            return new GetConsumptionRecordsResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (GetConsumptionRecordsResponse.class) {
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

    public final h290 n() {
        return this.records_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
