package com.spotify.wrapped.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CounterResponse extends h implements v2j0 {
    private static final CounterResponse DEFAULT_INSTANCE;
    public static final int INTERVAL_SECONDS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_END_FIELD_NUMBER = 2;
    public static final int VALUE_FORMAT_FIELD_NUMBER = 4;
    public static final int VALUE_START_FIELD_NUMBER = 1;
    private int bitField0_;
    private int intervalSeconds_;
    private long valueEnd_;
    private ValueFormat valueFormat_;
    private long valueStart_;

    public static final class ValueFormat extends h implements v2j0 {
        private static final ValueFormat DEFAULT_INSTANCE;
        public static final int DELIMITER_FIELD_NUMBER = 2;
        public static final int FORMAT_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String format_ = "";
        private String delimiter_ = "";

        static {
            ValueFormat valueFormat = new ValueFormat();
            DEFAULT_INSTANCE = valueFormat;
            h.registerDefaultInstance(ValueFormat.class, valueFormat);
        }

        private ValueFormat() {
        }

        public static ValueFormat n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"format_", "delimiter_"});
            }
            if (iOrdinal == 3) {
                return new ValueFormat();
            }
            if (iOrdinal == 4) {
                return new q(DEFAULT_INSTANCE);
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
            synchronized (ValueFormat.class) {
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

        public final String getFormat() {
            return this.format_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.delimiter_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CounterResponse counterResponse = new CounterResponse();
        DEFAULT_INSTANCE = counterResponse;
        h.registerDefaultInstance(CounterResponse.class, counterResponse);
    }

    private CounterResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u000b\u0004ဉ\u0000", new Object[]{"bitField0_", "valueStart_", "valueEnd_", "intervalSeconds_", "valueFormat_"});
        }
        if (iOrdinal == 3) {
            return new CounterResponse();
        }
        if (iOrdinal == 4) {
            return new p(DEFAULT_INSTANCE);
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
        synchronized (CounterResponse.class) {
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

    public final int n() {
        return this.intervalSeconds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.valueEnd_;
    }

    public final ValueFormat p() {
        ValueFormat valueFormat = this.valueFormat_;
        return valueFormat == null ? ValueFormat.n() : valueFormat;
    }

    public final long q() {
        return this.valueStart_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
