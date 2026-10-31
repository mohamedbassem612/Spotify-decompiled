package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.afc1;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StreamSeekRequestOuterClass$StreamSeekRequest extends h implements v2j0 {
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 5;
    private static final StreamSeekRequestOuterClass$StreamSeekRequest DEFAULT_INSTANCE;
    public static final int FROM_POSITION_FIELD_NUMBER = 3;
    public static final int IS_SYSTEM_INITIATED_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 1;
    public static final int TO_POSITION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp clientTimestamp_;
    private long fromPosition_;
    private boolean isSystemInitiated_;
    private StreamHandleOuterClass$StreamHandle streamHandle_;
    private long toPosition_;

    static {
        StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = new StreamSeekRequestOuterClass$StreamSeekRequest();
        DEFAULT_INSTANCE = streamSeekRequestOuterClass$StreamSeekRequest;
        h.registerDefaultInstance(StreamSeekRequestOuterClass$StreamSeekRequest.class, streamSeekRequestOuterClass$StreamSeekRequest);
    }

    private StreamSeekRequestOuterClass$StreamSeekRequest() {
    }

    public static afc1 n() {
        return (afc1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003\u0003\u0004\u0003\u0005ဉ\u0001\u0006ဇ\u0002", new Object[]{"bitField0_", "streamHandle_", "fromPosition_", "toPosition_", "clientTimestamp_", "isSystemInitiated_"});
        }
        if (iOrdinal == 3) {
            return new StreamSeekRequestOuterClass$StreamSeekRequest();
        }
        if (iOrdinal == 4) {
            return new afc1(DEFAULT_INSTANCE);
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
        synchronized (StreamSeekRequestOuterClass$StreamSeekRequest.class) {
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

    public final void o(Timestamp timestamp) {
        this.clientTimestamp_ = timestamp;
        this.bitField0_ |= 2;
    }

    public final void p(long j) {
        this.fromPosition_ = j;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 4;
        this.isSystemInitiated_ = z;
    }

    public final void r(StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle) {
        streamHandleOuterClass$StreamHandle.getClass();
        this.streamHandle_ = streamHandleOuterClass$StreamHandle;
        this.bitField0_ |= 1;
    }

    public final void s(long j) {
        this.toPosition_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
