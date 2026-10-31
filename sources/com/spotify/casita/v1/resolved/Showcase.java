package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import com.spotify.showcase.v1.CreativeAdMetadataProto;
import com.spotify.showcase.v2.CreativeAdMetadata;
import p.bf40;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Showcase extends h implements v2j0 {
    public static final int AD_METADATA_FIELD_NUMBER = 3;
    public static final int CREATIVE_AD_METADATA_FIELD_NUMBER = 4;
    public static final int CREATIVE_AD_METADATA_V2_FIELD_NUMBER = 5;
    private static final Showcase DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private CreativeAdMetadata creativeAdMetadataV2_;
    private CreativeAdMetadataProto.CreativeAdMetadata creativeAdMetadata_;
    private Heading heading_;
    private Item item_;

    static {
        Showcase showcase = new Showcase();
        DEFAULT_INSTANCE = showcase;
        h.registerDefaultInstance(Showcase.class, showcase);
    }

    private Showcase() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Showcase q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "heading_", "item_", "adMetadata_", "creativeAdMetadata_", "creativeAdMetadataV2_"});
        }
        if (iOrdinal == 3) {
            return new Showcase();
        }
        if (iOrdinal == 4) {
            return new l981();
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
        synchronized (Showcase.class) {
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

    public final CreativeAdMetadata p() {
        CreativeAdMetadata creativeAdMetadata = this.creativeAdMetadataV2_;
        return creativeAdMetadata == null ? CreativeAdMetadata.p() : creativeAdMetadata;
    }

    public final Heading r() {
        Heading heading = this.heading_;
        return heading == null ? Heading.o() : heading;
    }

    public final Item s() {
        Item item = this.item_;
        return item == null ? Item.o() : item;
    }

    public final boolean t() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
