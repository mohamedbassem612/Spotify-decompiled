package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsInteractionRequired$InteractionRequiredProceedResult extends h implements v2j0 {
    private static final EsInteractionRequired$InteractionRequiredProceedResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsInteractionRequired$InteractionRequiredProceedResult esInteractionRequired$InteractionRequiredProceedResult = new EsInteractionRequired$InteractionRequiredProceedResult();
        DEFAULT_INSTANCE = esInteractionRequired$InteractionRequiredProceedResult;
        h.registerDefaultInstance(EsInteractionRequired$InteractionRequiredProceedResult.class, esInteractionRequired$InteractionRequiredProceedResult);
    }

    private EsInteractionRequired$InteractionRequiredProceedResult() {
    }

    public static EsInteractionRequired$InteractionRequiredProceedResult p(byte[] bArr) {
        return (EsInteractionRequired$InteractionRequiredProceedResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", EsInteractionRequired$InteractionRequiredProceedSuccess.class, EsInteractionRequired$InteractionRequiredProceedError.class});
        }
        if (iOrdinal == 3) {
            return new EsInteractionRequired$InteractionRequiredProceedResult();
        }
        if (iOrdinal == 4) {
            return new onz(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (EsInteractionRequired$InteractionRequiredProceedResult.class) {
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

    public final EsInteractionRequired$InteractionRequiredProceedError n() {
        return this.resultCase_ == 2 ? (EsInteractionRequired$InteractionRequiredProceedError) this.result_ : EsInteractionRequired$InteractionRequiredProceedError.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.resultCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
