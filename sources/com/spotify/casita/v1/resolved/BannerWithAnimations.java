package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class BannerWithAnimations extends h implements v2j0 {
    public static final int AD_METADATA_FIELD_NUMBER = 2;
    private static final BannerWithAnimations DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Item item_;

    static {
        BannerWithAnimations bannerWithAnimations = new BannerWithAnimations();
        DEFAULT_INSTANCE = bannerWithAnimations;
        h.registerDefaultInstance(BannerWithAnimations.class, bannerWithAnimations);
    }

    private BannerWithAnimations() {
    }

    public static BannerWithAnimations p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "item_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new BannerWithAnimations();
        }
        if (iOrdinal == 4) {
            return new uv9((byte) 21);
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
        synchronized (BannerWithAnimations.class) {
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

    public final Item q() {
        Item item = this.item_;
        return item == null ? Item.o() : item;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
