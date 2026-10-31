package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.i4h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CollectionItemdata$PageMatchItemData extends h implements v2j0 {
    private static final CollectionItemdata$PageMatchItemData DEFAULT_INSTANCE;
    public static final int PAGE_MATCH_OFFSET_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Duration pageMatchOffset_;

    static {
        CollectionItemdata$PageMatchItemData collectionItemdata$PageMatchItemData = new CollectionItemdata$PageMatchItemData();
        DEFAULT_INSTANCE = collectionItemdata$PageMatchItemData;
        h.registerDefaultInstance(CollectionItemdata$PageMatchItemData.class, collectionItemdata$PageMatchItemData);
    }

    private CollectionItemdata$PageMatchItemData() {
    }

    public static CollectionItemdata$PageMatchItemData n() {
        return DEFAULT_INSTANCE;
    }

    public static i4h p() {
        return (i4h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pageMatchOffset_"});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$PageMatchItemData();
        }
        if (iOrdinal == 4) {
            return new i4h(DEFAULT_INSTANCE);
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
        synchronized (CollectionItemdata$PageMatchItemData.class) {
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

    public final Duration o() {
        Duration duration = this.pageMatchOffset_;
        return duration == null ? Duration.n() : duration;
    }

    public final void q(Duration duration) {
        duration.getClass();
        this.pageMatchOffset_ = duration;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
