package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Error extends h implements v2j0 {
    public static final int ALREADY_EXISTS_FIELD_NUMBER = 103;
    public static final int BODY_FIELD_NUMBER = 3;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Error DEFAULT_INSTANCE;
    public static final int INVALID_ARGUMENT_FIELD_NUMBER = 102;
    public static final int INVALID_COUNTRY_FIELD_NUMBER = 106;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_DENIED_FIELD_NUMBER = 105;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TOO_YOUNG_FIELD_NUMBER = 107;
    public static final int UNAVAILABLE_FIELD_NUMBER = 104;
    public static final int UNKNOWN_FIELD_NUMBER = 101;
    private int code_;
    private Object type_;
    private int typeCase_ = 0;
    private String title_ = "";
    private String body_ = "";

    static {
        Error error = new Error();
        DEFAULT_INSTANCE = error;
        h.registerDefaultInstance(Error.class, error);
    }

    private Error() {
    }

    public static Error p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001k\n\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000", new Object[]{"type_", "typeCase_", "code_", "title_", "body_", Empty.class, InvalidArgument.class, Empty.class, Empty.class, Empty.class, Empty.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new Error();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (Error.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.body_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.code_;
    }

    public final InvalidArgument q() {
        return this.typeCase_ == 102 ? (InvalidArgument) this.type_ : InvalidArgument.n();
    }

    public final int r() {
        int i = this.typeCase_;
        if (i == 0) {
            return 8;
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
            case 105:
                return 5;
            case INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                return 6;
            case TOO_YOUNG_FIELD_NUMBER /* 107 */:
                return 7;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
