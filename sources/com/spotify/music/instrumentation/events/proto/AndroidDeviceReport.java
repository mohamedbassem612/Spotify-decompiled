package com.spotify.music.instrumentation.events.proto;

import android.os.Build;
import com.google.protobuf.h;
import p.bf40;
import p.gd4;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AndroidDeviceReport extends h implements v2j0 {
    public static final int BRAND_FIELD_NUMBER = 13;
    public static final int CPU_FAMILY_FIELD_NUMBER = 11;
    public static final int CPU_FEATURES_FIELD_NUMBER = 10;
    private static final AndroidDeviceReport DEFAULT_INSTANCE;
    public static final int FB_YEARCLASS_FIELD_NUMBER = 9;
    public static final int FIRMWARE_FIELD_NUMBER = 2;
    public static final int GPU_MODEL_FIELD_NUMBER = 16;
    public static final int GPU_VENDOR_FIELD_NUMBER = 15;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MAX_FREQ_FIELD_NUMBER = 4;
    public static final int MEMORY_FIELD_NUMBER = 5;
    public static final int MODEL_FIELD_NUMBER = 12;
    public static final int NUM_PROCESSORS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERFORMANCE_CLASS_FIELD_NUMBER = 14;
    public static final int SCREEN_DENSITY_DPI_FIELD_NUMBER = 19;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 8;
    public static final int SCREEN_SIZE_FIELD_NUMBER = 6;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 7;
    public static final int SOC_MANUFACTURER_FIELD_NUMBER = 17;
    public static final int SOC_MODEL_FIELD_NUMBER = 18;
    private int bitField0_;
    private long cpuFamily_;
    private long cpuFeatures_;
    private long fbYearclass_;
    private long maxFreq_;
    private long memory_;
    private long numProcessors_;
    private long performanceClass_;
    private long screenDensityDpi_;
    private long screenHeight_;
    private float screenSize_;
    private long screenWidth_;
    private String manufacturer_ = "";
    private String firmware_ = "";
    private String model_ = "";
    private String brand_ = "";
    private String gpuVendor_ = "";
    private String gpuModel_ = "";
    private String socManufacturer_ = "";
    private String socModel_ = "";

    static {
        AndroidDeviceReport androidDeviceReport = new AndroidDeviceReport();
        DEFAULT_INSTANCE = androidDeviceReport;
        h.registerDefaultInstance(AndroidDeviceReport.class, androidDeviceReport);
    }

    private AndroidDeviceReport() {
    }

    public static gd4 n() {
        return (gd4) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(long j) {
        this.bitField0_ |= 8192;
        this.performanceClass_ = j;
    }

    public final void B(long j) {
        this.bitField0_ |= 262144;
        this.screenDensityDpi_ = j;
    }

    public final void C(long j) {
        this.bitField0_ |= 128;
        this.screenHeight_ = j;
    }

    public final void D(float f) {
        this.bitField0_ |= 32;
        this.screenSize_ = f;
    }

    public final void E(long j) {
        this.bitField0_ |= 64;
        this.screenWidth_ = j;
    }

    public final void F(String str) {
        this.bitField0_ |= 65536;
        this.socManufacturer_ = str;
    }

    public final void G(String str) {
        this.bitField0_ |= 131072;
        this.socModel_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဈ\u000b\rဈ\f\u000eဂ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0013ဂ\u0012", new Object[]{"bitField0_", "manufacturer_", "firmware_", "numProcessors_", "maxFreq_", "memory_", "screenSize_", "screenWidth_", "screenHeight_", "fbYearclass_", "cpuFeatures_", "cpuFamily_", "model_", "brand_", "performanceClass_", "gpuVendor_", "gpuModel_", "socManufacturer_", "socModel_", "screenDensityDpi_"});
        }
        if (iOrdinal == 3) {
            return new AndroidDeviceReport();
        }
        if (iOrdinal == 4) {
            return new gd4(DEFAULT_INSTANCE);
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
        synchronized (AndroidDeviceReport.class) {
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

    public final void o() {
        String str = Build.BRAND;
        str.getClass();
        this.bitField0_ |= 4096;
        this.brand_ = str;
    }

    public final void p(long j) {
        this.bitField0_ |= 1024;
        this.cpuFamily_ = j;
    }

    public final void q(long j) {
        this.bitField0_ |= 512;
        this.cpuFeatures_ = j;
    }

    public final void r(long j) {
        this.bitField0_ |= 256;
        this.fbYearclass_ = j;
    }

    public final void s() {
        String str = Build.DISPLAY;
        str.getClass();
        this.bitField0_ |= 2;
        this.firmware_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 32768;
        this.gpuModel_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 16384;
        this.gpuVendor_ = str;
    }

    public final void v() {
        String str = Build.MANUFACTURER;
        str.getClass();
        this.bitField0_ |= 1;
        this.manufacturer_ = str;
    }

    public final void w(long j) {
        this.bitField0_ |= 8;
        this.maxFreq_ = j;
    }

    public final void x(long j) {
        this.bitField0_ |= 16;
        this.memory_ = j;
    }

    public final void y() {
        String str = Build.MODEL;
        str.getClass();
        this.bitField0_ |= 2048;
        this.model_ = str;
    }

    public final void z(long j) {
        this.bitField0_ |= 4;
        this.numProcessors_ = j;
    }
}
