package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EpisodeMetadata$ProtoEpisodeShowMetadata extends h implements v2j0 {
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final EpisodeMetadata$ProtoEpisodeShowMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISHER_FIELD_NUMBER = 3;
    private int bitField0_;
    private ImageGroup$ProtoImageGroup covers_;
    private String link_ = "";
    private String name_ = "";
    private String publisher_ = "";

    static {
        EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = new EpisodeMetadata$ProtoEpisodeShowMetadata();
        DEFAULT_INSTANCE = episodeMetadata$ProtoEpisodeShowMetadata;
        h.registerDefaultInstance(EpisodeMetadata$ProtoEpisodeShowMetadata.class, episodeMetadata$ProtoEpisodeShowMetadata);
    }

    private EpisodeMetadata$ProtoEpisodeShowMetadata() {
    }

    public static EpisodeMetadata$ProtoEpisodeShowMetadata o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "link_", "name_", "publisher_", "covers_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeMetadata$ProtoEpisodeShowMetadata();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (EpisodeMetadata$ProtoEpisodeShowMetadata.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPublisher() {
        return this.publisher_;
    }

    public final boolean hasCovers() {
        return (this.bitField0_ & 8) != 0;
    }

    public final ImageGroup$ProtoImageGroup n() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.covers_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.n() : imageGroup$ProtoImageGroup;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
