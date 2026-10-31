package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pek0 {
    public final d0r a;
    public final qfq b;
    public final nm1 c;

    public pek0(d0r d0rVar, bgq bgqVar, yfq yfqVar, qfq qfqVar) {
        this.a = d0rVar;
        this.b = qfqVar;
        this.c = yfqVar.a(d0rVar, uak0.t);
    }

    public final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(586174512);
        int i2 = i | (x340Var.i(function0) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kek0(function0, (byte) 0);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            foo1.c(gbxVar, idxVar, qim0Var, (max) null, gdxVarR, new zzq0(6.0f, 8.0f, 6.0f, 8.0f), (idn0) null, (ga80) null, (vu30) null, (vu30) null, e2j.c, x340Var, 384, 48, 1944);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lek0(this, function0, qim0Var, i, (byte) 0);
        }
    }

    public final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1877566968);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gbx gbxVar = new gbx(z50.c, function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            j2i j2iVar = e2j.b;
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, ldxVar, qim0Var3, jax.a, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j2iVar, x340Var, 25008, 48, 1992);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lek0(this, function0, qim0Var2, i, (byte) 1);
        }
    }

    public final void c(dub1 dub1Var, c380 c380Var, c380 c380Var2, vzq0 vzq0Var, int i, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        dub1 dub1Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        tob1 tob1Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1565398452);
        int i3 = (b0kVar3.i(this) ? 8388608 : 4194304) | i2 | (b0kVar3.g(dub1Var) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.g(c380Var2) ? 256 : 128) | (b0kVar3.g(vzq0Var) ? 2048 : 1024) | (b0kVar3.e(i) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536) | 1572864;
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z = (i3 & 112) == 32;
            Object objT = b0kVar3.T();
            Object obj = objT;
            if (z || objT == m4cVar) {
                int iS = zno1.s(q7h.U(c380Var, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj2 : c380Var) {
                    linkedHashMap.put(((di90) obj2).a, obj2);
                }
                b0kVar3.s0(linkedHashMap);
                obj = linkedHashMap;
            }
            Map map = (Map) obj;
            boolean zG = ((i3 & 896) == 256) | b0kVar3.g(map);
            Object objT2 = b0kVar3.T();
            Object obj3 = objT2;
            if (zG || objT2 == m4cVar) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c380Var2.iterator();
                while (it.hasNext()) {
                    di90 di90Var = (di90) map.get((String) it.next());
                    if (di90Var != null) {
                        arrayList.add(di90Var);
                    }
                }
                b0kVar3.s0(arrayList);
                obj3 = arrayList;
            }
            c380 c380Var3 = (List) obj3;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.valueOf(u890.j(dub1Var, utb1.a)));
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var2 = (ven0) objT3;
            boolean z2 = ((i3 & 14) == 4) | ((458752 & i3) == 131072);
            Object objT4 = b0kVar3.T();
            if (z2 || objT4 == m4cVar) {
                tob1Var = tob1Var2;
                dub1Var2 = dub1Var;
                l4f0 l4f0Var = new l4f0(dub1Var2, function0, tob1Var, (lnm) null, (byte) 10);
                b0kVar3.s0(l4f0Var);
                objT4 = l4f0Var;
            } else {
                tob1Var = tob1Var2;
                dub1Var2 = dub1Var;
            }
            qxd0.t(dub1Var2, b0kVar3, (vu30) objT4);
            if (!((Boolean) tob1Var.getValue()).booleanValue()) {
                c380Var3 = c380Var;
            }
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarS = exd0.s(qim0VarD, new ps((byte) 15, cbx.a(b0kVar3).a.c));
            boolean zG2 = b0kVar3.g(c380Var3) | b0kVar3.i(this) | ((57344 & i3) == 16384);
            Object objT5 = b0kVar3.T();
            if (zG2 || objT5 == m4cVar) {
                objT5 = new gu2(c380Var3, this, i, (byte) 24);
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarS, (xtb0) null, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT5, b0kVar2, (i3 >> 3) & 896, 506);
        } else {
            dub1Var2 = dub1Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(this, dub1Var2, c380Var, c380Var2, vzq0Var, i, function0, qim0Var2, i2);
        }
    }

    public final void d(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1488225378);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                iej0 iej0Var = new iej0(new k2g0(iu30Var, this));
                x340Var.s0(iej0Var);
                objT = iej0Var;
            }
            otw.c((iej0) objT, new hej0(z), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(this, z, iu30Var, i, (byte) 6);
        }
    }

    public final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1630408029);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("mixing_reorder_loading_content", qim0Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0.a);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            yto1.e(1, 48, 1, x340Var, (qim0) null);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mek0(this, qim0Var, i, (byte) 0);
        }
    }

    public final void f(zgk0 zgk0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-826122564);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(zgk0Var) : x340Var.i(zgk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(nim0.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nyx.a(2, (wux) null, apo.r(-503894193, new nek0(this, zgk0Var, iu30Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, zgk0Var, iu30Var, i);
        }
    }

    public final void g(zgk0 zgk0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        pek0 pek0Var = this;
        zgk0 zgk0Var2 = zgk0Var;
        iu30 iu30Var2 = iu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1357530703);
        int i2 = (b0kVar3.g(zgk0Var2) ? 4 : 2) | i | (b0kVar3.i(iu30Var2) ? 32 : 16);
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (b0kVar3.g(nim0Var) ? 256 : 128) | (b0kVar3.i(pek0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = bb00.h(0, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT;
            j2i j2iVarR = apo.r(-1373886965, new oek0(iu30Var2, pek0Var), b0kVar3);
            j2i j2iVarR2 = apo.r(-535019160, new w0f0(zgk0Var2, pek0Var, iu30Var2, hdn0Var, (byte) 21), b0kVar3);
            pek0Var = this;
            zgk0Var2 = zgk0Var;
            iu30Var2 = iu30Var;
            b0kVar2 = b0kVar3;
            cgj1.n(nim0Var, j2iVarR, (vu30) null, (vu30) null, j2iVarR2, 1, 0L, 0L, (erl1) null, apo.r(-85959264, new c9y(zgk0Var2, pek0Var, iu30Var2, hdn0Var, (byte) 15), b0kVar3), b0kVar2, ((i3 >> 6) & 14) | 805330992, 460);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nek0(pek0Var, zgk0Var2, iu30Var2, i);
        }
    }

    public final void h(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1494144746);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                uej0 uej0Var = new uej0(new k2g0(iu30Var, (byte) 15), this.b.a.b.A5);
                x340Var.s0(uej0Var);
                objT = uej0Var;
            }
            otw.c((uej0) objT, new sej0(1), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oek0(this, iu30Var, i);
        }
    }

    public final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(196149142);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j2i j2iVarR = apo.r(802884091, new yih0(this, (byte) 29), x340Var);
            j2i j2iVarR2 = apo.r(-1892934147, new loi0(this, function0, (byte) 11), x340Var);
            qim0 qim0Var3 = nim0.a;
            ti5.a(j2iVarR, qim0Var3, j2iVarR2, (xu30) null, 0.0f, (erl1) null, (x7f1) null, x340Var, 438, 248);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lek0(this, function0, qim0Var2, i, (byte) 2);
        }
    }

    public final void j(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1248278850);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958850);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            cjc0 cjc0Var = new cjc0(1);
            px8 px8Var = new px8(cbx.d(x340Var).n.a.b, cbx.d(x340Var).h.a.b, fc11.G(1), (mx8) null, 8);
            qim0Var2 = nim0.a;
            uwo1.e(strO0, qim0Var2, lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, px8Var, x340Var, 1572912, 8, 696);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mek0(this, qim0Var2, i, (byte) 1);
        }
    }
}
