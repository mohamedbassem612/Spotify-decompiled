package com.spotify.messages;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.etk;
import p.ftk;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ConfigurationAppliedNonAuth extends h implements v2j0 {
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 4;
    private static final ConfigurationAppliedNonAuth DEFAULT_INSTANCE;
    public static final int IDENTIFIERS_FIELD_NUMBER = 8;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 2;
    public static final int LAST_RCS_FETCH_TIME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 7;
    public static final int POLICY_GROUP_IDS_FIELD_NUMBER = 3;
    public static final int RC_CLIENT_ID_FIELD_NUMBER = 5;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER = 6;
    private int bitField0_;
    private long lastRcsFetchTime_;
    private qng0 identifiers_ = qng0.b;
    private String installationId_ = "";
    private b290 policyGroupIds_ = h.emptyIntList();
    private String configurationAssignmentId_ = "";
    private String rcClientId_ = "";
    private String rcClientVersion_ = "";
    private String platform_ = "";

    static {
        ConfigurationAppliedNonAuth configurationAppliedNonAuth = new ConfigurationAppliedNonAuth();
        DEFAULT_INSTANCE = configurationAppliedNonAuth;
        h.registerDefaultInstance(ConfigurationAppliedNonAuth.class, configurationAppliedNonAuth);
    }

    private ConfigurationAppliedNonAuth() {
    }

    public static etk p() {
        return (etk) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003\u0016\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\b2", new Object[]{"bitField0_", "lastRcsFetchTime_", "installationId_", "policyGroupIds_", "configurationAssignmentId_", "rcClientId_", "rcClientVersion_", "platform_", "identifiers_", ftk.a});
        }
        if (iOrdinal == 3) {
            return new ConfigurationAppliedNonAuth();
        }
        if (iOrdinal == 4) {
            return new etk(DEFAULT_INSTANCE);
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
        synchronized (ConfigurationAppliedNonAuth.class) {
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

    public final void n(Iterable iterable) {
        b290 b290VarMutableCopy = this.policyGroupIds_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.policyGroupIds_ = b290VarMutableCopy;
        }
        s8.addAll(iterable, b290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.identifiers_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.identifiers_ = qng0VarH;
        return qng0VarH;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.configurationAssignmentId_ = str;
    }

    public final void r(long j) {
        this.bitField0_ |= 1;
        this.lastRcsFetchTime_ = j;
    }

    public final void s() {
        this.bitField0_ |= 32;
        this.platform_ = "ANDROID";
    }

    public final void t() {
        this.bitField0_ |= 8;
        this.rcClientId_ = "com.spotify.music";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.bitField0_ |= 16;
        this.rcClientVersion_ = "9.2.0.26";
    }
}
