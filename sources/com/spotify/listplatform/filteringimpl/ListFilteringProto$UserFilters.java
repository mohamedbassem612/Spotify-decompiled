package com.spotify.listplatform.filteringimpl;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.ghc0;
import p.guc0;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ListFilteringProto$UserFilters extends h implements v2j0 {
    private static final ListFilteringProto$UserFilters DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 filters_ = qng0.b;

    static {
        ListFilteringProto$UserFilters listFilteringProto$UserFilters = new ListFilteringProto$UserFilters();
        DEFAULT_INSTANCE = listFilteringProto$UserFilters;
        h.registerDefaultInstance(ListFilteringProto$UserFilters.class, listFilteringProto$UserFilters);
    }

    private ListFilteringProto$UserFilters() {
    }

    public static ListFilteringProto$UserFilters n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"filters_", guc0.a});
        }
        if (iOrdinal == 3) {
            return new ListFilteringProto$UserFilters();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (ListFilteringProto$UserFilters.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.filters_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
