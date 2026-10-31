package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$TopSongs extends com.google.protobuf.h implements v2j0 {
    private static final SceneTemplate$ArtistCardsContent$TopSongs DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SONGS_FIELD_NUMBER = 2;
    private String label_ = "";
    private h290 songs_ = com.google.protobuf.h.emptyProtobufList();

    static {
        SceneTemplate$ArtistCardsContent$TopSongs sceneTemplate$ArtistCardsContent$TopSongs = new SceneTemplate$ArtistCardsContent$TopSongs();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$TopSongs;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$TopSongs.class, sceneTemplate$ArtistCardsContent$TopSongs);
    }

    private SceneTemplate$ArtistCardsContent$TopSongs() {
    }

    public static SceneTemplate$ArtistCardsContent$TopSongs n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"label_", "songs_", SceneTemplate$ArtistCardsContent$TopSong.class});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$TopSongs();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (SceneTemplate$ArtistCardsContent$TopSongs.class) {
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

    public final String o() {
        return this.label_;
    }

    public final h290 p() {
        return this.songs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
