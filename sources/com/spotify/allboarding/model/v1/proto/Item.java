package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Item extends h implements v2j0 {
    public static final int BANNER_FIELD_NUMBER = 3;
    private static final Item DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PILLMORE_FIELD_NUMBER = 8;
    public static final int PILL_FIELD_NUMBER = 4;
    public static final int SQUARETRACK_FIELD_NUMBER = 9;
    public static final int SQUIRCLEARTISTMORE_FIELD_NUMBER = 2;
    public static final int SQUIRCLEARTIST_FIELD_NUMBER = 1;
    public static final int SQUIRCLESHOWMORE_FIELD_NUMBER = 6;
    public static final int SQUIRCLESHOW_FIELD_NUMBER = 5;
    public static final int TITLEBOX_FIELD_NUMBER = 7;
    private int itemCase_ = 0;
    private Object item_;

    static {
        Item item = new Item();
        DEFAULT_INSTANCE = item;
        h.registerDefaultInstance(Item.class, item);
    }

    private Item() {
    }

    public static Item o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"item_", "itemCase_", SquircleArtist.class, SquircleArtistMore.class, Banner.class, Pill.class, SquircleShow.class, SquircleShowMore.class, TitleBox.class, PillMore.class, SquareTrack.class});
        }
        if (iOrdinal == 3) {
            return new Item();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (Item.class) {
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

    public final Banner n() {
        return this.itemCase_ == 3 ? (Banner) this.item_ : Banner.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        switch (this.itemCase_) {
            case 0:
                return 10;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            default:
                return 0;
        }
    }

    public final Pill q() {
        return this.itemCase_ == 4 ? (Pill) this.item_ : Pill.o();
    }

    public final SquircleArtist r() {
        return this.itemCase_ == 1 ? (SquircleArtist) this.item_ : SquircleArtist.n();
    }

    public final SquircleArtistMore s() {
        return this.itemCase_ == 2 ? (SquircleArtistMore) this.item_ : SquircleArtistMore.o();
    }

    public final SquircleShow t() {
        return this.itemCase_ == 5 ? (SquircleShow) this.item_ : SquircleShow.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SquircleShowMore u() {
        return this.itemCase_ == 6 ? (SquircleShowMore) this.item_ : SquircleShowMore.o();
    }
}
