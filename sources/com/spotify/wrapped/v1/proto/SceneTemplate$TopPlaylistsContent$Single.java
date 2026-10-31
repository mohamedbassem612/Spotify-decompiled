package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopPlaylistsContent$Single extends com.google.protobuf.h implements v2j0 {
    public static final int ASSOCIATED_DATA_POINT_2_FIELD_NUMBER = 5;
    public static final int ASSOCIATED_DATA_POINT_FIELD_NUMBER = 4;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 6;
    private static final SceneTemplate$TopPlaylistsContent$Single DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Paragraph associatedDataPoint2_;
    private Paragraph associatedDataPoint_;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private Image image_;
    private Paragraph name_;
    private Paragraph title_;

    static {
        SceneTemplate$TopPlaylistsContent$Single sceneTemplate$TopPlaylistsContent$Single = new SceneTemplate$TopPlaylistsContent$Single();
        DEFAULT_INSTANCE = sceneTemplate$TopPlaylistsContent$Single;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopPlaylistsContent$Single.class, sceneTemplate$TopPlaylistsContent$Single);
    }

    private SceneTemplate$TopPlaylistsContent$Single() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SceneTemplate$TopPlaylistsContent$Single q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "image_", "title_", "name_", "associatedDataPoint_", "associatedDataPoint2_", "backgroundAnimation_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopPlaylistsContent$Single();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (SceneTemplate$TopPlaylistsContent$Single.class) {
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

    public final Paragraph n() {
        Paragraph paragraph = this.associatedDataPoint_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Paragraph o() {
        Paragraph paragraph = this.associatedDataPoint2_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final RiveAnimation p() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Image r() {
        Image image = this.image_;
        return image == null ? Image.o() : image;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.name_;
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
