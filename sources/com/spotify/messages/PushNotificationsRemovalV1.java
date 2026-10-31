package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.rwy0;
import p.s2j0;
import p.swy0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PushNotificationsRemovalV1 extends com.google.protobuf.h implements v2j0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 1;
    private static final PushNotificationsRemovalV1 DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 5;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVAL_DATA_FIELD_NUMBER = 4;
    public static final int REMOVAL_MECHANISM_FIELD_NUMBER = 3;
    public static final int REMOVAL_STRATEGY_FIELD_NUMBER = 2;
    public static final int REQUESTING_FEATURE_FIELD_NUMBER = 7;
    private int bitField0_;
    private qng0 removalData_ = qng0.b;
    private String appDeviceId_ = "";
    private String removalStrategy_ = "";
    private String removalMechanism_ = "";
    private String messageId_ = "";
    private String opportunityId_ = "";
    private String requestingFeature_ = "";

    static {
        PushNotificationsRemovalV1 pushNotificationsRemovalV1 = new PushNotificationsRemovalV1();
        DEFAULT_INSTANCE = pushNotificationsRemovalV1;
        com.google.protobuf.h.registerDefaultInstance(PushNotificationsRemovalV1.class, pushNotificationsRemovalV1);
    }

    private PushNotificationsRemovalV1() {
    }

    public static rwy0 o() {
        return (rwy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"bitField0_", "appDeviceId_", "removalStrategy_", "removalMechanism_", "removalData_", swy0.a, "messageId_", "opportunityId_", "requestingFeature_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationsRemovalV1();
        }
        if (iOrdinal == 4) {
            return new rwy0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationsRemovalV1.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.removalData_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.removalData_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.appDeviceId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 8;
        this.messageId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 16;
        this.opportunityId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.removalMechanism_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 2;
        this.removalStrategy_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 32;
        this.requestingFeature_ = str;
    }
}
