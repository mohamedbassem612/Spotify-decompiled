package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dai0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new z8i0(this, (byte) 1));

    public dai0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        dai0 dai0Var = (dai0) this.c.getValue();
        return dai0Var != null ? dai0Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("skip_remove_on_transition", "mediarouterx-flags", a()));
    }
}
