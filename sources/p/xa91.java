package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xa91 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fe81(this, (byte) 15));

    public xa91(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        xa91 xa91Var = (xa91) this.c.getValue();
        return xa91Var != null ? xa91Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_sleeptimer_dialogs", "sleeptimer-dialogs", a()));
    }
}
