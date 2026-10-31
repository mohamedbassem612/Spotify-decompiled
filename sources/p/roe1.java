package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class roe1 {
    public static final List a = p7h.M(new Integer[]{1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30});

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1963359338);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = nhe1.i;
                x340Var.s0(objT);
            }
            j0o1.b((i2 & 14) | 48, x340Var, (iu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 1);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1591673568);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            t1c.a(dug.f(i1p1.q(u291.r(nim0.a, 2.0f), er31.a), u7h.f, d4o1.a), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 2);
        }
    }

    public static final void c(nue1 nue1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        byte b;
        qim0 qim0Var2;
        long j;
        wat watVar;
        float f;
        long j2;
        int i2;
        xy31 xy31Var;
        Object obj;
        xy31 xy31Var2;
        int i3;
        Object tc1Var;
        yy31 yy31Var;
        qim0 qim0Var3;
        xtb0 xtb0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-491922001);
        int i4 = (x340Var2.i(nue1Var) ? 4 : 2) | i | 48;
        if (x340Var2.Y(i4 & 1, (i4 & 19) != 18)) {
            ejk1 ejk1Var = nue1Var.a;
            float f2 = ejk1Var.b;
            qim0 qim0Var4 = nim0.a;
            if (f2 <= 0.0f) {
                h311 h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new poe1(nue1Var, qim0Var4, i, (byte) 0);
                    return;
                }
                return;
            }
            wat watVar2 = (wat) x340Var2.k(t4k.h);
            x340Var2.i0(-290633397);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            float fX0 = watVar2.X0(6.0f);
            x340Var2.r(false);
            boolean zG = x340Var2.g(ejk1Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                long j3 = ejk1Var.a;
                if (f2 > 0.0f) {
                    j = 0;
                    if (ejk1Var.d - ejk1Var.c > 0) {
                        float f3 = j3;
                        float fB = ejk1Var.b() * f3;
                        float f4 = f3 / 60000.0f;
                        long j4 = 60000;
                        if (fX0 * f4 < fB) {
                            i2 = 1;
                            xy31Var = new xy31(((int) f4) + 1, 60000L, 1);
                            j2 = 60000;
                        } else {
                            long j5 = (long) f4;
                            long j6 = 2;
                            while (j6 < j5) {
                                long j7 = j4;
                                float f5 = ((j5 + j6) + 1) / 2.0f;
                                if ((f4 / f5) * fX0 < fB) {
                                    j5 = ((long) f5) - 1;
                                } else {
                                    j6 = (long) f5;
                                }
                                j4 = j7;
                            }
                            j2 = j4;
                            i2 = 1;
                            xy31Var = new xy31((int) ((f4 / j5) + 1.0f), ((long) ((int) j5)) * j2, 1);
                        }
                        long j8 = j3 / 1000;
                        if (j8 * fX0 <= fB) {
                            int i5 = ((int) j8) + i2;
                            f = f2;
                            watVar = watVar2;
                            xy31Var2 = new xy31(i5, 1000L, 60);
                        } else {
                            f = f2;
                            watVar = watVar2;
                            long j9 = j3 / j2;
                            e8 e8Var = new e8(fX0, fB / j9, (byte) 14);
                            List list = a;
                            int iJ = p7h.J(list, e8Var);
                            if (iJ <= 0) {
                                iJ = -(iJ + 1);
                            }
                            if (iJ >= 0 && iJ < list.size() && ((Number) e8Var.invoke(list.get(iJ))).intValue() > 0) {
                                iJ--;
                            }
                            if (iJ >= 0) {
                                int size = list.size() - 1;
                                if (iJ > size) {
                                    iJ = size;
                                }
                                obj = list.get(iJ);
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                long j10 = iIntValue;
                                xy31Var2 = new xy31((int) (((j8 % 60) / (60 / j10)) + (j9 * j10) + 1), j2 / j10, iIntValue);
                            } else {
                                xy31Var2 = null;
                            }
                        }
                        long j11 = xy31Var2 != null ? xy31Var2.a : xy31Var.a;
                        objT = new yy31((int) j11, xy31Var, xy31Var2, fB / j11, j3 / j11);
                    }
                    x340Var2.s0(objT);
                } else {
                    j = 0;
                }
                f = f2;
                watVar = watVar2;
                objT = new yy31(0, new xy31(0, j, 1), null, 0.0f, 0L);
                x340Var2.s0(objT);
            } else {
                f = f2;
                watVar = watVar2;
            }
            yy31 yy31Var2 = (yy31) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            float f6 = zjy.p(0.0f, new p3v(((wat) x340Var2.k(t4k.h)).N0((f - (0.3f * f)) / 2.0f))).a;
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            d161 d161Var = nue1Var.d;
            long j12 = nue1Var.b.a;
            if (d161Var instanceof z061) {
                i3 = 1;
            } else if (d161Var instanceof c161) {
                i3 = 2;
            } else {
                if (!(d161Var instanceof a161) && !(d161Var instanceof b161)) {
                    eg.o();
                    return;
                }
                i3 = 3;
            }
            Long lValueOf = Long.valueOf(j12);
            if (i3 == 1) {
                lValueOf = null;
            }
            ste1 ste1Var = new ste1(i3, lValueOf);
            boolean zE = x340Var2.e(l1d.C(i3)) | x340Var2.i(nue1Var) | x340Var2.g(yy31Var2) | x340Var2.g(ejk1Var) | x340Var2.i(ven0Var) | x340Var2.i(xtb0VarA);
            Object objT3 = x340Var2.T();
            if (zE || objT3 == m4cVar) {
                yy31Var = yy31Var2;
                qim0Var3 = qim0Var4;
                xtb0Var = xtb0VarA;
                tc1Var = new tc1(i3, nue1Var, yy31Var, ejk1Var, xtb0Var, ven0Var, (lnm) null, (byte) 28);
                x340Var2.s0(tc1Var);
            } else {
                qim0Var3 = qim0Var4;
                tc1Var = objT3;
                yy31Var = yy31Var2;
                xtb0Var = xtb0VarA;
            }
            qxd0.s(ste1Var, yy31Var, (vu30) tc1Var, x340Var2);
            float fN0 = watVar.N0(ejk1Var.b() * yy31Var.e);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var3);
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
            qim0 qim0VarC = u291.c(u291.h(qim0Var3, 10.0f), 1.0f);
            fra fraVar = een.N0;
            zzq0 zzq0VarH = uyn1.h(2, f6, 0.0f);
            boolean zG2 = x340Var2.g(yy31Var) | x340Var2.i(h2c.a) | x340Var2.d(fN0);
            Object objT4 = x340Var2.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new ef6(yy31Var, fN0, (byte) 7);
                x340Var2.s0(objT4);
            }
            b = 1;
            qim0Var2 = qim0Var3;
            ujo1.e(qim0VarC, xtb0Var, zzq0VarH, (c36) null, fraVar, (iq20) null, false, (hxq0) null, (iu30) objT4, x340Var2, 12582912, 344);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            b = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new poe1(nue1Var, qim0Var2, i, b);
        }
    }
}
