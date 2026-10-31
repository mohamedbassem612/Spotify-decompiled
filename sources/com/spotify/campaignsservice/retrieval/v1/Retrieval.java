package com.spotify.campaignsservice.retrieval.v1;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.AccessibilityDefinition;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Retrieval extends h implements v2j0 {
    public static final int AUDIO_PREVIEW_URL_FIELD_NUMBER = 2;
    public static final int CARDS_FIELD_NUMBER = 1;
    public static final int COMPLETED_PROGRESS_TITLES_FIELD_NUMBER = 4;
    private static final Retrieval DEFAULT_INSTANCE;
    public static final int FULLY_VIEWED_HERO_CARD_NAVIGATION_ID_FIELD_NUMBER = 10;
    public static final int IN_PROGRESS_TITLES_FIELD_NUMBER = 3;
    public static final int MUTE_BUTTON_ACCESSIBILITY_DEFINITION_FIELD_NUMBER = 7;
    public static final int OTHER_STORIES_BASELINE_TEXT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REPLAY_BUTTON_ACCESSIBILITY_DEFINITION_FIELD_NUMBER = 9;
    public static final int REPLAY_BUTTON_TITLE_FIELD_NUMBER = 6;
    public static final int UNMUTE_BUTTON_ACCESSIBILITY_DEFINITION_FIELD_NUMBER = 8;
    private int bitField0_;
    private HeroTitles completedProgressTitles_;
    private HeroTitles inProgressTitles_;
    private AccessibilityDefinition muteButtonAccessibilityDefinition_;
    private AccessibilityDefinition replayButtonAccessibilityDefinition_;
    private AccessibilityDefinition unmuteButtonAccessibilityDefinition_;
    private h290 cards_ = h.emptyProtobufList();
    private String audioPreviewUrl_ = "";
    private String otherStoriesBaselineText_ = "";
    private String replayButtonTitle_ = "";
    private String fullyViewedHeroCardNavigationId_ = "";

    static {
        Retrieval retrieval = new Retrieval();
        DEFAULT_INSTANCE = retrieval;
        h.registerDefaultInstance(Retrieval.class, retrieval);
    }

    private Retrieval() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nȈ", new Object[]{"bitField0_", "cards_", RetrievalCard.class, "audioPreviewUrl_", "inProgressTitles_", "completedProgressTitles_", "otherStoriesBaselineText_", "replayButtonTitle_", "muteButtonAccessibilityDefinition_", "unmuteButtonAccessibilityDefinition_", "replayButtonAccessibilityDefinition_", "fullyViewedHeroCardNavigationId_"});
        }
        if (iOrdinal == 3) {
            return new Retrieval();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (Retrieval.class) {
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

    public final String n() {
        return this.audioPreviewUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.cards_;
    }

    public final HeroTitles p() {
        HeroTitles heroTitles = this.completedProgressTitles_;
        return heroTitles == null ? HeroTitles.o() : heroTitles;
    }

    public final String q() {
        return this.fullyViewedHeroCardNavigationId_;
    }

    public final HeroTitles r() {
        HeroTitles heroTitles = this.inProgressTitles_;
        return heroTitles == null ? HeroTitles.o() : heroTitles;
    }

    public final AccessibilityDefinition s() {
        AccessibilityDefinition accessibilityDefinition = this.muteButtonAccessibilityDefinition_;
        return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
    }

    public final String t() {
        return this.otherStoriesBaselineText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final AccessibilityDefinition u() {
        AccessibilityDefinition accessibilityDefinition = this.replayButtonAccessibilityDefinition_;
        return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
    }

    public final String v() {
        return this.replayButtonTitle_;
    }

    public final AccessibilityDefinition w() {
        AccessibilityDefinition accessibilityDefinition = this.unmuteButtonAccessibilityDefinition_;
        return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
    }
}
