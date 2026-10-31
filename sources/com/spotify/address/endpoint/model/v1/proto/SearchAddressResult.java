package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.iv41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class SearchAddressResult extends com.google.protobuf.h implements v2j0 {
    public static final int ADDRESS_ID_FIELD_NUMBER = 1;
    private static final SearchAddressResult DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String addressId_ = "";
    private String description_ = "";

    static {
        SearchAddressResult searchAddressResult = new SearchAddressResult();
        DEFAULT_INSTANCE = searchAddressResult;
        com.google.protobuf.h.registerDefaultInstance(SearchAddressResult.class, searchAddressResult);
    }

    private SearchAddressResult() {
    }

    public static iv41 o() {
        return (iv41) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"addressId_", "description_"});
        }
        if (iOrdinal == 3) {
            return new SearchAddressResult();
        }
        if (iOrdinal == 4) {
            return new iv41(DEFAULT_INSTANCE);
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
        synchronized (SearchAddressResult.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String n() {
        return this.addressId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.addressId_ = str;
    }

    public final void setDescription(String str) {
        this.description_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
