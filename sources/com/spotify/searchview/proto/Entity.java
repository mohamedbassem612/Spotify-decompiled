package com.spotify.searchview.proto;

import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Entity extends com.google.protobuf.h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int AUDIOBOOK_FIELD_NUMBER = 13;
    public static final int AUDIO_EPISODE_FIELD_NUMBER = 10;
    public static final int AUDIO_SHOW_FIELD_NUMBER = 9;
    public static final int AUTHOR_FIELD_NUMBER = 17;
    public static final int AUTOCOMPLETE_FIELD_NUMBER = 2046;
    public static final int BEST_MATCH_FIELD_NUMBER = 20;
    public static final int CONCERT_FIELD_NUMBER = 19;
    private static final Entity DEFAULT_INSTANCE;
    public static final int GATING_DECISION_FIELD_NUMBER = 25;
    public static final int GENRE_FIELD_NUMBER = 8;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int KALLAX_FIELD_NUMBER = 22;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEW_RELEASE_FIELD_NUMBER = 16;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 7;
    public static final int PODCAST_CHAPTER_FIELD_NUMBER = 23;
    public static final int PROFILE_FIELD_NUMBER = 11;
    public static final int RECENT_SEARCH_FIELD_NUMBER = 18;
    public static final int SECTION_FIELD_NUMBER = 14;
    public static final int SERP_METADATA_FIELD_NUMBER = 2047;
    public static final int SIGNIFIER_TEXT_FIELD_NUMBER = 24;
    public static final int TRACK_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VENUE_FIELD_NUMBER = 21;
    public static final int WORK_FIELD_NUMBER = 26;
    private int bitField0_;
    private Object entity_;
    private GatingDecision gatingDecision_;
    private Object highlightType_;
    private int entityCase_ = 0;
    private int highlightTypeCase_ = 0;
    private String uri_ = "";
    private String name_ = "";
    private String imageUri_ = "";
    private String serpMetadata_ = "";
    private String signifierText_ = "";

    static {
        Entity entity = new Entity();
        DEFAULT_INSTANCE = entity;
        com.google.protobuf.h.registerDefaultInstance(Entity.class, entity);
    }

    private Entity() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Entity u() {
        return DEFAULT_INSTANCE;
    }

    public final Kallax A() {
        return this.entityCase_ == 22 ? (Kallax) this.entity_ : Kallax.n();
    }

    public final Playlist B() {
        return this.entityCase_ == 7 ? (Playlist) this.entity_ : Playlist.n();
    }

    public final PodcastChapter C() {
        return this.entityCase_ == 23 ? (PodcastChapter) this.entity_ : PodcastChapter.o();
    }

    public final Profile D() {
        return this.entityCase_ == 11 ? (Profile) this.entity_ : Profile.n();
    }

    public final Section E() {
        return this.entityCase_ == 14 ? (Section) this.entity_ : Section.p();
    }

    public final String F() {
        return this.signifierText_;
    }

    public final Track G() {
        return this.entityCase_ == 5 ? (Track) this.entity_ : Track.s();
    }

    public final Venue H() {
        return this.entityCase_ == 21 ? (Venue) this.entity_ : Venue.n();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0002\u0001\u0001߿\u001a\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000e<\u0000\u0010<\u0001\u0011<\u0000\u0012<\u0001\u0013<\u0000\u0014<\u0001\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018Ȉ\u0019ဉ\u0000\u001a<\u0000߾<\u0000߿Ȉ", new Object[]{"entity_", "entityCase_", "highlightType_", "highlightTypeCase_", "bitField0_", "uri_", "name_", "imageUri_", Artist.class, Track.class, Album.class, Playlist.class, Genre.class, AudioShow.class, AudioEpisode.class, Profile.class, Audiobook.class, Section.class, HighlightTypeNewRelease.class, Author.class, HighlightTypeRecentSearch.class, Concert.class, HighlightTypeBestMatch.class, Venue.class, Kallax.class, PodcastChapter.class, "signifierText_", "gatingDecision_", Work.class, AutocompleteQuery.class, "serpMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Entity();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (Entity.class) {
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

    public final Album n() {
        return this.entityCase_ == 6 ? (Album) this.entity_ : Album.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Artist o() {
        return this.entityCase_ == 4 ? (Artist) this.entity_ : Artist.p();
    }

    public final AudioEpisode p() {
        return this.entityCase_ == 10 ? (AudioEpisode) this.entity_ : AudioEpisode.o();
    }

    public final AudioShow q() {
        return this.entityCase_ == 9 ? (AudioShow) this.entity_ : AudioShow.o();
    }

    public final Audiobook r() {
        return this.entityCase_ == 13 ? (Audiobook) this.entity_ : Audiobook.p();
    }

    public final AutocompleteQuery s() {
        return this.entityCase_ == 2046 ? (AutocompleteQuery) this.entity_ : AutocompleteQuery.n();
    }

    public final Concert t() {
        return this.entityCase_ == 19 ? (Concert) this.entity_ : Concert.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int v() {
        int i = this.entityCase_;
        if (i == 0) {
            return 18;
        }
        if (i == 17) {
            return 11;
        }
        if (i == 19) {
            return 12;
        }
        if (i == 26) {
            return 16;
        }
        if (i == 2046) {
            return 17;
        }
        if (i == 13) {
            return 9;
        }
        if (i == 14) {
            return 10;
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
            default:
                switch (i) {
                    case 21:
                        return 13;
                    case 22:
                        return 14;
                    case 23:
                        return 15;
                    default:
                        return 0;
                }
        }
    }

    public final GatingDecision w() {
        GatingDecision gatingDecision = this.gatingDecision_;
        return gatingDecision == null ? GatingDecision.n() : gatingDecision;
    }

    public final Genre x() {
        return this.entityCase_ == 8 ? (Genre) this.entity_ : Genre.n();
    }

    public final int y() {
        int i = this.highlightTypeCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 16) {
            return 1;
        }
        if (i != 18) {
            return i != 20 ? 0 : 3;
        }
        return 2;
    }

    public final String z() {
        return this.imageUri_;
    }
}
