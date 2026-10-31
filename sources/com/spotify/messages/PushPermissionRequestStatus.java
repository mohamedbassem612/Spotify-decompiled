package com.spotify.messages;

import p.bf40;
import p.ixy0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PushPermissionRequestStatus extends com.google.protobuf.h implements v2j0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 7;
    private static final PushPermissionRequestStatus DEFAULT_INSTANCE;
    public static final int OUTCOME_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int STATUS_AFTER_FIELD_NUMBER = 4;
    public static final int STATUS_BEFORE_FIELD_NUMBER = 3;
    public static final int USER_ACTION_FIELD_NUMBER = 5;
    private int bitField0_;
    private String source_ = "";
    private String requestType_ = "";
    private String statusBefore_ = "";
    private String statusAfter_ = "";
    private String userAction_ = "";
    private String outcome_ = "";
    private String appDeviceId_ = "";

    static {
        PushPermissionRequestStatus pushPermissionRequestStatus = new PushPermissionRequestStatus();
        DEFAULT_INSTANCE = pushPermissionRequestStatus;
        com.google.protobuf.h.registerDefaultInstance(PushPermissionRequestStatus.class, pushPermissionRequestStatus);
    }

    private PushPermissionRequestStatus() {
    }

    public static ixy0 n() {
        return (ixy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "source_", "requestType_", "statusBefore_", "statusAfter_", "userAction_", "outcome_", "appDeviceId_"});
        }
        if (iOrdinal == 3) {
            return new PushPermissionRequestStatus();
        }
        if (iOrdinal == 4) {
            return new ixy0(DEFAULT_INSTANCE);
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
        synchronized (PushPermissionRequestStatus.class) {
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
        this.bitField0_ |= 64;
        this.appDeviceId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.outcome_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.requestType_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.source_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 8;
        this.statusAfter_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 4;
        this.statusBefore_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 16;
        this.userAction_ = str;
    }
}
