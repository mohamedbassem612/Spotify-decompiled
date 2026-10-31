package com.spotify.listplatform.sortingimpl;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.v3d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ListSortingProto$StoredProvidedSortOrder extends h implements v2j0 {
    private static final ListSortingProto$StoredProvidedSortOrder DEFAULT_INSTANCE;
    public static final int INTERNAL_ID_FIELD_NUMBER = 1;
    public static final int IS_REVERSIBLE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private boolean isReversible_;
    private String internalId_ = "";
    private String name_ = "";

    static {
        ListSortingProto$StoredProvidedSortOrder listSortingProto$StoredProvidedSortOrder = new ListSortingProto$StoredProvidedSortOrder();
        DEFAULT_INSTANCE = listSortingProto$StoredProvidedSortOrder;
        h.registerDefaultInstance(ListSortingProto$StoredProvidedSortOrder.class, listSortingProto$StoredProvidedSortOrder);
    }

    private ListSortingProto$StoredProvidedSortOrder() {
    }

    public static ListSortingProto$StoredProvidedSortOrder n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static v3d0 q() {
        return (v3d0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"internalId_", "name_", "isReversible_"});
        }
        if (iOrdinal == 3) {
            return new ListSortingProto$StoredProvidedSortOrder();
        }
        if (iOrdinal == 4) {
            return new v3d0(DEFAULT_INSTANCE);
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
        synchronized (ListSortingProto$StoredProvidedSortOrder.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.internalId_;
    }

    public final boolean p() {
        return this.isReversible_;
    }

    public final void r(String str) {
        str.getClass();
        this.internalId_ = str;
    }

    public final void s(boolean z) {
        this.isReversible_ = z;
    }

    public final void t(String str) {
        str.getClass();
        this.name_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
