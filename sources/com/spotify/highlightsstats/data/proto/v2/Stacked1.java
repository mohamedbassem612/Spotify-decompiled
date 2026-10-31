package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Stacked1 extends h implements v2j0 {
    public static final int ARTWORK_FIELD_NUMBER = 3;
    private static final Stacked1 DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STACK_ITEM_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Artwork artwork_;
    private int bitField0_;
    private StackItem stackItem_;
    private String title_ = "";

    static {
        Stacked1 stacked1 = new Stacked1();
        DEFAULT_INSTANCE = stacked1;
        h.registerDefaultInstance(Stacked1.class, stacked1);
    }

    private Stacked1() {
    }

    public static Stacked1 o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "title_", "stackItem_", "artwork_"});
        }
        if (iOrdinal == 3) {
            return new Stacked1();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (Stacked1.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final Artwork n() {
        Artwork artwork = this.artwork_;
        return artwork == null ? Artwork.p() : artwork;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final StackItem p() {
        StackItem stackItem = this.stackItem_;
        return stackItem == null ? StackItem.n() : stackItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
