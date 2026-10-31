package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RecentsShelf extends h implements v2j0 {
    private static final RecentsShelf DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_SOURCE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_DENSITY_FIELD_NUMBER = 3;
    private int bitField0_;
    private Heading heading_;
    private ItemSource itemSource_;
    private int titleDensity_;

    static {
        RecentsShelf recentsShelf = new RecentsShelf();
        DEFAULT_INSTANCE = recentsShelf;
        h.registerDefaultInstance(RecentsShelf.class, recentsShelf);
    }

    private RecentsShelf() {
    }

    public static RecentsShelf o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "heading_", "itemSource_", "titleDensity_"});
        }
        if (iOrdinal == 3) {
            return new RecentsShelf();
        }
        if (iOrdinal == 4) {
            return new po01((byte) 5);
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
        synchronized (RecentsShelf.class) {
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

    public final Heading p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.o() : heading;
    }

    public final ItemSource q() {
        ItemSource itemSource = this.itemSource_;
        return itemSource == null ? ItemSource.o() : itemSource;
    }

    public final vat r() {
        vat vatVar;
        int i = this.titleDensity_;
        if (i == 0) {
            vatVar = vat.UNDEFINED;
        } else if (i == 1) {
            vatVar = vat.SPARSE;
        } else if (i != 2) {
            vatVar = i != 3 ? null : vat.DENSE;
        } else {
            vatVar = vat.NORMAL;
        }
        return vatVar == null ? vat.UNRECOGNIZED : vatVar;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
