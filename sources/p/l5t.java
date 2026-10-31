package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class l5t extends pim0 {
    public final int O0 = odo0.e(this);
    public pim0 P0;

    @Override // p.pim0
    public final void C1() {
        super.C1();
        for (pim0 pim0Var = this.P0; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.C1();
        }
    }

    @Override // p.pim0
    public final void D1() {
        for (pim0 pim0Var = this.P0; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.D1();
        }
        super.D1();
    }

    @Override // p.pim0
    public final void E1() {
        super.E1();
        for (pim0 pim0Var = this.P0; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.E1();
        }
    }

    @Override // p.pim0
    public final void F1(pim0 pim0Var) {
        this.a = pim0Var;
        for (pim0 pim0Var2 = this.P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
            pim0Var2.F1(pim0Var);
        }
    }

    @Override // p.pim0
    public final void G1(ndo0 ndo0Var) {
        this.h = ndo0Var;
        for (pim0 pim0Var = this.P0; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.G1(ndo0Var);
        }
    }

    public final void H1(x4t x4tVar) {
        pim0 pim0Var = ((pim0) x4tVar).a;
        if (pim0Var != x4tVar) {
            pim0 pim0Var2 = x4tVar instanceof pim0 ? (pim0) x4tVar : null;
            pim0 pim0Var3 = pim0Var2 != null ? pim0Var2.e : null;
            if (pim0Var == this.a && u890.j(pim0Var3, this)) {
                return;
            }
            eg.m("Cannot delegate to an already delegated node");
            return;
        }
        if (pim0Var.N0) {
            qf80.c("Cannot delegate to an already attached node");
        }
        pim0Var.F1(this.a);
        int i = this.c;
        int iF = odo0.f(pim0Var);
        pim0Var.c = iF;
        int i2 = this.c;
        int i3 = iF & 2;
        if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof zlb0)) {
            qf80.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + pim0Var);
        }
        pim0Var.f = this.P0;
        this.P0 = pim0Var;
        pim0Var.e = this;
        J1(iF | this.c, false);
        if (this.N0) {
            if (i3 == 0 || (i & 2) != 0) {
                G1(this.h);
            } else {
                jdo0 jdo0Var = oap1.B(this).e1;
                this.a.G1(null);
                jdo0Var.o();
            }
            pim0Var.x1();
            pim0Var.D1();
            if (!pim0Var.N0) {
                qf80.c("autoInvalidateInsertedNode called on unattached node");
            }
            odo0.a(pim0Var, -1, 1);
        }
    }

    public final void I1(x4t x4tVar) {
        pim0 pim0Var = null;
        for (pim0 pim0Var2 = this.P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
            if (pim0Var2 == x4tVar) {
                boolean z = pim0Var2.N0;
                if (z) {
                    sdn0 sdn0Var = odo0.a;
                    if (!z) {
                        qf80.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    odo0.a(pim0Var2, -1, 2);
                    pim0Var2.E1();
                    pim0Var2.y1();
                }
                pim0Var2.F1(pim0Var2);
                pim0Var2.d = 0;
                pim0 pim0Var3 = pim0Var2.f;
                if (pim0Var == null) {
                    this.P0 = pim0Var3;
                } else {
                    pim0Var.f = pim0Var3;
                }
                pim0Var2.f = null;
                pim0Var2.e = null;
                int i = this.c;
                int iF = odo0.f(this);
                J1(iF, true);
                if (this.N0 && (i & 2) != 0 && (iF & 2) == 0) {
                    jdo0 jdo0Var = oap1.B(this).e1;
                    this.a.G1(null);
                    jdo0Var.o();
                    return;
                }
                return;
            }
            pim0Var = pim0Var2;
        }
        hhg1.o(x4tVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void J1(int i, boolean z) {
        ?? r2;
        pim0 pim0Var;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            if (oap1.n(this)) {
                this.d = i;
            }
            if (this.N0) {
                pim0 pim0Var2 = this.a;
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == pim0Var2) {
                        break;
                    }
                    this = this;
                    r2 = r2.e;
                }
                if (z && r2 == pim0Var2) {
                    i = odo0.f(pim0Var2);
                    pim0Var2.c = i;
                }
                int i3 = i | ((r2 == 0 || (pim0Var = r2.f) == null) ? 0 : pim0Var.d);
                for (?? r3 = r2; r3 != 0; r3 = r3.e) {
                    i3 |= r3.c;
                    r3.d = i3;
                }
            }
        }
    }

    @Override // p.pim0
    public final void x1() {
        super.x1();
        for (pim0 pim0Var = this.P0; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.G1(this.h);
            if (!pim0Var.N0) {
                pim0Var.x1();
            }
        }
    }

    @Override // p.pim0
    public final void y1() {
        for (pim0 pim0Var = this.P0; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.y1();
        }
        super.y1();
    }
}
