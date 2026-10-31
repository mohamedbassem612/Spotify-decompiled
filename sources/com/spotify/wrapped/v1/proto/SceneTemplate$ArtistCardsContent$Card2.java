package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$Card2 extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_CARDS_FIELD_NUMBER = 3;
    public static final int ARTIST_IMAGE_BORDER_FIELD_NUMBER = 13;
    public static final int AUDIO_OVERRIDE_FIELD_NUMBER = 15;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 6;
    private static final SceneTemplate$ArtistCardsContent$Card2 DEFAULT_INSTANCE;
    public static final int FLIP_CARD_ACCESSIBILITY_HINT_FIELD_NUMBER = 19;
    public static final int HAS_INTERACTION_HAPTIC_FEEDBACK_FIELD_NUMBER = 21;
    public static final int HAS_REVEAL_HAPTIC_FEEDBACK_FIELD_NUMBER = 22;
    public static final int NEXT_CARD_ACCESSIBILITY_ACTION_NAME_FIELD_NUMBER = 20;
    public static final int NOISE_IMAGE_FIELD_NUMBER = 16;
    public static final int OPEN_PACK_ACCESSIBILITY_HINT_FIELD_NUMBER = 18;
    public static final int OPEN_PACK_HINT_FIELD_NUMBER = 1;
    public static final int OPEN_PACK_HINT_SUBTITLE_FIELD_NUMBER = 2;
    public static final int PACK_OPENING_LIGHT_FIELD_NUMBER = 11;
    public static final int PACK_WRAPPER_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REVEAL_BODY_FIELD_NUMBER = 8;
    public static final int REVEAL_TITLE_FIELD_NUMBER = 7;
    public static final int SHARE_BUTTON_FIELD_NUMBER = 5;
    public static final int SPARKLE_IMAGE_FIELD_NUMBER = 17;
    public static final int SWIPE_HINT_FIELD_NUMBER = 10;
    public static final int TAP_HINT_FIELD_NUMBER = 9;
    public static final int WRAPPED_LOGO_FIELD_NUMBER = 14;
    public static final int WRAPPER_ACCESSIBILITY_TITLE_FIELD_NUMBER = 12;
    private Image artistImageBorder_;
    private AudioPreview audioOverride_;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private boolean hasInteractionHapticFeedback_;
    private boolean hasRevealHapticFeedback_;
    private Image noiseImage_;
    private Paragraph openPackHintSubtitle_;
    private Paragraph openPackHint_;
    private Image packOpeningLight_;
    private SceneTemplate$ArtistCardsContent$Wrapper packWrapper_;
    private Paragraph revealBody_;
    private Paragraph revealTitle_;
    private ButtonConfiguration shareButton_;
    private Image sparkleImage_;
    private Paragraph swipeHint_;
    private Paragraph tapHint_;
    private Image wrappedLogo_;
    private h290 artistCards_ = com.google.protobuf.h.emptyProtobufList();
    private String wrapperAccessibilityTitle_ = "";
    private String openPackAccessibilityHint_ = "";
    private String flipCardAccessibilityHint_ = "";
    private String nextCardAccessibilityActionName_ = "";

    static {
        SceneTemplate$ArtistCardsContent$Card2 sceneTemplate$ArtistCardsContent$Card2 = new SceneTemplate$ArtistCardsContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$Card2;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$Card2.class, sceneTemplate$ArtistCardsContent$Card2);
    }

    private SceneTemplate$ArtistCardsContent$Card2() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SceneTemplate$ArtistCardsContent$Card2 r() {
        return DEFAULT_INSTANCE;
    }

    public final Image A() {
        Image image = this.packOpeningLight_;
        return image == null ? Image.o() : image;
    }

    public final SceneTemplate$ArtistCardsContent$Wrapper B() {
        SceneTemplate$ArtistCardsContent$Wrapper sceneTemplate$ArtistCardsContent$Wrapper = this.packWrapper_;
        return sceneTemplate$ArtistCardsContent$Wrapper == null ? SceneTemplate$ArtistCardsContent$Wrapper.o() : sceneTemplate$ArtistCardsContent$Wrapper;
    }

    public final Paragraph C() {
        Paragraph paragraph = this.revealBody_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph D() {
        Paragraph paragraph = this.revealTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Image E() {
        Image image = this.sparkleImage_;
        return image == null ? Image.o() : image;
    }

    public final Paragraph F() {
        Paragraph paragraph = this.swipeHint_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph G() {
        Paragraph paragraph = this.tapHint_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Image H() {
        Image image = this.wrappedLogo_;
        return image == null ? Image.o() : image;
    }

    public final String I() {
        return this.wrapperAccessibilityTitle_;
    }

    public final boolean J() {
        return (this.bitField0_ & 512) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean M() {
        return (this.bitField0_ & 16384) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fȈ\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015\u0007\u0016\u0007", new Object[]{"bitField0_", "openPackHint_", "openPackHintSubtitle_", "artistCards_", SceneTemplate$ArtistCardsContent$TradingCard.class, "packWrapper_", "shareButton_", "backgroundAnimation_", "revealTitle_", "revealBody_", "tapHint_", "swipeHint_", "packOpeningLight_", "wrapperAccessibilityTitle_", "artistImageBorder_", "wrappedLogo_", "audioOverride_", "noiseImage_", "sparkleImage_", "openPackAccessibilityHint_", "flipCardAccessibilityHint_", "nextCardAccessibilityActionName_", "hasInteractionHapticFeedback_", "hasRevealHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$Card2();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (SceneTemplate$ArtistCardsContent$Card2.class) {
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

    public final h290 n() {
        return this.artistCards_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Image o() {
        Image image = this.artistImageBorder_;
        return image == null ? Image.o() : image;
    }

    public final AudioPreview p() {
        AudioPreview audioPreview = this.audioOverride_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final RiveAnimation q() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final String s() {
        return this.flipCardAccessibilityHint_;
    }

    public final boolean t() {
        return this.hasInteractionHapticFeedback_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.hasRevealHapticFeedback_;
    }

    public final String v() {
        return this.nextCardAccessibilityActionName_;
    }

    public final Image w() {
        Image image = this.noiseImage_;
        return image == null ? Image.o() : image;
    }

    public final String x() {
        return this.openPackAccessibilityHint_;
    }

    public final Paragraph y() {
        Paragraph paragraph = this.openPackHint_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph z() {
        Paragraph paragraph = this.openPackHintSubtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }
}
