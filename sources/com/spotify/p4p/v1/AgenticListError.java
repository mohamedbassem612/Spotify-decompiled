package com.spotify.p4p.v1;

import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AgenticListError extends com.google.protobuf.h implements v2j0 {
    public static final int ABORTED_FIELD_NUMBER = 15;
    public static final int CAPPING_EXCEEDED_FIELD_NUMBER = 12;
    private static final AgenticListError DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 1;
    public static final int INTERNAL_ERROR_FIELD_NUMBER = 10;
    public static final int INVALID_ARGUMENT_FIELD_NUMBER = 14;
    public static final int NO_CONTENT_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_IDS_FIELD_NUMBER = 3;
    public static final int PROMPT_REJECTED_FIELD_NUMBER = 13;
    public static final int RATE_LIMITED_FIELD_NUMBER = 16;
    public static final int RETRYABLE_FIELD_NUMBER = 2;
    private Object details_;
    private boolean retryable_;
    private int detailsCase_ = 0;
    private String displayText_ = "";
    private h290 promptIds_ = com.google.protobuf.h.emptyProtobufList();

    public static final class AbortedError extends com.google.protobuf.h implements v2j0 {
        private static final AbortedError DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int REASON_FIELD_NUMBER = 1;
        private int reason_;

        static {
            AbortedError abortedError = new AbortedError();
            DEFAULT_INSTANCE = abortedError;
            com.google.protobuf.h.registerDefaultInstance(AbortedError.class, abortedError);
        }

        private AbortedError() {
        }

        public static a n() {
            return (a) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
            }
            if (iOrdinal == 3) {
                return new AbortedError();
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
            synchronized (AbortedError.class) {
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

        public final void setReasonValue(int i) {
            this.reason_ = i;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class CappingExceededError extends com.google.protobuf.h implements v2j0 {
        private static final CappingExceededError DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int RESET_TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TOTAL_ALLOWANCE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Timestamp resetTimestamp_;
        private long totalAllowance_;

        static {
            CappingExceededError cappingExceededError = new CappingExceededError();
            DEFAULT_INSTANCE = cappingExceededError;
            com.google.protobuf.h.registerDefaultInstance(CappingExceededError.class, cappingExceededError);
        }

        private CappingExceededError() {
        }

        public static CappingExceededError n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static d q() {
            return (d) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "resetTimestamp_", "totalAllowance_"});
            }
            if (iOrdinal == 3) {
                return new CappingExceededError();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (CappingExceededError.class) {
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

        public final Timestamp o() {
            Timestamp timestamp = this.resetTimestamp_;
            return timestamp == null ? Timestamp.o() : timestamp;
        }

        public final boolean p() {
            return (this.bitField0_ & 1) != 0;
        }

        public final void r(Timestamp timestamp) {
            timestamp.getClass();
            this.resetTimestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        public final void s(long j) {
            this.bitField0_ |= 2;
            this.totalAllowance_ = j;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class InternalError extends com.google.protobuf.h implements v2j0 {
        private static final InternalError DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            InternalError internalError = new InternalError();
            DEFAULT_INSTANCE = internalError;
            com.google.protobuf.h.registerDefaultInstance(InternalError.class, internalError);
        }

        private InternalError() {
        }

        public static InternalError n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new InternalError();
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
            synchronized (InternalError.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class InvalidArgumentError extends com.google.protobuf.h implements v2j0 {
        private static final InvalidArgumentError DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            InvalidArgumentError invalidArgumentError = new InvalidArgumentError();
            DEFAULT_INSTANCE = invalidArgumentError;
            com.google.protobuf.h.registerDefaultInstance(InvalidArgumentError.class, invalidArgumentError);
        }

        private InvalidArgumentError() {
        }

        public static InvalidArgumentError n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new InvalidArgumentError();
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
            synchronized (InvalidArgumentError.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class NoContentError extends com.google.protobuf.h implements v2j0 {
        private static final NoContentError DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            NoContentError noContentError = new NoContentError();
            DEFAULT_INSTANCE = noContentError;
            com.google.protobuf.h.registerDefaultInstance(NoContentError.class, noContentError);
        }

        private NoContentError() {
        }

        public static NoContentError n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new NoContentError();
            }
            if (iOrdinal == 4) {
                return new g(DEFAULT_INSTANCE);
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
            synchronized (NoContentError.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PromptRejectedError extends com.google.protobuf.h implements v2j0 {
        private static final PromptRejectedError DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SUPPORT_RESOURCES_REQUIRED_FIELD_NUMBER = 1;
        private boolean supportResourcesRequired_;

        static {
            PromptRejectedError promptRejectedError = new PromptRejectedError();
            DEFAULT_INSTANCE = promptRejectedError;
            com.google.protobuf.h.registerDefaultInstance(PromptRejectedError.class, promptRejectedError);
        }

        private PromptRejectedError() {
        }

        public static h n() {
            return (h) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"supportResourcesRequired_"});
            }
            if (iOrdinal == 3) {
                return new PromptRejectedError();
            }
            if (iOrdinal == 4) {
                return new h(DEFAULT_INSTANCE);
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
            synchronized (PromptRejectedError.class) {
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

        public final void o(boolean z) {
            this.supportResourcesRequired_ = z;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class RateLimitedError extends com.google.protobuf.h implements v2j0 {
        private static final RateLimitedError DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            RateLimitedError rateLimitedError = new RateLimitedError();
            DEFAULT_INSTANCE = rateLimitedError;
            com.google.protobuf.h.registerDefaultInstance(RateLimitedError.class, rateLimitedError);
        }

        private RateLimitedError() {
        }

        public static RateLimitedError n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new RateLimitedError();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (RateLimitedError.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AgenticListError agenticListError = new AgenticListError();
        DEFAULT_INSTANCE = agenticListError;
        com.google.protobuf.h.registerDefaultInstance(AgenticListError.class, agenticListError);
    }

    private AgenticListError() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static c r() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(boolean z) {
        this.retryable_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\u0010\n\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003Ț\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"details_", "detailsCase_", "displayText_", "retryable_", "promptIds_", InternalError.class, NoContentError.class, CappingExceededError.class, PromptRejectedError.class, InvalidArgumentError.class, AbortedError.class, RateLimitedError.class});
        }
        if (iOrdinal == 3) {
            return new AgenticListError();
        }
        if (iOrdinal == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (AgenticListError.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.promptIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.promptIds_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CappingExceededError o() {
        return this.detailsCase_ == 12 ? (CappingExceededError) this.details_ : CappingExceededError.n();
    }

    public final int p() {
        int i = this.detailsCase_;
        if (i == 0) {
            return 8;
        }
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 12:
                return 3;
            case 13:
                return 4;
            case 14:
                return 5;
            case 15:
                return 6;
            case 16:
                return 7;
            default:
                return 0;
        }
    }

    public final String q() {
        return this.displayText_;
    }

    public final void s(AbortedError abortedError) {
        this.details_ = abortedError;
        this.detailsCase_ = 15;
    }

    public final void t(CappingExceededError cappingExceededError) {
        this.details_ = cappingExceededError;
        this.detailsCase_ = 12;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.displayText_ = str;
    }

    public final void v(InternalError internalError) {
        internalError.getClass();
        this.details_ = internalError;
        this.detailsCase_ = 10;
    }

    public final void w(InvalidArgumentError invalidArgumentError) {
        invalidArgumentError.getClass();
        this.details_ = invalidArgumentError;
        this.detailsCase_ = 14;
    }

    public final void x(NoContentError noContentError) {
        noContentError.getClass();
        this.details_ = noContentError;
        this.detailsCase_ = 11;
    }

    public final void y(PromptRejectedError promptRejectedError) {
        this.details_ = promptRejectedError;
        this.detailsCase_ = 13;
    }

    public final void z(RateLimitedError rateLimitedError) {
        rateLimitedError.getClass();
        this.details_ = rateLimitedError;
        this.detailsCase_ = 16;
    }
}
