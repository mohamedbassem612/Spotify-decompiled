package com.spotify.listplatform.filteringimpl;

import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.ghc0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ListFilteringProto$IntList extends h implements v2j0 {
    private static final ListFilteringProto$IntList DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int valuesMemoizedSerializedSize = -1;
    private b290 values_ = h.emptyIntList();

    static {
        ListFilteringProto$IntList listFilteringProto$IntList = new ListFilteringProto$IntList();
        DEFAULT_INSTANCE = listFilteringProto$IntList;
        h.registerDefaultInstance(ListFilteringProto$IntList.class, listFilteringProto$IntList);
    }

    private ListFilteringProto$IntList() {
    }

    public static ListFilteringProto$IntList n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"values_"});
        }
        if (iOrdinal == 3) {
            return new ListFilteringProto$IntList();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (ListFilteringProto$IntList.class) {
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

    public final List o() {
        return this.values_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
