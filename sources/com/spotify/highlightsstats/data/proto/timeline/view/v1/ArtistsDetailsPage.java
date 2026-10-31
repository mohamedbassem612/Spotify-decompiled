package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Playlist;
import p.bf40;
import p.db6;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ArtistsDetailsPage extends h implements v2j0 {
    private static final ArtistsDetailsPage DEFAULT_INSTANCE;
    public static final int GRAPH_SECTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RECOMMENDATIONS_TITLE_FIELD_NUMBER = 2;
    public static final int RECOMMENDED_MIXES_FIELD_NUMBER = 3;
    public static final int TOP_ARTISTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private GraphSection graphSection_;
    private h290 topArtists_ = h.emptyProtobufList();
    private String recommendationsTitle_ = "";
    private h290 recommendedMixes_ = h.emptyProtobufList();

    static {
        ArtistsDetailsPage artistsDetailsPage = new ArtistsDetailsPage();
        DEFAULT_INSTANCE = artistsDetailsPage;
        h.registerDefaultInstance(ArtistsDetailsPage.class, artistsDetailsPage);
    }

    private ArtistsDetailsPage() {
    }

    public static ArtistsDetailsPage n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002Ȉ\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "topArtists_", TopArtist.class, "recommendationsTitle_", "recommendedMixes_", Playlist.class, "graphSection_"});
        }
        if (iOrdinal == 3) {
            return new ArtistsDetailsPage();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ArtistsDetailsPage.class) {
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

    public final GraphSection o() {
        GraphSection graphSection = this.graphSection_;
        return graphSection == null ? GraphSection.o() : graphSection;
    }

    public final String p() {
        return this.recommendationsTitle_;
    }

    public final h290 q() {
        return this.recommendedMixes_;
    }

    public final h290 r() {
        return this.topArtists_;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
