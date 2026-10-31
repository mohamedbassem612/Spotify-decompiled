package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new rq4(this, (byte) 4));

    public wq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        wq4 wq4Var = (wq4) this.c.getValue();
        return wq4Var != null ? wq4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_integration", "android-livesharing-google-meet", a()));
    }
}
