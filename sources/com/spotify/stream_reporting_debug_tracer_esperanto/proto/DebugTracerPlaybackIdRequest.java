package com.spotify.stream_reporting_debug_tracer_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w8r;
import p.y8r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class DebugTracerPlaybackIdRequest extends h implements v2j0 {
    public static final int DEBUG_TRACE_POINT_FIELD_NUMBER = 1;
    private static final DebugTracerPlaybackIdRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    private int debugTracePoint_;
    private phc playbackId_ = phc.b;

    static {
        DebugTracerPlaybackIdRequest debugTracerPlaybackIdRequest = new DebugTracerPlaybackIdRequest();
        DEFAULT_INSTANCE = debugTracerPlaybackIdRequest;
        h.registerDefaultInstance(DebugTracerPlaybackIdRequest.class, debugTracerPlaybackIdRequest);
    }

    private DebugTracerPlaybackIdRequest() {
    }

    public static y8r n() {
        return (y8r) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"debugTracePoint_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new DebugTracerPlaybackIdRequest();
        }
        if (iOrdinal == 4) {
            return new y8r(DEFAULT_INSTANCE);
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
        synchronized (DebugTracerPlaybackIdRequest.class) {
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

    public final void p(hhc hhcVar) {
        this.playbackId_ = hhcVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
