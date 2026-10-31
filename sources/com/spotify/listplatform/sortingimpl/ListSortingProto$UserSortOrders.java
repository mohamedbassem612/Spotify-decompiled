package com.spotify.listplatform.sortingimpl;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w3d0;
import p.x3d0;
import p.y3d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ListSortingProto$UserSortOrders extends h implements v2j0 {
    private static final ListSortingProto$UserSortOrders DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDED_SORT_ORDERS_FIELD_NUMBER = 2;
    public static final int SORT_ORDERS_FIELD_NUMBER = 1;
    private qng0 providedSortOrders_;
    private qng0 sortOrders_;

    static {
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = new ListSortingProto$UserSortOrders();
        DEFAULT_INSTANCE = listSortingProto$UserSortOrders;
        h.registerDefaultInstance(ListSortingProto$UserSortOrders.class, listSortingProto$UserSortOrders);
    }

    private ListSortingProto$UserSortOrders() {
        qng0 qng0Var = qng0.b;
        this.sortOrders_ = qng0Var;
        this.providedSortOrders_ = qng0Var;
    }

    public static ListSortingProto$UserSortOrders n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"sortOrders_", y3d0.a, "providedSortOrders_", x3d0.a});
        }
        if (iOrdinal == 3) {
            return new ListSortingProto$UserSortOrders();
        }
        if (iOrdinal == 4) {
            return new w3d0(DEFAULT_INSTANCE);
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
        synchronized (ListSortingProto$UserSortOrders.class) {
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
        return Collections.unmodifiableMap(this.providedSortOrders_);
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.sortOrders_);
    }

    public final qng0 q() {
        qng0 qng0Var = this.providedSortOrders_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.providedSortOrders_ = qng0VarH;
        return qng0VarH;
    }

    public final qng0 r() {
        qng0 qng0Var = this.sortOrders_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.sortOrders_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
