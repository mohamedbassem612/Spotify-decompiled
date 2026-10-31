package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.kkz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsAddToQueueRequest$AddToQueueRequest extends com.google.protobuf.h implements v2j0 {
    private static final EsAddToQueueRequest$AddToQueueRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsContextTrack.ContextTrack track_;

    static {
        EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest = new EsAddToQueueRequest$AddToQueueRequest();
        DEFAULT_INSTANCE = esAddToQueueRequest$AddToQueueRequest;
        com.google.protobuf.h.registerDefaultInstance(EsAddToQueueRequest$AddToQueueRequest.class, esAddToQueueRequest$AddToQueueRequest);
    }

    private EsAddToQueueRequest$AddToQueueRequest() {
    }

    public static kkz n() {
        return (kkz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "track_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsAddToQueueRequest$AddToQueueRequest();
        }
        if (iOrdinal == 4) {
            return new kkz(DEFAULT_INSTANCE);
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
        synchronized (EsAddToQueueRequest$AddToQueueRequest.class) {
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

    public final void o(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 4;
    }

    public final void p(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        this.options_ = esCommandOptions$CommandOptions;
        this.bitField0_ |= 2;
    }

    public final void q(EsContextTrack.ContextTrack contextTrack) {
        this.track_ = contextTrack;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
