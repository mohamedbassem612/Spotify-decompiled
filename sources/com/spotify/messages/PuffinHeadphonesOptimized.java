package com.spotify.messages;

import p.bf40;
import p.hqy0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PuffinHeadphonesOptimized extends com.google.protobuf.h implements v2j0 {
    private static final PuffinHeadphonesOptimized DEFAULT_INSTANCE;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_BRAND_FIELD_NUMBER = 6;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_MODEL_FIELD_NUMBER = 7;
    public static final int FILTER_BRAND_FIELD_NUMBER = 2;
    public static final int FILTER_MODEL_FIELD_NUMBER = 3;
    public static final int HAS_TUNER_FIELD_NUMBER = 1;
    public static final int HEADPHONE_NAME_OVER_BLUETOOTH_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int WAS_AMBIGUOUS_FIELD_NUMBER = 9;
    public static final int WAS_MANUALLY_SELECTED_FIELD_NUMBER = 10;
    public static final int WAS_MATCHED_FIELD_NUMBER = 8;
    public static final int WAS_PREDICTED_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hasTuner_;
    private boolean wasAmbiguous_;
    private boolean wasManuallySelected_;
    private boolean wasMatched_;
    private boolean wasPredicted_;
    private String filterBrand_ = "";
    private String filterModel_ = "";
    private String headphoneNameOverBluetooth_ = "";
    private String externalAccessoryMappingPredictedBrand_ = "";
    private String externalAccessoryMappingPredictedModel_ = "";

    static {
        PuffinHeadphonesOptimized puffinHeadphonesOptimized = new PuffinHeadphonesOptimized();
        DEFAULT_INSTANCE = puffinHeadphonesOptimized;
        com.google.protobuf.h.registerDefaultInstance(PuffinHeadphonesOptimized.class, puffinHeadphonesOptimized);
    }

    private PuffinHeadphonesOptimized() {
    }

    public static hqy0 n() {
        return (hqy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"bitField0_", "hasTuner_", "filterBrand_", "filterModel_", "wasPredicted_", "headphoneNameOverBluetooth_", "externalAccessoryMappingPredictedBrand_", "externalAccessoryMappingPredictedModel_", "wasMatched_", "wasAmbiguous_", "wasManuallySelected_"});
        }
        if (iOrdinal == 3) {
            return new PuffinHeadphonesOptimized();
        }
        if (iOrdinal == 4) {
            return new hqy0(DEFAULT_INSTANCE);
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
        synchronized (PuffinHeadphonesOptimized.class) {
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
        this.bitField0_ |= 32;
        this.externalAccessoryMappingPredictedBrand_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.externalAccessoryMappingPredictedModel_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.filterBrand_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.filterModel_ = str;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 1;
        this.hasTuner_ = z;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.headphoneNameOverBluetooth_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.bitField0_ |= 256;
        this.wasAmbiguous_ = z;
    }

    public final void v(boolean z) {
        this.bitField0_ |= 512;
        this.wasManuallySelected_ = z;
    }

    public final void w(boolean z) {
        this.bitField0_ |= 128;
        this.wasMatched_ = z;
    }

    public final void x(boolean z) {
        this.bitField0_ |= 8;
        this.wasPredicted_ = z;
    }
}
