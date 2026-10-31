package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ys71 implements ky11 {
    public final hrr0 N0;
    public u8s0 X;
    public ys71 Y;
    public yq71 Z;
    public final hrr0 a = v8r.q(Boolean.FALSE);
    public final drr0 b = new drr0(0.0f);
    public final hrr0 c;
    public final hrr0 d;
    public final hrr0 e;
    public final hrr0 f;
    public final hrr0 g;
    public final hrr0 h;
    public final hrr0 i;
    public boolean t;

    public ys71(xs71 xs71Var, m1c m1cVar, qv71 qv71Var, ov71 ov71Var) {
        Boolean bool = Boolean.TRUE;
        this.c = v8r.q(bool);
        this.d = v8r.q(xs71Var);
        this.e = v8r.q(m1cVar);
        this.f = v8r.q(mv71.b);
        this.g = v8r.q(bool);
        this.h = v8r.q(qv71Var);
        this.i = v8r.q(ov71Var);
        this.N0 = v8r.q((Object) null);
    }

    public final ft71 a() {
        yq71 yq71Var;
        ft71 ft71VarH1;
        ((lv71) p().b.getValue()).getClass();
        yq71 yq71Var2 = this.Z;
        Object obj = null;
        ft71 ft71VarH2 = yq71Var2 != null ? yq71Var2.H1() : null;
        if (r() ? !o() : o()) {
            List listC = k().c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = listC.get(i);
                ys71 ys71Var = (ys71) obj2;
                boolean zR = ys71Var.r();
                boolean zO = ys71Var.o();
                if (!zR) {
                    zO = !zO;
                }
                if (zO) {
                    obj = obj2;
                    break;
                }
            }
            ys71 ys71Var2 = (ys71) obj;
            if (ys71Var2 != null && (yq71Var = ys71Var2.Z) != null && (ft71VarH1 = yq71Var.H1()) != null) {
                return ft71VarH1;
            }
        }
        return ft71VarH2;
    }

    public final void b() {
        pv71 pv71Var = k().b;
        err0 err0Var = pv71Var.g;
        xs71 xs71VarK = k();
        xs71VarK.d.setValue(o7h.O0(this, xs71VarK.b()));
        xs71VarK.f();
        pv71Var.f();
        wdn0 wdn0Var = pv71Var.h;
        Object[] objArr = wdn0Var.a;
        int i = wdn0Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            ys71 ys71Var = (ys71) objArr[i2];
            if (!(ys71Var instanceof ys71)) {
                ys71Var = null;
            }
            if (u890.j(ys71Var != null ? ys71Var.k() : null, k())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || i2 >= wdn0Var.b - 1) {
            wdn0Var.b(this);
        } else {
            wdn0Var.a(i2 + 1, this);
        }
        err0Var.t(err0Var.s() + 1);
        k().c.w();
    }

    public final m1c c() {
        return (m1c) this.e.getValue();
    }

    public final yq71 d() {
        return this.Z;
    }

    public final boolean e() {
        return this.t;
    }

    public final be50 g() {
        return (be50) this.N0.getValue();
    }

    public final void h() {
        pv71 pv71Var = k().b;
        xs71 xs71VarK = k();
        xs71VarK.d.setValue(o7h.J0(xs71VarK.b(), this));
        xs71VarK.e.setValue(o7h.J0(xs71VarK.c(), this));
        xs71VarK.f();
        pv71Var.f();
        pv71Var.h.k(this);
        err0 err0Var = pv71Var.g;
        err0Var.t(err0Var.s() + 1);
        if (xs71VarK.b().isEmpty()) {
            fn31.T(xs71VarK.b.b, null, 0, new wp41(xs71VarK, this, (lnm) null, (byte) 8), 3);
        }
        k().c.w();
    }

    public final qv71 i() {
        return (qv71) this.h.getValue();
    }

    public final nv71 j() {
        return (nv71) this.f.getValue();
    }

    public final xs71 k() {
        return (xs71) this.d.getValue();
    }

    public final boolean l() {
        if (c().b()) {
            return true;
        }
        return (k().c.v().d() && !k().c.v().b()) || !((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean m() {
        if (l() && k().c.v().d() && q() && ((Boolean) this.c.getValue()).booleanValue()) {
            return k().b.c() || r();
        }
        return false;
    }

    public final boolean n() {
        if (k().c.v().d()) {
            return !m() && l();
        }
        return true;
    }

    public final boolean o() {
        return c().b();
    }

    public final ov71 p() {
        return (ov71) this.i.getValue();
    }

    public final boolean q() {
        ov71 ov71VarP = p();
        if (!((Boolean) this.a.getValue()).booleanValue()) {
            return false;
        }
        ((lv71) ov71VarP.b.getValue()).getClass();
        return true;
    }

    public final boolean r() {
        ft71 ft71VarH1;
        yq71 yq71Var = this.Z;
        return (yq71Var == null || (ft71VarH1 = yq71Var.H1()) == null || !ft71VarH1.n()) ? false : true;
    }

    public final void s(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void t(yq71 yq71Var) {
        this.Z = yq71Var;
    }

    public final void u(u8s0 u8s0Var) {
        this.X = u8s0Var;
    }

    public final void v(boolean z) {
        this.t = z;
    }

    public final void w(be50 be50Var) {
        this.N0.setValue(be50Var);
    }

    public final void x(ys71 ys71Var) {
        if (u890.j(this.Y, ys71Var)) {
            return;
        }
        this.Y = ys71Var;
        err0 err0Var = k().b.g;
        err0Var.t(err0Var.s() + 1);
    }

    public final void f() {
    }
}
