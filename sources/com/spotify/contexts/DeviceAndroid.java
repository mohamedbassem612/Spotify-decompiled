package com.spotify.contexts;

import android.os.Build;
import android.util.DisplayMetrics;
import com.google.protobuf.h;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import p.bf40;
import p.jf40;
import p.jpt;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class DeviceAndroid extends h implements v2j0 {
    public static final int ANDROID_ID_FIELD_NUMBER = 5;
    private static final DeviceAndroid DEFAULT_INSTANCE;
    public static final int HAS_FEATURE_AUTOMOTIVE_FIELD_NUMBER = 12;
    public static final int HAS_FEATURE_DESKTOP_FIELD_NUMBER = 14;
    public static final int HAS_FEATURE_WATCH_FIELD_NUMBER = 13;
    public static final int HINGE_SENSOR_ANGLE_FIELD_NUMBER = 11;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RELEASE_FIELD_NUMBER = 3;
    public static final int SCREEN_DENSITY_CURRENT_FIELD_NUMBER = 9;
    public static final int SCREEN_DENSITY_STABLE_FIELD_NUMBER = 8;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 7;
    public static final int SCREEN_SMALLEST_WIDTH_DP_FIELD_NUMBER = 10;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 6;
    public static final int SDK_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hasFeatureAutomotive_;
    private boolean hasFeatureDesktop_;
    private boolean hasFeatureWatch_;
    private float hingeSensorAngle_;
    private int screenDensityCurrent_;
    private int screenDensityStable_;
    private int screenHeight_;
    private int screenSmallestWidthDp_;
    private int screenWidth_;
    private int sdk_;
    private String manufacturer_ = "";
    private String model_ = "";
    private String release_ = "";
    private String androidId_ = "";

    static {
        DeviceAndroid deviceAndroid = new DeviceAndroid();
        DEFAULT_INSTANCE = deviceAndroid;
        h.registerDefaultInstance(DeviceAndroid.class, deviceAndroid);
    }

    private DeviceAndroid() {
    }

    public static jpt o() {
        return (jpt) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeviceAndroid p(phc phcVar) {
        return (DeviceAndroid) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(int i) {
        this.bitField0_ |= 64;
        this.screenHeight_ = i;
    }

    public final void B(int i) {
        this.bitField0_ |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        this.screenSmallestWidthDp_ = i;
    }

    public final void C(int i) {
        this.bitField0_ |= 32;
        this.screenWidth_ = i;
    }

    public final void D(int i) {
        this.bitField0_ |= 8;
        this.sdk_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bခ\n\fဇ\u000b\rဇ\f\u000eဇ\r", new Object[]{"bitField0_", "manufacturer_", "model_", "release_", "sdk_", "androidId_", "screenWidth_", "screenHeight_", "screenDensityStable_", "screenDensityCurrent_", "screenSmallestWidthDp_", "hingeSensorAngle_", "hasFeatureAutomotive_", "hasFeatureWatch_", "hasFeatureDesktop_"});
        }
        if (iOrdinal == 3) {
            return new DeviceAndroid();
        }
        if (iOrdinal == 4) {
            return new jpt(DEFAULT_INSTANCE);
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
        synchronized (DeviceAndroid.class) {
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

    public final String n() {
        return this.androidId_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(String str) {
        this.bitField0_ |= 16;
        this.androidId_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 2048;
        this.hasFeatureAutomotive_ = z;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 8192;
        this.hasFeatureDesktop_ = z;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 4096;
        this.hasFeatureWatch_ = z;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(float f) {
        this.bitField0_ |= 1024;
        this.hingeSensorAngle_ = f;
    }

    public final void v() {
        String str = Build.MANUFACTURER;
        str.getClass();
        this.bitField0_ |= 1;
        this.manufacturer_ = str;
    }

    public final void w() {
        String str = Build.MODEL;
        str.getClass();
        this.bitField0_ |= 2;
        this.model_ = str;
    }

    public final void x() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        this.bitField0_ |= 4;
        this.release_ = str;
    }

    public final void y(int i) {
        this.bitField0_ |= 256;
        this.screenDensityCurrent_ = i;
    }

    public final void z() {
        int i = DisplayMetrics.DENSITY_DEVICE_STABLE;
        this.bitField0_ |= 128;
        this.screenDensityStable_ = i;
    }
}
