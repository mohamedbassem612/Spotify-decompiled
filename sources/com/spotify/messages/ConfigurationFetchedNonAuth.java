package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mtk;
import p.ntk;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ConfigurationFetchedNonAuth extends h implements v2j0 {
    public static final int ATTRIBUTES_SET_ID_FIELD_NUMBER = 5;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 3;
    private static final ConfigurationFetchedNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_CODE_ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 20;
    public static final int ERROR_CODE_CONFIGURATION_RESOLVE_FIELD_NUMBER = 21;
    public static final int ERROR_MESSAGE_ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 19;
    public static final int ERROR_MESSAGE_CONFIGURATION_RESOLVE_FIELD_NUMBER = 17;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 15;
    public static final int ERROR_REASON_ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 18;
    public static final int ERROR_REASON_CONFIGURATION_RESOLVE_FIELD_NUMBER = 16;
    public static final int ERROR_REASON_FIELD_NUMBER = 14;
    public static final int FETCH_TYPE_FIELD_NUMBER = 10;
    public static final int IDENTIFIERS_FIELD_NUMBER = 22;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 2;
    public static final int LAST_RCS_FETCH_TIME_FIELD_NUMBER = 1;
    public static final int LATENCY_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_SIZE_FIELD_NUMBER = 12;
    public static final int PLATFORM_FIELD_NUMBER = 9;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER = 4;
    public static final int RC_CLIENT_ID_FIELD_NUMBER = 6;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER = 7;
    public static final int RC_SDK_VERSION_FIELD_NUMBER = 8;
    public static final int STATUS_CODE_FIELD_NUMBER = 13;
    private int bitField0_;
    private int errorCodeAccountAttributes_;
    private int errorCodeConfigurationResolve_;
    private long lastRcsFetchTime_;
    private long latency_;
    private long payloadSize_;
    private int statusCode_;
    private qng0 identifiers_ = qng0.b;
    private String installationId_ = "";
    private String configurationAssignmentId_ = "";
    private String propertySetId_ = "";
    private String attributesSetId_ = "";
    private String rcClientId_ = "";
    private String rcClientVersion_ = "";
    private String rcSdkVersion_ = "";
    private String platform_ = "";
    private String fetchType_ = "";
    private String errorReason_ = "";
    private String errorMessage_ = "";
    private String errorReasonConfigurationResolve_ = "";
    private String errorMessageConfigurationResolve_ = "";
    private String errorReasonAccountAttributes_ = "";
    private String errorMessageAccountAttributes_ = "";

    static {
        ConfigurationFetchedNonAuth configurationFetchedNonAuth = new ConfigurationFetchedNonAuth();
        DEFAULT_INSTANCE = configurationFetchedNonAuth;
        h.registerDefaultInstance(ConfigurationFetchedNonAuth.class, configurationFetchedNonAuth);
    }

    private ConfigurationFetchedNonAuth() {
    }

    public static mtk o() {
        return (mtk) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A() {
        this.bitField0_ |= 32;
        this.rcClientId_ = "com.spotify.music";
    }

    public final void B() {
        this.bitField0_ |= 64;
        this.rcClientVersion_ = "9.2.0.26";
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.rcSdkVersion_ = str;
    }

    public final void D(int i) {
        this.bitField0_ |= 4096;
        this.statusCode_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0001\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဂ\n\fဂ\u000b\rင\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0013ဈ\u0012\u0014င\u0013\u0015င\u0014\u00162", new Object[]{"bitField0_", "lastRcsFetchTime_", "installationId_", "configurationAssignmentId_", "propertySetId_", "attributesSetId_", "rcClientId_", "rcClientVersion_", "rcSdkVersion_", "platform_", "fetchType_", "latency_", "payloadSize_", "statusCode_", "errorReason_", "errorMessage_", "errorReasonConfigurationResolve_", "errorMessageConfigurationResolve_", "errorReasonAccountAttributes_", "errorMessageAccountAttributes_", "errorCodeAccountAttributes_", "errorCodeConfigurationResolve_", "identifiers_", ntk.a});
        }
        if (iOrdinal == 3) {
            return new ConfigurationFetchedNonAuth();
        }
        if (iOrdinal == 4) {
            return new mtk(DEFAULT_INSTANCE);
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
        synchronized (ConfigurationFetchedNonAuth.class) {
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
        qng0 qng0Var = this.identifiers_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.identifiers_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.configurationAssignmentId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.errorMessage_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.errorMessageConfigurationResolve_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 8192;
        this.errorReason_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 32768;
        this.errorReasonConfigurationResolve_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.fetchType_ = str;
    }

    public final void v(long j) {
        this.bitField0_ |= 1;
        this.lastRcsFetchTime_ = j;
    }

    public final void w(long j) {
        this.bitField0_ |= 1024;
        this.latency_ = j;
    }

    public final void x(long j) {
        this.bitField0_ |= 2048;
        this.payloadSize_ = j;
    }

    public final void y(String str) {
        this.bitField0_ |= 256;
        this.platform_ = str;
    }

    public final void z() {
        this.bitField0_ |= 8;
        this.propertySetId_ = "d731530c05721cd9ac82d78fa0abef6ed6d44e055b95ef2cb87d91a2ab5d43ec";
    }
}
