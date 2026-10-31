package com.spotify.unboxingfeatureflows.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowStep extends h implements v2j0 {
    public static final int ANIMATION_FIELD_NUMBER = 6;
    private static final FlowStep DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ENCORE_ICON_FIELD_NUMBER = 10;
    public static final int FLOW_BUTTON_FIELD_NUMBER = 5;
    public static final int FOOTER_NOTE_FIELD_NUMBER = 11;
    public static final int GRADIENT_COLOR_FIELD_NUMBER = 7;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_TOP_GRADIENT_FIELD_NUMBER = 8;
    public static final int TAG_FIELD_NUMBER = 3;
    public static final int TINT_COLOR_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private FlowButton flowButton_;
    private Object media_;
    private boolean showTopGradient_;
    private int mediaCase_ = 0;
    private String title_ = "";
    private String tag_ = "";
    private String description_ = "";
    private String gradientColor_ = "";
    private String tintColor_ = "";
    private String encoreIcon_ = "";
    private String footerNote_ = "";

    static {
        FlowStep flowStep = new FlowStep();
        DEFAULT_INSTANCE = flowStep;
        h.registerDefaultInstance(FlowStep.class, flowStep);
    }

    private FlowStep() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ဉ\u0001\u0006<\u0000\u0007Ȉ\b\u0007\tȈ\nለ\u0002\u000bለ\u0003", new Object[]{"media_", "mediaCase_", "bitField0_", "title_", "tag_", "description_", "flowButton_", Animation.class, "gradientColor_", "showTopGradient_", "tintColor_", "encoreIcon_", "footerNote_"});
        }
        if (iOrdinal == 3) {
            return new FlowStep();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (FlowStep.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.mediaCase_ == 1 ? (String) this.media_ : "";
    }

    public final String getTag() {
        return this.tag_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final boolean hasImageUrl() {
        return this.mediaCase_ == 1;
    }

    public final Animation n() {
        return this.mediaCase_ == 6 ? (Animation) this.media_ : Animation.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.encoreIcon_;
    }

    public final FlowButton p() {
        FlowButton flowButton = this.flowButton_;
        return flowButton == null ? FlowButton.p() : flowButton;
    }

    public final String q() {
        return this.footerNote_;
    }

    public final String r() {
        return this.gradientColor_;
    }

    public final boolean s() {
        return this.showTopGradient_;
    }

    public final String t() {
        return this.tintColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.mediaCase_ == 6;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }
}
