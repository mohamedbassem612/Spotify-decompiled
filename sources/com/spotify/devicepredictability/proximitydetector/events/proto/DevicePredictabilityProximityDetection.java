package com.spotify.devicepredictability.proximitydetector.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.mut;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DevicePredictabilityProximityDetection extends h implements v2j0 {
    public static final int CONTENT_HAS_VIDEO_FIELD_NUMBER = 5;
    public static final int CONTENT_IS_PLAYING_FIELD_NUMBER = 6;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    private static final DevicePredictabilityProximityDetection DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROXIMITY_INDICATORS_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean contentHasVideo_;
    private boolean contentIsPlaying_;
    private String deviceId_ = "";
    private String deviceType_ = "";
    private h290 proximityIndicators_ = h.emptyProtobufList();
    private String contentType_ = "";

    static {
        DevicePredictabilityProximityDetection devicePredictabilityProximityDetection = new DevicePredictabilityProximityDetection();
        DEFAULT_INSTANCE = devicePredictabilityProximityDetection;
        h.registerDefaultInstance(DevicePredictabilityProximityDetection.class, devicePredictabilityProximityDetection);
    }

    private DevicePredictabilityProximityDetection() {
    }

    public static mut o() {
        return (mut) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "deviceId_", "deviceType_", "proximityIndicators_", "contentType_", "contentHasVideo_", "contentIsPlaying_"});
        }
        if (iOrdinal == 3) {
            return new DevicePredictabilityProximityDetection();
        }
        if (iOrdinal == 4) {
            return new mut(DEFAULT_INSTANCE);
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
        synchronized (DevicePredictabilityProximityDetection.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.proximityIndicators_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.proximityIndicators_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(boolean z) {
        this.bitField0_ |= 8;
        this.contentHasVideo_ = z;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 16;
        this.contentIsPlaying_ = z;
    }

    public final void r(String str) {
        this.bitField0_ |= 4;
        this.contentType_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.deviceId_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 2;
        this.deviceType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
