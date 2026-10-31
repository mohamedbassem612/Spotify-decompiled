package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.u4h;
import p.v2j0;
import p.w5h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CollectionPlatformItemsRequest extends h implements v2j0 {
    public static final int COLLECTION_ITEMS_FIELD_NUMBER = 3;
    private static final CollectionPlatformItemsRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_ITEM_DATA_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SET_FIELD_NUMBER = 1;
    private boolean includeItemData_;
    private int set_;
    private h290 items_ = h.emptyProtobufList();
    private h290 collectionItems_ = h.emptyProtobufList();

    static {
        CollectionPlatformItemsRequest collectionPlatformItemsRequest = new CollectionPlatformItemsRequest();
        DEFAULT_INSTANCE = collectionPlatformItemsRequest;
        h.registerDefaultInstance(CollectionPlatformItemsRequest.class, collectionPlatformItemsRequest);
    }

    private CollectionPlatformItemsRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static u4h q() {
        return (u4h) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0002Ț\u0003\u001b\u0004\u0007", new Object[]{"set_", "items_", "collectionItems_", CollectionPlatformItem.class, "includeItemData_"});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformItemsRequest();
        }
        if (iOrdinal == 4) {
            return new u4h(DEFAULT_INSTANCE);
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
        synchronized (CollectionPlatformItemsRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.items_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.items_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(CollectionPlatformItem collectionPlatformItem) {
        collectionPlatformItem.getClass();
        h290 h290VarMutableCopy = this.collectionItems_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.collectionItems_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(collectionPlatformItem);
    }

    public final void p(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.items_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.items_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void r() {
        this.includeItemData_ = true;
    }

    public final void s(w5h w5hVar) {
        this.set_ = w5hVar.getNumber();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
