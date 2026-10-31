package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mdc1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uqt0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StreamEndRequestOuterClass$StreamEndRequest extends h implements v2j0 {
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 5;
    private static final StreamEndRequestOuterClass$StreamEndRequest DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 3;
    public static final int SOURCE_END_FIELD_NUMBER = 2;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp clientTimestamp_;
    private int format_;
    private int reasonEnd_;
    private String sourceEnd_ = "";
    private StreamHandleOuterClass$StreamHandle streamHandle_;

    static {
        StreamEndRequestOuterClass$StreamEndRequest streamEndRequestOuterClass$StreamEndRequest = new StreamEndRequestOuterClass$StreamEndRequest();
        DEFAULT_INSTANCE = streamEndRequestOuterClass$StreamEndRequest;
        h.registerDefaultInstance(StreamEndRequestOuterClass$StreamEndRequest.class, streamEndRequestOuterClass$StreamEndRequest);
    }

    private StreamEndRequestOuterClass$StreamEndRequest() {
    }

    public static mdc1 n() {
        return (mdc1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f\u0004ဌ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "streamHandle_", "sourceEnd_", "reasonEnd_", "format_", "clientTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new StreamEndRequestOuterClass$StreamEndRequest();
        }
        if (iOrdinal == 4) {
            return new mdc1(DEFAULT_INSTANCE);
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
        synchronized (StreamEndRequestOuterClass$StreamEndRequest.class) {
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
        this.bitField0_ |= 4;
    }

    public final void p(uqt0 uqt0Var) {
        this.reasonEnd_ = uqt0Var.getNumber();
    }

    public final void q(StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle) {
        streamHandleOuterClass$StreamHandle.getClass();
        this.streamHandle_ = streamHandleOuterClass$StreamHandle;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
