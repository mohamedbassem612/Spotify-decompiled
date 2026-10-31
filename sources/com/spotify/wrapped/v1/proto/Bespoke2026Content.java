package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Bespoke2026Content extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_CARDS_INTRO_FIELD_NUMBER = 15;
    public static final int ARTIST_CARDS_LIST_FIELD_NUMBER = 17;
    public static final int ARTIST_CARDS_REVEAL_FIELD_NUMBER = 16;
    public static final int AUDIOBOOKS_LIST_FIELD_NUMBER = 10;
    public static final int AUDIOBOOKS_YEAR_BOOK_FIELD_NUMBER = 11;
    private static final Bespoke2026Content DEFAULT_INSTANCE;
    public static final int INTRO_LIVE_COUNTER_FIELD_NUMBER = 29;
    public static final int INTRO_TRACK_FIELD_NUMBER = 18;
    public static final int INTRO_WELCOME_MESSAGE_FIELD_NUMBER = 35;
    public static final int INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER = 42;
    public static final int LISTENING_AGE_REVEAL_FIELD_NUMBER = 30;
    public static final int MINUTES_LISTENED_REVEAL_FIELD_NUMBER = 21;
    public static final int OUTRO_WRAP_UP_FIELD_NUMBER = 31;
    private static volatile qzr0 PARSER = null;
    public static final int RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER = 28;
    public static final int TIME_MACHINE_2_FIELD_NUMBER = 40;
    public static final int TOP_ALBUMS_CAROUSEL_FIELD_NUMBER = 2;
    public static final int TOP_ALBUMS_LIST_FIELD_NUMBER = 3;
    public static final int TOP_ALBUMS_SINGLE_FIELD_NUMBER = 23;
    public static final int TOP_FIVE_PODCASTS_FIELD_NUMBER = 20;
    public static final int TOP_FIVE_SONGS_FIELD_NUMBER = 22;
    public static final int TOP_GENRE_LIST_FIELD_NUMBER = 6;
    public static final int TOP_PLAYLISTS_LIST_FIELD_NUMBER = 4;
    public static final int TOP_PLAYLISTS_SINGLE_FIELD_NUMBER = 41;
    public static final int TOP_SONG_JOURNEY_CONTENDERS_FIELD_NUMBER = 13;
    public static final int TOP_SONG_JOURNEY_FRAMING_REVEAL_FIELD_NUMBER = 14;
    public static final int WRAPPED_PLACES_1_FIELD_NUMBER = 32;
    public static final int WRAPPED_PLACES_2_FIELD_NUMBER = 33;
    public static final int WRAPPED_TWIN_GIFT_FIELD_NUMBER = 39;
    public static final int WRAPPED_TWIN_INTRO_FIELD_NUMBER = 36;
    public static final int WRAPPED_TWIN_SEARCHING_FIELD_NUMBER = 37;
    public static final int WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER = 38;
    public static final int YOUR_TOP_SONGS_PLAYLIST_FIELD_NUMBER = 19;
    private int contentCase_ = 0;
    private Object content_;

    static {
        Bespoke2026Content bespoke2026Content = new Bespoke2026Content();
        DEFAULT_INSTANCE = bespoke2026Content;
        com.google.protobuf.h.registerDefaultInstance(Bespoke2026Content.class, bespoke2026Content);
    }

    private Bespoke2026Content() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Bespoke2026Content t() {
        return DEFAULT_INSTANCE;
    }

    public final SceneTemplate.RelationshipStatusContent.Card2 A() {
        return this.contentCase_ == 28 ? (SceneTemplate.RelationshipStatusContent.Card2) this.content_ : SceneTemplate.RelationshipStatusContent.Card2.o();
    }

    public final SceneTemplate$TimeMachineContent$Card2 B() {
        return this.contentCase_ == 40 ? (SceneTemplate$TimeMachineContent$Card2) this.content_ : SceneTemplate$TimeMachineContent$Card2.n();
    }

    public final SceneTemplate$TopAlbumsContent$Carousel C() {
        return this.contentCase_ == 2 ? (SceneTemplate$TopAlbumsContent$Carousel) this.content_ : SceneTemplate$TopAlbumsContent$Carousel.p();
    }

    public final SceneTemplate$TopAlbumsContent$List D() {
        return this.contentCase_ == 3 ? (SceneTemplate$TopAlbumsContent$List) this.content_ : SceneTemplate$TopAlbumsContent$List.p();
    }

    public final SceneTemplate$TopAlbumsContent$Single E() {
        return this.contentCase_ == 23 ? (SceneTemplate$TopAlbumsContent$Single) this.content_ : SceneTemplate$TopAlbumsContent$Single.r();
    }

    public final SceneTemplate$TopFivePodcastsContent$Card1 F() {
        return this.contentCase_ == 20 ? (SceneTemplate$TopFivePodcastsContent$Card1) this.content_ : SceneTemplate$TopFivePodcastsContent$Card1.o();
    }

    public final SceneTemplate$TopFiveSongsContent$Card1 G() {
        return this.contentCase_ == 22 ? (SceneTemplate$TopFiveSongsContent$Card1) this.content_ : SceneTemplate$TopFiveSongsContent$Card1.o();
    }

    public final SceneTemplate$TopGenreContent$Card2 H() {
        return this.contentCase_ == 6 ? (SceneTemplate$TopGenreContent$Card2) this.content_ : SceneTemplate$TopGenreContent$Card2.o();
    }

    public final SceneTemplate$TopPlaylistsContent$List I() {
        return this.contentCase_ == 4 ? (SceneTemplate$TopPlaylistsContent$List) this.content_ : SceneTemplate$TopPlaylistsContent$List.o();
    }

    public final SceneTemplate$TopPlaylistsContent$Single J() {
        return this.contentCase_ == 41 ? (SceneTemplate$TopPlaylistsContent$Single) this.content_ : SceneTemplate$TopPlaylistsContent$Single.q();
    }

    public final SceneTemplate$TopSongJourneyContent$Card2 K() {
        return this.contentCase_ == 13 ? (SceneTemplate$TopSongJourneyContent$Card2) this.content_ : SceneTemplate$TopSongJourneyContent$Card2.o();
    }

    public final SceneTemplate$TopSongJourneyContent$Card3 L() {
        return this.contentCase_ == 14 ? (SceneTemplate$TopSongJourneyContent$Card3) this.content_ : SceneTemplate$TopSongJourneyContent$Card3.n();
    }

    public final SceneTemplate.WrappedPlacesContent.Card1 M() {
        return this.contentCase_ == 32 ? (SceneTemplate.WrappedPlacesContent.Card1) this.content_ : SceneTemplate.WrappedPlacesContent.Card1.o();
    }

    public final SceneTemplate.WrappedPlacesContent.Card2 N() {
        return this.contentCase_ == 33 ? (SceneTemplate.WrappedPlacesContent.Card2) this.content_ : SceneTemplate.WrappedPlacesContent.Card2.o();
    }

    public final SceneTemplate.WrappedTwinContent.GiftCard O() {
        return this.contentCase_ == 39 ? (SceneTemplate.WrappedTwinContent.GiftCard) this.content_ : SceneTemplate.WrappedTwinContent.GiftCard.o();
    }

    public final SceneTemplate.WrappedTwinContent.IntroCard P() {
        return this.contentCase_ == 36 ? (SceneTemplate.WrappedTwinContent.IntroCard) this.content_ : SceneTemplate.WrappedTwinContent.IntroCard.o();
    }

    public final SceneTemplate$WrappedTwinContent$SearchingCard Q() {
        return this.contentCase_ == 37 ? (SceneTemplate$WrappedTwinContent$SearchingCard) this.content_ : SceneTemplate$WrappedTwinContent$SearchingCard.o();
    }

    public final SceneTemplate$WrappedTwinContent$TelepathyCard R() {
        return this.contentCase_ == 38 ? (SceneTemplate$WrappedTwinContent$TelepathyCard) this.content_ : SceneTemplate$WrappedTwinContent$TelepathyCard.o();
    }

    public final SceneTemplate$TopSongsPlaylistContent$Card1 S() {
        return this.contentCase_ == 19 ? (SceneTemplate$TopSongsPlaylistContent$Card1) this.content_ : SceneTemplate$TopSongsPlaylistContent$Card1.n();
    }

    public final boolean T() {
        return this.contentCase_ == 17;
    }

    public final boolean U() {
        return this.contentCase_ == 30;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001f\u0001\u0000\u0002*\u001f\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000(<\u0000)<\u0000*<\u0000", new Object[]{"content_", "contentCase_", SceneTemplate$TopAlbumsContent$Carousel.class, SceneTemplate$TopAlbumsContent$List.class, SceneTemplate$TopPlaylistsContent$List.class, SceneTemplate$TopGenreContent$Card2.class, SceneTemplate$AudiobooksContent$Card2.class, SceneTemplate$AudiobooksContent$Card3.class, SceneTemplate$TopSongJourneyContent$Card2.class, SceneTemplate$TopSongJourneyContent$Card3.class, SceneTemplate$ArtistCardsContent$Card1.class, SceneTemplate$ArtistCardsContent$Card2.class, SceneTemplate$ArtistCardsContent$Card3.class, SceneTemplate$IntroTrackContent$Card1.class, SceneTemplate$TopSongsPlaylistContent$Card1.class, SceneTemplate$TopFivePodcastsContent$Card1.class, SceneTemplate$MinutesListenedContent$Reveal.class, SceneTemplate$TopFiveSongsContent$Card1.class, SceneTemplate$TopAlbumsContent$Single.class, SceneTemplate.RelationshipStatusContent.Card2.class, SceneTemplate$IntroContent$LiveCounterCard.class, SceneTemplate$BespokeListeningAgeContent$Card2.class, SceneTemplate$OutroContent$WrapUpCard.class, SceneTemplate.WrappedPlacesContent.Card1.class, SceneTemplate.WrappedPlacesContent.Card2.class, SceneTemplate$IntroContent$WelcomeMessageCard.class, SceneTemplate.WrappedTwinContent.IntroCard.class, SceneTemplate$WrappedTwinContent$SearchingCard.class, SceneTemplate$WrappedTwinContent$TelepathyCard.class, SceneTemplate.WrappedTwinContent.GiftCard.class, SceneTemplate$TimeMachineContent$Card2.class, SceneTemplate$TopPlaylistsContent$Single.class, SceneTemplate$IntroContent$WelcomeMessageCardV3.class});
        }
        if (iOrdinal == 3) {
            return new Bespoke2026Content();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (Bespoke2026Content.class) {
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

    public final SceneTemplate$ArtistCardsContent$Card1 n() {
        return this.contentCase_ == 15 ? (SceneTemplate$ArtistCardsContent$Card1) this.content_ : SceneTemplate$ArtistCardsContent$Card1.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SceneTemplate$ArtistCardsContent$Card3 o() {
        return this.contentCase_ == 17 ? (SceneTemplate$ArtistCardsContent$Card3) this.content_ : SceneTemplate$ArtistCardsContent$Card3.s();
    }

    public final SceneTemplate$ArtistCardsContent$Card2 p() {
        return this.contentCase_ == 16 ? (SceneTemplate$ArtistCardsContent$Card2) this.content_ : SceneTemplate$ArtistCardsContent$Card2.r();
    }

    public final SceneTemplate$AudiobooksContent$Card2 q() {
        return this.contentCase_ == 10 ? (SceneTemplate$AudiobooksContent$Card2) this.content_ : SceneTemplate$AudiobooksContent$Card2.q();
    }

    public final SceneTemplate$AudiobooksContent$Card3 r() {
        return this.contentCase_ == 11 ? (SceneTemplate$AudiobooksContent$Card3) this.content_ : SceneTemplate$AudiobooksContent$Card3.o();
    }

    public final int s() {
        switch (this.contentCase_) {
            case 0:
                return 32;
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
            case 24:
            case 25:
            case 26:
            case 27:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            default:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 4;
            case 6:
                return 5;
            case 10:
                return 6;
            case 11:
                return 7;
            case 13:
                return 8;
            case 14:
                return 9;
            case 15:
                return 10;
            case 16:
                return 11;
            case 17:
                return 12;
            case 18:
                return 13;
            case 19:
                return 14;
            case 20:
                return 15;
            case 21:
                return 16;
            case 22:
                return 17;
            case 23:
                return 3;
            case RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return 18;
            case 29:
                return 19;
            case 30:
                return 22;
            case 31:
                return 21;
            case WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                return 23;
            case 33:
                return 24;
            case 35:
                return 20;
            case 36:
                return 25;
            case 37:
                return 26;
            case WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                return 27;
            case WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                return 28;
            case TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                return 29;
            case TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                return 30;
            case INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                return 31;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SceneTemplate$IntroContent$LiveCounterCard u() {
        return this.contentCase_ == 29 ? (SceneTemplate$IntroContent$LiveCounterCard) this.content_ : SceneTemplate$IntroContent$LiveCounterCard.n();
    }

    public final SceneTemplate$IntroTrackContent$Card1 v() {
        return this.contentCase_ == 18 ? (SceneTemplate$IntroTrackContent$Card1) this.content_ : SceneTemplate$IntroTrackContent$Card1.p();
    }

    public final SceneTemplate$IntroContent$WelcomeMessageCardV3 w() {
        return this.contentCase_ == 42 ? (SceneTemplate$IntroContent$WelcomeMessageCardV3) this.content_ : SceneTemplate$IntroContent$WelcomeMessageCardV3.n();
    }

    public final SceneTemplate$BespokeListeningAgeContent$Card2 x() {
        return this.contentCase_ == 30 ? (SceneTemplate$BespokeListeningAgeContent$Card2) this.content_ : SceneTemplate$BespokeListeningAgeContent$Card2.p();
    }

    public final SceneTemplate$MinutesListenedContent$Reveal y() {
        return this.contentCase_ == 21 ? (SceneTemplate$MinutesListenedContent$Reveal) this.content_ : SceneTemplate$MinutesListenedContent$Reveal.o();
    }

    public final SceneTemplate$OutroContent$WrapUpCard z() {
        return this.contentCase_ == 31 ? (SceneTemplate$OutroContent$WrapUpCard) this.content_ : SceneTemplate$OutroContent$WrapUpCard.n();
    }
}
