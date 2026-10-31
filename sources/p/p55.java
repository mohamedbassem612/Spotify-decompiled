package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p55 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new f55(this, (byte) 9));

    public p55(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
    }

    public final boolean a() {
        p55 p55Var = (p55) this.d.getValue();
        return p55Var != null ? p55Var.a() : this.a;
    }

    public final int b() {
        p55 p55Var = (p55) this.d.getValue();
        return p55Var != null ? p55Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_heartbeat", "android-ubi-page-heartbeat", a()), new fpb("heartbeat_interval_seconds", "android-ubi-page-heartbeat", b(), 900, 60000));
    }
}
