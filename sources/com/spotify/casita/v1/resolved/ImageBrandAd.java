package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import com.spotify.ads.brandads.v1.EmbeddedAdProto;
import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ImageBrandAd extends h implements v2j0 {
    public static final int AD_FIELD_NUMBER = 1;
    public static final int AD_METADATA_FIELD_NUMBER = 2;
    private static final ImageBrandAd DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private EmbeddedAdProto.EmbeddedAd ad_;
    private int bitField0_;

    static {
        ImageBrandAd imageBrandAd = new ImageBrandAd();
        DEFAULT_INSTANCE = imageBrandAd;
        h.registerDefaultInstance(ImageBrandAd.class, imageBrandAd);
    }

    private ImageBrandAd() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ImageBrandAd q() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "ad_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new ImageBrandAd();
        }
        if (iOrdinal == 4) {
            return new np70((byte) 11);
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
        synchronized (ImageBrandAd.class) {
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

    public final EmbeddedAdProto.EmbeddedAd o() {
        EmbeddedAdProto.EmbeddedAd embeddedAd = this.ad_;
        return embeddedAd == null ? EmbeddedAdProto.EmbeddedAd.q() : embeddedAd;
    }

    public final EmbeddedAdMetadata p() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.p() : embeddedAdMetadata;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
