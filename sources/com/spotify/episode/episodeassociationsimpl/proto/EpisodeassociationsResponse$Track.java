package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeassociationsResponse$Track extends h implements v2j0 {
    public static final int ALBUM_NAME_FIELD_NUMBER = 6;
    public static final int ALBUM_URI_FIELD_NUMBER = 5;
    public static final int ARTIST_FIELD_NUMBER = 1;
    private static final EpisodeassociationsResponse$Track DEFAULT_INSTANCE;
    public static final int IS_19_PLUS_FIELD_NUMBER = 3;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 2;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private boolean is19Plus_;
    private boolean isExplicit_;
    private boolean isPlayable_;
    private h290 artist_ = h.emptyProtobufList();
    private String albumUri_ = "";
    private String albumName_ = "";

    public static final class ArtistEntry extends h implements v2j0 {
        private static final ArtistEntry DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int URI_FIELD_NUMBER = 1;
        private String uri_ = "";
        private String name_ = "";

        static {
            ArtistEntry artistEntry = new ArtistEntry();
            DEFAULT_INSTANCE = artistEntry;
            h.registerDefaultInstance(ArtistEntry.class, artistEntry);
        }

        private ArtistEntry() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uri_", "name_"});
            }
            if (iOrdinal == 3) {
                return new ArtistEntry();
            }
            if (iOrdinal == 4) {
                return new a(DEFAULT_INSTANCE);
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
            synchronized (ArtistEntry.class) {
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

        public final String getName() {
            return this.name_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EpisodeassociationsResponse$Track episodeassociationsResponse$Track = new EpisodeassociationsResponse$Track();
        DEFAULT_INSTANCE = episodeassociationsResponse$Track;
        h.registerDefaultInstance(EpisodeassociationsResponse$Track.class, episodeassociationsResponse$Track);
    }

    private EpisodeassociationsResponse$Track() {
    }

    public static EpisodeassociationsResponse$Track n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\u0007\u0004\u0007\u0005Ȉ\u0006Ȉ", new Object[]{"artist_", ArtistEntry.class, "isExplicit_", "is19Plus_", "isPlayable_", "albumUri_", "albumName_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$Track();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (EpisodeassociationsResponse$Track.class) {
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

    public final List getArtistList() {
        return this.artist_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.is19Plus_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
