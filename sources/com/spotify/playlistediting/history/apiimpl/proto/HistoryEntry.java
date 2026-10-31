package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.m660;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class HistoryEntry extends h implements v2j0 {
    public static final int ASSOCIATED_LENSES_FIELD_NUMBER = 4;
    private static final HistoryEntry DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private HistoryEntryDescription description_;
    private HistoryEntryMetadata metadata_;
    private phc key_ = phc.b;
    private h290 associatedLenses_ = h.emptyProtobufList();

    static {
        HistoryEntry historyEntry = new HistoryEntry();
        DEFAULT_INSTANCE = historyEntry;
        h.registerDefaultInstance(HistoryEntry.class, historyEntry);
    }

    private HistoryEntry() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ț", new Object[]{"bitField0_", "key_", "metadata_", "description_", "associatedLenses_"});
        }
        if (iOrdinal == 3) {
            return new HistoryEntry();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (HistoryEntry.class) {
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

    public final boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public final h290 n() {
        return this.associatedLenses_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HistoryEntryDescription o() {
        HistoryEntryDescription historyEntryDescription = this.description_;
        return historyEntryDescription == null ? HistoryEntryDescription.p() : historyEntryDescription;
    }

    public final phc p() {
        return this.key_;
    }

    public final HistoryEntryMetadata q() {
        HistoryEntryMetadata historyEntryMetadata = this.metadata_;
        return historyEntryMetadata == null ? HistoryEntryMetadata.p() : historyEntryMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
