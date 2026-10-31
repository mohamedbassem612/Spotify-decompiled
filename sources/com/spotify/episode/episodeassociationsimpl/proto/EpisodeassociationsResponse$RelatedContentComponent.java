package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeassociationsResponse$RelatedContentComponent extends h implements v2j0 {
    private static final EpisodeassociationsResponse$RelatedContentComponent DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 entity_ = h.emptyProtobufList();

    static {
        EpisodeassociationsResponse$RelatedContentComponent episodeassociationsResponse$RelatedContentComponent = new EpisodeassociationsResponse$RelatedContentComponent();
        DEFAULT_INSTANCE = episodeassociationsResponse$RelatedContentComponent;
        h.registerDefaultInstance(EpisodeassociationsResponse$RelatedContentComponent.class, episodeassociationsResponse$RelatedContentComponent);
    }

    private EpisodeassociationsResponse$RelatedContentComponent() {
    }

    public static EpisodeassociationsResponse$RelatedContentComponent n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"entity_", EpisodeassociationsResponse$Entity.class});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$RelatedContentComponent();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (EpisodeassociationsResponse$RelatedContentComponent.class) {
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
        return this.entity_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
