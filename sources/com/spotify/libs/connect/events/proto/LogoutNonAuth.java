package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g4f0;
import p.h4f0;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LogoutNonAuth extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 5;
    private static final LogoutNonAuth DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 6;
    public static final int LOGOUT_REASON_FIELD_NUMBER = 2;
    public static final int OFFLINE_USER_REMOVED_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 1;
    public static final int STORED_CREDENTIALS_REMOVED_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean offlineUserRemoved_;
    private boolean storedCredentialsRemoved_;
    private qng0 data_ = qng0.b;
    private String protocolVersion_ = "";
    private String logoutReason_ = "";
    private String deviceId_ = "";

    static {
        LogoutNonAuth logoutNonAuth = new LogoutNonAuth();
        DEFAULT_INSTANCE = logoutNonAuth;
        h.registerDefaultInstance(LogoutNonAuth.class, logoutNonAuth);
    }

    private LogoutNonAuth() {
    }

    public static g4f0 o() {
        return (g4f0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u00052\u0006ဈ\u0004", new Object[]{"bitField0_", "protocolVersion_", "logoutReason_", "storedCredentialsRemoved_", "offlineUserRemoved_", "data_", h4f0.a, "deviceId_"});
        }
        if (iOrdinal == 3) {
            return new LogoutNonAuth();
        }
        if (iOrdinal == 4) {
            return new g4f0(DEFAULT_INSTANCE);
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
        synchronized (LogoutNonAuth.class) {
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
        qng0 qng0Var = this.data_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.data_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 16;
        this.deviceId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.logoutReason_ = str;
    }

    public final void r() {
        this.bitField0_ |= 8;
        this.offlineUserRemoved_ = true;
    }

    public final void s() {
        this.bitField0_ |= 1;
        this.protocolVersion_ = "v3";
    }

    public final void t() {
        this.bitField0_ |= 4;
        this.storedCredentialsRemoved_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
