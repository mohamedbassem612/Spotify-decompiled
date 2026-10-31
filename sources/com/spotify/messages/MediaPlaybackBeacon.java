package com.spotify.messages;

import p.bf40;
import p.gth0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MediaPlaybackBeacon extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_DECODER_NAME_FIELD_NUMBER = 27;
    public static final int BATTERY_FIELD_NUMBER = 28;
    public static final int BEGIN_TRACKING_TIMESTAMP_FIELD_NUMBER = 21;
    public static final int BITRATE_FIELD_NUMBER = 13;
    public static final int CREATED_TIME_FIELD_NUMBER = 19;
    private static final MediaPlaybackBeacon DEFAULT_INSTANCE;
    public static final int DROPPED_FRAMES_FIELD_NUMBER = 25;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int IS_AUDIO_ONLY_FIELD_NUMBER = 15;
    public static final int IS_BACKGROUNDED_FIELD_NUMBER = 30;
    public static final int IS_PLAYING_FIELD_NUMBER = 7;
    public static final int IS_POWER_SAVER_ACTIVE_FIELD_NUMBER = 29;
    public static final int IS_VIDEO_DISABLED_FIELD_NUMBER = 31;
    public static final int MEDIA_DURATION_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 22;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    public static final int NETWORK_STATE_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_DESTINATION_FIELD_NUMBER = 14;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYER_POSITION_FIELD_NUMBER = 8;
    public static final int PLAYER_TYPE_FIELD_NUMBER = 5;
    public static final int REASON_FIELD_NUMBER = 20;
    public static final int RENDERED_FRAMES_FIELD_NUMBER = 24;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 18;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int SPEED_FIELD_NUMBER = 10;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 16;
    public static final int SUBTITLES_ACTIVE_FIELD_NUMBER = 32;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 9;
    public static final int SURFACE_FIELD_NUMBER = 17;
    public static final int TIME_SINCE_LAST_HEARTBEAT_FIELD_NUMBER = 23;
    public static final int VIDEO_DECODER_NAME_FIELD_NUMBER = 26;
    public static final int VOLUME_FIELD_NUMBER = 11;
    private int battery_;
    private long beginTrackingTimestamp_;
    private int bitField0_;
    private int bitrate_;
    private long createdTime_;
    private long droppedFrames_;
    private boolean isAudioOnly_;
    private boolean isBackgrounded_;
    private boolean isPlaying_;
    private boolean isPowerSaverActive_;
    private boolean isVideoDisabled_;
    private long mediaDuration_;
    private long playerPosition_;
    private long renderedFrames_;
    private int sequenceNumber_;
    private float speed_;
    private boolean subtitlesActive_;
    private long timeSinceLastHeartbeat_;
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
    private String reason_ = "";
    private String videoDecoderName_ = "";
    private String audioDecoderName_ = "";

    static {
        MediaPlaybackBeacon mediaPlaybackBeacon = new MediaPlaybackBeacon();
        DEFAULT_INSTANCE = mediaPlaybackBeacon;
        com.google.protobuf.h.registerDefaultInstance(MediaPlaybackBeacon.class, mediaPlaybackBeacon);
    }

    private MediaPlaybackBeacon() {
    }

    public static gth0 n() {
        return (gth0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.mediaUrl_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.networkState_ = str;
    }

    public final void C() {
        this.bitField0_ |= 16384;
        this.playbackDestination_ = "device";
    }

    public final void D(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.playbackId_ = str;
    }

    public final void E(long j) {
        this.bitField0_ |= 256;
        this.playerPosition_ = j;
    }

    public final void F(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.playerType_ = str;
    }

    public final void G(String str) {
        str.getClass();
        this.bitField0_ |= 33554432;
        this.reason_ = str;
    }

    public final void H(long j) {
        this.bitField0_ |= 268435456;
        this.renderedFrames_ = j;
    }

    public final void I(int i) {
        this.bitField0_ |= 8388608;
        this.sequenceNumber_ = i;
    }

    public final void J(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.sessionId_ = str;
    }

    public final void K(float f) {
        this.bitField0_ |= 1024;
        this.speed_ = f;
    }

    public final void L(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.streamingType_ = str;
    }

    public final void M(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.subtitleLanguage_ = str;
    }

    public final void N(String str) {
        this.bitField0_ |= 131072;
        this.surface_ = str;
    }

    public final void O(long j) {
        this.bitField0_ |= 134217728;
        this.timeSinceLastHeartbeat_ = j;
    }

    public final void P(String str) {
        str.getClass();
        this.bitField0_ |= 1073741824;
        this.videoDecoderName_ = str;
    }

    public final void Q(float f) {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u0001  \u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဇ\u0007\bဂ\b\tဈ\t\nခ\n\u000bခ\u000b\fဈ\f\rင\r\u000eဈ\u000e\u000fဇ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012င\u0017\u0013ဂ\u0018\u0014ဈ\u0019\u0015ဂ\u001a\u0016ဈ\u0004\u0017ဂ\u001b\u0018ဂ\u001c\u0019ဂ\u001d\u001aဈ\u001e\u001bဈ\u001f\u001cင\u0012\u001dဇ\u0013\u001eဇ\u0014\u001fဇ\u0015 ဇ\u0016", new Object[]{"bitField0_", "mediaUrl_", "featureIdentifier_", "playbackId_", "sessionId_", "playerType_", "mediaDuration_", "isPlaying_", "playerPosition_", "subtitleLanguage_", "speed_", "volume_", "networkState_", "bitrate_", "playbackDestination_", "isAudioOnly_", "streamingType_", "surface_", "sequenceNumber_", "createdTime_", "reason_", "beginTrackingTimestamp_", "mediaType_", "timeSinceLastHeartbeat_", "renderedFrames_", "droppedFrames_", "videoDecoderName_", "audioDecoderName_", "battery_", "isPowerSaverActive_", "isBackgrounded_", "isVideoDisabled_", "subtitlesActive_"});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackBeacon();
        }
        if (iOrdinal == 4) {
            return new gth0(DEFAULT_INSTANCE);
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
        synchronized (MediaPlaybackBeacon.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= Integer.MIN_VALUE;
        this.audioDecoderName_ = str;
    }

    public final void p(int i) {
        this.bitField0_ |= 262144;
        this.battery_ = i;
    }

    public final void q(long j) {
        this.bitField0_ |= 67108864;
        this.beginTrackingTimestamp_ = j;
    }

    public final void r(int i) {
        this.bitField0_ |= 8192;
        this.bitrate_ = i;
    }

    public final void s(long j) {
        this.bitField0_ |= 16777216;
        this.createdTime_ = j;
    }

    public final void t(long j) {
        this.bitField0_ |= 536870912;
        this.droppedFrames_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.featureIdentifier_ = str;
    }

    public final void v(boolean z) {
        this.bitField0_ |= 32768;
        this.isAudioOnly_ = z;
    }

    public final void w(boolean z) {
        this.bitField0_ |= 128;
        this.isPlaying_ = z;
    }

    public final void x(boolean z) {
        this.bitField0_ |= 524288;
        this.isPowerSaverActive_ = z;
    }

    public final void y(long j) {
        this.bitField0_ |= 64;
        this.mediaDuration_ = j;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.mediaType_ = str;
    }
}
