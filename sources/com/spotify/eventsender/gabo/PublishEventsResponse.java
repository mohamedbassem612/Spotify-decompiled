package com.spotify.eventsender.gabo;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class PublishEventsResponse extends h implements v2j0 {
    private static final PublishEventsResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 error_ = h.emptyProtobufList();

    public static final class EventError extends h implements v2j0 {
        private static final EventError DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int REASON_FIELD_NUMBER = 3;
        public static final int TRANSIENT_FIELD_NUMBER = 2;
        private int index_;
        private int reason_;
        private boolean transient_;

        static {
            EventError eventError = new EventError();
            DEFAULT_INSTANCE = eventError;
            h.registerDefaultInstance(EventError.class, eventError);
        }

        private EventError() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.h
        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            qzr0 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0004", new Object[]{"index_", "transient_", "reason_"});
            }
            if (iOrdinal == 3) {
                return new EventError();
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
            synchronized (EventError.class) {
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

        @Override // com.google.protobuf.h, p.v2j0
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final int getIndex() {
            return this.index_;
        }

        @Override // com.google.protobuf.h, p.s2j0
        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int o() {
            return this.reason_;
        }

        public final boolean p() {
            return this.transient_;
        }

        @Override // com.google.protobuf.h, p.s2j0
        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PublishEventsResponse publishEventsResponse = new PublishEventsResponse();
        DEFAULT_INSTANCE = publishEventsResponse;
        h.registerDefaultInstance(PublishEventsResponse.class, publishEventsResponse);
    }

    private PublishEventsResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"error_", EventError.class});
        }
        if (iOrdinal == 3) {
            return new PublishEventsResponse();
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
        synchronized (PublishEventsResponse.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.error_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
