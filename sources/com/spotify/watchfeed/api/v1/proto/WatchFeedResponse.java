package com.spotify.watchfeed.api.v1.proto;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WatchFeedResponse extends h implements v2j0 {
    public static final int DECISION_ID_FIELD_NUMBER = 4;
    private static final WatchFeedResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IS_FULLSCREEN_FIELD_NUMBER = 6;
    public static final int ITEMS_FIELD_NUMBER = 2;
    public static final int ONBOARDING_FIELD_NUMBER = 3;
    public static final int PAGINATION_FIELD_NUMBER = 100;
    public static final int PAGINATION_V1_FIELD_NUMBER = 98;
    private static volatile qzr0 PARSER = null;
    public static final int PIVOTING_FIELD_NUMBER = 99;
    public static final int REPORTING_CONTEXT_URI_FIELD_NUMBER = 8;
    public static final int SHOW_SCROLLBAR_FIELD_NUMBER = 7;
    public static final int SNACKBAR_MESSAGE_FIELD_NUMBER = 5;
    private int bitField0_;
    private Any header_;
    private boolean isFullscreen_;
    private Any onboarding_;
    private ResponsePagination paginationV1_;
    private Pagination pagination_;
    private ResponsePivoting pivoting_;
    private boolean showScrollbar_;
    private Any snackbarMessage_;
    private h290 items_ = h.emptyProtobufList();
    private String decisionId_ = "";
    private String reportingContextUri_ = "";

    public static final class Pagination extends h implements v2j0 {
        private static final Pagination DEFAULT_INSTANCE;
        public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int PREVIOUS_PAGE_TOKEN_FIELD_NUMBER = 1;
        private int bitField0_;
        private phc nextPageToken_;
        private phc previousPageToken_;

        static {
            Pagination pagination = new Pagination();
            DEFAULT_INSTANCE = pagination;
            h.registerDefaultInstance(Pagination.class, pagination);
        }

        private Pagination() {
            hhc hhcVar = phc.b;
            this.previousPageToken_ = hhcVar;
            this.nextPageToken_ = hhcVar;
        }

        public static Pagination n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"bitField0_", "previousPageToken_", "nextPageToken_"});
            }
            if (iOrdinal == 3) {
                return new Pagination();
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

        public final phc o() {
            return this.nextPageToken_;
        }

        public final phc p() {
            return this.previousPageToken_;
        }

        public final boolean q() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean r() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        WatchFeedResponse watchFeedResponse = new WatchFeedResponse();
        DEFAULT_INSTANCE = watchFeedResponse;
        h.registerDefaultInstance(WatchFeedResponse.class, watchFeedResponse);
    }

    private WatchFeedResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001d\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004Ȉ\u0005ဉ\u0002\u0006\u0007\u0007\u0007\bȈbဉ\u0003cဉ\u0004dဉ\u0005", new Object[]{"bitField0_", "header_", "items_", Any.class, "onboarding_", "decisionId_", "snackbarMessage_", "isFullscreen_", "showScrollbar_", "reportingContextUri_", "paginationV1_", "pivoting_", "pagination_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedResponse();
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
        synchronized (WatchFeedResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String n() {
        return this.decisionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Any o() {
        Any any = this.header_;
        return any == null ? Any.o() : any;
    }

    public final boolean p() {
        return this.isFullscreen_;
    }

    public final Any q() {
        Any any = this.onboarding_;
        return any == null ? Any.o() : any;
    }

    public final Pagination r() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.n() : pagination;
    }

    public final ResponsePivoting s() {
        ResponsePivoting responsePivoting = this.pivoting_;
        return responsePivoting == null ? ResponsePivoting.o() : responsePivoting;
    }

    public final String t() {
        return this.reportingContextUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.showScrollbar_;
    }

    public final Any v() {
        Any any = this.snackbarMessage_;
        return any == null ? Any.o() : any;
    }

    public final boolean w() {
        return (this.bitField0_ & 32) != 0;
    }
}
