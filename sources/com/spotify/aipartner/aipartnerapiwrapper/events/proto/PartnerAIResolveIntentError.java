package com.spotify.aipartner.aipartnerapiwrapper.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.k0s0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class PartnerAIResolveIntentError extends h implements v2j0 {
    private static final PartnerAIResolveIntentError DEFAULT_INSTANCE;
    public static final int HTTP_CODE_FIELD_NUMBER = 1;
    public static final int INTEGRATION_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private int httpCode_;
    private String requestId_ = "";
    private String message_ = "";
    private String integration_ = "";
    private String query_ = "";

    static {
        PartnerAIResolveIntentError partnerAIResolveIntentError = new PartnerAIResolveIntentError();
        DEFAULT_INSTANCE = partnerAIResolveIntentError;
        h.registerDefaultInstance(PartnerAIResolveIntentError.class, partnerAIResolveIntentError);
    }

    private PartnerAIResolveIntentError() {
    }

    public static k0s0 n() {
        return (k0s0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "httpCode_", "requestId_", "message_", "integration_", "query_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAIResolveIntentError();
        }
        if (iOrdinal == 4) {
            return new k0s0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAIResolveIntentError.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 1;
        this.httpCode_ = i;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.integration_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.message_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.query_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.requestId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
