package com.spotify.devicelocation.configurationimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ort;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeviceLocationFixOutcome extends h implements v2j0 {
    public static final int ACCURACY_METERS_FIELD_NUMBER = 4;
    private static final DeviceLocationFixOutcome DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 2;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int LOCATION_UNKNOWN_COUNT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int SOURCE_FIELD_NUMBER = 6;
    private double accuracyMeters_;
    private int bitField0_;
    private long durationMs_;
    private int locationUnknownCount_;
    private String result_ = "";
    private String errorReason_ = "";
    private String source_ = "";

    static {
        DeviceLocationFixOutcome deviceLocationFixOutcome = new DeviceLocationFixOutcome();
        DEFAULT_INSTANCE = deviceLocationFixOutcome;
        h.registerDefaultInstance(DeviceLocationFixOutcome.class, deviceLocationFixOutcome);
    }

    private DeviceLocationFixOutcome() {
    }

    public static ort n() {
        return (ort) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004က\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "result_", "durationMs_", "errorReason_", "accuracyMeters_", "locationUnknownCount_", "source_"});
        }
        if (iOrdinal == 3) {
            return new DeviceLocationFixOutcome();
        }
        if (iOrdinal == 4) {
            return new ort(DEFAULT_INSTANCE);
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
        synchronized (DeviceLocationFixOutcome.class) {
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
        this.bitField0_ |= 8;
        this.accuracyMeters_ = d;
    }

    public final void p(long j) {
        this.bitField0_ |= 2;
        this.durationMs_ = j;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.errorReason_ = str;
    }

    public final void r() {
        this.bitField0_ |= 16;
        this.locationUnknownCount_ = -1;
    }

    public final void s(String str) {
        this.bitField0_ |= 1;
        this.result_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 32;
        this.source_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
