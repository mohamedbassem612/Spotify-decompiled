package com.spotify.device_location_service.proto;

import com.google.protobuf.h;
import p.bf40;
import p.htt;
import p.itt;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeviceLocationServiceOuterClass$DeviceLocationResponse extends h implements v2j0 {
    private static final DeviceLocationServiceOuterClass$DeviceLocationResponse DEFAULT_INSTANCE;
    public static final int HORIZONTAL_ACCURACY_FIELD_NUMBER = 4;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 5;
    private double horizontalAccuracy_;
    private double latitude_;
    private double longitude_;
    private int status_;
    private long timestampMs_;

    static {
        DeviceLocationServiceOuterClass$DeviceLocationResponse deviceLocationServiceOuterClass$DeviceLocationResponse = new DeviceLocationServiceOuterClass$DeviceLocationResponse();
        DEFAULT_INSTANCE = deviceLocationServiceOuterClass$DeviceLocationResponse;
        h.registerDefaultInstance(DeviceLocationServiceOuterClass$DeviceLocationResponse.class, deviceLocationServiceOuterClass$DeviceLocationResponse);
    }

    private DeviceLocationServiceOuterClass$DeviceLocationResponse() {
    }

    public static htt n() {
        return (htt) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0002", new Object[]{"status_", "latitude_", "longitude_", "horizontalAccuracy_", "timestampMs_"});
        }
        if (iOrdinal == 3) {
            return new DeviceLocationServiceOuterClass$DeviceLocationResponse();
        }
        if (iOrdinal == 4) {
            return new htt(DEFAULT_INSTANCE);
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
        synchronized (DeviceLocationServiceOuterClass$DeviceLocationResponse.class) {
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

    public final void o(double d) {
        this.horizontalAccuracy_ = d;
    }

    public final void p(double d) {
        this.latitude_ = d;
    }

    public final void q(double d) {
        this.longitude_ = d;
    }

    public final void r(itt ittVar) {
        this.status_ = ittVar.getNumber();
    }

    public final void s(long j) {
        this.timestampMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
