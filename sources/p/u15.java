package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u15 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 24));

    public u15(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        u15 u15Var = (u15) this.c.getValue();
        return u15Var != null ? u15Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_page_api", "android-sleep-timer-nudge", a()));
    }
}
