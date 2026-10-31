package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$ArtistListItem extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 2;
    private static final SceneTemplate$ArtistCardsContent$ArtistListItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RANK_FIELD_NUMBER = 1;
    private Paragraph artistName_;
    private int bitField0_;
    private Paragraph rank_;

    static {
        SceneTemplate$ArtistCardsContent$ArtistListItem sceneTemplate$ArtistCardsContent$ArtistListItem = new SceneTemplate$ArtistCardsContent$ArtistListItem();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$ArtistListItem;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$ArtistListItem.class, sceneTemplate$ArtistCardsContent$ArtistListItem);
    }

    private SceneTemplate$ArtistCardsContent$ArtistListItem() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "rank_", "artistName_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$ArtistListItem();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (SceneTemplate$ArtistCardsContent$ArtistListItem.class) {
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
        Paragraph paragraph = this.artistName_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Paragraph o() {
        Paragraph paragraph = this.rank_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
