package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vq4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new rq4(this, (byte) 3));

    public vq4(int i, luk lukVar, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = lukVar;
    }

    public final boolean a() {
        vq4 vq4Var = (vq4) this.e.getValue();
        return vq4Var != null ? vq4Var.a() : this.a;
    }

    public final int b() {
        vq4 vq4Var = (vq4) this.e.getValue();
        return vq4Var != null ? vq4Var.b() : this.b;
    }

    public final boolean c() {
        vq4 vq4Var = (vq4) this.e.getValue();
        return vq4Var != null ? vq4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_banner_dismiss", "android-livesharing-controller-impl", a()), new fpb("pause_playback_delay_millis", "android-livesharing-controller-impl", b(), 0, 10000), new fpb("use_jam_api", "android-livesharing-controller-impl", c()));
    }
}
