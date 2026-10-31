package com.spotify.offline.offlineplugin_proto;

import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOfflinePlugin$IdentifyResponse extends com.google.protobuf.h implements v2j0 {
    private static final EsOfflinePlugin$IdentifyResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 1;
    private qng0 results_ = qng0.b;

    public static final class Result extends com.google.protobuf.h implements v2j0 {
        private static final Result DEFAULT_INSTANCE;
        public static final int ESTIMATED_FILE_SIZE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private long estimatedFileSize_;
        private int status_;

        static {
            Result result = new Result();
            DEFAULT_INSTANCE = result;
            com.google.protobuf.h.registerDefaultInstance(Result.class, result);
        }

        private Result() {
        }

        public static Result n() {
            return DEFAULT_INSTANCE;
        }

        public static f o() {
            return (f) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"status_", "estimatedFileSize_"});
            }
            if (iOrdinal == 3) {
                return new Result();
            }
            if (iOrdinal == 4) {
                return new f(DEFAULT_INSTANCE);
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
            synchronized (Result.class) {
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

        public final void p() {
            this.estimatedFileSize_ = 10L;
        }

        public final void q(g gVar) {
            this.status_ = gVar.getNumber();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsOfflinePlugin$IdentifyResponse esOfflinePlugin$IdentifyResponse = new EsOfflinePlugin$IdentifyResponse();
        DEFAULT_INSTANCE = esOfflinePlugin$IdentifyResponse;
        com.google.protobuf.h.registerDefaultInstance(EsOfflinePlugin$IdentifyResponse.class, esOfflinePlugin$IdentifyResponse);
    }

    private EsOfflinePlugin$IdentifyResponse() {
    }

    public static e o() {
        return (e) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"results_", h.a});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$IdentifyResponse();
        }
        if (iOrdinal == 4) {
            return new e(DEFAULT_INSTANCE);
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
        synchronized (EsOfflinePlugin$IdentifyResponse.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.results_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.results_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
