package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.snx0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class PromotionV1 extends h implements v2j0 {
    public static final int AD_METADATA_FIELD_NUMBER = 3;
    private static final PromotionV1 DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Heading heading_;
    private Item item_;
    private int type_;

    static {
        PromotionV1 promotionV1 = new PromotionV1();
        DEFAULT_INSTANCE = promotionV1;
        h.registerDefaultInstance(PromotionV1.class, promotionV1);
    }

    private PromotionV1() {
    }

    public static PromotionV1 o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f", new Object[]{"bitField0_", "heading_", "item_", "adMetadata_", "type_"});
        }
        if (iOrdinal == 3) {
            return new PromotionV1();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (PromotionV1.class) {
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

    public final EmbeddedAdMetadata n() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.o() : embeddedAdMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Heading p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.n() : heading;
    }

    public final Item q() {
        Item item = this.item_;
        return item == null ? Item.n() : item;
    }

    public final snx0 r() {
        snx0 snx0Var;
        int i = this.type_;
        if (i != 0) {
            snx0Var = i != 1 ? null : snx0.SPOTLIGHT;
        } else {
            snx0Var = snx0.PROMOTION_V1;
        }
        return snx0Var == null ? snx0.UNRECOGNIZED : snx0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
