package com.spotify.wrapped.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SceneTemplate$WrappedPlacesContent$Card2 extends h implements v2j0 {
    public static final int BOTTOM_GRADIENT_FIELD_NUMBER = 14;
    private static final SceneTemplate$WrappedPlacesContent$Card2 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int HINT_FIELD_NUMBER = 11;
    public static final int INTRO_FIELD_NUMBER = 1;
    public static final int LEFT_BUTTON_ACCESSIBILITY_TITLE_FIELD_NUMBER = 8;
    public static final int OVERLAY_TINT_COLOR_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RETRY_BUTTON_TITLE_FIELD_NUMBER = 10;
    public static final int RIGHT_BUTTON_ACCESSIBILITY_TITLE_FIELD_NUMBER = 9;
    public static final int TERMINAL_ERROR_DESCRIPTION_FIELD_NUMBER = 12;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TOP_GRADIENT_FIELD_NUMBER = 13;
    public static final int TRACK_1_FIELD_NUMBER = 6;
    public static final int TRACK_2_FIELD_NUMBER = 7;
    public static final int VIDEO_FIELD_NUMBER = 5;
    private int bitField0_;
    private SceneTemplate$WrappedPlacesContent$GradientStyle bottomGradient_;
    private Paragraph description_;
    private Paragraph hint_;
    private Paragraph intro_;
    private Paragraph retryButtonTitle_;
    private Paragraph terminalErrorDescription_;
    private Paragraph title_;
    private SceneTemplate$WrappedPlacesContent$GradientStyle topGradient_;
    private SceneTemplate$WrappedPlacesContent$Track track1_;
    private SceneTemplate$WrappedPlacesContent$Track track2_;
    private SceneTemplate$WrappedPlacesContent$Video video_;
    private String overlayTintColor_ = "";
    private String leftButtonAccessibilityTitle_ = "";
    private String rightButtonAccessibilityTitle_ = "";

    static {
        SceneTemplate$WrappedPlacesContent$Card2 sceneTemplate$WrappedPlacesContent$Card2 = new SceneTemplate$WrappedPlacesContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$WrappedPlacesContent$Card2;
        h.registerDefaultInstance(SceneTemplate$WrappedPlacesContent$Card2.class, sceneTemplate$WrappedPlacesContent$Card2);
    }

    private SceneTemplate$WrappedPlacesContent$Card2() {
    }

    public static SceneTemplate$WrappedPlacesContent$Card2 o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final SceneTemplate$WrappedPlacesContent$Track A() {
        SceneTemplate$WrappedPlacesContent$Track sceneTemplate$WrappedPlacesContent$Track = this.track2_;
        return sceneTemplate$WrappedPlacesContent$Track == null ? SceneTemplate$WrappedPlacesContent$Track.o() : sceneTemplate$WrappedPlacesContent$Track;
    }

    public final SceneTemplate$WrappedPlacesContent$Video B() {
        SceneTemplate$WrappedPlacesContent$Video sceneTemplate$WrappedPlacesContent$Video = this.video_;
        return sceneTemplate$WrappedPlacesContent$Video == null ? SceneTemplate$WrappedPlacesContent$Video.n() : sceneTemplate$WrappedPlacesContent$Video;
    }

    public final boolean C() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 512) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 32) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bȈ\tȈ\nဉ\u0006\u000bဉ\u0007\fဉ\b\rဉ\t\u000eဉ\n", new Object[]{"bitField0_", "intro_", "title_", "description_", "overlayTintColor_", "video_", "track1_", "track2_", "leftButtonAccessibilityTitle_", "rightButtonAccessibilityTitle_", "retryButtonTitle_", "hint_", "terminalErrorDescription_", "topGradient_", "bottomGradient_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$WrappedPlacesContent$Card2();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (SceneTemplate$WrappedPlacesContent$Card2.class) {
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

    public final SceneTemplate$WrappedPlacesContent$GradientStyle n() {
        SceneTemplate$WrappedPlacesContent$GradientStyle sceneTemplate$WrappedPlacesContent$GradientStyle = this.bottomGradient_;
        return sceneTemplate$WrappedPlacesContent$GradientStyle == null ? SceneTemplate$WrappedPlacesContent$GradientStyle.p() : sceneTemplate$WrappedPlacesContent$GradientStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Paragraph p() {
        Paragraph paragraph = this.description_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.hint_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.intro_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final String s() {
        return this.leftButtonAccessibilityTitle_;
    }

    public final String t() {
        return this.overlayTintColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Paragraph u() {
        Paragraph paragraph = this.retryButtonTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final String v() {
        return this.rightButtonAccessibilityTitle_;
    }

    public final Paragraph w() {
        Paragraph paragraph = this.terminalErrorDescription_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph x() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final SceneTemplate$WrappedPlacesContent$GradientStyle y() {
        SceneTemplate$WrappedPlacesContent$GradientStyle sceneTemplate$WrappedPlacesContent$GradientStyle = this.topGradient_;
        return sceneTemplate$WrappedPlacesContent$GradientStyle == null ? SceneTemplate$WrappedPlacesContent$GradientStyle.p() : sceneTemplate$WrappedPlacesContent$GradientStyle;
    }

    public final SceneTemplate$WrappedPlacesContent$Track z() {
        SceneTemplate$WrappedPlacesContent$Track sceneTemplate$WrappedPlacesContent$Track = this.track1_;
        return sceneTemplate$WrappedPlacesContent$Track == null ? SceneTemplate$WrappedPlacesContent$Track.o() : sceneTemplate$WrappedPlacesContent$Track;
    }
}
