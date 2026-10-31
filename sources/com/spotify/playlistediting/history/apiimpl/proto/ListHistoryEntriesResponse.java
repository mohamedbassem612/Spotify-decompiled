package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ghc0;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ListHistoryEntriesResponse extends h implements v2j0 {
    private static final ListHistoryEntriesResponse DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 1;
    public static final int ENTRIES_WERE_EXCLUDED_DUE_TO_RESTRICTION_FIELD_NUMBER = 4;
    public static final int NEXT_CURSOR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RESTRICTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean entriesWereExcludedDueToRestriction_;
    private h290 entries_ = h.emptyProtobufList();
    private phc nextCursor_ = phc.b;
    private HistoryRestriction restriction_;

    static {
        ListHistoryEntriesResponse listHistoryEntriesResponse = new ListHistoryEntriesResponse();
        DEFAULT_INSTANCE = listHistoryEntriesResponse;
        h.registerDefaultInstance(ListHistoryEntriesResponse.class, listHistoryEntriesResponse);
    }

    private ListHistoryEntriesResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ည\u0000\u0003ဉ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "entries_", HistoryEntry.class, "nextCursor_", "restriction_", "entriesWereExcludedDueToRestriction_"});
        }
        if (iOrdinal == 3) {
            return new ListHistoryEntriesResponse();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (ListHistoryEntriesResponse.class) {
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

    public final h290 n() {
        return this.entries_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.entriesWereExcludedDueToRestriction_;
    }

    public final phc p() {
        return this.nextCursor_;
    }

    public final HistoryRestriction q() {
        HistoryRestriction historyRestriction = this.restriction_;
        return historyRestriction == null ? HistoryRestriction.n() : historyRestriction;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
