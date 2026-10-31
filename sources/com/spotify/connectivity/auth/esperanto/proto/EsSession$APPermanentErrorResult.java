package com.spotify.connectivity.auth.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.irz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsSession$APPermanentErrorResult extends h implements v2j0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final EsSession$APPermanentErrorResult DEFAULT_INSTANCE;
    public static final int GENERIC_ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
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
        EsSession$APPermanentErrorResult esSession$APPermanentErrorResult = new EsSession$APPermanentErrorResult();
        DEFAULT_INSTANCE = esSession$APPermanentErrorResult;
        h.registerDefaultInstance(EsSession$APPermanentErrorResult.class, esSession$APPermanentErrorResult);
    }

    private EsSession$APPermanentErrorResult() {
    }

    public static EsSession$APPermanentErrorResult p(byte[] bArr) {
        return (EsSession$APPermanentErrorResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"error_", "errorCase_", GenericError.class});
        }
        if (iOrdinal == 3) {
            return new EsSession$APPermanentErrorResult();
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
        synchronized (EsSession$APPermanentErrorResult.class) {
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

    public final irz n() {
        int i = this.errorCase_;
        irz irzVar = irz.BAD_CREDENTIALS;
        if (i == 1) {
            int iIntValue = ((Integer) this.error_).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    irzVar = iIntValue != 2 ? null : irz.PASSWORD_CHANGED;
                } else {
                    irzVar = irz.REGION_MISMATCH;
                }
            }
            if (irzVar == null) {
                return irz.UNRECOGNIZED;
            }
        }
        return irzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final GenericError o() {
        return this.errorCase_ == 2 ? (GenericError) this.error_ : GenericError.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
