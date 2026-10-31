package com.spotify.extendedmetadata.extensions.artistvideoscarouselcomponentimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ArtistVideosCarouselComponent extends h implements v2j0 {
    private static final ArtistVideosCarouselComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_CARD_FIELD_NUMBER = 1;
    private h290 videoCard_ = h.emptyProtobufList();

    static {
        ArtistVideosCarouselComponent artistVideosCarouselComponent = new ArtistVideosCarouselComponent();
        DEFAULT_INSTANCE = artistVideosCarouselComponent;
        h.registerDefaultInstance(ArtistVideosCarouselComponent.class, artistVideosCarouselComponent);
    }

    private ArtistVideosCarouselComponent() {
    }

    public static ArtistVideosCarouselComponent n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"videoCard_", ArtistVideoCard.class});
        }
        if (iOrdinal == 3) {
            return new ArtistVideosCarouselComponent();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ArtistVideosCarouselComponent.class) {
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

    public final h290 o() {
        return this.videoCard_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
