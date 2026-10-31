package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class qdo0 {
    public final bfn0 a = new bfn0(0, new ddo0[16]);
    public final wdn0 b = new wdn0(10);

    public boolean a(q5f0 q5f0Var, elb0 elb0Var, oi oiVar, boolean z) {
        bfn0 bfn0Var = this.a;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((ddo0) objArr[i2]).a(q5f0Var, elb0Var, oiVar, z) || z2;
        }
        return z2;
    }

    public void b(oi oiVar) {
        bfn0 bfn0Var = this.a;
        int i = bfn0Var.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((ddo0) bfn0Var.a[i]).d.h()) {
                bfn0Var.l(i);
            }
        }
    }
}
