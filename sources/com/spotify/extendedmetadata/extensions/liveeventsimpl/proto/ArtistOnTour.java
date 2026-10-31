package com.spotify.extendedmetadata.extensions.liveeventsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ArtistOnTour extends h implements v2j0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 5;
    private static final ArtistOnTour DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int UPCOMING_EVENTS_COUNT_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int upcomingEventsCount_;
    private String uri_ = "";
    private String imageUrl_ = "";
    private String title_ = "";
    private String backgroundImageUrl_ = "";

    static {
        ArtistOnTour artistOnTour = new ArtistOnTour();
        DEFAULT_INSTANCE = artistOnTour;
        h.registerDefaultInstance(ArtistOnTour.class, artistOnTour);
    }

    private ArtistOnTour() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ", new Object[]{"uri_", "imageUrl_", "title_", "upcomingEventsCount_", "backgroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ArtistOnTour();
        }
        if (iOrdinal == 4) {
            return new db6();
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
        synchronized (ArtistOnTour.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundImageUrl_;
    }

    public final int p() {
        return this.upcomingEventsCount_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
