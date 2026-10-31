package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class TilesSection extends h implements v2j0 {
    public static final int ARTISTS_COUNT_TILE_FIELD_NUMBER = 7;
    public static final int ARTISTS_TILE_FIELD_NUMBER = 1;
    private static final TilesSection DEFAULT_INSTANCE;
    public static final int MINUTES_TILE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SOCIAL_ARTISTS_TILE_FIELD_NUMBER = 4;
    public static final int SOCIAL_MINUTES_TILE_FIELD_NUMBER = 3;
    public static final int SOCIAL_TRACKS_TILE_FIELD_NUMBER = 5;
    public static final int SOUND_TOWN_TILE_FIELD_NUMBER = 8;
    public static final int TRACKS_TILE_FIELD_NUMBER = 2;
    private ArtistsCountTile artistsCountTile_;
    private ArtistsTile artistsTile_;
    private int bitField0_;
    private MinutesTile minutesTile_;
    private SocialArtistsTile socialArtistsTile_;
    private SocialMinutesTile socialMinutesTile_;
    private SocialTracksTile socialTracksTile_;
    private SoundTownTile soundTownTile_;
    private TracksTile tracksTile_;

    static {
        TilesSection tilesSection = new TilesSection();
        DEFAULT_INSTANCE = tilesSection;
        h.registerDefaultInstance(TilesSection.class, tilesSection);
    }

    private TilesSection() {
    }

    public static TilesSection p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final boolean A() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean B() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 2) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"bitField0_", "artistsTile_", "tracksTile_", "socialMinutesTile_", "socialArtistsTile_", "socialTracksTile_", "minutesTile_", "artistsCountTile_", "soundTownTile_"});
        }
        if (iOrdinal == 3) {
            return new TilesSection();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (TilesSection.class) {
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

    public final ArtistsCountTile n() {
        ArtistsCountTile artistsCountTile = this.artistsCountTile_;
        return artistsCountTile == null ? ArtistsCountTile.o() : artistsCountTile;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ArtistsTile o() {
        ArtistsTile artistsTile = this.artistsTile_;
        return artistsTile == null ? ArtistsTile.o() : artistsTile;
    }

    public final MinutesTile q() {
        MinutesTile minutesTile = this.minutesTile_;
        return minutesTile == null ? MinutesTile.o() : minutesTile;
    }

    public final SocialArtistsTile r() {
        SocialArtistsTile socialArtistsTile = this.socialArtistsTile_;
        return socialArtistsTile == null ? SocialArtistsTile.o() : socialArtistsTile;
    }

    public final SocialMinutesTile s() {
        SocialMinutesTile socialMinutesTile = this.socialMinutesTile_;
        return socialMinutesTile == null ? SocialMinutesTile.o() : socialMinutesTile;
    }

    public final SocialTracksTile t() {
        SocialTracksTile socialTracksTile = this.socialTracksTile_;
        return socialTracksTile == null ? SocialTracksTile.o() : socialTracksTile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SoundTownTile u() {
        SoundTownTile soundTownTile = this.soundTownTile_;
        return soundTownTile == null ? SoundTownTile.o() : soundTownTile;
    }

    public final TracksTile v() {
        TracksTile tracksTile = this.tracksTile_;
        return tracksTile == null ? TracksTile.o() : tracksTile;
    }

    public final boolean w() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 8) != 0;
    }
}
