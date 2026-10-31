package com.spotify.playlistmixing.endpoints;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "GetAutoTransitionUriFailed", "Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError$GetAutoTransitionUriFailed;", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public abstract class GetAutoTransitionUriError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError$GetAutoTransitionUriFailed;", "Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class GetAutoTransitionUriFailed extends GetAutoTransitionUriError {
        public static final GetAutoTransitionUriFailed a = new GetAutoTransitionUriFailed();
        public static final String b = "Failed to get auto transition URI";

        private GetAutoTransitionUriFailed() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetAutoTransitionUriFailed);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return b;
        }

        public final int hashCode() {
            return -1830098900;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GetAutoTransitionUriFailed";
        }
    }

    public /* synthetic */ GetAutoTransitionUriError(int i) {
        this();
    }

    private GetAutoTransitionUriError() {
    }
}
