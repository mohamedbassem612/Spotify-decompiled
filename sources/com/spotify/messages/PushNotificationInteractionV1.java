package com.spotify.messages;

import p.awy0;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PushNotificationInteractionV1 extends com.google.protobuf.h implements v2j0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 6;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 3;
    public static final int DATA_FIELD_NUMBER = 4;
    private static final PushNotificationInteractionV1 DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PUSH_ID_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 5;
    private int bitField0_;
    private long timestampMs_;
    private String eventType_ = "";
    private String pushId_ = "";
    private String campaignId_ = "";
    private String data_ = "";
    private String appDeviceId_ = "";

    static {
        PushNotificationInteractionV1 pushNotificationInteractionV1 = new PushNotificationInteractionV1();
        DEFAULT_INSTANCE = pushNotificationInteractionV1;
        com.google.protobuf.h.registerDefaultInstance(PushNotificationInteractionV1.class, pushNotificationInteractionV1);
    }

    private PushNotificationInteractionV1() {
    }

    public static awy0 n() {
        return (awy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "eventType_", "pushId_", "campaignId_", "data_", "timestampMs_", "appDeviceId_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationInteractionV1();
        }
        if (iOrdinal == 4) {
            return new awy0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationInteractionV1.class) {
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
        this.appDeviceId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.campaignId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.data_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.eventType_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.pushId_ = str;
    }

    public final void t(long j) {
        this.bitField0_ |= 16;
        this.timestampMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
