package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.fd21;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Section extends h implements v2j0 {
    public static final int ACTION_CARD_CAROUSEL_FIELD_NUMBER = 15;
    public static final int ANCHORS_FIELD_NUMBER = 7;
    public static final int ASSOCIATED_PREVIEW_FIELD_NUMBER = 27;
    public static final int AUDIO_PROMO_FIELD_NUMBER = 33;
    public static final int AUDIO_SPOTLIGHT_FIELD_NUMBER = 36;
    public static final int BANNER_FIELD_NUMBER = 19;
    public static final int BANNER_WITH_ANIMATIONS_FIELD_NUMBER = 28;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 9;
    public static final int CAMPAIGN_LINK_CAROUSEL_FIELD_NUMBER = 23;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 38;
    public static final int CONTENT_EVALUATION_LIST_FIELD_NUMBER = 8;
    private static final Section DEFAULT_INSTANCE;
    public static final int FULL_BLEED_BANNER_FIELD_NUMBER = 26;
    public static final int IMAGE_BRAND_AD_FIELD_NUMBER = 21;
    public static final int IMAGE_LINK_FIELD_NUMBER = 3;
    public static final int IMMERSIVE_PREVIEW_FIELD_NUMBER = 6;
    public static final int INLINE_CARD_FIELD_NUMBER = 34;
    public static final int INTERACTIVE_ENTRYPOINT_FIELD_NUMBER = 30;
    public static final int LIVE_EVENT_FIELD_NUMBER = 16;
    public static final int NARRATIVE_FIELD_NUMBER = 29;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_LINK_PROMO_FIELD_NUMBER = 35;
    public static final int PODCAST_HERO_CAROUSEL_FIELD_NUMBER = 43;
    public static final int PRERELEASE_PREVIEW_FIELD_NUMBER = 44;
    public static final int PREVIEW_CAROUSEL_FIELD_NUMBER = 37;
    public static final int PREVIEW_FIELD_NUMBER = 4;
    public static final int PREVIEW_PROMOTION_CAROUSEL_FIELD_NUMBER = 39;
    public static final int PROMOTION_V1_FIELD_NUMBER = 12;
    public static final int PROMOTION_V3_FIELD_NUMBER = 13;
    public static final int PROMPTABLE_SECTION_FIELD_NUMBER = 32;
    public static final int PROMPTED_WORLDS_SHELF_FIELD_NUMBER = 40;
    public static final int RECENTS_SHELF_FIELD_NUMBER = 10;
    public static final int REFLECTION_FIELD_NUMBER = 41;
    public static final int SECTION_INFO_FIELD_NUMBER = 1;
    public static final int SHORTCUTS_FIELD_NUMBER = 2;
    public static final int SHOWCASE_FIELD_NUMBER = 17;
    public static final int TOP_STORY_CAROUSEL_FIELD_NUMBER = 31;
    public static final int TOP_STORY_FEED_CARD_FIELD_NUMBER = 45;
    public static final int USER_PROMPTED_WORLD_ENTRYPOINT_FIELD_NUMBER = 42;
    public static final int VERTICAL_SINGLE_ENTRY_FIELD_NUMBER = 24;
    public static final int VIDEO_BRAND_AD_FIELD_NUMBER = 20;
    public static final int VIDEO_CAROUSEL_FIELD_NUMBER = 25;
    public static final int VIDEO_PROMO_FIELD_NUMBER = 18;
    public static final int WATCH_FEED_FIELD_NUMBER = 11;
    private int bitField0_;
    private int featureTypeCase_ = 0;
    private Object featureType_;
    private SectionInfo sectionInfo_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
    }

    public static Section f0(phc phcVar) {
        return (Section) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final FullBleedBanner A() {
        return this.featureTypeCase_ == 26 ? (FullBleedBanner) this.featureType_ : FullBleedBanner.q();
    }

    public final ImageBrandAd B() {
        return this.featureTypeCase_ == 21 ? (ImageBrandAd) this.featureType_ : ImageBrandAd.q();
    }

    public final ImageLink C() {
        return this.featureTypeCase_ == 3 ? (ImageLink) this.featureType_ : ImageLink.p();
    }

    public final ImmersivePreview D() {
        return this.featureTypeCase_ == 6 ? (ImmersivePreview) this.featureType_ : ImmersivePreview.o();
    }

    public final InlineCard E() {
        return this.featureTypeCase_ == 34 ? (InlineCard) this.featureType_ : InlineCard.o();
    }

    public final InteractiveEntrypoint F() {
        return this.featureTypeCase_ == 30 ? (InteractiveEntrypoint) this.featureType_ : InteractiveEntrypoint.o();
    }

    public final LiveEvent G() {
        return this.featureTypeCase_ == 16 ? (LiveEvent) this.featureType_ : LiveEvent.o();
    }

    public final Narrative H() {
        return this.featureTypeCase_ == 29 ? (Narrative) this.featureType_ : Narrative.o();
    }

    public final PlayLinkPromo I() {
        return this.featureTypeCase_ == 35 ? (PlayLinkPromo) this.featureType_ : PlayLinkPromo.p();
    }

    public final PodcastHeroCarousel J() {
        return this.featureTypeCase_ == 43 ? (PodcastHeroCarousel) this.featureType_ : PodcastHeroCarousel.n();
    }

    public final PrereleasePreview K() {
        return this.featureTypeCase_ == 44 ? (PrereleasePreview) this.featureType_ : PrereleasePreview.n();
    }

    public final Preview L() {
        return this.featureTypeCase_ == 4 ? (Preview) this.featureType_ : Preview.o();
    }

    public final PreviewCarousel M() {
        return this.featureTypeCase_ == 37 ? (PreviewCarousel) this.featureType_ : PreviewCarousel.o();
    }

    public final PreviewPromotionCarousel N() {
        return this.featureTypeCase_ == 39 ? (PreviewPromotionCarousel) this.featureType_ : PreviewPromotionCarousel.p();
    }

    public final PromotionV1 O() {
        return this.featureTypeCase_ == 12 ? (PromotionV1) this.featureType_ : PromotionV1.p();
    }

    public final PromotionV3 P() {
        return this.featureTypeCase_ == 13 ? (PromotionV3) this.featureType_ : PromotionV3.p();
    }

    public final PromptableSection Q() {
        return this.featureTypeCase_ == 32 ? (PromptableSection) this.featureType_ : PromptableSection.o();
    }

    public final PromptedWorldsShelf R() {
        return this.featureTypeCase_ == 40 ? (PromptedWorldsShelf) this.featureType_ : PromptedWorldsShelf.o();
    }

    public final RecentsShelf S() {
        return this.featureTypeCase_ == 10 ? (RecentsShelf) this.featureType_ : RecentsShelf.o();
    }

    public final Reflection T() {
        return this.featureTypeCase_ == 41 ? (Reflection) this.featureType_ : Reflection.o();
    }

    public final SectionInfo U() {
        SectionInfo sectionInfo = this.sectionInfo_;
        return sectionInfo == null ? SectionInfo.o() : sectionInfo;
    }

    public final Shortcuts V() {
        return this.featureTypeCase_ == 2 ? (Shortcuts) this.featureType_ : Shortcuts.o();
    }

    public final Showcase W() {
        return this.featureTypeCase_ == 17 ? (Showcase) this.featureType_ : Showcase.q();
    }

    public final TopStoryCarousel X() {
        return this.featureTypeCase_ == 31 ? (TopStoryCarousel) this.featureType_ : TopStoryCarousel.o();
    }

    public final TopStoryFeedCard Y() {
        return this.featureTypeCase_ == 45 ? (TopStoryFeedCard) this.featureType_ : TopStoryFeedCard.o();
    }

    public final UserPromptedWorldEntrypoint Z() {
        return this.featureTypeCase_ == 42 ? (UserPromptedWorldEntrypoint) this.featureType_ : UserPromptedWorldEntrypoint.n();
    }

    public final VerticalSingleEntry a0() {
        return this.featureTypeCase_ == 24 ? (VerticalSingleEntry) this.featureType_ : VerticalSingleEntry.p();
    }

    public final VideoBrandAd b0() {
        return this.featureTypeCase_ == 20 ? (VideoBrandAd) this.featureType_ : VideoBrandAd.q();
    }

    public final VideoCarousel c0() {
        return this.featureTypeCase_ == 25 ? (VideoCarousel) this.featureType_ : VideoCarousel.o();
    }

    public final VideoPromo d0() {
        return this.featureTypeCase_ == 18 ? (VideoPromo) this.featureType_ : VideoPromo.p();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000*\u0001\u0001\u0001-*\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000(<\u0000)<\u0000*<\u0000+<\u0000,<\u0000-<\u0000", new Object[]{"featureType_", "featureTypeCase_", "bitField0_", "sectionInfo_", Shortcuts.class, ImageLink.class, Preview.class, ImmersivePreview.class, Anchors.class, ContentEvaluationList.class, CallToAction.class, RecentsShelf.class, WatchFeed.class, PromotionV1.class, PromotionV3.class, ActionCardCarousel.class, LiveEvent.class, Showcase.class, VideoPromo.class, Banner.class, VideoBrandAd.class, ImageBrandAd.class, CampaignLinkCarousel.class, VerticalSingleEntry.class, VideoCarousel.class, FullBleedBanner.class, AssociatedPreview.class, BannerWithAnimations.class, Narrative.class, InteractiveEntrypoint.class, TopStoryCarousel.class, PromptableSection.class, AudioPromo.class, InlineCard.class, PlayLinkPromo.class, AudioSpotlight.class, PreviewCarousel.class, ConcertCampaign.class, PreviewPromotionCarousel.class, PromptedWorldsShelf.class, Reflection.class, UserPromptedWorldEntrypoint.class, PodcastHeroCarousel.class, PrereleasePreview.class, TopStoryFeedCard.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451();
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

    public final WatchFeed e0() {
        return this.featureTypeCase_ == 11 ? (WatchFeed) this.featureType_ : WatchFeed.o();
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ActionCardCarousel o() {
        return this.featureTypeCase_ == 15 ? (ActionCardCarousel) this.featureType_ : ActionCardCarousel.o();
    }

    public final Anchors p() {
        return this.featureTypeCase_ == 7 ? (Anchors) this.featureType_ : Anchors.o();
    }

    public final AssociatedPreview q() {
        return this.featureTypeCase_ == 27 ? (AssociatedPreview) this.featureType_ : AssociatedPreview.o();
    }

    public final AudioPromo r() {
        return this.featureTypeCase_ == 33 ? (AudioPromo) this.featureType_ : AudioPromo.p();
    }

    public final AudioSpotlight s() {
        return this.featureTypeCase_ == 36 ? (AudioSpotlight) this.featureType_ : AudioSpotlight.p();
    }

    public final Banner t() {
        return this.featureTypeCase_ == 19 ? (Banner) this.featureType_ : Banner.p();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final BannerWithAnimations u() {
        return this.featureTypeCase_ == 28 ? (BannerWithAnimations) this.featureType_ : BannerWithAnimations.p();
    }

    public final CallToAction v() {
        return this.featureTypeCase_ == 9 ? (CallToAction) this.featureType_ : CallToAction.o();
    }

    public final CampaignLinkCarousel w() {
        return this.featureTypeCase_ == 23 ? (CampaignLinkCarousel) this.featureType_ : CampaignLinkCarousel.p();
    }

    public final ConcertCampaign x() {
        return this.featureTypeCase_ == 38 ? (ConcertCampaign) this.featureType_ : ConcertCampaign.p();
    }

    public final ContentEvaluationList y() {
        return this.featureTypeCase_ == 8 ? (ContentEvaluationList) this.featureType_ : ContentEvaluationList.o();
    }

    public final int z() {
        return fd21.a(this.featureTypeCase_);
    }
}
