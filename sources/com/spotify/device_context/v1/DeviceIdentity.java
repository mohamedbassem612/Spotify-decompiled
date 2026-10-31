package com.spotify.device_context.v1;

import com.google.protobuf.h;
import com.spotify.ubiquity.v1.ExternalAccessoryDescription;
import p.bf40;
import p.h290;
import p.jf40;
import p.pqt;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class DeviceIdentity extends h implements v2j0 {
    public static final int AP_PLATFORM_STRING_FIELD_NUMBER = 11;
    public static final int BRAND_FIELD_NUMBER = 5;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final DeviceIdentity DEFAULT_INSTANCE;
    public static final int DESKTOP_FORM_FACTOR_FIELD_NUMBER = 13;
    public static final int DISPLAY_SPECS_FIELD_NUMBER = 9;
    public static final int EXTERNAL_ACCESSORY_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int MANUFACTURER_FIELD_NUMBER = 7;
    public static final int MODEL_FIELD_NUMBER = 6;
    public static final int OS_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 4;
    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    public static final int RESTRICTION_ID_FIELD_NUMBER = 12;
    public static final int VERSIONS_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean desktopFormFactor_;
    private DisplaySpecs displaySpecs_;
    private ExternalAccessoryDescription externalAccessoryDescription_;
    private String clientId_ = "";
    private String productId_ = "";
    private h290 versions_ = h.emptyProtobufList();
    private String platform_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String manufacturer_ = "";
    private String os_ = "";
    private String apPlatformString_ = "";
    private String restrictionId_ = "";

    static {
        DeviceIdentity deviceIdentity = new DeviceIdentity();
        DEFAULT_INSTANCE = deviceIdentity;
        h.registerDefaultInstance(DeviceIdentity.class, deviceIdentity);
    }

    private DeviceIdentity() {
    }

    public static pqt n() {
        return (pqt) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u001b\u0004ለ\u0002\u0005ለ\u0003\u0006ለ\u0004\u0007ለ\u0005\bለ\u0006\tဉ\u0007\nဉ\b\u000bለ\t\fለ\n\rဇ\u000b", new Object[]{"bitField0_", "clientId_", "productId_", "versions_", ComponentVersion.class, "platform_", "brand_", "model_", "manufacturer_", "os_", "displaySpecs_", "externalAccessoryDescription_", "apPlatformString_", "restrictionId_", "desktopFormFactor_"});
        }
        if (iOrdinal == 3) {
            return new DeviceIdentity();
        }
        if (iOrdinal == 4) {
            return new pqt(DEFAULT_INSTANCE);
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
        synchronized (DeviceIdentity.class) {
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

    public final void o(ExternalAccessoryDescription externalAccessoryDescription) {
        this.externalAccessoryDescription_ = externalAccessoryDescription;
        this.bitField0_ |= 256;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
