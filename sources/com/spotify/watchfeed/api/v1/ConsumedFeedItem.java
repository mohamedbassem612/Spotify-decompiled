package com.spotify.watchfeed.api.v1;

import com.google.protobuf.Int64Value;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ConsumedFeedItem extends h implements v2j0 {
    public static final int CONSUMPTION_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int CONSUMPTION_TIME_MS_FIELD_NUMBER = 2;
    public static final int DECISION_ID_FIELD_NUMBER = 4;
    private static final ConsumedFeedItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int USER_INTERACTIONS_FIELD_NUMBER = 5;
    private int bitField0_;
    private Int64Value consumptionTimeMs_;
    private Timestamp consumptionTimestamp_;
    private String uri_ = "";
    private String decisionId_ = "";
    private h290 userInteractions_ = h.emptyProtobufList();

    public static final class UserInteraction extends h implements v2j0 {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final UserInteraction DEFAULT_INSTANCE;
        public static final int PARAMETERS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int action_;
        private qng0 parameters_ = qng0.b;

        static {
            UserInteraction userInteraction = new UserInteraction();
            DEFAULT_INSTANCE = userInteraction;
            h.registerDefaultInstance(UserInteraction.class, userInteraction);
        }

        private UserInteraction() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\f\u00022", new Object[]{"action_", "parameters_", c.a});
            }
            if (iOrdinal == 3) {
                return new UserInteraction();
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
            synchronized (UserInteraction.class) {
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
        ConsumedFeedItem consumedFeedItem = new ConsumedFeedItem();
        DEFAULT_INSTANCE = consumedFeedItem;
        h.registerDefaultInstance(ConsumedFeedItem.class, consumedFeedItem);
    }

    private ConsumedFeedItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005\u001b", new Object[]{"bitField0_", "uri_", "consumptionTimeMs_", "consumptionTimestamp_", "decisionId_", "userInteractions_", UserInteraction.class});
        }
        if (iOrdinal == 3) {
            return new ConsumedFeedItem();
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
        synchronized (ConsumedFeedItem.class) {
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

    public final void o(Int64Value int64Value) {
        int64Value.getClass();
        this.consumptionTimeMs_ = int64Value;
        this.bitField0_ |= 1;
    }

    public final void p(Timestamp timestamp) {
        this.consumptionTimestamp_ = timestamp;
        this.bitField0_ |= 2;
    }

    public final void q(String str) {
        str.getClass();
        this.decisionId_ = str;
    }

    public final void r(String str) {
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
