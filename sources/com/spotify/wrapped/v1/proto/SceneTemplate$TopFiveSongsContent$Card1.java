package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopFiveSongsContent$Card1 extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 4;
    public static final int BUTTON_CONFIGURATION_FIELD_NUMBER = 3;
    private static final SceneTemplate$TopFiveSongsContent$Card1 DEFAULT_INSTANCE;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LIST_ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private RiveAnimation background_;
    private int bitField0_;
    private ButtonConfiguration buttonConfiguration_;
    private boolean hasHapticFeedback_;
    private Paragraph header_;
    private h290 listItems_ = com.google.protobuf.h.emptyProtobufList();

    public static final class SongItem extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_ACTION_FIELD_NUMBER = 6;
        public static final int AUDIO_PREVIEW_FIELD_NUMBER = 5;
        private static final SongItem DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        private String accessibilityAction_ = "";
        private AudioPreview audioPreview_;
        private int bitField0_;
        private Image image_;
        private Paragraph position_;
        private Paragraph subtitle_;
        private Paragraph title_;

        static {
            SongItem songItem = new SongItem();
            DEFAULT_INSTANCE = songItem;
            com.google.protobuf.h.registerDefaultInstance(SongItem.class, songItem);
        }

        private SongItem() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ȉ", new Object[]{"bitField0_", "position_", "image_", "title_", "subtitle_", "audioPreview_", "accessibilityAction_"});
            }
            if (iOrdinal == 3) {
                return new SongItem();
            }
            if (iOrdinal == 4) {
                return new c2(DEFAULT_INSTANCE);
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
            synchronized (SongItem.class) {
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
            return this.accessibilityAction_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final AudioPreview o() {
            AudioPreview audioPreview = this.audioPreview_;
            return audioPreview == null ? AudioPreview.p() : audioPreview;
        }

        public final Image p() {
            Image image = this.image_;
            return image == null ? Image.o() : image;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.position_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph r() {
            Paragraph paragraph = this.subtitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph s() {
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean t() {
            return (this.bitField0_ & 16) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final boolean u() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    static {
        SceneTemplate$TopFiveSongsContent$Card1 sceneTemplate$TopFiveSongsContent$Card1 = new SceneTemplate$TopFiveSongsContent$Card1();
        DEFAULT_INSTANCE = sceneTemplate$TopFiveSongsContent$Card1;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopFiveSongsContent$Card1.class, sceneTemplate$TopFiveSongsContent$Card1);
    }

    private SceneTemplate$TopFiveSongsContent$Card1() {
    }

    public static SceneTemplate$TopFiveSongsContent$Card1 o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0007", new Object[]{"bitField0_", "header_", "listItems_", SongItem.class, "buttonConfiguration_", "background_", "hasHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopFiveSongsContent$Card1();
        }
        if (iOrdinal == 4) {
            return new b2(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TopFiveSongsContent$Card1.class) {
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

    public final RiveAnimation n() {
        RiveAnimation riveAnimation = this.background_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.hasHapticFeedback_;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final h290 r() {
        return this.listItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
