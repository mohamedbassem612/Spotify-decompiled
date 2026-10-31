package p;

import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class krw0 implements iac0 {
    public static final krw0 i = new krw0();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final tac0 f = new tac0(this, true);
    public final n6 g = new n6(this, (byte) 9);
    public final vgq0 h = new vgq0(this, (byte) 18);

    public final void a() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.g(k8c0.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.g);
            }
        }
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.f;
    }
}
