package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n55 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f55(this, (byte) 7));

    public n55(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        n55 n55Var = (n55) this.c.getValue();
        return n55Var != null ? n55Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_main_thread_assertion", "android-ubi-mainthreadassertion", a()));
    }
}
