package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zkz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateRequest$AuthenticateRequest extends h implements v2j0 {
    public static final int CREDENTIALS_FIELD_NUMBER = 1;
    private static final EsAuthenticateRequest$AuthenticateRequest DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 5;
    public static final int INTERACTION_CALLBACK_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RECAPTCHA_INFO_FIELD_NUMBER = 4;
    public static final int UI_LOCALE_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsAuthenticateCredentials$AuthenticateCredentials credentials_;
    private EsRecaptchaInfo$RecaptchaInfo recaptchaInfo_;
    private String interactionCallbackUri_ = "";
    private String uiLocale_ = "";
    private String flowId_ = "";

    static {
        EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest = new EsAuthenticateRequest$AuthenticateRequest();
        DEFAULT_INSTANCE = esAuthenticateRequest$AuthenticateRequest;
        h.registerDefaultInstance(EsAuthenticateRequest$AuthenticateRequest.class, esAuthenticateRequest$AuthenticateRequest);
    }

    private EsAuthenticateRequest$AuthenticateRequest() {
    }

    public static zkz n() {
        return (zkz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ለ\u0001\u0004ဉ\u0002\u0005ለ\u0003", new Object[]{"bitField0_", "credentials_", "interactionCallbackUri_", "uiLocale_", "recaptchaInfo_", "flowId_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateRequest$AuthenticateRequest();
        }
        if (iOrdinal == 4) {
            return new zkz(DEFAULT_INSTANCE);
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
        synchronized (EsAuthenticateRequest$AuthenticateRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials) {
        this.credentials_ = esAuthenticateCredentials$AuthenticateCredentials;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.flowId_ = str;
    }

    public final void q() {
        this.interactionCallbackUri_ = "https://auth-callback.spotify.com/r/android/music/login";
    }

    public final void r(EsRecaptchaInfo$RecaptchaInfo esRecaptchaInfo$RecaptchaInfo) {
        this.recaptchaInfo_ = esRecaptchaInfo$RecaptchaInfo;
        this.bitField0_ |= 4;
    }

    public final void s(String str) {
        this.bitField0_ |= 2;
        this.uiLocale_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
