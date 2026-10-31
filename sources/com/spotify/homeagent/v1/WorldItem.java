package com.spotify.homeagent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class WorldItem extends h implements v2j0 {
    private static final WorldItem DEFAULT_INSTANCE;
    public static final int HIGHLIGHTED_SUB_ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private h290 highlightedSubItems_ = h.emptyProtobufList();

    static {
        WorldItem worldItem = new WorldItem();
        DEFAULT_INSTANCE = worldItem;
        h.registerDefaultInstance(WorldItem.class, worldItem);
    }

    private WorldItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"uri_", "highlightedSubItems_"});
        }
        if (iOrdinal == 3) {
            return new WorldItem();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (WorldItem.class) {
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
