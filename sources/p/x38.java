package p;

import android.os.Handler;
import com.spotify.playbacknative.AudioDeviceInfoFacade;
import com.spotify.playbacknative.AudioRouteListenerHandler;
import com.spotify.playbacknative.AudioTrackAdapter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x38 extends AudioRouteListenerHandler {
    public final Handler a;
    public w38 b = new a4x0(29);
    public v38 c;

    public x38(Handler handler) {
        this.a = handler;
    }

    @Override // com.spotify.playbacknative.AudioRouteListenerHandler
    public final void attach(AudioTrackAdapter audioTrackAdapter) {
        v38 v38Var = this.c;
        if (v38Var == null) {
            n57.e("Audio track created without AudioRouteChangeDispatcher having started. Events will be lost.");
            return;
        }
        audioTrackAdapter.addOnRoutingChangedListener(v38Var, this.a);
        AudioDeviceInfoFacade routedDevice = audioTrackAdapter.getRoutedDevice();
        if (routedDevice != null) {
            this.b.a(routedDevice.getDeviceId(), routedDevice.getProductName(), routedDevice.getAudioDeviceInfoType(), routedDevice.getAddress());
        }
    }

    @Override // com.spotify.playbacknative.AudioRouteListenerHandler
    public final void detach(AudioTrackAdapter audioTrackAdapter) {
        v38 v38Var = this.c;
        if (v38Var != null) {
            audioTrackAdapter.removeOnRoutingChangedListener(v38Var);
        }
    }
}
