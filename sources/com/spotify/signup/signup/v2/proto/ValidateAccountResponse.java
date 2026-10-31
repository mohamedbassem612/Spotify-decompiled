package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ValidateAccountResponse extends h implements v2j0 {
    private static final ValidateAccountResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 102;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 101;
    private int resultCase_ = 0;
    private Object result_;

    static {
        ValidateAccountResponse validateAccountResponse = new ValidateAccountResponse();
        DEFAULT_INSTANCE = validateAccountResponse;
        h.registerDefaultInstance(ValidateAccountResponse.class, validateAccountResponse);
    }

    private ValidateAccountResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000ef\u0002\u0000\u0000\u0000e<\u0000f<\u0000", new Object[]{"result_", "resultCase_", ValidateAccountSuccessResponse.class, ValidateAccountErrorResponse.class});
        }
        if (iOrdinal == 3) {
            return new ValidateAccountResponse();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (ValidateAccountResponse.class) {
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

    public final ValidateAccountErrorResponse n() {
        return this.resultCase_ == 102 ? (ValidateAccountErrorResponse) this.result_ : ValidateAccountErrorResponse.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.resultCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 101) {
            return i != 102 ? 0 : 2;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
