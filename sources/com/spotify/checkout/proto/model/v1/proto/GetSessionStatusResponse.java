package com.spotify.checkout.proto.model.v1.proto;

import p.aq40;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetSessionStatusResponse extends com.google.protobuf.h implements v2j0 {
    private static final GetSessionStatusResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        GetSessionStatusResponse getSessionStatusResponse = new GetSessionStatusResponse();
        DEFAULT_INSTANCE = getSessionStatusResponse;
        com.google.protobuf.h.registerDefaultInstance(GetSessionStatusResponse.class, getSessionStatusResponse);
    }

    private GetSessionStatusResponse() {
    }

    public static GetSessionStatusResponse n() {
        return DEFAULT_INSTANCE;
    }

    public static zp40 p() {
        return (zp40) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new GetSessionStatusResponse();
        }
        if (iOrdinal == 4) {
            return new zp40(DEFAULT_INSTANCE);
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
        synchronized (GetSessionStatusResponse.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final aq40 o() {
        aq40 aq40Var;
        int i = this.status_;
        if (i == 0) {
            aq40Var = aq40.STATUS_UNKNOWN;
        } else if (i == 1) {
            aq40Var = aq40.STATUS_OPEN;
        } else if (i == 2) {
            aq40Var = aq40.STATUS_LOCKED;
        } else if (i != 3) {
            aq40Var = i != 4 ? null : aq40.STATUS_COMPLETED;
        } else {
            aq40Var = aq40.STATUS_EXPIRED;
        }
        return aq40Var == null ? aq40.UNRECOGNIZED : aq40Var;
    }

    public final void q() {
        this.status_ = aq40.STATUS_COMPLETED.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
