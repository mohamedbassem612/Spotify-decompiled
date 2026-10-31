package com.spotify.searchview.proto;

import p.bf40;
import p.h290;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Filters extends com.google.protobuf.h implements v2j0 {
    private static final Filters DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 filters_ = com.google.protobuf.h.emptyProtobufList();

    static {
        Filters filters = new Filters();
        DEFAULT_INSTANCE = filters;
        com.google.protobuf.h.registerDefaultInstance(Filters.class, filters);
    }

    private Filters() {
    }

    public static Filters n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"filters_", Filter.class});
        }
        if (iOrdinal == 3) {
            return new Filters();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (Filters.class) {
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

    public final h290 o() {
        return this.filters_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
