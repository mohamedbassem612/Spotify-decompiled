package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q87 {
    public static final ceo f = new ceo(0.51f, 0.0f, 0.26f, 1.0f);
    public final km3 a;
    public final b87 b;
    public final i87 c;
    public final br0 d;
    public final poj0 e;

    public q87(km3 km3Var, b87 b87Var, i87 i87Var, br0 br0Var, poj0 poj0Var) {
        this.a = km3Var;
        this.b = b87Var;
        this.c = i87Var;
        this.d = br0Var;
        this.e = poj0Var;
    }

    public final void a(rb7 rb7Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        ja7 ja7Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(107710548);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(rb7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (!rb7Var.f58p) {
                ja7Var = ja7.d;
            } else if (rb7Var.q) {
                ja7Var = ja7.c;
            } else if (rb7Var.b().isEmpty()) {
                ja7Var = ja7.a;
            } else {
                List listB = rb7Var.b();
                if (!(listB instanceof Collection) || !listB.isEmpty()) {
                    Iterator it = listB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            Set set = s4b1.f;
                            if (!uic.g(str, blc0.fh)) {
                                ja7Var = ja7.a;
                            }
                        }
                    }
                }
                ja7Var = ja7.b;
            }
            x340Var.f0(430625600, ja7Var);
            otw.c(this.d, new ia7(ja7Var), uyn1.w(nim0.a, vzq0Var), (ipb1) null, x340Var, 0, 8);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx((Object) this, (Object) rb7Var, (Object) vzq0Var, i, (byte) 18);
        }
    }

    public final void b(c380 c380Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1378792269);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarE = dug.e(qim0Var, v9c.s(c380Var, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, y580.Y);
            xu30Var.invoke(pbh.a, x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, this, c380Var, qim0Var, xu30Var, (byte) 15);
        }
    }

    public final void c(rb7 rb7Var, iu30 iu30Var, axq0 axq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        h311 h311VarV;
        n87 n87Var;
        c9 c9Var = rb7Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-152808686);
        int i2 = i | (x340Var.i(rb7Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(axq0Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ListIterator listIterator = c9Var.listIterator(0);
            int i3 = 0;
            while (true) {
                if (!listIterator.hasNext()) {
                    i3 = -1;
                    break;
                } else if (u890.j(((yrd) listIterator.next()).e, rb7Var.c)) {
                    break;
                } else {
                    i3++;
                }
            }
            Integer numValueOf = Integer.valueOf(i3);
            if (i3 == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                yrd yrdVar = (yrd) c9Var.get(iIntValue);
                x340Var.f0(-820242087, numValueOf);
                otw.c(this.b, new o77(yrdVar, rb7Var.a, iIntValue, rb7Var.b(), rb7Var.b, rb7Var.h, rb7Var.i, rb7Var.j, rb7Var.k, rb7Var.l, rb7Var.m, rb7Var.n, rb7Var.o, axq0Var, iu30Var), qim0Var, (ipb1) null, x340Var, (i2 >> 3) & 896, 8);
                x340Var.r(false);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    n87Var = new n87(this, rb7Var, iu30Var, axq0Var, qim0Var, i, (byte) 1);
                }
            }
            h311VarV.d = n87Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            n87Var = new n87(this, rb7Var, iu30Var, axq0Var, qim0Var, i, (byte) 0);
            h311VarV.d = n87Var;
        }
    }

    public final void d(rb7 rb7Var, iu30 iu30Var, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        qim0 qim0Var2;
        q87 q87Var = this;
        iu30 iu30Var2 = iu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(362527228);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(rb7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= x340Var.i(q87Var) ? 16384 : 8192;
        }
        int i6 = i5;
        if (x340Var.Y(i6 & 1, (i6 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            long jB = u7h.b(cbx.a(x340Var).a.c, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            j2i j2iVarR = apo.r(-895112919, new xx((Object) q87Var, (Object) iu30Var2, (Object) rb7Var, i4, (byte) 19), x340Var);
            q87Var = this;
            iu30Var2 = iu30Var;
            j2i j2iVarR2 = apo.r(-1131730744, new p87(q87Var, jB, j, iu30Var), x340Var);
            j2i j2iVarR3 = apo.r(-1552066013, new n891(rb7Var, q87Var, iu30Var2, (byte) 21), x340Var);
            int i7 = ((i6 >> 9) & 14) | 25008;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVarR, j2iVarR2, (erl1) null, j2iVarR3, x340Var, i7, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(q87Var, rb7Var, iu30Var2, i, qim0Var2, i2, (byte) 5);
        }
    }

    public final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-914334565);
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var2, 2131952523);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarJ, cr31Var);
            avw0 avw0Var = cbx.b(x340Var2).c;
            qim0 qim0VarF2 = dug.f(d1u.E(1.0f, cbx.a(x340Var2).a.b.a(), qim0VarQ, cr31Var), cbx.a(x340Var2).a.a.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF2);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            y7e1 y7e1VarD = c4p1.D(0, 3, (String) null, x340Var2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            long j = cbx.a(x340Var2).b.a;
            long j2 = cbx.a(x340Var2).b.a;
            long j3 = cbx.a(x340Var2).b.d;
            long j4 = cbx.a(x340Var2).b.a;
            long j5 = ((vex) zex.a.e).a;
            zxx zxxVar = new zxx(j, j2, j4, j3, j5, j5, cbx.a(x340Var2).b.c, 0L, 896);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            rwo1.b(y7e1VarD, qim0VarF3, (max) null, strO0, i7i.a, (vu30) null, true, false, (dk80) null, cbx.d(x340Var2).g, (kua0) null, (yta0) null, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), 0.0f, false, zxxVar, x340Var2, 1597440, 0, 912804);
            x340Var = x340Var2;
            qim0 qim0VarB = h2c.a.b(nim0Var);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new wk3(strO0, (byte) 15);
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT);
            boolean z = (i2 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new lj2(function0, (byte) 16);
                x340Var.s0(objT2);
            }
            t1c.a(bin.x(qim0VarB2, false, strO0, (pm31) null, (idn0) null, (Function0) objT2, 13), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6((Object) this, (Object) function0, (Object) qim0Var, i, (byte) 3);
        }
    }
}
