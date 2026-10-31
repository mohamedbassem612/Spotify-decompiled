package com.spotify.watchfeed.api.v1;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.hhc;
import p.i9;
import p.jf40;
import p.nal1;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WatchFeedRequest extends h implements v2j0 {
    public static final int CONSUMED_GROUPS_FIELD_NUMBER = 100;
    private static final WatchFeedRequest DEFAULT_INSTANCE;
    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int PAGINATION_FIELD_NUMBER = 101;
    public static final int PAGINATION_V1_FIELD_NUMBER = 98;
    public static final int PARAMETERS_FIELD_NUMBER = 99;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private RequestPagination paginationV1_;
    private Pagination pagination_;
    private qng0 parameters_ = qng0.b;
    private String feedId_ = "";
    private String entityId_ = "";
    private h290 consumedGroups_ = h.emptyProtobufList();

    public static final class Pagination extends h implements v2j0 {
        private static final Pagination DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TOKEN_FIELD_NUMBER = 1;
        private phc token_ = phc.b;

        static {
            Pagination pagination = new Pagination();
            DEFAULT_INSTANCE = pagination;
            h.registerDefaultInstance(Pagination.class, pagination);
        }

        private Pagination() {
        }

        public static e n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"token_"});
            }
            if (iOrdinal == 3) {
                return new Pagination();
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
            synchronized (Pagination.class) {
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

        public final void o(hhc hhcVar) {
            this.token_ = hhcVar;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        WatchFeedRequest watchFeedRequest = new WatchFeedRequest();
        DEFAULT_INSTANCE = watchFeedRequest;
        h.registerDefaultInstance(WatchFeedRequest.class, watchFeedRequest);
    }

    private WatchFeedRequest() {
    }

    public static d p() {
        return (d) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001e\u0006\u0001\u0001\u0000\u0001Ȉ\u0002Ȉbဉ\u0000c2d\u001beဉ\u0001", new Object[]{"bitField0_", "feedId_", "entityId_", "paginationV1_", "parameters_", nal1.a, "consumedGroups_", ConsumedGroup.class, "pagination_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedRequest();
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
        synchronized (WatchFeedRequest.class) {
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
        h290 h290VarMutableCopy = this.consumedGroups_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.consumedGroups_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.parameters_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.parameters_ = qng0VarH;
        return qng0VarH;
    }

    public final void q(String str) {
        str.getClass();
        this.entityId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.feedId_ = str;
    }

    public final void s(Pagination pagination) {
        pagination.getClass();
        this.pagination_ = pagination;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
