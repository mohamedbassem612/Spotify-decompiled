package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jjn;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class CreateAccountResponse extends h implements v2j0 {
    public static final int ATTEMPT_ID_FIELD_NUMBER = 4;
    public static final int CHALLENGE_FIELD_NUMBER = 3;
    private static final CreateAccountResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private Object result_;
    private int resultCase_ = 0;
    private String attemptId_ = "";

    static {
        CreateAccountResponse createAccountResponse = new CreateAccountResponse();
        DEFAULT_INSTANCE = createAccountResponse;
        h.registerDefaultInstance(CreateAccountResponse.class, createAccountResponse);
    }

    private CreateAccountResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"result_", "resultCase_", CreateAccountSuccessResponse.class, CreateAccountErrorResponse.class, CreateAccountChallengeResponse.class, "attemptId_"});
        }
        if (iOrdinal == 3) {
            return new CreateAccountResponse();
        }
        if (iOrdinal == 4) {
            return new jjn(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (CreateAccountResponse.class) {
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

    public final CreateAccountChallengeResponse n() {
        return this.resultCase_ == 3 ? (CreateAccountChallengeResponse) this.result_ : CreateAccountChallengeResponse.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CreateAccountErrorResponse o() {
        return this.resultCase_ == 2 ? (CreateAccountErrorResponse) this.result_ : CreateAccountErrorResponse.n();
    }

    public final int p() {
        int i = this.resultCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final CreateAccountSuccessResponse q() {
        return this.resultCase_ == 1 ? (CreateAccountSuccessResponse) this.result_ : CreateAccountSuccessResponse.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
