package com.spotify.contentagnostic.v2;

import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.nqj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class PlaybackTrait extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_FIELD_NUMBER = 1;
    private static final PlaybackTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private h290 audio_ = com.google.protobuf.h.emptyProtobufList();
    private h290 video_ = com.google.protobuf.h.emptyProtobufList();

    public static final class AudioMapEntry extends com.google.protobuf.h implements v2j0 {
        private static final AudioMapEntry DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int key_;
        private AudioPlayback value_;

        static {
            AudioMapEntry audioMapEntry = new AudioMapEntry();
            DEFAULT_INSTANCE = audioMapEntry;
            com.google.protobuf.h.registerDefaultInstance(AudioMapEntry.class, audioMapEntry);
        }

        private AudioMapEntry() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "key_", "value_"});
            }
            if (iOrdinal == 3) {
                return new AudioMapEntry();
            }
            if (iOrdinal == 4) {
                return new g(DEFAULT_INSTANCE);
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
            synchronized (AudioMapEntry.class) {
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

        public final AudioPlayback n() {
            AudioPlayback audioPlayback = this.value_;
            return audioPlayback == null ? AudioPlayback.n() : audioPlayback;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VideoMapEntry extends com.google.protobuf.h implements v2j0 {
        private static final VideoMapEntry DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int key_;
        private VideoPlayback value_;

        static {
            VideoMapEntry videoMapEntry = new VideoMapEntry();
            DEFAULT_INSTANCE = videoMapEntry;
            com.google.protobuf.h.registerDefaultInstance(VideoMapEntry.class, videoMapEntry);
        }

        private VideoMapEntry() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "key_", "value_"});
            }
            if (iOrdinal == 3) {
                return new VideoMapEntry();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (VideoMapEntry.class) {
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

        public final nqj1 n() {
            nqj1 nqj1Var;
            int i = this.key_;
            if (i != 0) {
                nqj1Var = i != 1 ? null : nqj1.VIDEO_MEDIA_FORMAT_ADAPTIVE;
            } else {
                nqj1Var = nqj1.VIDEO_MEDIA_FORMAT_UNSPECIFIED;
            }
            return nqj1Var == null ? nqj1.UNRECOGNIZED : nqj1Var;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final VideoPlayback o() {
            VideoPlayback videoPlayback = this.value_;
            return videoPlayback == null ? VideoPlayback.n() : videoPlayback;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PlaybackTrait playbackTrait = new PlaybackTrait();
        DEFAULT_INSTANCE = playbackTrait;
        com.google.protobuf.h.registerDefaultInstance(PlaybackTrait.class, playbackTrait);
    }

    private PlaybackTrait() {
    }

    public static PlaybackTrait o(byte[] bArr) {
        return (PlaybackTrait) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"audio_", AudioMapEntry.class, "video_", VideoMapEntry.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackTrait();
        }
        if (iOrdinal == 4) {
            return new h(DEFAULT_INSTANCE);
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
        synchronized (PlaybackTrait.class) {
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

    public final List getVideoList() {
        return this.video_;
    }

    public final h290 n() {
        return this.audio_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
