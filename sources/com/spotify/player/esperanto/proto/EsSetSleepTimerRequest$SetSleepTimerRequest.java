package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsSetSleepTimerRequest$SetSleepTimerRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CLEAR_FIELD_NUMBER = 3;
    private static final EsSetSleepTimerRequest$SetSleepTimerRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int END_OF_TRACK_FIELD_NUMBER = 5;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private int timerTypeCase_ = 0;
    private Object timerType_;

    public static final class Clear extends com.google.protobuf.h implements v2j0 {
        private static final Clear DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Clear clear = new Clear();
            DEFAULT_INSTANCE = clear;
            com.google.protobuf.h.registerDefaultInstance(Clear.class, clear);
        }

        private Clear() {
        }

        public static b n() {
            return (b) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Clear();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (Clear.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Duration extends com.google.protobuf.h implements v2j0 {
        private static final Duration DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private com.google.protobuf.Duration duration_;

        static {
            Duration duration = new Duration();
            DEFAULT_INSTANCE = duration;
            com.google.protobuf.h.registerDefaultInstance(Duration.class, duration);
        }

        private Duration() {
        }

        public static c n() {
            return (c) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "duration_"});
            }
            if (iOrdinal == 3) {
                return new Duration();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (Duration.class) {
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

        public final void setDuration(com.google.protobuf.Duration duration) {
            duration.getClass();
            this.duration_ = duration;
            this.bitField0_ |= 1;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class EndOfTrack extends com.google.protobuf.h implements v2j0 {
        private static final EndOfTrack DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            EndOfTrack endOfTrack = new EndOfTrack();
            DEFAULT_INSTANCE = endOfTrack;
            com.google.protobuf.h.registerDefaultInstance(EndOfTrack.class, endOfTrack);
        }

        private EndOfTrack() {
        }

        public static d n() {
            return (d) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new EndOfTrack();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (EndOfTrack.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsSetSleepTimerRequest$SetSleepTimerRequest esSetSleepTimerRequest$SetSleepTimerRequest = new EsSetSleepTimerRequest$SetSleepTimerRequest();
        DEFAULT_INSTANCE = esSetSleepTimerRequest$SetSleepTimerRequest;
        com.google.protobuf.h.registerDefaultInstance(EsSetSleepTimerRequest$SetSleepTimerRequest.class, esSetSleepTimerRequest$SetSleepTimerRequest);
    }

    private EsSetSleepTimerRequest$SetSleepTimerRequest() {
    }

    public static a n() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"timerType_", "timerTypeCase_", "bitField0_", "options_", "loggingParams_", Clear.class, Duration.class, EndOfTrack.class});
        }
        if (iOrdinal == 3) {
            return new EsSetSleepTimerRequest$SetSleepTimerRequest();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (EsSetSleepTimerRequest$SetSleepTimerRequest.class) {
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

    public final void o(Clear clear) {
        clear.getClass();
        this.timerType_ = clear;
        this.timerTypeCase_ = 3;
    }

    public final void p(Duration duration) {
        duration.getClass();
        this.timerType_ = duration;
        this.timerTypeCase_ = 4;
    }

    public final void q(EndOfTrack endOfTrack) {
        endOfTrack.getClass();
        this.timerType_ = endOfTrack;
        this.timerTypeCase_ = 5;
    }

    public final void r(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 2;
    }

    public final void s(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        this.options_ = esCommandOptions$CommandOptions;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
