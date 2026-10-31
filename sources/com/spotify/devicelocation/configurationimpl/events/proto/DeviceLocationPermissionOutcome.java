package com.spotify.devicelocation.configurationimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vrt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeviceLocationPermissionOutcome extends h implements v2j0 {
    private static final DeviceLocationPermissionOutcome DEFAULT_INSTANCE;
    public static final int LOCATION_SERVICES_ENABLED_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_STATUS_FIELD_NUMBER = 1;
    public static final int PREVIOUS_STATUS_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean locationServicesEnabled_;
    private String permissionStatus_ = "";
    private String previousStatus_ = "";
    private String source_ = "";

    static {
        DeviceLocationPermissionOutcome deviceLocationPermissionOutcome = new DeviceLocationPermissionOutcome();
        DEFAULT_INSTANCE = deviceLocationPermissionOutcome;
        h.registerDefaultInstance(DeviceLocationPermissionOutcome.class, deviceLocationPermissionOutcome);
    }

    private DeviceLocationPermissionOutcome() {
    }

    public static vrt n() {
        return (vrt) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "permissionStatus_", "previousStatus_", "locationServicesEnabled_", "source_"});
        }
        if (iOrdinal == 3) {
            return new DeviceLocationPermissionOutcome();
        }
        if (iOrdinal == 4) {
            return new vrt(DEFAULT_INSTANCE);
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
        synchronized (DeviceLocationPermissionOutcome.class) {
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
        this.bitField0_ |= 4;
        this.locationServicesEnabled_ = z;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.permissionStatus_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.previousStatus_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 8;
        this.source_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
