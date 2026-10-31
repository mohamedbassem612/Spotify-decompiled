package com.spotify.watchfeed.component.item.v1;

import com.google.protobuf.Any;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HashtagRowComponent extends com.google.protobuf.h implements v2j0 {
    private static final HashtagRowComponent DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 items_ = com.google.protobuf.h.emptyProtobufList();

    static {
        HashtagRowComponent hashtagRowComponent = new HashtagRowComponent();
        DEFAULT_INSTANCE = hashtagRowComponent;
        com.google.protobuf.h.registerDefaultInstance(HashtagRowComponent.class, hashtagRowComponent);
    }

    private HashtagRowComponent() {
    }

    public static HashtagRowComponent n(phc phcVar) {
        return (HashtagRowComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", Any.class});
        }
        if (iOrdinal == 3) {
            return new HashtagRowComponent();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (HashtagRowComponent.class) {
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
