package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class htj0 {
    public static final vq60 a = new vq60(m2j0.t);

    public static final void a(vnr0 vnr0Var, tob1 tob1Var, qim0 qim0Var, b0k b0kVar, int i) {
        long j;
        vnr0 vnr0VarA = vnr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1408867717);
        int i2 = i | (x340Var.i(vnr0VarA) ? 4 : 2) | (x340Var.g(tob1Var) ? 32 : 16) | (x340Var.e(3) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            u7h u7hVar = tob1Var != null ? (u7h) tob1Var.getValue() : null;
            if (u7hVar != null) {
                long j2 = u7hVar.a;
                ior0 ior0VarF = vnr0VarA.c;
                if (ior0VarF instanceof ior0) {
                    ior0 ior0Var = ior0VarF;
                    List<mor0> list = ior0Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (mor0 mor0Var : list) {
                        long j3 = j2;
                        arrayList.add(new mor0(mor0Var.a, zma1.a(mor0Var.b, j3, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534)));
                        j2 = j3;
                    }
                    j = j2;
                    ior0VarF = ior0.f(ior0Var, arrayList, (cjc0) null, 14);
                } else {
                    j = j2;
                    if (!(ior0VarF instanceof jor0)) {
                        eg.o();
                        return;
                    }
                }
                vnr0VarA = vnr0.a(vnr0VarA, null, null, ior0VarF, j, 19);
            }
            qgo1.f(vnr0VarA, qim0Var, new a0e1(3), 0, false, null, x340Var, ((i2 >> 6) & 112) | 8 | (i2 & 896), 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(vnr0Var, tob1Var, qim0Var, i, (byte) 21);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1437261063);
        int i2 = (x340Var.d(8.0f) ? 256 : 128) | (x340Var.d(8.0f) ? 4 : 2) | i | (x340Var.d(16.0f) ? 32 : 16) | (x340Var.d(16.0f) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new kcx((byte) 2, z);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rbh(z, qim0Var, j2iVar, i, (byte) 4);
        }
    }

    public static final void c(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-748210267);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = td4.i;
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new klb((byte) 7, i, j2iVar, qim0Var);
        }
    }
}
