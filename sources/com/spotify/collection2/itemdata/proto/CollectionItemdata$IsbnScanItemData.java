package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.g4h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CollectionItemdata$IsbnScanItemData extends h implements v2j0 {
    private static final CollectionItemdata$IsbnScanItemData DEFAULT_INSTANCE;
    public static final int LATEST_ISBN_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SCAN_STATUS_FIELD_NUMBER = 2;
    private String latestIsbn_ = "";
    private int scanStatus_;

    static {
        CollectionItemdata$IsbnScanItemData collectionItemdata$IsbnScanItemData = new CollectionItemdata$IsbnScanItemData();
        DEFAULT_INSTANCE = collectionItemdata$IsbnScanItemData;
        h.registerDefaultInstance(CollectionItemdata$IsbnScanItemData.class, collectionItemdata$IsbnScanItemData);
    }

    private CollectionItemdata$IsbnScanItemData() {
    }

    public static CollectionItemdata$IsbnScanItemData n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"latestIsbn_", "scanStatus_"});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$IsbnScanItemData();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (CollectionItemdata$IsbnScanItemData.class) {
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

    public final String o() {
        return this.latestIsbn_;
    }

    public final g4h p() {
        g4h g4hVar;
        int i = this.scanStatus_;
        if (i == 0) {
            g4hVar = g4h.UNKNOWN;
        } else if (i != 1) {
            g4hVar = i != 2 ? null : g4h.SCAN_SKIPPED;
        } else {
            g4hVar = g4h.SCAN_PRESENT;
        }
        return g4hVar == null ? g4h.UNRECOGNIZED : g4hVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
