package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EnrichedHeading extends h implements v2j0 {
    public static final int ASSOCIATED_ITEM_FIELD_NUMBER = 2;
    private static final EnrichedHeading DEFAULT_INSTANCE;
    public static final int ENCORE_ICON_NAME_FIELD_NUMBER = 3;
    public static final int FORMAT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private HeadingAssociatedItem associatedItem_;
    private int bitField0_;
    private String format_ = "";
    private String encoreIconName_ = "";

    static {
        EnrichedHeading enrichedHeading = new EnrichedHeading();
        DEFAULT_INSTANCE = enrichedHeading;
        h.registerDefaultInstance(EnrichedHeading.class, enrichedHeading);
    }

    private EnrichedHeading() {
    }

    public static EnrichedHeading p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "format_", "associatedItem_", "encoreIconName_"});
        }
        if (iOrdinal == 3) {
            return new EnrichedHeading();
        }
        if (iOrdinal == 4) {
            return new c8x((byte) 7);
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
        synchronized (EnrichedHeading.class) {
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

    public final String getFormat() {
        return this.format_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HeadingAssociatedItem o() {
        HeadingAssociatedItem headingAssociatedItem = this.associatedItem_;
        return headingAssociatedItem == null ? HeadingAssociatedItem.o() : headingAssociatedItem;
    }

    public final String q() {
        return this.encoreIconName_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
