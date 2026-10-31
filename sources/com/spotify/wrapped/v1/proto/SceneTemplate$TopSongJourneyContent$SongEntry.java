package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopSongJourneyContent$SongEntry extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 3;
    public static final int COVER_IMAGE_FIELD_NUMBER = 5;
    private static final SceneTemplate$TopSongJourneyContent$SongEntry DEFAULT_INSTANCE;
    public static final int FLAVOR_TEXT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RANK_FIELD_NUMBER = 1;
    public static final int SONG_NAME_FIELD_NUMBER = 2;
    public static final int VIDEO_FIELD_NUMBER = 6;
    private Paragraph artistName_;
    private int bitField0_;
    private Paragraph flavorText_;
    private Paragraph rank_;
    private Paragraph songName_;
    private int visualCase_ = 0;
    private Object visual_;

    static {
        SceneTemplate$TopSongJourneyContent$SongEntry sceneTemplate$TopSongJourneyContent$SongEntry = new SceneTemplate$TopSongJourneyContent$SongEntry();
        DEFAULT_INSTANCE = sceneTemplate$TopSongJourneyContent$SongEntry;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopSongJourneyContent$SongEntry.class, sceneTemplate$TopSongJourneyContent$SongEntry);
    }

    private SceneTemplate$TopSongJourneyContent$SongEntry() {
    }

    public static SceneTemplate$TopSongJourneyContent$SongEntry p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005<\u0000\u0006<\u0000", new Object[]{"visual_", "visualCase_", "bitField0_", "rank_", "songName_", "artistName_", "flavorText_", Image.class, VideoConfiguration.class});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopSongJourneyContent$SongEntry();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (SceneTemplate$TopSongJourneyContent$SongEntry.class) {
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

    public final Paragraph n() {
        Paragraph paragraph = this.artistName_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Image o() {
        return this.visualCase_ == 5 ? (Image) this.visual_ : Image.o();
    }

    public final Paragraph q() {
        Paragraph paragraph = this.flavorText_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.rank_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.songName_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final VideoConfiguration t() {
        return this.visualCase_ == 6 ? (VideoConfiguration) this.visual_ : VideoConfiguration.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.visualCase_ == 5;
    }

    public final boolean v() {
        return this.visualCase_ == 6;
    }
}
