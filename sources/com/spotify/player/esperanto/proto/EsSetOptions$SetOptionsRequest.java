package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.orz;
import p.prz;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsSetOptions$SetOptionsRequest extends com.google.protobuf.h implements v2j0 {
    private static final EsSetOptions$SetOptionsRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 5;
    public static final int MODES_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 6;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER = 2;
    public static final int REPEATING_TRACK_FIELD_NUMBER = 1;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private qng0 modes_ = qng0.b;
    private EsCommandOptions$CommandOptions options_;
    private float playbackSpeed_;
    private EsOptional$OptionalBoolean repeatingContext_;
    private EsOptional$OptionalBoolean repeatingTrack_;
    private EsOptional$OptionalBoolean shufflingContext_;

    static {
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = new EsSetOptions$SetOptionsRequest();
        DEFAULT_INSTANCE = esSetOptions$SetOptionsRequest;
        com.google.protobuf.h.registerDefaultInstance(EsSetOptions$SetOptionsRequest.class, esSetOptions$SetOptionsRequest);
    }

    private EsSetOptions$SetOptionsRequest() {
    }

    public static orz o() {
        return (orz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ခ\u0005\u00072", new Object[]{"bitField0_", "repeatingTrack_", "repeatingContext_", "shufflingContext_", "options_", "loggingParams_", "playbackSpeed_", "modes_", prz.a});
        }
        if (iOrdinal == 3) {
            return new EsSetOptions$SetOptionsRequest();
        }
        if (iOrdinal == 4) {
            return new orz(DEFAULT_INSTANCE);
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
        synchronized (EsSetOptions$SetOptionsRequest.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.modes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.modes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 16;
    }

    public final void q(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        this.options_ = esCommandOptions$CommandOptions;
        this.bitField0_ |= 8;
    }

    public final void r(float f) {
        this.bitField0_ |= 32;
        this.playbackSpeed_ = f;
    }

    public final void s(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esOptional$OptionalBoolean.getClass();
        this.repeatingContext_ = esOptional$OptionalBoolean;
        this.bitField0_ |= 2;
    }

    public final void t(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esOptional$OptionalBoolean.getClass();
        this.repeatingTrack_ = esOptional$OptionalBoolean;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esOptional$OptionalBoolean.getClass();
        this.shufflingContext_ = esOptional$OptionalBoolean;
        this.bitField0_ |= 4;
    }
}
