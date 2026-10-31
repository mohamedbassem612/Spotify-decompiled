package p;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class auq0 extends ytq0 {
    @Override // p.ytq0, p.wtq0
    public Object c() {
        Object obj = this.a;
        o0c.l(obj instanceof ztq0);
        return ((ztq0) obj).a;
    }

    @Override // p.ytq0, p.wtq0
    public final String d() {
        return null;
    }

    @Override // p.ytq0, p.wtq0
    public void f(long j) {
        ((ztq0) this.a).b = j;
    }

    @Override // p.ytq0, p.wtq0
    public final void h(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
