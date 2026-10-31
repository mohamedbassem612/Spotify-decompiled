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
public final class SceneTemplate$ArtistCardsContent$Card3 extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_CARDS_FIELD_NUMBER = 2;
    public static final int ARTIST_IMAGE_BORDER_FIELD_NUMBER = 7;
    public static final int ARTIST_LIST_FIELD_NUMBER = 3;
    public static final int AUDIO_OVERRIDE_FIELD_NUMBER = 9;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 5;
    private static final SceneTemplate$ArtistCardsContent$Card3 DEFAULT_INSTANCE;
    public static final int FLIP_CARD_ACCESSIBILITY_HINT_FIELD_NUMBER = 12;
    public static final int HAS_INTERACTION_HAPTIC_FEEDBACK_FIELD_NUMBER = 13;
    public static final int NOISE_IMAGE_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_BUTTON_FIELD_NUMBER = 4;
    public static final int SPARKLE_IMAGE_FIELD_NUMBER = 11;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TOP_LIST_BACKGROUND_FIELD_NUMBER = 6;
    public static final int WRAPPED_LOGO_FIELD_NUMBER = 8;
    private Image artistImageBorder_;
    private AudioPreview audioOverride_;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private boolean hasInteractionHapticFeedback_;
    private Image noiseImage_;
    private ButtonConfiguration shareButton_;
    private Image sparkleImage_;
    private Paragraph title_;
    private RiveAnimation topListBackground_;
    private Image wrappedLogo_;
    private h290 artistCards_ = com.google.protobuf.h.emptyProtobufList();
    private h290 artistList_ = com.google.protobuf.h.emptyProtobufList();
    private String flipCardAccessibilityHint_ = "";

    static {
        SceneTemplate$ArtistCardsContent$Card3 sceneTemplate$ArtistCardsContent$Card3 = new SceneTemplate$ArtistCardsContent$Card3();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$Card3;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$Card3.class, sceneTemplate$ArtistCardsContent$Card3);
    }

    private SceneTemplate$ArtistCardsContent$Card3() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SceneTemplate$ArtistCardsContent$Card3 s() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean B() {
        return (this.bitField0_ & 256) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fȈ\r\u0007", new Object[]{"bitField0_", "title_", "artistCards_", SceneTemplate$ArtistCardsContent$TradingCard.class, "artistList_", SceneTemplate$ArtistCardsContent$ArtistListItem.class, "shareButton_", "backgroundAnimation_", "topListBackground_", "artistImageBorder_", "wrappedLogo_", "audioOverride_", "noiseImage_", "sparkleImage_", "flipCardAccessibilityHint_", "hasInteractionHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$Card3();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (SceneTemplate$ArtistCardsContent$Card3.class) {
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

    public final h290 p() {
        return this.artistList_;
    }

    public final AudioPreview q() {
        AudioPreview audioPreview = this.audioOverride_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final RiveAnimation r() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final String t() {
        return this.flipCardAccessibilityHint_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.hasInteractionHapticFeedback_;
    }

    public final Image v() {
        Image image = this.noiseImage_;
        return image == null ? Image.o() : image;
    }

    public final Image w() {
        Image image = this.sparkleImage_;
        return image == null ? Image.o() : image;
    }

    public final Paragraph x() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final RiveAnimation y() {
        RiveAnimation riveAnimation = this.topListBackground_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Image z() {
        Image image = this.wrappedLogo_;
        return image == null ? Image.o() : image;
    }
}
