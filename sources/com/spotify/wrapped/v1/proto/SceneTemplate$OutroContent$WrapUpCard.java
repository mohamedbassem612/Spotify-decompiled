package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$OutroContent$WrapUpCard extends com.google.protobuf.h implements v2j0 {
    private static final SceneTemplate$OutroContent$WrapUpCard DEFAULT_INSTANCE;
    public static final int NO_POSITION_AVAILABLE_MESSAGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REDUCED_MOTION_IMAGE_FIELD_NUMBER = 5;
    public static final int RIVE_BACKGROUND_ANIMATION_FIELD_NUMBER = 1;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Paragraph noPositionAvailableMessage_;
    private Image reducedMotionImage_;
    private RiveAnimation riveBackgroundAnimation_;
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        SceneTemplate$OutroContent$WrapUpCard sceneTemplate$OutroContent$WrapUpCard = new SceneTemplate$OutroContent$WrapUpCard();
        DEFAULT_INSTANCE = sceneTemplate$OutroContent$WrapUpCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$OutroContent$WrapUpCard.class, sceneTemplate$OutroContent$WrapUpCard);
    }

    private SceneTemplate$OutroContent$WrapUpCard() {
    }

    public static SceneTemplate$OutroContent$WrapUpCard n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "riveBackgroundAnimation_", "title_", "noPositionAvailableMessage_", "subtitle_", "reducedMotionImage_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$OutroContent$WrapUpCard();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (SceneTemplate$OutroContent$WrapUpCard.class) {
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

    public final Image o() {
        Image image = this.reducedMotionImage_;
        return image == null ? Image.o() : image;
    }

    public final RiveAnimation p() {
        RiveAnimation riveAnimation = this.riveBackgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean s() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
