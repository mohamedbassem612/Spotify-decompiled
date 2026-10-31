package com.spotify.eventsender.internalerrors.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EventSenderInternalErrors extends h implements v2j0 {
    private static final EventSenderInternalErrors DEFAULT_INSTANCE;
    public static final int ERROR_TO_COUNTS_MAP_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 errorToCountsMap_ = qng0.b;

    public static final class Counts extends h implements v2j0 {
        private static final Counts DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int REPORTEDCOUNT_FIELD_NUMBER = 2;
        public static final int TOTALCOUNT_FIELD_NUMBER = 1;
        private long reportedCount_;
        private long totalCount_;

        static {
            Counts counts = new Counts();
            DEFAULT_INSTANCE = counts;
            h.registerDefaultInstance(Counts.class, counts);
        }

        private Counts() {
        }

        public static Counts n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static b q() {
            return (b) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"totalCount_", "reportedCount_"});
            }
            if (iOrdinal == 3) {
                return new Counts();
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
            synchronized (Counts.class) {
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

        public final long o() {
            return this.reportedCount_;
        }

        public final long p() {
            return this.totalCount_;
        }

        public final void r(long j) {
            this.reportedCount_ = j;
        }

        public final void s(long j) {
            this.totalCount_ = j;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EventSenderInternalErrors eventSenderInternalErrors = new EventSenderInternalErrors();
        DEFAULT_INSTANCE = eventSenderInternalErrors;
        h.registerDefaultInstance(EventSenderInternalErrors.class, eventSenderInternalErrors);
    }

    private EventSenderInternalErrors() {
    }

    public static a p() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EventSenderInternalErrors q(byte[] bArr) {
        return (EventSenderInternalErrors) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"errorToCountsMap_", c.a});
        }
        if (iOrdinal == 3) {
            return new EventSenderInternalErrors();
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
        synchronized (EventSenderInternalErrors.class) {
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

    public final Map n() {
        return Collections.unmodifiableMap(this.errorToCountsMap_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.errorToCountsMap_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.errorToCountsMap_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
