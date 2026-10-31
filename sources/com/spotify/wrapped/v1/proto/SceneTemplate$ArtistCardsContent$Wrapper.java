package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$Wrapper extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 2;
    private static final SceneTemplate$ArtistCardsContent$Wrapper DEFAULT_INSTANCE;
    public static final int PACK_RANGE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TEXT_COLOR_FIELD_NUMBER = 5;
    public static final int TITLE_IMAGE_FIELD_NUMBER = 1;
    private Image backgroundImage_;
    private int bitField0_;
    private Image titleImage_;
    private String subtitle_ = "";
    private String packRange_ = "";
    private String textColor_ = "";

    static {
        SceneTemplate$ArtistCardsContent$Wrapper sceneTemplate$ArtistCardsContent$Wrapper = new SceneTemplate$ArtistCardsContent$Wrapper();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$Wrapper;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$Wrapper.class, sceneTemplate$ArtistCardsContent$Wrapper);
    }

    private SceneTemplate$ArtistCardsContent$Wrapper() {
    }

    public static SceneTemplate$ArtistCardsContent$Wrapper o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "titleImage_", "backgroundImage_", "subtitle_", "packRange_", "textColor_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$Wrapper();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (SceneTemplate$ArtistCardsContent$Wrapper.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final Image n() {
        Image image = this.backgroundImage_;
        return image == null ? Image.o() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.packRange_;
    }

    public final String q() {
        return this.textColor_;
    }

    public final Image r() {
        Image image = this.titleImage_;
        return image == null ? Image.o() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
