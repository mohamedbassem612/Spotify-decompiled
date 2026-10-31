package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.upz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsPlay$PlayRequest extends com.google.protobuf.h implements v2j0 {
    private static final EsPlay$PlayRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 4;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_OPTIONS_FIELD_NUMBER = 2;
    public static final int PREPARE_PLAY_REQUEST_FIELD_NUMBER = 1;
    public static final int REPLACED_LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 7;
    public static final int STREAM_POLICY_FIELD_NUMBER = 5;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPlayOptions$PlayOptions playOptions_;
    private EsPreparePlay$PreparePlayRequest preparePlayRequest_;
    private String replacedLogicalPlaybackIdentifier_ = "";
    private int streamPolicy_;

    static {
        EsPlay$PlayRequest esPlay$PlayRequest = new EsPlay$PlayRequest();
        DEFAULT_INSTANCE = esPlay$PlayRequest;
        com.google.protobuf.h.registerDefaultInstance(EsPlay$PlayRequest.class, esPlay$PlayRequest);
    }

    private EsPlay$PlayRequest() {
    }

    public static upz n() {
        return (upz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\f\u0007ለ\u0004", new Object[]{"bitField0_", "preparePlayRequest_", "playOptions_", "options_", "loggingParams_", "streamPolicy_", "replacedLogicalPlaybackIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsPlay$PlayRequest();
        }
        if (iOrdinal == 4) {
            return new upz(DEFAULT_INSTANCE);
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
        synchronized (EsPlay$PlayRequest.class) {
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
        esLoggingParams$LoggingParams.getClass();
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 8;
    }

    public final void p(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        esPlayOptions$PlayOptions.getClass();
        this.playOptions_ = esPlayOptions$PlayOptions;
        this.bitField0_ |= 2;
    }

    public final void q(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest) {
        esPreparePlay$PreparePlayRequest.getClass();
        this.preparePlayRequest_ = esPreparePlay$PreparePlayRequest;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
