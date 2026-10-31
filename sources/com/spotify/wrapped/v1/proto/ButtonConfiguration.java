package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ButtonConfiguration extends com.google.protobuf.h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final ButtonConfiguration DEFAULT_INSTANCE;
    public static final int DISABLED_STYLE_FIELD_NUMBER = 2;
    public static final int ENABLED_STYLE_FIELD_NUMBER = 1;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private Action action_;
    private int bitField0_;
    private Style disabledStyle_;
    private Style enabledStyle_;
    private boolean hasHapticFeedback_;

    public static final class Style extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_TINT_FIELD_NUMBER = 3;
        private static final Style DEFAULT_INSTANCE;
        public static final int LABEL_COLOR_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int SHORT_LABEL_FIELD_NUMBER = 4;
        private int bitField0_;
        private String label_ = "";
        private String labelColor_ = "";
        private String backgroundTint_ = "";
        private String shortLabel_ = "";

        static {
            Style style = new Style();
            DEFAULT_INSTANCE = style;
            com.google.protobuf.h.registerDefaultInstance(Style.class, style);
        }

        private Style() {
        }

        public static Style o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000", new Object[]{"bitField0_", "label_", "labelColor_", "backgroundTint_", "shortLabel_"});
            }
            if (iOrdinal == 3) {
                return new Style();
            }
            if (iOrdinal == 4) {
                return new o(DEFAULT_INSTANCE);
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

        public final String n() {
            return this.backgroundTint_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.label_;
        }

        public final String q() {
            return this.labelColor_;
        }

        public final String r() {
            return this.shortLabel_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ButtonConfiguration buttonConfiguration = new ButtonConfiguration();
        DEFAULT_INSTANCE = buttonConfiguration;
        com.google.protobuf.h.registerDefaultInstance(ButtonConfiguration.class, buttonConfiguration);
    }

    private ButtonConfiguration() {
    }

    public static ButtonConfiguration o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007", new Object[]{"bitField0_", "enabledStyle_", "disabledStyle_", "action_", "hasHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new ButtonConfiguration();
        }
        if (iOrdinal == 4) {
            return new n(DEFAULT_INSTANCE);
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
        synchronized (ButtonConfiguration.class) {
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

    public final Action n() {
        Action action = this.action_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Style p() {
        Style style = this.disabledStyle_;
        return style == null ? Style.o() : style;
    }

    public final Style q() {
        Style style = this.enabledStyle_;
        return style == null ? Style.o() : style;
    }

    public final boolean r() {
        return this.hasHapticFeedback_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
