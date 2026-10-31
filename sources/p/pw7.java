package p;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pw7 {
    public static final pw7 a = new pw7();

    public final void a(AudioManager audioManager, Executor executor, Object obj) {
        audioManager.addOnCommunicationDeviceChangedListener(executor, um5.e(obj));
    }

    public final void b(AudioManager audioManager) {
        audioManager.clearCommunicationDevice();
    }

    public final List<AudioDeviceInfo> c(AudioManager audioManager) {
        return audioManager.getAvailableCommunicationDevices();
    }

    public final AudioDeviceInfo d(AudioManager audioManager) {
        return audioManager.getCommunicationDevice();
    }

    public final Object e(final iu30 iu30Var) {
        return new AudioManager.OnCommunicationDeviceChangedListener() { // from class: p.vw7
            @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
            public final /* synthetic */ void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                iu30Var.invoke(audioDeviceInfo);
            }
        };
    }

    public final void f(AudioManager audioManager, Object obj) {
        audioManager.removeOnCommunicationDeviceChangedListener(um5.e(obj));
    }

    public final boolean g(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        return audioManager.setCommunicationDevice(audioDeviceInfo);
    }
}
