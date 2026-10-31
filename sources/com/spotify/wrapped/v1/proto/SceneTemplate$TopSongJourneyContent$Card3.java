package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopSongJourneyContent$Card3 extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_OVERRIDE_FIELD_NUMBER = 6;
    private static final SceneTemplate$TopSongJourneyContent$Card3 DEFAULT_INSTANCE;
    public static final int GRID_ANIMATION_FIELD_NUMBER = 2;
    public static final int HAS_REVEAL_HAPTIC_FEEDBACK_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PREAMBLE_FIELD_NUMBER = 1;
    public static final int REVEAL_TITLE_FIELD_NUMBER = 5;
    public static final int SHARE_BUTTON_FIELD_NUMBER = 4;
    public static final int SONG_FIELD_NUMBER = 3;
    private AudioPreview audioOverride_;
    private int bitField0_;
    private RiveAnimation gridAnimation_;
    private boolean hasRevealHapticFeedback_;
    private Paragraph preamble_;
    private Paragraph revealTitle_;
    private ButtonConfiguration shareButton_;
    private SceneTemplate$TopSongJourneyContent$SongEntry song_;

    static {
        SceneTemplate$TopSongJourneyContent$Card3 sceneTemplate$TopSongJourneyContent$Card3 = new SceneTemplate$TopSongJourneyContent$Card3();
        DEFAULT_INSTANCE = sceneTemplate$TopSongJourneyContent$Card3;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopSongJourneyContent$Card3.class, sceneTemplate$TopSongJourneyContent$Card3);
    }

    private SceneTemplate$TopSongJourneyContent$Card3() {
    }

    public static SceneTemplate$TopSongJourneyContent$Card3 n() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u0007", new Object[]{"bitField0_", "preamble_", "gridAnimation_", "song_", "shareButton_", "revealTitle_", "audioOverride_", "hasRevealHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopSongJourneyContent$Card3();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (SceneTemplate$TopSongJourneyContent$Card3.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation o() {
        RiveAnimation riveAnimation = this.gridAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.revealTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final SceneTemplate$TopSongJourneyContent$SongEntry q() {
        SceneTemplate$TopSongJourneyContent$SongEntry sceneTemplate$TopSongJourneyContent$SongEntry = this.song_;
        return sceneTemplate$TopSongJourneyContent$SongEntry == null ? SceneTemplate$TopSongJourneyContent$SongEntry.p() : sceneTemplate$TopSongJourneyContent$SongEntry;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
