package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zth0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MediaPlaybackProfileChange extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_CODEC_FIELD_NUMBER = 28;
    public static final int AUDIO_PROFILE_ID_FIELD_NUMBER = 31;
    public static final int AVG_BITRATE_AUDIO_FIELD_NUMBER = 24;
    public static final int AVG_BITRATE_VIDEO_FIELD_NUMBER = 26;
    public static final int BATTERY_FIELD_NUMBER = 35;
    public static final int BITRATE_FIELD_NUMBER = 13;
    public static final int CREATED_TIME_FIELD_NUMBER = 19;
    private static final MediaPlaybackProfileChange DEFAULT_INSTANCE;
    public static final int ENCODED_DISPLAY_HEIGHT_FIELD_NUMBER = 23;
    public static final int ENCODED_DISPLAY_WIDTH_FIELD_NUMBER = 22;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int FRAME_RATE_FIELD_NUMBER = 30;
    public static final int IS_AUDIO_ONLY_FIELD_NUMBER = 15;
    public static final int IS_BACKGROUNDED_FIELD_NUMBER = 37;
    public static final int IS_PLAYING_FIELD_NUMBER = 7;
    public static final int IS_POWER_SAVER_ACTIVE_FIELD_NUMBER = 36;
    public static final int IS_VIDEO_DISABLED_FIELD_NUMBER = 38;
    public static final int MAX_BITRATE_AUDIO_FIELD_NUMBER = 25;
    public static final int MAX_BITRATE_VIDEO_FIELD_NUMBER = 27;
    public static final int MEDIA_DURATION_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 34;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    public static final int NETWORK_STATE_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_DESTINATION_FIELD_NUMBER = 14;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYER_POSITION_FIELD_NUMBER = 8;
    public static final int PLAYER_TYPE_FIELD_NUMBER = 5;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 18;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int SPEED_FIELD_NUMBER = 10;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 16;
    public static final int SUBTITLES_ACTIVE_FIELD_NUMBER = 39;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 9;
    public static final int SURFACE_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 33;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 29;
    public static final int VIDEO_PROFILE_ID_FIELD_NUMBER = 32;
    public static final int VIEWING_DISPLAY_HEIGHT_FIELD_NUMBER = 21;
    public static final int VIEWING_DISPLAY_WIDTH_FIELD_NUMBER = 20;
    public static final int VOLUME_FIELD_NUMBER = 11;
    private int avgBitrateAudio_;
    private int avgBitrateVideo_;
    private int battery_;
    private int bitField0_;
    private int bitField1_;
    private int bitrate_;
    private long createdTime_;
    private int encodedDisplayHeight_;
    private int encodedDisplayWidth_;
    private int frameRate_;
    private boolean isAudioOnly_;
    private boolean isBackgrounded_;
    private boolean isPlaying_;
    private boolean isPowerSaverActive_;
    private boolean isVideoDisabled_;
    private int maxBitrateAudio_;
    private int maxBitrateVideo_;
    private long mediaDuration_;
    private long playerPosition_;
    private int sequenceNumber_;
    private float speed_;
    private boolean subtitlesActive_;
    private int viewingDisplayHeight_;
    private int viewingDisplayWidth_;
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
    private String audioCodec_ = "";
    private String videoCodec_ = "";
    private String audioProfileId_ = "";
    private String videoProfileId_ = "";
    private String type_ = "";

    static {
        MediaPlaybackProfileChange mediaPlaybackProfileChange = new MediaPlaybackProfileChange();
        DEFAULT_INSTANCE = mediaPlaybackProfileChange;
        com.google.protobuf.h.registerDefaultInstance(MediaPlaybackProfileChange.class, mediaPlaybackProfileChange);
    }

    private MediaPlaybackProfileChange() {
    }

    public static zth0 n() {
        return (zth0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(boolean z) {
        this.bitField0_ |= 128;
        this.isPlaying_ = z;
    }

    public final void B(boolean z) {
        this.bitField0_ |= 524288;
        this.isPowerSaverActive_ = z;
    }

    public final void C(int i) {
        this.bitField0_ |= 1073741824;
        this.maxBitrateAudio_ = i;
    }

    public final void D(int i) {
        this.bitField1_ |= 1;
        this.maxBitrateVideo_ = i;
    }

    public final void E(long j) {
        this.bitField0_ |= 64;
        this.mediaDuration_ = j;
    }

    public final void F(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.mediaType_ = str;
    }

    public final void G(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.mediaUrl_ = str;
    }

    public final void H(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.networkState_ = str;
    }

    public final void I() {
        this.bitField0_ |= 16384;
        this.playbackDestination_ = "device";
    }

    public final void J(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.playbackId_ = str;
    }

    public final void K(long j) {
        this.bitField0_ |= 256;
        this.playerPosition_ = j;
    }

    public final void L(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.playerType_ = str;
    }

    public final void M(int i) {
        this.bitField0_ |= 8388608;
        this.sequenceNumber_ = i;
    }

    public final void N(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.sessionId_ = str;
    }

    public final void O(float f) {
        this.bitField0_ |= 1024;
        this.speed_ = f;
    }

    public final void P(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.streamingType_ = str;
    }

    public final void Q(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.subtitleLanguage_ = str;
    }

    public final void R(String str) {
        this.bitField0_ |= 131072;
        this.surface_ = str;
    }

    public final void S(String str) {
        this.bitField1_ |= 64;
        this.type_ = str;
    }

    public final void T(String str) {
        str.getClass();
        this.bitField1_ |= 4;
        this.videoCodec_ = str;
    }

    public final void U(String str) {
        str.getClass();
        this.bitField1_ |= 32;
        this.videoProfileId_ = str;
    }

    public final void V(int i) {
        this.bitField0_ |= 67108864;
        this.viewingDisplayHeight_ = i;
    }

    public final void W(int i) {
        this.bitField0_ |= 33554432;
        this.viewingDisplayWidth_ = i;
    }

    public final void X(float f) {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001'\u0000\u0002\u0001''\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဇ\u0007\bဂ\b\tဈ\t\nခ\n\u000bခ\u000b\fဈ\f\rင\r\u000eဈ\u000e\u000fဇ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012င\u0017\u0013ဂ\u0018\u0014င\u0019\u0015င\u001a\u0016င\u001b\u0017င\u001c\u0018င\u001d\u0019င\u001e\u001aင\u001f\u001bင \u001cဈ!\u001dဈ\"\u001eင#\u001fဈ$ ဈ%!ဈ&\"ဈ\u0004#င\u0012$ဇ\u0013%ဇ\u0014&ဇ\u0015'ဇ\u0016", new Object[]{"bitField0_", "bitField1_", "mediaUrl_", "featureIdentifier_", "playbackId_", "sessionId_", "playerType_", "mediaDuration_", "isPlaying_", "playerPosition_", "subtitleLanguage_", "speed_", "volume_", "networkState_", "bitrate_", "playbackDestination_", "isAudioOnly_", "streamingType_", "surface_", "sequenceNumber_", "createdTime_", "viewingDisplayWidth_", "viewingDisplayHeight_", "encodedDisplayWidth_", "encodedDisplayHeight_", "avgBitrateAudio_", "maxBitrateAudio_", "avgBitrateVideo_", "maxBitrateVideo_", "audioCodec_", "videoCodec_", "frameRate_", "audioProfileId_", "videoProfileId_", "type_", "mediaType_", "battery_", "isPowerSaverActive_", "isBackgrounded_", "isVideoDisabled_", "subtitlesActive_"});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackProfileChange();
        }
        if (iOrdinal == 4) {
            return new zth0(DEFAULT_INSTANCE);
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
        synchronized (MediaPlaybackProfileChange.class) {
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
        this.bitField1_ |= 2;
        this.audioCodec_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField1_ |= 16;
        this.audioProfileId_ = str;
    }

    public final void q(int i) {
        this.bitField0_ |= 536870912;
        this.avgBitrateAudio_ = i;
    }

    public final void r(int i) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.avgBitrateVideo_ = i;
    }

    public final void s(int i) {
        this.bitField0_ |= 262144;
        this.battery_ = i;
    }

    public final void t(int i) {
        this.bitField0_ |= 8192;
        this.bitrate_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 16777216;
        this.createdTime_ = j;
    }

    public final void v(int i) {
        this.bitField0_ |= 268435456;
        this.encodedDisplayHeight_ = i;
    }

    public final void w(int i) {
        this.bitField0_ |= 134217728;
        this.encodedDisplayWidth_ = i;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.featureIdentifier_ = str;
    }

    public final void y(int i) {
        this.bitField1_ |= 8;
        this.frameRate_ = i;
    }

    public final void z(boolean z) {
        this.bitField0_ |= 32768;
        this.isAudioOnly_ = z;
    }
}
