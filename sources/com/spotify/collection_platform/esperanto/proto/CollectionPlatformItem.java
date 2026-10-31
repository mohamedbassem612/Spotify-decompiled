package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.t4h;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CollectionPlatformItem extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    private static final CollectionPlatformItem DEFAULT_INSTANCE;
    public static final int ITEM_DATA_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private long addTime_;
    private int bitField0_;
    private CollectionItemdata$ItemData itemData_;
    private String uri_ = "";

    static {
        CollectionPlatformItem collectionPlatformItem = new CollectionPlatformItem();
        DEFAULT_INSTANCE = collectionPlatformItem;
        h.registerDefaultInstance(CollectionPlatformItem.class, collectionPlatformItem);
    }

    private CollectionPlatformItem() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static t4h q() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဉ\u0000", new Object[]{"bitField0_", "uri_", "addTime_", "itemData_"});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformItem();
        }
        if (iOrdinal == 4) {
            return new t4h();
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
        synchronized (CollectionPlatformItem.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CollectionItemdata$ItemData o() {
        CollectionItemdata$ItemData collectionItemdata$ItemData = this.itemData_;
        return collectionItemdata$ItemData == null ? CollectionItemdata$ItemData.o() : collectionItemdata$ItemData;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void r(CollectionItemdata$ItemData collectionItemdata$ItemData) {
        collectionItemdata$ItemData.getClass();
        this.itemData_ = collectionItemdata$ItemData;
        this.bitField0_ |= 1;
    }

    public final void s(String str) {
        str.getClass();
        this.uri_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
