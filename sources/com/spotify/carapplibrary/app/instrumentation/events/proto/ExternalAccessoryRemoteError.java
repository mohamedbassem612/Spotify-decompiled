package com.spotify.carapplibrary.app.instrumentation.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.t210;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ExternalAccessoryRemoteError extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 9;
    private static final ExternalAccessoryRemoteError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ERROR_DOMAIN_FIELD_NUMBER = 3;
    public static final int ERROR_IS_RECOVERABLE_FIELD_NUMBER = 6;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 7;
    public static final int INTEGRATION_FIELD_NUMBER = 8;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REMOTE_SESSION_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private int errorCode_;
    private boolean errorIsRecoverable_;
    private String interactionId_ = "";
    private String remoteSessionId_ = "";
    private String errorDomain_ = "";
    private String errorDescription_ = "";
    private String impressionId_ = "";
    private String integration_ = "";
    private String action_ = "";

    static {
        ExternalAccessoryRemoteError externalAccessoryRemoteError = new ExternalAccessoryRemoteError();
        DEFAULT_INSTANCE = externalAccessoryRemoteError;
        h.registerDefaultInstance(ExternalAccessoryRemoteError.class, externalAccessoryRemoteError);
    }

    private ExternalAccessoryRemoteError() {
    }

    public static t210 n() {
        return (t210) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "interactionId_", "remoteSessionId_", "errorDomain_", "errorDescription_", "errorCode_", "errorIsRecoverable_", "impressionId_", "integration_", "action_"});
        }
        if (iOrdinal == 3) {
            return new ExternalAccessoryRemoteError();
        }
        if (iOrdinal == 4) {
            return new t210(DEFAULT_INSTANCE);
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
        synchronized (ExternalAccessoryRemoteError.class) {
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
        this.bitField0_ |= 256;
        this.action_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.errorDescription_ = str;
    }

    public final void q() {
        this.bitField0_ |= 128;
        this.integration_ = "android_auto";
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.interactionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
