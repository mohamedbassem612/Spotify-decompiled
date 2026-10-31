package p;

import com.spotify.prefs.prefsimpl.NativePrefs;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q5n implements p5n, f961 {
    public final NativePrefs a = NativePrefs.INSTANCE.create();

    @Override // p.dwo
    public final void shutdown() {
        this.a.destroy();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
