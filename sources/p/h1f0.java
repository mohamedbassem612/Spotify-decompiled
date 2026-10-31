package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h1f0 implements g1f0, f961 {
    public final og4 a;

    public h1f0(og4 og4Var) {
        this.a = og4Var;
    }

    public final boolean A() {
        return this.a.n();
    }

    public final boolean B() {
        return this.a.f();
    }

    public final at80 C() {
        int iOrdinal = this.a.K().ordinal();
        if (iOrdinal == 0) {
            return at80.a;
        }
        if (iOrdinal == 1) {
            return at80.b;
        }
        if (iOrdinal == 2) {
            return at80.c;
        }
        eg.o();
        return null;
    }

    public final boolean D() {
        return this.a.p();
    }

    public final boolean E() {
        return this.a.x();
    }

    public final boolean F() {
        return this.a.v();
    }

    public final boolean G() {
        return this.a.b();
    }

    public final boolean H() {
        return this.a.m();
    }

    public final boolean I() {
        return this.a.R();
    }

    public final boolean J() {
        return this.a.q();
    }

    public final int K() {
        return this.a.M();
    }

    public final boolean L() {
        return this.a.i();
    }

    public final boolean M() {
        return this.a.C();
    }

    public final boolean N() {
        return this.a.r();
    }

    public final int O() {
        return this.a.P();
    }

    public final boolean a() {
        return this.a.z();
    }

    public final boolean b() {
        return this.a.o();
    }

    public final boolean c() {
        return this.a.j();
    }

    public final boolean d() {
        return this.a.E();
    }

    public final boolean e() {
        return this.a.g();
    }

    public final boolean f() {
        return this.a.F();
    }

    public final boolean g() {
        return this.a.G();
    }

    public final int h() {
        return this.a.N();
    }

    public final boolean i() {
        return this.a.u();
    }

    public final boolean j() {
        return this.a.k();
    }

    public final boolean k() {
        return this.a.H();
    }

    public final boolean l() {
        return this.a.d();
    }

    public final boolean m() {
        return this.a.A();
    }

    public final boolean n() {
        return this.a.s();
    }

    public final int o() {
        return this.a.Q();
    }

    public final boolean p() {
        return this.a.t();
    }

    public final boolean q() {
        return this.a.e();
    }

    public final boolean r() {
        return this.a.L();
    }

    public final gb80 s() {
        int iOrdinal = this.a.J().ordinal();
        if (iOrdinal == 0) {
            return gb80.DISABLE;
        }
        if (iOrdinal == 1) {
            return gb80.COMPANY;
        }
        if (iOrdinal == 2) {
            return gb80.END_USER_AGREEMENT;
        }
        if (iOrdinal == 3) {
            return gb80.INDONESIA_END_USER_AGREEMENT;
        }
        eg.o();
        return null;
    }

    public final int t() {
        return this.a.O();
    }

    public final boolean u() {
        return this.a.l();
    }

    public final boolean v() {
        return this.a.h();
    }

    public final boolean w() {
        return this.a.B();
    }

    public final boolean x() {
        return this.a.w();
    }

    public final boolean y() {
        return this.a.y();
    }

    public final boolean z() {
        return this.a.I();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }

    @Override // p.dwo
    public final void shutdown() {
    }
}
