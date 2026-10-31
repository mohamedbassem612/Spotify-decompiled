package p;

import android.content.Context;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nko1 {
    public static b180 a;

    public static final boolean A(o161 o161Var) {
        Object objG = o161Var.a.g(m161.b);
        if (objG == null) {
            objG = null;
        }
        return objG != null;
    }

    public static final void B(b0k b0kVar, Integer num) {
        llj lljVar = y580.R0;
        if (((x340) b0kVar).S) {
            ((x340) b0kVar).b(num, lljVar);
        }
    }

    public static final void C(t161 t161Var) {
        oap1.B(t161Var).G();
    }

    public static boolean D(zs61 zs61Var) {
        return zs61Var.a();
    }

    public static boolean E(zs61 zs61Var) {
        return zs61Var.c();
    }

    public static final void F(b0k b0kVar) {
        ((x340) b0kVar).b(rih1.a, new f6f0((byte) 28));
    }

    public static final float G(float f, flb0 flb0Var) {
        int iOrdinal = flb0Var.ordinal();
        if (iOrdinal == 0) {
            return f;
        }
        if (iOrdinal == 1) {
            return -f;
        }
        eg.o();
        return 0.0f;
    }

    public static final void H(Object obj, b0k b0kVar, vu30 vu30Var) {
        if (((x340) b0kVar).S || !u890.j(((x340) b0kVar).T(), obj)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.s0(obj);
            x340Var.b(obj, vu30Var);
        }
    }

    public static final float I(int i, int i2) {
        float f = i;
        float f2 = i2;
        float fO = (1.5f - yoi1.o(f / f2, 0.5f, 1.0f)) * 0.97f * f;
        float f3 = (f2 - 72.0f) - 176.0f;
        float f4 = f * 0.4f;
        if (f3 < f4) {
            f3 = f4;
        }
        return fO > f3 ? f3 : fO;
    }

    public static final n511 J(n511 n511Var, elb0 elb0Var, elb0 elb0Var2) {
        if (!elb0Var.a() || !elb0Var2.a()) {
            return n511.e;
        }
        return anm1.g(elb0Var2.l(nho1.v(elb0Var).E(n511Var.h())), n511Var.g());
    }

    public static final ayh K(hfp1 hfp1Var) {
        ayh ayhVarA = sap1.a();
        hfp1Var.l(n5u.e, new csj1(ayhVarA, (byte) 14));
        return ayhVarA;
    }

    public static final void a(cp6 cp6Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        max maxVar;
        String str = cp6Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1732674528);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(cp6Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarN = anm1.N("allowlisting_requests_artist_header", u291.j(48.0f, 0.0f, 2, qim0VarF));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
            H(jw31VarA, x340Var2, y580.O0);
            H(xos0VarM, x340Var2, y580.N0);
            H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            F(x340Var2);
            H(qim0VarE, x340Var2, y580.Y);
            lee1 lee1Var = cbx.d(x340Var2).e;
            long j = cbx.a(x340Var2).b.a;
            cjc0 cjc0Var = new cjc0(1);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = gn6.Y;
                x340Var2.s0(objT);
            }
            uwo1.e(str, s161.b(wnb0Var, false, (iu30) objT), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var2, 1572864, 0, 1712);
            String strN0 = cwl1.n0(2131952313, new Object[]{str}, x340Var2);
            if (ihc1.y0(strN0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strN0), function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarA = yla.s(x340Var2).a();
            if (cp6Var.d) {
                x340Var2.i0(-338302732);
                x340Var2.r(false);
                maxVar = jax.a;
            } else {
                x340Var2.i0(-338249629);
                max haxVar = new hax(cwl1.n0(2131952314, new Object[]{str}, x340Var2));
                x340Var2.r(false);
                maxVar = haxVar;
            }
            wro1.h(gbxVar, ldxVar, anm1.N("allowlisting_requests_artist_header_more_button", nim0Var), maxVar, gdxVarA, null, false, null, null, x6i.b, x340Var2, 432, 6, 968);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(cp6Var, function0, i, (byte) 15);
        }
    }

    public static final void b(rde rdeVar, iu30 iu30Var, cce cceVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        bee beeVar = rdeVar.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1297358000);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(rdeVar) : b0kVar3.i(rdeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(cceVar) : b0kVar3.i(cceVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            boolean z = beeVar instanceof zde;
            boolean z2 = beeVar instanceof yde;
            boolean z3 = (beeVar instanceof aee) || z2;
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            lnm lnmVar = null;
            if (objT == obj) {
                objT = new pys0(rdeVar.a, kzs0.b, null);
                b0kVar3.s0(objT);
            }
            pys0 pys0Var = (pys0) objT;
            boolean zH = b0kVar3.h(z2) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && b0kVar3.i(cceVar)));
            Object objT2 = b0kVar3.T();
            if (zH || objT2 == obj) {
                objT2 = new vk6(z2, cceVar, lnmVar, (byte) 27);
                b0kVar3.s0(objT2);
            }
            qxd0.t(beeVar, b0kVar3, (vu30) objT2);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).g;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            irn1.u(qim0Var3, apo.r(1430420515, new bk0(es41VarC, z3, iu30Var, cceVar, (byte) 10), b0kVar3), null, u85Var, apo.r(-1605641111, new ade(pys0Var, iu30Var, cceVar, z, z2), b0kVar3), b0kVar2, ((i3 >> 9) & 14) | 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa((byte) 16, i, rdeVar, cceVar, iu30Var, qim0Var2);
        }
    }

    public static final void c(es41 es41Var, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1287934510);
        int i2 = i | (x340Var.i(es41Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            bzn1.e(null, null, false, apo.r(1020022992, new ie1(function1, z, (byte) 2), x340Var), rgr0.a, null, ezn1.n(es41Var, new tr80(0, 1, 1), x340Var, (i2 & 14) | 24576), function0, x340Var, 2100224 | ((i2 << 15) & 29360128), 39);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(es41Var, z, function0, function1, i, (byte) 11);
        }
    }

    public static final void d(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, dlg1 dlg1Var, bmg1 bmg1Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1177952222);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.i(bmg1Var) ? 32 : 16) | (x340Var.g(dlg1Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(bmg1Var) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xvr0(bmg1Var, dlg1Var, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            ldx ldxVar = ldx.c;
            j2i j2iVar = z5j.b;
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, ldxVar, qim0Var3, null, null, null, false, null, null, j2iVar, x340Var, 384, 6, 1016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvr0(iu30Var, bmg1Var, dlg1Var, qim0Var2, i);
        }
    }

    public static final ejs0 e(int i) {
        return new ejs0(i);
    }

    public static final tyy0 f(float f) {
        return new tyy0(f);
    }

    public static final q3v g(float f) {
        return new q3v(f);
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1483218194);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            H(jw31VarA, x340Var, y580.O0);
            H(xos0VarM, x340Var, y580.N0);
            H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            F(x340Var);
            H(qim0VarE, x340Var, y580.Y);
            cnx cnxVar = cnx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.d;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            w0h1.a(cnxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var, cnx.d | 48, 48);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(kk0.j(8.0f, 2131953518, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).j, cbx.a(x340Var).b.d, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 18);
        }
    }

    public static final void i(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-9258266);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new dgq0(iu30Var, (byte) 28);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            ldx ldxVar = ldx.c;
            uwr uwrVar = cbx.a;
            foo1.c(gbxVar, ldxVar, uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.c, 7), null, null, null, null, null, null, null, z5j.c, x340Var, 0, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var, qim0Var, i, (byte) 7);
        }
    }

    public static j5s j() {
        return new j5s();
    }

    public static final void k(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(981650954);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("allowlisting_requests_artist_header_loading", uyn1.z(16.0f, 0.0f, 2, qim0VarJ));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
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
            H(jw31VarA, x340Var, y580.O0);
            H(xos0VarM, x340Var, y580.N0);
            H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            F(x340Var);
            H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            qim0 qim0VarS = u291.s(nim0Var, 88.0f, 12.0f);
            cr31 cr31Var = er31.a;
            t1c.a(cwl1.l0(dug.f(i1p1.q(qim0VarS, cr31Var), cbx.a(x340Var).a.b.a(), d4o1.a), 0L, cr31Var, 13), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 25, i, false);
        }
    }

    public static final void l(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1695661407);
        if (x340Var.Y(i & 1, i != 0)) {
            cwl1.f(i3o1.n(2131233703, x340Var, 0), cwl1.o0(x340Var, 2131959208), (qim0) null, (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var, 8, 124);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 19);
        }
    }

    public static final void m(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(514485081);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131959209);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 20);
        }
    }

    public static final void n(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(314647348);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131959156);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldx.c, null, null, yla.p(x340Var), null, null, null, null, null, f4j.b, x340Var, 0, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 15);
        }
    }

    public static final void o(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1538712363);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131958089);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).j, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 21);
        }
    }

    public static final void p(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1553615856);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131963435);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), new idx(), null, null, yla.p(x340Var), null, null, null, null, null, f4j.a, x340Var, 0, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 16);
        }
    }

    public static final void q(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(437830555);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131963435);
            qim0 qim0VarD = u291.D(nim0.a, een.Q0, 2);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarD, cbx.d(x340Var).d, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 22);
        }
    }

    public static final void r(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, dlg1 dlg1Var, bmg1 bmg1Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1064146962);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(bmg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(dlg1Var) : b0kVar3.i(dlg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            cgj1.n((qim0) null, apo.r(-545331790, new vbn0(bmg1Var, iu30Var, dlg1Var, (byte) 24), b0kVar3), (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(527417661, new zvr0(bmg1Var, dlg1Var, iu30Var), b0kVar3), b0kVar2, 805306416, 509);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new awr0(bmg1Var, dlg1Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void s(pys0 pys0Var, iu30 iu30Var, cce cceVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-103004485);
        int i2 = i | (x340Var.i(pys0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(cceVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = q1o1.u(new u63(new ztb(cceVar, iu30Var, (byte) 24), new c5a(iu30Var, (byte) 15), bde.a), null, null, 7);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            otw.c((xpw) objT, pys0Var, qim0Var3, (ipb1) null, x340Var, ((i2 << 3) & 112) | 448, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, pys0Var, iu30Var, cceVar, qim0Var2, (byte) 1);
        }
    }

    public static final void t(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2136099956);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), voo1.g);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            H(gfh0VarC, x340Var, y580.O0);
            H(xos0VarM, x340Var, y580.N0);
            H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            F(x340Var);
            H(qim0VarE, x340Var, y580.Y);
            jmo1.c(i2 & 14, function0, x340Var, uyn1.B(h2c.a.a(nim0Var, een.Y), 0.0f, 0.0f, 16.0f, 16.0f, 3));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 10);
        }
    }

    public static final void u(dlg1 dlg1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-94110334);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(dlg1Var) : x340Var.i(dlg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(dlg1Var))) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new bwr0(dlg1Var, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), null, null, null, null, null, null, null, null, z5j.d, x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cwr0(dlg1Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void v(bmg1 bmg1Var, dlg1 dlg1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1040655868);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(bmg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(dlg1Var) : b0kVar3.i(dlg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = b0kVar3.i(bmg1Var) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && b0kVar3.i(dlg1Var))) | ((i2 & 896) == 256);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new xvr0(bmg1Var, dlg1Var, iu30Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), null, null, null, null, null, null, null, null, z5j.e, b0kVar2, 0, 48, 2044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(bmg1Var, dlg1Var, iu30Var, i, (byte) 14);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:87:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ca  */
    public static final void w(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, dlg1 dlg1Var, bmg1 bmg1Var) throws NoWhenBranchMatchedException {
        x340 x340Var;
        bmg1 bmg1Var2;
        dlg1 dlg1Var2;
        qim0 qim0Var2;
        String string;
        emg1 emg1Var;
        img1 img1Var;
        String string2;
        emg1 emg1Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(555607447);
        int i2 = i | (x340Var2.i(bmg1Var) ? 4 : 2) | (x340Var2.g(dlg1Var) ? 32 : 16) | (x340Var2.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = wvr0.c;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarD, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            H(mbhVarA, x340Var2, y580.O0);
            H(xos0VarM, x340Var2, y580.N0);
            H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            F(x340Var2);
            H(qim0VarE, x340Var2, y580.Y);
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            jmg1 jmg1Var = bmg1Var.h;
            String str = bmg1Var.a;
            hmg1 hmg1Var = hmg1.a;
            boolean zJ = u890.j(jmg1Var, hmg1Var);
            gmg1 gmg1Var = gmg1.a;
            emg1 emg1Var3 = emg1.a;
            img1 img1Var2 = img1.a;
            fmg1 fmg1Var = fmg1.a;
            if (zJ || u890.j(jmg1Var, fmg1Var)) {
                string = context.getString(2131957100, str);
            } else if (u890.j(jmg1Var, gmg1Var)) {
                string = context.getString(2131957108);
            } else if (u890.j(jmg1Var, img1Var2)) {
                string = context.getString(2131957102);
            } else {
                if (!u890.j(jmg1Var, emg1Var3)) {
                    eg.o();
                    return;
                }
                string = context.getString(2131957101, str);
            }
            string.getClass();
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).c;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = wvr0.d;
                x340Var2.s0(objT2);
            }
            uwo1.e(string, s161.b(qim0VarZ, false, (iu30) objT2), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            if (u890.j(jmg1Var, hmg1Var) || u890.j(jmg1Var, fmg1Var)) {
                emg1Var = emg1Var3;
                img1Var = img1Var2;
                string2 = context.getString(2131957096);
            } else if (u890.j(jmg1Var, gmg1Var)) {
                string2 = context.getString(2131957095);
                emg1Var = emg1Var3;
                img1Var = img1Var2;
            } else {
                img1Var = img1Var2;
                if (u890.j(jmg1Var, img1Var)) {
                    string2 = context.getString(2131957098);
                    emg1Var = emg1Var3;
                } else {
                    emg1Var = emg1Var3;
                    if (!u890.j(jmg1Var, emg1Var)) {
                        eg.o();
                        return;
                    }
                    string2 = context.getString(2131957097);
                }
            }
            string2.getClass();
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            float f = cbx.b(x340Var2).b.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            img1 img1Var3 = img1Var;
            emg1 emg1Var4 = emg1Var;
            qim0Var2 = qim0Var3;
            hmg1 hmg1Var2 = hmg1Var;
            uwo1.e(string2, uyn1.y(qim0Var3, f, 16.0f), lee1Var2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            x340Var = x340Var2;
            if (u890.j(jmg1Var, gmg1Var)) {
                x340Var.i0(146016316);
                dlg1Var2 = dlg1Var;
                u(dlg1Var2, iu30Var, x340Var, (i2 >> 3) & 126);
                x340Var.r(false);
                bmg1Var2 = bmg1Var;
            } else {
                dlg1Var2 = dlg1Var;
                if (u890.j(jmg1Var, img1Var3)) {
                    x340Var.i0(146018797);
                    bmg1Var2 = bmg1Var;
                    v(bmg1Var2, dlg1Var2, iu30Var, x340Var, i2 & 1022);
                    x340Var.r(false);
                } else {
                    bmg1Var2 = bmg1Var;
                    if (u890.j(jmg1Var, fmg1Var)) {
                        hmg1Var2 = hmg1Var2;
                    } else {
                        hmg1Var2 = hmg1Var2;
                        if (!u890.j(jmg1Var, hmg1Var2)) {
                            if (!u890.j(jmg1Var, emg1Var4)) {
                                throw p3d1.k(x340Var, 146015369, false);
                            }
                            x340Var.i0(231847231);
                            x340Var.r(false);
                            emg1Var2 = emg1Var4;
                        }
                    }
                    x340Var.i0(231724533);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    emg1Var2 = emg1Var4;
                    yto1.e(0, 0, 2, x340Var, uyn1.B(qim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                    x340Var.r(false);
                }
                if (u890.j(jmg1Var, gmg1Var)) {
                    dlg1Var2.v();
                } else if (u890.j(jmg1Var, img1Var3)) {
                    dlg1Var2.x();
                } else if (!u890.j(jmg1Var, hmg1Var2) && !u890.j(jmg1Var, fmg1Var) && !u890.j(jmg1Var, emg1Var2)) {
                    eg.o();
                    return;
                }
                x340Var.r(true);
            }
            emg1Var2 = emg1Var4;
            if (u890.j(jmg1Var, gmg1Var)) {
                dlg1Var2.v();
            } else if (u890.j(jmg1Var, img1Var3)) {
                dlg1Var2.x();
            } else if (!u890.j(jmg1Var, hmg1Var2)) {
                eg.o();
                return;
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            bmg1Var2 = bmg1Var;
            dlg1Var2 = dlg1Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvr0(bmg1Var2, dlg1Var2, iu30Var, qim0Var2, i);
        }
    }

    public static final n511 x(elb0 elb0Var) {
        return nho1.v(elb0Var).M(elb0Var, false);
    }

    public static final n511 y(pim0 pim0Var, boolean z, boolean z2) {
        if (!pim0Var.a.N0) {
            return n511.e;
        }
        if (z) {
            return oap1.w(pim0Var, 8).J1();
        }
        ndo0 ndo0VarW = oap1.w(pim0Var, 8);
        return nho1.v(ndo0VarW).M(ndo0VarW, z2);
    }

    public static final t8x z(tfx tfxVar) {
        return new t8x(tfxVar, (byte) 0);
    }
}
