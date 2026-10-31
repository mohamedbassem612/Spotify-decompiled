package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ihg extends i6 {
    public hav0 k1;
    public oa80 l1;

    @Override // p.i6, p.mav0
    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        super.D0(bav0Var, cav0Var, j);
        if (cav0Var != cav0.b) {
            if (cav0Var == cav0.c) {
                if (this.k1 != null) {
                    List list = bav0Var.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        hav0 hav0Var = (hav0) list.get(i);
                        if (hav0Var.l() && hav0Var != this.k1) {
                            Y1(false);
                            break;
                        }
                    }
                }
                if (u7n0.v(this.a1, "recognized")) {
                    this.a1 = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.k1 == null) {
            if (rqd1.e(bav0Var, true)) {
                hav0 hav0Var2 = (hav0) bav0Var.a.get(0);
                hav0Var2.a();
                this.k1 = hav0Var2;
                if (this.V0) {
                    this.a1 = "waiting";
                    Q1(hav0Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = bav0Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!p8p1.j((hav0) list2.get(i2))) {
                long jM1 = M1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    hav0 hav0Var3 = (hav0) list2.get(i3);
                    if (hav0Var3.l() || p8p1.w(hav0Var3, j, jM1)) {
                        Y1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((hav0) list2.get(0)).a();
        if (this.V0) {
            this.a1 = "recognized";
            hav0 hav0Var4 = this.k1;
            hav0Var4.getClass();
            O1(hav0Var4.e(), false);
            V1();
        }
        this.k1 = null;
    }

    @Override // p.mav0
    public final void K0() {
        dy60 dy60Var;
        idn0 idn0Var = this.Q0;
        if (idn0Var != null && (dy60Var = this.d1) != null) {
            idn0Var.a(new ey60(dy60Var));
        }
        this.d1 = null;
        Y1(false);
    }

    public final void Y1(boolean z) {
        if (z) {
            this.l1 = null;
        } else {
            this.k1 = null;
        }
        N1(z);
        this.a1 = "idle";
    }

    @Override // p.va80
    public final void Z0() {
        Y1(true);
    }

    @Override // p.va80
    public final void r(mgc mgcVar, cav0 cav0Var) {
        R1();
        if (this.V0 && this.Z0 == null) {
            rj40 rj40VarX = crm0.x(this);
            H1(rj40VarX);
            this.Z0 = rj40VarX;
        }
        if (cav0Var != cav0.b) {
            if (cav0Var == cav0.c) {
                if (this.l1 != null) {
                    List listT = mgcVar.t();
                    int size = listT.size();
                    for (int i = 0; i < size; i++) {
                        oa80 oa80Var = (oa80) ((ArrayList) listT).get(i);
                        if (oa80Var.d() && oa80Var != this.l1) {
                            Y1(true);
                            break;
                        }
                    }
                }
                if (u7n0.v(this.a1, "recognized")) {
                    this.a1 = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.l1 == null) {
            List listT2 = mgcVar.t();
            int size2 = listT2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (d5p1.i((oa80) ((ArrayList) listT2).get(i2))) {
                    oa80 oa80Var2 = (oa80) ((ArrayList) mgcVar.t()).get(0);
                    oa80Var2.a();
                    this.l1 = oa80Var2;
                    if (this.V0) {
                        this.a1 = "waiting";
                        P1(oa80Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        List listT3 = mgcVar.t();
        int size3 = listT3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (!bin.n((oa80) ((ArrayList) listT3).get(i3))) {
                float fG = ((e8k1) lcc.z(this, t4k.t)).g();
                List listT4 = mgcVar.t();
                int size4 = listT4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    oa80 oa80Var3 = (oa80) ((ArrayList) listT4).get(i4);
                    long jB = oa80Var3.b();
                    oa80 oa80Var4 = this.l1;
                    oa80Var4.getClass();
                    boolean z = Math.abs(Offset.d(Offset.f(jB, oa80Var4.b()))) > fG;
                    if (oa80Var3.d() || z) {
                        Y1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((oa80) ((ArrayList) mgcVar.t()).get(0)).a();
        if (this.V0) {
            this.a1 = "recognized";
            oa80 oa80Var5 = this.l1;
            oa80Var5.getClass();
            O1(oa80Var5.b(), true);
            V1();
        }
        this.l1 = null;
    }
}
