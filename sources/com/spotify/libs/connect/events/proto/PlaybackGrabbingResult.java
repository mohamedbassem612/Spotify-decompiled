package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.k0u0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PlaybackGrabbingResult extends h implements v2j0 {
    public static final int ACTIVE_REMOTE_DEVICE_ID_FIELD_NUMBER = 2;
    public static final int ACTIVE_REMOTE_DEVICE_TYPE_FIELD_NUMBER = 8;
    public static final int APP_STATE_FIELD_NUMBER = 3;
    public static final int CURRENT_ACCESSORY_FIELD_NUMBER = 9;
    public static final int CURRENT_AUDIO_ROUTE_FIELD_NUMBER = 5;
    private static final PlaybackGrabbingResult DEFAULT_INSTANCE;
    public static final int GRABBING_EXCEPTIONS_RESULT_FIELD_NUMBER = 7;
    public static final int GRABBING_RESULT_FIELD_NUMBER = 1;
    public static final int GRABBING_TRIGGER_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String grabbingResult_ = "";
    private String activeRemoteDeviceId_ = "";
    private String appState_ = "";
    private String playbackState_ = "";
    private String currentAudioRoute_ = "";
    private String grabbingTrigger_ = "";
    private String grabbingExceptionsResult_ = "";
    private String activeRemoteDeviceType_ = "";
    private String currentAccessory_ = "";

    static {
        PlaybackGrabbingResult playbackGrabbingResult = new PlaybackGrabbingResult();
        DEFAULT_INSTANCE = playbackGrabbingResult;
        h.registerDefaultInstance(PlaybackGrabbingResult.class, playbackGrabbingResult);
    }

    private PlaybackGrabbingResult() {
    }

    public static k0u0 n() {
        return (k0u0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "grabbingResult_", "activeRemoteDeviceId_", "appState_", "playbackState_", "currentAudioRoute_", "grabbingTrigger_", "grabbingExceptionsResult_", "activeRemoteDeviceType_", "currentAccessory_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackGrabbingResult();
        }
        if (iOrdinal == 4) {
            return new k0u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackGrabbingResult.class) {
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
        this.bitField0_ |= 2;
        this.activeRemoteDeviceId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 128;
        this.activeRemoteDeviceType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.appState_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 256;
        this.currentAccessory_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.currentAudioRoute_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 64;
        this.grabbingExceptionsResult_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.grabbingResult_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.grabbingTrigger_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.playbackState_ = str;
    }
}
