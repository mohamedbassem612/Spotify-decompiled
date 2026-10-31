package p;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y5o0 extends ten0 {
    public final ten0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f173p;

    public y5o0(long j, nv91 nv91Var, iu30 iu30Var, iu30 iu30Var2, ten0 ten0Var) {
        super(j, nv91Var, iu30Var, iu30Var2);
        this.o = ten0Var;
        ten0Var.k();
    }

    public final void c() {
        if (((jv91) this).c) {
            return;
        }
        super.c();
        if (this.f173p) {
            return;
        }
        this.f173p = true;
        this.o.l();
    }

    public final nln w() {
        y5o0 y5o0Var;
        ten0 ten0Var = this.o;
        if (ten0Var.m || ((jv91) ten0Var).c) {
            return new kv91(this);
        }
        oen0 oen0Var = ((ten0) this).h;
        long j = ((jv91) this).b;
        HashMap mapM = oen0Var != null ? pv91.m(ten0Var.g(), this, this.o.d()) : null;
        Object obj = pv91.c;
        synchronized (obj) {
            try {
                pv91.t(this);
                if (oen0Var == null || oen0Var.d == 0) {
                    y5o0Var = this;
                    y5o0Var.a();
                } else {
                    y5o0Var = this;
                    nln nlnVarZ = y5o0Var.z(this.o.g(), oen0Var, mapM, this.o.d());
                    if (!nlnVarZ.equals(lv91.e)) {
                        return nlnVarZ;
                    }
                    oen0 oen0VarX = y5o0Var.o.x();
                    if (oen0VarX != null) {
                        oen0VarX.k(oen0Var);
                    } else {
                        y5o0Var.o.B(oen0Var);
                        ((ten0) y5o0Var).h = null;
                    }
                }
                if (u890.r(y5o0Var.o.g(), j) < 0) {
                    y5o0Var.o.v();
                }
                ten0 ten0Var2 = y5o0Var.o;
                ten0Var2.r(ten0Var2.d().c(j).b(((ten0) y5o0Var).j));
                y5o0Var.o.A(j);
                ten0 ten0Var3 = y5o0Var.o;
                int i = ((jv91) y5o0Var).d;
                ((jv91) y5o0Var).d = -1;
                if (i >= 0) {
                    int[] iArr = ten0Var3.k;
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    ten0Var3.k = iArrCopyOf;
                } else {
                    ten0Var3.getClass();
                }
                ten0 ten0Var4 = y5o0Var.o;
                nv91 nv91Var = ((ten0) y5o0Var).j;
                ten0Var4.getClass();
                synchronized (obj) {
                    ten0Var4.j = ten0Var4.j.e(nv91Var);
                    ten0 ten0Var5 = y5o0Var.o;
                    int[] iArrY0 = ((ten0) y5o0Var).k;
                    ten0Var5.getClass();
                    if (iArrY0.length != 0) {
                        int[] iArr2 = ten0Var5.k;
                        if (iArr2.length != 0) {
                            iArrY0 = f46.y0(iArr2, iArrY0);
                        }
                        ten0Var5.k = iArrY0;
                    }
                }
                ((ten0) y5o0Var).m = true;
                if (!y5o0Var.f173p) {
                    y5o0Var.f173p = true;
                    y5o0Var.o.l();
                }
                return lv91.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
