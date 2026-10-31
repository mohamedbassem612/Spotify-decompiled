package com.spotify.messages;

import p.bf40;
import p.gqy0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PuffinHeadphonesNotSupportedEvent extends com.google.protobuf.h implements v2j0 {
    private static final PuffinHeadphonesNotSupportedEvent DEFAULT_INSTANCE;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_BRAND_FIELD_NUMBER = 2;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_MODEL_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VENDOR_NAME_FIELD_NUMBER = 4;
    public static final int WAS_PREDICTED_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean wasPredicted_;
    private String name_ = "";
    private String externalAccessoryMappingPredictedBrand_ = "";
    private String externalAccessoryMappingPredictedModel_ = "";
    private String vendorName_ = "";

    static {
        PuffinHeadphonesNotSupportedEvent puffinHeadphonesNotSupportedEvent = new PuffinHeadphonesNotSupportedEvent();
        DEFAULT_INSTANCE = puffinHeadphonesNotSupportedEvent;
        com.google.protobuf.h.registerDefaultInstance(PuffinHeadphonesNotSupportedEvent.class, puffinHeadphonesNotSupportedEvent);
    }

    private PuffinHeadphonesNotSupportedEvent() {
    }

    public static gqy0 n() {
        return (gqy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "name_", "externalAccessoryMappingPredictedBrand_", "externalAccessoryMappingPredictedModel_", "vendorName_", "wasPredicted_"});
        }
        if (iOrdinal == 3) {
            return new PuffinHeadphonesNotSupportedEvent();
        }
        if (iOrdinal == 4) {
            return new gqy0(DEFAULT_INSTANCE);
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
        synchronized (PuffinHeadphonesNotSupportedEvent.class) {
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
        this.bitField0_ |= 2;
        this.externalAccessoryMappingPredictedBrand_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.externalAccessoryMappingPredictedModel_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 16;
        this.wasPredicted_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
