package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ClassicContent extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_OVERRIDE_FIELD_NUMBER = 1001;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 1000;
    public static final int CONTENT_DELAY_MILLIS_FIELD_NUMBER = 100;
    private static final ClassicContent DEFAULT_INSTANCE;
    public static final int ENTITY_TITLE_FIELD_NUMBER = 5;
    public static final int ENTITY_TITLE_SUBTITLE_FIELD_NUMBER = 6;
    public static final int FULLSCREEN_RIVE_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_FIELD_NUMBER = 9;
    public static final int QUIZ_INTRO_FIELD_NUMBER = 13;
    public static final int QUIZ_TOP_SONG_FIELD_NUMBER = 14;
    public static final int SUMMARY_SHARE_FIELD_NUMBER = 11;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TITLE_SUBTITLE_BUTTON_FIELD_NUMBER = 3;
    public static final int TITLE_SUBTITLE_FIELD_NUMBER = 2;
    public static final int TOP_FIVE_FIELD_NUMBER = 10;
    public static final int VIDEO_ENTITY_FIELD_NUMBER = 8;
    public static final int VIDEO_FIELD_NUMBER = 7;
    private AudioPreview audioOverride_;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private long contentDelayMillis_;
    private int foregroundCase_ = 0;
    private Object foreground_;

    static {
        ClassicContent classicContent = new ClassicContent();
        DEFAULT_INSTANCE = classicContent;
        com.google.protobuf.h.registerDefaultInstance(ClassicContent.class, classicContent);
    }

    private ClassicContent() {
    }

    public static ClassicContent p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final SceneTemplate$TitleSubtitleButton A() {
        return this.foregroundCase_ == 3 ? (SceneTemplate$TitleSubtitleButton) this.foreground_ : SceneTemplate$TitleSubtitleButton.o();
    }

    public final SceneTemplate$TopFive B() {
        return this.foregroundCase_ == 10 ? (SceneTemplate$TopFive) this.foreground_ : SceneTemplate$TopFive.n();
    }

    public final SceneTemplate$Video C() {
        return this.foregroundCase_ == 7 ? (SceneTemplate$Video) this.foreground_ : SceneTemplate$Video.n();
    }

    public final SceneTemplate$VideoEntity D() {
        return this.foregroundCase_ == 8 ? (SceneTemplate$VideoEntity) this.foreground_ : SceneTemplate$VideoEntity.o();
    }

    public final boolean E() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean G() {
        return this.foregroundCase_ == 9;
    }

    public final boolean H() {
        return this.foregroundCase_ == 13;
    }

    public final boolean I() {
        return this.foregroundCase_ == 14;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0001\u0001ϩ\u0010\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000dဂ\u0000Ϩဉ\u0001ϩဉ\u0002", new Object[]{"foreground_", "foregroundCase_", "bitField0_", SceneTemplate$Title.class, SceneTemplate$TitleSubtitle.class, SceneTemplate$TitleSubtitleButton.class, SceneTemplate$EntityTitle.class, SceneTemplate$EntityTitleSubtitle.class, SceneTemplate$Video.class, SceneTemplate$VideoEntity.class, SceneTemplate$Quiz.class, SceneTemplate$TopFive.class, SceneTemplate$SummaryShare.class, SceneTemplate$FullScreenRive.class, SceneTemplate$QuizIntro.class, SceneTemplate$QuizTopSong.class, "contentDelayMillis_", "backgroundAnimation_", "audioOverride_"});
        }
        if (iOrdinal == 3) {
            return new ClassicContent();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (ClassicContent.class) {
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

    public final long o() {
        return this.contentDelayMillis_;
    }

    public final SceneTemplate$EntityTitle q() {
        return this.foregroundCase_ == 5 ? (SceneTemplate$EntityTitle) this.foreground_ : SceneTemplate$EntityTitle.n();
    }

    public final SceneTemplate$EntityTitleSubtitle r() {
        return this.foregroundCase_ == 6 ? (SceneTemplate$EntityTitleSubtitle) this.foreground_ : SceneTemplate$EntityTitleSubtitle.n();
    }

    public final int s() {
        switch (this.foregroundCase_) {
            case 0:
                return 14;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
            default:
                return 0;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
        }
    }

    public final SceneTemplate$FullScreenRive t() {
        return this.foregroundCase_ == 12 ? (SceneTemplate$FullScreenRive) this.foreground_ : SceneTemplate$FullScreenRive.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SceneTemplate$Quiz u() {
        return this.foregroundCase_ == 9 ? (SceneTemplate$Quiz) this.foreground_ : SceneTemplate$Quiz.q();
    }

    public final SceneTemplate$QuizIntro v() {
        return this.foregroundCase_ == 13 ? (SceneTemplate$QuizIntro) this.foreground_ : SceneTemplate$QuizIntro.p();
    }

    public final SceneTemplate$QuizTopSong w() {
        return this.foregroundCase_ == 14 ? (SceneTemplate$QuizTopSong) this.foreground_ : SceneTemplate$QuizTopSong.p();
    }

    public final SceneTemplate$SummaryShare x() {
        return this.foregroundCase_ == 11 ? (SceneTemplate$SummaryShare) this.foreground_ : SceneTemplate$SummaryShare.p();
    }

    public final SceneTemplate$Title y() {
        return this.foregroundCase_ == 1 ? (SceneTemplate$Title) this.foreground_ : SceneTemplate$Title.n();
    }

    public final SceneTemplate$TitleSubtitle z() {
        return this.foregroundCase_ == 2 ? (SceneTemplate$TitleSubtitle) this.foreground_ : SceneTemplate$TitleSubtitle.n();
    }
}
