package p;

import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wfc1 extends zso1 implements jga0 {
    public final fjs0 b;
    public final nfa0 c;
    public final rjm1 d;
    public final jga0[] e;
    public final kl1 f;
    public final vfa0 g;
    public boolean h;
    public String i;
    public String t;

    public wfc1(fjs0 fjs0Var, nfa0 nfa0Var, rjm1 rjm1Var, jga0[] jga0VarArr) {
        this.b = fjs0Var;
        this.c = nfa0Var;
        this.d = rjm1Var;
        this.e = jga0VarArr;
        this.f = nfa0Var.b;
        this.g = nfa0Var.a;
        int iOrdinal = rjm1Var.ordinal();
        if (jga0VarArr != null) {
            jga0 jga0Var = jga0VarArr[iOrdinal];
            if (jga0Var == null && jga0Var == this) {
                return;
            }
            jga0VarArr[iOrdinal] = this;
        }
    }

    public final void D(h661 h661Var, int i) {
        int iOrdinal = this.d.ordinal();
        fjs0 fjs0Var = this.b;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!fjs0Var.a) {
                fjs0Var.f(',');
            }
            fjs0Var.c();
            return;
        }
        if (iOrdinal == 2) {
            if (fjs0Var.a) {
                this.h = true;
                fjs0Var.c();
                return;
            }
            if (i % 2 == 0) {
                fjs0Var.f(',');
                fjs0Var.c();
            } else {
                fjs0Var.f(':');
                fjs0Var.l();
                z = false;
            }
            this.h = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!fjs0Var.a) {
                fjs0Var.f(',');
            }
            fjs0Var.c();
            h0(mue1.D(h661Var, this.c, i));
            fjs0Var.f(':');
            fjs0Var.l();
            return;
        }
        if (i == 0) {
            this.h = true;
        }
        if (i == 1) {
            fjs0Var.f(',');
            fjs0Var.l();
            this.h = false;
        }
    }

    @Override // p.uax
    public final void J() {
        this.b.i("null");
    }

    @Override // p.uax
    public final void O(short s) {
        if (this.h) {
            h0(String.valueOf((int) s));
        } else {
            this.b.j(s);
        }
    }

    @Override // p.uax
    public final void P(boolean z) {
        if (this.h) {
            h0(String.valueOf(z));
        } else {
            ((o490) this.b.b).s(String.valueOf(z));
        }
    }

    @Override // p.jga0
    public final void R(uga0 uga0Var) {
        i(hga0.a, uga0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.json.JsonEncodingException */
    @Override // p.uax
    public final void S(float f) throws JsonEncodingException {
        if (this.h) {
            h0(String.valueOf(f));
        } else {
            ((o490) this.b.b).s(String.valueOf(f));
        }
        if (!this.g.j && Math.abs(f) > Float.MAX_VALUE) {
            throw vvm1.g(Float.valueOf(f));
        }
    }

    @Override // p.uax
    public final void U(char c) {
        h0(String.valueOf(c));
    }

    @Override // p.z1k
    public final void a(h661 h661Var) {
        fjs0 fjs0Var = this.b;
        fjs0Var.m();
        fjs0Var.d();
        fjs0Var.f(this.d.b);
    }

    @Override // p.uax
    public final void a0(int i) {
        if (this.h) {
            h0(String.valueOf(i));
        } else {
            this.b.g(i);
        }
    }

    @Override // p.uax
    public final z1k b(h661 h661Var) {
        jga0 jga0Var;
        nfa0 nfa0Var = this.c;
        rjm1 rjm1VarM = anm1.M(nfa0Var, h661Var);
        char c = rjm1VarM.a;
        fjs0 fjs0Var = this.b;
        fjs0Var.f(c);
        fjs0Var.b();
        String str = this.i;
        if (str != null) {
            String strH = this.t;
            if (strH == null) {
                strH = h661Var.h();
            }
            fjs0Var.c();
            h0(str);
            fjs0Var.f(':');
            fjs0Var.l();
            h0(strH);
            this.i = null;
            this.t = null;
        }
        if (this.d == rjm1VarM) {
            return this;
        }
        jga0[] jga0VarArr = this.e;
        return (jga0VarArr == null || (jga0Var = jga0VarArr[rjm1VarM.ordinal()]) == null) ? new wfc1(fjs0Var, nfa0Var, rjm1VarM, jga0VarArr) : jga0Var;
    }

    @Override // p.uax
    public final kl1 c() {
        return this.f;
    }

    @Override // p.jga0
    public final nfa0 d() {
        return this.c;
    }

    @Override // p.z1k
    public final boolean d0() {
        return this.g.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.json.JsonEncodingException */
    @Override // p.uax
    public final void h(double d) throws JsonEncodingException {
        if (this.h) {
            h0(String.valueOf(d));
        } else {
            ((o490) this.b.b).s(String.valueOf(d));
        }
        if (!this.g.j && Math.abs(d) > Double.MAX_VALUE) {
            throw vvm1.g(Double.valueOf(d));
        }
    }

    @Override // p.uax
    public final void h0(String str) {
        this.b.k(str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    @Override // p.uax
    public final void i(nma0 nma0Var, Object obj) {
        String strV;
        nma0 nma0VarO;
        nfa0 nfa0Var = this.c;
        boolean z = nma0Var instanceof f9;
        int i = nfa0Var.a.l;
        if (!z) {
            int iC = l1d.C(i);
            if (iC != 0) {
                if (iC == 1) {
                    yoi1 kind = nma0Var.getDescriptor().getKind();
                    strV = (u890.j(kind, uic1.h) || u890.j(kind, uic1.j)) ? i9p1.v(nfa0Var, nma0Var.getDescriptor()) : null;
                } else if (iC != 2) {
                    eg.o();
                    return;
                }
            }
        } else if (i != 1) {
        }
        if (z) {
            f9 f9Var = (f9) nma0Var;
            if (obj == null) {
                bhn0.k("Value for serializer ", f9Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            nma0VarO = n9p1.o(f9Var, this, obj);
        } else {
            nma0VarO = nma0Var;
        }
        if (strV != null) {
            i9p1.r(nfa0Var, nma0Var, nma0VarO, strV);
            i9p1.u(nma0VarO.getDescriptor().getKind());
            String strH = nma0VarO.getDescriptor().h();
            this.i = strV;
            this.t = strH;
        }
        nma0VarO.serialize(this, obj);
    }

    @Override // p.uax
    public final void j(byte b) {
        if (this.h) {
            h0(String.valueOf((int) b));
        } else {
            this.b.e(b);
        }
    }

    @Override // p.uax
    public final void r(h661 h661Var, int i) {
        h0(h661Var.e(i));
    }

    @Override // p.z1k
    public final void s(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        if (obj != null || this.g.f) {
            super.s(h661Var, i, nma0Var, obj);
        }
    }

    @Override // p.uax
    public final uax v(h661 h661Var) {
        boolean zB = xfc1.b(h661Var);
        rjm1 rjm1Var = this.d;
        nfa0 nfa0Var = this.c;
        f0k e0kVar = this.b;
        if (zB) {
            if (!(e0kVar instanceof f0k)) {
                e0kVar = new f0k((o490) ((fjs0) e0kVar).b, this.h);
            }
            return new wfc1(e0kVar, nfa0Var, rjm1Var, null);
        }
        if (xfc1.a(h661Var)) {
            if (!(e0kVar instanceof e0k)) {
                e0kVar = new e0k((o490) ((fjs0) e0kVar).b, this.h);
            }
            return new wfc1(e0kVar, nfa0Var, rjm1Var, null);
        }
        if (this.i != null) {
            this.t = h661Var.h();
        }
        return this;
    }

    @Override // p.uax
    public final void z(long j) {
        if (this.h) {
            h0(String.valueOf(j));
        } else {
            this.b.h(j);
        }
    }
}
