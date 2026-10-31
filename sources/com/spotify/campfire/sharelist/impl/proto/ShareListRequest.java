package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShareListRequest extends h implements v2j0 {
    private static final ShareListRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 3;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShareListFilter filter_;
    private h290 username_ = h.emptyProtobufList();
    private String hierarchyId_ = "";

    public static final class ShareListFilter extends h implements v2j0 {
        private static final ShareListFilter DEFAULT_INSTANCE;
        public static final int EXCLUDE_ACTIVE_CHATS_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private boolean excludeActiveChats_;

        static {
            ShareListFilter shareListFilter = new ShareListFilter();
            DEFAULT_INSTANCE = shareListFilter;
            h.registerDefaultInstance(ShareListFilter.class, shareListFilter);
        }

        private ShareListFilter() {
        }

        public static b n() {
            return (b) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"excludeActiveChats_"});
            }
            if (iOrdinal == 3) {
                return new ShareListFilter();
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
            synchronized (ShareListFilter.class) {
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
            this.excludeActiveChats_ = z;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ShareListRequest shareListRequest = new ShareListRequest();
        DEFAULT_INSTANCE = shareListRequest;
        h.registerDefaultInstance(ShareListRequest.class, shareListRequest);
    }

    private ShareListRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "username_", "hierarchyId_", "filter_"});
        }
        if (iOrdinal == 3) {
            return new ShareListRequest();
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
        synchronized (ShareListRequest.class) {
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

    public final void o(ShareListFilter shareListFilter) {
        shareListFilter.getClass();
        this.filter_ = shareListFilter;
        this.bitField0_ |= 2;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.hierarchyId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
