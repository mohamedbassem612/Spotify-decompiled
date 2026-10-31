package com.spotify.messages;

import p.bf40;
import p.dnr;
import p.enr;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DefaultConfigurationApplied extends com.google.protobuf.h implements v2j0 {
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 2;
    private static final DefaultConfigurationApplied DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 6;
    public static final int IDENTIFIERS_FIELD_NUMBER = 8;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int RC_CLIENT_ID_FIELD_NUMBER = 3;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER = 4;
    public static final int REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private qng0 identifiers_ = qng0.b;
    private String installationId_ = "";
    private String configurationAssignmentId_ = "";
    private String rcClientId_ = "";
    private String rcClientVersion_ = "";
    private String platform_ = "";
    private String fetchType_ = "";
    private String reason_ = "";

    static {
        DefaultConfigurationApplied defaultConfigurationApplied = new DefaultConfigurationApplied();
        DEFAULT_INSTANCE = defaultConfigurationApplied;
        com.google.protobuf.h.registerDefaultInstance(DefaultConfigurationApplied.class, defaultConfigurationApplied);
    }

    private DefaultConfigurationApplied() {
    }

    public static dnr o() {
        return (dnr) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b2", new Object[]{"bitField0_", "installationId_", "configurationAssignmentId_", "rcClientId_", "rcClientVersion_", "platform_", "fetchType_", "reason_", "identifiers_", enr.a});
        }
        if (iOrdinal == 3) {
            return new DefaultConfigurationApplied();
        }
        if (iOrdinal == 4) {
            return new dnr(DEFAULT_INSTANCE);
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
        synchronized (DefaultConfigurationApplied.class) {
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
        this.bitField0_ |= 2;
        this.configurationAssignmentId_ = str;
    }

    public final void q() {
        this.bitField0_ |= 16;
        this.platform_ = "ANDROID";
    }

    public final void r() {
        this.bitField0_ |= 4;
        this.rcClientId_ = "com.spotify.music";
    }

    public final void s() {
        this.bitField0_ |= 8;
        this.rcClientVersion_ = "9.2.0.26";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
