package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pfe1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ThirdPartyAppAttributionClientNonAuth extends h implements v2j0 {
    public static final int APP_REFERRER_FIELD_NUMBER = 5;
    public static final int AUTH_SESSION_ID_FIELD_NUMBER = 2;
    private static final ThirdPartyAppAttributionClientNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 3;
    public static final int INSTALL_REFERRER_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 4;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String authSessionId_ = "";
    private String eventType_ = "";
    private String platform_ = "";
    private String appReferrer_ = "";
    private String installReferrer_ = "";

    static {
        ThirdPartyAppAttributionClientNonAuth thirdPartyAppAttributionClientNonAuth = new ThirdPartyAppAttributionClientNonAuth();
        DEFAULT_INSTANCE = thirdPartyAppAttributionClientNonAuth;
        h.registerDefaultInstance(ThirdPartyAppAttributionClientNonAuth.class, thirdPartyAppAttributionClientNonAuth);
    }

    private ThirdPartyAppAttributionClientNonAuth() {
    }

    public static pfe1 n() {
        return (pfe1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "spotifyId_", "authSessionId_", "eventType_", "platform_", "appReferrer_", "installReferrer_"});
        }
        if (iOrdinal == 3) {
            return new ThirdPartyAppAttributionClientNonAuth();
        }
        if (iOrdinal == 4) {
            return new pfe1(DEFAULT_INSTANCE);
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
        synchronized (ThirdPartyAppAttributionClientNonAuth.class) {
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
        this.bitField0_ |= 16;
        this.appReferrer_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.authSessionId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.eventType_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.installReferrer_ = str;
    }

    public final void s() {
        this.bitField0_ |= 8;
        this.platform_ = "android";
    }

    public final void t(String str) {
        this.bitField0_ |= 1;
        this.spotifyId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
