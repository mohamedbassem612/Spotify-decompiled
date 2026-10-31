package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CollectionItemdata$YlFilterItemData extends h implements v2j0 {
    private static final CollectionItemdata$YlFilterItemData DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    private long position_;

    static {
        CollectionItemdata$YlFilterItemData collectionItemdata$YlFilterItemData = new CollectionItemdata$YlFilterItemData();
        DEFAULT_INSTANCE = collectionItemdata$YlFilterItemData;
        h.registerDefaultInstance(CollectionItemdata$YlFilterItemData.class, collectionItemdata$YlFilterItemData);
    }

    private CollectionItemdata$YlFilterItemData() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"position_"});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$YlFilterItemData();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (CollectionItemdata$YlFilterItemData.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
