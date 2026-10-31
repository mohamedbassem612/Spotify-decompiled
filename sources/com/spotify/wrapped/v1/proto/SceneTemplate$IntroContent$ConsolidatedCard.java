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
public final class SceneTemplate$IntroContent$ConsolidatedCard extends com.google.protobuf.h implements v2j0 {
    private static final SceneTemplate$IntroContent$ConsolidatedCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RIVE_BACKGROUND_ANIMATION_FIELD_NUMBER = 1;
    public static final int SUBTITLE_COUNTER_FIELD_NUMBER = 3;
    public static final int SUBTITLE_NO_COUNTER_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private RiveAnimation riveBackgroundAnimation_;
    private Paragraph subtitleCounter_;
    private Paragraph subtitleNoCounter_;
    private Paragraph title_;

    static {
        SceneTemplate$IntroContent$ConsolidatedCard sceneTemplate$IntroContent$ConsolidatedCard = new SceneTemplate$IntroContent$ConsolidatedCard();
        DEFAULT_INSTANCE = sceneTemplate$IntroContent$ConsolidatedCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$IntroContent$ConsolidatedCard.class, sceneTemplate$IntroContent$ConsolidatedCard);
    }

    private SceneTemplate$IntroContent$ConsolidatedCard() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "riveBackgroundAnimation_", "title_", "subtitleCounter_", "subtitleNoCounter_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$IntroContent$ConsolidatedCard();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (SceneTemplate$IntroContent$ConsolidatedCard.class) {
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
