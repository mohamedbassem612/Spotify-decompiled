package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tuc0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ListHistoryEntriesRequest extends h implements v2j0 {
    public static final int CURSOR_FIELD_NUMBER = 3;
    private static final ListHistoryEntriesRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int MAX_RESULTS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int maxResults_;
    private String entityUri_ = "";
    private phc cursor_ = phc.b;

    static {
        ListHistoryEntriesRequest listHistoryEntriesRequest = new ListHistoryEntriesRequest();
        DEFAULT_INSTANCE = listHistoryEntriesRequest;
        h.registerDefaultInstance(ListHistoryEntriesRequest.class, listHistoryEntriesRequest);
    }

    private ListHistoryEntriesRequest() {
    }

    public static tuc0 n() {
        return (tuc0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"bitField0_", "entityUri_", "maxResults_", "cursor_"});
        }
        if (iOrdinal == 3) {
            return new ListHistoryEntriesRequest();
        }
        if (iOrdinal == 4) {
            return new tuc0(DEFAULT_INSTANCE);
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
        synchronized (ListHistoryEntriesRequest.class) {
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
        this.bitField0_ |= 1;
        this.entityUri_ = str;
    }

    public final void p() {
        this.bitField0_ |= 2;
        this.maxResults_ = 50;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
