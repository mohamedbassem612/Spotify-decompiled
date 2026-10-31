package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mmb0 implements tlc1, ifh0 {
    public final /* synthetic */ pmb0 a;
    public final /* synthetic */ vmb0 b;

    public mmb0(vmb0 vmb0Var) {
        this.b = vmb0Var;
        this.a = vmb0Var.h;
    }

    @Override // p.ifh0
    public final hfh0 B(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2) {
        return this.a.B(i, i2, map, iu30Var, iu30Var2);
    }

    @Override // p.wat
    public final long I(int i) {
        return this.a.I(i);
    }

    @Override // p.wat
    public final long L(float f) {
        return this.a.L(f);
    }

    @Override // p.wat
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // p.wat
    public final float N0(float f) {
        return f / this.a.h();
    }

    @Override // p.tlc1
    public final List P(Object obj, vu30 vu30Var) {
        vmb0 vmb0Var = this.b;
        hmb0 hmb0Var = vmb0Var.a;
        nen0 nen0Var = vmb0Var.g;
        hmb0 hmb0Var2 = (hmb0) nen0Var.g(obj);
        if (hmb0Var2 != null && hmb0Var.p().indexOf(hmb0Var2) < vmb0Var.d) {
            return hmb0Var2.n();
        }
        nen0 nen0Var2 = vmb0Var.Y;
        nen0 nen0Var3 = vmb0Var.t;
        bfn0 bfn0Var = vmb0Var.Z;
        if (bfn0Var.c < vmb0Var.e) {
            qf80.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        hmb0 hmb0Var3 = (hmb0) nen0Var.g(obj);
        int i = bfn0Var.c;
        int i2 = vmb0Var.e;
        if (i == i2) {
            bfn0Var.b(obj);
        } else {
            Object[] objArr = bfn0Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        vmb0Var.e++;
        boolean zB = nen0Var3.b(obj);
        if (zB || hmb0Var3 != null) {
            if (!zB && hmb0Var3 != null) {
                vmb0Var.k(hmb0Var.p().indexOf(hmb0Var3), hmb0Var.p().size());
                vmb0Var.O0++;
                nen0Var.k(obj);
                nen0Var3.m(obj, hmb0Var3);
                nen0Var2.m(obj, vmb0Var.f(obj));
                if (hmb0Var.I()) {
                    vmb0Var.i();
                }
            }
            hmb0 hmb0Var4 = (hmb0) nen0Var3.g(obj);
            nmb0 nmb0Var = hmb0Var4 != null ? (nmb0) vmb0Var.f.g(hmb0Var4) : null;
            if (nmb0Var != null && nmb0Var.d) {
                vmb0Var.n(hmb0Var4, obj, false, vu30Var);
            }
            if ((nmb0Var != null ? nmb0Var.f : null) != null) {
                vmb0Var.d(nmb0Var, true);
            }
        } else {
            vmb0Var.l(obj, vu30Var, false);
            nen0Var2.m(obj, vmb0Var.f(obj));
        }
        hmb0 hmb0Var5 = (hmb0) nen0Var3.g(obj);
        if (hmb0Var5 == null) {
            return z6x.a;
        }
        afn0 afn0VarL0 = hmb0Var5.f1.f68p.l0();
        int size = afn0VarL0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ffh0) afn0VarL0.get(i3)).f.b = true;
        }
        return afn0VarL0;
    }

    @Override // p.ifh0
    public final hfh0 S(int i, int i2, Map map, iu30 iu30Var) {
        return this.a.B(i, i2, map, null, iu30Var);
    }

    @Override // p.wat
    public final float U0() {
        return this.a.c;
    }

    @Override // p.p890
    public final boolean W() {
        return this.a.W();
    }

    @Override // p.wat
    public final float X0(float f) {
        return this.a.h() * f;
    }

    @Override // p.p890
    public final flb0 getLayoutDirection() {
        return this.a.a;
    }

    @Override // p.wat
    public final float h() {
        return this.a.b;
    }

    @Override // p.wat
    public final int i0(float f) {
        return this.a.i0(f);
    }

    @Override // p.wat
    public final long k1(long j) {
        return this.a.k1(j);
    }

    @Override // p.wat
    public final float q0(long j) {
        return this.a.q0(j);
    }

    @Override // p.wat
    public final long s(float f) {
        return this.a.s(f);
    }

    @Override // p.wat
    public final long t(long j) {
        return this.a.t(j);
    }

    @Override // p.wat
    public final float y(long j) {
        return this.a.y(j);
    }
}
