package com.spotify.externalintegration.loggingservice.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v210;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ExternalAccessoryRemoteInteraction extends h implements v2j0 {
    public static final int ACCESSORY_CLASS_FIELD_NUMBER = 15;
    public static final int ACCESSORY_NAME_FIELD_NUMBER = 7;
    public static final int ACCESSORY_TYPE_FIELD_NUMBER = 6;
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AUDIO_ROUTE_ID_FIELD_NUMBER = 14;
    public static final int BRAND_FIELD_NUMBER = 8;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    private static final ExternalAccessoryRemoteInteraction DEFAULT_INSTANCE;
    public static final int INTEGRATION_FIELD_NUMBER = 3;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 4;
    public static final int REMOTE_DEVICE_ID_FIELD_NUMBER = 13;
    public static final int SENDER_ID_FIELD_NUMBER = 12;
    public static final int TRANSPORT_TYPE_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 10;
    private int bitField0_;
    private String action_ = "";
    private String interactionId_ = "";
    private String integration_ = "";
    private String protocol_ = "";
    private String transportType_ = "";
    private String accessoryType_ = "";
    private String accessoryName_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String version_ = "";
    private String clientId_ = "";
    private String senderId_ = "";
    private String remoteDeviceId_ = "";
    private String audioRouteId_ = "";
    private String accessoryClass_ = "";

    static {
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = new ExternalAccessoryRemoteInteraction();
        DEFAULT_INSTANCE = externalAccessoryRemoteInteraction;
        h.registerDefaultInstance(ExternalAccessoryRemoteInteraction.class, externalAccessoryRemoteInteraction);
    }

    private ExternalAccessoryRemoteInteraction() {
    }

    public static v210 p() {
        return (v210) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.remoteDeviceId_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.senderId_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.transportType_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e", new Object[]{"bitField0_", "action_", "interactionId_", "integration_", "protocol_", "transportType_", "accessoryType_", "accessoryName_", "brand_", "model_", "version_", "clientId_", "senderId_", "remoteDeviceId_", "audioRouteId_", "accessoryClass_"});
        }
        if (iOrdinal == 3) {
            return new ExternalAccessoryRemoteInteraction();
        }
        if (iOrdinal == 4) {
            return new v210(DEFAULT_INSTANCE);
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
        synchronized (ExternalAccessoryRemoteInteraction.class) {
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

    public final String n() {
        return this.senderId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return (this.bitField0_ & 64) != 0;
    }

    public final void q(String str) {
        this.bitField0_ |= 16384;
        this.accessoryClass_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.accessoryName_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.accessoryType_ = str;
    }

    public final void setClientId(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.clientId_ = str;
    }

    public final void setVersion(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.version_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.action_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.audioRouteId_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.brand_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.integration_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.interactionId_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.model_ = str;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.protocol_ = str;
    }
}
