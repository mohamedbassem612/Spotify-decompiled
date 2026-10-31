package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsSleepTimer$SleepTimer extends h implements v2j0 {
    private static final EsSleepTimer$SleepTimer DEFAULT_INSTANCE;
    public static final int END_OF_TRACK_FIELD_NUMBER = 3;
    public static final int NONE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int timerTypeCase_ = 0;
    private Object timerType_;

    public static final class EndOfTrack extends h implements v2j0 {
        private static final EndOfTrack DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            EndOfTrack endOfTrack = new EndOfTrack();
            DEFAULT_INSTANCE = endOfTrack;
            h.registerDefaultInstance(EndOfTrack.class, endOfTrack);
        }

        private EndOfTrack() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new EndOfTrack();
            }
            if (iOrdinal == 4) {
                return new f();
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

    public static final class None extends h implements v2j0 {
        private static final None DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            None none = new None();
            DEFAULT_INSTANCE = none;
            h.registerDefaultInstance(None.class, none);
        }

        private None() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new None();
            }
            if (iOrdinal == 4) {
                return new g();
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
            synchronized (None.class) {
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

    public static final class Timestamp extends h implements v2j0 {
        private static final Timestamp DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private long timestamp_;

        static {
            Timestamp timestamp = new Timestamp();
            DEFAULT_INSTANCE = timestamp;
            h.registerDefaultInstance(Timestamp.class, timestamp);
        }

        private Timestamp() {
        }

        public static Timestamp o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"timestamp_"});
            }
            if (iOrdinal == 3) {
                return new Timestamp();
            }
            if (iOrdinal == 4) {
                return new h();
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
            synchronized (Timestamp.class) {
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

        public final long getTimestamp() {
            return this.timestamp_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsSleepTimer$SleepTimer esSleepTimer$SleepTimer = new EsSleepTimer$SleepTimer();
        DEFAULT_INSTANCE = esSleepTimer$SleepTimer;
        h.registerDefaultInstance(EsSleepTimer$SleepTimer.class, esSleepTimer$SleepTimer);
    }

    private EsSleepTimer$SleepTimer() {
    }

    public static EsSleepTimer$SleepTimer o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"timerType_", "timerTypeCase_", None.class, Timestamp.class, EndOfTrack.class});
        }
        if (iOrdinal == 3) {
            return new EsSleepTimer$SleepTimer();
        }
        if (iOrdinal == 4) {
            return new e();
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
        synchronized (EsSleepTimer$SleepTimer.class) {
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

    public final boolean hasTimestamp() {
        return this.timerTypeCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Timestamp p() {
        return this.timerTypeCase_ == 2 ? (Timestamp) this.timerType_ : Timestamp.o();
    }

    public final boolean q() {
        return this.timerTypeCase_ == 3;
    }

    public final boolean r() {
        return this.timerTypeCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
