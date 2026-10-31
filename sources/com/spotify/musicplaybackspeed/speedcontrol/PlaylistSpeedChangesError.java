package com.spotify.musicplaybackspeed.speedcontrol;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/musicplaybackspeed/speedcontrol/PlaylistSpeedChangesError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SignalFailed", "Lcom/spotify/musicplaybackspeed/speedcontrol/PlaylistSpeedChangesError$SignalFailed;", "src_main_java_com_spotify_musicplaybackspeed_speedcontrol-speedcontrol"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public abstract class PlaylistSpeedChangesError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/musicplaybackspeed/speedcontrol/PlaylistSpeedChangesError$SignalFailed;", "Lcom/spotify/musicplaybackspeed/speedcontrol/PlaylistSpeedChangesError;", "src_main_java_com_spotify_musicplaybackspeed_speedcontrol-speedcontrol"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final /* data */ class SignalFailed extends PlaylistSpeedChangesError {
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
    }
}
