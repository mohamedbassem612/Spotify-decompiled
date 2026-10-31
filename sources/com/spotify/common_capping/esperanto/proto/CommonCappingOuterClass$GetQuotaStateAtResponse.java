package com.spotify.common_capping.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.trh;
import p.v2j0;
import p.wah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CommonCappingOuterClass$GetQuotaStateAtResponse extends h implements v2j0 {
    private static final CommonCappingOuterClass$GetQuotaStateAtResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUOTA_STATE_FIELD_NUMBER = 1;
    private int quotaState_;

    static {
        CommonCappingOuterClass$GetQuotaStateAtResponse commonCappingOuterClass$GetQuotaStateAtResponse = new CommonCappingOuterClass$GetQuotaStateAtResponse();
        DEFAULT_INSTANCE = commonCappingOuterClass$GetQuotaStateAtResponse;
        h.registerDefaultInstance(CommonCappingOuterClass$GetQuotaStateAtResponse.class, commonCappingOuterClass$GetQuotaStateAtResponse);
    }

    private CommonCappingOuterClass$GetQuotaStateAtResponse() {
    }

    public static CommonCappingOuterClass$GetQuotaStateAtResponse o(byte[] bArr) {
        return (CommonCappingOuterClass$GetQuotaStateAtResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"quotaState_"});
        }
        if (iOrdinal == 3) {
            return new CommonCappingOuterClass$GetQuotaStateAtResponse();
        }
        if (iOrdinal == 4) {
            return new wah(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (CommonCappingOuterClass$GetQuotaStateAtResponse.class) {
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

    public final trh n() {
        trh trhVar;
        int i = this.quotaState_;
        if (i == 0) {
            trhVar = trh.NO_QUOTA_DATA;
        } else if (i != 1) {
            trhVar = i != 2 ? null : trh.QUOTA_FULLY_CONSUMED;
        } else {
            trhVar = trh.HAS_REMAINING_QUOTA;
        }
        return trhVar == null ? trh.UNRECOGNIZED : trhVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
