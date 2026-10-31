package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SnackbarMessageComponent extends com.google.protobuf.h implements v2j0 {
    public static final int BUTTON_FIELD_NUMBER = 2;
    private static final SnackbarMessageComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_DURATION_MS_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private SnackbarButton button_;
    private long showDurationMs_;
    private String text_ = "";

    public static final class SnackbarButton extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
        private static final SnackbarButton DEFAULT_INSTANCE;
        public static final int NAVIGATION_URI_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String navigationUri_ = "";
        private String accessibilityText_ = "";

        static {
            SnackbarButton snackbarButton = new SnackbarButton();
            DEFAULT_INSTANCE = snackbarButton;
            com.google.protobuf.h.registerDefaultInstance(SnackbarButton.class, snackbarButton);
        }

        private SnackbarButton() {
        }

        public static SnackbarButton o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "navigationUri_", "accessibilityText_"});
            }
            if (iOrdinal == 3) {
                return new SnackbarButton();
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
            synchronized (SnackbarButton.class) {
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
            return this.accessibilityText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.navigationUri_;
        }

        public final String q() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SnackbarMessageComponent snackbarMessageComponent = new SnackbarMessageComponent();
        DEFAULT_INSTANCE = snackbarMessageComponent;
        com.google.protobuf.h.registerDefaultInstance(SnackbarMessageComponent.class, snackbarMessageComponent);
    }

    private SnackbarMessageComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SnackbarMessageComponent r(phc phcVar) {
        return (SnackbarMessageComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002", new Object[]{"bitField0_", "text_", "button_", "showDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new SnackbarMessageComponent();
        }
        if (iOrdinal == 4) {
            return new m(DEFAULT_INSTANCE);
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
        synchronized (SnackbarMessageComponent.class) {
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

    public final SnackbarButton n() {
        SnackbarButton snackbarButton = this.button_;
        return snackbarButton == null ? SnackbarButton.o() : snackbarButton;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.showDurationMs_;
    }

    public final String p() {
        return this.text_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
