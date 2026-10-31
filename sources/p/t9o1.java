package p;

import com.google.android.gms.internal.play_billing.zzia;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class t9o1 implements Cloneable {
    public final iao1 a;
    public iao1 b;

    public t9o1(iao1 iao1Var) {
        this.a = iao1Var;
        if (iao1Var.h()) {
            hhg1.n("Default instance must be immutable.");
            throw null;
        }
        this.b = iao1Var.n();
    }

    public final iao1 a() {
        boolean zH = this.b.h();
        iao1 iao1Var = this.b;
        if (zH) {
            iao1Var.p();
            iao1Var = this.b;
        }
        iao1Var.getClass();
        if (iao1.i(iao1Var, true)) {
            return iao1Var;
        }
        throw new zzia();
    }

    public final void b() {
        if (this.b.h()) {
            return;
        }
        iao1 iao1VarN = this.a.n();
        igo1.c.a(iao1VarN.getClass()).zzg(iao1VarN, this.b);
        this.b = iao1VarN;
    }

    public final Object clone() {
        t9o1 t9o1Var = (t9o1) this.a.j(5);
        boolean zH = this.b.h();
        iao1 iao1Var = this.b;
        if (zH) {
            iao1Var.p();
            iao1Var = this.b;
        }
        t9o1Var.b = iao1Var;
        return t9o1Var;
    }
}
