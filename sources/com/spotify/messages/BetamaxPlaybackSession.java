package com.spotify.messages;

import p.bf40;
import p.hhc;
import p.ioa;
import p.jf40;
import p.joa;
import p.koa;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class BetamaxPlaybackSession extends com.google.protobuf.h implements v2j0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 32;
    public static final int AVERAGE_DEVICE_ORIENTATION_FIELD_NUMBER = 30;
    public static final int CLIENT_METADATA_FIELD_NUMBER = 48;
    public static final int CONNECTION_TYPE_END_FIELD_NUMBER = 23;
    public static final int CONNECTION_TYPE_START_FIELD_NUMBER = 22;
    private static final BetamaxPlaybackSession DEFAULT_INSTANCE;
    public static final int DESKTOP_UI_FIELD_NUMBER = 37;
    public static final int DID_ATTEMPT_TO_PLAY_FIELD_NUMBER = 52;
    public static final int ENCRYPTION_TYPE_FIELD_NUMBER = 25;
    public static final int EXIT_REASON_FIELD_NUMBER = 31;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int IS_ROYALTY_MEDIA_FIELD_NUMBER = 35;
    public static final int KBPS_AVERAGE_BANDWIDTH_FIELD_NUMBER = 24;
    public static final int KBYTES_DOWNLOADED_FIELD_NUMBER = 27;
    public static final int KBYTES_FROM_CACHE_FIELD_NUMBER = 50;
    public static final int KBYTES_PLAYED_FIELD_NUMBER = 26;
    public static final int LAST_USED_SUBTITLE_FIELD_NUMBER = 33;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 46;
    public static final int MEDIA_URL_FIELD_NUMBER = 3;
    public static final int MS_BUFFERING_FORCED_FIELD_NUMBER = 44;
    public static final int MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER = 45;
    public static final int MS_BUFFERING_SEEK_FIELD_NUMBER = 11;
    public static final int MS_BUFFERING_SEEK_LONGEST_FIELD_NUMBER = 12;
    public static final int MS_BUFFERING_STALL_FIELD_NUMBER = 13;
    public static final int MS_BUFFERING_STALL_LONGEST_FIELD_NUMBER = 14;
    public static final int MS_BUFFERING_STUTTER_FIELD_NUMBER = 39;
    public static final int MS_BUFFERING_STUTTER_LONGEST_FIELD_NUMBER = 40;
    public static final int MS_DURATION_FIELD_NUMBER = 6;
    public static final int MS_ENCRYPTION_LOAD_TIME_FIELD_NUMBER = 9;
    public static final int MS_INITIAL_BUFFERING_FIELD_NUMBER = 10;
    public static final int MS_MANIFEST_LOAD_TIME_FIELD_NUMBER = 8;
    public static final int MS_PERCEIVED_TIME_TO_FIRST_FRAME_FIELD_NUMBER = 51;
    public static final int MS_PLAYED_AUDIBLE_FIELD_NUMBER = 53;
    public static final int MS_PLAYED_BACKGROUND_FIELD_NUMBER = 19;
    public static final int MS_PLAYED_EXTERNAL_FIELD_NUMBER = 38;
    public static final int MS_PLAYED_FIELD_NUMBER = 18;
    public static final int MS_PLAYED_FULLSCREEN_FIELD_NUMBER = 20;
    public static final int MS_PLAYED_INTERNAL_FIELD_NUMBER = 47;
    public static final int MS_PLAYED_NOMINAL_FIELD_NUMBER = 34;
    public static final int MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER = 56;
    public static final int MS_PLAYED_PER_SURFACE_FIELD_NUMBER = 49;
    public static final int MS_PLAYED_SUBTITLES_FIELD_NUMBER = 21;
    public static final int MS_PLAYED_VIDEO_DISABLED_FIELD_NUMBER = 43;
    public static final int MS_START_POSITION_FIELD_NUMBER = 4;
    public static final int MS_START_TIME_FIELD_NUMBER = 7;
    public static final int N_DROPPED_FRAMES_FIELD_NUMBER = 29;
    public static final int N_FORCED_REBUFFER_FIELD_NUMBER = 42;
    public static final int N_SEEKBACK_FIELD_NUMBER = 16;
    public static final int N_SEEKFORWARD_FIELD_NUMBER = 17;
    public static final int N_STALLS_FIELD_NUMBER = 15;
    public static final int N_STUTTERS_FIELD_NUMBER = 41;
    public static final int N_VIEW_TRANSITIONS_FIELD_NUMBER = 28;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 54;
    public static final int PLAYER_ID_FIELD_NUMBER = 55;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int START_BITRATE_FIELD_NUMBER = 5;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 36;
    private float aspectRatio_;
    private float averageDeviceOrientation_;
    private int bitField0_;
    private int bitField1_;
    private qng0 clientMetadata_;
    private String connectionTypeEnd_;
    private String connectionTypeStart_;
    private String desktopUi_;
    private boolean didAttemptToPlay_;
    private String encryptionType_;
    private String exitReason_;
    private String featureIdentifier_;
    private boolean isRoyaltyMedia_;
    private int kbpsAverageBandwidth_;
    private long kbytesDownloaded_;
    private long kbytesFromCache_;
    private long kbytesPlayed_;
    private String lastUsedSubtitle_;
    private String mediaType_;
    private String mediaUrl_;
    private long msBufferingForcedLongest_;
    private long msBufferingForced_;
    private long msBufferingSeekLongest_;
    private long msBufferingSeek_;
    private long msBufferingStallLongest_;
    private long msBufferingStall_;
    private long msBufferingStutterLongest_;
    private long msBufferingStutter_;
    private long msDuration_;
    private long msEncryptionLoadTime_;
    private long msInitialBuffering_;
    private long msManifestLoadTime_;
    private long msPerceivedTimeToFirstFrame_;
    private long msPlayedAudible_;
    private long msPlayedBackground_;
    private long msPlayedExternal_;
    private long msPlayedFullscreen_;
    private long msPlayedInternal_;
    private long msPlayedNominalInternal_;
    private long msPlayedNominal_;
    private qng0 msPlayedPerSurface_;
    private long msPlayedSubtitles_;
    private long msPlayedVideoDisabled_;
    private long msPlayed_;
    private long msStartPosition_;
    private long msStartTime_;
    private long nDroppedFrames_;
    private int nForcedRebuffer_;
    private int nSeekback_;
    private int nSeekforward_;
    private int nStalls_;
    private int nStutters_;
    private int nViewTransitions_;
    private phc playbackId_;
    private String playerId_;
    private String sessionId_;
    private int startBitrate_;
    private String streamingType_;

    static {
        BetamaxPlaybackSession betamaxPlaybackSession = new BetamaxPlaybackSession();
        DEFAULT_INSTANCE = betamaxPlaybackSession;
        com.google.protobuf.h.registerDefaultInstance(BetamaxPlaybackSession.class, betamaxPlaybackSession);
    }

    private BetamaxPlaybackSession() {
        qng0 qng0Var = qng0.b;
        this.clientMetadata_ = qng0Var;
        this.msPlayedPerSurface_ = qng0Var;
        this.sessionId_ = "";
        this.featureIdentifier_ = "";
        this.mediaUrl_ = "";
        this.connectionTypeStart_ = "";
        this.connectionTypeEnd_ = "";
        this.encryptionType_ = "";
        this.exitReason_ = "";
        this.lastUsedSubtitle_ = "";
        this.streamingType_ = "";
        this.desktopUi_ = "";
        this.mediaType_ = "";
        this.playbackId_ = phc.b;
        this.playerId_ = "";
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ioa q() {
        return (ioa) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(int i) {
        this.bitField0_ |= 8388608;
        this.kbpsAverageBandwidth_ = i;
    }

    public final void B(long j) {
        this.bitField0_ |= 67108864;
        this.kbytesDownloaded_ = j;
    }

    public final void C(long j) {
        this.bitField1_ |= 32768;
        this.kbytesFromCache_ = j;
    }

    public final void D() {
        this.bitField0_ |= 33554432;
        this.kbytesPlayed_ = 0L;
    }

    public final void E(String str) {
        this.bitField1_ |= 1;
        this.lastUsedSubtitle_ = str;
    }

    public final void F(String str) {
        this.bitField1_ |= 8192;
        this.mediaType_ = str;
    }

    public final void G(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.mediaUrl_ = str;
    }

    public final void H(long j) {
        this.bitField0_ |= 1024;
        this.msBufferingSeek_ = j;
    }

    public final void I(long j) {
        this.bitField0_ |= 2048;
        this.msBufferingSeekLongest_ = j;
    }

    public final void J(long j) {
        this.bitField0_ |= 4096;
        this.msBufferingStall_ = j;
    }

    public final void K(long j) {
        this.bitField0_ |= 8192;
        this.msBufferingStallLongest_ = j;
    }

    public final void L(long j) {
        this.bitField1_ |= 64;
        this.msBufferingStutter_ = j;
    }

    public final void M(long j) {
        this.bitField1_ |= 128;
        this.msBufferingStutterLongest_ = j;
    }

    public final void N(long j) {
        this.bitField0_ |= 32;
        this.msDuration_ = j;
    }

    public final void O(long j) {
        this.bitField0_ |= 256;
        this.msEncryptionLoadTime_ = j;
    }

    public final void P(long j) {
        this.bitField0_ |= 512;
        this.msInitialBuffering_ = j;
    }

    public final void Q(long j) {
        this.bitField0_ |= 128;
        this.msManifestLoadTime_ = j;
    }

    public final void R(long j) {
        this.bitField1_ |= 65536;
        this.msPerceivedTimeToFirstFrame_ = j;
    }

    public final void S(long j) {
        this.bitField0_ |= 131072;
        this.msPlayed_ = j;
    }

    public final void T(long j) {
        this.bitField1_ |= 262144;
        this.msPlayedAudible_ = j;
    }

    public final void U(long j) {
        this.bitField0_ |= 262144;
        this.msPlayedBackground_ = j;
    }

    public final void V(long j) {
        this.bitField0_ |= 524288;
        this.msPlayedFullscreen_ = j;
    }

    public final void W(long j) {
        this.bitField1_ |= 16384;
        this.msPlayedInternal_ = j;
    }

    public final void X(long j) {
        this.bitField1_ |= 2;
        this.msPlayedNominal_ = j;
    }

    public final void Y(long j) {
        this.bitField0_ |= 1048576;
        this.msPlayedSubtitles_ = j;
    }

    public final void Z(long j) {
        this.bitField1_ |= 1024;
        this.msPlayedVideoDisabled_ = j;
    }

    public final void a0(long j) {
        this.bitField0_ |= 8;
        this.msStartPosition_ = j;
    }

    public final void b0(long j) {
        this.bitField0_ |= 64;
        this.msStartTime_ = j;
    }

    public final void c0(long j) {
        this.bitField0_ |= 268435456;
        this.nDroppedFrames_ = j;
    }

    public final void d0(int i) {
        this.bitField0_ |= 32768;
        this.nSeekback_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u00018\u0000\u0002\u000188\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fင\u000e\u0010င\u000f\u0011င\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဈ\u0015\u0017ဈ\u0016\u0018င\u0017\u0019ဈ\u0018\u001aဂ\u0019\u001bဂ\u001a\u001cင\u001b\u001dဂ\u001c\u001eခ\u001d\u001fဈ\u001e ခ\u001f!ဈ \"ဂ!#ဇ\"$ဈ#%ဈ$&ဂ%'ဂ&(ဂ')င(*င)+ဂ*,ဂ+-ဂ,.ဈ-/ဂ.02122ဂ/3ဂ04ဇ15ဂ26ည37ဈ48ဂ5", new Object[]{"bitField0_", "bitField1_", "sessionId_", "featureIdentifier_", "mediaUrl_", "msStartPosition_", "startBitrate_", "msDuration_", "msStartTime_", "msManifestLoadTime_", "msEncryptionLoadTime_", "msInitialBuffering_", "msBufferingSeek_", "msBufferingSeekLongest_", "msBufferingStall_", "msBufferingStallLongest_", "nStalls_", "nSeekback_", "nSeekforward_", "msPlayed_", "msPlayedBackground_", "msPlayedFullscreen_", "msPlayedSubtitles_", "connectionTypeStart_", "connectionTypeEnd_", "kbpsAverageBandwidth_", "encryptionType_", "kbytesPlayed_", "kbytesDownloaded_", "nViewTransitions_", "nDroppedFrames_", "averageDeviceOrientation_", "exitReason_", "aspectRatio_", "lastUsedSubtitle_", "msPlayedNominal_", "isRoyaltyMedia_", "streamingType_", "desktopUi_", "msPlayedExternal_", "msBufferingStutter_", "msBufferingStutterLongest_", "nStutters_", "nForcedRebuffer_", "msPlayedVideoDisabled_", "msBufferingForced_", "msBufferingForcedLongest_", "mediaType_", "msPlayedInternal_", "clientMetadata_", joa.a, "msPlayedPerSurface_", koa.a, "kbytesFromCache_", "msPerceivedTimeToFirstFrame_", "didAttemptToPlay_", "msPlayedAudible_", "playbackId_", "playerId_", "msPlayedNominalInternal_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxPlaybackSession();
        }
        if (iOrdinal == 4) {
            return new ioa(DEFAULT_INSTANCE);
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
        synchronized (BetamaxPlaybackSession.class) {
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

    public final void e0(int i) {
        this.bitField0_ |= 65536;
        this.nSeekforward_ = i;
    }

    public final void f0(int i) {
        this.bitField0_ |= 16384;
        this.nStalls_ = i;
    }

    public final void g0(int i) {
        this.bitField1_ |= 256;
        this.nStutters_ = i;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void h0(hhc hhcVar) {
        this.bitField1_ |= 524288;
        this.playbackId_ = hhcVar;
    }

    public final void i0(String str) {
        str.getClass();
        this.bitField1_ |= 1048576;
        this.playerId_ = str;
    }

    public final void j0(String str) {
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final void k0(int i) {
        this.bitField0_ |= 16;
        this.startBitrate_ = i;
    }

    public final void l0(String str) {
        this.bitField1_ |= 8;
        this.streamingType_ = str;
    }

    public final String n() {
        return this.featureIdentifier_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.clientMetadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.clientMetadata_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 p() {
        qng0 qng0Var = this.msPlayedPerSurface_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.msPlayedPerSurface_ = qng0VarH;
        return qng0VarH;
    }

    public final void r(float f) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.aspectRatio_ = f;
    }

    public final void s(float f) {
        this.bitField0_ |= 536870912;
        this.averageDeviceOrientation_ = f;
    }

    public final void t(String str) {
        this.bitField0_ |= 4194304;
        this.connectionTypeEnd_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 2097152;
        this.connectionTypeStart_ = str;
    }

    public final void v(boolean z) {
        this.bitField1_ |= 131072;
        this.didAttemptToPlay_ = z;
    }

    public final void w(String str) {
        this.bitField0_ |= 16777216;
        this.encryptionType_ = str;
    }

    public final void x(String str) {
        this.bitField0_ |= 1073741824;
        this.exitReason_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.featureIdentifier_ = str;
    }

    public final void z(boolean z) {
        this.bitField1_ |= 4;
        this.isRoyaltyMedia_ = z;
    }
}
