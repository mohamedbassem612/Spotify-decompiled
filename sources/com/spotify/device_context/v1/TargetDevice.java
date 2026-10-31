package com.spotify.device_context.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.krd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TargetDevice extends h implements v2j0 {
    private static final TargetDevice DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTITY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REPORTED_ATTRIBUTES_FIELD_NUMBER = 2;
    private int bitField0_;
    private DeviceIdentity deviceIdentity_;
    private ReportedAttributes reportedAttributes_;

    static {
        TargetDevice targetDevice = new TargetDevice();
        DEFAULT_INSTANCE = targetDevice;
        h.registerDefaultInstance(TargetDevice.class, targetDevice);
    }

    private TargetDevice() {
    }

    public static krd1 n() {
        return (krd1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "deviceIdentity_", "reportedAttributes_"});
        }
        if (iOrdinal == 3) {
            return new TargetDevice();
        }
        if (iOrdinal == 4) {
            return new krd1(DEFAULT_INSTANCE);
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
        synchronized (TargetDevice.class) {
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

    public final void o(DeviceIdentity deviceIdentity) {
        deviceIdentity.getClass();
        this.deviceIdentity_ = deviceIdentity;
        this.bitField0_ |= 1;
    }

    public final void p(ReportedAttributes reportedAttributes) {
        reportedAttributes.getClass();
        this.reportedAttributes_ = reportedAttributes;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
