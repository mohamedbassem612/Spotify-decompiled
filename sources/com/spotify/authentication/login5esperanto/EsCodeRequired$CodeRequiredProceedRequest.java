package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsCodeRequired$CodeRequiredProceedRequest extends h implements v2j0 {
    public static final int CODE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsCodeRequired$CodeRequiredProceedRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RECAPTCHA_INFO_FIELD_NUMBER = 3;
    private int bitField0_;
    private String code_ = "";
    private EsAuthenticateContext$AuthenticateContext context_;
    private EsRecaptchaInfo.RecaptchaInfo recaptchaInfo_;

    static {
        EsCodeRequired$CodeRequiredProceedRequest esCodeRequired$CodeRequiredProceedRequest = new EsCodeRequired$CodeRequiredProceedRequest();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequiredProceedRequest;
        h.registerDefaultInstance(EsCodeRequired$CodeRequiredProceedRequest.class, esCodeRequired$CodeRequiredProceedRequest);
    }

    private EsCodeRequired$CodeRequiredProceedRequest() {
    }

    public static qlz n() {
        return (qlz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"bitField0_", "context_", "code_", "recaptchaInfo_"});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequiredProceedRequest();
        }
        if (iOrdinal == 4) {
            return new qlz(DEFAULT_INSTANCE);
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
        synchronized (EsCodeRequired$CodeRequiredProceedRequest.class) {
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
        this.code_ = str;
    }

    public final void p(EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext) {
        this.context_ = esAuthenticateContext$AuthenticateContext;
        this.bitField0_ |= 1;
    }

    public final void q(EsRecaptchaInfo.RecaptchaInfo recaptchaInfo) {
        this.recaptchaInfo_ = recaptchaInfo;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
