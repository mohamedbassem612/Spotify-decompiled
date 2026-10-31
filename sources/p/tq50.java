package p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tq50 extends cjl {
    public float u0 = -1.0f;
    public int v0 = -1;
    public int w0 = -1;
    public lhl x0 = this.K;
    public int y0 = 0;
    public boolean z0;

    public tq50() {
        this.S.clear();
        this.S.add(this.x0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.x0;
        }
    }

    @Override // p.cjl
    public final boolean C() {
        return this.z0;
    }

    @Override // p.cjl
    public final boolean D() {
        return this.z0;
    }

    @Override // p.cjl
    public final void V(yic0 yic0Var, boolean z) {
        if (this.V == null) {
            return;
        }
        lhl lhlVar = this.x0;
        yic0Var.getClass();
        int iN = yic0.n(lhlVar);
        if (this.y0 == 1) {
            this.a0 = iN;
            this.b0 = 0;
            O(this.V.m());
            T(0);
            return;
        }
        this.a0 = 0;
        this.b0 = iN;
        T(this.V.s());
        O(0);
    }

    public final void W(int i) {
        this.x0.l(i);
        this.z0 = true;
    }

    public final void X(int i) {
        lhl lhlVar;
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.y0 == 1) {
            lhlVar = this.J;
            this.x0 = lhlVar;
        } else {
            lhlVar = this.K;
            this.x0 = lhlVar;
        }
        arrayList.add(lhlVar);
        lhl[] lhlVarArr = this.R;
        int length = lhlVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            lhlVarArr[i2] = this.x0;
        }
    }

    @Override // p.cjl
    public final void c(yic0 yic0Var, boolean z) {
        djl djlVar = (djl) this.V;
        if (djlVar == null) {
            return;
        }
        Object objK = djlVar.k(2);
        Object objK2 = djlVar.k(4);
        cjl cjlVar = this.V;
        bjl bjlVar = bjl.b;
        boolean z2 = cjlVar != null && cjlVar.U[0] == bjlVar;
        if (this.y0 == 0) {
            objK = djlVar.k(3);
            objK2 = djlVar.k(5);
            cjl cjlVar2 = this.V;
            z2 = cjlVar2 != null && cjlVar2.U[1] == bjlVar;
        }
        if (this.z0) {
            lhl lhlVar = this.x0;
            if (lhlVar.c) {
                p6a1 p6a1VarK = yic0Var.k(lhlVar);
                yic0Var.d(p6a1VarK, this.x0.d());
                if (this.v0 != -1) {
                    if (z2) {
                        yic0Var.f(yic0Var.k(objK2), p6a1VarK, 0, 5);
                    }
                } else if (this.w0 != -1 && z2) {
                    p6a1 p6a1VarK2 = yic0Var.k(objK2);
                    yic0Var.f(p6a1VarK, yic0Var.k(objK), 0, 5);
                    yic0Var.f(p6a1VarK2, p6a1VarK, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            p6a1 p6a1VarK3 = yic0Var.k(this.x0);
            yic0Var.e(p6a1VarK3, yic0Var.k(objK), this.v0, 8);
            if (z2) {
                yic0Var.f(yic0Var.k(objK2), p6a1VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.w0 != -1) {
            p6a1 p6a1VarK4 = yic0Var.k(this.x0);
            p6a1 p6a1VarK5 = yic0Var.k(objK2);
            yic0Var.e(p6a1VarK4, p6a1VarK5, -this.w0, 8);
            if (z2) {
                yic0Var.f(p6a1VarK4, yic0Var.k(objK), 0, 5);
                yic0Var.f(p6a1VarK5, p6a1VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.u0 != -1.0f) {
            p6a1 p6a1VarK6 = yic0Var.k(this.x0);
            p6a1 p6a1VarK7 = yic0Var.k(objK2);
            float f = this.u0;
            c46 c46VarL = yic0Var.l();
            c46VarL.d.g(p6a1VarK6, -1.0f);
            c46VarL.d.g(p6a1VarK7, f);
            yic0Var.c(c46VarL);
        }
    }

    @Override // p.cjl
    public final boolean d() {
        return true;
    }

    @Override // p.cjl
    public final void h(cjl cjlVar, HashMap map) {
        super.h(cjlVar, map);
        tq50 tq50Var = (tq50) cjlVar;
        this.u0 = tq50Var.u0;
        this.v0 = tq50Var.v0;
        this.w0 = tq50Var.w0;
        X(tq50Var.y0);
    }

    @Override // p.cjl
    public final lhl k(int i) {
        int iC = l1d.C(i);
        if (iC != 1) {
            if (iC != 2) {
                if (iC != 3) {
                    if (iC != 4) {
                        return null;
                    }
                }
            }
            if (this.y0 == 0) {
                return this.x0;
            }
            return null;
        }
        if (this.y0 == 1) {
            return this.x0;
        }
        return null;
    }
}
