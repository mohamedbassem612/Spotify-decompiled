package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qwy0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PushNotificationsReceivedV1 extends com.google.protobuf.h implements v2j0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 4;
    public static final int APP_STATE_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static final PushNotificationsReceivedV1 DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PUSH_ID_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private long timestampMs_;
    private String pushId_ = "";
    private String campaignId_ = "";
    private String appDeviceId_ = "";
    private String appState_ = "";

    static {
        PushNotificationsReceivedV1 pushNotificationsReceivedV1 = new PushNotificationsReceivedV1();
        DEFAULT_INSTANCE = pushNotificationsReceivedV1;
        com.google.protobuf.h.registerDefaultInstance(PushNotificationsReceivedV1.class, pushNotificationsReceivedV1);
    }

    private PushNotificationsReceivedV1() {
    }

    public static qwy0 n() {
        return (qwy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "pushId_", "campaignId_", "timestampMs_", "appDeviceId_", "appState_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationsReceivedV1();
        }
        if (iOrdinal == 4) {
            return new qwy0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationsReceivedV1.class) {
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
        this.bitField0_ |= 8;
        this.appDeviceId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 16;
        this.appState_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.pushId_ = str;
    }

    public final void s(long j) {
        this.bitField0_ |= 4;
        this.timestampMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
