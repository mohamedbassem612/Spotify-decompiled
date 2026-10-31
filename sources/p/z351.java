package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class z351 {
    public static final cr31 a = er31.b(4.0f);
    public static final float b = 32.0f;

    public static final void a(int i, String str, String str2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        iu30 iu30Var2;
        Throwable th;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1497708655);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            int i4 = i3 & 14;
            y7e1 y7e1VarD = c4p1.D(i4, 2, str, x340Var);
            String strO0 = cwl1.o0(x340Var, 2131957312);
            boolean zG = x340Var.g(k6a1Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new td11(lz20Var, k6a1Var, null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            int i5 = i3 & 896;
            boolean zG2 = (i4 == 4) | x340Var.g(y7e1VarD) | (i5 == 256);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                n641 n641Var = new n641(str, y7e1VarD, iu30Var, null, (byte) 14);
                iu30Var2 = iu30Var;
                th = null;
                x340Var.s0(n641Var);
                objT3 = n641Var;
            } else {
                th = null;
                iu30Var2 = iu30Var;
            }
            qxd0.t(y7e1VarD, x340Var, (vu30) objT3);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 12.0f, 16.0f, 16.0f, 12.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z = i5 == 256;
            Object objT4 = x340Var.T();
            if (z || objT4 == m4cVar) {
                objT4 = new wg31(iu30Var2, (byte) 14);
                x340Var.s0(objT4);
            }
            wro1.h(new gbx(z50.c, (Function0) objT4), ldx.c, anm1.N("search_header_back_button", nim0.a), (max) null, yla.r(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, wej.a, x340Var, 432, 6, 984);
            qim0 qim0VarB = u291.b(0.0f, b, 1, new wnb0(1.0f, true));
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("search_header_input", vby0.p(i1p1.q(uyn1.B(qim0VarB, 8.0f, 0.0f, 0.0f, 0.0f, 14), a), lz20Var));
            boolean zG3 = x340Var.g(y7e1VarD) | x340Var.g(strO0);
            Object objT5 = x340Var.T();
            if (zG3 || objT5 == m4cVar) {
                objT5 = new x351(y7e1VarD, strO0);
                x340Var.s0(objT5);
            }
            qim0 qim0VarB2 = s161.b(qim0VarN, false, (iu30) objT5);
            lee1 lee1Var = cbx.d(x340Var).k;
            zxx zxxVar = new zxx(cbx.a(x340Var).b.a, cbx.a(x340Var).b.a, cbx.a(x340Var).b.b, cbx.a(x340Var).b.d, cbx.a(x340Var).a.b.a(), cbx.a(x340Var).a.b.a(), cbx.a(x340Var).b.c, 0L, 896);
            cvx cvxVar6 = cbx.b(x340Var).b;
            zzq0 zzq0VarJ = uyn1.j(8.0f, 0.0f, 0.0f, 0.0f, 14);
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 3, 119);
            boolean zG4 = x340Var.g(k6a1Var);
            Object objT6 = x340Var.T();
            if (zG4 || objT6 == m4cVar) {
                objT6 = new y351(k6a1Var, (byte) 0);
                x340Var.s0(objT6);
            }
            rwo1.b(y7e1VarD, qim0VarB2, (max) null, str2, (vu30) null, apo.r(-1004293576, new ey7(y7e1VarD, iu30Var, (byte) 2), x340Var), false, false, (dk80) null, lee1Var, kua0Var, (yta0) objT6, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, zzq0VarJ, 0.0f, false, zxxVar, x340Var, ((i3 << 6) & 7168) | 196608, 100663686, 647636);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, str, str2, iu30Var, qim0Var, (byte) 7);
        }
    }
}
