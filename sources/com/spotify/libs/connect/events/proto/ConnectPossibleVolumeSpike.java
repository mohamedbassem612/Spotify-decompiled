package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.e5l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ConnectPossibleVolumeSpike extends h implements v2j0 {
    public static final int ACTIVE_DEVICE_ID_FIELD_NUMBER = 1;
    public static final int APPLICATION_STATE_FIELD_NUMBER = 6;
    public static final int CURRENT_ROUTE_TYPE_FIELD_NUMBER = 7;
    private static final ConnectPossibleVolumeSpike DEFAULT_INSTANCE;
    public static final int DEVICE_BRAND_FIELD_NUMBER = 12;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 11;
    public static final int IS_CONNECTED_TO_ENTITY_FIELD_NUMBER = 10;
    public static final int IS_SOCIAL_CONNECT_FIELD_NUMBER = 8;
    public static final int NEW_VOLUME_FIELD_NUMBER = 2;
    public static final int OLD_VOLUME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTING_FEATURE_FIELD_NUMBER = 9;
    public static final int STEPS_DOWN_AFTER_FIELD_NUMBER = 4;
    public static final int TOTAL_VOLUME_DECREASE_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isConnectedToEntity_;
    private boolean isSocialConnect_;
    private float newVolume_;
    private float oldVolume_;
    private int stepsDownAfter_;
    private float totalVolumeDecrease_;
    private String activeDeviceId_ = "";
    private String applicationState_ = "";
    private String currentRouteType_ = "";
    private String requestingFeature_ = "";
    private String deviceModel_ = "";
    private String deviceBrand_ = "";

    static {
        ConnectPossibleVolumeSpike connectPossibleVolumeSpike = new ConnectPossibleVolumeSpike();
        DEFAULT_INSTANCE = connectPossibleVolumeSpike;
        h.registerDefaultInstance(ConnectPossibleVolumeSpike.class, connectPossibleVolumeSpike);
    }

    private ConnectPossibleVolumeSpike() {
    }

    public static e5l n() {
        return (e5l) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ခ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဈ\b\nဇ\t\u000bဈ\n\fဈ\u000b", new Object[]{"bitField0_", "activeDeviceId_", "newVolume_", "oldVolume_", "stepsDownAfter_", "totalVolumeDecrease_", "applicationState_", "currentRouteType_", "isSocialConnect_", "requestingFeature_", "isConnectedToEntity_", "deviceModel_", "deviceBrand_"});
        }
        if (iOrdinal == 3) {
            return new ConnectPossibleVolumeSpike();
        }
        if (iOrdinal == 4) {
            return new e5l(DEFAULT_INSTANCE);
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
        synchronized (ConnectPossibleVolumeSpike.class) {
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
        this.bitField0_ |= 1;
        this.activeDeviceId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.applicationState_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 64;
        this.currentRouteType_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.deviceBrand_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.deviceModel_ = str;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 512;
        this.isConnectedToEntity_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.bitField0_ |= 128;
        this.isSocialConnect_ = z;
    }

    public final void v(float f) {
        this.bitField0_ |= 2;
        this.newVolume_ = f;
    }

    public final void w(float f) {
        this.bitField0_ |= 4;
        this.oldVolume_ = f;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.requestingFeature_ = str;
    }

    public final void y(int i) {
        this.bitField0_ |= 8;
        this.stepsDownAfter_ = i;
    }

    public final void z(float f) {
        this.bitField0_ |= 16;
        this.totalVolumeDecrease_ = f;
    }
}
