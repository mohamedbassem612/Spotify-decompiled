package com.spotify.playlistmixing.endpoints;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/PlaylistMixDuplicationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "DuplicateCreationFailed", "Lcom/spotify/playlistmixing/endpoints/PlaylistMixDuplicationError$DuplicateCreationFailed;", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public abstract class PlaylistMixDuplicationError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/PlaylistMixDuplicationError$DuplicateCreationFailed;", "Lcom/spotify/playlistmixing/endpoints/PlaylistMixDuplicationError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class DuplicateCreationFailed extends PlaylistMixDuplicationError {
        public static final DuplicateCreationFailed a = new DuplicateCreationFailed();
        public static final String b = "Failed to create duplicate playlist";

        private DuplicateCreationFailed() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DuplicateCreationFailed);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return b;
        }

        public final int hashCode() {
            return 1412995576;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "DuplicateCreationFailed";
        }
    }

    public /* synthetic */ PlaylistMixDuplicationError(int i) {
        this();
    }

    private PlaylistMixDuplicationError() {
    }
}
