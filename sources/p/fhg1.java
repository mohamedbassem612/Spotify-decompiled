package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fhg1 implements tob1 {
    public final n8b1 N0;
    public final /* synthetic */ mhg1 O0;
    public oe5 X;
    public final frr0 Y;
    public boolean Z;
    public final tzg1 a;
    public final hrr0 b;
    public final hrr0 c;
    public final hrr0 d;
    public co51 e;
    public hrd1 f;
    public final hrr0 g;
    public final drr0 h;
    public boolean i;
    public final hrr0 t;

    public fhg1(mhg1 mhg1Var, Object obj, oe5 oe5Var, tzg1 tzg1Var) {
        this.O0 = mhg1Var;
        this.a = tzg1Var;
        hrr0 hrr0VarT = xto.t(obj);
        this.b = hrr0VarT;
        Object objInvoke = null;
        hrr0 hrr0VarT2 = xto.t(irn1.l0(0.0f, 0.0f, (Object) null, 7));
        this.c = hrr0VarT2;
        this.d = xto.t(new hrd1((ni20) hrr0VarT2.getValue(), tzg1Var, obj, hrr0VarT.getValue(), oe5Var));
        this.g = xto.t(Boolean.TRUE);
        this.h = exd0.u(-1.0f);
        this.t = xto.t(obj);
        this.X = oe5Var;
        this.Y = pqo.n(c().e());
        Float f = (Float) ckk1.b.get(tzg1Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            oe5 oe5Var2 = (oe5) tzg1Var.a.invoke(obj);
            int iB = oe5Var2.b();
            for (int i = 0; i < iB; i++) {
                oe5Var2.e(fFloatValue, i);
            }
            objInvoke = this.a.b.invoke(oe5Var2);
        }
        this.N0 = irn1.l0(0.0f, 0.0f, objInvoke, 3);
    }

    public final hrd1 c() {
        return (hrd1) this.d.getValue();
    }

    public final void d(long j) {
        if (this.h.s() == -1.0f) {
            this.Z = true;
            if (u890.j(c().c, c().d)) {
                e(c().c);
            } else {
                e(c().g(j));
                this.X = c().c(j);
            }
        }
    }

    public final void e(Object obj) {
        this.t.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        hrd1 hrd1Var = this.f;
        Object obj2 = hrd1Var != null ? hrd1Var.c : null;
        hrr0 hrr0Var = this.b;
        boolean zJ = u890.j(obj2, hrr0Var.getValue());
        frr0 frr0Var = this.Y;
        hrr0 hrr0Var2 = this.d;
        yhb1 yhb1VarR = this.N0;
        if (zJ) {
            hrr0Var2.setValue(new hrd1(yhb1VarR, this.a, obj, obj, rrn1.A(this.X)));
            this.i = true;
            frr0Var.t(c().e());
            return;
        }
        hrr0 hrr0Var3 = this.c;
        if (!z || this.Z || (((ni20) hrr0Var3.getValue()) instanceof n8b1)) {
            yhb1VarR = (ni20) hrr0Var3.getValue();
        }
        mhg1 mhg1Var = this.O0;
        if (mhg1Var.e() > 0) {
            yhb1VarR = irn1.R(yhb1VarR, mhg1Var.e());
        }
        hrr0Var2.setValue(new hrd1(yhb1VarR, this.a, obj, hrr0Var.getValue(), this.X));
        frr0Var.t(c().e());
        this.i = false;
        mhg1Var.o(true);
        if (mhg1Var.g()) {
            bw91 bw91Var = mhg1Var.j;
            int size = bw91Var.size();
            for (int i = 0; i < size; i++) {
                fhg1 fhg1Var = (fhg1) bw91Var.get(i);
                fhg1Var.Y.s();
                fhg1Var.d(0L);
            }
            mhg1Var.o(false);
        }
    }

    @Override // p.tob1
    public final Object getValue() {
        return this.t.getValue();
    }

    public final void i(Object obj, Object obj2, ni20 ni20Var) {
        this.b.setValue(obj2);
        this.c.setValue(ni20Var);
        if (u890.j(c().d, obj) && u890.j(c().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    public final void j(Object obj, ni20 ni20Var, Object obj2, oe5 oe5Var) {
        Object value;
        if (this.i) {
            hrd1 hrd1Var = this.f;
            if (u890.j(obj, hrd1Var != null ? hrd1Var.c : null)) {
                return;
            }
        }
        hrr0 hrr0Var = this.b;
        boolean zJ = u890.j(hrr0Var.getValue(), obj);
        drr0 drr0Var = this.h;
        if (zJ && drr0Var.s() == -1.0f && (obj2 == null || obj2.equals(c().d))) {
            return;
        }
        hrr0Var.setValue(obj);
        this.c.setValue(ni20Var);
        if (obj2 == null) {
            value = drr0Var.s() == -3.0f ? obj : this.t.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            e(value);
            if (oe5Var != null) {
                this.X = oe5Var;
            }
        }
        hrr0 hrr0Var2 = this.g;
        f(value, !((Boolean) hrr0Var2.getValue()).booleanValue());
        hrr0Var2.setValue(Boolean.valueOf(drr0Var.s() == -3.0f));
        if (drr0Var.s() >= 0.0f) {
            e(c().g((long) (drr0Var.s() * c().e())));
        } else if (drr0Var.s() == -3.0f) {
            e(obj);
        }
        this.i = false;
        drr0Var.t(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.t.getValue() + ", target: " + this.b.getValue() + ", spec: " + ((ni20) this.c.getValue());
    }
}
