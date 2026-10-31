package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ItemSource extends h implements v2j0 {
    private static final ItemSource DEFAULT_INSTANCE;
    public static final int LIST_PLATFORM_FIELD_NUMBER = 3;
    public static final int LOCAL_RECENTLY_PLAYED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 1;
    private int sourceCase_ = 0;
    private Object source_;

    static {
        ItemSource itemSource = new ItemSource();
        DEFAULT_INSTANCE = itemSource;
        h.registerDefaultInstance(ItemSource.class, itemSource);
    }

    private ItemSource() {
    }

    public static ItemSource o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"source_", "sourceCase_", Provided.class, LocalRecentlyPlayed.class, ListPlatform.class});
        }
        if (iOrdinal == 3) {
            return new ItemSource();
        }
        if (iOrdinal == 4) {
            return new tm90((byte) 0);
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
        synchronized (ItemSource.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ListPlatform p() {
        return this.sourceCase_ == 3 ? (ListPlatform) this.source_ : ListPlatform.o();
    }

    public final Provided q() {
        return this.sourceCase_ == 1 ? (Provided) this.source_ : Provided.o();
    }

    public final boolean r() {
        return this.sourceCase_ == 2;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
