package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$Card1 extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 4;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final SceneTemplate$ArtistCardsContent$Card1 DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int PACK_WRAPPER_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int WRAPPED_LOGO_FIELD_NUMBER = 5;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private Paragraph body_;
    private Paragraph header_;
    private SceneTemplate$ArtistCardsContent$Wrapper packWrapper_;
    private Image wrappedLogo_;

    static {
        SceneTemplate$ArtistCardsContent$Card1 sceneTemplate$ArtistCardsContent$Card1 = new SceneTemplate$ArtistCardsContent$Card1();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$Card1;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$Card1.class, sceneTemplate$ArtistCardsContent$Card1);
    }

    private SceneTemplate$ArtistCardsContent$Card1() {
    }

    public static SceneTemplate$ArtistCardsContent$Card1 p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "header_", "body_", "packWrapper_", "backgroundAnimation_", "wrappedLogo_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$Card1();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (SceneTemplate$ArtistCardsContent$Card1.class) {
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

    public final Paragraph o() {
        Paragraph paragraph = this.body_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final SceneTemplate$ArtistCardsContent$Wrapper r() {
        SceneTemplate$ArtistCardsContent$Wrapper sceneTemplate$ArtistCardsContent$Wrapper = this.packWrapper_;
        return sceneTemplate$ArtistCardsContent$Wrapper == null ? SceneTemplate$ArtistCardsContent$Wrapper.o() : sceneTemplate$ArtistCardsContent$Wrapper;
    }

    public final Image s() {
        Image image = this.wrappedLogo_;
        return image == null ? Image.o() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
