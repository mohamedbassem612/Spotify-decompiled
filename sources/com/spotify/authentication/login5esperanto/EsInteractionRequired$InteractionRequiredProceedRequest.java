package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wnz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsInteractionRequired$InteractionRequiredProceedRequest extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsInteractionRequired$InteractionRequiredProceedRequest DEFAULT_INSTANCE;
    public static final int INTERACTION_REF_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SERVER_HASH_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsAuthenticateContext$AuthenticateContext context_;
    private String interactionRef_ = "";
    private String serverHash_ = "";

    static {
        EsInteractionRequired$InteractionRequiredProceedRequest esInteractionRequired$InteractionRequiredProceedRequest = new EsInteractionRequired$InteractionRequiredProceedRequest();
        DEFAULT_INSTANCE = esInteractionRequired$InteractionRequiredProceedRequest;
        h.registerDefaultInstance(EsInteractionRequired$InteractionRequiredProceedRequest.class, esInteractionRequired$InteractionRequiredProceedRequest);
    }

    private EsInteractionRequired$InteractionRequiredProceedRequest() {
    }

    public static wnz n() {
        return (wnz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "context_", "interactionRef_", "serverHash_"});
        }
        if (iOrdinal == 3) {
            return new EsInteractionRequired$InteractionRequiredProceedRequest();
        }
        if (iOrdinal == 4) {
            return new wnz(DEFAULT_INSTANCE);
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
        synchronized (EsInteractionRequired$InteractionRequiredProceedRequest.class) {
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

    public final void o(EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext) {
        this.context_ = esAuthenticateContext$AuthenticateContext;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        this.interactionRef_ = str;
    }

    public final void q(String str) {
        this.serverHash_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
