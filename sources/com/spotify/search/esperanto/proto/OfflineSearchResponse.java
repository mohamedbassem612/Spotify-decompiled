package com.spotify.search.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.search.proto.OfflineAlbum;
import com.spotify.search.proto.OfflineAudioEpisode;
import com.spotify.search.proto.OfflinePlaylist;
import com.spotify.search.proto.OfflineTrack;
import java.util.List;
import p.bf40;
import p.djp0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class OfflineSearchResponse extends h implements v2j0 {
    public static final int ALBUMS_FIELD_NUMBER = 1;
    public static final int AUDIO_EPISODES_FIELD_NUMBER = 2;
    private static final OfflineSearchResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 3;
    public static final int TRACKS_FIELD_NUMBER = 4;
    private h290 albums_ = h.emptyProtobufList();
    private h290 audioEpisodes_ = h.emptyProtobufList();
    private h290 playlists_ = h.emptyProtobufList();
    private h290 tracks_ = h.emptyProtobufList();

    static {
        OfflineSearchResponse offlineSearchResponse = new OfflineSearchResponse();
        DEFAULT_INSTANCE = offlineSearchResponse;
        h.registerDefaultInstance(OfflineSearchResponse.class, offlineSearchResponse);
    }

    private OfflineSearchResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static OfflineSearchResponse q(byte[] bArr) {
        return (OfflineSearchResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"albums_", OfflineAlbum.class, "audioEpisodes_", OfflineAudioEpisode.class, "playlists_", OfflinePlaylist.class, "tracks_", OfflineTrack.class});
        }
        if (iOrdinal == 3) {
            return new OfflineSearchResponse();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (OfflineSearchResponse.class) {
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

    public final List getTracksList() {
        return this.tracks_;
    }

    public final h290 n() {
        return this.albums_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.audioEpisodes_;
    }

    public final h290 p() {
        return this.playlists_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
