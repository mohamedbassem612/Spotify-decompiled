package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iub1;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StatusResponseOuterClass$StatusResponse extends h implements v2j0 {
    private static final StatusResponseOuterClass$StatusResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private int statusCode_;

    static {
        StatusResponseOuterClass$StatusResponse statusResponseOuterClass$StatusResponse = new StatusResponseOuterClass$StatusResponse();
        DEFAULT_INSTANCE = statusResponseOuterClass$StatusResponse;
        h.registerDefaultInstance(StatusResponseOuterClass$StatusResponse.class, statusResponseOuterClass$StatusResponse);
    }

    private StatusResponseOuterClass$StatusResponse() {
    }

    public static StatusResponseOuterClass$StatusResponse n() {
        return DEFAULT_INSTANCE;
    }

    public static StatusResponseOuterClass$StatusResponse p(byte[] bArr) {
        return (StatusResponseOuterClass$StatusResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"statusCode_"});
        }
        if (iOrdinal == 3) {
            return new StatusResponseOuterClass$StatusResponse();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (StatusResponseOuterClass$StatusResponse.class) {
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

    public final iub1 o() {
        iub1 iub1Var;
        int i = this.statusCode_;
        if (i == 0) {
            iub1Var = iub1.INVALID_STATUS_CODE;
        } else if (i == 1) {
            iub1Var = iub1.SUCCESS;
        } else if (i == 2) {
            iub1Var = iub1.EVENT_SENDER_ERROR;
        } else if (i == 3) {
            iub1Var = iub1.INVALID_STREAM_HANDLE;
        } else if (i != 4) {
            iub1Var = i != 5 ? null : iub1.IGNORED;
        } else {
            iub1Var = iub1.PENDING_EVENTS_ERROR;
        }
        return iub1Var == null ? iub1.UNRECOGNIZED : iub1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
