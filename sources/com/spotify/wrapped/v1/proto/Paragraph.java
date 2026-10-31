package com.spotify.wrapped.v1.proto;

import java.util.ArrayList;
import p.aor0;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.snr0;
import p.v2j0;
import p.wnr0;
import p.xnr0;
import p.znr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Paragraph extends com.google.protobuf.h implements v2j0 {
    public static final int BOX_FIELD_NUMBER = 4;
    private static final Paragraph DEFAULT_INSTANCE;
    public static final int DIRECTION_POLICY_FIELD_NUMBER = 8;
    public static final int HERO_FIELD_NUMBER = 5;
    public static final int MULTI_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SINGLE_FIELD_NUMBER = 6;
    public static final int STYLE_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TEXT_VALUES_FIELD_NUMBER = 2;
    private int bitField0_;
    private Box box_;
    private int directionPolicy_;
    private Style style_;
    private TextStyle text_;
    private Object type_;
    private int typeCase_ = 0;
    private h290 textValues_ = com.google.protobuf.h.emptyProtobufList();

    public static final class AutoSize extends com.google.protobuf.h implements v2j0 {
        public static final int AUTO_SIZE_STEP_FIELD_NUMBER = 3;
        private static final AutoSize DEFAULT_INSTANCE;
        public static final int MAX_FONT_SIZE_FIELD_NUMBER = 2;
        public static final int MIN_FONT_SIZE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int autoSizeStep_;
        private float maxFontSize_;
        private float minFontSize_;

        static {
            AutoSize autoSize = new AutoSize();
            DEFAULT_INSTANCE = autoSize;
            com.google.protobuf.h.registerDefaultInstance(AutoSize.class, autoSize);
        }

        private AutoSize() {
        }

        public static AutoSize o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0004", new Object[]{"minFontSize_", "maxFontSize_", "autoSizeStep_"});
            }
            if (iOrdinal == 3) {
                return new AutoSize();
            }
            if (iOrdinal == 4) {
                return new t(DEFAULT_INSTANCE);
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
            synchronized (AutoSize.class) {
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
            return this.autoSizeStep_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final float p() {
            return this.maxFontSize_;
        }

        public final float q() {
            return this.minFontSize_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Box extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
        private static final Box DEFAULT_INSTANCE;
        public static final int OUTLINE_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int START_END_PADDING_FIELD_NUMBER = 3;
        public static final int TOP_BOTTOM_PADDING_FIELD_NUMBER = 2;
        private String backgroundColor_ = "";
        private int bitField0_;
        private Outline outline_;
        private int startEndPadding_;
        private int topBottomPadding_;

        static {
            Box box = new Box();
            DEFAULT_INSTANCE = box;
            com.google.protobuf.h.registerDefaultInstance(Box.class, box);
        }

        private Box() {
        }

        public static Box o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004ဉ\u0000", new Object[]{"bitField0_", "backgroundColor_", "topBottomPadding_", "startEndPadding_", "outline_"});
            }
            if (iOrdinal == 3) {
                return new Box();
            }
            if (iOrdinal == 4) {
                return new u(DEFAULT_INSTANCE);
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
            synchronized (Box.class) {
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

        public final Outline p() {
            Outline outline = this.outline_;
            return outline == null ? Outline.o() : outline;
        }

        public final int q() {
            return this.startEndPadding_;
        }

        public final int r() {
            return this.topBottomPadding_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class FontVariation extends com.google.protobuf.h implements v2j0 {
        private static final FontVariation DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int WEIGHT_FIELD_NUMBER = 4;
        public static final int WIDTH_FIELD_NUMBER = 5;
        private int bitField0_;
        private int weight_;
        private int width_;

        static {
            FontVariation fontVariation = new FontVariation();
            DEFAULT_INSTANCE = fontVariation;
            com.google.protobuf.h.registerDefaultInstance(FontVariation.class, fontVariation);
        }

        private FontVariation() {
        }

        public static FontVariation n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004င\u0000\u0005င\u0001", new Object[]{"bitField0_", "weight_", "width_"});
            }
            if (iOrdinal == 3) {
                return new FontVariation();
            }
            if (iOrdinal == 4) {
                return new w(DEFAULT_INSTANCE);
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
            synchronized (FontVariation.class) {
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

        public final int o() {
            return this.weight_;
        }

        public final int p() {
            return this.width_;
        }

        public final boolean q() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class GlowBox extends com.google.protobuf.h implements v2j0 {
        public static final int CORNER_RADIUS_FIELD_NUMBER = 3;
        private static final GlowBox DEFAULT_INSTANCE;
        public static final int FILL_COLOR_FIELD_NUMBER = 1;
        public static final int INNER_FADE_FIELD_NUMBER = 4;
        public static final int NOISE_TEXTURE_URL_FIELD_NUMBER = 2;
        public static final int OUTER_FADE_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER;
        private int cornerRadius_;
        private int innerFade_;
        private int outerFade_;
        private String fillColor_ = "";
        private String noiseTextureUrl_ = "";

        static {
            GlowBox glowBox = new GlowBox();
            DEFAULT_INSTANCE = glowBox;
            com.google.protobuf.h.registerDefaultInstance(GlowBox.class, glowBox);
        }

        private GlowBox() {
        }

        public static GlowBox o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"fillColor_", "noiseTextureUrl_", "cornerRadius_", "innerFade_", "outerFade_"});
            }
            if (iOrdinal == 3) {
                return new GlowBox();
            }
            if (iOrdinal == 4) {
                return new x(DEFAULT_INSTANCE);
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
            synchronized (GlowBox.class) {
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
            return this.cornerRadius_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.fillColor_;
        }

        public final int q() {
            return this.innerFade_;
        }

        public final String r() {
            return this.noiseTextureUrl_;
        }

        public final int s() {
            return this.outerFade_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Hero extends com.google.protobuf.h implements v2j0 {
        public static final int AUTO_SIZE_FIELD_NUMBER = 2;
        public static final int BOX_FIELD_NUMBER = 6;
        private static final Hero DEFAULT_INSTANCE;
        public static final int GLOW_BOX_FIELD_NUMBER = 7;
        public static final int MAX_LINES_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TEXT_KERNING_FIELD_NUMBER = 4;
        public static final int TEXT_OUTLINE_FIELD_NUMBER = 3;
        private AutoSize autoSize_;
        private int backgroundBoxCase_ = 0;
        private Object backgroundBox_;
        private int bitField0_;
        private int maxLines_;
        private float textKerning_;
        private Outline textOutline_;
        private TextStyle text_;

        static {
            Hero hero = new Hero();
            DEFAULT_INSTANCE = hero;
            com.google.protobuf.h.registerDefaultInstance(Hero.class, hero);
        }

        private Hero() {
        }

        public static Hero p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u0005\u0004\u0006<\u0000\u0007<\u0000", new Object[]{"backgroundBox_", "backgroundBoxCase_", "bitField0_", "text_", "autoSize_", "textOutline_", "textKerning_", "maxLines_", Box.class, GlowBox.class});
            }
            if (iOrdinal == 3) {
                return new Hero();
            }
            if (iOrdinal == 4) {
                return new y(DEFAULT_INSTANCE);
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
            synchronized (Hero.class) {
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

        public final AutoSize n() {
            AutoSize autoSize = this.autoSize_;
            return autoSize == null ? AutoSize.o() : autoSize;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Box o() {
            return this.backgroundBoxCase_ == 6 ? (Box) this.backgroundBox_ : Box.o();
        }

        public final GlowBox q() {
            return this.backgroundBoxCase_ == 7 ? (GlowBox) this.backgroundBox_ : GlowBox.o();
        }

        public final int r() {
            return this.maxLines_;
        }

        public final TextStyle s() {
            TextStyle textStyle = this.text_;
            return textStyle == null ? TextStyle.n() : textStyle;
        }

        public final float t() {
            return this.textKerning_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Outline u() {
            Outline outline = this.textOutline_;
            return outline == null ? Outline.o() : outline;
        }

        public final boolean v() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean w() {
            return this.backgroundBoxCase_ == 6;
        }

        public final boolean x() {
            return this.backgroundBoxCase_ == 7;
        }

        public final void y(TextStyle textStyle) {
            this.text_ = textStyle;
            this.bitField0_ |= 1;
        }
    }

    public static final class Multi extends com.google.protobuf.h implements v2j0 {
        public static final int ALIGNMENT_FIELD_NUMBER = 4;
        public static final int BOX_FIELD_NUMBER = 5;
        private static final Multi DEFAULT_INSTANCE;
        public static final int GLOW_BOX_FIELD_NUMBER = 6;
        public static final int MAX_LINES_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TEXT_VALUES_FIELD_NUMBER = 2;
        private int alignment_;
        private Object backgroundBox_;
        private int bitField0_;
        private int maxLines_;
        private TextStyle text_;
        private int backgroundBoxCase_ = 0;
        private h290 textValues_ = com.google.protobuf.h.emptyProtobufList();

        static {
            Multi multi = new Multi();
            DEFAULT_INSTANCE = multi;
            com.google.protobuf.h.registerDefaultInstance(Multi.class, multi);
        }

        private Multi() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static Multi q() {
            return DEFAULT_INSTANCE;
        }

        public static z x() {
            return (z) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0004\u0004ဌ\u0001\u0005<\u0000\u0006<\u0000", new Object[]{"backgroundBox_", "backgroundBoxCase_", "bitField0_", "text_", "textValues_", TextStyle.class, "maxLines_", "alignment_", Box.class, GlowBox.class});
            }
            if (iOrdinal == 3) {
                return new Multi();
            }
            if (iOrdinal == 4) {
                return new z(DEFAULT_INSTANCE);
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
            synchronized (Multi.class) {
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

        public final void n(ArrayList arrayList) {
            h290 h290VarMutableCopy = this.textValues_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.textValues_ = h290VarMutableCopy;
            }
            s8.addAll(arrayList, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final snr0 o() {
            snr0 snr0VarA = snr0.a(this.alignment_);
            return snr0VarA == null ? snr0.UNRECOGNIZED : snr0VarA;
        }

        public final Box p() {
            return this.backgroundBoxCase_ == 5 ? (Box) this.backgroundBox_ : Box.o();
        }

        public final GlowBox r() {
            return this.backgroundBoxCase_ == 6 ? (GlowBox) this.backgroundBox_ : GlowBox.o();
        }

        public final int s() {
            return this.maxLines_;
        }

        public final TextStyle t() {
            TextStyle textStyle = this.text_;
            return textStyle == null ? TextStyle.n() : textStyle;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final h290 u() {
            return this.textValues_;
        }

        public final boolean v() {
            return this.backgroundBoxCase_ == 5;
        }

        public final boolean w() {
            return this.backgroundBoxCase_ == 6;
        }

        public final void y(TextStyle textStyle) {
            textStyle.getClass();
            this.text_ = textStyle;
            this.bitField0_ |= 1;
        }
    }

    public static final class Single extends com.google.protobuf.h implements v2j0 {
        public static final int ALIGNMENT_FIELD_NUMBER = 5;
        public static final int BOX_FIELD_NUMBER = 6;
        private static final Single DEFAULT_INSTANCE;
        public static final int GLOW_BOX_FIELD_NUMBER = 7;
        public static final int MAX_LINES_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TEXT_KERNING_FIELD_NUMBER = 3;
        public static final int TEXT_OUTLINE_FIELD_NUMBER = 2;
        private int alignment_;
        private int backgroundBoxCase_ = 0;
        private Object backgroundBox_;
        private int bitField0_;
        private int maxLines_;
        private float textKerning_;
        private Outline textOutline_;
        private TextStyle text_;

        static {
            Single single = new Single();
            DEFAULT_INSTANCE = single;
            com.google.protobuf.h.registerDefaultInstance(Single.class, single);
        }

        private Single() {
        }

        public static Single p() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static a0 x() {
            return (a0) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002\u0004\u0004\u0005ဌ\u0003\u0006<\u0000\u0007<\u0000", new Object[]{"backgroundBox_", "backgroundBoxCase_", "bitField0_", "text_", "textOutline_", "textKerning_", "maxLines_", "alignment_", Box.class, GlowBox.class});
            }
            if (iOrdinal == 3) {
                return new Single();
            }
            if (iOrdinal == 4) {
                return new a0(DEFAULT_INSTANCE);
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
            synchronized (Single.class) {
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

        public final snr0 n() {
            snr0 snr0VarA = snr0.a(this.alignment_);
            return snr0VarA == null ? snr0.UNRECOGNIZED : snr0VarA;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Box o() {
            return this.backgroundBoxCase_ == 6 ? (Box) this.backgroundBox_ : Box.o();
        }

        public final GlowBox q() {
            return this.backgroundBoxCase_ == 7 ? (GlowBox) this.backgroundBox_ : GlowBox.o();
        }

        public final int r() {
            return this.maxLines_;
        }

        public final TextStyle s() {
            TextStyle textStyle = this.text_;
            return textStyle == null ? TextStyle.n() : textStyle;
        }

        public final float t() {
            return this.textKerning_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Outline u() {
            Outline outline = this.textOutline_;
            return outline == null ? Outline.o() : outline;
        }

        public final boolean v() {
            return this.backgroundBoxCase_ == 6;
        }

        public final boolean w() {
            return this.backgroundBoxCase_ == 7;
        }

        public final void y(TextStyle textStyle) {
            textStyle.getClass();
            this.text_ = textStyle;
            this.bitField0_ |= 1;
        }
    }

    @Deprecated
    public static final class Style extends com.google.protobuf.h implements v2j0 {
        private static final Style DEFAULT_INSTANCE;
        public static final int MAX_LINES_FIELD_NUMBER = 3;
        public static final int MULTI_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int SINGLE_FIELD_NUMBER = 1;
        private int maxLines_;
        private int typeCase_ = 0;
        private Object type_;

        public static final class Multi extends com.google.protobuf.h implements v2j0 {
            private static final Multi DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int TEXT_VALUES_FIELD_NUMBER = 2;
            private h290 textValues_ = com.google.protobuf.h.emptyProtobufList();

            static {
                Multi multi = new Multi();
                DEFAULT_INSTANCE = multi;
                com.google.protobuf.h.registerDefaultInstance(Multi.class, multi);
            }

            private Multi() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"textValues_", TextStyle.class});
                }
                if (iOrdinal == 3) {
                    return new Multi();
                }
                if (iOrdinal == 4) {
                    return new c0(DEFAULT_INSTANCE);
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
                synchronized (Multi.class) {
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

        public static final class Single extends com.google.protobuf.h implements v2j0 {
            public static final int AUTO_SIZE_FIELD_NUMBER = 1;
            private static final Single DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int TEXT_KERNING_FIELD_NUMBER = 3;
            public static final int TEXT_OUTLINE_FIELD_NUMBER = 2;
            private AutoSize autoSize_;
            private int bitField0_;
            private float textKerning_;
            private Outline textOutline_;

            static {
                Single single = new Single();
                DEFAULT_INSTANCE = single;
                com.google.protobuf.h.registerDefaultInstance(Single.class, single);
            }

            private Single() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"bitField0_", "autoSize_", "textOutline_", "textKerning_"});
                }
                if (iOrdinal == 3) {
                    return new Single();
                }
                if (iOrdinal == 4) {
                    return new d0(DEFAULT_INSTANCE);
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
                synchronized (Single.class) {
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
            Style style = new Style();
            DEFAULT_INSTANCE = style;
            com.google.protobuf.h.registerDefaultInstance(Style.class, style);
        }

        private Style() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u0004", new Object[]{"type_", "typeCase_", Single.class, Multi.class, "maxLines_"});
            }
            if (iOrdinal == 3) {
                return new Style();
            }
            if (iOrdinal == 4) {
                return new b0(DEFAULT_INSTANCE);
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
            synchronized (Style.class) {
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

    public static final class TextStyle extends com.google.protobuf.h implements v2j0 {
        private static final TextStyle DEFAULT_INSTANCE;
        public static final int FONT_SIZE_FIELD_NUMBER = 6;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        public static final int FONT_VARIATION_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int SHARE_CARD_FONT_STYLE_FIELD_NUMBER = 10;
        public static final int STORY_CARD_FONT_STYLE_FIELD_NUMBER = 9;
        public static final int TEXT_BACKGROUND_COLOR_FIELD_NUMBER = 4;
        public static final int TEXT_COLOR_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int fontSize_;
        private Object fontStyleType_;
        private int fontStyle_;
        private FontVariation fontVariation_;
        private int fontStyleTypeCase_ = 0;
        private String text_ = "";
        private String textColor_ = "";
        private String textBackgroundColor_ = "";

        static {
            TextStyle textStyle = new TextStyle();
            DEFAULT_INSTANCE = textStyle;
            com.google.protobuf.h.registerDefaultInstance(TextStyle.class, textStyle);
        }

        private TextStyle() {
        }

        public static TextStyle n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static e0 y() {
            return (e0) DEFAULT_INSTANCE.createBuilder();
        }

        public final void A(String str) {
            str.getClass();
            this.text_ = str;
        }

        public final void B(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\n\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005ဉ\u0000\u0006\u0004\t?\u0000\n?\u0000", new Object[]{"fontStyleType_", "fontStyleTypeCase_", "bitField0_", "text_", "textColor_", "fontStyle_", "textBackgroundColor_", "fontVariation_", "fontSize_"});
            }
            if (iOrdinal == 3) {
                return new TextStyle();
            }
            if (iOrdinal == 4) {
                return new e0(DEFAULT_INSTANCE);
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
            synchronized (TextStyle.class) {
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

        public final int o() {
            return this.fontSize_;
        }

        public final xnr0 p() {
            xnr0 xnr0Var;
            switch (this.fontStyle_) {
                case 0:
                    xnr0Var = xnr0.headline_large;
                    break;
                case 1:
                    xnr0Var = xnr0.headline_medium;
                    break;
                case 2:
                case 8:
                case 9:
                case 12:
                case 15:
                case 16:
                default:
                    xnr0Var = null;
                    break;
                case 3:
                    xnr0Var = xnr0.title_large;
                    break;
                case 4:
                    xnr0Var = xnr0.title_medium;
                    break;
                case 5:
                    xnr0Var = xnr0.title_small;
                    break;
                case 6:
                    xnr0Var = xnr0.body_medium;
                    break;
                case 7:
                    xnr0Var = xnr0.body_medium_bold;
                    break;
                case 10:
                    xnr0Var = xnr0.body_small;
                    break;
                case 11:
                    xnr0Var = xnr0.body_small_bold;
                    break;
                case 13:
                    xnr0Var = xnr0.marginal;
                    break;
                case 14:
                    xnr0Var = xnr0.marginal_bold;
                    break;
                case 17:
                    xnr0Var = xnr0.title_xsmall;
                    break;
                case 18:
                    xnr0Var = xnr0.body_monospace;
                    break;
                case 19:
                    xnr0Var = xnr0.body_small_monospace;
                    break;
            }
            return xnr0Var == null ? xnr0.UNRECOGNIZED : xnr0Var;
        }

        public final int q() {
            int i = this.fontStyleTypeCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 9) {
                return i != 10 ? 0 : 2;
            }
            return 1;
        }

        public final FontVariation r() {
            FontVariation fontVariation = this.fontVariation_;
            return fontVariation == null ? FontVariation.n() : fontVariation;
        }

        public final znr0 s() {
            int i = this.fontStyleTypeCase_;
            znr0 znr0Var = znr0.share_card_unspecified;
            if (i == 10) {
                switch (((Integer) this.fontStyleType_).intValue()) {
                    case 0:
                        break;
                    case 1:
                        znr0Var = znr0.share_headline_large;
                        break;
                    case 2:
                        znr0Var = znr0.share_headline_medium;
                        break;
                    case 3:
                        znr0Var = znr0.share_headline_small;
                        break;
                    case 4:
                        znr0Var = znr0.share_headline_tiny_bold;
                        break;
                    case 5:
                        znr0Var = znr0.share_headline_tiny;
                        break;
                    case 6:
                        znr0Var = znr0.share_body_title_bold;
                        break;
                    case 7:
                        znr0Var = znr0.share_body_title;
                        break;
                    case 8:
                        znr0Var = znr0.share_body_deco;
                        break;
                    case 9:
                        znr0Var = znr0.share_body_bold;
                        break;
                    case 10:
                        znr0Var = znr0.share_body;
                        break;
                    case 11:
                        znr0Var = znr0.numerals;
                        break;
                    default:
                        znr0Var = null;
                        break;
                }
                if (znr0Var == null) {
                    return znr0.UNRECOGNIZED;
                }
            }
            return znr0Var;
        }

        public final aor0 t() {
            int i = this.fontStyleTypeCase_;
            aor0 aor0Var = aor0.story_card_unspecified;
            if (i == 9) {
                switch (((Integer) this.fontStyleType_).intValue()) {
                    case 0:
                        break;
                    case 1:
                        aor0Var = aor0.headline_large;
                        break;
                    case 2:
                        aor0Var = aor0.headline_medium;
                        break;
                    case 3:
                        aor0Var = aor0.title_large;
                        break;
                    case 4:
                        aor0Var = aor0.title_medium;
                        break;
                    case 5:
                        aor0Var = aor0.title_small;
                        break;
                    case 6:
                        aor0Var = aor0.title_xsmall;
                        break;
                    case 7:
                        aor0Var = aor0.body_medium;
                        break;
                    case 8:
                        aor0Var = aor0.body_medium_bold;
                        break;
                    case 9:
                        aor0Var = aor0.body_small;
                        break;
                    case 10:
                        aor0Var = aor0.body_small_bold;
                        break;
                    case 11:
                        aor0Var = aor0.marginal;
                        break;
                    case 12:
                        aor0Var = aor0.marginal_bold;
                        break;
                    case 13:
                        aor0Var = aor0.body_monospace;
                        break;
                    case 14:
                        aor0Var = aor0.body_small_monospace;
                        break;
                    default:
                        aor0Var = null;
                        break;
                }
                if (aor0Var == null) {
                    return aor0.UNRECOGNIZED;
                }
            }
            return aor0Var;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final String u() {
            return this.text_;
        }

        public final String v() {
            return this.textBackgroundColor_;
        }

        public final String w() {
            return this.textColor_;
        }

        public final boolean x() {
            return this.fontStyleTypeCase_ == 9;
        }

        public final void z(xnr0 xnr0Var) {
            this.fontStyle_ = xnr0Var.getNumber();
        }
    }

    static {
        Paragraph paragraph = new Paragraph();
        DEFAULT_INSTANCE = paragraph;
        com.google.protobuf.h.registerDefaultInstance(Paragraph.class, paragraph);
    }

    private Paragraph() {
    }

    public static Paragraph n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static v v() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static Paragraph w(byte[] bArr) {
        return (Paragraph) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\f", new Object[]{"type_", "typeCase_", "bitField0_", "text_", "textValues_", TextStyle.class, "style_", "box_", Hero.class, Single.class, Multi.class, "directionPolicy_"});
        }
        if (iOrdinal == 3) {
            return new Paragraph();
        }
        if (iOrdinal == 4) {
            return new v(DEFAULT_INSTANCE);
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
        synchronized (Paragraph.class) {
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

    public final wnr0 o() {
        wnr0 wnr0Var;
        int i = this.directionPolicy_;
        if (i != 0) {
            wnr0Var = i != 1 ? null : wnr0.first_strong_character;
        } else {
            wnr0Var = wnr0.direction_policy_unspecified;
        }
        return wnr0Var == null ? wnr0.UNRECOGNIZED : wnr0Var;
    }

    public final Hero p() {
        return this.typeCase_ == 5 ? (Hero) this.type_ : Hero.p();
    }

    public final Multi q() {
        return this.typeCase_ == 7 ? (Multi) this.type_ : Multi.q();
    }

    public final Single r() {
        return this.typeCase_ == 6 ? (Single) this.type_ : Single.p();
    }

    public final TextStyle s() {
        TextStyle textStyle = this.text_;
        return textStyle == null ? TextStyle.n() : textStyle;
    }

    public final h290 t() {
        return this.textValues_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        int i = this.typeCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 5) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }

    public final void x(Hero hero) {
        hero.getClass();
        this.type_ = hero;
        this.typeCase_ = 5;
    }

    public final void y(Multi multi) {
        multi.getClass();
        this.type_ = multi;
        this.typeCase_ = 7;
    }

    public final void z(Single single) {
        single.getClass();
        this.type_ = single;
        this.typeCase_ = 6;
    }
}
