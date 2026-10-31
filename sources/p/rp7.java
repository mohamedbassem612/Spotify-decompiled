package p;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rp7 extends AudioDeviceCallback {
    public final /* synthetic */ tp7 a;

    public rp7(tp7 tp7Var) {
        this.a = tp7Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        tp7.c(this.a);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        tp7 tp7Var = this.a;
        if (zoi1.m(audioDeviceInfoArr, tp7.a(tp7Var))) {
            tp7.b(tp7Var);
        }
        tp7.c(tp7Var);
    }
}
