package com.spotify.playlistmixing.endpoints;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "NotMixedPlaylist", "ReorderFailed", "RevisionConflict", "TrackLimitExceeded", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$NotMixedPlaylist;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$ReorderFailed;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$RevisionConflict;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$TrackLimitExceeded;", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public abstract class MixingReorderingError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$NotMixedPlaylist;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class NotMixedPlaylist extends MixingReorderingError {
        static {
            new NotMixedPlaylist();
        }

        private NotMixedPlaylist() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotMixedPlaylist);
        }

        public final int hashCode() {
            return 1768000242;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NotMixedPlaylist";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$ReorderFailed;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class ReorderFailed extends MixingReorderingError {
        public static final ReorderFailed a = new ReorderFailed();

        private ReorderFailed() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReorderFailed);
        }

        public final int hashCode() {
            return -1140432896;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ReorderFailed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$RevisionConflict;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class RevisionConflict extends MixingReorderingError {
        public static final RevisionConflict a = new RevisionConflict();

        private RevisionConflict() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RevisionConflict);
        }

        public final int hashCode() {
            return -1650291483;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "RevisionConflict";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$TrackLimitExceeded;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class TrackLimitExceeded extends MixingReorderingError {
        public static final TrackLimitExceeded a = new TrackLimitExceeded();

        private TrackLimitExceeded() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TrackLimitExceeded);
        }

        public final int hashCode() {
            return 466637499;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "TrackLimitExceeded";
        }
    }

    public /* synthetic */ MixingReorderingError(int i) {
        this();
    }

    private MixingReorderingError() {
    }
}
