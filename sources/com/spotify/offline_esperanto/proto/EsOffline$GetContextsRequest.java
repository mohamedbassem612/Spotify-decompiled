package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsOffline$GetContextsRequest extends h implements v2j0 {
    private static final EsOffline$GetContextsRequest DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int FILTERING_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 1;
    public static final int URIS_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsOffline$DeviceKey device_;
    private Filtering filtering_;
    private EsOffline$ContextInfoPolicy policy_;
    private h290 uris_ = h.emptyProtobufList();

    public static final class Filtering extends h implements v2j0 {
        private static final Filtering DEFAULT_INSTANCE;
        public static final int ITEM_URIS_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private h290 itemUris_ = h.emptyProtobufList();

        static {
            Filtering filtering = new Filtering();
            DEFAULT_INSTANCE = filtering;
            h.registerDefaultInstance(Filtering.class, filtering);
        }

        private Filtering() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static d q() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"itemUris_"});
            }
            if (iOrdinal == 3) {
                return new Filtering();
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
            synchronized (Filtering.class) {
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

        public final void o(Iterable iterable) {
            h290 h290VarMutableCopy = this.itemUris_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
                this.itemUris_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final void p(String str) {
            str.getClass();
            h290 h290VarMutableCopy = this.itemUris_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
                this.itemUris_ = h290VarMutableCopy;
            }
            h290VarMutableCopy.add(str);
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsOffline$GetContextsRequest esOffline$GetContextsRequest = new EsOffline$GetContextsRequest();
        DEFAULT_INSTANCE = esOffline$GetContextsRequest;
        h.registerDefaultInstance(EsOffline$GetContextsRequest.class, esOffline$GetContextsRequest);
    }

    private EsOffline$GetContextsRequest() {
    }

    public static EsOffline$GetContextsRequest p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static c q() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ț\u0004ဉ\u0002", new Object[]{"bitField0_", "policy_", "device_", "uris_", "filtering_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$GetContextsRequest();
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
        synchronized (EsOffline$GetContextsRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.uris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uris_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.uris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uris_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void r(EsOffline$DeviceKey esOffline$DeviceKey) {
        esOffline$DeviceKey.getClass();
        this.device_ = esOffline$DeviceKey;
        this.bitField0_ |= 2;
    }

    public final void s(Filtering filtering) {
        filtering.getClass();
        this.filtering_ = filtering;
        this.bitField0_ |= 4;
    }

    public final void t(EsOffline$ContextInfoPolicy esOffline$ContextInfoPolicy) {
        esOffline$ContextInfoPolicy.getClass();
        this.policy_ = esOffline$ContextInfoPolicy;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
