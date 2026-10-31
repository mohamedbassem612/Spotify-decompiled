package p;

import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class mez0 {
    public static final List[] a = {z6x.a, Collections.singletonList(1), Collections.singletonList(2), Collections.singletonList(3), p7h.M(new Integer[]{2, 2}), p7h.M(new Integer[]{2, 3}), p7h.M(new Integer[]{3, 3})};

    public static final void a(int i, qim0 qim0Var, vzq0 vzq0Var, float f, j2i j2iVar, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        vzq0 vzq0Var2;
        float f2;
        float f3;
        vzq0 vzq0Var3;
        qim0 qim0Var3;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1960119412);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | 1200;
        boolean z = false;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            int i4 = i2 & 1;
            qim0 qim0Var4 = nim0.a;
            if (i4 == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                f3 = 8.0f;
                vzq0 vzq0VarJ = uyn1.j(8.0f, 8.0f, 8.0f, 0.0f, 8);
                cvx cvxVar4 = cbx.b(x340Var).b;
                vzq0Var3 = vzq0VarJ;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                vzq0Var3 = vzq0Var;
                f3 = f;
            }
            x340Var.s();
            List[] listArr = a;
            int length = listArr.length - 1;
            if (i <= length) {
                length = i;
            }
            List list = listArr[length];
            qim0 qim0VarW = uyn1.w(qim0Var3, vzq0Var3);
            mbh mbhVarA = jbh.a(new d36(f3, true, new um5(false)), een.P0, x340Var, 0);
            float f4 = f3;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            x340Var.i0(-837663564);
            Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                qim0 qim0VarD = sgc1.D(2, qim0Var4);
                um5 um5Var = new um5(z);
                float f5 = f4;
                Iterator it2 = it;
                jw31 jw31VarA = ew31.a(new d36(f5, true, um5Var), een.Z, x340Var, 0);
                int i6 = i5;
                qim0 qim0Var5 = qim0Var3;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                x340Var.i0(1042413747);
                int i7 = i6;
                int i8 = 0;
                while (i8 < iIntValue) {
                    qim0 qim0VarC = u291.c(new wnb0(1.0f, true), 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int i9 = i8;
                    int i10 = i7;
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarC);
                    hzj.A.getClass();
                    x340Var.m0();
                    qim0 qim0Var6 = qim0Var5;
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar4);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var, lljVar2);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar);
                    j2iVar.invoke(Integer.valueOf(i10), x340Var, 48);
                    x340Var.r(true);
                    i7 = i10 + 1;
                    i8 = i9 + 1;
                    qim0Var5 = qim0Var6;
                }
                qim0 qim0Var7 = qim0Var5;
                x340Var.r(false);
                x340Var.r(true);
                it = it2;
                i5 = i7;
                f4 = f5;
                z = false;
                qim0Var3 = qim0Var7;
            }
            x340Var.r(z);
            x340Var.r(true);
            vzq0Var2 = vzq0Var3;
            f2 = f4;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            vzq0Var2 = vzq0Var;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f61(i, qim0Var2, vzq0Var2, f2, j2iVar, i2);
        }
    }

    public static final void b(qim0 qim0Var, vzq0 vzq0Var, float f, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vzq0 vzq0Var2;
        float f2;
        float f3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1658560365);
        int i2 = i | 1200;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                vzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0Var = nim0.a;
                f3 = 8.0f;
            } else {
                x340Var.b0();
                f3 = f;
            }
            qim0 qim0Var3 = qim0Var;
            vzq0 vzq0Var3 = vzq0Var;
            x340Var.s();
            ViewGroup viewGroup = (ViewGroup) x340Var.k(AndroidCompositionLocals_androidKt.f);
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            boolean zG = x340Var.g(vzq0Var3) | x340Var.d(f3) | x340Var.g(es41VarC) | x340Var.i(viewGroup);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                j40 j40Var = new j40(vzq0Var3, f3, qim0Var3, es41VarC, viewGroup, j2iVar);
                x340Var.s0(j40Var);
                objT = j40Var;
            }
            ejo1.l(6, 0, x340Var, (vu30) objT, qim0Var3);
            vzq0Var2 = vzq0Var3;
            f2 = f3;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            vzq0Var2 = vzq0Var;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys(qim0Var2, vzq0Var2, f2, j2iVar, i);
        }
    }
}
