package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class g9p1 {
    public static b180 a;
    public static b180 b;

    public static boolean A(wh4 wh4Var) {
        return wh4Var.c();
    }

    public static boolean B(wh4 wh4Var) {
        return wh4Var.e();
    }

    public static boolean C(wh4 wh4Var) {
        return wh4Var.d();
    }

    public static boolean D(wh4 wh4Var) {
        return wh4Var.g();
    }

    public static boolean E(wh4 wh4Var) {
        return wh4Var.h();
    }

    public static boolean F(wh4 wh4Var) {
        return wh4Var.j();
    }

    public static boolean G(wh4 wh4Var) {
        return wh4Var.k();
    }

    public static boolean H(wh4 wh4Var) {
        return wh4Var.f();
    }

    public static final ven0 I(String str, fe5 fe5Var, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        if ((i & 16) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = cu9.g;
                x340Var.s0(objT);
            }
            function0 = (Function0) objT;
        }
        return zod.S(new hsi1(str, Float.valueOf(1.0f), Float.valueOf(0.0f), fe5Var, rno1.a), z, z2, function0, b0kVar, 8, 0);
    }

    public static void J(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static final zby K(oiy oiyVar, boolean z) {
        vby vbyVarU = xzo1.u(oiyVar.a);
        Boolean bool = oiyVar.b;
        if (bool != null) {
            z = bool.booleanValue();
        }
        return new zby(vbyVarU, (vby0) null, z, 2);
    }

    public static final void a(j2i j2iVar, qim0 qim0Var, qim0 qim0Var2, vu30 vu30Var, long j, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2091947262);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.d(0.64f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(vu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.f(j) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarH = l6o1.H(dug.f(u291.f(qim0Var, 1.0f), j, d4o1.a), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(x340Var).g, 32);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = too1.y(qim0VarH, new mih1(bgc0Var, poo1.s(cbx.b(x340Var).b.b, 7)));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarY, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = d7e.r(0.64f, uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, u291.f(nim0Var, 1.0f)), false);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarThen = i1p1.q(qim0VarR, er31.b(16.0f)).then(qim0Var2);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            dv20.l((i2 >> 3) & 14, j2iVar, x340Var, true);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            us71.k((i2 >> 12) & 14, vu30Var, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si6(j2iVar, qim0Var, qim0Var2, vu30Var, j, i);
        }
    }

    public static final void b(xt1 xt1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        du1 du1Var = xt1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-16564432);
        int i2 = (x340Var.g(xt1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.d(qim0Var3, 1.0f), 24.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            uwo1.e(cwl1.o0(x340Var, du1Var.a), uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(x340Var).d, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 48, 0, 2016);
            uwo1.e(cwl1.o0(x340Var, du1Var.b), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(xt1Var, qim0Var2, i, (byte) 15);
        }
    }

    public static final void c(int i, nt1 nt1Var, String str, ow1 ow1Var, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1195221921);
        int i3 = i2 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.g(nt1Var) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | (b0kVar3.g(ow1Var) ? 2048 : 1024) | (b0kVar3.g(qim0Var) ? 16384 : 8192);
        byte b2 = 0;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0VarN = anm1.N("add_to_playlist_item_with_row_id_".concat(nt1Var.c), u291.f(qim0Var, 1.0f));
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new wv1(ow1Var, i, nt1Var, b2);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, p4i.c, null, apo.r(-1195520663, new p3(str, (byte) 11), b0kVar3), null, null, null, apo.r(1527450853, new o2((Object) nt1Var, (byte) 21), b0kVar3), b0kVar2, 805306432, 196656, 30140);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, nt1Var, str, ow1Var, qim0Var, i2);
        }
    }

    public static final void f(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        y7e1 y7e1Var;
        vu30 vu30Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(680242826);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            y7e1 y7e1VarD = c4p1.D(i3, 2, str, b0kVar3);
            String strO0 = cwl1.o0(b0kVar3, 2131952887);
            boolean zI = ((i2 & 112) == 32) | b0kVar3.i(y7e1VarD);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new qy5(iu30Var, y7e1VarD, (lnm) null, (byte) 8);
                b0kVar3.s0(objT);
            }
            qxd0.t(y7e1VarD, b0kVar3, (vu30) objT);
            boolean zI2 = b0kVar3.i(y7e1VarD) | (i3 == 4);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new woe(y7e1VarD, str, null);
                b0kVar3.s0(objT2);
            }
            qxd0.t(str, b0kVar3, (vu30) objT2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(8.0f));
            String strO1 = cwl1.o0(b0kVar3, 2131952889);
            zxx zxxVar = new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).b.c, 0L, 896);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 8.0f, 8.0f);
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            if (y7e1VarD.d().d.length() > 0) {
                b0kVar3.i0(1460254327);
                y7e1Var = y7e1VarD;
                vu30 vu30VarR = apo.r(-1630467732, new d0e0(strO0, y7e1Var, (byte) 4), b0kVar3);
                b0kVar3.r(false);
                vu30Var = vu30VarR;
            } else {
                y7e1Var = y7e1VarD;
                b0kVar3.i0(1460846210);
                b0kVar3.r(false);
                vu30Var = null;
            }
            b0kVar2 = b0kVar3;
            rwo1.b(y7e1Var, qim0VarQ, null, strO1, jxi.b, vu30Var, false, false, null, null, null, null, d6e1.b, null, null, null, null, zzq0Var, 8.0f, false, zxxVar, b0kVar2, 24576, 0, 651204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zj10(str, iu30Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-283508663);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 12.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarR, cbx.a(x340Var).b.b, er31.b(2.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            w0h1.a(ptx.c, isl.a, uyn1.x(nim0Var, 2.0f), cbx.a(x340Var).a.c, 0L, false, x340Var, ptx.d | 432, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 11, i, false);
        }
    }

    public static final void h(int i, ow1 ow1Var, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-555221514);
        int i3 = (b0kVar3.e(i) ? 4 : 2) | i2 | (b0kVar3.g(ow1Var) ? 32 : 16) | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("new_playlist_row", u291.f(qim0Var3, 1.0f));
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
            String strO0 = cwl1.o0(b0kVar3, 2131951942);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new xv1(ow1Var, i);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, uvxVar, null, false, null, null, new gbx(new y50(strO0), function0), null, null, p4i.d, null, null, null, null, null, p4i.e, b0kVar2, 805306432, 196608, 32188);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yv1(i, ow1Var, qim0Var2, i2);
        }
    }

    public static final void i(rnc0 rnc0Var, xtb0 xtb0Var, iu30 iu30Var, b0k b0kVar, int i) {
        rnc0 rnc0Var2;
        xtb0 xtb0Var2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(89869330);
        int i2 = (x340Var.i(rnc0Var) ? 4 : 2) | i | (x340Var.i(xtb0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(rnc0Var) | x340Var.i(xtb0Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                rnc0Var2 = rnc0Var;
                xtb0Var2 = xtb0Var;
                iu30Var2 = iu30Var;
                wkk0 wkk0Var = new wkk0(rnc0Var2, iu30Var2, xtb0Var2, (lnm) null, (byte) 24);
                x340Var.s0(wkk0Var);
                objT = wkk0Var;
            } else {
                rnc0Var2 = rnc0Var;
                xtb0Var2 = xtb0Var;
                iu30Var2 = iu30Var;
            }
            qxd0.s(xtb0Var2, rnc0Var2, (vu30) objT, x340Var);
        } else {
            rnc0Var2 = rnc0Var;
            xtb0Var2 = xtb0Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(rnc0Var2, xtb0Var2, iu30Var2, i, (byte) 11);
        }
    }

    public static final void j(int i, ot1 ot1Var, gy1 gy1Var, String str, boolean z, ow1 ow1Var, qim0 qim0Var, boolean z2, b0k b0kVar, int i2) {
        b0k b0kVar2;
        Object obj = fkj0.X;
        boolean z3 = ot1Var.e;
        String str2 = ot1Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(584783798);
        int i3 = i2 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.g(ot1Var) ? 32 : 16) | (b0kVar3.i(gy1Var) ? 256 : 128) | (b0kVar3.g(str) ? 2048 : 1024) | (b0kVar3.h(z) ? 16384 : 8192) | (b0kVar3.g(ow1Var) ? 131072 : 65536) | (b0kVar3.g(qim0Var) ? 1048576 : 524288) | (b0kVar3.h(z2) ? 8388608 : 4194304);
        if (b0kVar3.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            boolean z4 = gy1Var instanceof fy1;
            boolean z5 = (ot1Var.g && (z2 || !z4 || ot1Var.h)) ? false : true;
            boolean zG = b0kVar3.g(str2);
            Object objT = b0kVar3.T();
            if (zG || objT == obj) {
                String str3 = bo1.a;
                Set set = s4b1.f;
                objT = bo1.d(uic.x(str2).c) ? wlx.c : grx.c;
                b0kVar3.s0(objT);
            }
            boolean z6 = z5;
            fwx fwxVarG = hso1.G((hux) objT, 0L, 0L, b0kVar3, 8, 30);
            boolean zH = b0kVar3.h(z3);
            Object objT2 = b0kVar3.T();
            if (zH || objT2 == obj) {
                objT2 = Boolean.valueOf(z3);
                b0kVar3.s0(objT2);
            }
            boolean zBooleanValue = ((Boolean) objT2).booleanValue();
            qim0 qim0VarN = anm1.N("add_to_playlist_item_with_row_id_" + ot1Var.c + "_curated_" + zBooleanValue, i541.D(u291.f(qim0Var, 1.0f), 0.0f, 0.0f, z6 ? 0.3f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 0, null, 1044475));
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
            j2i j2iVar = z ? p4i.a : null;
            boolean zH2 = ((i3 & 14) == 4) | ((i3 & 458752) == 131072) | ((i3 & 112) == 32) | b0kVar3.h(z6);
            Object objT3 = b0kVar3.T();
            if (zH2 || objT3 == obj) {
                objT3 = new zv1(ow1Var, i, ot1Var, z6);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT3), null, null, apo.r(1703665517, new wf((Object) ot1Var, (Object) fwxVarG, (byte) 10), b0kVar3), j2iVar, apo.r(1575915246, new o3((Object) str, z4, (Object) ot1Var, (byte) 1), b0kVar3), apo.r(-1555470865, new aw1((byte) 0, zBooleanValue), b0kVar3), null, null, apo.r(1935272690, new o2((Object) ot1Var, (byte) 22), b0kVar3), b0kVar2, 805306432, 197040, 25020);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(i, ot1Var, gy1Var, str, z, ow1Var, qim0Var, z2, i2);
        }
    }

    public static final void k(int i, int i2, String str, b0k b0kVar, boolean z) {
        boolean z2;
        int i3;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(80847079);
        int i4 = i | (x340Var.g(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (x340Var.h(z2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z4 = i5 != 0 ? false : z2;
            if (ihc1.y0(str)) {
                x340Var.i0(-960917829);
                x340Var.r(false);
            } else {
                x340Var.i0(-961211058);
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 54);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
                if (z4) {
                    x340Var.i0(1564898750);
                    g(x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1564925658);
                    x340Var.r(false);
                }
                if (ihc1.y0(str)) {
                    z3 = false;
                    x340Var.i0(1565041722);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1564961959);
                    z3 = false;
                    uwo1.e(str, null, null, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var, i3 & 14, 0, 1790);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z3);
            }
            z2 = z4;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cw1(str, i, i2, z2);
        }
    }

    public static final void l(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-827516701);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwo1.e(str, null, null, 0L, null, null, 0, false, new cjc0(2), 0, null, x340Var, i2 & 14, 0, 1790);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nl(str, i, (byte) 8);
        }
    }

    public static final void m(int i, List list, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-739707305);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean zV = v(list);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = zV ? k1o1.n(qim0Var3) : qim0Var3;
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l((i3 >> 6) & 14, j2iVar, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(list, qim0Var2, j2iVar, i, (byte) 0);
        }
    }

    public static final void n(List list, hw61 hw61Var, qim0 qim0Var, long j, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        long j2;
        long jC;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-386163143);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(hw61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                jC = cbx.a(x340Var).a.b.c();
                i3 = i2 & (-7169);
            } else {
                x340Var.b0();
                i3 = i2 & (-7169);
                jC = j;
            }
            x340Var.s();
            qim0 qim0VarThen = qim0Var.then(v(list) ? new nwv0(hw61Var) : dug.f(nim0.a, jC, hw61Var));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            m(((i3 >> 6) & 896) | (i3 & 14), list, j2iVar, x340Var, null);
            x340Var.r(true);
            j2 = jC;
        } else {
            x340Var.b0();
            j2 = j;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si6(list, hw61Var, qim0Var, j2, j2iVar, i);
        }
    }

    public static byte[] o(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            hhg1.n("The key length in bytes must be 32.");
            return null;
        }
        long jX = x(bArr, 0) & 67108863;
        int i = 3;
        long jX2 = (x(bArr, 3) >> 2) & 67108611;
        long jX3 = (x(bArr, 6) >> 4) & 67092735;
        long jX4 = (x(bArr, 9) >> 6) & 66076671;
        long jX5 = (x(bArr, 12) >> 8) & 1048575;
        long j = jX2 * 5;
        long j2 = jX3 * 5;
        long j3 = jX4 * 5;
        long j4 = jX5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jX6 = j9 + (x(bArr3, 0) & 67108863);
            long jX7 = j5 + ((x(bArr3, i) >> 2) & 67108863);
            long jX8 = j6 + ((x(bArr3, 6) >> 4) & 67108863);
            long jX9 = j7 + ((x(bArr3, 9) >> 6) & 67108863);
            long j10 = jX2;
            long jX10 = j8 + (((x(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jX10 * j) + (jX9 * j2) + (jX8 * j3) + (jX7 * j4) + (jX6 * jX);
            long j12 = (jX10 * j2) + (jX9 * j3) + (jX8 * j4) + (jX7 * jX) + (jX6 * j10);
            long j13 = (jX10 * j3) + (jX9 * j4) + (jX8 * jX) + (jX7 * j10) + (jX6 * jX3);
            long j14 = (jX10 * j4) + (jX9 * jX) + (jX8 * j10) + (jX7 * jX3) + (jX6 * jX4);
            long j15 = jX9 * j10;
            long j16 = jX10 * jX;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jX8 * jX3) + (jX7 * jX4) + (jX6 * jX5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jX2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jX11 = x(bArr, 16) + j50;
        long j54 = jX11 & 4294967295L;
        long jX12 = x(bArr, 20) + j51 + (jX11 >> 32);
        long jX13 = x(bArr, 24) + j52 + (jX12 >> 32);
        long jX14 = (x(bArr, 28) + j53 + (jX13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        J(j54, bArr4, 0);
        J(jX12 & 4294967295L, bArr4, 4);
        J(jX13 & 4294967295L, bArr4, 8);
        J(jX14, bArr4, 12);
        return bArr4;
    }

    public static n3r p(zvw0 zvw0Var, String str, vqz0 vqz0Var, long j, boolean z, boolean z2, long j2, long j3, int i) {
        mmr0 mmr0Var;
        boolean z3 = (i & 64) == 0;
        long j4 = (i & 128) != 0 ? -9223372036854775807L : j2;
        long j5 = (i & 256) != 0 ? -9223372036854775807L : j3;
        ie30 ie30Var = zvw0Var.b;
        Uri uriQ = pno1.q(str, vqz0Var.b);
        if (z) {
            List list = zvw0Var.c;
            uriQ.getClass();
            mmr0Var = new mmr0(list, r(uriQ, str, z2));
        } else {
            List list2 = (List) zvw0Var.j.getValue();
            uriQ.getClass();
            mmr0Var = new mmr0(list2, s(uriQ, z2));
        }
        List list3 = (List) mmr0Var.a;
        String str2 = (String) mmr0Var.b;
        Map map = Collections.EMPTY_MAP;
        long j6 = vqz0Var.a;
        np51 np51Var = new np51(list3, str2, j, asj0.i(ie30Var.p), ie30Var.a, z3, j4, j5);
        dm5.s(uriQ, "The uri must be set.");
        return new n3r(uriQ, 0L, 1, (byte[]) null, map, 0L, j6, (String) null, 0, np51Var);
    }

    public static void q(rtb0 rtb0Var, List list, gy1 gy1Var, Map map, Set set, ow1 ow1Var, int i, boolean z, int i2) {
        rtb0Var.e(list.size(), new da(new nl((i2 & 64) != 0 ? "" : "curated", (byte) 9), list, (byte) 2), new qf1(list, (byte) 8), new j2i(2039820996, new dw1(list, (i2 & 32) != 0 ? 0 : i, map, ow1Var, set, gy1Var, z), true));
    }

    public static final String r(Uri uri, String str, boolean z) {
        String encodedPath = z ? Uri.parse(str).getEncodedPath() : Uri.parse(str).getPath();
        String strG1 = encodedPath != null ? ihc1.g1(encodedPath, new char[]{'/'}) : null;
        if (strG1 == null) {
            strG1 = "";
        }
        String encodedPath2 = z ? uri.getEncodedPath() : uri.getPath();
        String strH0 = ihc1.H0(ihc1.H0(encodedPath2 != null ? encodedPath2 : "", strG1), "/");
        String encodedQuery = z ? uri.getEncodedQuery() : uri.getQuery();
        return encodedQuery != null ? f4i1.f(strH0, "?", encodedQuery) : strH0;
    }

    public static final String s(Uri uri, boolean z) {
        String encodedPath = z ? uri.getEncodedPath() : uri.getPath();
        if (encodedPath == null) {
            return "";
        }
        String encodedQuery = z ? uri.getEncodedQuery() : uri.getQuery();
        return encodedQuery != null ? f4i1.f(encodedPath, "?", encodedQuery) : encodedPath;
    }

    public static fck1 t() {
        fck1 fck1Var = fck1.a;
        if (fck1Var != null) {
            return fck1Var;
        }
        fck1 fck1Var2 = new fck1();
        fck1.a = fck1Var2;
        return fck1Var2;
    }

    public static final void u(Throwable th, vu30 vu30Var) {
        boolean z = th instanceof HttpException;
        pih0 pih0Var = pih0.c;
        if (!z) {
            Logger.e(th, l1d.m("Exception occurred: ", th.getMessage()), new Object[0]);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error occurred";
            }
            vu30Var.invoke(pih0Var, message);
            return;
        }
        HttpException httpException = (HttpException) th;
        String str = httpException.b;
        Logger.e(th, l1d.m("Network error=", str), new Object[0]);
        int i = httpException.a;
        if (i == 400) {
            pih0Var = pih0.b;
        } else if (i == 401) {
            pih0Var = pih0.a;
        }
        if (str.length() == 0) {
            str = "Network error occurred";
        }
        vu30Var.invoke(pih0Var, ab80.n("HTTP ", ": ", i, str));
    }

    public static final boolean v(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((n4d1) it.next()) instanceof m4d1) {
                return true;
            }
        }
        return false;
    }

    public static long x(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static h7l0 y(String str, String str2) {
        return new h7l0(str, str2);
    }

    public static boolean z(wh4 wh4Var) {
        return wh4Var.b();
    }
}
