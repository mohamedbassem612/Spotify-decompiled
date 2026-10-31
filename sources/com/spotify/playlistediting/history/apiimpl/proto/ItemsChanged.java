package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ti90;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ItemsChanged extends h implements v2j0 {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ItemsChanged DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int count_;
    private h290 items_ = h.emptyProtobufList();
    private int type_;

    static {
        ItemsChanged itemsChanged = new ItemsChanged();
        DEFAULT_INSTANCE = itemsChanged;
        h.registerDefaultInstance(ItemsChanged.class, itemsChanged);
    }

    private ItemsChanged() {
    }

    public static ItemsChanged o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"bitField0_", "type_", "count_", "items_", Item.class});
        }
        if (iOrdinal == 3) {
            return new ItemsChanged();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ItemsChanged.class) {
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

    public final int n() {
        return this.count_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ti90 p() {
        ti90 ti90Var;
        int i = this.type_;
        if (i == 0) {
            ti90Var = ti90.ITEM_CHANGE_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            ti90Var = ti90.ITEM_CHANGE_TYPE_ADDED;
        } else if (i != 2) {
            ti90Var = i != 3 ? null : ti90.ITEM_CHANGE_TYPE_REORDERED;
        } else {
            ti90Var = ti90.ITEM_CHANGE_TYPE_REMOVED;
        }
        return ti90Var == null ? ti90.UNRECOGNIZED : ti90Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
