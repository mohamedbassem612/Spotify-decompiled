package com.spotify.kidsentitybanning.search.v1;

import com.google.protobuf.h;
import p.bf40;
import p.j470;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r5d0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ListViewRequest extends h implements v2j0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final ListViewRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIEW_FIELD_NUMBER = 2;
    private String childId_ = "";
    private int view_;

    static {
        ListViewRequest listViewRequest = new ListViewRequest();
        DEFAULT_INSTANCE = listViewRequest;
        h.registerDefaultInstance(ListViewRequest.class, listViewRequest);
    }

    private ListViewRequest() {
    }

    public static r5d0 n() {
        return (r5d0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"childId_", "view_"});
        }
        if (iOrdinal == 3) {
            return new ListViewRequest();
        }
        if (iOrdinal == 4) {
            return new r5d0(DEFAULT_INSTANCE);
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
        synchronized (ListViewRequest.class) {
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
        this.childId_ = str;
    }

    public final void p(j470 j470Var) {
        this.view_ = j470Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
