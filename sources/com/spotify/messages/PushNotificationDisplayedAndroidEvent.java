package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yvy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PushNotificationDisplayedAndroidEvent extends com.google.protobuf.h implements v2j0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 3;
    private static final PushNotificationDisplayedAndroidEvent DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 6;
    public static final int IS_OS_NOTIFICATIONS_ENABLED_FIELD_NUMBER = 8;
    public static final int IS_SUCCESS_FIELD_NUMBER = 4;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_URI_FIELD_NUMBER = 7;
    public static final int UI_DOWNGRADE_REASON_FIELD_NUMBER = 5;
    public static final int UUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOsNotificationsEnabled_;
    private boolean isSuccess_;
    private String uuid_ = "";
    private String messageId_ = "";
    private String appDeviceId_ = "";
    private String uiDowngradeReason_ = "";
    private String error_ = "";
    private String targetUri_ = "";

    static {
        PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent = new PushNotificationDisplayedAndroidEvent();
        DEFAULT_INSTANCE = pushNotificationDisplayedAndroidEvent;
        com.google.protobuf.h.registerDefaultInstance(PushNotificationDisplayedAndroidEvent.class, pushNotificationDisplayedAndroidEvent);
    }

    private PushNotificationDisplayedAndroidEvent() {
    }

    public static yvy0 n() {
        return (yvy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"bitField0_", "uuid_", "messageId_", "appDeviceId_", "isSuccess_", "uiDowngradeReason_", "error_", "targetUri_", "isOsNotificationsEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationDisplayedAndroidEvent();
        }
        if (iOrdinal == 4) {
            return new yvy0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationDisplayedAndroidEvent.class) {
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
        this.bitField0_ |= 4;
        this.appDeviceId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.error_ = str;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 128;
        this.isOsNotificationsEnabled_ = z;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 8;
        this.isSuccess_ = z;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.messageId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.targetUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.uiDowngradeReason_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.uuid_ = str;
    }
}
