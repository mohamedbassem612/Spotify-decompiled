package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uth0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MediaPlaybackInitializationStart extends com.google.protobuf.h implements v2j0 {
    public static final int BATTERY_FIELD_NUMBER = 23;
    public static final int BITRATE_FIELD_NUMBER = 13;
    public static final int CREATED_TIME_FIELD_NUMBER = 19;
    private static final MediaPlaybackInitializationStart DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int IS_AUDIO_ONLY_FIELD_NUMBER = 15;
    public static final int IS_BACKGROUNDED_FIELD_NUMBER = 25;
    public static final int IS_PLAYING_FIELD_NUMBER = 7;
    public static final int IS_POWER_SAVER_ACTIVE_FIELD_NUMBER = 24;
    public static final int IS_VIDEO_DISABLED_FIELD_NUMBER = 26;
    public static final int MEDIA_DURATION_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 22;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    public static final int NETWORK_STATE_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_DESTINATION_FIELD_NUMBER = 14;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYBACK_ORCHESTRATION_FIELD_NUMBER = 28;
    public static final int PLAYER_POSITION_FIELD_NUMBER = 8;
    public static final int PLAYER_TYPE_FIELD_NUMBER = 5;
    public static final int PLAY_CONTEXT_FIELD_NUMBER = 21;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 18;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int SPEED_FIELD_NUMBER = 10;
    public static final int SPOTIFY_URI_FIELD_NUMBER = 20;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 16;
    public static final int SUBTITLES_ACTIVE_FIELD_NUMBER = 27;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 9;
    public static final int SURFACE_FIELD_NUMBER = 17;
    public static final int VOLUME_FIELD_NUMBER = 11;
    private int battery_;
    private int bitField0_;
    private int bitrate_;
    private long createdTime_;
    private boolean isAudioOnly_;
    private boolean isBackgrounded_;
    private boolean isPlaying_;
    private boolean isPowerSaverActive_;
    private boolean isVideoDisabled_;
    private long mediaDuration_;
    private long playerPosition_;
    private int sequenceNumber_;
    private float speed_;
    private boolean subtitlesActive_;
    private float volume_;
    private String mediaUrl_ = "";
    private String featureIdentifier_ = "";
    private String playbackId_ = "";
    private String sessionId_ = "";
    private String mediaType_ = "";
    private String playerType_ = "";
    private String subtitleLanguage_ = "";
    private String networkState_ = "";
    private String playbackDestination_ = "";
    private String streamingType_ = "";
    private String surface_ = "";
    private String spotifyUri_ = "";
    private String playContext_ = "";
    private String playbackOrchestration_ = "";

    static {
        MediaPlaybackInitializationStart mediaPlaybackInitializationStart = new MediaPlaybackInitializationStart();
        DEFAULT_INSTANCE = mediaPlaybackInitializationStart;
        com.google.protobuf.h.registerDefaultInstance(MediaPlaybackInitializationStart.class, mediaPlaybackInitializationStart);
    }

    private MediaPlaybackInitializationStart() {
    }

    public static uth0 n() {
        return (uth0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A() {
        this.bitField0_ |= 16384;
        this.playbackDestination_ = "device";
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.playbackId_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 134217728;
        this.playbackOrchestration_ = str;
    }

    public final void D(long j) {
        this.bitField0_ |= 256;
        this.playerPosition_ = j;
    }

    public final void E(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.playerType_ = str;
    }

    public final void F(int i) {
        this.bitField0_ |= 8388608;
        this.sequenceNumber_ = i;
    }

    public final void G(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.sessionId_ = str;
    }

    public final void H(float f) {
        this.bitField0_ |= 1024;
        this.speed_ = f;
    }

    public final void I(String str) {
        str.getClass();
        this.bitField0_ |= 33554432;
        this.spotifyUri_ = str;
    }

    public final void J(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.streamingType_ = str;
    }

    public final void K(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.subtitleLanguage_ = str;
    }

    public final void L(String str) {
        this.bitField0_ |= 131072;
        this.surface_ = str;
    }

    public final void M(float f) {
        this.bitField0_ |= 2048;
        this.volume_ = f;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001c\u0000\u0001\u0001\u001c\u001c\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဇ\u0007\bဂ\b\tဈ\t\nခ\n\u000bခ\u000b\fဈ\f\rင\r\u000eဈ\u000e\u000fဇ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012င\u0017\u0013ဂ\u0018\u0014ဈ\u0019\u0015ဈ\u001a\u0016ဈ\u0004\u0017င\u0012\u0018ဇ\u0013\u0019ဇ\u0014\u001aဇ\u0015\u001bဇ\u0016\u001cဈ\u001b", new Object[]{"bitField0_", "mediaUrl_", "featureIdentifier_", "playbackId_", "sessionId_", "playerType_", "mediaDuration_", "isPlaying_", "playerPosition_", "subtitleLanguage_", "speed_", "volume_", "networkState_", "bitrate_", "playbackDestination_", "isAudioOnly_", "streamingType_", "surface_", "sequenceNumber_", "createdTime_", "spotifyUri_", "playContext_", "mediaType_", "battery_", "isPowerSaverActive_", "isBackgrounded_", "isVideoDisabled_", "subtitlesActive_", "playbackOrchestration_"});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackInitializationStart();
        }
        if (iOrdinal == 4) {
            return new uth0(DEFAULT_INSTANCE);
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
        synchronized (MediaPlaybackInitializationStart.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 262144;
        this.battery_ = i;
    }

    public final void p(int i) {
        this.bitField0_ |= 8192;
        this.bitrate_ = i;
    }

    public final void q(long j) {
        this.bitField0_ |= 16777216;
        this.createdTime_ = j;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.featureIdentifier_ = str;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 32768;
        this.isAudioOnly_ = z;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 128;
        this.isPlaying_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.bitField0_ |= 524288;
        this.isPowerSaverActive_ = z;
    }

    public final void v(long j) {
        this.bitField0_ |= 64;
        this.mediaDuration_ = j;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.mediaType_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.mediaUrl_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.networkState_ = str;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 67108864;
        this.playContext_ = str;
    }
}
