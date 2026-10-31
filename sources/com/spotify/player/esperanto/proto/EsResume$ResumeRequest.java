package com.spotify.player.esperanto.proto;

import p.bf40;
import p.drz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsResume$ResumeRequest extends com.google.protobuf.h implements v2j0 {
    private static final EsResume$ResumeRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESUME_ORIGIN_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPauseresumeOrigin$PauseResumeOrigin resumeOrigin_;

    static {
        EsResume$ResumeRequest esResume$ResumeRequest = new EsResume$ResumeRequest();
        DEFAULT_INSTANCE = esResume$ResumeRequest;
        com.google.protobuf.h.registerDefaultInstance(EsResume$ResumeRequest.class, esResume$ResumeRequest);
    }

    private EsResume$ResumeRequest() {
    }

    public static drz n() {
        return (drz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "options_", "loggingParams_", "resumeOrigin_"});
        }
        if (iOrdinal == 3) {
            return new EsResume$ResumeRequest();
        }
        if (iOrdinal == 4) {
            return new drz(DEFAULT_INSTANCE);
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
        synchronized (EsResume$ResumeRequest.class) {
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
        this.bitField0_ |= 2;
    }

    public final void p(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esCommandOptions$CommandOptions.getClass();
        this.options_ = esCommandOptions$CommandOptions;
        this.bitField0_ |= 1;
    }

    public final void q(EsPauseresumeOrigin$PauseResumeOrigin esPauseresumeOrigin$PauseResumeOrigin) {
        esPauseresumeOrigin$PauseResumeOrigin.getClass();
        this.resumeOrigin_ = esPauseresumeOrigin$PauseResumeOrigin;
        this.bitField0_ |= 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
