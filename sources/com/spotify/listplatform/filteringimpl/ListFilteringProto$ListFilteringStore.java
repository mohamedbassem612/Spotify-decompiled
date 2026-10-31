package com.spotify.listplatform.filteringimpl;

import com.google.protobuf.h;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.fuc0;
import p.ghc0;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ListFilteringProto$ListFilteringStore extends h implements v2j0 {
    private static final ListFilteringProto$ListFilteringStore DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_FILTERS_FIELD_NUMBER = 1;
    private qng0 userFilters_ = qng0.b;

    static {
        ListFilteringProto$ListFilteringStore listFilteringProto$ListFilteringStore = new ListFilteringProto$ListFilteringStore();
        DEFAULT_INSTANCE = listFilteringProto$ListFilteringStore;
        h.registerDefaultInstance(ListFilteringProto$ListFilteringStore.class, listFilteringProto$ListFilteringStore);
    }

    private ListFilteringProto$ListFilteringStore() {
    }

    public static ListFilteringProto$ListFilteringStore n() {
        return DEFAULT_INSTANCE;
    }

    public static ListFilteringProto$ListFilteringStore p(FileInputStream fileInputStream) {
        return (ListFilteringProto$ListFilteringStore) h.parseFrom(DEFAULT_INSTANCE, fileInputStream);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"userFilters_", fuc0.a});
        }
        if (iOrdinal == 3) {
            return new ListFilteringProto$ListFilteringStore();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (ListFilteringProto$ListFilteringStore.class) {
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
        return Collections.unmodifiableMap(this.userFilters_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
