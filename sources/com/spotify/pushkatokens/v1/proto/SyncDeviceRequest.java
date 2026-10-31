package com.spotify.pushkatokens.v1.proto;

import android.os.Build;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kcd1;
import p.mcd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SyncDeviceRequest extends h implements v2j0 {
    public static final int ANDROID_FIELD_NUMBER = 1;
    public static final int APP_ID_FIELD_NUMBER = 3;
    private static final SyncDeviceRequest DEFAULT_INSTANCE;
    public static final int DEVICE_STATE_FIELD_NUMBER = 7;
    public static final int ENVIRONMENT_FIELD_NUMBER = 5;
    public static final int OS_VERSION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIOUS_TOKEN_FIELD_NUMBER = 6;
    public static final int SYNC_REASON_FIELD_NUMBER = 8;
    private int bitField0_;
    private DeviceState deviceState_;
    private Object pushToken_;
    private int syncReason_;
    private int pushTokenCase_ = 0;
    private String appId_ = "";
    private String osVersion_ = "";
    private String environment_ = "";
    private String previousToken_ = "";

    static {
        SyncDeviceRequest syncDeviceRequest = new SyncDeviceRequest();
        DEFAULT_INSTANCE = syncDeviceRequest;
        h.registerDefaultInstance(SyncDeviceRequest.class, syncDeviceRequest);
    }

    private SyncDeviceRequest() {
    }

    public static kcd1 n() {
        return (kcd1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001<\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ለ\u0000\u0007ဉ\u0001\b\f", new Object[]{"pushToken_", "pushTokenCase_", "bitField0_", AndroidPushToken.class, "appId_", "osVersion_", "environment_", "previousToken_", "deviceState_", "syncReason_"});
        }
        if (iOrdinal == 3) {
            return new SyncDeviceRequest();
        }
        if (iOrdinal == 4) {
            return new kcd1(DEFAULT_INSTANCE);
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
        synchronized (SyncDeviceRequest.class) {
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

    public final void o(AndroidPushToken androidPushToken) {
        this.pushToken_ = androidPushToken;
        this.pushTokenCase_ = 1;
    }

    public final void p(String str) {
        this.appId_ = str;
    }

    public final void q(DeviceState deviceState) {
        deviceState.getClass();
        this.deviceState_ = deviceState;
        this.bitField0_ |= 2;
    }

    public final void r() {
        this.environment_ = "prod";
    }

    public final void s() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        this.osVersion_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.previousToken_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(mcd1 mcd1Var) {
        this.syncReason_ = mcd1Var.getNumber();
    }
}
