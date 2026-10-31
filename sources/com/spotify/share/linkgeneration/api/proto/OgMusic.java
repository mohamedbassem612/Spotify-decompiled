package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class OgMusic extends h implements v2j0 {
    private static final OgMusic DEFAULT_INSTANCE;
    public static final int MUSIC_ALBUM_FIELD_NUMBER = 3;
    public static final int MUSIC_DURATION_FIELD_NUMBER = 2;
    public static final int MUSIC_RELEASE_DATE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String musicReleaseDate_ = "";
    private String musicDuration_ = "";
    private String musicAlbum_ = "";

    static {
        OgMusic ogMusic = new OgMusic();
        DEFAULT_INSTANCE = ogMusic;
        h.registerDefaultInstance(OgMusic.class, ogMusic);
    }

    private OgMusic() {
    }

    public static OgMusic n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"musicReleaseDate_", "musicDuration_", "musicAlbum_"});
        }
        if (iOrdinal == 3) {
            return new OgMusic();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (OgMusic.class) {
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

    public final String o() {
        return this.musicAlbum_;
    }

    public final String p() {
        return this.musicDuration_;
    }

    public final String q() {
        return this.musicReleaseDate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
