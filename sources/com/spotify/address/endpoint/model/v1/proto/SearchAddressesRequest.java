package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.jf40;
import p.jv41;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class SearchAddressesRequest extends com.google.protobuf.h implements v2j0 {
    private static final SearchAddressesRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    private String query_ = "";

    static {
        SearchAddressesRequest searchAddressesRequest = new SearchAddressesRequest();
        DEFAULT_INSTANCE = searchAddressesRequest;
        com.google.protobuf.h.registerDefaultInstance(SearchAddressesRequest.class, searchAddressesRequest);
    }

    private SearchAddressesRequest() {
    }

    public static jv41 o() {
        return (jv41) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"query_"});
        }
        if (iOrdinal == 3) {
            return new SearchAddressesRequest();
        }
        if (iOrdinal == 4) {
            return new jv41(DEFAULT_INSTANCE);
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
        synchronized (SearchAddressesRequest.class) {
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

    public final String n() {
        return this.query_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.query_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
