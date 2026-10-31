package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s4h;
import p.v2j0;
import p.w5h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CollectionPlatformGetContextItemsRequest extends h implements v2j0 {
    private static final CollectionPlatformGetContextItemsRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_ITEM_DATA_FIELD_NUMBER = 3;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SET_FIELD_NUMBER = 1;
    private boolean includeItemData_;
    private h290 items_ = h.emptyProtobufList();
    private int set_;

    static {
        CollectionPlatformGetContextItemsRequest collectionPlatformGetContextItemsRequest = new CollectionPlatformGetContextItemsRequest();
        DEFAULT_INSTANCE = collectionPlatformGetContextItemsRequest;
        h.registerDefaultInstance(CollectionPlatformGetContextItemsRequest.class, collectionPlatformGetContextItemsRequest);
    }

    private CollectionPlatformGetContextItemsRequest() {
    }

    public static s4h n() {
        return (s4h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\u0007", new Object[]{"set_", "items_", CollectionPlatformContextItem.class, "includeItemData_"});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformGetContextItemsRequest();
        }
        if (iOrdinal == 4) {
            return new s4h(DEFAULT_INSTANCE);
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
        synchronized (CollectionPlatformGetContextItemsRequest.class) {
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

    public final void o() {
        this.set_ = w5h.t.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
