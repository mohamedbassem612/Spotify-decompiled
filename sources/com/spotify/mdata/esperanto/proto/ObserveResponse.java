package com.spotify.mdata.esperanto.proto;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hz00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObserveResponse extends h implements v2j0 {
    private static final ObserveResponse DEFAULT_INSTANCE;
    public static final int EXTENSION_RESULT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PENDING_RESPONSE_FIELD_NUMBER = 2;
    private h290 extensionResult_ = h.emptyProtobufList();
    private boolean pendingResponse_;

    public static final class Details extends h implements v2j0 {
        public static final int CACHE_STATUS_FIELD_NUMBER = 1;
        private static final Details DEFAULT_INSTANCE;
        public static final int FRESH_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int cacheStatus_;
        private boolean fresh_;

        static {
            Details details = new Details();
            DEFAULT_INSTANCE = details;
            h.registerDefaultInstance(Details.class, details);
        }

        private Details() {
        }

        public static Details p() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"cacheStatus_", "fresh_"});
            }
            if (iOrdinal == 3) {
                return new Details();
            }
            if (iOrdinal == 4) {
                return new d();
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
            synchronized (Details.class) {
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

        public final e o() {
            e eVar;
            int i = this.cacheStatus_;
            if (i == 0) {
                eVar = e.UNKNOWN;
            } else if (i == 1) {
                eVar = e.OK;
            } else if (i == 2) {
                eVar = e.NOT_RESOLVED;
            } else if (i != 3) {
                eVar = i != 4 ? null : e.UNAVAILABLE_FOR_LEGAL_REASONS;
            } else {
                eVar = e.NOT_FOUND;
            }
            return eVar == null ? e.UNRECOGNIZED : eVar;
        }

        public final boolean q() {
            return this.fresh_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ExtensionResult extends h implements v2j0 {
        private static final ExtensionResult DEFAULT_INSTANCE;
        public static final int DETAILS_FIELD_NUMBER = 5;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        public static final int EXTENSION_DATA_FIELD_NUMBER = 3;
        public static final int EXTENSION_KIND_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 4;
        private int bitField0_;
        private Details details_;
        private String entityUri_ = "";
        private Any extensionData_;
        private int extensionKind_;
        private int status_;

        static {
            ExtensionResult extensionResult = new ExtensionResult();
            DEFAULT_INSTANCE = extensionResult;
            h.registerDefaultInstance(ExtensionResult.class, extensionResult);
        }

        private ExtensionResult() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001", new Object[]{"bitField0_", "entityUri_", "extensionKind_", "extensionData_", "status_", "details_"});
            }
            if (iOrdinal == 3) {
                return new ExtensionResult();
            }
            if (iOrdinal == 4) {
                return new f();
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
            synchronized (ExtensionResult.class) {
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

        public final String getEntityUri() {
            return this.entityUri_;
        }

        public final hz00 getExtensionKind() {
            hz00 hz00VarB = hz00.b(this.extensionKind_);
            return hz00VarB == null ? hz00.UNRECOGNIZED : hz00VarB;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Details o() {
            Details details = this.details_;
            return details == null ? Details.p() : details;
        }

        public final Any p() {
            Any any = this.extensionData_;
            return any == null ? Any.o() : any;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ObserveResponse observeResponse = new ObserveResponse();
        DEFAULT_INSTANCE = observeResponse;
        h.registerDefaultInstance(ObserveResponse.class, observeResponse);
    }

    private ObserveResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ObserveResponse q(byte[] bArr) {
        return (ObserveResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"extensionResult_", ExtensionResult.class, "pendingResponse_"});
        }
        if (iOrdinal == 3) {
            return new ObserveResponse();
        }
        if (iOrdinal == 4) {
            return new c();
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
        synchronized (ObserveResponse.class) {
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

    public final h290 o() {
        return this.extensionResult_;
    }

    public final boolean p() {
        return this.pendingResponse_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
