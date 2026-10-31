package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class xd20 {
    public static final bby a = xay.e(2, irn1.l0(1.0f, 200.0f, (Object) null, 4));
    public static final float b = 8.0f;

    public static final void a(ed20 ed20Var, iu30 iu30Var, qim0 qim0Var, vzq0 vzq0Var, boolean z, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vzq0 vzq0Var2;
        boolean z2;
        ad20 ad20Var;
        yc20 yc20Var;
        yc20 yc20Var2;
        yc20 yc20Var3;
        ed20 ed20Var2 = ed20Var;
        m4c m4cVar = fkj0.X;
        dd20 dd20Var = ed20Var2.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1630331725);
        int i2 = (i & 6) == 0 ? i | (x340Var.g(ed20Var2) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 28032;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            float f = b;
            vzq0 zzq0Var = new zzq0(f, 0.0f, f, 0.0f);
            String strO0 = cwl1.o0(x340Var, 2131956005);
            es41 es41VarC = l6o1.C(0, 6, 0, x340Var);
            p811 p811Var = new p811();
            x340Var.i0(1722992213);
            x340Var.r(false);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarW = uyn1.w(u291.j(48.0f, 0.0f, 2, qim0Var3).then(l6o1.t(qim0Var3, es41VarC, 14)), zzq0Var);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new kq00(strO0, (byte) 18);
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("FilterRow", f8d1.b(s161.b(qim0VarW, false, (iu30) objT), rih1.a, new ae4(p811Var, (byte) 2)));
            jw31 jw31VarA = ew31.a(new d36(f, true, new um5(false)), een.Z, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ad20 ad20Var2 = ad20.a;
            boolean zEquals = dd20Var.equals(ad20Var2);
            jwb0 jwb0Var = jwb0.b;
            jwb0 jwb0Var2 = !zEquals ? jwb0.a : jwb0Var;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(jwb0Var2);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zE = x340Var.e(jwb0Var2.ordinal());
            Object objT3 = x340Var.T();
            if (zE || objT3 == m4cVar) {
                objT3 = new h210(jwb0Var2, ven0Var, (lnm) null, (byte) 8);
                x340Var.s0(objT3);
            }
            qxd0.t(jwb0Var2, x340Var, (vu30) objT3);
            if (jwb0Var2 != jwb0Var) {
                x340Var.i0(1575703529);
                jwb0 jwb0Var3 = (jwb0) ven0Var.getValue();
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = vd20.b;
                    x340Var.s0(objT4);
                }
                yc20Var = null;
                ad20Var = ad20Var2;
                hm5.a(jwb0Var3, (qim0) null, (iu30) objT4, (tl3) null, "Clear/More button animation", (iu30) null, apo.r(1111985342, new t7i(iu30Var, (byte) 4), x340Var), x340Var, 1597824, 42);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                ad20Var = ad20Var2;
                yc20Var = null;
                x340Var.i0(1576480017);
                x340Var.r(false);
            }
            if (dd20Var.equals(ad20Var)) {
                yc20Var3 = yc20Var;
            } else {
                if (dd20Var instanceof cd20) {
                    yc20Var2 = ((cd20) dd20Var).a;
                } else {
                    if (!(dd20Var instanceof bd20)) {
                        eg.o();
                        return;
                    }
                    yc20Var2 = ((bd20) dd20Var).a;
                }
                yc20Var3 = yc20Var2;
            }
            x340Var.i0(-1057514309);
            for (yc20 yc20Var4 : ed20Var2.a) {
                boolean zJ = u890.j(yc20Var4.c, yc20Var3 != null ? yc20Var3.c : yc20Var);
                boolean z3 = zJ || yc20Var3 == null;
                x340Var.f0(-563614353, yc20Var4.c);
                fq7.f(z3, hxo1.l(), a, ln00.b, (String) null, apo.r(686208655, new tf(ed20Var2, yc20Var4, zJ, iu30Var, (byte) 11), x340Var), x340Var, 1575942, 16);
                x340Var.r(false);
                ed20Var2 = ed20Var;
            }
            x340Var.r(false);
            x340Var.r(true);
            z2 = true;
            vzq0Var2 = zzq0Var;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            vzq0Var2 = vzq0Var;
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(ed20Var, iu30Var, qim0Var2, vzq0Var2, z2, i, (byte) 14);
        }
    }

    public static final void b(yc20 yc20Var, boolean z, boolean z2, c9 c9Var, zc20 zc20Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1415275023);
        int i2 = i | (b0kVar2.g(yc20Var) ? 4 : 2) | (b0kVar2.h(z) ? 32 : 16) | (b0kVar2.h(z2) ? 256 : 128) | (b0kVar2.g(c9Var) ? 2048 : 1024) | (b0kVar2.g(zc20Var) ? 16384 : 8192) | (b0kVar2.i(iu30Var) ? 131072 : 65536) | 1572864;
        if (b0kVar2.Y(i2 & 1, (599187 & i2) != 599186)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str = yc20Var.d;
            boolean z3 = yc20Var.e == 2;
            qim0 qim0VarN = anm1.N("PrimaryFilter", lrn1.x(qim0Var3, 1.0f));
            int i3 = i2 & 112;
            boolean z4 = (i3 == 32) | ((458752 & i2) == 131072) | ((i2 & 14) == 4);
            Object objT = b0kVar2.T();
            if (z4 || objT == fkj0.X) {
                objT = new vm1(z, iu30Var, yc20Var, (byte) 10);
                b0kVar2.s0(objT);
            }
            g0p1.h(((i2 << 3) & 7168) | i3 | 384, str, (Function0) objT, (fe5) null, b0kVar2, qim0VarN, (idn0) null, z, false, z2, z3);
            b0kVar2 = b0kVar2;
            fq7.f(z, qim0Var3, a.a(xay.n(3, (iu30) null)), ln00.b, (String) null, apo.r(1798399029, new hh1((Object) c9Var, (Object) zc20Var, z2, (Object) iu30Var, (Object) yc20Var, (byte) 4), b0kVar2), b0kVar2, 1576326 | i3, 16);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(yc20Var, z, z2, c9Var, zc20Var, iu30Var, qim0Var2, i);
        }
    }
}
