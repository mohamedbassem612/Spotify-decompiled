package p;

import androidx.media3.transformer.ExportException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vn00 extends jca {
    public long T0;
    public d541 U0;
    public fmr V0;
    public boolean W0;
    public ie30 X0;
    public ie30 Y0;
    public final o0g Z0;
    public final a67 a1;
    public final gar b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;

    public vn00(int i, o0g o0gVar, a67 a67Var) {
        super(i);
        this.Z0 = o0gVar;
        this.a1 = a67Var;
        this.b1 = new gar(0);
    }

    @Override // p.jca
    public final void B() {
        fmr fmrVar = this.V0;
        if (fmrVar != null) {
            fmrVar.i();
        }
    }

    @Override // p.jca
    public final void C() {
        this.c1 = true;
    }

    @Override // p.jca
    public final void D() {
        this.c1 = false;
    }

    @Override // p.jca
    public final void E(ie30[] ie30VarArr, long j, long j2, p2i0 p2i0Var) {
        this.T0 = j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080 A[Catch: ExportException -> 0x0021, TRY_LEAVE, TryCatch #0 {ExportException -> 0x0021, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:10:0x0011, B:12:0x0016, B:14:0x001c, B:18:0x0025, B:28:0x0049, B:21:0x0031, B:24:0x0038, B:27:0x0040, B:31:0x004d, B:33:0x0053, B:36:0x005d, B:38:0x0061, B:41:0x0068, B:44:0x0070, B:45:0x0072, B:48:0x0080), top: B:55:0x0001 }] */
    @Override // p.jca
    public final void I(long j, long j2) {
        boolean zF;
        boolean z;
        boolean zW;
        boolean z2;
        try {
            if (this.c1 && !this.W0 && d0()) {
                if (this.V0 != null) {
                    do {
                        zW = V() ? W() : false;
                        fmr fmrVar = this.V0;
                        gar garVar = this.b1;
                        if (fmrVar.f(garVar) && c0(garVar)) {
                            if (!e0(garVar)) {
                                Y(garVar);
                                this.V0.h(garVar);
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } while (zW | z2);
                    return;
                }
                if (V()) {
                    do {
                        gar garVarD = this.U0.d();
                        if (garVarD == null) {
                            z = false;
                        } else if (this.e1) {
                            zF = garVarD.f(4);
                            if (this.U0.e()) {
                                this.e1 = false;
                                this.W0 = zF;
                                z = !zF;
                            } else {
                                z = false;
                            }
                        } else if (!c0(garVarD)) {
                            z = false;
                        } else if (e0(garVarD)) {
                            z = true;
                        } else {
                            this.e1 = true;
                            zF = garVarD.f(4);
                            if (this.U0.e()) {
                                z = false;
                            } else {
                                this.e1 = false;
                                this.W0 = zF;
                                z = !zF;
                            }
                        }
                    } while (z);
                }
            }
        } catch (ExportException e) {
            this.c1 = false;
            this.a1.b(e);
        }
    }

    @Override // p.jca
    public final int R(ie30 ie30Var) {
        return jca.a(asj0.i(ie30Var.f66p) == this.b ? 4 : 0, 0, 0, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public final boolean V() throws ExportException {
        d541 d541VarE;
        if (this.U0 != null) {
            return true;
        }
        ie30 ie30VarB0 = this.Y0;
        if (ie30VarB0 != null) {
            d541VarE = this.a1.e(ie30VarB0);
            if (d541VarE != null) {
                this.U0 = d541VarE;
                return true;
            }
        } else {
            if (this.V0 == null || mue1.G(this.X0.f66p) != 1) {
                ie30VarB0 = b0(this.X0);
                this.Y0 = ie30VarB0;
            } else {
                fmr fmrVar = this.V0;
                fmrVar.g(false);
                ie30 ie30Var = fmrVar.j;
                if (ie30Var != null) {
                    ie30VarB0 = b0(ie30Var);
                    this.Y0 = ie30VarB0;
                }
            }
            d541VarE = this.a1.e(ie30VarB0);
            if (d541VarE != null) {
                this.U0 = d541VarE;
                return true;
            }
        }
        return false;
    }

    public abstract boolean W();

    public abstract void X(ie30 ie30Var);

    public final boolean c0(gar garVar) {
        w2z w2zVar = this.c;
        w2zVar.b();
        int iG = G(w2zVar, garVar, 0);
        if (iG == -5) {
            eg.m("Format changes are not supported.");
            return false;
        }
        if (iG != -4) {
            return false;
        }
        garVar.j();
        if (garVar.f(4)) {
            return true;
        }
        this.Z0.R(this.b, garVar.f);
        return true;
    }

    public final boolean d0() {
        ie30 ie30Var = this.X0;
        if (ie30Var == null || this.d1) {
            if (ie30Var == null) {
                w2z w2zVar = this.c;
                w2zVar.b();
                gar garVar = this.b1;
                int iG = G(w2zVar, garVar, 2);
                if (iG != -4 || !garVar.f(4)) {
                    if (iG == -5) {
                    }
                    return false;
                }
                ie30[] ie30VarArr = this.t;
                ie30VarArr.getClass();
                w2zVar.c = ie30VarArr[0];
                ie30 ie30Var2 = (ie30) w2zVar.c;
                ie30Var2.getClass();
                ie30 ie30VarA0 = a0(ie30Var2);
                this.X0 = ie30VarA0;
                Z(ie30VarA0);
                ie30 ie30Var3 = this.X0;
                if (ie30Var3 != null) {
                    this.d1 = this.a1.d(3, ie30Var3) && !f0(this.X0);
                }
                return false;
            }
            if (this.d1) {
                if (mue1.G(this.X0.f66p) != 2 || V()) {
                    X(this.X0);
                    this.d1 = false;
                }
                return false;
            }
        }
        return true;
    }

    public boolean e0(gar garVar) {
        if (garVar.f(4)) {
            return false;
        }
        long j = garVar.f - this.T0;
        garVar.f = j;
        if (this.V0 == null || j >= 0) {
            return false;
        }
        garVar.g();
        return true;
    }

    public boolean f0(ie30 ie30Var) {
        return false;
    }

    @Override // p.jca
    public final wjh0 h() {
        return this.Z0;
    }

    @Override // p.jca
    public final boolean t() {
        return this.W0;
    }

    @Override // p.jca
    public final boolean v() {
        return true;
    }

    @Override // p.jca
    public final void y(boolean z, boolean z2) {
        this.Z0.R(this.b, 0L);
    }

    public void Y(gar garVar) {
    }

    public void Z(ie30 ie30Var) {
    }

    public ie30 a0(ie30 ie30Var) {
        return ie30Var;
    }

    public ie30 b0(ie30 ie30Var) {
        return ie30Var;
    }
}
