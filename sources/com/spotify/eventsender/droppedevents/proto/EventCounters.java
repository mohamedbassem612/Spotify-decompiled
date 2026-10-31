package com.spotify.eventsender.droppedevents.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.e290;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EventCounters extends h implements v2j0 {
    private static final EventCounters DEFAULT_INSTANCE;
    public static final int EVENT_NAME_TO_COUNTERS_MAP_FIELD_NUMBER = 2;
    public static final int FILE_FORMAT_VERSION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 eventNameToCountersMap_ = qng0.b;
    private int fileFormatVersion_;

    public static final class Counters extends h implements v2j0 {
        public static final int COUNTERS_FIELD_NUMBER = 1;
        private static final Counters DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int countersMemoizedSerializedSize = -1;
        private e290 counters_ = h.emptyLongList();

        static {
            Counters counters = new Counters();
            DEFAULT_INSTANCE = counters;
            h.registerDefaultInstance(Counters.class, counters);
        }

        private Counters() {
        }

        public static Counters p() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"counters_"});
            }
            if (iOrdinal == 3) {
                return new Counters();
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
            synchronized (Counters.class) {
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
            e290 e290VarMutableCopy = this.counters_;
            if (!((i9) e290VarMutableCopy).a) {
                e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
                this.counters_ = e290VarMutableCopy;
            }
            s8.addAll(arrayList, e290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final e290 o() {
            return this.counters_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EventCounters eventCounters = new EventCounters();
        DEFAULT_INSTANCE = eventCounters;
        h.registerDefaultInstance(EventCounters.class, eventCounters);
    }

    private EventCounters() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static a q() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventCounters r(byte[] bArr) {
        return (EventCounters) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0004\u00022", new Object[]{"fileFormatVersion_", "eventNameToCountersMap_", c.a});
        }
        if (iOrdinal == 3) {
            return new EventCounters();
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
        synchronized (EventCounters.class) {
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
        return Collections.unmodifiableMap(this.eventNameToCountersMap_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.fileFormatVersion_;
    }

    public final qng0 p() {
        qng0 qng0Var = this.eventNameToCountersMap_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.eventNameToCountersMap_ = qng0VarH;
        return qng0VarH;
    }

    public final void s() {
        this.fileFormatVersion_ = 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
