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
public final class SceneTemplate$WrappedTwinContent$IntroCard extends h implements v2j0 {
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 3;
    private static final SceneTemplate$WrappedTwinContent$IntroCard DEFAULT_INSTANCE;
    public static final int GLOBE_ANIMATION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private RiveAnimation globeAnimation_;
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        SceneTemplate$WrappedTwinContent$IntroCard sceneTemplate$WrappedTwinContent$IntroCard = new SceneTemplate$WrappedTwinContent$IntroCard();
        DEFAULT_INSTANCE = sceneTemplate$WrappedTwinContent$IntroCard;
        h.registerDefaultInstance(SceneTemplate$WrappedTwinContent$IntroCard.class, sceneTemplate$WrappedTwinContent$IntroCard);
    }

    private SceneTemplate$WrappedTwinContent$IntroCard() {
    }

    public static SceneTemplate$WrappedTwinContent$IntroCard o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "title_", "subtitle_", "backgroundAnimation_", "globeAnimation_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$WrappedTwinContent$IntroCard();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (SceneTemplate$WrappedTwinContent$IntroCard.class) {
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

    public final Paragraph p() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
