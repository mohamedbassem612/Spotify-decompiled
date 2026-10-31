package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wt70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ImageLink extends h implements v2j0 {
    public static final int AD_METADATA_FIELD_NUMBER = 4;
    private static final ImageLink DEFAULT_INSTANCE;
    public static final int DENSITY_FIELD_NUMBER = 3;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_SOURCE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 5;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private int density_;
    private Heading heading_;
    private ItemSource itemSource_;
    private int source_;

    static {
        ImageLink imageLink = new ImageLink();
        DEFAULT_INSTANCE = imageLink;
        h.registerDefaultInstance(ImageLink.class, imageLink);
    }

    private ImageLink() {
    }

    public static ImageLink p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004ဉ\u0002\u0005\f", new Object[]{"bitField0_", "heading_", "itemSource_", "density_", "adMetadata_", "source_"});
        }
        if (iOrdinal == 3) {
            return new ImageLink();
        }
        if (iOrdinal == 4) {
            return new np70((byte) 21);
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
        synchronized (ImageLink.class) {
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

    public final EmbeddedAdMetadata o() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.p() : embeddedAdMetadata;
    }

    public final Heading q() {
        Heading heading = this.heading_;
        return heading == null ? Heading.o() : heading;
    }

    public final ItemSource r() {
        ItemSource itemSource = this.itemSource_;
        return itemSource == null ? ItemSource.o() : itemSource;
    }

    public final wt70 s() {
        wt70 wt70Var;
        int i = this.source_;
        if (i != 0) {
            wt70Var = i != 1 ? null : wt70.PROMO;
        } else {
            wt70Var = wt70.DEFAULT;
        }
        return wt70Var == null ? wt70.UNRECOGNIZED : wt70Var;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
