package com.spotify.extendedmetadata.extensions.artistmusicvideosimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ArtistMusicVideos extends h implements v2j0 {
    private static final ArtistMusicVideos DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRERELEASE_VIDEO_URIS_FIELD_NUMBER = 3;
    public static final int PROFILE_FILTERED_VIDEO_URIS_FIELD_NUMBER = 2;
    public static final int VIDEO_URIS_FIELD_NUMBER = 1;
    private h290 videoUris_ = h.emptyProtobufList();
    private h290 profileFilteredVideoUris_ = h.emptyProtobufList();
    private h290 prereleaseVideoUris_ = h.emptyProtobufList();

    static {
        ArtistMusicVideos artistMusicVideos = new ArtistMusicVideos();
        DEFAULT_INSTANCE = artistMusicVideos;
        h.registerDefaultInstance(ArtistMusicVideos.class, artistMusicVideos);
    }

    private ArtistMusicVideos() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ArtistMusicVideos q(byte[] bArr) {
        return (ArtistMusicVideos) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003Ț", new Object[]{"videoUris_", "profileFilteredVideoUris_", "prereleaseVideoUris_"});
        }
        if (iOrdinal == 3) {
            return new ArtistMusicVideos();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (ArtistMusicVideos.class) {
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

    public final h290 n() {
        return this.prereleaseVideoUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.profileFilteredVideoUris_;
    }

    public final h290 p() {
        return this.videoUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
