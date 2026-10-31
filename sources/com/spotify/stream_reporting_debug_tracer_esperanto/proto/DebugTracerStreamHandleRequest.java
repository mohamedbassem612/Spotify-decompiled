package com.spotify.stream_reporting_debug_tracer_esperanto.proto;

import com.google.protobuf.h;
import p.a9r;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w8r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class DebugTracerStreamHandleRequest extends h implements v2j0 {
    public static final int DEBUG_TRACE_POINT_FIELD_NUMBER = 1;
    private static final DebugTracerStreamHandleRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RAW_STREAM_HANDLE_FIELD_NUMBER = 2;
    private int debugTracePoint_;
    private int rawStreamHandle_;

    static {
        DebugTracerStreamHandleRequest debugTracerStreamHandleRequest = new DebugTracerStreamHandleRequest();
        DEFAULT_INSTANCE = debugTracerStreamHandleRequest;
        h.registerDefaultInstance(DebugTracerStreamHandleRequest.class, debugTracerStreamHandleRequest);
    }

    private DebugTracerStreamHandleRequest() {
    }

    public static a9r n() {
        return (a9r) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"debugTracePoint_", "rawStreamHandle_"});
        }
        if (iOrdinal == 3) {
            return new DebugTracerStreamHandleRequest();
        }
        if (iOrdinal == 4) {
            return new a9r(DEFAULT_INSTANCE);
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
        synchronized (DebugTracerStreamHandleRequest.class) {
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

    public final void o(w8r w8rVar) {
        this.debugTracePoint_ = w8rVar.getNumber();
    }

    public final void p(int i) {
        this.rawStreamHandle_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
