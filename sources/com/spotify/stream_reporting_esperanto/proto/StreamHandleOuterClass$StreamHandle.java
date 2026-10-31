package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lub1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StreamHandleOuterClass$StreamHandle extends h implements v2j0 {
    private static final StreamHandleOuterClass$StreamHandle DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RAW_HANDLE_FIELD_NUMBER = 2;
    public static final int STREAM_ID_FIELD_NUMBER = 3;
    private int rawHandle_;
    private phc streamId_ = phc.b;

    static {
        StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle = new StreamHandleOuterClass$StreamHandle();
        DEFAULT_INSTANCE = streamHandleOuterClass$StreamHandle;
        h.registerDefaultInstance(StreamHandleOuterClass$StreamHandle.class, streamHandleOuterClass$StreamHandle);
    }

    private StreamHandleOuterClass$StreamHandle() {
    }

    public static StreamHandleOuterClass$StreamHandle n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\n", new Object[]{"rawHandle_", "streamId_"});
        }
        if (iOrdinal == 3) {
            return new StreamHandleOuterClass$StreamHandle();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (StreamHandleOuterClass$StreamHandle.class) {
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

    public final int o() {
        return this.rawHandle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
