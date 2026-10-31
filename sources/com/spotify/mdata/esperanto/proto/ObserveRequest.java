package com.spotify.mdata.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.hz00;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObserveRequest extends h implements v2j0 {
    private static final ObserveRequest DEFAULT_INSTANCE;
    public static final int EXTENSION_QUERY_FIELD_NUMBER = 1;
    public static final int FEATURE_ID_FIELD_NUMBER = 2;
    public static final int NOTIFY_ON_CHANGES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private h290 extensionQuery_ = h.emptyProtobufList();
    private String featureId_ = "";
    private boolean notifyOnChanges_;

    public static final class ExtensionQuery extends h implements v2j0 {
        private static final ExtensionQuery DEFAULT_INSTANCE;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        public static final int EXTENSION_KIND_FIELD_NUMBER = 2;
        public static final int NOTIFY_ON_LOCAL_CACHE_CHANGES_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private String entityUri_ = "";
        private int extensionKind_;
        private boolean notifyOnLocalCacheChanges_;

        static {
            ExtensionQuery extensionQuery = new ExtensionQuery();
            DEFAULT_INSTANCE = extensionQuery;
            h.registerDefaultInstance(ExtensionQuery.class, extensionQuery);
        }

        private ExtensionQuery() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007", new Object[]{"entityUri_", "extensionKind_", "notifyOnLocalCacheChanges_"});
            }
            if (iOrdinal == 3) {
                return new ExtensionQuery();
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
            synchronized (ExtensionQuery.class) {
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

        public final void o(String str) {
            str.getClass();
            this.entityUri_ = str;
        }

        public final void p(hz00 hz00Var) {
            this.extensionKind_ = hz00Var.getNumber();
        }

        public final void q(boolean z) {
            this.notifyOnLocalCacheChanges_ = z;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ObserveRequest observeRequest = new ObserveRequest();
        DEFAULT_INSTANCE = observeRequest;
        h.registerDefaultInstance(ObserveRequest.class, observeRequest);
    }

    private ObserveRequest() {
    }

    public static a o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0007", new Object[]{"extensionQuery_", ExtensionQuery.class, "featureId_", "notifyOnChanges_"});
        }
        if (iOrdinal == 3) {
            return new ObserveRequest();
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
        synchronized (ObserveRequest.class) {
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
        h290 h290VarMutableCopy = this.extensionQuery_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.extensionQuery_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.featureId_ = str;
    }

    public final void q(boolean z) {
        this.notifyOnChanges_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
