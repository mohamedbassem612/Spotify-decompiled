package com.spotify.carmobile.cardetection.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mqd;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CarDetectionEvent extends h implements v2j0 {
    private static final CarDetectionEvent DEFAULT_INSTANCE;
    public static final int IS_CAR_CONNECTED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isCarConnected_;
    private String reason_ = "";

    static {
        CarDetectionEvent carDetectionEvent = new CarDetectionEvent();
        DEFAULT_INSTANCE = carDetectionEvent;
        h.registerDefaultInstance(CarDetectionEvent.class, carDetectionEvent);
    }

    private CarDetectionEvent() {
    }

    public static mqd n() {
        return (mqd) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "isCarConnected_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new CarDetectionEvent();
        }
        if (iOrdinal == 4) {
            return new mqd(DEFAULT_INSTANCE);
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
        synchronized (CarDetectionEvent.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 1;
        this.isCarConnected_ = z;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.reason_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
