package com.spotify.mostplayed.v1;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Decoration extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTIST_FIELD_NUMBER = 1;
    private static final Decoration DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 4;
    public static final int TRACK_FIELD_NUMBER = 3;
    private DecorationAlbum album_;
    private DecorationArtist artist_;
    private int bitField0_;
    private DecorationPlaylist playlist_;
    private DecorationTrack track_;

    static {
        Decoration decoration = new Decoration();
        DEFAULT_INSTANCE = decoration;
        h.registerDefaultInstance(Decoration.class, decoration);
    }

    private Decoration() {
    }

    public static Decoration n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "artist_", "album_", "track_", "playlist_"});
        }
        if (iOrdinal == 3) {
            return new Decoration();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (Decoration.class) {
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

    public final DecorationTrack o() {
        DecorationTrack decorationTrack = this.track_;
        return decorationTrack == null ? DecorationTrack.n() : decorationTrack;
    }

    public final boolean p() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
