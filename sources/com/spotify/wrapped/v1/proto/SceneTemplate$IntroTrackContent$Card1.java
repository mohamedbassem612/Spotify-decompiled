package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$IntroTrackContent$Card1 extends com.google.protobuf.h implements v2j0 {
    public static final int ALBUM_ART_FIELD_NUMBER = 3;
    public static final int CANVAS_FIELD_NUMBER = 5;
    private static final SceneTemplate$IntroTrackContent$Card1 DEFAULT_INSTANCE;
    public static final int FLIP_CALENDAR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RIVE_BACKGROUND_ANIMATION_FIELD_NUMBER = 4;
    public static final int TRACK_REVEAL_FIELD_NUMBER = 2;
    private Image albumArt_;
    private int bitField0_;
    private Canvas canvas_;
    private FlipCalendar flipCalendar_;
    private RiveAnimation riveBackgroundAnimation_;
    private TrackReveal trackReveal_;

    public static final class FlipCalendar extends com.google.protobuf.h implements v2j0 {
        public static final int DATE_SEGMENTS_FIELD_NUMBER = 2;
        private static final FlipCalendar DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TIME_SEGMENTS_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private h290 dateSegments_ = com.google.protobuf.h.emptyProtobufList();
        private h290 timeSegments_ = com.google.protobuf.h.emptyProtobufList();
        private Paragraph title_;

        static {
            FlipCalendar flipCalendar = new FlipCalendar();
            DEFAULT_INSTANCE = flipCalendar;
            com.google.protobuf.h.registerDefaultInstance(FlipCalendar.class, flipCalendar);
        }

        private FlipCalendar() {
        }

        public static FlipCalendar o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"bitField0_", "title_", "dateSegments_", FlipSegment.class, "timeSegments_", FlipSegment.class});
            }
            if (iOrdinal == 3) {
                return new FlipCalendar();
            }
            if (iOrdinal == 4) {
                return new w0(DEFAULT_INSTANCE);
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
            synchronized (FlipCalendar.class) {
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

        public final h290 n() {
            return this.dateSegments_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 p() {
            return this.timeSegments_;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class FlipSegment extends com.google.protobuf.h implements v2j0 {
        private static final FlipSegment DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SEPARATOR_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private int contentCase_ = 0;
        private Object content_;

        static {
            FlipSegment flipSegment = new FlipSegment();
            DEFAULT_INSTANCE = flipSegment;
            com.google.protobuf.h.registerDefaultInstance(FlipSegment.class, flipSegment);
        }

        private FlipSegment() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"content_", "contentCase_", FlipValue.class, Paragraph.class});
            }
            if (iOrdinal == 3) {
                return new FlipSegment();
            }
            if (iOrdinal == 4) {
                return new x0(DEFAULT_INSTANCE);
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
            synchronized (FlipSegment.class) {
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

        public final int n() {
            int i = this.contentCase_;
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

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Paragraph o() {
            return this.contentCase_ == 2 ? (Paragraph) this.content_ : Paragraph.n();
        }

        public final FlipValue p() {
            return this.contentCase_ == 1 ? (FlipValue) this.content_ : FlipValue.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class FlipValue extends com.google.protobuf.h implements v2j0 {
        private static final FlipValue DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        public static final int TARGET_FIELD_NUMBER = 2;
        private int bitField0_;
        private Paragraph start_;
        private Paragraph target_;

        static {
            FlipValue flipValue = new FlipValue();
            DEFAULT_INSTANCE = flipValue;
            com.google.protobuf.h.registerDefaultInstance(FlipValue.class, flipValue);
        }

        private FlipValue() {
        }

        public static FlipValue n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "start_", "target_"});
            }
            if (iOrdinal == 3) {
                return new FlipValue();
            }
            if (iOrdinal == 4) {
                return new y0(DEFAULT_INSTANCE);
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
            synchronized (FlipValue.class) {
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

        public final Paragraph o() {
            Paragraph paragraph = this.start_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.target_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class TrackReveal extends com.google.protobuf.h implements v2j0 {
        public static final int DATE_LINE_FIELD_NUMBER = 1;
        private static final TrackReveal DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int REVEAL_TITLE_FIELD_NUMBER = 2;
        public static final int TRACK_AND_ARTIST_FIELD_NUMBER = 3;
        private int bitField0_;
        private Paragraph dateLine_;
        private Paragraph revealTitle_;
        private Paragraph trackAndArtist_;

        static {
            TrackReveal trackReveal = new TrackReveal();
            DEFAULT_INSTANCE = trackReveal;
            com.google.protobuf.h.registerDefaultInstance(TrackReveal.class, trackReveal);
        }

        private TrackReveal() {
        }

        public static TrackReveal o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "dateLine_", "revealTitle_", "trackAndArtist_"});
            }
            if (iOrdinal == 3) {
                return new TrackReveal();
            }
            if (iOrdinal == 4) {
                return new z0(DEFAULT_INSTANCE);
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
            synchronized (TrackReveal.class) {
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

        public final Paragraph n() {
            Paragraph paragraph = this.dateLine_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Paragraph p() {
            Paragraph paragraph = this.revealTitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.trackAndArtist_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$IntroTrackContent$Card1 sceneTemplate$IntroTrackContent$Card1 = new SceneTemplate$IntroTrackContent$Card1();
        DEFAULT_INSTANCE = sceneTemplate$IntroTrackContent$Card1;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$IntroTrackContent$Card1.class, sceneTemplate$IntroTrackContent$Card1);
    }

    private SceneTemplate$IntroTrackContent$Card1() {
    }

    public static SceneTemplate$IntroTrackContent$Card1 p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "flipCalendar_", "trackReveal_", "albumArt_", "riveBackgroundAnimation_", "canvas_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$IntroTrackContent$Card1();
        }
        if (iOrdinal == 4) {
            return new v0(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$IntroTrackContent$Card1.class) {
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

    public final Image n() {
        Image image = this.albumArt_;
        return image == null ? Image.o() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Canvas o() {
        Canvas canvas = this.canvas_;
        return canvas == null ? Canvas.n() : canvas;
    }

    public final FlipCalendar q() {
        FlipCalendar flipCalendar = this.flipCalendar_;
        return flipCalendar == null ? FlipCalendar.o() : flipCalendar;
    }

    public final RiveAnimation r() {
        RiveAnimation riveAnimation = this.riveBackgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final TrackReveal s() {
        TrackReveal trackReveal = this.trackReveal_;
        return trackReveal == null ? TrackReveal.o() : trackReveal;
    }

    public final boolean t() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
