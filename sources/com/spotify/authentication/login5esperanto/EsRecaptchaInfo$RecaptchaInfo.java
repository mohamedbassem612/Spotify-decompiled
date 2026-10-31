package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tqz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsRecaptchaInfo$RecaptchaInfo extends h implements v2j0 {
    private static final EsRecaptchaInfo$RecaptchaInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SITE_KEY_FIELD_NUMBER = 1;
    public static final int TOKEN_FIELD_NUMBER = 2;
    private String siteKey_ = "";
    private String token_ = "";

    static {
        EsRecaptchaInfo$RecaptchaInfo esRecaptchaInfo$RecaptchaInfo = new EsRecaptchaInfo$RecaptchaInfo();
        DEFAULT_INSTANCE = esRecaptchaInfo$RecaptchaInfo;
        h.registerDefaultInstance(EsRecaptchaInfo$RecaptchaInfo.class, esRecaptchaInfo$RecaptchaInfo);
    }

    private EsRecaptchaInfo$RecaptchaInfo() {
    }

    public static tqz o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"siteKey_", "token_"});
        }
        if (iOrdinal == 3) {
            return new EsRecaptchaInfo$RecaptchaInfo();
        }
        if (iOrdinal == 4) {
            return new tqz();
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
        synchronized (EsRecaptchaInfo$RecaptchaInfo.class) {
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

    public final void p(String str) {
        str.getClass();
        this.siteKey_ = str;
    }

    public final void q(String str) {
        this.token_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
