package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uj4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 26));

    public uj4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        uj4 uj4Var = (uj4) this.c.getValue();
        return uj4Var != null ? uj4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("explanation_banner_enabled", "android-free-day-employee", a()));
    }
}
