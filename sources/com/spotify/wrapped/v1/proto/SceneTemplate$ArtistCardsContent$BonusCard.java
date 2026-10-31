package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$BonusCard extends com.google.protobuf.h implements v2j0 {
    public static final int BACK_TOP_SONGS_FIELD_NUMBER = 2;
    public static final int COLLABORATORS_FIELD_NUMBER = 1;
    private static final SceneTemplate$ArtistCardsContent$BonusCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private SceneTemplate$ArtistCardsContent$TopSongs backTopSongs_;
    private int bitField0_;
    private SceneTemplate$ArtistCardsContent$Collaborators collaborators_;

    static {
        SceneTemplate$ArtistCardsContent$BonusCard sceneTemplate$ArtistCardsContent$BonusCard = new SceneTemplate$ArtistCardsContent$BonusCard();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$BonusCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$BonusCard.class, sceneTemplate$ArtistCardsContent$BonusCard);
    }

    private SceneTemplate$ArtistCardsContent$BonusCard() {
    }

    public static SceneTemplate$ArtistCardsContent$BonusCard p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "collaborators_", "backTopSongs_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$BonusCard();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (SceneTemplate$ArtistCardsContent$BonusCard.class) {
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

    public final SceneTemplate$ArtistCardsContent$TopSongs n() {
        SceneTemplate$ArtistCardsContent$TopSongs sceneTemplate$ArtistCardsContent$TopSongs = this.backTopSongs_;
        return sceneTemplate$ArtistCardsContent$TopSongs == null ? SceneTemplate$ArtistCardsContent$TopSongs.n() : sceneTemplate$ArtistCardsContent$TopSongs;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SceneTemplate$ArtistCardsContent$Collaborators o() {
        SceneTemplate$ArtistCardsContent$Collaborators sceneTemplate$ArtistCardsContent$Collaborators = this.collaborators_;
        return sceneTemplate$ArtistCardsContent$Collaborators == null ? SceneTemplate$ArtistCardsContent$Collaborators.o() : sceneTemplate$ArtistCardsContent$Collaborators;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
