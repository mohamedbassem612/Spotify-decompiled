package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListeningPartyCardStory extends h implements v2j0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 5;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 15;
    public static final int CARD_MAIN_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int CARD_SECONDARY_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int COLLECTIBLE_TITLE_FIELD_NUMBER = 6;
    public static final int DATE_FIELD_NUMBER = 8;
    private static final ListeningPartyCardStory DEFAULT_INSTANCE;
    public static final int DETAILS_SUBTITLE_FIELD_NUMBER = 9;
    public static final int DETAILS_TITLE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_LABEL_FIELD_NUMBER = 11;
    public static final int SHARE_DATA_FIELD_NUMBER = 13;
    public static final int SHARE_LABEL_FIELD_NUMBER = 12;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int VIP_IMAGE_URL_FIELD_NUMBER = 14;
    private Text artistName_;
    private BaseStory base_;
    private int bitField0_;
    private Text collectibleTitle_;
    private Text date_;
    private Text detailsSubtitle_;
    private Text detailsTitle_;
    private ShareData shareData_;
    private Text shareLabel_;
    private Text title_;
    private String cardMainImageUrl_ = "";
    private String backgroundImageUrl_ = "";
    private String cardSecondaryImageUrl_ = "";
    private String premiumLabel_ = "";
    private String vipImageUrl_ = "";
    private String cardBackgroundImageUrl_ = "";

    static {
        ListeningPartyCardStory listeningPartyCardStory = new ListeningPartyCardStory();
        DEFAULT_INSTANCE = listeningPartyCardStory;
        h.registerDefaultInstance(ListeningPartyCardStory.class, listeningPartyCardStory);
    }

    private ListeningPartyCardStory() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ListeningPartyCardStory v() {
        return DEFAULT_INSTANCE;
    }

    public final Text A() {
        Text text = this.shareLabel_;
        return text == null ? Text.n() : text;
    }

    public final Text B() {
        Text text = this.title_;
        return text == null ? Text.n() : text;
    }

    public final String C() {
        return this.vipImageUrl_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nȈ\u000bȈ\fဉ\u0007\rဉ\b\u000eȈ\u000fȈ", new Object[]{"bitField0_", "base_", "cardMainImageUrl_", "backgroundImageUrl_", "title_", "artistName_", "collectibleTitle_", "detailsTitle_", "date_", "detailsSubtitle_", "cardSecondaryImageUrl_", "premiumLabel_", "shareLabel_", "shareData_", "vipImageUrl_", "cardBackgroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyCardStory();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (ListeningPartyCardStory.class) {
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
        Text text = this.artistName_;
        return text == null ? Text.n() : text;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundImageUrl_;
    }

    public final BaseStory p() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.r() : baseStory;
    }

    public final String q() {
        return this.cardBackgroundImageUrl_;
    }

    public final String r() {
        return this.cardMainImageUrl_;
    }

    public final String s() {
        return this.cardSecondaryImageUrl_;
    }

    public final Text t() {
        Text text = this.collectibleTitle_;
        return text == null ? Text.n() : text;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Text u() {
        Text text = this.date_;
        return text == null ? Text.n() : text;
    }

    public final Text w() {
        Text text = this.detailsSubtitle_;
        return text == null ? Text.n() : text;
    }

    public final Text x() {
        Text text = this.detailsTitle_;
        return text == null ? Text.n() : text;
    }

    public final String y() {
        return this.premiumLabel_;
    }

    public final ShareData z() {
        ShareData shareData = this.shareData_;
        return shareData == null ? ShareData.n() : shareData;
    }
}
