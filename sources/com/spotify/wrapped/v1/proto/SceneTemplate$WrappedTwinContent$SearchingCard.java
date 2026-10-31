package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$WrappedTwinContent$SearchingCard extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 6;
    private static final SceneTemplate$WrappedTwinContent$SearchingCard DEFAULT_INSTANCE;
    public static final int FOREGROUND_ANIMATION_FIELD_NUMBER = 8;
    public static final int GRADIENT_LABEL_1_FIELD_NUMBER = 1;
    public static final int GRADIENT_LABEL_2_FIELD_NUMBER = 9;
    public static final int GRID_ATTRIBUTE_1_FIELD_NUMBER = 3;
    public static final int GRID_ATTRIBUTE_2_FIELD_NUMBER = 4;
    public static final int GRID_ATTRIBUTE_3_FIELD_NUMBER = 5;
    public static final int GRID_ATTRIBUTE_4_FIELD_NUMBER = 7;
    public static final int HAS_REVEAL_HAPTIC_FEEDBACK_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_ATTRIBUTE_FIELD_NUMBER = 2;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private RiveAnimation foregroundAnimation_;
    private GradientText gradientLabel1_;
    private GradientText gradientLabel2_;
    private TwinAttribute gridAttribute1_;
    private TwinAttribute gridAttribute2_;
    private TwinAttribute gridAttribute3_;
    private TwinAttribute gridAttribute4_;
    private boolean hasRevealHapticFeedback_;
    private TwinAttribute primaryAttribute_;

    public static final class GradientText extends com.google.protobuf.h implements v2j0 {
        public static final int COLOR_STOPS_FIELD_NUMBER = 2;
        private static final GradientText DEFAULT_INSTANCE;
        public static final int GLOW_BOX_FIELD_NUMBER = 4;
        public static final int LOOP_DURATION_MILLIS_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private Paragraph.GlowBox glowBox_;
        private long loopDurationMillis_;
        private String text_ = "";
        private h290 colorStops_ = com.google.protobuf.h.emptyProtobufList();

        public static final class ColorStop extends com.google.protobuf.h implements v2j0 {
            public static final int COLOR_FIELD_NUMBER = 1;
            private static final ColorStop DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int POSITION_FIELD_NUMBER = 2;
            private String color_ = "";
            private float position_;

            static {
                ColorStop colorStop = new ColorStop();
                DEFAULT_INSTANCE = colorStop;
                com.google.protobuf.h.registerDefaultInstance(ColorStop.class, colorStop);
            }

            private ColorStop() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0001", new Object[]{"color_", "position_"});
                }
                if (iOrdinal == 3) {
                    return new ColorStop();
                }
                if (iOrdinal == 4) {
                    return new j2(DEFAULT_INSTANCE);
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
                synchronized (ColorStop.class) {
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
            GradientText gradientText = new GradientText();
            DEFAULT_INSTANCE = gradientText;
            com.google.protobuf.h.registerDefaultInstance(GradientText.class, gradientText);
        }

        private GradientText() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0002\u0004ဉ\u0000", new Object[]{"bitField0_", "text_", "colorStops_", ColorStop.class, "loopDurationMillis_", "glowBox_"});
            }
            if (iOrdinal == 3) {
                return new GradientText();
            }
            if (iOrdinal == 4) {
                return new i2(DEFAULT_INSTANCE);
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
            synchronized (GradientText.class) {
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

    public static final class TwinAttribute extends com.google.protobuf.h implements v2j0 {
        private static final TwinAttribute DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Paragraph label_;
        private Paragraph value_;

        static {
            TwinAttribute twinAttribute = new TwinAttribute();
            DEFAULT_INSTANCE = twinAttribute;
            com.google.protobuf.h.registerDefaultInstance(TwinAttribute.class, twinAttribute);
        }

        private TwinAttribute() {
        }

        public static TwinAttribute n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "label_", "value_"});
            }
            if (iOrdinal == 3) {
                return new TwinAttribute();
            }
            if (iOrdinal == 4) {
                return new k2(DEFAULT_INSTANCE);
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
            synchronized (TwinAttribute.class) {
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
            Paragraph paragraph = this.label_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.value_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$WrappedTwinContent$SearchingCard sceneTemplate$WrappedTwinContent$SearchingCard = new SceneTemplate$WrappedTwinContent$SearchingCard();
        DEFAULT_INSTANCE = sceneTemplate$WrappedTwinContent$SearchingCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$WrappedTwinContent$SearchingCard.class, sceneTemplate$WrappedTwinContent$SearchingCard);
    }

    private SceneTemplate$WrappedTwinContent$SearchingCard() {
    }

    public static SceneTemplate$WrappedTwinContent$SearchingCard o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\n\u0007", new Object[]{"bitField0_", "gradientLabel1_", "primaryAttribute_", "gridAttribute1_", "gridAttribute2_", "gridAttribute3_", "backgroundAnimation_", "gridAttribute4_", "foregroundAnimation_", "gradientLabel2_", "hasRevealHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$WrappedTwinContent$SearchingCard();
        }
        if (iOrdinal == 4) {
            return new h2(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$WrappedTwinContent$SearchingCard.class) {
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
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation p() {
        RiveAnimation riveAnimation = this.foregroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final TwinAttribute q() {
        TwinAttribute twinAttribute = this.gridAttribute1_;
        return twinAttribute == null ? TwinAttribute.n() : twinAttribute;
    }

    public final TwinAttribute r() {
        TwinAttribute twinAttribute = this.gridAttribute2_;
        return twinAttribute == null ? TwinAttribute.n() : twinAttribute;
    }

    public final TwinAttribute s() {
        TwinAttribute twinAttribute = this.gridAttribute3_;
        return twinAttribute == null ? TwinAttribute.n() : twinAttribute;
    }

    public final TwinAttribute t() {
        TwinAttribute twinAttribute = this.gridAttribute4_;
        return twinAttribute == null ? TwinAttribute.n() : twinAttribute;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.hasRevealHapticFeedback_;
    }

    public final TwinAttribute v() {
        TwinAttribute twinAttribute = this.primaryAttribute_;
        return twinAttribute == null ? TwinAttribute.n() : twinAttribute;
    }

    public final boolean w() {
        return (this.bitField0_ & 64) != 0;
    }
}
