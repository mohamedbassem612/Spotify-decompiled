package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.boz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsLocalFiles$Query extends h implements v2j0 {
    private static final EsLocalFiles$Query DEFAULT_INSTANCE;
    public static final int MIN_LENGTH_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 3;
    public static final int REMOVE_DUPLICATE_LINKS_FIELD_NUMBER = 5;
    public static final int SORT_BY_FIELD_NUMBER = 2;
    public static final int TEXT_FILTER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int minLength_;
    private EsLocalFiles$Range range_;
    private boolean removeDuplicateLinks_;
    private int sortBy_;
    private String textFilter_ = "";

    static {
        EsLocalFiles$Query esLocalFiles$Query = new EsLocalFiles$Query();
        DEFAULT_INSTANCE = esLocalFiles$Query;
        h.registerDefaultInstance(EsLocalFiles$Query.class, esLocalFiles$Query);
    }

    private EsLocalFiles$Query() {
    }

    public static boz n() {
        return (boz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004\u000b\u0005\u0007", new Object[]{"bitField0_", "textFilter_", "sortBy_", "range_", "minLength_", "removeDuplicateLinks_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$Query();
        }
        if (iOrdinal == 4) {
            return new boz(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$Query.class) {
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
        this.textFilter_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
