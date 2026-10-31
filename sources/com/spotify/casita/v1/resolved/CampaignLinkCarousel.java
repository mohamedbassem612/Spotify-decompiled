package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CampaignLinkCarousel extends h implements v2j0 {
    public static final int AD_METADATA_FIELD_NUMBER = 3;
    private static final CampaignLinkCarousel DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_SOURCE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Heading heading_;
    private ItemSource itemSource_;

    static {
        CampaignLinkCarousel campaignLinkCarousel = new CampaignLinkCarousel();
        DEFAULT_INSTANCE = campaignLinkCarousel;
        h.registerDefaultInstance(CampaignLinkCarousel.class, campaignLinkCarousel);
    }

    private CampaignLinkCarousel() {
    }

    public static CampaignLinkCarousel p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "heading_", "itemSource_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new CampaignLinkCarousel();
        }
        if (iOrdinal == 4) {
            return new coc((byte) 13);
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
        synchronized (CampaignLinkCarousel.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
