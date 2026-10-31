package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.kjh0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MediaAchievementCardStory extends h implements v2j0 {
    public static final int ACHIEVEMENT_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 9;
    public static final int ACHIEVEMENT_CONTENT_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int ACHIEVEMENT_DATE_FIELD_NUMBER = 19;
    public static final int ACHIEVEMENT_DATE_TITLE_FIELD_NUMBER = 18;
    public static final int ACHIEVEMENT_HEADER_FIELD_NUMBER = 14;
    public static final int ACHIEVEMENT_MAIN_IMAGE_URL_FIELD_NUMBER = 11;
    public static final int ACHIEVEMENT_PRIMARY_TITLE_FIELD_NUMBER = 17;
    public static final int ACHIEVEMENT_SECONDARY_TITLE_FIELD_NUMBER = 16;
    public static final int ACHIEVEMENT_STORY_TITLE_FIELD_NUMBER = 13;
    public static final int ACHIEVEMENT_TERTIARY_TITLE_FIELD_NUMBER = 15;
    public static final int BASE_FIELD_NUMBER = 1;
    private static final MediaAchievementCardStory DEFAULT_INSTANCE;
    public static final int MEDIA_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int MEDIA_CANVAS_URL_FIELD_NUMBER = 7;
    public static final int MEDIA_MAIN_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int MEDIA_MEDIA_TYPE_FIELD_NUMBER = 8;
    public static final int MEDIA_SUBTITLE_FIELD_NUMBER = 5;
    public static final int MEDIA_TITLE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_LABEL_FIELD_NUMBER = 20;
    public static final int SHARE_DATA_FIELD_NUMBER = 21;
    public static final int STORY_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    private Text achievementDateTitle_;
    private Text achievementDate_;
    private Text achievementHeader_;
    private Text achievementPrimaryTitle_;
    private Text achievementSecondaryTitle_;
    private Text achievementStoryTitle_;
    private Text achievementTertiaryTitle_;
    private BaseStory base_;
    private int bitField0_;
    private int mediaMediaType_;
    private Text mediaSubtitle_;
    private Text mediaTitle_;
    private ShareData shareData_;
    private String storyBackgroundImageUrl_ = "";
    private String mediaBackgroundImageUrl_ = "";
    private String mediaMainImageUrl_ = "";
    private String mediaCanvasUrl_ = "";
    private String achievementBackgroundImageUrl_ = "";
    private String achievementContentBackgroundImageUrl_ = "";
    private String achievementMainImageUrl_ = "";
    private String premiumLabel_ = "";

    static {
        MediaAchievementCardStory mediaAchievementCardStory = new MediaAchievementCardStory();
        DEFAULT_INSTANCE = mediaAchievementCardStory;
        h.registerDefaultInstance(MediaAchievementCardStory.class, mediaAchievementCardStory);
    }

    private MediaAchievementCardStory() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static MediaAchievementCardStory y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.mediaCanvasUrl_;
    }

    public final String B() {
        return this.mediaMainImageUrl_;
    }

    public final kjh0 C() {
        kjh0 kjh0Var;
        int i = this.mediaMediaType_;
        if (i == 0) {
            kjh0Var = kjh0.MEDIA_CARD_MEDIA_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            kjh0Var = i != 2 ? null : kjh0.CANVAS;
        } else {
            kjh0Var = kjh0.IMAGE;
        }
        return kjh0Var == null ? kjh0.UNRECOGNIZED : kjh0Var;
    }

    public final Text D() {
        Text text = this.mediaSubtitle_;
        return text == null ? Text.n() : text;
    }

    public final Text E() {
        Text text = this.mediaTitle_;
        return text == null ? Text.n() : text;
    }

    public final String F() {
        return this.premiumLabel_;
    }

    public final ShareData G() {
        ShareData shareData = this.shareData_;
        return shareData == null ? ShareData.n() : shareData;
    }

    public final String H() {
        return this.storyBackgroundImageUrl_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002\u0006Ȉ\u0007Ȉ\b\f\tȈ\nȈ\u000bȈ\rဉ\u0003\u000eဉ\u0004\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014Ȉ\u0015ဉ\n", new Object[]{"bitField0_", "base_", "storyBackgroundImageUrl_", "mediaBackgroundImageUrl_", "mediaTitle_", "mediaSubtitle_", "mediaMainImageUrl_", "mediaCanvasUrl_", "mediaMediaType_", "achievementBackgroundImageUrl_", "achievementContentBackgroundImageUrl_", "achievementMainImageUrl_", "achievementStoryTitle_", "achievementHeader_", "achievementTertiaryTitle_", "achievementSecondaryTitle_", "achievementPrimaryTitle_", "achievementDateTitle_", "achievementDate_", "premiumLabel_", "shareData_"});
        }
        if (iOrdinal == 3) {
            return new MediaAchievementCardStory();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (MediaAchievementCardStory.class) {
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
        return this.achievementBackgroundImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.achievementContentBackgroundImageUrl_;
    }

    public final Text p() {
        Text text = this.achievementDate_;
        return text == null ? Text.n() : text;
    }

    public final Text q() {
        Text text = this.achievementDateTitle_;
        return text == null ? Text.n() : text;
    }

    public final Text r() {
        Text text = this.achievementHeader_;
        return text == null ? Text.n() : text;
    }

    public final String s() {
        return this.achievementMainImageUrl_;
    }

    public final Text t() {
        Text text = this.achievementPrimaryTitle_;
        return text == null ? Text.n() : text;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Text u() {
        Text text = this.achievementSecondaryTitle_;
        return text == null ? Text.n() : text;
    }

    public final Text v() {
        Text text = this.achievementStoryTitle_;
        return text == null ? Text.n() : text;
    }

    public final Text w() {
        Text text = this.achievementTertiaryTitle_;
        return text == null ? Text.n() : text;
    }

    public final BaseStory x() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.r() : baseStory;
    }

    public final String z() {
        return this.mediaBackgroundImageUrl_;
    }
}
