package com.spotify.playlistmixing.utils;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/playlistmixing/utils/TransitionCuratorError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "UpdateCustomTransitionFailed", "RevertToAutoFailed", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError$RevertToAutoFailed;", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError$UpdateCustomTransitionFailed;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public abstract class TransitionCuratorError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/playlistmixing/utils/TransitionCuratorError$RevertToAutoFailed;", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class RevertToAutoFailed extends TransitionCuratorError {
        public final String a;

        public RevertToAutoFailed(String str) {
            super(str);
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevertToAutoFailed) && u890.j(this.a, ((RevertToAutoFailed) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public RevertToAutoFailed() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/playlistmixing/utils/TransitionCuratorError$UpdateCustomTransitionFailed;", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class UpdateCustomTransitionFailed extends TransitionCuratorError {
        public final String a;

        public UpdateCustomTransitionFailed(String str) {
            super(str);
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCustomTransitionFailed) && u890.j(this.a, ((UpdateCustomTransitionFailed) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public UpdateCustomTransitionFailed() {
            this(null);
        }
    }
}
