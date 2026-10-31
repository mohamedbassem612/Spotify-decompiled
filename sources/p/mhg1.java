package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class mhg1 {
    public final k9 a;
    public final mhg1 b;
    public final String c;
    public final hrr0 d;
    public final hrr0 f;
    public final hrr0 i;
    public final bw91 j;
    public final bw91 k;
    public final hrr0 l;
    public final mdt m;
    public final hrr0 e = xto.t((Object) null);
    public final frr0 g = pqo.n(0);
    public final frr0 h = pqo.n(Long.MIN_VALUE);

    public mhg1(k9 k9Var, mhg1 mhg1Var, String str) {
        this.a = k9Var;
        this.b = mhg1Var;
        this.c = str;
        this.d = xto.t(k9Var.P0());
        this.f = xto.t(new ehg1(k9Var.P0(), k9Var.P0()));
        Boolean bool = Boolean.FALSE;
        this.i = xto.t(bool);
        this.j = xto.p();
        this.k = xto.p();
        this.l = xto.t(bool);
        this.m = xto.l(new ugg1(this, (byte) 1));
        k9Var.s1(this);
    }

    public final void a(Object obj, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(this) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (g()) {
            x340Var.i0(467722849);
            x340Var.r(false);
        } else {
            x340Var.i0(466062241);
            r(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = xto.l(new ugg1(this, (byte) 0));
                x340Var.s0(objT);
            }
            if (((Boolean) ((tob1) objT).getValue()).booleanValue()) {
                x340Var.i0(466470356);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT2);
                }
                c9n c9nVar = (c9n) objT2;
                boolean zI = x340Var.i(c9nVar) | (i3 == 32);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new vae1(c9nVar, this, (byte) 3);
                    x340Var.s0(objT3);
                }
                qxd0.h(c9nVar, this, (iu30) objT3, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(467712929);
                x340Var.r(false);
            }
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(this, obj, i, (byte) 10);
        }
    }

    public final long b() {
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((fhg1) bw91Var.get(i)).Y.s());
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((mhg1) bw91Var2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            fhg1 fhg1Var = (fhg1) bw91Var.get(i);
            fhg1Var.f = null;
            fhg1Var.e = null;
            fhg1Var.i = false;
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((mhg1) bw91Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            if (((fhg1) bw91Var.get(i)).e != null) {
                return true;
            }
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((mhg1) bw91Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        mhg1 mhg1Var = this.b;
        return mhg1Var != null ? mhg1Var.e() : this.g.s();
    }

    public final dhg1 f() {
        return (dhg1) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        frr0 frr0Var = this.h;
        long jS = frr0Var.s();
        k9 k9Var = this.a;
        boolean z2 = true;
        if (jS == Long.MIN_VALUE) {
            frr0Var.t(j);
            k9Var.r1(true);
        } else if (!k9Var.d1()) {
            k9Var.r1(true);
        }
        o(false);
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            fhg1 fhg1Var = (fhg1) bw91Var.get(i);
            hrr0 hrr0Var = fhg1Var.g;
            hrr0 hrr0Var2 = fhg1Var.g;
            if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                long jE = z ? fhg1Var.c().e() : j;
                fhg1Var.e(fhg1Var.c().g(jE));
                fhg1Var.X = fhg1Var.c().c(jE);
                if (fhg1Var.c().d(jE)) {
                    hrr0Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) hrr0Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mhg1 mhg1Var = (mhg1) bw91Var2.get(i2);
            hrr0 hrr0Var3 = mhg1Var.d;
            k9 k9Var2 = mhg1Var.a;
            if (!u890.j(hrr0Var3.getValue(), k9Var2.P0())) {
                mhg1Var.h(j, z);
            }
            if (!u890.j(mhg1Var.d.getValue(), k9Var2.P0())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.t(Long.MIN_VALUE);
        k9 k9Var = this.a;
        if (k9Var instanceof zen0) {
            k9Var.o1(this.d.getValue());
        }
        n(0L);
        k9Var.r1(false);
        bw91 bw91Var = this.k;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            ((mhg1) bw91Var.get(i)).i();
        }
    }

    public final void j(float f) {
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            fhg1 fhg1Var = (fhg1) bw91Var.get(i);
            fhg1Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                hrd1 hrd1Var = fhg1Var.f;
                if (hrd1Var != null) {
                    fhg1Var.c().a(hrd1Var.c);
                    fhg1Var.e = null;
                    fhg1Var.f = null;
                }
                Object obj = f == -4.0f ? fhg1Var.c().d : fhg1Var.c().c;
                fhg1Var.c().a(obj);
                fhg1Var.c().i(obj);
                fhg1Var.e(obj);
                fhg1Var.Y.t(fhg1Var.c().e());
            } else {
                fhg1Var.h.t(f);
            }
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((mhg1) bw91Var2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.h.t(Long.MIN_VALUE);
        k9 k9Var = this.a;
        k9Var.r1(false);
        boolean zG = g();
        hrr0 hrr0Var = this.d;
        if (!zG || !u890.j(k9Var.P0(), obj) || !u890.j(hrr0Var.getValue(), obj2)) {
            if (!u890.j(k9Var.P0(), obj) && (k9Var instanceof zen0)) {
                k9Var.o1(obj);
            }
            hrr0Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new ehg1(obj, obj2));
        }
        bw91 bw91Var = this.k;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            mhg1 mhg1Var = (mhg1) bw91Var.get(i);
            if (mhg1Var.g()) {
                mhg1Var.k(mhg1Var.a.P0(), mhg1Var.d.getValue());
            }
        }
        bw91 bw91Var2 = this.j;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((fhg1) bw91Var2.get(i2)).d(0L);
        }
    }

    public final void l(long j) {
        frr0 frr0Var = this.h;
        if (frr0Var.s() == Long.MIN_VALUE) {
            frr0Var.t(j);
        }
        n(j);
        o(false);
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            ((fhg1) bw91Var.get(i)).d(j);
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mhg1 mhg1Var = (mhg1) bw91Var2.get(i2);
            if (!u890.j(mhg1Var.d.getValue(), mhg1Var.a.P0())) {
                mhg1Var.l(j);
            }
        }
    }

    public final void m(co51 co51Var) {
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            fhg1 fhg1Var = (fhg1) bw91Var.get(i);
            hrr0 hrr0Var = fhg1Var.t;
            if (!u890.j(fhg1Var.c().c, fhg1Var.c().d)) {
                fhg1Var.f = fhg1Var.c();
                fhg1Var.e = co51Var;
            }
            fhg1Var.d.setValue(new hrd1(fhg1Var.N0, fhg1Var.a, hrr0Var.getValue(), hrr0Var.getValue(), rrn1.A(fhg1Var.X)));
            fhg1Var.Y.t(fhg1Var.c().e());
            fhg1Var.i = true;
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((mhg1) bw91Var2.get(i2)).m(co51Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.g.t(j);
        }
    }

    public final void o(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void p() {
        hrd1 hrd1Var;
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            fhg1 fhg1Var = (fhg1) bw91Var.get(i);
            co51 co51Var = fhg1Var.e;
            if (co51Var != null && (hrd1Var = fhg1Var.f) != null) {
                long jA0 = jch0.a0(co51Var.c() * ((double) co51Var.g()));
                Object objG = hrd1Var.g(jA0);
                if (fhg1Var.i) {
                    fhg1Var.c().i(objG);
                }
                fhg1Var.c().a(objG);
                fhg1Var.Y.t(fhg1Var.c().e());
                if (fhg1Var.h.s() == -2.0f || fhg1Var.i) {
                    fhg1Var.e(objG);
                } else {
                    fhg1Var.d(fhg1Var.O0.e());
                }
                if (jA0 >= co51Var.c()) {
                    fhg1Var.e = null;
                    fhg1Var.f = null;
                } else {
                    co51Var.i(false);
                }
            }
        }
        bw91 bw91Var2 = this.k;
        int size2 = bw91Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((mhg1) bw91Var2.get(i2)).p();
        }
    }

    public final void q(Object obj) {
        hrr0 hrr0Var = this.e;
        Object value = hrr0Var.getValue();
        k9 k9Var = this.a;
        hrr0 hrr0Var2 = this.d;
        boolean z = value != null && obj == null && u890.j(hrr0Var2.getValue(), k9Var.P0());
        hrr0Var.setValue(obj);
        if (z) {
            this.f.setValue(new ehg1(value, hrr0Var2.getValue()));
            k9Var.o1(value);
            if (this.h.s() == Long.MIN_VALUE) {
                o(true);
            }
            bw91 bw91Var = this.j;
            int size = bw91Var.size();
            for (int i = 0; i < size; i++) {
                ((fhg1) bw91Var.get(i)).h.t(-2.0f);
            }
        }
    }

    public final void r(Object obj) {
        hrr0 hrr0Var = this.d;
        if (u890.j(hrr0Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new ehg1(hrr0Var.getValue(), obj));
        k9 k9Var = this.a;
        if (!u890.j(k9Var.P0(), hrr0Var.getValue())) {
            k9Var.o1(hrr0Var.getValue());
        }
        hrr0Var.setValue(obj);
        if (this.h.s() == Long.MIN_VALUE) {
            o(true);
        }
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        for (int i = 0; i < size; i++) {
            ((fhg1) bw91Var.get(i)).h.t(-2.0f);
        }
    }

    public final String toString() {
        bw91 bw91Var = this.j;
        int size = bw91Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((fhg1) bw91Var.get(i)) + ", ";
        }
        return str;
    }
}
