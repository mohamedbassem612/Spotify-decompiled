package com.spotify.playlistmixing.utils;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/playlistmixing/utils/MixingStateError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SignalFailed", "LensOperationFailed", "Lcom/spotify/playlistmixing/utils/MixingStateError$LensOperationFailed;", "Lcom/spotify/playlistmixing/utils/MixingStateError$SignalFailed;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public abstract class MixingStateError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/playlistmixing/utils/MixingStateError$LensOperationFailed;", "Lcom/spotify/playlistmixing/utils/MixingStateError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class LensOperationFailed extends MixingStateError {
        public final String a;

        public LensOperationFailed(String str) {
            super(str);
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LensOperationFailed) && u890.j(this.a, ((LensOperationFailed) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public LensOperationFailed() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/playlistmixing/utils/MixingStateError$SignalFailed;", "Lcom/spotify/playlistmixing/utils/MixingStateError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class SignalFailed extends MixingStateError {
        public final String a;

        public SignalFailed(String str) {
            super(str);
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignalFailed) && u890.j(this.a, ((SignalFailed) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public SignalFailed() {
            this(null);
        }
    }
}
