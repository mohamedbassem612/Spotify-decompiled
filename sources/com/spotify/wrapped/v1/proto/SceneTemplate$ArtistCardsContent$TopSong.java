package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$TopSong extends com.google.protobuf.h implements v2j0 {
    public static final int ART_FIELD_NUMBER = 3;
    private static final SceneTemplate$ArtistCardsContent$TopSong DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SONG_NAME_FIELD_NUMBER = 2;
    private Image art_;
    private int bitField0_;
    private String label_ = "";
    private String songName_ = "";

    static {
        SceneTemplate$ArtistCardsContent$TopSong sceneTemplate$ArtistCardsContent$TopSong = new SceneTemplate$ArtistCardsContent$TopSong();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$TopSong;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$TopSong.class, sceneTemplate$ArtistCardsContent$TopSong);
    }

    private SceneTemplate$ArtistCardsContent$TopSong() {
    }

    public static SceneTemplate$ArtistCardsContent$TopSong o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "label_", "songName_", "art_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$TopSong();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (SceneTemplate$ArtistCardsContent$TopSong.class) {
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
        Image image = this.art_;
        return image == null ? Image.o() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.label_;
    }

    public final String q() {
        return this.songName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
