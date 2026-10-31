package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class VideoConfiguration extends com.google.protobuf.h implements v2j0 {
    private static final VideoConfiguration DEFAULT_INSTANCE;
    public static final int DURATION_MILLIS_FIELD_NUMBER = 2;
    public static final int ERROR_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int LOOP_FIELD_NUMBER = 3;
    public static final int OUTLINE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_ACTION_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int VIDEO_PLAYER_ACCESSIBILITY_LABEL_FIELD_NUMBER = 7;
    private int bitField0_;
    private long durationMillis_;
    private Error errorConfiguration_;
    private boolean loop_;
    private Outline outline_;
    private Source source_;
    private String playActionDescription_ = "";
    private String videoPlayerAccessibilityLabel_ = "";

    public static final class Error extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
        public static final int BUTTON_FIELD_NUMBER = 4;
        private static final Error DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String backgroundColor_ = "";
        private int bitField0_;
        private ButtonConfiguration button_;
        private Paragraph subtitle_;
        private Paragraph title_;

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            com.google.protobuf.h.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        public static Error p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"bitField0_", "title_", "subtitle_", "backgroundColor_", "button_"});
            }
            if (iOrdinal == 3) {
                return new Error();
            }
            if (iOrdinal == 4) {
                return new p2(DEFAULT_INSTANCE);
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
            synchronized (Error.class) {
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

        public final String n() {
            return this.backgroundColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final ButtonConfiguration o() {
            ButtonConfiguration buttonConfiguration = this.button_;
            return buttonConfiguration == null ? ButtonConfiguration.o() : buttonConfiguration;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.subtitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph r() {
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Source extends com.google.protobuf.h implements v2j0 {
        private static final Source DEFAULT_INSTANCE;
        public static final int MANIFEST_ID_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private int sourceOneofCase_ = 0;
        private Object sourceOneof_;

        static {
            Source source = new Source();
            DEFAULT_INSTANCE = source;
            com.google.protobuf.h.registerDefaultInstance(Source.class, source);
        }

        private Source() {
        }

        public static Source n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"sourceOneof_", "sourceOneofCase_"});
            }
            if (iOrdinal == 3) {
                return new Source();
            }
            if (iOrdinal == 4) {
                return new q2(DEFAULT_INSTANCE);
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
            synchronized (Source.class) {
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

        public final String getManifestId() {
            return this.sourceOneofCase_ == 2 ? (String) this.sourceOneof_ : "";
        }

        public final String getUrl() {
            return this.sourceOneofCase_ == 1 ? (String) this.sourceOneof_ : "";
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int o() {
            int i = this.sourceOneofCase_;
            if (i == 0) {
                return 3;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        VideoConfiguration videoConfiguration = new VideoConfiguration();
        DEFAULT_INSTANCE = videoConfiguration;
        com.google.protobuf.h.registerDefaultInstance(VideoConfiguration.class, videoConfiguration);
    }

    private VideoConfiguration() {
    }

    public static VideoConfiguration n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003\u0007\u0004ဉ\u0001\u0005ဉ\u0002\u0006Ȉ\u0007Ȉ", new Object[]{"bitField0_", "source_", "durationMillis_", "loop_", "errorConfiguration_", "outline_", "playActionDescription_", "videoPlayerAccessibilityLabel_"});
        }
        if (iOrdinal == 3) {
            return new VideoConfiguration();
        }
        if (iOrdinal == 4) {
            return new o2(DEFAULT_INSTANCE);
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
        synchronized (VideoConfiguration.class) {
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

    public final long o() {
        return this.durationMillis_;
    }

    public final Error p() {
        Error error = this.errorConfiguration_;
        return error == null ? Error.p() : error;
    }

    public final boolean q() {
        return this.loop_;
    }

    public final String r() {
        return this.playActionDescription_;
    }

    public final Source s() {
        Source source = this.source_;
        return source == null ? Source.n() : source;
    }

    public final String t() {
        return this.videoPlayerAccessibilityLabel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
