package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zuy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PushAndroidDeviceSettingsV1 extends com.google.protobuf.h implements v2j0 {
    private static final PushAndroidDeviceSettingsV1 DEFAULT_INSTANCE;
    public static final int DEVICE_LANGUAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PUSH_NOTIFICATIONS_ENABLED_FIELD_NUMBER = 3;
    public static final int SCREEN_READER_ENABLED_FIELD_NUMBER = 2;
    private int bitField0_;
    private String deviceLanguage_ = "";
    private boolean pushNotificationsEnabled_;
    private boolean screenReaderEnabled_;

    static {
        PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1 = new PushAndroidDeviceSettingsV1();
        DEFAULT_INSTANCE = pushAndroidDeviceSettingsV1;
        com.google.protobuf.h.registerDefaultInstance(PushAndroidDeviceSettingsV1.class, pushAndroidDeviceSettingsV1);
    }

    private PushAndroidDeviceSettingsV1() {
    }

    public static zuy0 n() {
        return (zuy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "deviceLanguage_", "screenReaderEnabled_", "pushNotificationsEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PushAndroidDeviceSettingsV1();
        }
        if (iOrdinal == 4) {
            return new zuy0(DEFAULT_INSTANCE);
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
        synchronized (PushAndroidDeviceSettingsV1.class) {
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
        this.bitField0_ |= 1;
        this.deviceLanguage_ = str;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 4;
        this.pushNotificationsEnabled_ = z;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 2;
        this.screenReaderEnabled_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
