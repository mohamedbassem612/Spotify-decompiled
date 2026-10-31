package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vqf implements dk80 {
    public final /* synthetic */ c9n a;
    public final /* synthetic */ sen0 b;

    public vqf(c9n c9nVar, sen0 sen0Var) {
        this.a = c9nVar;
        this.b = sen0Var;
    }

    public final void i(h4e1 h4e1Var) {
        yzr0 yzr0Var = h4e1Var.c;
        bfn0 bfn0Var = (bfn0) h4e1Var.c().b;
        if (bfn0Var.c == 1) {
            dfe dfeVar = (dfe) bfn0Var.a[0];
            long jE = e6p1.e(dfeVar.a, dfeVar.b);
            int i = nbe1.c;
            int i2 = (int) (4294967295L & jE);
            int i3 = (int) (jE >> 32);
            if (i2 - i3 > 1 && i2 <= yzr0Var.length()) {
                fn31.T(this.a, (o8n) null, 0, new hsc(this.b, yzr0Var.subSequence(i3, i2).toString(), (lnm) null, (byte) 24), 3);
            }
        }
        if (yzr0Var.length() > 2000) {
            h4e1Var.k(2000, yzr0Var.length(), "");
        }
    }
}
