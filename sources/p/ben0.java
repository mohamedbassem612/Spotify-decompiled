package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ben0 implements i6r0 {
    public final iti1 a = new iti1((byte) 6);
    public Boolean b = null;

    @Override // p.i6r0
    public final Boolean a() {
        return this.b;
    }

    @Override // p.i6r0
    public final kku b(px20 px20Var) {
        boolean zBooleanValue;
        iti1 iti1Var = this.a;
        ujp0 ujp0Var = new ujp0(iti1Var, px20Var);
        ((wdn0) iti1Var.c).b(ujp0Var);
        Boolean bool = this.b;
        if (bool != null && px20Var.b != (zBooleanValue = bool.booleanValue())) {
            px20Var.b = zBooleanValue;
            px20Var.a();
        }
        return ujp0Var;
    }

    public final void c(boolean z) {
        if (u890.j(this.b, Boolean.valueOf(z))) {
            return;
        }
        this.b = Boolean.valueOf(z);
        iti1 iti1Var = this.a;
        wdn0 wdn0Var = (wdn0) iti1Var.c;
        int i = wdn0Var.b;
        iti1Var.b++;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                ujp0 ujp0Var = (ujp0) wdn0Var.g(i2);
                if (ujp0Var.b) {
                    px20 px20Var = (px20) ujp0Var.a;
                    if (px20Var.b != z) {
                        px20Var.b = z;
                        px20Var.a();
                    }
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
}
