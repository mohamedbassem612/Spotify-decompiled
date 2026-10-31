package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hub1;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ReadStartResponse extends h implements v2j0 {
    private static final ReadStartResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private phc sessionId_ = phc.b;
    private int statusCode_;

    static {
        ReadStartResponse readStartResponse = new ReadStartResponse();
        DEFAULT_INSTANCE = readStartResponse;
        h.registerDefaultInstance(ReadStartResponse.class, readStartResponse);
    }

    private ReadStartResponse() {
    }

    public static ReadStartResponse p(byte[] bArr) {
        return (ReadStartResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"statusCode_", "sessionId_"});
        }
        if (iOrdinal == 3) {
            return new ReadStartResponse();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (ReadStartResponse.class) {
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

    public final phc n() {
        return this.sessionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final hub1 o() {
        hub1 hub1Var;
        int i = this.statusCode_;
        if (i == 0) {
            hub1Var = hub1.INVALID_STATUS_CODE;
        } else if (i != 1) {
            hub1Var = i != 2 ? null : hub1.ERROR;
        } else {
            hub1Var = hub1.SUCCESS;
        }
        return hub1Var == null ? hub1.UNRECOGNIZED : hub1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
