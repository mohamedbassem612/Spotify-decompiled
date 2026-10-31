package p;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ytq0 extends wtq0 {
    @Override // p.wtq0
    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    @Override // p.wtq0
    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    @Override // p.wtq0
    public Object c() {
        Object obj = this.a;
        o0c.l(obj instanceof xtq0);
        return ((xtq0) obj).a;
    }

    @Override // p.wtq0
    public String d() {
        return ((xtq0) this.a).b;
    }

    @Override // p.wtq0
    public final boolean e() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // p.wtq0
    public void f(long j) {
        ((xtq0) this.a).c = j;
    }

    @Override // p.wtq0
    public void h(String str) {
        ((xtq0) this.a).b = str;
    }
}
