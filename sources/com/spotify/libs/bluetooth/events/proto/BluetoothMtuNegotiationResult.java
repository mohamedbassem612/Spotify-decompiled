package com.spotify.libs.bluetooth.events.proto;

import android.os.Build;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zjb;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class BluetoothMtuNegotiationResult extends h implements v2j0 {
    public static final int ANDROID_SDK_VERSION_FIELD_NUMBER = 5;
    public static final int CONNECTION_ID_HASH_FIELD_NUMBER = 1;
    private static final BluetoothMtuNegotiationResult DEFAULT_INSTANCE;
    public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 6;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
    public static final int GATT_STATUS_FIELD_NUMBER = 4;
    public static final int NEGOTIATED_MTU_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTED_MTU_FIELD_NUMBER = 2;
    private int androidSdkVersion_;
    private int bitField0_;
    private String connectionIdHash_ = "";
    private String deviceManufacturer_ = "";
    private String deviceModel_ = "";
    private int gattStatus_;
    private int negotiatedMtu_;
    private int requestedMtu_;

    static {
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = new BluetoothMtuNegotiationResult();
        DEFAULT_INSTANCE = bluetoothMtuNegotiationResult;
        h.registerDefaultInstance(BluetoothMtuNegotiationResult.class, bluetoothMtuNegotiationResult);
    }

    private BluetoothMtuNegotiationResult() {
    }

    public static zjb n() {
        return (zjb) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "connectionIdHash_", "requestedMtu_", "negotiatedMtu_", "gattStatus_", "androidSdkVersion_", "deviceManufacturer_", "deviceModel_"});
        }
        if (iOrdinal == 3) {
            return new BluetoothMtuNegotiationResult();
        }
        if (iOrdinal == 4) {
            return new zjb(DEFAULT_INSTANCE);
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
        synchronized (BluetoothMtuNegotiationResult.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 16;
        this.androidSdkVersion_ = i;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.connectionIdHash_ = str;
    }

    public final void q() {
        String str = Build.MANUFACTURER;
        str.getClass();
        this.bitField0_ |= 32;
        this.deviceManufacturer_ = str;
    }

    public final void r() {
        String str = Build.MODEL;
        str.getClass();
        this.bitField0_ |= 64;
        this.deviceModel_ = str;
    }

    public final void s(int i) {
        this.bitField0_ |= 8;
        this.gattStatus_ = i;
    }

    public final void t(int i) {
        this.bitField0_ |= 4;
        this.negotiatedMtu_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 2;
        this.requestedMtu_ = i;
    }
}
