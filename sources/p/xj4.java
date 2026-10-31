package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xj4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new q30(this, 11));

    public xj4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        xj4 xj4Var = (xj4) this.d.getValue();
        return xj4Var != null ? xj4Var.a() : this.a;
    }

    public final boolean b() {
        xj4 xj4Var = (xj4) this.d.getValue();
        return xj4Var != null ? xj4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("dry_run_enabled", "android-gating", a()), new fpb("kill_switch_enabled", "android-gating", b()));
    }
}
