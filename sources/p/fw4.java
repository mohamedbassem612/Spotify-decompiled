package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fw4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 17));

    public fw4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        fw4 fw4Var = (fw4) this.c.getValue();
        return fw4Var != null ? fw4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("is_enabled", "android-offline-state-saver", a()));
    }
}
