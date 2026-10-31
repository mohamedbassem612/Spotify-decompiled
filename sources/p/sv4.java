package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sv4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 11));

    public sv4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        sv4 sv4Var = (sv4) this.c.getValue();
        return sv4Var != null ? sv4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_card_in_npv", "android-npv-martini-card", a()));
    }
}
