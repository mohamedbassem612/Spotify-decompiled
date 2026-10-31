package p;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class buq0 extends auq0 {
    @Override // p.auq0, p.ytq0, p.wtq0
    public final Object c() {
        Object obj = this.a;
        o0c.l(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // p.auq0, p.ytq0, p.wtq0
    public final void f(long j) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j);
    }

    @Override // p.wtq0
    public final void g(int i) {
        ((OutputConfiguration) c()).setMirrorMode(i);
    }

    @Override // p.wtq0
    public final void i(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j);
    }
}
