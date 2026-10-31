package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import p.bf40;
import p.bf51;
import p.if51;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Section extends h implements v2j0 {
    public static final int AI_DUBBING_FIELD_NUMBER = 18;
    public static final int ALBUM_INFO_FIELD_NUMBER = 37;
    public static final int BYOM_SCROLL_CARD_FIELD_NUMBER = 39;
    public static final int CHAPTERS_FIELD_NUMBER = 16;
    public static final int COMMENTS_FIELD_NUMBER = 1;
    public static final int COMPANION_CONTENT_FIELD_NUMBER = 19;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 31;
    public static final int CONTENT_STORY_FIELD_NUMBER = 25;
    public static final int CREATOR_BIO_FIELD_NUMBER = 2;
    public static final int CREDITS_FIELD_NUMBER = 4;
    public static final int CULTURAL_MOMENTS_FIELD_NUMBER = 8;
    private static final Section DEFAULT_INSTANCE;
    public static final int DISCOVERY_FEED_FIELD_NUMBER = 3;
    public static final int EPISODE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int EXTRAS_FIELD_NUMBER = 17;
    public static final int E_READER_FIELD_NUMBER = 35;
    public static final int FRY_FIELD_NUMBER = 41;
    public static final int GATED_CONTENT_FIELD_NUMBER = 22;
    public static final int IMAGE_BRAND_AD_FIELD_NUMBER = 30;
    public static final int KALLAXDETAILS_FIELD_NUMBER = 29;
    public static final int LEAVEBEHINDS_FIELD_NUMBER = 36;
    public static final int LISTENING_PARTY_FIELD_NUMBER = 13;
    public static final int LIVE_EVENTS_FIELD_NUMBER = 11;
    public static final int LIVE_UPSELL_FIELD_NUMBER = 15;
    public static final int LPM_SHELF_FIELD_NUMBER = 38;
    public static final int LYRICS_FIELD_NUMBER = 5;
    public static final int MARTINI_ENTRY_POINT_FIELD_NUMBER = 32;
    public static final int MERCH_FIELD_NUMBER = 6;
    public static final int NOTES_FIELD_NUMBER = 33;
    private static volatile qzr0 PARSER = null;
    public static final int POLLS_FIELD_NUMBER = 21;
    public static final int PRE_RELEASE_FIELD_NUMBER = 12;
    public static final int QUEUE_FIELD_NUMBER = 34;
    public static final int QUIZ_FIELD_NUMBER = 28;
    public static final int RELATED_CONTENT_FIELD_NUMBER = 26;
    public static final int SECTION_INFO_FIELD_NUMBER = 23;
    public static final int SHOW_DESCRIPTION_FIELD_NUMBER = 9;
    public static final int SMART_SHUFFLE_FIELD_NUMBER = 7;
    public static final int SONG_DNA_FIELD_NUMBER = 27;
    public static final int TRANSCRIPT_FIELD_NUMBER = 20;
    public static final int UNMAPPED_RELATED_AUDIO_FIELD_NUMBER = 24;
    public static final int VIDEO_CAROUSEL_FIELD_NUMBER = 14;
    private int bitField0_;
    private SectionInfo sectionInfo_;
    private int sectionTypeCase_ = 0;
    private Object sectionType_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static bf51 t0() {
        return (bf51) DEFAULT_INSTANCE.createBuilder();
    }

    public final LiveEvents A() {
        return this.sectionTypeCase_ == 11 ? (LiveEvents) this.sectionType_ : LiveEvents.o();
    }

    public final void A0(EpisodeDescription episodeDescription) {
        episodeDescription.getClass();
        this.sectionType_ = episodeDescription;
        this.sectionTypeCase_ = 10;
    }

    public final LiveUpsell B() {
        return this.sectionTypeCase_ == 15 ? (LiveUpsell) this.sectionType_ : LiveUpsell.n();
    }

    public final void B0(GatedContent gatedContent) {
        gatedContent.getClass();
        this.sectionType_ = gatedContent;
        this.sectionTypeCase_ = 22;
    }

    public final LpmShelf C() {
        return this.sectionTypeCase_ == 38 ? (LpmShelf) this.sectionType_ : LpmShelf.n();
    }

    public final void C0(ListeningParty listeningParty) {
        listeningParty.getClass();
        this.sectionType_ = listeningParty;
        this.sectionTypeCase_ = 13;
    }

    public final MartiniEntryPoint D() {
        return this.sectionTypeCase_ == 32 ? (MartiniEntryPoint) this.sectionType_ : MartiniEntryPoint.n();
    }

    public final void D0(LiveEvents liveEvents) {
        liveEvents.getClass();
        this.sectionType_ = liveEvents;
        this.sectionTypeCase_ = 11;
    }

    public final Merch E() {
        return this.sectionTypeCase_ == 6 ? (Merch) this.sectionType_ : Merch.n();
    }

    public final void E0(Lyrics lyrics) {
        lyrics.getClass();
        this.sectionType_ = lyrics;
        this.sectionTypeCase_ = 5;
    }

    public final Notes F() {
        return this.sectionTypeCase_ == 33 ? (Notes) this.sectionType_ : Notes.n();
    }

    public final void F0(Merch merch) {
        merch.getClass();
        this.sectionType_ = merch;
        this.sectionTypeCase_ = 6;
    }

    public final PreRelease G() {
        return this.sectionTypeCase_ == 12 ? (PreRelease) this.sectionType_ : PreRelease.n();
    }

    public final void G0(Polls polls) {
        polls.getClass();
        this.sectionType_ = polls;
        this.sectionTypeCase_ = 21;
    }

    public final Quiz H() {
        return this.sectionTypeCase_ == 28 ? (Quiz) this.sectionType_ : Quiz.p();
    }

    public final void H0(ShowDescription showDescription) {
        showDescription.getClass();
        this.sectionType_ = showDescription;
        this.sectionTypeCase_ = 9;
    }

    public final RelatedContent I() {
        return this.sectionTypeCase_ == 26 ? (RelatedContent) this.sectionType_ : RelatedContent.n();
    }

    public final void I0(SmartShuffle smartShuffle) {
        smartShuffle.getClass();
        this.sectionType_ = smartShuffle;
        this.sectionTypeCase_ = 7;
    }

    public final SectionInfo J() {
        SectionInfo sectionInfo = this.sectionInfo_;
        return sectionInfo == null ? SectionInfo.n() : sectionInfo;
    }

    public final void J0(Transcript transcript) {
        transcript.getClass();
        this.sectionType_ = transcript;
        this.sectionTypeCase_ = 20;
    }

    public final if51 K() {
        switch (this.sectionTypeCase_) {
            case 0:
                return if51.n1;
            case 1:
                return if51.a;
            case 2:
                return if51.b;
            case 3:
                return if51.c;
            case 4:
                return if51.d;
            case 5:
                return if51.e;
            case 6:
                return if51.f;
            case 7:
                return if51.g;
            case 8:
                return if51.h;
            case 9:
                return if51.i;
            case 10:
                return if51.t;
            case 11:
                return if51.X;
            case 12:
                return if51.Y;
            case 13:
                return if51.Z;
            case 14:
                return if51.N0;
            case 15:
                return if51.O0;
            case 16:
                return if51.P0;
            case 17:
                return if51.Q0;
            case 18:
                return if51.R0;
            case 19:
                return if51.S0;
            case 20:
                return if51.T0;
            case 21:
                return if51.U0;
            case 22:
                return if51.V0;
            case 23:
            case StreamStartRequestOuterClass$StreamStartRequest.CLIENT_TIMESTAMP_FIELD_NUMBER /* 40 */:
            default:
                return null;
            case 24:
                return if51.W0;
            case 25:
                return if51.X0;
            case 26:
                return if51.Y0;
            case SONG_DNA_FIELD_NUMBER /* 27 */:
                return if51.Z0;
            case 28:
                return if51.a1;
            case 29:
                return if51.b1;
            case 30:
                return if51.c1;
            case 31:
                return if51.d1;
            case 32:
                return if51.e1;
            case 33:
                return if51.f1;
            case 34:
                return if51.g1;
            case E_READER_FIELD_NUMBER /* 35 */:
                return if51.h1;
            case 36:
                return if51.i1;
            case 37:
                return if51.j1;
            case 38:
                return if51.k1;
            case 39:
                return if51.l1;
            case 41:
                return if51.m1;
        }
    }

    public final ShowDescription L() {
        return this.sectionTypeCase_ == 9 ? (ShowDescription) this.sectionType_ : ShowDescription.n();
    }

    public final SongDNA M() {
        return this.sectionTypeCase_ == 27 ? (SongDNA) this.sectionType_ : SongDNA.n();
    }

    public final Transcript N() {
        return this.sectionTypeCase_ == 20 ? (Transcript) this.sectionType_ : Transcript.n();
    }

    public final UnmappedRelatedAudio O() {
        return this.sectionTypeCase_ == 24 ? (UnmappedRelatedAudio) this.sectionType_ : UnmappedRelatedAudio.n();
    }

    public final VideoCarousel P() {
        return this.sectionTypeCase_ == 14 ? (VideoCarousel) this.sectionType_ : VideoCarousel.n();
    }

    public final boolean Q() {
        return this.sectionTypeCase_ == 39;
    }

    public final boolean R() {
        return this.sectionTypeCase_ == 16;
    }

    public final boolean S() {
        return this.sectionTypeCase_ == 31;
    }

    public final boolean T() {
        return this.sectionTypeCase_ == 25;
    }

    public final boolean U() {
        return this.sectionTypeCase_ == 2;
    }

    public final boolean V() {
        return this.sectionTypeCase_ == 4;
    }

    public final boolean W() {
        return this.sectionTypeCase_ == 8;
    }

    public final boolean X() {
        return this.sectionTypeCase_ == 3;
    }

    public final boolean Y() {
        return this.sectionTypeCase_ == 35;
    }

    public final boolean Z() {
        return this.sectionTypeCase_ == 10;
    }

    public final boolean a0() {
        return this.sectionTypeCase_ == 41;
    }

    public final boolean b0() {
        return this.sectionTypeCase_ == 30;
    }

    public final boolean c0() {
        return this.sectionTypeCase_ == 36;
    }

    public final boolean d0() {
        return this.sectionTypeCase_ == 11;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000(\u0001\u0001\u0001)(\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017ဉ\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000)<\u0000", new Object[]{"sectionType_", "sectionTypeCase_", "bitField0_", Comments.class, CreatorBio.class, DiscoveryFeed.class, Credits.class, Lyrics.class, Merch.class, SmartShuffle.class, CulturalMoments.class, ShowDescription.class, EpisodeDescription.class, LiveEvents.class, PreRelease.class, ListeningParty.class, VideoCarousel.class, LiveUpsell.class, Chapters.class, Extras.class, AIDubbing.class, CompanionContent.class, Transcript.class, Polls.class, GatedContent.class, "sectionInfo_", UnmappedRelatedAudio.class, ContentStory.class, RelatedContent.class, SongDNA.class, Quiz.class, KallaxDetails.class, ImageBrandAd.class, ConcertCampaign.class, MartiniEntryPoint.class, Notes.class, Queue.class, EReader.class, Leavebehinds.class, AlbumInfo.class, LpmShelf.class, BYOMScrollCard.class, Fry.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new bf51(DEFAULT_INSTANCE);
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
        synchronized (Section.class) {
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

    public final boolean e0() {
        return this.sectionTypeCase_ == 15;
    }

    public final boolean f0() {
        return this.sectionTypeCase_ == 38;
    }

    public final boolean g0() {
        return this.sectionTypeCase_ == 32;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean h0() {
        return this.sectionTypeCase_ == 6;
    }

    public final boolean i0() {
        return this.sectionTypeCase_ == 33;
    }

    public final boolean j0() {
        return this.sectionTypeCase_ == 12;
    }

    public final boolean k0() {
        return this.sectionTypeCase_ == 34;
    }

    public final boolean l0() {
        return this.sectionTypeCase_ == 28;
    }

    public final boolean m0() {
        return this.sectionTypeCase_ == 26;
    }

    public final BYOMScrollCard n() {
        return this.sectionTypeCase_ == 39 ? (BYOMScrollCard) this.sectionType_ : BYOMScrollCard.n();
    }

    public final boolean n0() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Chapters o() {
        return this.sectionTypeCase_ == 16 ? (Chapters) this.sectionType_ : Chapters.o();
    }

    public final boolean o0() {
        return this.sectionTypeCase_ == 9;
    }

    public final ConcertCampaign p() {
        return this.sectionTypeCase_ == 31 ? (ConcertCampaign) this.sectionType_ : ConcertCampaign.o();
    }

    public final boolean p0() {
        return this.sectionTypeCase_ == 27;
    }

    public final ContentStory q() {
        return this.sectionTypeCase_ == 25 ? (ContentStory) this.sectionType_ : ContentStory.n();
    }

    public final boolean q0() {
        return this.sectionTypeCase_ == 20;
    }

    public final CreatorBio r() {
        return this.sectionTypeCase_ == 2 ? (CreatorBio) this.sectionType_ : CreatorBio.o();
    }

    public final boolean r0() {
        return this.sectionTypeCase_ == 24;
    }

    public final Credits s() {
        return this.sectionTypeCase_ == 4 ? (Credits) this.sectionType_ : Credits.p();
    }

    public final boolean s0() {
        return this.sectionTypeCase_ == 14;
    }

    public final CulturalMoments t() {
        return this.sectionTypeCase_ == 8 ? (CulturalMoments) this.sectionType_ : CulturalMoments.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final DiscoveryFeed u() {
        return this.sectionTypeCase_ == 3 ? (DiscoveryFeed) this.sectionType_ : DiscoveryFeed.n();
    }

    public final void u0(Chapters chapters) {
        chapters.getClass();
        this.sectionType_ = chapters;
        this.sectionTypeCase_ = 16;
    }

    public final EReader v() {
        return this.sectionTypeCase_ == 35 ? (EReader) this.sectionType_ : EReader.n();
    }

    public final void v0(Comments comments) {
        comments.getClass();
        this.sectionType_ = comments;
        this.sectionTypeCase_ = 1;
    }

    public final EpisodeDescription w() {
        return this.sectionTypeCase_ == 10 ? (EpisodeDescription) this.sectionType_ : EpisodeDescription.n();
    }

    public final void w0(CompanionContent companionContent) {
        companionContent.getClass();
        this.sectionType_ = companionContent;
        this.sectionTypeCase_ = 19;
    }

    public final Fry x() {
        return this.sectionTypeCase_ == 41 ? (Fry) this.sectionType_ : Fry.o();
    }

    public final void x0(CreatorBio creatorBio) {
        creatorBio.getClass();
        this.sectionType_ = creatorBio;
        this.sectionTypeCase_ = 2;
    }

    public final ImageBrandAd y() {
        return this.sectionTypeCase_ == 30 ? (ImageBrandAd) this.sectionType_ : ImageBrandAd.p();
    }

    public final void y0(Credits credits) {
        credits.getClass();
        this.sectionType_ = credits;
        this.sectionTypeCase_ = 4;
    }

    public final Leavebehinds z() {
        return this.sectionTypeCase_ == 36 ? (Leavebehinds) this.sectionType_ : Leavebehinds.n();
    }

    public final void z0(CulturalMoments culturalMoments) {
        culturalMoments.getClass();
        this.sectionType_ = culturalMoments;
        this.sectionTypeCase_ = 8;
    }
}
