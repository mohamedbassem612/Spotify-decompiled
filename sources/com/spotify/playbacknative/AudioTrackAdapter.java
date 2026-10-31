package com.spotify.playbacknative;

import android.os.Handler;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/spotify/playbacknative/AudioTrackAdapter;", "", "Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;", "listener", "Landroid/os/Handler;", "handler", "Lp/rih1;", "addOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;Landroid/os/Handler;)V", "removeOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;)V", "Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "getRoutedDevice", "()Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "routedDevice", "", "getAudioSessionId", "()I", "audioSessionId", "getPlayState", "playState", "Companion", "OnRoutingChangedListener", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface AudioTrackAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/spotify/playbacknative/AudioTrackAdapter$Companion;", "", "<init>", "()V", "PLAYSTATE_STOPPED", "", "getPLAYSTATE_STOPPED", "()I", "PLAYSTATE_PAUSED", "getPLAYSTATE_PAUSED", "PLAYSTATE_PLAYING", "getPLAYSTATE_PLAYING", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int PLAYSTATE_STOPPED = 1;
        private static final int PLAYSTATE_PAUSED = 2;
        private static final int PLAYSTATE_PLAYING = 3;

        private Companion() {
        }

        public final int getPLAYSTATE_PAUSED() {
            return PLAYSTATE_PAUSED;
        }

        public final int getPLAYSTATE_PLAYING() {
            return PLAYSTATE_PLAYING;
        }

        public final int getPLAYSTATE_STOPPED() {
            return PLAYSTATE_STOPPED;
        }
    }

    void addOnRoutingChangedListener(OnRoutingChangedListener listener, Handler handler);

    int getAudioSessionId();

    int getPlayState();

    AudioDeviceInfoFacade getRoutedDevice();

    void removeOnRoutingChangedListener(OnRoutingChangedListener listener);
}
