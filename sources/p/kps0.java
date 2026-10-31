package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class kps0 extends gps0 {
    public final ips0 d;
    public Object e;
    public boolean f;
    public int g;

    public kps0(ips0 ips0Var, mug1[] mug1VarArr) {
        super(ips0Var.c, mug1VarArr);
        this.d = ips0Var;
        this.g = ips0Var.e;
    }

    public final void c(int i, kug1 kug1Var, Object obj, int i2) {
        int i3 = i2 * 5;
        mug1[] mug1VarArr = this.a;
        if (i3 <= 30) {
            int iT = 1 << xpn1.t(i, i3);
            if (kug1Var.h(iT)) {
                mug1VarArr[i2].c(Integer.bitCount(kug1Var.a) * 2, kug1Var.f(iT), kug1Var.d);
                this.b = i2;
                return;
            }
            int iT2 = kug1Var.t(iT);
            kug1 kug1VarS = kug1Var.s(iT2);
            mug1VarArr[i2].c(Integer.bitCount(kug1Var.a) * 2, iT2, kug1Var.d);
            c(i, kug1VarS, obj, i2 + 1);
            return;
        }
        mug1 mug1Var = mug1VarArr[i2];
        Object[] objArr = kug1Var.d;
        mug1Var.c(objArr.length, 0, objArr);
        while (true) {
            mug1 mug1Var2 = mug1VarArr[i2];
            if (u890.j(mug1Var2.a[mug1Var2.c], obj)) {
                this.b = i2;
                return;
            } else {
                mug1VarArr[i2].c += 2;
            }
        }
    }

    @Override // p.gps0, java.util.Iterator
    public final Object next() {
        if (this.d.e != this.g) {
            eg.d();
            return null;
        }
        if (!this.c) {
            hhg1.k();
            return null;
        }
        mug1 mug1Var = this.a[this.b];
        this.e = mug1Var.a[mug1Var.c];
        this.f = true;
        return super.next();
    }

    @Override // p.gps0, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            bhn0.w();
            return;
        }
        boolean z = this.c;
        ips0 ips0Var = this.d;
        if (!z) {
            w0h1.k(ips0Var).remove(this.e);
        } else {
            if (!z) {
                hhg1.k();
                return;
            }
            mug1 mug1Var = this.a[this.b];
            Object obj = mug1Var.a[mug1Var.c];
            w0h1.k(ips0Var).remove(this.e);
            c(obj != null ? obj.hashCode() : 0, ips0Var.c, obj, 0);
        }
        this.e = null;
        this.f = false;
        this.g = ips0Var.e;
    }
}
