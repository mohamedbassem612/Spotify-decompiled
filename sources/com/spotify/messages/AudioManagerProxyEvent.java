package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.ow7;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AudioManagerProxyEvent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCEPTS_DELAYED_FOCUS_GAIN_FIELD_NUMBER = 9;
    public static final int APP_IMPORTANCE_FIELD_NUMBER = 10;
    public static final int AUDIO_USAGE_FIELD_NUMBER = 8;
    public static final int COMPONENT_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 7;
    private static final AudioManagerProxyEvent DEFAULT_INSTANCE;
    public static final int FOCUS_CHANGE_FIELD_NUMBER = 5;
    public static final int FOCUS_GAIN_FIELD_NUMBER = 4;
    public static final int HAS_FOREGROUND_SERVICE_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_RESULT_FIELD_NUMBER = 3;
    public static final int RETRY_ATTEMPT_FIELD_NUMBER = 12;
    public static final int SEND_REASON_FIELD_NUMBER = 2;
    public static final int STREAM_TYPE_FIELD_NUMBER = 6;
    private boolean acceptsDelayedFocusGain_;
    private int bitField0_;
    private boolean hasForegroundService_;
    private int retryAttempt_;
    private String componentIdentifier_ = "";
    private String sendReason_ = "";
    private String requestResult_ = "";
    private String focusGain_ = "";
    private String focusChange_ = "";
    private String streamType_ = "";
    private String contentType_ = "";
    private String audioUsage_ = "";
    private String appImportance_ = "";

    static {
        AudioManagerProxyEvent audioManagerProxyEvent = new AudioManagerProxyEvent();
        DEFAULT_INSTANCE = audioManagerProxyEvent;
        com.google.protobuf.h.registerDefaultInstance(AudioManagerProxyEvent.class, audioManagerProxyEvent);
    }

    private AudioManagerProxyEvent() {
    }

    public static ow7 n() {
        return (ow7) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b\nဈ\t\u000bဇ\n\fင\u000b", new Object[]{"bitField0_", "componentIdentifier_", "sendReason_", "requestResult_", "focusGain_", "focusChange_", "streamType_", "contentType_", "audioUsage_", "acceptsDelayedFocusGain_", "appImportance_", "hasForegroundService_", "retryAttempt_"});
        }
        if (iOrdinal == 3) {
            return new AudioManagerProxyEvent();
        }
        if (iOrdinal == 4) {
            return new ow7(DEFAULT_INSTANCE);
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
        synchronized (AudioManagerProxyEvent.class) {
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
        this.bitField0_ |= 256;
        this.acceptsDelayedFocusGain_ = z;
    }

    public final void p(String str) {
        this.bitField0_ |= 512;
        this.appImportance_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 128;
        this.audioUsage_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.componentIdentifier_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 64;
        this.contentType_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 16;
        this.focusChange_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 8;
        this.focusGain_ = str;
    }

    public final void v(boolean z) {
        this.bitField0_ |= 1024;
        this.hasForegroundService_ = z;
    }

    public final void w(String str) {
        this.bitField0_ |= 4;
        this.requestResult_ = str;
    }

    public final void x(int i) {
        this.bitField0_ |= 2048;
        this.retryAttempt_ = i;
    }

    public final void y(String str) {
        this.bitField0_ |= 2;
        this.sendReason_ = str;
    }

    public final void z(String str) {
        this.bitField0_ |= 32;
        this.streamType_ = str;
    }
}
