package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e35 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new k25(this, (byte) 9));

    public e35(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        e35 e35Var = (e35) this.c.getValue();
        return e35Var != null ? e35Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_contextual_flair", "android-system-list-ux-platform-consumers-contextual-flair", a()));
    }
}
