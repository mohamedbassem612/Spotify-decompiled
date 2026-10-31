package com.spotify.extendedmetadata.extensions.playlinkcardtrait.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PlayLinkCardTrait extends h implements v2j0 {
    public static final int ANIMATION_FIELD_NUMBER = 13;
    private static final PlayLinkCardTrait DEFAULT_INSTANCE;
    public static final int DISMISS_URI_FIELD_NUMBER = 15;
    public static final int GRADIENT_FIELD_NUMBER = 16;
    public static final int IMAGE_FIELD_NUMBER = 12;
    public static final int LINK_FIELD_NUMBER = 10;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 7;
    public static final int NAVIGATION_URL_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_FIELD_NUMBER = 9;
    public static final int PRETITLE_COLOR_FIELD_NUMBER = 4;
    public static final int PRETITLE_FIELD_NUMBER = 3;
    public static final int SUBTITLE_COLOR_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_COLOR_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Object background_;
    private int bitField0_;
    private Object ctaType_;
    private Gradient gradient_;
    private int ctaTypeCase_ = 0;
    private int backgroundCase_ = 0;
    private String title_ = "";
    private String titleColor_ = "";
    private String pretitle_ = "";
    private String pretitleColor_ = "";
    private String subtitle_ = "";
    private String subtitleColor_ = "";
    private String logoImageUrl_ = "";
    private String navigationUrl_ = "";
    private String dismissUri_ = "";

    public static final class AnimationBackground extends h implements v2j0 {
        private static final AnimationBackground DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            AnimationBackground animationBackground = new AnimationBackground();
            DEFAULT_INSTANCE = animationBackground;
            h.registerDefaultInstance(AnimationBackground.class, animationBackground);
        }

        private AnimationBackground() {
        }

        public static AnimationBackground n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            }
            if (iOrdinal == 3) {
                return new AnimationBackground();
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
            synchronized (AnimationBackground.class) {
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

        public final String getUrl() {
            return this.url_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Gradient extends h implements v2j0 {
        private static final Gradient DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int STOPS_FIELD_NUMBER = 1;
        private h290 stops_ = h.emptyProtobufList();

        public static final class Stop extends h implements v2j0 {
            public static final int COLOR_FIELD_NUMBER = 1;
            private static final Stop DEFAULT_INSTANCE;
            public static final int LOCATION_FIELD_NUMBER = 2;
            private static volatile qzr0 PARSER;
            private String color_ = "";
            private float location_;

            static {
                Stop stop = new Stop();
                DEFAULT_INSTANCE = stop;
                h.registerDefaultInstance(Stop.class, stop);
            }

            private Stop() {
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
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0001", new Object[]{"color_", "location_"});
                }
                if (iOrdinal == 3) {
                    return new Stop();
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
                synchronized (Stop.class) {
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
                return this.color_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final float o() {
                return this.location_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Gradient gradient = new Gradient();
            DEFAULT_INSTANCE = gradient;
            h.registerDefaultInstance(Gradient.class, gradient);
        }

        private Gradient() {
        }

        public static Gradient n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stops_", Stop.class});
            }
            if (iOrdinal == 3) {
                return new Gradient();
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
            synchronized (Gradient.class) {
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

        public final h290 o() {
            return this.stops_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ImageBackground extends h implements v2j0 {
        private static final ImageBackground DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            ImageBackground imageBackground = new ImageBackground();
            DEFAULT_INSTANCE = imageBackground;
            h.registerDefaultInstance(ImageBackground.class, imageBackground);
        }

        private ImageBackground() {
        }

        public static ImageBackground n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            }
            if (iOrdinal == 3) {
                return new ImageBackground();
            }
            if (iOrdinal == 4) {
                return new e(DEFAULT_INSTANCE);
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
            synchronized (ImageBackground.class) {
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

        public final String getUrl() {
            return this.url_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class LinkCta extends h implements v2j0 {
        public static final int CTA_BACKGROUND_COLOR_FIELD_NUMBER = 3;
        public static final int CTA_TEXT_COLOR_FIELD_NUMBER = 2;
        private static final LinkCta DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String ctaTextColor_ = "";
        private String ctaBackgroundColor_ = "";

        static {
            LinkCta linkCta = new LinkCta();
            DEFAULT_INSTANCE = linkCta;
            h.registerDefaultInstance(LinkCta.class, linkCta);
        }

        private LinkCta() {
        }

        public static LinkCta p() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "ctaTextColor_", "ctaBackgroundColor_"});
            }
            if (iOrdinal == 3) {
                return new LinkCta();
            }
            if (iOrdinal == 4) {
                return new f(DEFAULT_INSTANCE);
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
            synchronized (LinkCta.class) {
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
            return this.ctaBackgroundColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.ctaTextColor_;
        }

        public final String q() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PlayCta extends h implements v2j0 {
        private static final PlayCta DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URI_FIELD_NUMBER = 1;
        private String uri_ = "";

        static {
            PlayCta playCta = new PlayCta();
            DEFAULT_INSTANCE = playCta;
            h.registerDefaultInstance(PlayCta.class, playCta);
        }

        private PlayCta() {
        }

        public static PlayCta n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"uri_"});
            }
            if (iOrdinal == 3) {
                return new PlayCta();
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
            synchronized (PlayCta.class) {
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

        public final String getUri() {
            return this.uri_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PlayLinkCardTrait playLinkCardTrait = new PlayLinkCardTrait();
        DEFAULT_INSTANCE = playLinkCardTrait;
        h.registerDefaultInstance(PlayLinkCardTrait.class, playLinkCardTrait);
    }

    private PlayLinkCardTrait() {
    }

    public static PlayLinkCardTrait C(byte[] bArr) {
        return (PlayLinkCardTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final String A() {
        return this.titleColor_;
    }

    public final boolean B() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0002\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t<\u0000\n<\u0000\f<\u0001\r<\u0001\u000fȈ\u0010ဉ\u0000", new Object[]{"ctaType_", "ctaTypeCase_", "background_", "backgroundCase_", "bitField0_", "title_", "titleColor_", "pretitle_", "pretitleColor_", "subtitle_", "subtitleColor_", "logoImageUrl_", "navigationUrl_", PlayCta.class, LinkCta.class, ImageBackground.class, AnimationBackground.class, "dismissUri_", "gradient_"});
        }
        if (iOrdinal == 3) {
            return new PlayLinkCardTrait();
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
        synchronized (PlayLinkCardTrait.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final AnimationBackground n() {
        return this.backgroundCase_ == 13 ? (AnimationBackground) this.background_ : AnimationBackground.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.backgroundCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 12) {
            return i != 13 ? 0 : 2;
        }
        return 1;
    }

    public final int p() {
        int i = this.ctaTypeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 9) {
            return i != 10 ? 0 : 2;
        }
        return 1;
    }

    public final String q() {
        return this.dismissUri_;
    }

    public final Gradient r() {
        Gradient gradient = this.gradient_;
        return gradient == null ? Gradient.n() : gradient;
    }

    public final ImageBackground s() {
        return this.backgroundCase_ == 12 ? (ImageBackground) this.background_ : ImageBackground.n();
    }

    public final LinkCta t() {
        return this.ctaTypeCase_ == 10 ? (LinkCta) this.ctaType_ : LinkCta.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.logoImageUrl_;
    }

    public final String v() {
        return this.navigationUrl_;
    }

    public final PlayCta w() {
        return this.ctaTypeCase_ == 9 ? (PlayCta) this.ctaType_ : PlayCta.n();
    }

    public final String x() {
        return this.pretitle_;
    }

    public final String y() {
        return this.pretitleColor_;
    }

    public final String z() {
        return this.subtitleColor_;
    }
}
