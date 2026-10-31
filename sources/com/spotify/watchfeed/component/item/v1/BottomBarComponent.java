package com.spotify.watchfeed.component.item.v1;

import com.spotify.wrapped.v1.proto.Action;
import com.spotify.wrapped.v1.proto.ButtonConfiguration;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BottomBarComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACTION_ITEMS_FIELD_NUMBER = 3;
    private static final BottomBarComponent DEFAULT_INSTANCE;
    public static final int DELAY_MILLIS_FIELD_NUMBER = 4;
    public static final int NUDGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_BAR_FIELD_NUMBER = 1;
    private h290 actionItems_ = com.google.protobuf.h.emptyProtobufList();
    private int bitField0_;
    private long delayMillis_;
    private NudgeButton nudge_;
    private ProgressBar progressBar_;

    public static final class ActionItem extends com.google.protobuf.h implements v2j0 {
        public static final int BUTTON_FIELD_NUMBER = 1;
        private static final ActionItem DEFAULT_INSTANCE;
        public static final int ICON_BUTTON_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int RECEIPT_BUTTON_PRESENTATION_FIELD_NUMBER = 3;
        private int bitField0_;
        private int itemCase_ = 0;
        private Object item_;
        private ReceiptButtonPresentation receiptButtonPresentation_;

        static {
            ActionItem actionItem = new ActionItem();
            DEFAULT_INSTANCE = actionItem;
            com.google.protobuf.h.registerDefaultInstance(ActionItem.class, actionItem);
        }

        private ActionItem() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{"item_", "itemCase_", "bitField0_", ButtonConfiguration.class, IconButtonConfiguration.class, "receiptButtonPresentation_"});
            }
            if (iOrdinal == 3) {
                return new ActionItem();
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
            synchronized (ActionItem.class) {
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

        public final ButtonConfiguration n() {
            return this.itemCase_ == 1 ? (ButtonConfiguration) this.item_ : ButtonConfiguration.o();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final IconButtonConfiguration o() {
            return this.itemCase_ == 2 ? (IconButtonConfiguration) this.item_ : IconButtonConfiguration.q();
        }

        public final int p() {
            int i = this.itemCase_;
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

        public final ReceiptButtonPresentation q() {
            ReceiptButtonPresentation receiptButtonPresentation = this.receiptButtonPresentation_;
            return receiptButtonPresentation == null ? ReceiptButtonPresentation.o() : receiptButtonPresentation;
        }

        public final boolean r() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class HighlightStyle extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
        public static final int CONTENT_COLOR_FIELD_NUMBER = 2;
        private static final HighlightStyle DEFAULT_INSTANCE;
        public static final int OUTLINE_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private Outline outline_;
        private String backgroundColor_ = "";
        private String contentColor_ = "";

        static {
            HighlightStyle highlightStyle = new HighlightStyle();
            DEFAULT_INSTANCE = highlightStyle;
            com.google.protobuf.h.registerDefaultInstance(HighlightStyle.class, highlightStyle);
        }

        private HighlightStyle() {
        }

        public static HighlightStyle p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "backgroundColor_", "contentColor_", "outline_"});
            }
            if (iOrdinal == 3) {
                return new HighlightStyle();
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
            synchronized (HighlightStyle.class) {
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

        public final String o() {
            return this.contentColor_;
        }

        public final Outline q() {
            Outline outline = this.outline_;
            return outline == null ? Outline.o() : outline;
        }

        public final boolean r() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class IconButtonConfiguration extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
        public static final int ACTION_FIELD_NUMBER = 2;
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 5;
        private static final IconButtonConfiguration DEFAULT_INSTANCE;
        public static final int HIGHLIGHT_STYLE_ANIMATION_FIELD_NUMBER = 7;
        public static final int ICON_COLOR_FIELD_NUMBER = 4;
        public static final int ICON_FIELD_NUMBER = 1;
        public static final int OUTLINE_FIELD_NUMBER = 6;
        private static volatile qzr0 PARSER;
        private Action action_;
        private int bitField0_;
        private HighlightStyle highlightStyleAnimation_;
        private Outline outline_;
        private String icon_ = "";
        private String accessibilityText_ = "";
        private String iconColor_ = "";
        private String backgroundColor_ = "";

        static {
            IconButtonConfiguration iconButtonConfiguration = new IconButtonConfiguration();
            DEFAULT_INSTANCE = iconButtonConfiguration;
            com.google.protobuf.h.registerDefaultInstance(IconButtonConfiguration.class, iconButtonConfiguration);
        }

        private IconButtonConfiguration() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static IconButtonConfiguration q() {
            return DEFAULT_INSTANCE;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ለ\u0001\u0006ဉ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "icon_", "action_", "accessibilityText_", "iconColor_", "backgroundColor_", "outline_", "highlightStyleAnimation_"});
            }
            if (iOrdinal == 3) {
                return new IconButtonConfiguration();
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
            synchronized (IconButtonConfiguration.class) {
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

        public final Action o() {
            Action action = this.action_;
            return action == null ? Action.o() : action;
        }

        public final String p() {
            return this.backgroundColor_;
        }

        public final HighlightStyle r() {
            HighlightStyle highlightStyle = this.highlightStyleAnimation_;
            return highlightStyle == null ? HighlightStyle.p() : highlightStyle;
        }

        public final String s() {
            return this.icon_;
        }

        public final String t() {
            return this.iconColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Outline u() {
            Outline outline = this.outline_;
            return outline == null ? Outline.o() : outline;
        }

        public final boolean v() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean w() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    public static final class NudgeButton extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 2;
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 5;
        private static final NudgeButton DEFAULT_INSTANCE;
        public static final int ICON_ANIMATION_DELAY_MILLIS_FIELD_NUMBER = 3;
        public static final int ICON_COLOR_FIELD_NUMBER = 4;
        public static final int ICON_FIELD_NUMBER = 1;
        public static final int LABEL_FIELD_NUMBER = 7;
        public static final int OUTLINE_FIELD_NUMBER = 6;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private long iconAnimationDelayMillis_;
        private Paragraph label_;
        private Outline outline_;
        private String icon_ = "";
        private String accessibilityText_ = "";
        private String iconColor_ = "";
        private String backgroundColor_ = "";

        static {
            NudgeButton nudgeButton = new NudgeButton();
            DEFAULT_INSTANCE = nudgeButton;
            com.google.protobuf.h.registerDefaultInstance(NudgeButton.class, nudgeButton);
        }

        private NudgeButton() {
        }

        public static NudgeButton p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005ለ\u0000\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"bitField0_", "icon_", "accessibilityText_", "iconAnimationDelayMillis_", "iconColor_", "backgroundColor_", "outline_", "label_"});
            }
            if (iOrdinal == 3) {
                return new NudgeButton();
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
            synchronized (NudgeButton.class) {
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

        public final boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        public final String n() {
            return this.accessibilityText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.backgroundColor_;
        }

        public final String q() {
            return this.icon_;
        }

        public final long r() {
            return this.iconAnimationDelayMillis_;
        }

        public final String s() {
            return this.iconColor_;
        }

        public final Paragraph t() {
            Paragraph paragraph = this.label_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Outline u() {
            Outline outline = this.outline_;
            return outline == null ? Outline.o() : outline;
        }

        public final boolean v() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public static final class ProgressBar extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
        private static final ProgressBar DEFAULT_INSTANCE;
        public static final int FILL_COLOR_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String fillColor_ = "";
        private String backgroundColor_ = "";

        static {
            ProgressBar progressBar = new ProgressBar();
            DEFAULT_INSTANCE = progressBar;
            com.google.protobuf.h.registerDefaultInstance(ProgressBar.class, progressBar);
        }

        private ProgressBar() {
        }

        public static ProgressBar o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"fillColor_", "backgroundColor_"});
            }
            if (iOrdinal == 3) {
                return new ProgressBar();
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
            synchronized (ProgressBar.class) {
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

        public final String p() {
            return this.fillColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ReceiptButtonPresentation extends com.google.protobuf.h implements v2j0 {
        public static final int CONTENT_FIELD_NUMBER = 1;
        private static final ReceiptButtonPresentation DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private Paragraph content_;

        static {
            ReceiptButtonPresentation receiptButtonPresentation = new ReceiptButtonPresentation();
            DEFAULT_INSTANCE = receiptButtonPresentation;
            com.google.protobuf.h.registerDefaultInstance(ReceiptButtonPresentation.class, receiptButtonPresentation);
        }

        private ReceiptButtonPresentation() {
        }

        public static ReceiptButtonPresentation o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "content_"});
            }
            if (iOrdinal == 3) {
                return new ReceiptButtonPresentation();
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
            synchronized (ReceiptButtonPresentation.class) {
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
            Paragraph paragraph = this.content_;
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
        BottomBarComponent bottomBarComponent = new BottomBarComponent();
        DEFAULT_INSTANCE = bottomBarComponent;
        com.google.protobuf.h.registerDefaultInstance(BottomBarComponent.class, bottomBarComponent);
    }

    private BottomBarComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BottomBarComponent u(phc phcVar) {
        return (BottomBarComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"bitField0_", "progressBar_", "nudge_", "actionItems_", ActionItem.class, "delayMillis_"});
        }
        if (iOrdinal == 3) {
            return new BottomBarComponent();
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
        synchronized (BottomBarComponent.class) {
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
        return this.actionItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.delayMillis_;
    }

    public final NudgeButton p() {
        NudgeButton nudgeButton = this.nudge_;
        return nudgeButton == null ? NudgeButton.p() : nudgeButton;
    }

    public final ProgressBar q() {
        ProgressBar progressBar = this.progressBar_;
        return progressBar == null ? ProgressBar.o() : progressBar;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
