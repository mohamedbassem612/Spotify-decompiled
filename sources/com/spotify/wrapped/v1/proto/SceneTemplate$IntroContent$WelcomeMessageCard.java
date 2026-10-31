package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Deprecated
public final class SceneTemplate$IntroContent$WelcomeMessageCard extends com.google.protobuf.h implements v2j0 {
    private static final SceneTemplate$IntroContent$WelcomeMessageCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_BAR_DURATION_MILLIS_FIELD_NUMBER = 5;
    public static final int RIVE_BACKGROUND_ANIMATION_FIELD_NUMBER = 1;
    public static final int WELCOME_MESSAGE_TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private long progressBarDurationMillis_;
    private RiveAnimation riveBackgroundAnimation_;
    private Paragraph welcomeMessageTitle_;

    static {
        SceneTemplate$IntroContent$WelcomeMessageCard sceneTemplate$IntroContent$WelcomeMessageCard = new SceneTemplate$IntroContent$WelcomeMessageCard();
        DEFAULT_INSTANCE = sceneTemplate$IntroContent$WelcomeMessageCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$IntroContent$WelcomeMessageCard.class, sceneTemplate$IntroContent$WelcomeMessageCard);
    }

    private SceneTemplate$IntroContent$WelcomeMessageCard() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005\u0002", new Object[]{"bitField0_", "riveBackgroundAnimation_", "welcomeMessageTitle_", "progressBarDurationMillis_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$IntroContent$WelcomeMessageCard();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (SceneTemplate$IntroContent$WelcomeMessageCard.class) {
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
