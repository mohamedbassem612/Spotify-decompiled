package com.spotify.messages;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.jig;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ClientAuthEventStartNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int APP_ID_FIELD_NUMBER = 6;
    public static final int ASSOCIATED_CONTENT_FIELD_NUMBER = 13;
    public static final int AUTH_ID_FIELD_NUMBER = 8;
    public static final int AUTH_SESSION_ID_FIELD_NUMBER = 9;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final ClientAuthEventStartNonAuth DEFAULT_INSTANCE;
    public static final int INTEGRATION_INITIATED_FIELD_NUMBER = 7;
    public static final int IS_OFFLINE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECT_URI_FIELD_NUMBER = 3;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 2;
    public static final int SCOPES_FIELD_NUMBER = 4;
    public static final int UTM_CAMPAIGN_FIELD_NUMBER = 10;
    public static final int UTM_MEDIUM_FIELD_NUMBER = 11;
    public static final int UTM_SOURCE_FIELD_NUMBER = 12;
    private int bitField0_;
    private boolean integrationInitiated_;
    private boolean isOffline_;
    private String clientId_ = "";
    private String responseType_ = "";
    private String redirectUri_ = "";
    private h290 scopes_ = com.google.protobuf.h.emptyProtobufList();
    private String appId_ = "";
    private String authId_ = "";
    private String authSessionId_ = "";
    private String utmCampaign_ = "";
    private String utmMedium_ = "";
    private String utmSource_ = "";
    private String associatedContent_ = "";

    static {
        ClientAuthEventStartNonAuth clientAuthEventStartNonAuth = new ClientAuthEventStartNonAuth();
        DEFAULT_INSTANCE = clientAuthEventStartNonAuth;
        com.google.protobuf.h.registerDefaultInstance(ClientAuthEventStartNonAuth.class, clientAuthEventStartNonAuth);
    }

    private ClientAuthEventStartNonAuth() {
    }

    public static jig o() {
        return (jig) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.utmSource_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဇ\u0003\u0006ဈ\u0004\u0007ဇ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n\rဈ\u000b", new Object[]{"bitField0_", "clientId_", "responseType_", "redirectUri_", "scopes_", "isOffline_", "appId_", "integrationInitiated_", "authId_", "authSessionId_", "utmCampaign_", "utmMedium_", "utmSource_", "associatedContent_"});
        }
        if (iOrdinal == 3) {
            return new ClientAuthEventStartNonAuth();
        }
        if (iOrdinal == 4) {
            return new jig(DEFAULT_INSTANCE);
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
        synchronized (ClientAuthEventStartNonAuth.class) {
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
        h290 h290VarMutableCopy = this.scopes_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.scopes_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.appId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.associatedContent_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 64;
        this.authId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 128;
        this.authSessionId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.clientId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.bitField0_ |= 32;
        this.integrationInitiated_ = true;
    }

    public final void v() {
        this.bitField0_ |= 8;
        this.isOffline_ = false;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.redirectUri_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.responseType_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.utmCampaign_ = str;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.utmMedium_ = str;
    }
}
