package com.spotify.campfire.elements.sharedbychip.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RetrieveNudgeDataResponse extends h implements v2j0 {
    private static final RetrieveNudgeDataResponse DEFAULT_INSTANCE;
    public static final int NUDGE_DATA_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 nudgeData_ = h.emptyProtobufList();

    static {
        RetrieveNudgeDataResponse retrieveNudgeDataResponse = new RetrieveNudgeDataResponse();
        DEFAULT_INSTANCE = retrieveNudgeDataResponse;
        h.registerDefaultInstance(RetrieveNudgeDataResponse.class, retrieveNudgeDataResponse);
    }

    private RetrieveNudgeDataResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"nudgeData_", NudgeData.class});
        }
        if (iOrdinal == 3) {
            return new RetrieveNudgeDataResponse();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (RetrieveNudgeDataResponse.class) {
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
        return this.nudgeData_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
