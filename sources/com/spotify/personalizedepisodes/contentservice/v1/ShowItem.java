package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w681;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ShowItem extends h implements v2j0 {
    private static final ShowItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 2;
    public static final int SHOW_FIELD_NUMBER = 1;
    private int itemCase_ = 0;
    private Object item_;

    static {
        ShowItem showItem = new ShowItem();
        DEFAULT_INSTANCE = showItem;
        h.registerDefaultInstance(ShowItem.class, showItem);
    }

    private ShowItem() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static w681 q() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"item_", "itemCase_", Show.class, Placeholder.class});
        }
        if (iOrdinal == 3) {
            return new ShowItem();
        }
        if (iOrdinal == 4) {
            return new w681(DEFAULT_INSTANCE);
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
        synchronized (ShowItem.class) {
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

    public final int n() {
        int i = this.itemCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Placeholder o() {
        return this.itemCase_ == 2 ? (Placeholder) this.item_ : Placeholder.q();
    }

    public final Show p() {
        return this.itemCase_ == 1 ? (Show) this.item_ : Show.n();
    }

    public final void r(Placeholder placeholder) {
        placeholder.getClass();
        this.item_ = placeholder;
        this.itemCase_ = 2;
    }

    public final void s(Show show) {
        show.getClass();
        this.item_ = show;
        this.itemCase_ = 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
