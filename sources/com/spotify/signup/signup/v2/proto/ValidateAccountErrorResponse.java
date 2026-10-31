package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ValidateAccountErrorResponse extends h implements v2j0 {
    public static final int ALREADY_EXISTS_FIELD_NUMBER = 103;
    private static final ValidateAccountErrorResponse DEFAULT_INSTANCE;
    public static final int INVALID_ARGUMENT_FIELD_NUMBER = 102;
    public static final int INVALID_COUNTRY_FIELD_NUMBER = 104;
    private static volatile qzr0 PARSER = null;
    public static final int UNKNOWN_FIELD_NUMBER = 101;
    private int typeCase_ = 0;
    private Object type_;

    static {
        ValidateAccountErrorResponse validateAccountErrorResponse = new ValidateAccountErrorResponse();
        DEFAULT_INSTANCE = validateAccountErrorResponse;
        h.registerDefaultInstance(ValidateAccountErrorResponse.class, validateAccountErrorResponse);
    }

    private ValidateAccountErrorResponse() {
    }

    public static ValidateAccountErrorResponse n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000eh\u0004\u0000\u0000\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"type_", "typeCase_", Empty.class, InvalidArgument.class, Empty.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new ValidateAccountErrorResponse();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (ValidateAccountErrorResponse.class) {
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

    public final InvalidArgument o() {
        return this.typeCase_ == 102 ? (InvalidArgument) this.type_ : InvalidArgument.n();
    }

    public final int p() {
        int i = this.typeCase_;
        if (i == 0) {
            return 5;
        }
        switch (i) {
            case 101:
                return 1;
            case 102:
                return 2;
            case 103:
                return 3;
            case 104:
                return 4;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
