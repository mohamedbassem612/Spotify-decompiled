package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d4v extends pim0 implements dpg1, e4v, zkb0 {
    public final iu30 O0;
    public d4v P0;
    public e4v Q0;
    public long R0;

    public d4v(b6 b6Var, int i) {
        this.O0 = (i & 2) != 0 ? null : b6Var;
        this.R0 = 0L;
    }

    @Override // p.pim0
    public final void A1() {
        this.Q0 = null;
        this.P0 = null;
    }

    @Override // p.e4v
    public final void I0(x3v x3vVar) {
        fn31.o(this, new j6(x3vVar, (byte) 25));
    }

    @Override // p.e4v
    public final void O0(x3v x3vVar) {
        e4v e4vVar = this.Q0;
        if (e4vVar != null) {
            e4vVar.O0(x3vVar);
            return;
        }
        d4v d4vVar = this.P0;
        if (d4vVar != null) {
            d4vVar.O0(x3vVar);
        }
    }

    @Override // p.e4v
    public final void W0(x3v x3vVar) {
        e4v e4vVar = this.Q0;
        if (e4vVar != null) {
            e4vVar.W0(x3vVar);
            return;
        }
        d4v d4vVar = this.P0;
        if (d4vVar != null) {
            d4vVar.W0(x3vVar);
        }
    }

    @Override // p.e4v
    public final boolean Y0(x3v x3vVar) {
        d4v d4vVar = this.P0;
        if (d4vVar != null) {
            return d4vVar.Y0(x3vVar);
        }
        e4v e4vVar = this.Q0;
        if (e4vVar != null) {
            return e4vVar.Y0(x3vVar);
        }
        return false;
    }

    @Override // p.e4v
    public final void a0(x3v x3vVar) {
        dpg1 dpg1Var;
        d4v d4vVar;
        d4v d4vVar2 = this.P0;
        if (d4vVar2 == null || !fn31.m(d4vVar2, jo31.j(x3vVar))) {
            if (this.a.N0) {
                p811 p811Var = new p811();
                don1.H(this, new ffr(p811Var, this, x3vVar, (byte) 1));
                dpg1Var = (dpg1) p811Var.a;
            } else {
                dpg1Var = null;
            }
            d4vVar = (d4v) dpg1Var;
        } else {
            d4vVar = d4vVar2;
        }
        if (d4vVar != null && d4vVar2 == null) {
            fn31.n(d4vVar, x3vVar);
            e4v e4vVar = this.Q0;
            if (e4vVar != null) {
                e4vVar.q(x3vVar);
            }
        } else if (d4vVar == null && d4vVar2 != null) {
            e4v e4vVar2 = this.Q0;
            if (e4vVar2 != null) {
                fn31.n(e4vVar2, x3vVar);
            }
            d4vVar2.q(x3vVar);
        } else if (!u890.j(d4vVar, d4vVar2)) {
            if (d4vVar != null) {
                fn31.n(d4vVar, x3vVar);
            }
            if (d4vVar2 != null) {
                d4vVar2.q(x3vVar);
            }
        } else if (d4vVar != null) {
            d4vVar.a0(x3vVar);
        } else {
            e4v e4vVar3 = this.Q0;
            if (e4vVar3 != null) {
                e4vVar3.a0(x3vVar);
            }
        }
        this.P0 = d4vVar;
    }

    @Override // p.zkb0, p.ofh0
    public final void f(long j) {
        this.R0 = j;
    }

    @Override // p.dpg1
    public final Object n() {
        return vf61.Q0;
    }

    @Override // p.e4v
    public final void q(x3v x3vVar) {
        e4v e4vVar = this.Q0;
        if (e4vVar != null) {
            e4vVar.q(x3vVar);
        }
        d4v d4vVar = this.P0;
        if (d4vVar != null) {
            d4vVar.q(x3vVar);
        }
        this.P0 = null;
    }
}
