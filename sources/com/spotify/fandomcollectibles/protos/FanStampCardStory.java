package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.fs00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class FanStampCardStory extends h implements v2j0 {
    public static final int ACHIEVED_DATE_FIELD_NUMBER = 9;
    public static final int BACK_CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 16;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int CATEGORY_TITLE_FIELD_NUMBER = 8;
    public static final int COLLECTIBLE_NAME_FIELD_NUMBER = 7;
    private static final FanStampCardStory DEFAULT_INSTANCE;
    public static final int ENTITY_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int ENTITY_SUBTITLE_FIELD_NUMBER = 12;
    public static final int ENTITY_TITLE_FIELD_NUMBER = 11;
    public static final int FRONT_CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_DATA_FIELD_NUMBER = 14;
    public static final int SPOTIFY_LOGO_COLOR_FIELD_NUMBER = 18;
    public static final int STORY_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int STORY_TITLE_FIELD_NUMBER = 13;
    private Text achievedDate_;
    private BaseStory base_;
    private int bitField0_;
    private Text categoryTitle_;
    private Text collectibleName_;
    private Text entitySubtitle_;
    private Text entityTitle_;
    private ShareData shareData_;
    private Text storyTitle_;
    private String storyBackgroundImageUrl_ = "";
    private String frontCardBackgroundImageUrl_ = "";
    private String entityImageUrl_ = "";
    private String backCardBackgroundImageUrl_ = "";
    private String spotifyLogoColor_ = "";

    static {
        FanStampCardStory fanStampCardStory = new FanStampCardStory();
        DEFAULT_INSTANCE = fanStampCardStory;
        h.registerDefaultInstance(FanStampCardStory.class, fanStampCardStory);
    }

    private FanStampCardStory() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static FanStampCardStory s() {
        return DEFAULT_INSTANCE;
    }

    public final Text A() {
        Text text = this.storyTitle_;
        return text == null ? Text.n() : text;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u0012\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0007ဉ\u0001\bဉ\u0002\tဉ\u0003\nȈ\u000bဉ\u0004\fဉ\u0005\rဉ\u0006\u000eဉ\u0007\u0010Ȉ\u0012Ȉ", new Object[]{"bitField0_", "base_", "storyBackgroundImageUrl_", "frontCardBackgroundImageUrl_", "collectibleName_", "categoryTitle_", "achievedDate_", "entityImageUrl_", "entityTitle_", "entitySubtitle_", "storyTitle_", "shareData_", "backCardBackgroundImageUrl_", "spotifyLogoColor_"});
        }
        if (iOrdinal == 3) {
            return new FanStampCardStory();
        }
        if (iOrdinal == 4) {
            return new fs00(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (FanStampCardStory.class) {
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

    public final Text n() {
        Text text = this.achievedDate_;
        return text == null ? Text.n() : text;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backCardBackgroundImageUrl_;
    }

    public final BaseStory p() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.r() : baseStory;
    }

    public final Text q() {
        Text text = this.categoryTitle_;
        return text == null ? Text.n() : text;
    }

    public final Text r() {
        Text text = this.collectibleName_;
        return text == null ? Text.n() : text;
    }

    public final String t() {
        return this.entityImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Text u() {
        Text text = this.entitySubtitle_;
        return text == null ? Text.n() : text;
    }

    public final Text v() {
        Text text = this.entityTitle_;
        return text == null ? Text.n() : text;
    }

    public final String w() {
        return this.frontCardBackgroundImageUrl_;
    }

    public final ShareData x() {
        ShareData shareData = this.shareData_;
        return shareData == null ? ShareData.n() : shareData;
    }

    public final String y() {
        return this.spotifyLogoColor_;
    }

    public final String z() {
        return this.storyBackgroundImageUrl_;
    }
}
