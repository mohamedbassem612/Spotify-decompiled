package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GameResultsPageElements extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_ANIMATION_URL_FIELD_NUMBER = 11;
    public static final int BACKGROUND_AUDIO_FIELD_NUMBER = 14;
    public static final int CLOSE_BUTTON_ACCESSIBILITY_LABEL_FIELD_NUMBER = 19;
    public static final int CORRECT_ANSWER_COUNT_ACCESSIBILITY_LABEL_FIELD_NUMBER = 17;
    public static final int CORRECT_STRING_FIELD_NUMBER = 9;
    private static final GameResultsPageElements DEFAULT_INSTANCE;
    public static final int DESTINATION_URL_FIELD_NUMBER = 13;
    public static final int FOOTER_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LOGO_URL_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_CTA_REDIRECT_FIELD_NUMBER = 7;
    public static final int PLAYLIST_CTA_TEXT_FIELD_NUMBER = 6;
    public static final int PLAY_TIME_ACCESSIBILITY_LABEL_FIELD_NUMBER = 18;
    public static final int SCORE_DESCRIPTOR_FIELD_NUMBER = 12;
    public static final int SHARE_CARD_URL_FIELD_NUMBER = 4;
    public static final int SHARE_CTA_TEXT_FIELD_NUMBER = 3;
    public static final int SHARE_MESSAGE_FIELD_NUMBER = 5;
    public static final int SHARE_PREVIEW_DESCRIPTION_FIELD_NUMBER = 21;
    public static final int SHARE_PREVIEW_TITLE_FIELD_NUMBER = 20;
    public static final int STATS_HIGHLIGHT_STRING_FIELD_NUMBER = 15;
    public static final int TIME_STRING_FIELD_NUMBER = 10;
    public static final int USER_SCORE_ACCESSIBILITY_LABEL_FIELD_NUMBER = 16;
    private String header_ = "";
    private String footer_ = "";
    private String shareCtaText_ = "";
    private String shareCardUrl_ = "";
    private String shareMessage_ = "";
    private String playlistCtaText_ = "";
    private String playlistCtaRedirect_ = "";
    private String logoUrl_ = "";
    private String correctString_ = "";
    private String timeString_ = "";
    private String backgroundAnimationUrl_ = "";
    private String scoreDescriptor_ = "";
    private String destinationUrl_ = "";
    private String backgroundAudio_ = "";
    private String statsHighlightString_ = "";
    private String userScoreAccessibilityLabel_ = "";
    private String correctAnswerCountAccessibilityLabel_ = "";
    private String playTimeAccessibilityLabel_ = "";
    private String closeButtonAccessibilityLabel_ = "";
    private String sharePreviewTitle_ = "";
    private String sharePreviewDescription_ = "";

    static {
        GameResultsPageElements gameResultsPageElements = new GameResultsPageElements();
        DEFAULT_INSTANCE = gameResultsPageElements;
        com.google.protobuf.h.registerDefaultInstance(GameResultsPageElements.class, gameResultsPageElements);
    }

    private GameResultsPageElements() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static GameResultsPageElements q() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.shareMessage_;
    }

    public final String B() {
        return this.sharePreviewDescription_;
    }

    public final String C() {
        return this.sharePreviewTitle_;
    }

    public final String D() {
        return this.statsHighlightString_;
    }

    public final String E() {
        return this.timeString_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0015\u0015\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ", new Object[]{"header_", "footer_", "shareCtaText_", "shareCardUrl_", "shareMessage_", "playlistCtaText_", "playlistCtaRedirect_", "logoUrl_", "correctString_", "timeString_", "backgroundAnimationUrl_", "scoreDescriptor_", "destinationUrl_", "backgroundAudio_", "statsHighlightString_", "userScoreAccessibilityLabel_", "correctAnswerCountAccessibilityLabel_", "playTimeAccessibilityLabel_", "closeButtonAccessibilityLabel_", "sharePreviewTitle_", "sharePreviewDescription_"});
        }
        if (iOrdinal == 3) {
            return new GameResultsPageElements();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (GameResultsPageElements.class) {
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
        return this.backgroundAnimationUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundAudio_;
    }

    public final String p() {
        return this.correctString_;
    }

    public final String r() {
        return this.destinationUrl_;
    }

    public final String s() {
        return this.footer_;
    }

    public final String t() {
        return this.header_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.logoUrl_;
    }

    public final String v() {
        return this.playlistCtaRedirect_;
    }

    public final String w() {
        return this.playlistCtaText_;
    }

    public final String x() {
        return this.scoreDescriptor_;
    }

    public final String y() {
        return this.shareCardUrl_;
    }

    public final String z() {
        return this.shareCtaText_;
    }
}
