package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m4l;
import p.n4l;
import p.o4l;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ConnectMessages$NotifyAudioRouteChangedRequest extends h implements v2j0 {
    public static final int AUDIO_OUTPUT_DEVICE_BRAND_FIELD_NUMBER = 3;
    public static final int AUDIO_OUTPUT_DEVICE_CATEGORY_FIELD_NUMBER = 5;
    public static final int AUDIO_OUTPUT_DEVICE_CONNECTION_TYPE_FIELD_NUMBER = 2;
    public static final int AUDIO_OUTPUT_DEVICE_MODEL_FIELD_NUMBER = 4;
    public static final int AUDIO_OUTPUT_DEVICE_NAME_FIELD_NUMBER = 1;
    private static final ConnectMessages$NotifyAudioRouteChangedRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int audioOutputDeviceCategory_;
    private int audioOutputDeviceConnectionType_;
    private int bitField0_;
    private String audioOutputDeviceName_ = "";
    private String audioOutputDeviceBrand_ = "";
    private String audioOutputDeviceModel_ = "";

    static {
        ConnectMessages$NotifyAudioRouteChangedRequest connectMessages$NotifyAudioRouteChangedRequest = new ConnectMessages$NotifyAudioRouteChangedRequest();
        DEFAULT_INSTANCE = connectMessages$NotifyAudioRouteChangedRequest;
        h.registerDefaultInstance(ConnectMessages$NotifyAudioRouteChangedRequest.class, connectMessages$NotifyAudioRouteChangedRequest);
    }

    private ConnectMessages$NotifyAudioRouteChangedRequest() {
    }

    public static m4l n() {
        return (m4l) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "audioOutputDeviceName_", "audioOutputDeviceConnectionType_", "audioOutputDeviceBrand_", "audioOutputDeviceModel_", "audioOutputDeviceCategory_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$NotifyAudioRouteChangedRequest();
        }
        if (iOrdinal == 4) {
            return new m4l(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$NotifyAudioRouteChangedRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.audioOutputDeviceBrand_ = str;
    }

    public final void p(n4l n4lVar) {
        this.audioOutputDeviceCategory_ = n4lVar.getNumber();
        this.bitField0_ |= 16;
    }

    public final void q(o4l o4lVar) {
        this.audioOutputDeviceConnectionType_ = o4lVar.getNumber();
        this.bitField0_ |= 2;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.audioOutputDeviceModel_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.audioOutputDeviceName_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
