package com.spotify.messages;

import p.bf40;
import p.eoa;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class BetamaxPlaybackErrorDevice extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUNDED_FIELD_NUMBER = 13;
    public static final int BITRATE_FIELD_NUMBER = 16;
    public static final int BUFFERING_FIELD_NUMBER = 12;
    private static final BetamaxPlaybackErrorDevice DEFAULT_INSTANCE;
    public static final int DESKTOP_UI_FIELD_NUMBER = 9;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ERROR_DOMAIN_FIELD_NUMBER = 4;
    public static final int ERROR_EXTRA1_FIELD_NUMBER = 7;
    public static final int ERROR_EXTRA2_FIELD_NUMBER = 8;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    public static final int MS_POSITION_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 17;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 15;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int SURFACE_IDENTIFIER_FIELD_NUMBER = 10;
    public static final int VIDEO_DISABLED_FIELD_NUMBER = 14;
    private boolean backgrounded_;
    private int bitField0_;
    private int bitrate_;
    private boolean buffering_;
    private int errorCode_;
    private long msPosition_;
    private float playbackSpeed_;
    private boolean videoDisabled_;
    private String featureIdentifier_ = "";
    private String mediaUrl_ = "";
    private String sessionId_ = "";
    private String errorDomain_ = "";
    private String errorDescription_ = "";
    private String errorExtra1_ = "";
    private String errorExtra2_ = "";
    private String desktopUi_ = "";
    private String surfaceIdentifier_ = "";
    private phc playbackId_ = phc.b;

    static {
        BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice = new BetamaxPlaybackErrorDevice();
        DEFAULT_INSTANCE = betamaxPlaybackErrorDevice;
        com.google.protobuf.h.registerDefaultInstance(BetamaxPlaybackErrorDevice.class, betamaxPlaybackErrorDevice);
    }

    private BetamaxPlaybackErrorDevice() {
    }

    public static eoa n() {
        return (eoa) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(float f) {
        this.bitField0_ |= 16384;
        this.playbackSpeed_ = f;
    }

    public final void B(String str) {
        this.bitField0_ |= 4;
        this.sessionId_ = str;
    }

    public final void C(boolean z) {
        this.bitField0_ |= 8192;
        this.videoDisabled_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fခ\u000e\u0010င\u000f\u0011ည\u0010", new Object[]{"bitField0_", "featureIdentifier_", "mediaUrl_", "sessionId_", "errorDomain_", "errorCode_", "errorDescription_", "errorExtra1_", "errorExtra2_", "desktopUi_", "surfaceIdentifier_", "msPosition_", "buffering_", "backgrounded_", "videoDisabled_", "playbackSpeed_", "bitrate_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxPlaybackErrorDevice();
        }
        if (iOrdinal == 4) {
            return new eoa(DEFAULT_INSTANCE);
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
        synchronized (BetamaxPlaybackErrorDevice.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 4096;
        this.backgrounded_ = z;
    }

    public final void p(int i) {
        this.bitField0_ |= 32768;
        this.bitrate_ = i;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 2048;
        this.buffering_ = z;
    }

    public final void r(int i) {
        this.bitField0_ |= 16;
        this.errorCode_ = i;
    }

    public final void s(String str) {
        this.bitField0_ |= 32;
        this.errorDescription_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 8;
        this.errorDomain_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 64;
        this.errorExtra1_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 128;
        this.errorExtra2_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.featureIdentifier_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mediaUrl_ = str;
    }

    public final void y(long j) {
        this.bitField0_ |= 1024;
        this.msPosition_ = j;
    }

    public final void z(hhc hhcVar) {
        this.bitField0_ |= 65536;
        this.playbackId_ = hhcVar;
    }
}
