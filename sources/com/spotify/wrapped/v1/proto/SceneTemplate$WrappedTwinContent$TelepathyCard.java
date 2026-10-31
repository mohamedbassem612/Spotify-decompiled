package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$WrappedTwinContent$TelepathyCard extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 5;
    private static final SceneTemplate$WrappedTwinContent$TelepathyCard DEFAULT_INSTANCE;
    public static final int FOREGROUND_ANIMATION_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int TELEPATHY_BODY_FIELD_NUMBER = 4;
    public static final int TELEPATHY_TITLE_FIELD_NUMBER = 3;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private RiveAnimation foregroundAnimation_;
    private Paragraph telepathyBody_;
    private Paragraph telepathyTitle_;

    static {
        SceneTemplate$WrappedTwinContent$TelepathyCard sceneTemplate$WrappedTwinContent$TelepathyCard = new SceneTemplate$WrappedTwinContent$TelepathyCard();
        DEFAULT_INSTANCE = sceneTemplate$WrappedTwinContent$TelepathyCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$WrappedTwinContent$TelepathyCard.class, sceneTemplate$WrappedTwinContent$TelepathyCard);
    }

    private SceneTemplate$WrappedTwinContent$TelepathyCard() {
    }

    public static SceneTemplate$WrappedTwinContent$TelepathyCard o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "telepathyTitle_", "telepathyBody_", "backgroundAnimation_", "foregroundAnimation_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$WrappedTwinContent$TelepathyCard();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (SceneTemplate$WrappedTwinContent$TelepathyCard.class) {
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

    public final RiveAnimation p() {
        RiveAnimation riveAnimation = this.foregroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.telepathyBody_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.telepathyTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
