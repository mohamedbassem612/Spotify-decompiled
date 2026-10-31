package p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tt7 implements wt7 {
    @Override // p.wt7
    public final void a() {
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            AudioDriver.startDuckingAudioSession(currentAudioSession.intValue());
        }
    }

    @Override // p.wt7
    public final void b(vt7 vt7Var, int i, float f) {
        sj6 sj6Var = new sj6((byte) 1, f, i);
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            sj6Var.invoke(currentAudioSession);
        }
    }

    @Override // p.wt7
    public final void c(vt7 vt7Var, int i) {
        uv4 uv4Var = new uv4(i, (byte) 3);
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            uv4Var.invoke(currentAudioSession);
        }
    }

    @Override // p.wt7
    public final void d(vt7 vt7Var) {
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            AudioDriver.stopDuckingAudioSession(currentAudioSession.intValue());
        }
    }
}
