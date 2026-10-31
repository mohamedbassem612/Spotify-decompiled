package com.spotify.player.esperanto.proto;

import p.bf40;
import p.erz;
import p.frz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsSeekTo$SeekToRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CREATOR_TIMESTAMP_POSITION_MS_FIELD_NUMBER = 5;
    private static final EsSeekTo$SeekToRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int RELATIVE_FIELD_NUMBER = 4;
    private int bitField0_;
    private EsOptional.OptionalInt64 creatorTimestampPositionMs_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private long position_;
    private int relative_;

    static {
        EsSeekTo$SeekToRequest esSeekTo$SeekToRequest = new EsSeekTo$SeekToRequest();
        DEFAULT_INSTANCE = esSeekTo$SeekToRequest;
        com.google.protobuf.h.registerDefaultInstance(EsSeekTo$SeekToRequest.class, esSeekTo$SeekToRequest);
    }

    private EsSeekTo$SeekToRequest() {
    }

    public static erz n() {
        return (erz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0002\u0004\f\u0005ဉ\u0002", new Object[]{"bitField0_", "options_", "loggingParams_", "position_", "relative_", "creatorTimestampPositionMs_"});
        }
        if (iOrdinal == 3) {
            return new EsSeekTo$SeekToRequest();
        }
        if (iOrdinal == 4) {
            return new erz(DEFAULT_INSTANCE);
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
        synchronized (EsSeekTo$SeekToRequest.class) {
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

    public final void o(EsOptional.OptionalInt64 optionalInt64) {
        optionalInt64.getClass();
        this.creatorTimestampPositionMs_ = optionalInt64;
        this.bitField0_ |= 4;
    }

    public final void p(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 2;
    }

    public final void q(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esCommandOptions$CommandOptions.getClass();
        this.options_ = esCommandOptions$CommandOptions;
        this.bitField0_ |= 1;
    }

    public final void r(long j) {
        this.position_ = j;
    }

    public final void s(frz frzVar) {
        this.relative_ = frzVar.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
