package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$IntroContent$LiveCounterCard extends com.google.protobuf.h implements v2j0 {
    public static final int CONSOLIDATED_CARD_FIELD_NUMBER = 5;
    private static final SceneTemplate$IntroContent$LiveCounterCard DEFAULT_INSTANCE;
    public static final int FALLBACK_TITLE_FIELD_NUMBER = 6;
    public static final int LIVE_COUNTER_OVERTIME_FIELD_NUMBER = 2;
    public static final int LIVE_COUNTER_SUBTITLE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_BAR_DURATION_MILLIS_FIELD_NUMBER = 4;
    public static final int RIVE_BACKGROUND_ANIMATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private SceneTemplate$IntroContent$ConsolidatedCard consolidatedCard_;
    private Paragraph fallbackTitle_;
    private Paragraph liveCounterOvertime_;
    private Paragraph liveCounterSubtitle_;
    private long progressBarDurationMillis_;
    private RiveAnimation riveBackgroundAnimation_;

    static {
        SceneTemplate$IntroContent$LiveCounterCard sceneTemplate$IntroContent$LiveCounterCard = new SceneTemplate$IntroContent$LiveCounterCard();
        DEFAULT_INSTANCE = sceneTemplate$IntroContent$LiveCounterCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$IntroContent$LiveCounterCard.class, sceneTemplate$IntroContent$LiveCounterCard);
    }

    private SceneTemplate$IntroContent$LiveCounterCard() {
    }

    public static SceneTemplate$IntroContent$LiveCounterCard n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "riveBackgroundAnimation_", "liveCounterOvertime_", "liveCounterSubtitle_", "progressBarDurationMillis_", "consolidatedCard_", "fallbackTitle_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$IntroContent$LiveCounterCard();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (SceneTemplate$IntroContent$LiveCounterCard.class) {
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
        Paragraph paragraph = this.fallbackTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.liveCounterOvertime_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.liveCounterSubtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final long r() {
        return this.progressBarDurationMillis_;
    }

    public final RiveAnimation s() {
        RiveAnimation riveAnimation = this.riveBackgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final boolean t() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }
}
