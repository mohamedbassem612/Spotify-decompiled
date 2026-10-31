package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsInteractionRequired$InteractionRequired extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsInteractionRequired$InteractionRequired DEFAULT_INSTANCE;
    public static final int FINISH_URL_FIELD_NUMBER = 3;
    public static final int INTERACTION_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EsAuthenticateContext.AuthenticateContext context_;
    private String interactionUrl_ = "";
    private String finishUrl_ = "";

    static {
        EsInteractionRequired$InteractionRequired esInteractionRequired$InteractionRequired = new EsInteractionRequired$InteractionRequired();
        DEFAULT_INSTANCE = esInteractionRequired$InteractionRequired;
        h.registerDefaultInstance(EsInteractionRequired$InteractionRequired.class, esInteractionRequired$InteractionRequired);
    }

    private EsInteractionRequired$InteractionRequired() {
    }

    public static EsInteractionRequired$InteractionRequired p() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "context_", "interactionUrl_", "finishUrl_"});
        }
        if (iOrdinal == 3) {
            return new EsInteractionRequired$InteractionRequired();
        }
        if (iOrdinal == 4) {
            return new onz((byte) 6);
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
        synchronized (EsInteractionRequired$InteractionRequired.class) {
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

    public final EsAuthenticateContext.AuthenticateContext o() {
        EsAuthenticateContext.AuthenticateContext authenticateContext = this.context_;
        return authenticateContext == null ? EsAuthenticateContext.AuthenticateContext.n() : authenticateContext;
    }

    public final String q() {
        return this.interactionUrl_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
