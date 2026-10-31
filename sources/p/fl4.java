package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fl4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 7));

    public fl4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        fl4 fl4Var = (fl4) this.c.getValue();
        return fl4Var != null ? fl4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("allow_list_access_policy_enabled", "android-inter-app-service", a()));
    }
}
