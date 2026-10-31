package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopSongJourneyContent$Card2 extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_OVERRIDE_FIELD_NUMBER = 6;
    private static final SceneTemplate$TopSongJourneyContent$Card2 DEFAULT_INSTANCE;
    public static final int GRID_ANIMATION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PAUSE_BUTTON_ACCESSIBILITY_FIELD_NUMBER = 4;
    public static final int PLAY_BUTTON_ACCESSIBILITY_FIELD_NUMBER = 3;
    public static final int REPLAY_BUTTON_ACCESSIBILITY_FIELD_NUMBER = 5;
    public static final int SONGS_FIELD_NUMBER = 1;
    private AudioPreview audioOverride_;
    private int bitField0_;
    private RiveAnimation gridAnimation_;
    private AccessibilityDefinition pauseButtonAccessibility_;
    private AccessibilityDefinition playButtonAccessibility_;
    private AccessibilityDefinition replayButtonAccessibility_;
    private h290 songs_ = com.google.protobuf.h.emptyProtobufList();

    static {
        SceneTemplate$TopSongJourneyContent$Card2 sceneTemplate$TopSongJourneyContent$Card2 = new SceneTemplate$TopSongJourneyContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$TopSongJourneyContent$Card2;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopSongJourneyContent$Card2.class, sceneTemplate$TopSongJourneyContent$Card2);
    }

    private SceneTemplate$TopSongJourneyContent$Card2() {
    }

    public static SceneTemplate$TopSongJourneyContent$Card2 o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "songs_", SceneTemplate$TopSongJourneyContent$SongEntry.class, "gridAnimation_", "playButtonAccessibility_", "pauseButtonAccessibility_", "replayButtonAccessibility_", "audioOverride_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopSongJourneyContent$Card2();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (SceneTemplate$TopSongJourneyContent$Card2.class) {
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

    public final AudioPreview n() {
        AudioPreview audioPreview = this.audioOverride_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation p() {
        RiveAnimation riveAnimation = this.gridAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final h290 q() {
        return this.songs_;
    }

    public final boolean r() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
