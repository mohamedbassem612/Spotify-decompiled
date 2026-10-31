package com.spotify.messages;

import p.bf40;
import p.gw5;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AppRemoteAuthentication extends com.google.protobuf.h implements v2j0 {
    public static final int APP_SIGNATURE_FIELD_NUMBER = 2;
    public static final int CLIENT_ID_FIELD_NUMBER = 3;
    private static final AppRemoteAuthentication DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String packageName_ = "";
    private String appSignature_ = "";
    private String clientId_ = "";

    static {
        AppRemoteAuthentication appRemoteAuthentication = new AppRemoteAuthentication();
        DEFAULT_INSTANCE = appRemoteAuthentication;
        com.google.protobuf.h.registerDefaultInstance(AppRemoteAuthentication.class, appRemoteAuthentication);
    }

    private AppRemoteAuthentication() {
    }

    public static gw5 n() {
        return (gw5) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "appSignature_", "clientId_"});
        }
        if (iOrdinal == 3) {
            return new AppRemoteAuthentication();
        }
        if (iOrdinal == 4) {
            return new gw5(DEFAULT_INSTANCE);
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
        synchronized (AppRemoteAuthentication.class) {
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
        this.bitField0_ |= 2;
        this.appSignature_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.clientId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
