package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import com.spotify.home.browse.clientnative.proto.BrowseAdProto$BrowseAd;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class BrandAds extends h implements v2j0 {
    public static final int AD_FIELD_NUMBER = 1;
    public static final int AD_METADATA_FIELD_NUMBER = 2;
    private static final BrandAds DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private BrowseAdProto$BrowseAd ad_;
    private int bitField0_;

    static {
        BrandAds brandAds = new BrandAds();
        DEFAULT_INSTANCE = brandAds;
        h.registerDefaultInstance(BrandAds.class, brandAds);
    }

    private BrandAds() {
    }

    public static BrandAds p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "ad_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new BrandAds();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (BrandAds.class) {
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

    public final BrowseAdProto$BrowseAd n() {
        BrowseAdProto$BrowseAd browseAdProto$BrowseAd = this.ad_;
        return browseAdProto$BrowseAd == null ? BrowseAdProto$BrowseAd.q() : browseAdProto$BrowseAd;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EmbeddedAdMetadata o() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.o() : embeddedAdMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
