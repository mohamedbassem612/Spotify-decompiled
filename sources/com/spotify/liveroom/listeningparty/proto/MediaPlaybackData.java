package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MediaPlaybackData extends com.google.protobuf.h implements v2j0 {
    private static final MediaPlaybackData DEFAULT_INSTANCE;
    public static final int MEDIA_QUEUE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAUSED_CONTEXT_FIELD_NUMBER = 3;
    public static final int PLAYING_CONTEXT_FIELD_NUMBER = 2;
    public static final int STOPPED_CONTEXT_FIELD_NUMBER = 4;
    private Object payload_;
    private int payloadCase_ = 0;
    private h290 mediaQueue_ = com.google.protobuf.h.emptyProtobufList();

    public static final class PausedContext extends com.google.protobuf.h implements v2j0 {
        private static final PausedContext DEFAULT_INSTANCE;
        public static final int MEDIA_URI_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int PAUSED_AT_FIELD_NUMBER = 2;
        public static final int SEEK_TIME_FIELD_NUMBER = 3;
        private int bitField0_;
        private String mediaUri_ = "";
        private Timestamp pausedAt_;
        private Duration seekTime_;

        static {
            PausedContext pausedContext = new PausedContext();
            DEFAULT_INSTANCE = pausedContext;
            com.google.protobuf.h.registerDefaultInstance(PausedContext.class, pausedContext);
        }

        private PausedContext() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "mediaUri_", "pausedAt_", "seekTime_"});
            }
            if (iOrdinal == 3) {
                return new PausedContext();
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
            synchronized (PausedContext.class) {
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

    public static final class PlayingContext extends com.google.protobuf.h implements v2j0 {
        private static final PlayingContext DEFAULT_INSTANCE;
        public static final int MEDIA_URI_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int PLAYBACK_STARTED_AT_FIELD_NUMBER = 2;
        public static final int POSITION_STARTED_AT_FIELD_NUMBER = 3;
        private int bitField0_;
        private String mediaUri_ = "";
        private Timestamp playbackStartedAt_;
        private Duration positionStartedAt_;

        static {
            PlayingContext playingContext = new PlayingContext();
            DEFAULT_INSTANCE = playingContext;
            com.google.protobuf.h.registerDefaultInstance(PlayingContext.class, playingContext);
        }

        private PlayingContext() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "mediaUri_", "playbackStartedAt_", "positionStartedAt_"});
            }
            if (iOrdinal == 3) {
                return new PlayingContext();
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
            synchronized (PlayingContext.class) {
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

    public static final class StoppedContext extends com.google.protobuf.h implements v2j0 {
        private static final StoppedContext DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            StoppedContext stoppedContext = new StoppedContext();
            DEFAULT_INSTANCE = stoppedContext;
            com.google.protobuf.h.registerDefaultInstance(StoppedContext.class, stoppedContext);
        }

        private StoppedContext() {
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
                return new StoppedContext();
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
            synchronized (StoppedContext.class) {
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
        MediaPlaybackData mediaPlaybackData = new MediaPlaybackData();
        DEFAULT_INSTANCE = mediaPlaybackData;
        com.google.protobuf.h.registerDefaultInstance(MediaPlaybackData.class, mediaPlaybackData);
    }

    private MediaPlaybackData() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"payload_", "payloadCase_", "mediaQueue_", PlayingContext.class, PausedContext.class, StoppedContext.class});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackData();
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
        synchronized (MediaPlaybackData.class) {
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
