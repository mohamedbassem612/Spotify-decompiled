package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.blg;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CollectionPlatformContextItemsResponse extends h implements v2j0 {
    private static final CollectionPlatformContextItemsResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private h290 items_ = h.emptyProtobufList();
    private Status status_;

    static {
        CollectionPlatformContextItemsResponse collectionPlatformContextItemsResponse = new CollectionPlatformContextItemsResponse();
        DEFAULT_INSTANCE = collectionPlatformContextItemsResponse;
        h.registerDefaultInstance(CollectionPlatformContextItemsResponse.class, collectionPlatformContextItemsResponse);
    }

    private CollectionPlatformContextItemsResponse() {
    }

    public static CollectionPlatformContextItemsResponse n(byte[] bArr) {
        return (CollectionPlatformContextItemsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "status_", "items_", CollectionPlatformContextItem.class});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformContextItemsResponse();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (CollectionPlatformContextItemsResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
