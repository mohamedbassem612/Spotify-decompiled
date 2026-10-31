package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xrz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsStop$StopRequest extends com.google.protobuf.h implements v2j0 {
    private static final EsStop$StopRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private int reason_;

    static {
        EsStop$StopRequest esStop$StopRequest = new EsStop$StopRequest();
        DEFAULT_INSTANCE = esStop$StopRequest;
        com.google.protobuf.h.registerDefaultInstance(EsStop$StopRequest.class, esStop$StopRequest);
    }

    private EsStop$StopRequest() {
    }

    public static EsStop$StopRequest n() {
        return DEFAULT_INSTANCE;
    }

    public static xrz o() {
        return (xrz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "options_", "reason_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsStop$StopRequest();
        }
        if (iOrdinal == 4) {
            return new xrz(DEFAULT_INSTANCE);
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
        synchronized (EsStop$StopRequest.class) {
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

    public final void p(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
