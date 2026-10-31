package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ms00 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new pdy(this, (byte) 26));

    public ms00(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        ms00 ms00Var = (ms00) this.e.getValue();
        return ms00Var != null ? ms00Var.a() : this.a;
    }

    public final boolean b() {
        ms00 ms00Var = (ms00) this.e.getValue();
        return ms00Var != null ? ms00Var.b() : this.b;
    }

    public final boolean c() {
        ms00 ms00Var = (ms00) this.e.getValue();
        return ms00Var != null ? ms00Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("is_not_interested_followup_enabled", "explicitfeedback", a()), new fpb("is_not_interested_on_shelves_enabled", "explicitfeedback", b()), new fpb("is_trigger_enabled", "explicitfeedback", c()));
    }
}
