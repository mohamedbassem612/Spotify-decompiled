package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class DeleteContributionResponse extends h implements v2j0 {
    private static final DeleteContributionResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        DeleteContributionResponse deleteContributionResponse = new DeleteContributionResponse();
        DEFAULT_INSTANCE = deleteContributionResponse;
        h.registerDefaultInstance(DeleteContributionResponse.class, deleteContributionResponse);
    }

    private DeleteContributionResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", DeleteContributionResult.class, ErrorStatus.class});
        }
        if (iOrdinal == 3) {
            return new DeleteContributionResponse();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (DeleteContributionResponse.class) {
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

    public final ErrorStatus n() {
        return this.resultCase_ == 2 ? (ErrorStatus) this.result_ : ErrorStatus.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.resultCase_ == 2;
    }

    public final boolean p() {
        return this.resultCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
