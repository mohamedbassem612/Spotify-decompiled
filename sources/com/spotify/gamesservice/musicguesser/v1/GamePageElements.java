package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GamePageElements extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int CLOSE_GAME_CTA_ACCESSIBILITY_LABEL_FIELD_NUMBER = 9;
    public static final int CONTINUE_CTA_TEXT_FIELD_NUMBER = 1;
    public static final int CORRECT_ANSWER_TEXT_FIELD_NUMBER = 5;
    public static final int COUNTDOWN_AUDIO_URL_FIELD_NUMBER = 7;
    public static final int CURRENT_SCORE_ACCESSIBILITY_LABEL_FIELD_NUMBER = 8;
    private static final GamePageElements DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int ROUND_COUNT_ACCESSIBILITY_LABEL_FIELD_NUMBER = 10;
    public static final int SCORE_BACKGROUND_ANIMATION_URLS_FIELD_NUMBER = 3;
    public static final int SCORE_DESCRIPTORS_FIELD_NUMBER = 4;
    public static final int START_ANIMATION_URL_FIELD_NUMBER = 6;
    private String continueCtaText_ = "";
    private String backgroundImageUrl_ = "";
    private h290 scoreBackgroundAnimationUrls_ = com.google.protobuf.h.emptyProtobufList();
    private h290 scoreDescriptors_ = com.google.protobuf.h.emptyProtobufList();
    private String correctAnswerText_ = "";
    private String startAnimationUrl_ = "";
    private String countdownAudioUrl_ = "";
    private String currentScoreAccessibilityLabel_ = "";
    private String closeGameCtaAccessibilityLabel_ = "";
    private h290 roundCountAccessibilityLabel_ = com.google.protobuf.h.emptyProtobufList();

    static {
        GamePageElements gamePageElements = new GamePageElements();
        DEFAULT_INSTANCE = gamePageElements;
        com.google.protobuf.h.registerDefaultInstance(GamePageElements.class, gamePageElements);
    }

    private GamePageElements() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static GamePageElements r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȚ", new Object[]{"continueCtaText_", "backgroundImageUrl_", "scoreBackgroundAnimationUrls_", ScoreThresholdMap.class, "scoreDescriptors_", ScoreThresholdMap.class, "correctAnswerText_", "startAnimationUrl_", "countdownAudioUrl_", "currentScoreAccessibilityLabel_", "closeGameCtaAccessibilityLabel_", "roundCountAccessibilityLabel_"});
        }
        if (iOrdinal == 3) {
            return new GamePageElements();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (GamePageElements.class) {
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
        return this.backgroundImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.continueCtaText_;
    }

    public final String p() {
        return this.correctAnswerText_;
    }

    public final String q() {
        return this.countdownAudioUrl_;
    }

    public final h290 s() {
        return this.scoreBackgroundAnimationUrls_;
    }

    public final h290 t() {
        return this.scoreDescriptors_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.startAnimationUrl_;
    }
}
