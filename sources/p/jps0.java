package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class jps0 extends fps0 {
    public final hps0 d;
    public Object e;
    public boolean f;
    public int g;

    public jps0(hps0 hps0Var, lug1[] lug1VarArr) {
        super(hps0Var.c, lug1VarArr);
        this.d = hps0Var;
        this.g = hps0Var.e;
    }

    public final void c(int i, jug1 jug1Var, Object obj, int i2) {
        int i3 = i2 * 5;
        lug1[] lug1VarArr = ((fps0) this).a;
        if (i3 <= 30) {
            int iV = 1 << upn1.v(i, i3);
            if (jug1Var.i(iV)) {
                lug1VarArr[i2].a(Integer.bitCount(jug1Var.a) * 2, jug1Var.f(iV), jug1Var.d);
                ((fps0) this).b = i2;
                return;
            }
            int iU = jug1Var.u(iV);
            jug1 jug1VarT = jug1Var.t(iU);
            lug1VarArr[i2].a(Integer.bitCount(jug1Var.a) * 2, iU, jug1Var.d);
            c(i, jug1VarT, obj, i2 + 1);
            return;
        }
        lug1 lug1Var = lug1VarArr[i2];
        Object[] objArr = jug1Var.d;
        lug1Var.a(objArr.length, 0, objArr);
        while (true) {
            lug1 lug1Var2 = lug1VarArr[i2];
            if (u890.j(lug1Var2.a[lug1Var2.c], obj)) {
                ((fps0) this).b = i2;
                return;
            } else {
                lug1VarArr[i2].c += 2;
            }
        }
    }

    public final Object next() {
        if (this.d.e != this.g) {
            eg.d();
            return null;
        }
        if (!((fps0) this).c) {
            hhg1.k();
            return null;
        }
        lug1 lug1Var = ((fps0) this).a[((fps0) this).b];
        this.e = lug1Var.a[lug1Var.c];
        this.f = true;
        return super.next();
    }

    public final void remove() {
        if (!this.f) {
            bhn0.w();
            return;
        }
        boolean z = ((fps0) this).c;
        hps0 hps0Var = this.d;
        if (!z) {
            hps0Var.remove(this.e);
        } else {
            if (!z) {
                hhg1.k();
                return;
            }
            lug1 lug1Var = ((fps0) this).a[((fps0) this).b];
            Object obj = lug1Var.a[lug1Var.c];
            hps0Var.remove(this.e);
            c(obj == null ? 0 : obj.hashCode(), hps0Var.c, obj, 0);
        }
        this.e = null;
        this.f = false;
        this.g = hps0Var.e;
    }
}
