package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class FreeAchievementCardStory extends h implements v2j0 {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int BLUR_COLOR_FIELD_NUMBER = 14;
    public static final int CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int CARD_DATE_TITLE_FIELD_NUMBER = 11;
    public static final int CARD_FRAME_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int CARD_HEADER_FIELD_NUMBER = 9;
    public static final int CARD_MAIN_IMAGE_URL_FIELD_NUMBER = 5;
    public static final int CARD_TITLE_FIELD_NUMBER = 10;
    public static final int DEFAULT_CARD_IMAGE_URL_FIELD_NUMBER = 16;
    private static final FreeAchievementCardStory DEFAULT_INSTANCE;
    public static final int LOCK_IMAGE_URL_FIELD_NUMBER = 15;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_LABEL_FIELD_NUMBER = 12;
    public static final int STORY_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int STORY_DESCRIPTION_FIELD_NUMBER = 8;
    public static final int STORY_SUBTITLE_FIELD_NUMBER = 7;
    public static final int STORY_TITLE_FIELD_NUMBER = 6;
    public static final int UPSELL_BUTTON_FIELD_NUMBER = 13;
    private BaseStory base_;
    private int bitField0_;
    private Text cardDateTitle_;
    private Text cardHeader_;
    private Text cardTitle_;
    private Text storyDescription_;
    private Text storySubtitle_;
    private Text storyTitle_;
    private LinkButton upsellButton_;
    private String storyBackgroundImageUrl_ = "";
    private String cardFrameBackgroundImageUrl_ = "";
    private String cardBackgroundImageUrl_ = "";
    private String cardMainImageUrl_ = "";
    private String premiumLabel_ = "";
    private String blurColor_ = "";
    private String lockImageUrl_ = "";
    private String defaultCardImageUrl_ = "";

    static {
        FreeAchievementCardStory freeAchievementCardStory = new FreeAchievementCardStory();
        DEFAULT_INSTANCE = freeAchievementCardStory;
        h.registerDefaultInstance(FreeAchievementCardStory.class, freeAchievementCardStory);
    }

    private FreeAchievementCardStory() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static FreeAchievementCardStory w() {
        return DEFAULT_INSTANCE;
    }

    public final Text A() {
        Text text = this.storyDescription_;
        return text == null ? Text.n() : text;
    }

    public final Text B() {
        Text text = this.storySubtitle_;
        return text == null ? Text.n() : text;
    }

    public final Text C() {
        Text text = this.storyTitle_;
        return text == null ? Text.n() : text;
    }

    public final LinkButton D() {
        LinkButton linkButton = this.upsellButton_;
        return linkButton == null ? LinkButton.o() : linkButton;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fȈ\rဉ\u0007\u000eȈ\u000fȈ\u0010Ȉ", new Object[]{"bitField0_", "base_", "storyBackgroundImageUrl_", "cardFrameBackgroundImageUrl_", "cardBackgroundImageUrl_", "cardMainImageUrl_", "storyTitle_", "storySubtitle_", "storyDescription_", "cardHeader_", "cardTitle_", "cardDateTitle_", "premiumLabel_", "upsellButton_", "blurColor_", "lockImageUrl_", "defaultCardImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new FreeAchievementCardStory();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (FreeAchievementCardStory.class) {
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

    public final BaseStory n() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.r() : baseStory;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.blurColor_;
    }

    public final String p() {
        return this.cardBackgroundImageUrl_;
    }

    public final Text q() {
        Text text = this.cardDateTitle_;
        return text == null ? Text.n() : text;
    }

    public final String r() {
        return this.cardFrameBackgroundImageUrl_;
    }

    public final Text s() {
        Text text = this.cardHeader_;
        return text == null ? Text.n() : text;
    }

    public final String t() {
        return this.cardMainImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Text u() {
        Text text = this.cardTitle_;
        return text == null ? Text.n() : text;
    }

    public final String v() {
        return this.defaultCardImageUrl_;
    }

    public final String x() {
        return this.lockImageUrl_;
    }

    public final String y() {
        return this.premiumLabel_;
    }

    public final String z() {
        return this.storyBackgroundImageUrl_;
    }
}
