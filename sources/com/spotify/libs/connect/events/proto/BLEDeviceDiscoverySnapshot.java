package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ci9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class BLEDeviceDiscoverySnapshot extends h implements v2j0 {
    public static final int BLE_DEVICE_ID_FIELD_NUMBER = 2;
    public static final int CAPABILITIES_FIELD_NUMBER = 6;
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 7;
    private static final BLEDeviceDiscoverySnapshot DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    public static final int LOCAL_TIME_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 5;
    public static final int REASON_FIELD_NUMBER = 8;
    public static final int RSSI_FIELD_NUMBER = 4;
    public static final int SNAPSHOT_ID_FIELD_NUMBER = 1;
    public static final int TIMEZONE_FIELD_NUMBER = 10;
    private int bitField0_;
    private int capabilities_;
    private int rssi_;
    private String snapshotId_ = "";
    private String bleDeviceId_ = "";
    private String deviceType_ = "";
    private String range_ = "";
    private String connectStateIdentifier_ = "";
    private String reason_ = "";
    private String localTime_ = "";
    private String timezone_ = "";

    static {
        BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot = new BLEDeviceDiscoverySnapshot();
        DEFAULT_INSTANCE = bLEDeviceDiscoverySnapshot;
        h.registerDefaultInstance(BLEDeviceDiscoverySnapshot.class, bLEDeviceDiscoverySnapshot);
    }

    private BLEDeviceDiscoverySnapshot() {
    }

    public static ci9 n() {
        return (ci9) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "snapshotId_", "bleDeviceId_", "deviceType_", "rssi_", "range_", "capabilities_", "connectStateIdentifier_", "reason_", "localTime_", "timezone_"});
        }
        if (iOrdinal == 3) {
            return new BLEDeviceDiscoverySnapshot();
        }
        if (iOrdinal == 4) {
            return new ci9(DEFAULT_INSTANCE);
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
        synchronized (BLEDeviceDiscoverySnapshot.class) {
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
        this.bitField0_ |= 2;
        this.bleDeviceId_ = str;
    }

    public final void p(int i) {
        this.bitField0_ |= 32;
        this.capabilities_ = i;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.connectStateIdentifier_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.deviceType_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.localTime_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.range_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 128;
        this.reason_ = str;
    }

    public final void v(int i) {
        this.bitField0_ |= 8;
        this.rssi_ = i;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.snapshotId_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.timezone_ = str;
    }
}
