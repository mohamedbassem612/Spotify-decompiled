package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x451 {
    public static final ceo a = new ceo(0.51f, 0.0f, 0.26f, 1.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(t451 t451Var, Function0 function0, iu30 iu30Var, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        byte b;
        Function0 function2 = function0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1671388928);
        j06 j06Var = x340Var2.a;
        int i2 = (i & 6) == 0 ? (x340Var2.g(t451Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            k6a1 k6a1Var = (k6a1) x340Var2.k(t4k.q);
            lz20 lz20Var = new lz20();
            Object[] objArr = new Object[0];
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new l451(t451Var, (byte) 1);
                x340Var2.s0(objT);
            }
            y7e1 y7e1VarD = c4p1.D(0, 2, (String) k5p1.s(objArr, (Function0) objT, x340Var2, 0), x340Var2);
            x340Var2.i0(-112994874);
            String strO0 = t451Var.b;
            if (strO0.length() == 0) {
                strO0 = cwl1.o0(x340Var2, 2131952511);
            }
            x340Var2.r(false);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).a.c;
            long jB = u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            tr80 tr80Var = new tr80(0, 20, 1);
            ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
            lr80 it = tr80Var.iterator();
            while (((sr80) it).c) {
                arrayList.add(Float.valueOf(a.a(it.nextInt() / 20.0f)));
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
                arrayList2.add(new u7h(z4p1.A(((Number) it2.next()).floatValue(), jB, j)));
            }
            c9 c9VarF = mqo1.F(arrayList2);
            boolean zG = x340Var2.g(lz20Var) | x340Var2.g(k6a1Var);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new td11(lz20Var, k6a1Var, (lnm) null, (byte) 2);
                x340Var2.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var2, (vu30) objT2);
            boolean zG2 = x340Var2.g(y7e1VarD) | ((i3 & 896) == 256);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new qy5(y7e1VarD, iu30Var, (lnm) null, (byte) 12);
                x340Var2.s0(objT3);
            }
            qxd0.t(y7e1VarD, x340Var2, (vu30) objT3);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarE = dug.e(too1.y(qim0VarF, lhc.g(x340Var2).c), v9c.s(c9VarF, 0.0f, 0.0f, 14), null, 0.0f, 6);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, uyn1.x(qim0VarE, 16.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarP);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            mta mtaVar = cbx.b(x340Var2).d;
            String str = strO0;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF2);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarJ, cr31Var);
            long jA = cbx.a(x340Var2).a.b.a();
            avw0 avw0Var = cbx.b(x340Var2).c;
            qim0 qim0VarF3 = dug.f(d1u.E(1.0f, jA, qim0VarQ, cr31Var), cbx.a(x340Var2).a.a.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            qim0 qim0VarP2 = vby0.p(anm1.N("search_input_field", u291.f(qim0Var2, 1.0f)), lz20Var);
            boolean z3 = (i3 & 7168) == 2048;
            Object objT4 = x340Var2.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new hii0(function1, (byte) 20);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarG = cev0.G(qim0VarP2, (iu30) objT4);
            lee1 lee1Var = cbx.d(x340Var2).g;
            long j2 = cbx.a(x340Var2).b.a;
            long j3 = cbx.a(x340Var2).b.a;
            long j4 = cbx.a(x340Var2).b.d;
            long j5 = cbx.a(x340Var2).b.b;
            long j6 = u7h.j;
            qim0Var = qim0Var2;
            zxx zxxVar = new zxx(j2, j3, j5, j4, j6, j6, cbx.a(x340Var2).b.c, 0L, 896);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 3, 119);
            boolean zG3 = x340Var2.g(k6a1Var);
            Object objT5 = x340Var2.T();
            if (zG3 || objT5 == m4cVar) {
                b = 1;
                objT5 = new y351(k6a1Var, (byte) 1);
                x340Var2.s0(objT5);
            } else {
                b = 1;
            }
            function2 = function0;
            boolean z4 = b;
            rwo1.b(y7e1VarD, qim0VarG, null, str, zej.a, apo.r(2030181841, new t251(y7e1VarD, function2, b), x340Var2), false, false, null, lee1Var, kua0Var, (yta0) objT5, null, null, null, null, null, zzq0Var, 0.0f, false, zxxVar, x340Var2, 221184, 6, 913860);
            x340Var = x340Var2;
            x340Var.r(z4);
            x340Var.r(z4);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(t451Var, function2, iu30Var, function1, qim0Var3, i, (byte) 29);
        }
    }
}
