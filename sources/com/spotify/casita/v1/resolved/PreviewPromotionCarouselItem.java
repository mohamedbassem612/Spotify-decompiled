package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PreviewPromotionCarouselItem extends h implements v2j0 {
    private static final PreviewPromotionCarouselItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_PROMO_FIELD_NUMBER = 1;
    private int contentCase_ = 0;
    private Object content_;

    static {
        PreviewPromotionCarouselItem previewPromotionCarouselItem = new PreviewPromotionCarouselItem();
        DEFAULT_INSTANCE = previewPromotionCarouselItem;
        h.registerDefaultInstance(PreviewPromotionCarouselItem.class, previewPromotionCarouselItem);
    }

    private PreviewPromotionCarouselItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"content_", "contentCase_", VideoPromo.class});
        }
        if (iOrdinal == 3) {
            return new PreviewPromotionCarouselItem();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (PreviewPromotionCarouselItem.class) {
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

    public final int n() {
        int i = this.contentCase_;
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final VideoPromo o() {
        return this.contentCase_ == 1 ? (VideoPromo) this.content_ : VideoPromo.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
