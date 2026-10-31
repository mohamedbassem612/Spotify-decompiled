package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopAlbumsContent$Single extends com.google.protobuf.h implements v2j0 {
    public static final int ALBUM_IMAGE_FIELD_NUMBER = 2;
    public static final int ALBUM_NAME_FIELD_NUMBER = 3;
    public static final int ARTIST_NAME_FIELD_NUMBER = 4;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 6;
    private static final SceneTemplate$TopAlbumsContent$Single DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Image albumImage_;
    private Paragraph albumName_;
    private Paragraph artistName_;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private Paragraph description_;
    private Paragraph title_;

    static {
        SceneTemplate$TopAlbumsContent$Single sceneTemplate$TopAlbumsContent$Single = new SceneTemplate$TopAlbumsContent$Single();
        DEFAULT_INSTANCE = sceneTemplate$TopAlbumsContent$Single;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopAlbumsContent$Single.class, sceneTemplate$TopAlbumsContent$Single);
    }

    private SceneTemplate$TopAlbumsContent$Single() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SceneTemplate$TopAlbumsContent$Single r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "title_", "albumImage_", "albumName_", "artistName_", "description_", "backgroundAnimation_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopAlbumsContent$Single();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (SceneTemplate$TopAlbumsContent$Single.class) {
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

    public final Image n() {
        Image image = this.albumImage_;
        return image == null ? Image.o() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Paragraph o() {
        Paragraph paragraph = this.albumName_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.artistName_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final RiveAnimation q() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.description_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph t() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
