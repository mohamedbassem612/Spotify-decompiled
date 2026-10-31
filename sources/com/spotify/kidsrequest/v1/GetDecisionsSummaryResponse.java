package com.spotify.kidsrequest.v1;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetDecisionsSummaryResponse extends h implements v2j0 {
    public static final int APPROVED_COUNT_FIELD_NUMBER = 1;
    private static final GetDecisionsSummaryResponse DEFAULT_INSTANCE;
    public static final int DENIED_COUNT_FIELD_NUMBER = 2;
    public static final int DENIED_ENTITY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int approvedCount_;
    private int bitField0_;
    private int deniedCount_;
    private DeniedEntity deniedEntity_;

    static {
        GetDecisionsSummaryResponse getDecisionsSummaryResponse = new GetDecisionsSummaryResponse();
        DEFAULT_INSTANCE = getDecisionsSummaryResponse;
        h.registerDefaultInstance(GetDecisionsSummaryResponse.class, getDecisionsSummaryResponse);
    }

    private GetDecisionsSummaryResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "approvedCount_", "deniedCount_", "deniedEntity_"});
        }
        if (iOrdinal == 3) {
            return new GetDecisionsSummaryResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (GetDecisionsSummaryResponse.class) {
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

    public final int n() {
        return this.approvedCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.deniedCount_;
    }

    public final DeniedEntity p() {
        DeniedEntity deniedEntity = this.deniedEntity_;
        return deniedEntity == null ? DeniedEntity.o() : deniedEntity;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
