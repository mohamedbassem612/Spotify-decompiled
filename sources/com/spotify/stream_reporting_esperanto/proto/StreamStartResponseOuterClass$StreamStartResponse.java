package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StreamStartResponseOuterClass$StreamStartResponse extends h implements v2j0 {
    private static final StreamStartResponseOuterClass$StreamStartResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private StatusResponseOuterClass$StatusResponse status_;
    private StreamHandleOuterClass$StreamHandle streamHandle_;

    static {
        StreamStartResponseOuterClass$StreamStartResponse streamStartResponseOuterClass$StreamStartResponse = new StreamStartResponseOuterClass$StreamStartResponse();
        DEFAULT_INSTANCE = streamStartResponseOuterClass$StreamStartResponse;
        h.registerDefaultInstance(StreamStartResponseOuterClass$StreamStartResponse.class, streamStartResponseOuterClass$StreamStartResponse);
    }

    private StreamStartResponseOuterClass$StreamStartResponse() {
    }

    public static StreamStartResponseOuterClass$StreamStartResponse p(byte[] bArr) {
        return (StreamStartResponseOuterClass$StreamStartResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "streamHandle_"});
        }
        if (iOrdinal == 3) {
            return new StreamStartResponseOuterClass$StreamStartResponse();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (StreamStartResponseOuterClass$StreamStartResponse.class) {
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

    public final StatusResponseOuterClass$StatusResponse n() {
        StatusResponseOuterClass$StatusResponse statusResponseOuterClass$StatusResponse = this.status_;
        return statusResponseOuterClass$StatusResponse == null ? StatusResponseOuterClass$StatusResponse.n() : statusResponseOuterClass$StatusResponse;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final StreamHandleOuterClass$StreamHandle o() {
        StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle = this.streamHandle_;
        return streamHandleOuterClass$StreamHandle == null ? StreamHandleOuterClass$StreamHandle.n() : streamHandleOuterClass$StreamHandle;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
