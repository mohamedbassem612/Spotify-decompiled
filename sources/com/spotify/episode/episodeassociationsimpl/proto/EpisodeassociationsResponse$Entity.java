package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeassociationsResponse$Entity extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int AUDIOBOOK_CHAPTER_FIELD_NUMBER = 13;
    public static final int AUDIOBOOK_FIELD_NUMBER = 12;
    private static final EpisodeassociationsResponse$Entity DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 10;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 8;
    public static final int PODCAST_SHORT_FIELD_NUMBER = 11;
    public static final int SHOW_FIELD_NUMBER = 9;
    public static final int TRACK_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int USER_FIELD_NUMBER = 5;
    private Object entity_;
    private int entityCase_ = 0;
    private String uri_ = "";
    private String name_ = "";
    private String imageUri_ = "";

    static {
        EpisodeassociationsResponse$Entity episodeassociationsResponse$Entity = new EpisodeassociationsResponse$Entity();
        DEFAULT_INSTANCE = episodeassociationsResponse$Entity;
        h.registerDefaultInstance(EpisodeassociationsResponse$Entity.class, episodeassociationsResponse$Entity);
    }

    private EpisodeassociationsResponse$Entity() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"entity_", "entityCase_", "uri_", "name_", "imageUri_", EpisodeassociationsResponse$Artist.class, EpisodeassociationsResponse$User.class, EpisodeassociationsResponse$Album.class, EpisodeassociationsResponse$Track.class, EpisodeassociationsResponse$Playlist.class, EpisodeassociationsResponse$Show.class, EpisodeassociationsResponse$Episode.class, EpisodeassociationsResponse$PodcastShort.class, EpisodeassociationsResponse$Audiobook.class, EpisodeassociationsResponse$AudiobookChapter.class});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$Entity();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (EpisodeassociationsResponse$Entity.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final EpisodeassociationsResponse$Album n() {
        return this.entityCase_ == 6 ? (EpisodeassociationsResponse$Album) this.entity_ : EpisodeassociationsResponse$Album.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EpisodeassociationsResponse$Audiobook o() {
        return this.entityCase_ == 12 ? (EpisodeassociationsResponse$Audiobook) this.entity_ : EpisodeassociationsResponse$Audiobook.o();
    }

    public final EpisodeassociationsResponse$AudiobookChapter p() {
        return this.entityCase_ == 13 ? (EpisodeassociationsResponse$AudiobookChapter) this.entity_ : EpisodeassociationsResponse$AudiobookChapter.q();
    }

    public final int q() {
        int i = this.entityCase_;
        if (i == 0) {
            return 11;
        }
        switch (i) {
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 5;
            case 9:
                return 6;
            case 10:
                return 7;
            case 11:
                return 8;
            case 12:
                return 9;
            case 13:
                return 10;
            default:
                return 0;
        }
    }

    public final EpisodeassociationsResponse$Episode r() {
        return this.entityCase_ == 10 ? (EpisodeassociationsResponse$Episode) this.entity_ : EpisodeassociationsResponse$Episode.n();
    }

    public final String s() {
        return this.imageUri_;
    }

    public final EpisodeassociationsResponse$Playlist t() {
        return this.entityCase_ == 8 ? (EpisodeassociationsResponse$Playlist) this.entity_ : EpisodeassociationsResponse$Playlist.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final EpisodeassociationsResponse$Show u() {
        return this.entityCase_ == 9 ? (EpisodeassociationsResponse$Show) this.entity_ : EpisodeassociationsResponse$Show.n();
    }

    public final EpisodeassociationsResponse$Track v() {
        return this.entityCase_ == 7 ? (EpisodeassociationsResponse$Track) this.entity_ : EpisodeassociationsResponse$Track.n();
    }
}
