package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class bgp0 implements nml {
    public final iti1 a = new iti1((byte) 6);
    public int b;

    public final kku b(pml pmlVar) {
        iti1 iti1Var = this.a;
        ujp0 ujp0Var = new ujp0(iti1Var, pmlVar);
        ((wdn0) iti1Var.c).b(ujp0Var);
        int i = this.b;
        this.b = i + 1;
        if (i == 0) {
            e();
        }
        return new agp0(new l811(), ujp0Var, this, (byte) 0);
    }

    public final void d(m511 m511Var) {
        iti1 iti1Var = this.a;
        wdn0 wdn0Var = (wdn0) iti1Var.c;
        int i = wdn0Var.b;
        iti1Var.b++;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                ujp0 ujp0Var = (ujp0) wdn0Var.g(i2);
                if (ujp0Var.b) {
                    ((pml) ujp0Var.a).c(m511Var);
                }
            } finally {
                int i3 = iti1Var.b - 1;
                iti1Var.b = i3;
                if (i3 == 0 && iti1Var.a) {
                    iti1Var.d();
                }
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
