package com.spotify.watchfeedentrypoints.api.v1;

import com.google.protobuf.h;
import p.bf40;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetMessageResponse extends h implements v2j0 {
    private static final GetMessageResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RETRY_AFTER_MS_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBMIT_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int retryAfterMs_;
    private Status status_;
    private long submitTimestampMs_;

    static {
        GetMessageResponse getMessageResponse = new GetMessageResponse();
        DEFAULT_INSTANCE = getMessageResponse;
        h.registerDefaultInstance(GetMessageResponse.class, getMessageResponse);
    }

    private GetMessageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u0002", new Object[]{"bitField0_", "status_", "retryAfterMs_", "submitTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new GetMessageResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (GetMessageResponse.class) {
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

    public final int getRetryAfterMs() {
        return this.retryAfterMs_;
    }

    public final Status n() {
        Status status = this.status_;
        return status == null ? Status.o() : status;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
