package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 5;
    public static final int AUDIOBOOK_FIELD_NUMBER = 11;
    private static final EntityComponent DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 10;
    public static final int IMAGES_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 8;
    public static final int SHOW_FIELD_NUMBER = 9;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRACK_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object entity_;
    private int entityCase_ = 0;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private h290 images_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Album extends com.google.protobuf.h implements v2j0 {
        public static final int ARTISTS_FIELD_NUMBER = 2;
        private static final Album DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private h290 artists_ = com.google.protobuf.h.emptyProtobufList();
        private int type_;

        static {
            Album album = new Album();
            DEFAULT_INSTANCE = album;
            com.google.protobuf.h.registerDefaultInstance(Album.class, album);
        }

        private Album() {
        }

        public static Album n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"type_", "artists_", EntityTitle.class});
            }
            if (iOrdinal == 3) {
                return new Album();
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
            synchronized (Album.class) {
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

        public final List getArtistsList() {
            return this.artists_;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final a o() {
            a aVar;
            int i = this.type_;
            if (i == 0) {
                aVar = a.UNSPECIFIED;
            } else if (i == 1) {
                aVar = a.ALBUM;
            } else if (i != 2) {
                aVar = i != 3 ? null : a.EP;
            } else {
                aVar = a.SINGLE;
            }
            return aVar == null ? a.UNRECOGNIZED : aVar;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Artist extends com.google.protobuf.h implements v2j0 {
        private static final Artist DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Artist artist = new Artist();
            DEFAULT_INSTANCE = artist;
            com.google.protobuf.h.registerDefaultInstance(Artist.class, artist);
        }

        private Artist() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Artist();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (Artist.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Audiobook extends com.google.protobuf.h implements v2j0 {
        private static final Audiobook DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Audiobook audiobook = new Audiobook();
            DEFAULT_INSTANCE = audiobook;
            com.google.protobuf.h.registerDefaultInstance(Audiobook.class, audiobook);
        }

        private Audiobook() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Audiobook();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (Audiobook.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class EntityTitle extends com.google.protobuf.h implements v2j0 {
        private static final EntityTitle DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int URI_FIELD_NUMBER = 1;
        private String uri_ = "";
        private String title_ = "";

        static {
            EntityTitle entityTitle = new EntityTitle();
            DEFAULT_INSTANCE = entityTitle;
            com.google.protobuf.h.registerDefaultInstance(EntityTitle.class, entityTitle);
        }

        private EntityTitle() {
        }

        public static EntityTitle n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uri_", "title_"});
            }
            if (iOrdinal == 3) {
                return new EntityTitle();
            }
            if (iOrdinal == 4) {
                return new f(DEFAULT_INSTANCE);
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
            synchronized (EntityTitle.class) {
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

        public final String getTitle() {
            return this.title_;
        }

        public final String getUri() {
            return this.uri_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Episode extends com.google.protobuf.h implements v2j0 {
        private static final Episode DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Episode episode = new Episode();
            DEFAULT_INSTANCE = episode;
            com.google.protobuf.h.registerDefaultInstance(Episode.class, episode);
        }

        private Episode() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Episode();
            }
            if (iOrdinal == 4) {
                return new g(DEFAULT_INSTANCE);
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
            synchronized (Episode.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Playlist extends com.google.protobuf.h implements v2j0 {
        private static final Playlist DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Playlist playlist = new Playlist();
            DEFAULT_INSTANCE = playlist;
            com.google.protobuf.h.registerDefaultInstance(Playlist.class, playlist);
        }

        private Playlist() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Playlist();
            }
            if (iOrdinal == 4) {
                return new h(DEFAULT_INSTANCE);
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
            synchronized (Playlist.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Show extends com.google.protobuf.h implements v2j0 {
        private static final Show DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Show show = new Show();
            DEFAULT_INSTANCE = show;
            com.google.protobuf.h.registerDefaultInstance(Show.class, show);
        }

        private Show() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Show();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (Show.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Track extends com.google.protobuf.h implements v2j0 {
        public static final int ALBUM_FIELD_NUMBER = 2;
        public static final int ARTISTS_FIELD_NUMBER = 1;
        private static final Track DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private EntityTitle album_;
        private h290 artists_ = com.google.protobuf.h.emptyProtobufList();
        private int bitField0_;

        static {
            Track track = new Track();
            DEFAULT_INSTANCE = track;
            com.google.protobuf.h.registerDefaultInstance(Track.class, track);
        }

        private Track() {
        }

        public static Track o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "artists_", EntityTitle.class, "album_"});
            }
            if (iOrdinal == 3) {
                return new Track();
            }
            if (iOrdinal == 4) {
                return new j(DEFAULT_INSTANCE);
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
            synchronized (Track.class) {
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

        public final List getArtistsList() {
            return this.artists_;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final EntityTitle n() {
            EntityTitle entityTitle = this.album_;
            return entityTitle == null ? EntityTitle.n() : entityTitle;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EntityComponent entityComponent = new EntityComponent();
        DEFAULT_INSTANCE = entityComponent;
        com.google.protobuf.h.registerDefaultInstance(EntityComponent.class, entityComponent);
    }

    private EntityComponent() {
    }

    public static EntityComponent o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\u001b\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"entity_", "entityCase_", "bitField0_", "uri_", "title_", "subtitle_", "images_", Image.class, Artist.class, Album.class, Track.class, Playlist.class, Show.class, Episode.class, Audiobook.class});
        }
        if (iOrdinal == 3) {
            return new EntityComponent();
        }
        if (iOrdinal == 4) {
            return new e(DEFAULT_INSTANCE);
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
        synchronized (EntityComponent.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final Album n() {
        return this.entityCase_ == 6 ? (Album) this.entity_ : Album.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        int i = this.entityCase_;
        if (i == 0) {
            return 8;
        }
        switch (i) {
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 9:
                return 5;
            case 10:
                return 6;
            case 11:
                return 7;
            default:
                return 0;
        }
    }

    public final h290 q() {
        return this.images_;
    }

    public final Track r() {
        return this.entityCase_ == 7 ? (Track) this.entity_ : Track.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
