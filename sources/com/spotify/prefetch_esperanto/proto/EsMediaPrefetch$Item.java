package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.goz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsMediaPrefetch$Item extends h implements v2j0 {
    public static final int AUDIO_PREVIEW_RESOURCE_FIELD_NUMBER = 1;
    private static final EsMediaPrefetch$Item DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESSIVE_VIDEO_RESOURCE_FIELD_NUMBER = 2;
    public static final int SEGMENTED_VIDEO_RESOURCE_FIELD_NUMBER = 3;
    private int resourceCase_ = 0;
    private Object resource_;

    static {
        EsMediaPrefetch$Item esMediaPrefetch$Item = new EsMediaPrefetch$Item();
        DEFAULT_INSTANCE = esMediaPrefetch$Item;
        h.registerDefaultInstance(EsMediaPrefetch$Item.class, esMediaPrefetch$Item);
    }

    private EsMediaPrefetch$Item() {
    }

    public static goz n() {
        return (goz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"resource_", "resourceCase_", EsMediaPrefetch$AudioPreviewResource.class, EsMediaPrefetch$ProgressiveVideoResource.class, EsMediaPrefetch$SegmentedVideoResource.class});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$Item();
        }
        if (iOrdinal == 4) {
            return new goz(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$Item.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(EsMediaPrefetch$AudioPreviewResource esMediaPrefetch$AudioPreviewResource) {
        esMediaPrefetch$AudioPreviewResource.getClass();
        this.resource_ = esMediaPrefetch$AudioPreviewResource;
        this.resourceCase_ = 1;
    }

    public final void p(EsMediaPrefetch$ProgressiveVideoResource esMediaPrefetch$ProgressiveVideoResource) {
        esMediaPrefetch$ProgressiveVideoResource.getClass();
        this.resource_ = esMediaPrefetch$ProgressiveVideoResource;
        this.resourceCase_ = 2;
    }

    public final void q(EsMediaPrefetch$SegmentedVideoResource esMediaPrefetch$SegmentedVideoResource) {
        esMediaPrefetch$SegmentedVideoResource.getClass();
        this.resource_ = esMediaPrefetch$SegmentedVideoResource;
        this.resourceCase_ = 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
