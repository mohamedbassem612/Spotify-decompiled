package com.spotify.devicelocation.configurationimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jtt;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeviceLocationWrite extends h implements v2j0 {
    public static final int ACCURACY_METERS_FIELD_NUMBER = 3;
    private static final DeviceLocationWrite DEFAULT_INSTANCE;
    public static final int HTTP_STATUS_FIELD_NUMBER = 2;
    public static final int OUTCOME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private double accuracyMeters_;
    private int bitField0_;
    private int httpStatus_;
    private String outcome_ = "";
    private String source_ = "";

    static {
        DeviceLocationWrite deviceLocationWrite = new DeviceLocationWrite();
        DEFAULT_INSTANCE = deviceLocationWrite;
        h.registerDefaultInstance(DeviceLocationWrite.class, deviceLocationWrite);
    }

    private DeviceLocationWrite() {
    }

    public static jtt n() {
        return (jtt) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003က\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "outcome_", "httpStatus_", "accuracyMeters_", "source_"});
        }
        if (iOrdinal == 3) {
            return new DeviceLocationWrite();
        }
        if (iOrdinal == 4) {
            return new jtt(DEFAULT_INSTANCE);
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
        synchronized (DeviceLocationWrite.class) {
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
        this.bitField0_ |= 4;
        this.accuracyMeters_ = d;
    }

    public final void p(int i) {
        this.bitField0_ |= 2;
        this.httpStatus_ = i;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.outcome_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 8;
        this.source_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
