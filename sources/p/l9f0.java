package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l9f0 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new jgd0(this, (byte) 21));

    public l9f0(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
    }

    public final int a() {
        l9f0 l9f0Var = (l9f0) this.d.getValue();
        return l9f0Var != null ? l9f0Var.a() : this.b;
    }

    public final boolean b() {
        l9f0 l9f0Var = (l9f0) this.d.getValue();
        return l9f0Var != null ? l9f0Var.b() : this.a;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("is_enabled", "lossless-remote-device-message-box", b()), new fpb("maximum_shows_per_device", "lossless-remote-device-message-box", a(), 0, 100)});
    }
}
