package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopFivePodcastsContent$Card1 extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 4;
    public static final int BUTTON_CONFIGURATION_FIELD_NUMBER = 3;
    private static final SceneTemplate$TopFivePodcastsContent$Card1 DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LIST_ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private RiveAnimation background_;
    private int bitField0_;
    private ButtonConfiguration buttonConfiguration_;
    private Paragraph header_;
    private h290 listItems_ = com.google.protobuf.h.emptyProtobufList();

    public static final class PodcastItem extends com.google.protobuf.h implements v2j0 {
        private static final PodcastItem DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int TITLE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Image image_;
        private Paragraph position_;
        private Paragraph title_;

        static {
            PodcastItem podcastItem = new PodcastItem();
            DEFAULT_INSTANCE = podcastItem;
            com.google.protobuf.h.registerDefaultInstance(PodcastItem.class, podcastItem);
        }

        private PodcastItem() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "position_", "image_", "title_"});
            }
            if (iOrdinal == 3) {
                return new PodcastItem();
            }
            if (iOrdinal == 4) {
                return new a2(DEFAULT_INSTANCE);
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
            synchronized (PodcastItem.class) {
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
            Image image = this.image_;
            return image == null ? Image.o() : image;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Paragraph o() {
            Paragraph paragraph = this.position_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$TopFivePodcastsContent$Card1 sceneTemplate$TopFivePodcastsContent$Card1 = new SceneTemplate$TopFivePodcastsContent$Card1();
        DEFAULT_INSTANCE = sceneTemplate$TopFivePodcastsContent$Card1;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopFivePodcastsContent$Card1.class, sceneTemplate$TopFivePodcastsContent$Card1);
    }

    private SceneTemplate$TopFivePodcastsContent$Card1() {
    }

    public static SceneTemplate$TopFivePodcastsContent$Card1 o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "header_", "listItems_", PodcastItem.class, "buttonConfiguration_", "background_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopFivePodcastsContent$Card1();
        }
        if (iOrdinal == 4) {
            return new z1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TopFivePodcastsContent$Card1.class) {
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

    public final Paragraph p() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final h290 q() {
        return this.listItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
