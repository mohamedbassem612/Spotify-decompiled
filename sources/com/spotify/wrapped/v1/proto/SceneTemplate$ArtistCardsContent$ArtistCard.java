package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$ArtistCard extends com.google.protobuf.h implements v2j0 {
    public static final int BACK_BOTTOM_FEATURE_FIELD_NUMBER = 6;
    public static final int BACK_MID_LEFT_STAT_FIELD_NUMBER = 4;
    public static final int BACK_MID_RIGHT_STAT_FIELD_NUMBER = 5;
    public static final int BACK_TOP_LEFT_STAT_FIELD_NUMBER = 2;
    public static final int BACK_TOP_RIGHT_STAT_FIELD_NUMBER = 3;
    private static final SceneTemplate$ArtistCardsContent$ArtistCard DEFAULT_INSTANCE;
    public static final int FRONT_RIGHT_STAT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_ARTIST_PARTICLE_RIVE_ANIMATION_FIELD_NUMBER = 10;
    public static final int TOP_ARTIST_STICKER_BOTTOM_END_FIELD_NUMBER = 9;
    public static final int TOP_ARTIST_STICKER_MIDDLE_START_FIELD_NUMBER = 8;
    public static final int TOP_ARTIST_STICKER_TOP_END_FIELD_NUMBER = 7;
    private SceneTemplate$ArtistCardsContent$TopSong backBottomFeature_;
    private SceneTemplate$ArtistCardsContent$Stat backMidLeftStat_;
    private SceneTemplate$ArtistCardsContent$Stat backMidRightStat_;
    private SceneTemplate$ArtistCardsContent$Stat backTopLeftStat_;
    private SceneTemplate$ArtistCardsContent$Stat backTopRightStat_;
    private int bitField0_;
    private SceneTemplate$ArtistCardsContent$Stat frontRightStat_;
    private RiveAnimation topArtistParticleRiveAnimation_;
    private Image topArtistStickerBottomEnd_;
    private Image topArtistStickerMiddleStart_;
    private Image topArtistStickerTopEnd_;

    static {
        SceneTemplate$ArtistCardsContent$ArtistCard sceneTemplate$ArtistCardsContent$ArtistCard = new SceneTemplate$ArtistCardsContent$ArtistCard();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$ArtistCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$ArtistCard.class, sceneTemplate$ArtistCardsContent$ArtistCard);
    }

    private SceneTemplate$ArtistCardsContent$ArtistCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SceneTemplate$ArtistCardsContent$ArtistCard s() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean B() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 512) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"bitField0_", "frontRightStat_", "backTopLeftStat_", "backTopRightStat_", "backMidLeftStat_", "backMidRightStat_", "backBottomFeature_", "topArtistStickerTopEnd_", "topArtistStickerMiddleStart_", "topArtistStickerBottomEnd_", "topArtistParticleRiveAnimation_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$ArtistCard();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (SceneTemplate$ArtistCardsContent$ArtistCard.class) {
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

    public final SceneTemplate$ArtistCardsContent$TopSong n() {
        SceneTemplate$ArtistCardsContent$TopSong sceneTemplate$ArtistCardsContent$TopSong = this.backBottomFeature_;
        return sceneTemplate$ArtistCardsContent$TopSong == null ? SceneTemplate$ArtistCardsContent$TopSong.o() : sceneTemplate$ArtistCardsContent$TopSong;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SceneTemplate$ArtistCardsContent$Stat o() {
        SceneTemplate$ArtistCardsContent$Stat sceneTemplate$ArtistCardsContent$Stat = this.backMidLeftStat_;
        return sceneTemplate$ArtistCardsContent$Stat == null ? SceneTemplate$ArtistCardsContent$Stat.n() : sceneTemplate$ArtistCardsContent$Stat;
    }

    public final SceneTemplate$ArtistCardsContent$Stat p() {
        SceneTemplate$ArtistCardsContent$Stat sceneTemplate$ArtistCardsContent$Stat = this.backMidRightStat_;
        return sceneTemplate$ArtistCardsContent$Stat == null ? SceneTemplate$ArtistCardsContent$Stat.n() : sceneTemplate$ArtistCardsContent$Stat;
    }

    public final SceneTemplate$ArtistCardsContent$Stat q() {
        SceneTemplate$ArtistCardsContent$Stat sceneTemplate$ArtistCardsContent$Stat = this.backTopLeftStat_;
        return sceneTemplate$ArtistCardsContent$Stat == null ? SceneTemplate$ArtistCardsContent$Stat.n() : sceneTemplate$ArtistCardsContent$Stat;
    }

    public final SceneTemplate$ArtistCardsContent$Stat r() {
        SceneTemplate$ArtistCardsContent$Stat sceneTemplate$ArtistCardsContent$Stat = this.backTopRightStat_;
        return sceneTemplate$ArtistCardsContent$Stat == null ? SceneTemplate$ArtistCardsContent$Stat.n() : sceneTemplate$ArtistCardsContent$Stat;
    }

    public final SceneTemplate$ArtistCardsContent$Stat t() {
        SceneTemplate$ArtistCardsContent$Stat sceneTemplate$ArtistCardsContent$Stat = this.frontRightStat_;
        return sceneTemplate$ArtistCardsContent$Stat == null ? SceneTemplate$ArtistCardsContent$Stat.n() : sceneTemplate$ArtistCardsContent$Stat;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final RiveAnimation u() {
        RiveAnimation riveAnimation = this.topArtistParticleRiveAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Image v() {
        Image image = this.topArtistStickerBottomEnd_;
        return image == null ? Image.o() : image;
    }

    public final Image w() {
        Image image = this.topArtistStickerMiddleStart_;
        return image == null ? Image.o() : image;
    }

    public final Image x() {
        Image image = this.topArtistStickerTopEnd_;
        return image == null ? Image.o() : image;
    }

    public final boolean y() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 8) != 0;
    }
}
