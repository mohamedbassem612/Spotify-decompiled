package com.spotify.kidsrequest.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qp21;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetRequestStatusResponse extends h implements v2j0 {
    private static final GetRequestStatusResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        GetRequestStatusResponse getRequestStatusResponse = new GetRequestStatusResponse();
        DEFAULT_INSTANCE = getRequestStatusResponse;
        h.registerDefaultInstance(GetRequestStatusResponse.class, getRequestStatusResponse);
    }

    private GetRequestStatusResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new GetRequestStatusResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (GetRequestStatusResponse.class) {
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

    public final qp21 n() {
        qp21 qp21Var;
        int i = this.result_;
        if (i == 0) {
            qp21Var = qp21.REQUEST_STATUS_RESULT_UNSPECIFIED;
        } else if (i == 1) {
            qp21Var = qp21.REQUEST_STATUS_RESULT_CAN_REQUEST;
        } else if (i == 2) {
            qp21Var = qp21.REQUEST_STATUS_RESULT_PENDING;
        } else if (i != 3) {
            qp21Var = i != 4 ? null : qp21.REQUEST_STATUS_RESULT_DENIED_COOLDOWN;
        } else {
            qp21Var = qp21.REQUEST_STATUS_RESULT_DAILY_LIMIT_REACHED;
        }
        return qp21Var == null ? qp21.UNRECOGNIZED : qp21Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
