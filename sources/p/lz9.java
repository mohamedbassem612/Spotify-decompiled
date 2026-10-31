package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lz9 implements jsw {
    public final /* synthetic */ byte a;
    public final g2z b;

    public /* synthetic */ lz9(g2z g2zVar, byte b) {
        this.a = b;
        this.b = g2zVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final /* bridge */ /* synthetic */ void a(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) throws NoWhenBranchMatchedException {
        switch (this.a) {
            case 0:
                i((b0a) obj, iu30Var, kswVar, b0kVar, i);
                break;
            case 1:
                j((ywy) obj, iu30Var, kswVar, b0kVar, i);
                break;
            case 2:
                k((h7n0) obj, iu30Var, kswVar, b0kVar, i);
                break;
            default:
                l((bhb1) obj, iu30Var, kswVar, b0kVar, i);
                break;
        }
    }

    public void c(b0a b0aVar, xwa xwaVar, xwa xwaVar2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        xwa xwaVar3;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-174087928);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(b0aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(xwaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xwaVar3 = xwaVar2;
            i2 |= x340Var.g(xwaVar3) ? 256 : 128;
        } else {
            xwaVar3 = xwaVar2;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            jlw0 jlw0Var = b0aVar.d;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = g2z.x(this.b, xwaVar, 3);
                x340Var.s0(objT);
            }
            ka71 ka71Var = (ka71) objT;
            llw0 llw0Var = (llw0) b0aVar.c.get(b0aVar.b);
            int iC = l1d.C(b0aVar.e);
            if (iC == 0) {
                i3 = 2;
            } else if (iC == 1) {
                i3 = 1;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i3 = 3;
            }
            z971 z971Var = new z971(llw0Var, i3, jlw0Var != null ? 1 : 2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gra graVar = een.h;
            h2c h2cVar = h2c.a;
            int i4 = i2;
            otw.c(ka71Var, z971Var, h2cVar.a(qim0VarD, graVar), (ipb1) null, x340Var, 0, 8);
            if (jlw0Var == null) {
                x340Var.i0(-1023492515);
                x340Var.r(false);
            } else {
                x340Var.i0(-1023492514);
                und.a(xwaVar3, h2cVar.a(nim0Var, graVar), 0.0f, apo.r(1774559017, new kz9(jlw0Var, (byte) 0), x340Var), x340Var, ((i4 >> 6) & 14) | 3072, 4);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 14, i, (Object) this, (Object) b0aVar, (Object) xwaVar, (Object) xwaVar2, (Object) qim0Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void d(ywy ywyVar, xwa xwaVar, xwa xwaVar2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1139839577);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ywyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(xwaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(xwaVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(this) ? 131072 : 65536;
        }
        if (!x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.b0();
        } else if (ywyVar instanceof uwy) {
            x340Var.i0(-169164552);
            uwy uwyVar = (uwy) ywyVar;
            h(uwyVar.a, uwyVar.b, uwyVar.c, iu30Var, qim0Var2, x340Var, i2 & 523264);
            x340Var = x340Var;
            x340Var.r(false);
            qim0Var2 = qim0Var;
        } else if (ywyVar instanceof wwy) {
            x340Var.i0(-169156744);
            int i3 = i2 & 1022;
            int i4 = i2 >> 3;
            qim0Var2 = qim0Var;
            e((wwy) ywyVar, xwaVar, xwaVar2, qim0Var2, x340Var, i3 | (i4 & 7168) | (i4 & 57344));
            x340Var.r(false);
        } else {
            qim0Var2 = qim0Var;
            if (!(ywyVar instanceof xwy)) {
                throw p3d1.k(x340Var, -169165714, false);
            }
            x340Var.i0(-169149352);
            g(qim0Var2, x340Var, (i2 >> 12) & 126);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(this, ywyVar, xwaVar, xwaVar2, iu30Var, qim0Var2, i, (byte) 17);
        }
    }

    public void e(wwy wwyVar, xwa xwaVar, xwa xwaVar2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(750442030);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wwyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(xwaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(xwaVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            z4p1.c(wwyVar, this.b, xwaVar, xwaVar2, qim0Var, x340Var, i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 6, i, this, wwyVar, xwaVar, xwaVar2, qim0Var);
        }
    }

    public void f(zgb1 zgb1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1671606099);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zgb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xwa xwaVarF = fae1.F(x340Var);
            und.a(xwaVarF, null, 0.0f, apo.r(217825234, new wnx0((Object) zgb1Var, (Object) fae1.F(x340Var), (Object) xwaVarF, (Object) this, iu30Var, (byte) 22), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81((Object) this, (Object) zgb1Var, (Object) iu30Var, i, (byte) 7);
        }
    }

    public void g(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1145944918);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            dxo1.k(qim0Var, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(this, qim0Var, i, (byte) 2);
        }
    }

    public void h(ela1 ela1Var, u771 u771Var, int i, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1227852704);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(ela1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(u771Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                i4 = i;
                objT = new axy(iu30Var, ela1Var, u771Var, i4);
                x340Var.s0(objT);
            } else {
                i4 = i;
            }
            rwo1.h((i3 >> 12) & 14, (Function0) objT, x340Var, qim0Var);
        } else {
            i4 = i;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bxy(this, ela1Var, u771Var, i4, iu30Var, qim0Var, i2);
        }
    }

    public void i(b0a b0aVar, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        xwa xwaVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-21826764);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(b0aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 1043) != 1042)) {
            xwa xwaVarF = fae1.F(b0kVar3);
            xwa xwaVarF2 = fae1.F(b0kVar3);
            wkt wktVar = b0aVar.S0;
            boolean zI = b0kVar3.i(b0aVar) | ((i3 & 112) == 32) | b0kVar3.g(xwaVarF) | b0kVar3.g(xwaVarF2);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                xwaVar = xwaVarF;
                ae1 ae1Var = new ae1(b0aVar, iu30Var, xwaVar, xwaVarF2, (lnm) null, (byte) 1);
                b0kVar3.s0(ae1Var);
                objT = ae1Var;
            } else {
                xwaVar = xwaVarF;
            }
            qxd0.t(wktVar, b0kVar3, (vu30) objT);
            b0kVar2 = b0kVar3;
            c(b0aVar, xwaVarF2, xwaVar, u291.B(nim0.a, (gra) null, 3), b0kVar2, (i3 & 14) | 3072 | ((i3 << 3) & 57344));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, b0aVar, iu30Var, kswVar, (byte) 25);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void j(ywy ywyVar, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        lz9 lz9Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1808748712);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ywyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            lz9Var = this;
            i2 |= x340Var.g(lz9Var) ? 2048 : 1024;
        } else {
            lz9Var = this;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            xwa xwaVarF = fae1.F(x340Var);
            xwa xwaVarF2 = fae1.F(x340Var);
            wkt wktVarB = ywyVar.b();
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | ((i2 & 112) == 32) | x340Var.g(xwaVarF) | x340Var.g(xwaVarF2);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                ae1 ae1Var = new ae1(ywyVar, iu30Var, xwaVarF, xwaVarF2, (lnm) null, (byte) 8);
                x340Var.s0(ae1Var);
                objT = ae1Var;
            }
            qxd0.t(wktVarB, x340Var, (vu30) objT);
            int i4 = i2 << 6;
            lz9Var.d(ywyVar, xwaVarF, xwaVarF2, iu30Var, u291.d(nim0.a, 1.0f), x340Var, i3 | 24576 | (i4 & 7168) | (i4 & 458752));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, ywyVar, iu30Var, kswVar, (byte) 16);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void k(h7n0 h7n0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var;
        Object ae1Var;
        int i3;
        iu30 iu30Var2;
        h7n0 h7n0Var2;
        int i4;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2106325649);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(h7n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(this) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1043) != 1042)) {
            xwa xwaVarF = fae1.F(x340Var2);
            xwa xwaVarF2 = fae1.F(x340Var2);
            wkt wktVarG = h7n0Var.g();
            int i5 = i2 & 14;
            int i6 = i2 & 112;
            boolean zG = (i5 == 4) | (i6 == 32) | x340Var2.g(xwaVarF) | x340Var2.g(xwaVarF2);
            Object objT = x340Var2.T();
            if (zG || objT == obj) {
                i3 = i5;
                iu30Var2 = iu30Var;
                h7n0Var2 = h7n0Var;
                ae1Var = new ae1(h7n0Var2, iu30Var2, xwaVarF, xwaVarF2, (lnm) null, (byte) 13);
                x340Var2.s0(ae1Var);
            } else {
                i3 = i5;
                iu30Var2 = iu30Var;
                h7n0Var2 = h7n0Var;
                ae1Var = objT;
            }
            qxd0.t(wktVarG, x340Var2, (vu30) ae1Var);
            boolean z = h7n0Var2 instanceof g7n0;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var2.i0(-1249330622);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var2, 6);
                x340Var2.r(false);
            } else if (h7n0Var2 instanceof e7n0) {
                x340Var2.i0(-1249327690);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = (i6 == 32) | (i3 == 4);
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == obj) {
                    objT2 = new s2n0(iu30Var2, h7n0Var2, (byte) 6);
                    x340Var2.s0(objT2);
                }
                rwo1.h(6, (Function0) objT2, x340Var2, qim0VarD);
                x340Var2.r(false);
            } else {
                if (!(h7n0Var2 instanceof f7n0)) {
                    throw p3d1.k(x340Var2, -1249330605, false);
                }
                x340Var2.i0(-74114669);
                Object objT3 = x340Var2.T();
                int i7 = 3;
                if (objT3 == obj) {
                    objT3 = g2z.x(this.b, xwaVarF, 3);
                    x340Var2.s0(objT3);
                }
                ka71 ka71Var = (ka71) objT3;
                f7n0 f7n0Var = (f7n0) h7n0Var;
                llw0 llw0Var = f7n0Var.e;
                int iC = l1d.C(f7n0Var.b);
                if (iC != 0) {
                    i4 = 1;
                    if (iC == 1) {
                        i7 = 1;
                    } else if (iC != 2) {
                        eg.o();
                        return;
                    }
                } else {
                    i4 = 1;
                    i7 = 2;
                }
                z971 z971Var = new z971(llw0Var, i7, i4);
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarD2);
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
                x340Var = x340Var2;
                otw.c(ka71Var, z971Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                jlw0 jlw0Var = f7n0Var.f;
                if (jlw0Var == null) {
                    x340Var.i0(-1442002089);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1442002088);
                    und.a(xwaVarF2, null, 0.0f, apo.r(-1030555282, new kz9(jlw0Var, (byte) 2), x340Var), x340Var, 3072, 6);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, h7n0Var, iu30Var, kswVar, (byte) 9);
        }
    }

    public void l(bhb1 bhb1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1335234126);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(bhb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            boolean z = bhb1Var instanceof ahb1;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-1035222303);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var, 6);
                x340Var.r(false);
            } else if (bhb1Var instanceof ygb1) {
                x340Var.i0(-1035219574);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new pba1(iu30Var, (byte) 14);
                    x340Var.s0(objT);
                }
                rwo1.h(6, (Function0) objT, x340Var, qim0VarD);
                x340Var.r(false);
            } else {
                if (!(bhb1Var instanceof zgb1)) {
                    throw p3d1.k(x340Var, -1035223357, false);
                }
                x340Var.i0(-1035215799);
                f((zgb1) bhb1Var, iu30Var, x340Var, ((i2 >> 3) & 896) | (i2 & 126));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, (Object) this, (Object) bhb1Var, (Object) iu30Var, (Object) kswVar, (byte) 21);
        }
    }
}
