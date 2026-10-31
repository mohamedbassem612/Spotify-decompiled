package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$MinutesListenedContent$Reveal extends com.google.protobuf.h implements v2j0 {
    public static final int ASSOCIATED_DATA_POINT_FIELD_NUMBER = 4;
    private static final SceneTemplate$MinutesListenedContent$Reveal DEFAULT_INSTANCE;
    public static final int HAS_REVEAL_HAPTIC_FEEDBACK_FIELD_NUMBER = 8;
    public static final int MINUTES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RIVE_BACKGROUND_FIELD_NUMBER = 5;
    public static final int RIVE_COUNT_UP_FIELD_NUMBER = 6;
    public static final int SHARE_BUTTON_FIELD_NUMBER = 7;
    public static final int TIERS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Paragraph associatedDataPoint_;
    private int bitField0_;
    private boolean hasRevealHapticFeedback_;
    private long minutes_;
    private RiveAnimation riveBackground_;
    private RiveAnimation riveCountUp_;
    private ButtonConfiguration shareButton_;
    private h290 tiers_ = com.google.protobuf.h.emptyProtobufList();
    private Paragraph title_;

    public static final class TierTag extends com.google.protobuf.h implements v2j0 {
        public static final int COLORS_FIELD_NUMBER = 3;
        private static final TierTag DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TIER_FIELD_NUMBER = 1;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Colors colors_;
        private int tier_;
        private Paragraph title_;

        public static final class Colors extends com.google.protobuf.h implements v2j0 {
            private static final Colors DEFAULT_INSTANCE;
            public static final int INNER_SHADOWS_FIELD_NUMBER = 2;
            public static final int MAIN_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private String main_ = "";
            private h290 innerShadows_ = com.google.protobuf.h.emptyProtobufList();

            static {
                Colors colors = new Colors();
                DEFAULT_INSTANCE = colors;
                com.google.protobuf.h.registerDefaultInstance(Colors.class, colors);
            }

            private Colors() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"main_", "innerShadows_"});
                }
                if (iOrdinal == 3) {
                    return new Colors();
                }
                if (iOrdinal == 4) {
                    return new c1(DEFAULT_INSTANCE);
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
                synchronized (Colors.class) {
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
            TierTag tierTag = new TierTag();
            DEFAULT_INSTANCE = tierTag;
            com.google.protobuf.h.registerDefaultInstance(TierTag.class, tierTag);
        }

        private TierTag() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "tier_", "title_", "colors_"});
            }
            if (iOrdinal == 3) {
                return new TierTag();
            }
            if (iOrdinal == 4) {
                return new b1(DEFAULT_INSTANCE);
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
            synchronized (TierTag.class) {
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
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$MinutesListenedContent$Reveal sceneTemplate$MinutesListenedContent$Reveal = new SceneTemplate$MinutesListenedContent$Reveal();
        DEFAULT_INSTANCE = sceneTemplate$MinutesListenedContent$Reveal;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$MinutesListenedContent$Reveal.class, sceneTemplate$MinutesListenedContent$Reveal);
    }

    private SceneTemplate$MinutesListenedContent$Reveal() {
    }

    public static SceneTemplate$MinutesListenedContent$Reveal o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0002\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\b\u0007", new Object[]{"bitField0_", "minutes_", "title_", "tiers_", TierTag.class, "associatedDataPoint_", "riveBackground_", "riveCountUp_", "shareButton_", "hasRevealHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$MinutesListenedContent$Reveal();
        }
        if (iOrdinal == 4) {
            return new a1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$MinutesListenedContent$Reveal.class) {
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
        Paragraph paragraph = this.associatedDataPoint_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.hasRevealHapticFeedback_;
    }

    public final long q() {
        return this.minutes_;
    }

    public final RiveAnimation r() {
        RiveAnimation riveAnimation = this.riveBackground_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final RiveAnimation s() {
        RiveAnimation riveAnimation = this.riveCountUp_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final h290 t() {
        return this.tiers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Paragraph u() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }
}
