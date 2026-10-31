package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.ikz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAccessTokenClient$ErrorResponse extends h implements v2j0 {
    private static final EsAccessTokenClient$ErrorResponse DEFAULT_INSTANCE;
    public static final int GENERIC_ERROR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SPECIFIC_ERROR_FIELD_NUMBER = 2;
    private int errorCase_ = 0;
    private Object error_;

    public static final class GenericError extends h implements v2j0 {
        private static final GenericError DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int errorCode_;
        private String errorMessage_ = "";

        static {
            GenericError genericError = new GenericError();
            DEFAULT_INSTANCE = genericError;
            h.registerDefaultInstance(GenericError.class, genericError);
        }

        private GenericError() {
        }

        public static GenericError n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"errorCode_", "errorMessage_"});
            }
            if (iOrdinal == 3) {
                return new GenericError();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (GenericError.class) {
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

        public final int o() {
            return this.errorCode_;
        }

        public final String p() {
            return this.errorMessage_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsAccessTokenClient$ErrorResponse esAccessTokenClient$ErrorResponse = new EsAccessTokenClient$ErrorResponse();
        DEFAULT_INSTANCE = esAccessTokenClient$ErrorResponse;
        h.registerDefaultInstance(EsAccessTokenClient$ErrorResponse.class, esAccessTokenClient$ErrorResponse);
    }

    private EsAccessTokenClient$ErrorResponse() {
    }

    public static EsAccessTokenClient$ErrorResponse n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsAccessTokenClient$ErrorResponse u(byte[] bArr) {
        return (EsAccessTokenClient$ErrorResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002?\u0000", new Object[]{"error_", "errorCase_", GenericError.class});
        }
        if (iOrdinal == 3) {
            return new EsAccessTokenClient$ErrorResponse();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (EsAccessTokenClient$ErrorResponse.class) {
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

    public final int o() {
        int i = this.errorCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final GenericError p() {
        return this.errorCase_ == 1 ? (GenericError) this.error_ : GenericError.n();
    }

    public final ikz q() {
        int i = this.errorCase_;
        ikz ikzVar = ikz.INVALID_CREDENTIALS;
        if (i == 2) {
            switch (((Integer) this.error_).intValue()) {
                case 0:
                    break;
                case 1:
                    ikzVar = ikz.HTTP_ERROR;
                    break;
                case 2:
                    ikzVar = ikz.OFFLINE;
                    break;
                case 3:
                    ikzVar = ikz.BAD_REQUEST;
                    break;
                case 4:
                    ikzVar = ikz.UNSUPPORTED_LOGIN_PROTOCOL;
                    break;
                case 5:
                    ikzVar = ikz.TOO_MANY_ATTEMPTS;
                    break;
                case 6:
                    ikzVar = ikz.NOT_ALLOWED;
                    break;
                default:
                    ikzVar = null;
                    break;
            }
            if (ikzVar == null) {
                return ikz.UNRECOGNIZED;
            }
        }
        return ikzVar;
    }

    public final int r() {
        if (this.errorCase_ == 2) {
            return ((Integer) this.error_).intValue();
        }
        return 0;
    }

    public final boolean s() {
        return this.errorCase_ == 1;
    }

    public final boolean t() {
        return this.errorCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
