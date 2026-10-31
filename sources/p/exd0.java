package p;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.bluejay.confirmgenerationpage.effecthandler.AttachmentNotSafeException;
import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class exd0 implements rxd0 {
    public static b180 a;
    public static b180 b;

    public static final cqc a(iu30 iu30Var) {
        return new cqc(new eqc(), iu30Var);
    }

    public static final void b(int i, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, i3u i3uVar, b0k b0kVar, int i2) {
        int i3;
        Function0 function4;
        Function0 function5;
        x340 x340Var;
        i3u i3uVar2;
        i3u i3uVar3;
        int i4;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1867270274);
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var2.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function4 = function2;
            i3 |= x340Var2.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i2) == 0) {
            function5 = function3;
            i3 |= x340Var2.i(function5) ? 131072 : 65536;
        } else {
            function5 = function3;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= 524288;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 599187) != 599186)) {
            x340Var2.d0();
            if ((i2 & 1) == 0 || x340Var2.E()) {
                i3uVar3 = new i3u(4, false, false, false);
                i4 = i3 & (-3670017);
            } else {
                x340Var2.b0();
                i4 = i3 & (-3670017);
                i3uVar3 = i3uVar;
            }
            int i5 = i4;
            x340Var2.s();
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i5 & 112) == 32) | x340Var2.i(ven0Var) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                hff hffVar = new hff(z, function4, function5, ven0Var, (lnm) null);
                x340Var2.s0(hffVar);
                objT2 = hffVar;
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT2);
            if (z) {
                x340Var2.i0(568348119);
                int i6 = i5 & 7168;
                boolean z2 = i6 == 2048;
                Object objT3 = x340Var2.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new ugj(function1, (byte) 11);
                    x340Var2.s0(objT3);
                }
                Function0 function6 = (Function0) objT3;
                String strU = cwl1.U(2131820899, i, new Object[]{Integer.valueOf(i)}, x340Var2);
                String strU2 = cwl1.U(2131820898, i, new Object[]{Integer.valueOf(i)}, x340Var2);
                String strO0 = cwl1.o0(x340Var2, 2131962488);
                String strO1 = cwl1.o0(x340Var2, 2131962488);
                boolean z3 = (i5 & 896) == 256;
                Object objT4 = x340Var2.T();
                if (z3 || objT4 == m4cVar) {
                    objT4 = new ugj(function0, (byte) 12);
                    x340Var2.s0(objT4);
                }
                Function0 function7 = (Function0) objT4;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO1), function7));
                String strO2 = cwl1.o0(x340Var2, 2131962487);
                String strO3 = cwl1.o0(x340Var2, 2131962487);
                boolean z4 = i6 == 2048;
                Object objT5 = x340Var2.T();
                if (z4 || objT5 == m4cVar) {
                    objT5 = new ugj(function1, (byte) 13);
                    x340Var2.s0(objT5);
                }
                Function0 function8 = (Function0) objT5;
                if (ihc1.y0(strO3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function6, i3uVar3, (hux) null, strU, strU2, zgxVar, new zgx(strO2, new gbx(new y50(strO3), function8)), x340Var2, 2359296, 4);
                    x340Var = x340Var2;
                    x340Var.r(false);
                }
            } else {
                x340Var = x340Var2;
                x340Var.i0(569375428);
                x340Var.r(false);
            }
            i3uVar2 = i3uVar3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            i3uVar2 = i3uVar;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c0e(i, z, function0, function1, function2, function3, i3uVar2, i2);
        }
    }

    public static final void c(dou douVar, rm0 rm0Var, ngs0 ngs0Var, tm tmVar, int i, iu30 iu30Var, iu30 iu30Var2, Function0 function0, zeu zeuVar, qim0 qim0Var, vu30 vu30Var, Function0 function1, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        vu30 vu30Var2;
        lnm lnmVar;
        pfu pfuVar;
        lnm lnmVar2;
        Object obj;
        ven0 ven0Var;
        byte b2;
        Object obj2;
        cs91 cs91Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-781230009);
        int i3 = i2 | (b0kVar3.g(douVar) ? 4 : 2) | (b0kVar3.i(rm0Var) ? 32 : 16) | (b0kVar3.g(ngs0Var) ? 256 : 128) | (b0kVar3.i(tmVar) ? 2048 : 1024) | (b0kVar3.e(l1d.C(i)) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536) | (b0kVar3.i(iu30Var2) ? 1048576 : 524288) | (b0kVar3.i(function0) ? 8388608 : 4194304) | (b0kVar3.g(zeuVar) ? 67108864 : 33554432) | 805306368;
        int i4 = 6 | (b0kVar3.i(function1) ? ' ' : (char) 16);
        if (b0kVar3.Y(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            vu30 vu30Var3 = vji.a;
            if (douVar.c()) {
                lnmVar = null;
                pfuVar = new pfu(false, douVar.e());
            } else {
                lnmVar = null;
                pfuVar = douVar.b() ? new pfu(true, douVar.e()) : null;
            }
            Object objT = b0kVar3.T();
            Object obj3 = objT;
            if (objT == m4cVar) {
                hrr0 hrr0VarQ = v8r.q(lnmVar);
                b0kVar3.s0(hrr0VarQ);
                obj3 = hrr0VarQ;
            }
            ven0 ven0Var2 = (ven0) obj3;
            ven0 ven0VarS = v8r.s(iu30Var2, b0kVar3);
            ven0 ven0VarS2 = v8r.s(function0, b0kVar3);
            boolean zG = b0kVar3.g(pfuVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                lnmVar2 = lnmVar;
                nnu nnuVar = new nnu(pfuVar, ven0Var2, lnmVar2, (byte) 0);
                b0kVar3.s0(nnuVar);
                obj = nnuVar;
            } else {
                lnmVar2 = lnmVar;
                obj = objT2;
            }
            qxd0.t(pfuVar, b0kVar3, (vu30) obj);
            pfu pfuVar2 = (pfu) ven0Var2.getValue();
            boolean zG2 = b0kVar3.g(ven0VarS2) | b0kVar3.g(ven0VarS);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == m4cVar) {
                ven0Var = ven0Var2;
                objT3 = new swn(ven0Var, ven0VarS2, ven0VarS, lnmVar2, (byte) 23);
                b0kVar3.s0(objT3);
            } else {
                ven0Var = ven0Var2;
            }
            qxd0.t(pfuVar2, b0kVar3, (vu30) objT3);
            Boolean boolValueOf = Boolean.valueOf(douVar.a());
            int i5 = i3 & 14;
            boolean z = (i5 == 4) | ((i4 & 112) == 32);
            Object objT4 = b0kVar3.T();
            if (z || objT4 == m4cVar) {
                b2 = 1;
                nnu nnuVar2 = new nnu(douVar, function1, lnmVar2, b2);
                b0kVar3.s0(nnuVar2);
                obj2 = nnuVar2;
            } else {
                b2 = 1;
                obj2 = objT4;
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) obj2);
            Object objT5 = b0kVar3.T();
            Object obj4 = objT5;
            if (objT5 == m4cVar) {
                cs91 cs91Var2 = new cs91();
                b0kVar3.s0(cs91Var2);
                obj4 = cs91Var2;
            }
            cs91 cs91Var3 = (cs91) obj4;
            Object objT6 = b0kVar3.T();
            Object obj5 = objT6;
            if (objT6 == m4cVar) {
                c9n c9nVarM = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(c9nVarM);
                obj5 = c9nVarM;
            }
            c9n c9nVar = (c9n) obj5;
            String strO0 = cwl1.o0(b0kVar3, 2131963488);
            Boolean boolValueOf2 = Boolean.valueOf(douVar.d());
            boolean z2 = (((i5 != 4 ? (byte) 0 : b2) | (b0kVar3.i(c9nVar) ? 1 : 0)) == true ? 1 : 0) | (b0kVar3.g(strO0) ? 1 : 0);
            Object objT7 = b0kVar3.T();
            if (z2 != 0 || objT7 == m4cVar) {
                cs91Var = cs91Var3;
                sr1 sr1Var = new sr1(douVar, c9nVar, cs91Var, strO0, (lnm) null, (byte) 15);
                b0kVar3.s0(sr1Var);
                objT7 = sr1Var;
            } else {
                cs91Var = cs91Var3;
            }
            qxd0.t(boolValueOf2, b0kVar3, (vu30) objT7);
            b0kVar2 = b0kVar3;
            yf41.a((bg41) null, (vu30) null, (vu30) null, apo.r(796507136, new oat(cs91Var, (byte) 9), b0kVar3), (vu30) null, 0, false, (hw61) null, 0.0f, 0L, 0L, 0L, u7h.j, 0L, apo.r(-6463227, new onu(douVar, rm0Var, i, iu30Var, zeuVar, ngs0Var, tmVar, ven0Var), b0kVar3), b0kVar2, 24582);
            qim0Var2 = nim0.a;
            vu30Var2 = vu30Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            vu30Var2 = vu30Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pnu(douVar, rm0Var, ngs0Var, tmVar, i, iu30Var, iu30Var2, function0, zeuVar, qim0Var2, vu30Var2, function1, i2);
        }
    }

    public static final void d(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(987756206);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.g(4, apo.r(-1248759909, new qgd((byte) 8, cwl1.o0(x340Var, 2131956894), iu30Var, false), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 17, i, iu30Var, false);
        }
    }

    public static final void e(xp90 xp90Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Function0 function0;
        iu30 iu30Var2 = iu30Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(401349812);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.i(xp90Var) ? 4 : 2) | (b0kVar2.i(iu30Var2) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar2).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarA = uyn1.A(qim0VarP, 16.0f, cbx.b(b0kVar2).b.b, 16.0f, cbx.b(b0kVar2).b.b);
            d36 d36Var = new d36(18.0f, true, new um5(false));
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            Function0 function1 = hmb0.t1;
            if (z) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            fc11.a(mqo1.s(new phx[]{xp90Var.b, xp90Var.a}), (qim0) null, hcx.d, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, b0kVar2, 392, 506);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            mbh mbhVarA2 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarZ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function0 = function1;
                b0kVar2.l(function0);
            } else {
                function0 = function1;
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            lee1 lee1Var = cbx.d(b0kVar2).e;
            long j = cbx.a(b0kVar2).b.a;
            Function0 function2 = function0;
            b0kVar2 = b0kVar2;
            uwo1.e(cwl1.n0(2131956897, new Object[]{xp90Var.c}, b0kVar2), qim0VarF2, lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            uwo1.e(cwl1.o0(b0kVar2, 2131956896), u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            b0kVar2.r(true);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            mbh mbhVarA3 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0Var3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA3, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            int i3 = (i2 >> 3) & 14;
            iu30Var2 = iu30Var;
            d(iu30Var2, b0kVar2, i3);
            f(iu30Var2, b0kVar2, i3);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(xp90Var, iu30Var2, qim0Var2, i, (byte) 2);
        }
    }

    public static final void f(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1218871666);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956895);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new zi80(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.h(new gbx(new y50(strO0), function0), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, apo.r(-1909845650, new dz40(strO0, (byte) 25), x340Var), x340Var, 12582912, 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 18, i, iu30Var, false);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1197708198);
        int i2 = i | (x340Var.i(function0) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            scx scxVarM = pno1.m(x340Var);
            x74.f(function0, scxVarM, (mfx) null, false, false, 0.0f, true, Boolean.TRUE, false, false, (vu30) null, apo.r(1565608473, new h6a0(scxVarM, p7h.M(new se30[]{new se30(cwl1.o0(x340Var, 2131957878), cwl1.o0(x340Var, 2131957877)), new se30(cwl1.o0(x340Var, 2131957884), cwl1.o0(x340Var, 2131957883)), new se30(cwl1.o0(x340Var, 2131957882), cwl1.o0(x340Var, 2131957881)), new se30(cwl1.o0(x340Var, 2131957873), cwl1.o0(x340Var, 2131957872)), new se30(cwl1.o0(x340Var, 2131957871), cwl1.o0(x340Var, 2131957870)), new se30(cwl1.o0(x340Var, 2131957880), cwl1.o0(x340Var, 2131957879))}), (byte) 19), x340Var), x340Var, (i2 & 14) | 14180352, 48, 1836);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:108:0x0196  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:121:0x020f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0216  */
    /* JADX WARN: Code duplicated, block: B:124:0x021a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0235  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x0131  */
    /* JADX WARN: Code duplicated, block: B:98:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x013c  */
    public static final void h(u201 u201Var, oa0 oa0Var, float f, qim0 qim0Var, boolean z, boolean z2, boolean z3, boolean z4, String str, c380 c380Var, iu30 iu30Var, c380 c380Var2, iu30 iu30Var2, Function0 function0, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z6;
        j2i j2iVar2;
        x340 x340Var;
        qim0 qim0Var2;
        boolean z7;
        h311 h311VarV;
        Object objT;
        err0 err0Var;
        Object objT2;
        o95 o95Var;
        l811 l811Var;
        qim0 qim0Var3;
        gra graVar;
        boolean z8;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z9;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        boolean zI;
        Object objT3;
        Object objT4;
        gfh0 gfh0VarC2;
        int iHashCode2;
        xos0 xos0VarM2;
        qim0 qim0VarE2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1701597798);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.i(u201Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(oa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.d(f) ? 256 : 128;
        }
        int i14 = i3 | 3072;
        int i15 = i2 & 16;
        if (i15 == 0) {
            if ((i & 24576) == 0) {
                z5 = z;
                i14 |= x340Var2.h(z5) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                if (x340Var2.h(z2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 |= i13;
            }
            if ((i & 1572864) == 0) {
                if (x340Var2.h(z3)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i14 |= i12;
            }
            if ((i & 12582912) == 0) {
                if (x340Var2.h(z4)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i14 |= i11;
            }
            if ((i & 100663296) == 0) {
                if (x340Var2.g(str)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i14 |= i10;
            }
            if ((i & 805306368) == 0) {
                int i16 = i14;
                if (x340Var2.g(c380Var)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i4 = i16 | i9;
            } else {
                i4 = i14;
            }
            if (x340Var2.i(iu30Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            int i17 = 24576 | i5;
            if (x340Var2.i(c380Var2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            int i18 = i17 | i6 | (x340Var2.i(iu30Var2) ? 256 : 128);
            if (x340Var2.i(function0)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i8 = i18 | i7;
            if ((i4 & 306783379) == 306783378 || (i8 & 9363) != 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (x340Var2.Y(i4 & 1, z6)) {
                if (i15 != 0) {
                    z5 = false;
                }
                objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = bb00.h(0, x340Var2);
                }
                err0Var = (hdn0) objT;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = c97.b(0.0f);
                    x340Var2.s0(objT2);
                }
                o95Var = (o95) objT2;
                l811Var = new l811();
                qim0Var3 = nim0.a;
                qim0 qim0VarT = ltn1.t(u291.B(qim0Var3, (gra) null, 3), z5);
                graVar = een.d;
                z8 = z5;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarT);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z9 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z9) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var2, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                zI = x340Var2.i(o95Var);
                objT3 = x340Var2.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new wqe(o95Var, (byte) 13);
                    x340Var2.s0(objT3);
                }
                qim0 qim0VarB = eqr0.B(qim0Var3, (iu30) objT3);
                objT4 = x340Var2.T();
                if (objT4 == m4cVar) {
                    objT4 = new myg0(err0Var, (byte) 21);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarG0 = irn1.g0(qim0VarB, (iu30) objT4);
                gfh0VarC2 = t1c.c(graVar, false);
                iHashCode2 = Long.hashCode(x340Var2.T);
                xos0VarM2 = x340Var2.m();
                qim0VarE2 = zr7.E(x340Var2, qim0VarG0);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                j2iVar2 = j2iVar;
                ywx0.l(54, j2iVar2, h2c.a, x340Var2, true);
                if (z4) {
                    x340Var2.i0(-1174367267);
                    gxo1.e(((wat) x340Var2.k(t4k.h)).M0(err0Var.s()), z2, f, str, z3, mqo1.A(c380Var), oa0Var, u201Var, iu30Var2, c380Var2, new hf31(l811Var, iu30Var, (byte) 10), new uk21(l811Var, function0, (byte) 1), x340Var2, ((i4 >> 9) & 896) | ((i4 << 3) & 7168) | ((i4 >> 12) & 57344) | ((i4 >> 3) & 458752) | ((i4 << 18) & 29360128) | ((i4 << 24) & 234881024) | ((i8 << 21) & 1879048192), (i8 >> 3) & 14);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    x340Var.i0(-1173699186);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qxd0.t(Boolean.valueOf(z4), x340Var, new lw31(z4, o95Var, ((wat) x340Var.k(t4k.h)).i0(12.0f), l811Var, (lnm) null));
                qim0Var2 = qim0Var3;
                z7 = z8;
            } else {
                j2iVar2 = j2iVar;
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                z7 = z5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mw31(u201Var, oa0Var, f, qim0Var2, z7, z2, z3, z4, str, c380Var, iu30Var, c380Var2, iu30Var2, function0, j2iVar2, i, i2);
            }
        }
        i14 = i3 | 27648;
        z5 = z;
        if ((i & 196608) == 0) {
            if (x340Var2.h(z2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i14 |= i13;
        }
        if ((i & 1572864) == 0) {
            if (x340Var2.h(z3)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i14 |= i12;
        }
        if ((i & 12582912) == 0) {
            if (x340Var2.h(z4)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i14 |= i11;
        }
        if ((i & 100663296) == 0) {
            if (x340Var2.g(str)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i14 |= i10;
        }
        if ((i & 805306368) == 0) {
            int i19 = i14;
            if (x340Var2.g(c380Var)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i4 = i19 | i9;
        } else {
            i4 = i14;
        }
        if (x340Var2.i(iu30Var)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i110 = 24576 | i5;
        if (x340Var2.i(c380Var2)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i111 = i110 | i6 | (x340Var2.i(iu30Var2) ? 256 : 128);
        if (x340Var2.i(function0)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        i8 = i111 | i7;
        if ((i4 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (x340Var2.Y(i4 & 1, z6)) {
            if (i15 != 0) {
                z5 = false;
            }
            objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var2);
            }
            err0Var = (hdn0) objT;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = c97.b(0.0f);
                x340Var2.s0(objT2);
            }
            o95Var = (o95) objT2;
            l811Var = new l811();
            qim0Var3 = nim0.a;
            qim0 qim0VarT2 = ltn1.t(u291.B(qim0Var3, (gra) null, 3), z5);
            graVar = een.d;
            z8 = z5;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarT2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z9 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z9) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar3);
            nko1.F(x340Var2);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            zI = x340Var2.i(o95Var);
            objT3 = x340Var2.T();
            if (zI) {
                objT3 = new wqe(o95Var, (byte) 13);
                x340Var2.s0(objT3);
            } else {
                objT3 = new wqe(o95Var, (byte) 13);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarB2 = eqr0.B(qim0Var3, (iu30) objT3);
            objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = new myg0(err0Var, (byte) 21);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarG1 = irn1.g0(qim0VarB2, (iu30) objT4);
            gfh0VarC2 = t1c.c(graVar, false);
            iHashCode2 = Long.hashCode(x340Var2.T);
            xos0VarM2 = x340Var2.m();
            qim0VarE2 = zr7.E(x340Var2, qim0VarG1);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            j2iVar2 = j2iVar;
            ywx0.l(54, j2iVar2, h2c.a, x340Var2, true);
            if (z4) {
                x340Var2.i0(-1174367267);
                gxo1.e(((wat) x340Var2.k(t4k.h)).M0(err0Var.s()), z2, f, str, z3, mqo1.A(c380Var), oa0Var, u201Var, iu30Var2, c380Var2, new hf31(l811Var, iu30Var, (byte) 10), new uk21(l811Var, function0, (byte) 1), x340Var2, ((i4 >> 9) & 896) | ((i4 << 3) & 7168) | ((i4 >> 12) & 57344) | ((i4 >> 3) & 458752) | ((i4 << 18) & 29360128) | ((i4 << 24) & 234881024) | ((i8 << 21) & 1879048192), (i8 >> 3) & 14);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(-1173699186);
                x340Var.r(false);
            }
            x340Var.r(true);
            qxd0.t(Boolean.valueOf(z4), x340Var, new lw31(z4, o95Var, ((wat) x340Var.k(t4k.h)).i0(12.0f), l811Var, (lnm) null));
            qim0Var2 = qim0Var3;
            z7 = z8;
        } else {
            j2iVar2 = j2iVar;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            z7 = z5;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mw31(u201Var, oa0Var, f, qim0Var2, z7, z2, z3, z4, str, c380Var, iu30Var, c380Var2, iu30Var2, function0, j2iVar2, i, i2);
        }
    }

    public static final void i(int i, tr80 tr80Var, int i2, int i3, int i4, long j, long j2, long j3, lee1 lee1Var, yae1 yae1Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, b0k b0kVar, int i5, int i6) {
        int i7;
        int i8;
        x340 x340Var;
        Object obj;
        hdn0 hdn0Var;
        boolean z;
        float f;
        int i9;
        int i10;
        int i11;
        ven0 ven0Var;
        int i12;
        qim0 qim0Var;
        tr80 tr80Var2 = tr80Var;
        Object obj2 = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1337417768);
        if ((i5 & 6) == 0) {
            i7 = (x340Var2.e(i) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= x340Var2.i(tr80Var2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= x340Var2.e(i2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= x340Var2.e(i3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= x340Var2.e(i4) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= x340Var2.f(j) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= x340Var2.f(j2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= x340Var2.f(j3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= x340Var2.i(lee1Var) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= x340Var2.i(yae1Var) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (x340Var2.i(iu30Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= x340Var2.i(iu30Var2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= x340Var2.i(iu30Var3) ? 256 : 128;
        }
        if (x340Var2.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            wat watVar = (wat) x340Var2.k(t4k.h);
            uwr uwrVar = cbx.a;
            float fX0 = watVar.X0(cbx.b(x340Var2).b.b);
            x340Var2.i0(-1063236651);
            avw0 avw0Var = cbx.b(x340Var2).c;
            float fX1 = watVar.X0(2.0f);
            int i13 = i8;
            x340Var2.r(false);
            x340Var2.i0(-1063234060);
            cvx cvxVar = cbx.b(x340Var2).b;
            float fX2 = watVar.X0(8.0f);
            x340Var2.r(false);
            x340Var2.i0(-1063231469);
            float fX3 = watVar.X0(cbx.b(x340Var2).b.f);
            x340Var2.r(false);
            float f2 = cbx.b(x340Var2).b.f;
            ss50 ss50Var = (ss50) x340Var2.k(t4k.l);
            Object objT = x340Var2.T();
            if (objT == obj2) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == obj2) {
                o95 o95VarB = c97.b(0.0f);
                o95VarB.i(Float.valueOf(0.0f), Float.valueOf(i4));
                x340Var2.s0(o95VarB);
                obj = o95VarB;
            } else {
                obj = objT2;
            }
            o95 o95Var = (o95) obj;
            Object objT3 = x340Var2.T();
            if (objT3 == obj2) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == obj2) {
                objT4 = bb00.h(-1, x340Var2);
            }
            hdn0 hdn0Var2 = (hdn0) objT4;
            int i14 = i7 & 896;
            int i15 = i7;
            boolean zG = x340Var2.g(tr80Var2) | (i14 == 256) | ((i7 & 7168) == 2048);
            Object objT5 = x340Var2.T();
            if (zG || objT5 == obj2) {
                rr80 rr80VarO = yoi1.O(tr80Var, i2);
                ArrayList arrayList = new ArrayList();
                lr80 it = rr80VarO.iterator();
                while (((sr80) it).c) {
                    Object next = it.next();
                    hdn0 hdn0Var3 = hdn0Var2;
                    if ((((Number) next).intValue() - ((rr80) tr80Var2).a) % i3 == 0) {
                        arrayList.add(next);
                    }
                    hdn0Var2 = hdn0Var3;
                }
                hdn0Var = hdn0Var2;
                objT5 = o7h.p1(arrayList);
                x340Var2.s0(objT5);
            } else {
                hdn0Var = hdn0Var2;
            }
            Set set = (Set) objT5;
            int i16 = i15 & 14;
            boolean zI = x340Var2.i(o95Var) | (i16 == 4) | x340Var2.i(tr80Var2) | (i14 == 256);
            Object objT6 = x340Var2.T();
            if (zI || objT6 == obj2) {
                z = false;
                f = fX2;
                objT6 = new lnl1(o95Var, i, tr80Var2, i2, (lnm) null);
                x340Var2.s0(objT6);
            } else {
                f = fX2;
                z = false;
            }
            qxd0.t(rih1.a, x340Var2, (vu30) objT6);
            Integer numValueOf = Integer.valueOf(i);
            Object value = ven0Var2.getValue();
            boolean zI2 = x340Var2.i(ven0Var2) | (i16 == 4 ? true : z) | x340Var2.i(tr80Var2) | (i14 == 256 ? true : z) | x340Var2.i(o95Var);
            Object objT7 = x340Var2.T();
            if (zI2 || objT7 == obj2) {
                i9 = 16384;
                i10 = i14;
                i11 = i16;
                objT7 = new tep0(ven0Var2, i, tr80Var2, i2, o95Var, (lnm) null, (byte) 1);
                ven0Var = ven0Var2;
                o95Var = o95Var;
                x340Var2.s0(objT7);
            } else {
                ven0Var = ven0Var2;
                i10 = i14;
                i11 = i16;
                i9 = 16384;
            }
            qxd0.s(numValueOf, value, (vu30) objT7, x340Var2);
            qim0 qim0VarD = i541.D(u291.h(u291.f(nim0.a, 1.0f), f2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
            boolean zD = x340Var2.d(fX3);
            Object objT8 = x340Var2.T();
            if (zD || objT8 == obj2) {
                objT8 = new waf1((byte) 12, fX3);
                x340Var2.s0(objT8);
            }
            qim0 qim0VarR = r(qim0VarD, (iu30) objT8);
            Integer numValueOf2 = Integer.valueOf(i2);
            int i17 = i15 & 57344;
            hdn0 hdn0Var4 = hdn0Var;
            boolean zI3 = x340Var2.i(ven0Var) | x340Var2.i(c9nVar) | x340Var2.i(o95Var) | (i17 == i9) | x340Var2.i(tr80Var2) | (i10 == 256) | ((i13 & 112) == 32) | ((i13 & 896) == 256) | x340Var2.i(hdn0Var4) | x340Var2.i(ss50Var);
            Object objT9 = x340Var2.T();
            if (zI3 || objT9 == obj2) {
                o95 o95Var2 = o95Var;
                ven0 ven0Var3 = ven0Var;
                x340Var = x340Var2;
                i12 = 256;
                objT9 = new onl1(ven0Var3, c9nVar, o95Var2, i4, tr80Var2, i2, iu30Var2, iu30Var3, hdn0Var4, ss50Var);
                ven0Var = ven0Var3;
                o95Var = o95Var2;
                tr80Var2 = tr80Var2;
                x340Var.s0(objT9);
            } else {
                x340Var = x340Var2;
                i12 = 256;
            }
            qim0 qim0VarC = f8d1.c(qim0VarR, tr80Var2, numValueOf2, (PointerInputEventHandler) objT9);
            float f3 = f;
            boolean zI4 = x340Var.i(o95Var) | x340Var.i(ven0Var) | x340Var.i(tr80Var2) | (i10 == i12) | (i11 == 4) | x340Var.d(f3) | x340Var.d(fX0) | (i17 == 16384) | x340Var.g(set) | ((i15 & 458752) == 131072) | ((i15 & 3670016) == 1048576) | x340Var.d(fX1) | ((i13 & 14) == 4) | x340Var.i(yae1Var) | x340Var.i(lee1Var) | ((i15 & 29360128) == 8388608);
            Object objT10 = x340Var.T();
            if (zI4 || objT10 == obj2) {
                qim0Var = qim0VarC;
                pnl1 pnl1Var = new pnl1(o95Var, ven0Var, tr80Var2, i2, i, f3, fX0, i4, set, j, j2, fX1, iu30Var, yae1Var, lee1Var, j3);
                x340Var = x340Var;
                x340Var.s0(pnl1Var);
                objT10 = pnl1Var;
            } else {
                qim0Var = qim0VarC;
            }
            j0o1.b(0, x340Var, (iu30) objT10, qim0Var);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qnl1(i, tr80Var, i2, i3, i4, j, j2, j3, lee1Var, yae1Var, iu30Var, iu30Var2, iu30Var3, i5, i6);
        }
    }

    public static final void j(xjf1 xjf1Var, Uri uri, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-398559562);
        int i2 = i | (x340Var.g(xjf1Var) ? 4 : 2) | (x340Var.g(uri) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, dug.f(i1p1.q(qim0VarD, er31.b(16.0f)), cbx.a(x340Var).a.a.a(), d4o1.a));
            zzq0 zzq0VarH = uyn1.h(1, 0.0f, cbx.b(x340Var).b.b);
            era eraVar = een.Q0;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new rsc1(xjf1Var, uri, iu30Var, (byte) 16);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarZ, (xtb0) null, zzq0VarH, false, (g36) null, eraVar, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 474);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, xjf1Var, uri, iu30Var, qim0Var2, (byte) 15);
        }
    }

    public static final void k(rjf1 rjf1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1725387831);
        int i2 = i | (b0kVar3.g(rjf1Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uvx uvxVar = new uvx(mgx.e, 0, (tvx) null, (p3v) null, 29);
            gbx gbxVar = new gbx(z50.c, function0);
            String str = rjf1Var.d;
            if (str == null) {
                b0kVar3.i0(1140408045);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(1140408046);
                j2iVarR = apo.r(1558617243, new dba1(str, (byte) 8), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1110046081, new wjf1(rjf1Var, (byte) 0), b0kVar3), (xu30) null, (xu30) null, j2iVarR, (xu30) null, (xu30) null, (xu30) null, apo.r(-16225531, new wjf1(rjf1Var, (byte) 1), b0kVar3), b0kVar2, ((i2 >> 6) & 14) | 100663360, 196608, 30396);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(rjf1Var, function0, qim0Var, i, (byte) 18);
        }
    }

    public static final void l(xjf1 xjf1Var, Uri uri, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1171832867);
        int i2 = (x340Var.g(xjf1Var) ? 4 : 2) | i | (x340Var.g(uri) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            function1 = function0;
            j82.t(function1, (vu30) null, (vu30) null, ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2 ? q891.a : new p891(), (bke1) null, apo.r(-193553421, new juc1(xjf1Var, uri, iu30Var, (byte) 19), x340Var), x340Var, ((i2 >> 9) & 14) | 1573296);
            qim0Var = nim0.a;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1(xjf1Var, uri, iu30Var, function1, qim0Var2, i);
        }
    }

    public static final void m(int i, long j, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1628732199);
        int i2 = (x340Var.f(j) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(12.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(qim0Var3, 12.0f);
            boolean zD = x340Var.d(fX0) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new qf0(j, fX0, (byte) 9);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarH);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(j, qim0Var2, i, (byte) 10);
        }
    }

    public static final void n(int i, tr80 tr80Var, int i2, int i3, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, iu30 iu30Var3, b0k b0kVar, int i4) {
        int i5;
        x340 x340Var;
        iu30 iu30Var4;
        boolean z;
        m4c m4cVar = fkj0.X;
        int i6 = ((rr80) tr80Var).a;
        int i7 = ((rr80) tr80Var).b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1888025828);
        if ((i4 & 6) == 0) {
            i5 = (x340Var2.e(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= x340Var2.i(tr80Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= x340Var2.e(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= x340Var2.e(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= x340Var2.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= x340Var2.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= x340Var2.i(iu30Var2) ? 1048576 : 524288;
        }
        int i8 = i5 | 12582912;
        if (x340Var2.Y(i8 & 1, (i8 & 4793491) != 4793490)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = rnl1.a;
                x340Var2.s0(objT);
            }
            iu30 iu30Var5 = (iu30) objT;
            int i9 = (i7 - i6) / i2;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).b.c;
            long j2 = cbx.a(x340Var2).b.b;
            long j3 = cbx.a(x340Var2).b.b;
            lee1 lee1Var = cbx.d(x340Var2).j;
            yae1 yae1VarQ = d5p1.q(0, x340Var2, 1);
            cvx cvxVar = cbx.b(x340Var2).b;
            boolean z2 = i + i2 <= i7;
            boolean z3 = i - i2 >= i6;
            String strN0 = cwl1.n0(2131963918, new Object[]{iu30Var5.invoke(Integer.valueOf(i))}, x340Var2);
            String strO0 = cwl1.o0(x340Var2, 2131963920);
            String strO1 = cwl1.o0(x340Var2, 2131963919);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean z4 = z2;
            boolean zG = x340Var2.g(strN0) | x340Var2.h(z2) | x340Var2.g(strO0) | ((i8 & 57344) == 16384) | ((i8 & 14) == 4) | ((i8 & 896) == 256) | x340Var2.h(z3) | x340Var2.g(strO1);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                z = true;
                rep0 rep0Var = new rep0(strN0, z4, strO0, z3, strO1, iu30Var, i, i2, (byte) 1);
                x340Var2.s0(rep0Var);
                objT2 = rep0Var;
            } else {
                z = true;
            }
            qim0 qim0VarB = s161.b(qim0VarF, z, (iu30) objT2);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            m(0, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01f4: INVOKE (0 int), (r20v0 ?? I:??[long, double]), (r13v1 'x340Var2' p.x340), (null p.qim0) STATIC call: p.exd0.m(int, long, p.b0k, p.qim0):void A[MD:(int, long, p.b0k, p.qim0):void (m)] (LINE:501) in method: p.exd0.n(int, p.tr80, int, int, p.iu30, p.qim0, p.iu30, p.iu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 613
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.exd0.n(int, p.tr80, int, int, p.iu30, p.qim0, p.iu30, p.iu30, p.b0k, int):void");
        }

        public static final String o(jl7 jl7Var) {
            if (u890.j(jl7Var, gl7.a)) {
                return "attachment_pending";
            }
            if (u890.j(jl7Var, il7.a)) {
                return "attachment_safe";
            }
            if (jl7Var instanceof hl7) {
                return "attachment_rejected";
            }
            eg.o();
            return null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object p(ay8 ay8Var, onm onmVar) throws ItemUnavailableException {
            tj3 tj3Var;
            if (onmVar instanceof tj3) {
                tj3Var = (tj3) onmVar;
                int i = tj3Var.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    tj3Var.b = i - Integer.MIN_VALUE;
                } else {
                    tj3Var = new tj3(onmVar);
                }
            } else {
                tj3Var = new tj3(onmVar);
            }
            Object objJ = tj3Var.a;
            int i2 = tj3Var.b;
            if (i2 == 0) {
                hm5.M(objJ);
                s4 s4Var = new s4(2, (lnm) null, (byte) 11);
                tj3Var.b = 1;
                objJ = b5p1.j(ay8Var, s4Var, tj3Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            Object objG = u890.G((k1r) objJ);
            if (objG != null) {
                return objG;
            }
            throw new ItemUnavailableException();
        }

        public static final qim0 q(qim0 qim0Var, iu30 iu30Var) {
            return qim0Var.then(new j7v(iu30Var));
        }

        public static final qim0 r(qim0 qim0Var, iu30 iu30Var) {
            return qim0Var.then(new p7v(iu30Var));
        }

        public static final qim0 s(qim0 qim0Var, iu30 iu30Var) {
            return qim0Var.then(new q7v(iu30Var));
        }

        public static final long t(String str) {
            rhc rhcVarV = u890.v(str);
            if (rhcVarV.a.length == 8) {
                return rhcVarV.a().asLongBuffer().get();
            }
            hhg1.f("Invalid folderId, ".concat(str));
            return 0L;
        }

        public static final drr0 u(float f) {
            return new drr0(f);
        }

        public static Next v(kak0 kak0Var) {
            return (kak0Var.y1 == null && kak0Var.z1 == null) ? Next.j() : Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 262143));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object w(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, onm onmVar) {
            gg40 gg40Var;
            Object objInvoke;
            if (onmVar instanceof gg40) {
                gg40Var = (gg40) onmVar;
                int i = gg40Var.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    gg40Var.d = i - Integer.MIN_VALUE;
                } else {
                    gg40Var = new gg40(onmVar);
                }
            } else {
                gg40Var = new gg40(onmVar);
            }
            Object obj = gg40Var.c;
            int i2 = gg40Var.d;
            cmc1 cmc1Var = dmc1.a;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vu30 vu30Var2 = gg40Var.b;
                    iu30 iu30Var3 = gg40Var.a;
                    hm5.M(obj);
                    return obj;
                }
                hm5.M(obj);
                gg40Var.a = iu30Var2;
                gg40Var.b = vu30Var;
                gg40Var.d = 1;
                Object objInvoke2 = iu30Var.invoke(gg40Var);
                d9n d9nVar = d9n.a;
                return objInvoke2 == d9nVar ? d9nVar : objInvoke2;
            } catch (GenerationServiceException e) {
                if (e.b != 5) {
                    String str = e.a;
                    if (str != null) {
                        cmc1Var = new cmc1(str);
                    }
                    return vu30Var.invoke(cmc1Var, e);
                }
                if (iu30Var2 != null && (objInvoke = iu30Var2.invoke(e)) != null) {
                    return objInvoke;
                }
                eg.m("Received ERROR_REASON_NO_CREDITS but there's no registered handler");
                return null;
            } catch (AttachmentNotSafeException e2) {
                return vu30Var.invoke(e2.a, e2);
            } catch (CancellationException e3) {
                throw e3;
            } catch (Throwable th) {
                GenerationServiceException generationServiceException = th instanceof GenerationServiceException ? th : null;
                String str2 = generationServiceException != null ? generationServiceException.a : null;
                if (str2 != null) {
                    cmc1Var = new cmc1(str2);
                }
                return vu30Var.invoke(cmc1Var, th);
            }
        }

        public static final w8a1 x(i9a1 i9a1Var) {
            u7h u7hVar;
            String str = i9a1Var.a;
            String str2 = i9a1Var.b;
            Long l = i9a1Var.c;
            if (l != null) {
                long jLongValue = l.longValue();
                int i = u7h.l;
                u7hVar = new u7h(w361.m(jLongValue));
            } else {
                u7hVar = null;
            }
            return new w8a1(str, str2, u7hVar);
        }

        /* JADX WARN: Code duplicated, block: B:146:0x0268  */
        /* JADX WARN: Code duplicated, block: B:151:0x0273  */
        /* JADX WARN: Code duplicated, block: B:153:0x0276 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:154:0x0278 A[PHI: r12
          0x0278: PHI (r12v17 int) = (r12v13 int), (r12v18 int) binds: [B:159:0x0281, B:153:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:155:0x027a A[PHI: r12
          0x027a: PHI (r12v14 int) = (r12v13 int), (r12v18 int) binds: [B:159:0x0281, B:153:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:156:0x027c  */
        /* JADX WARN: Code duplicated, block: B:158:0x0280  */
        /* JADX WARN: Code duplicated, block: B:163:0x028a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:164:0x028c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:165:0x028e  */
        /* JADX WARN: Code duplicated, block: B:166:0x0290  */
        /* JADX WARN: Code duplicated, block: B:167:0x0292  */
        /* JADX WARN: Code duplicated, block: B:169:0x0296 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:174:0x029e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        public static Next y(kak0 kak0Var, h4k0 h4k0Var) {
            Next next;
            saq0 saq0Var;
            int i;
            boolean z;
            int iMax;
            boolean z2;
            int iMin;
            hia hiaVarW;
            int iOrdinal;
            int i2;
            ?? r2;
            int iOrdinal2;
            boolean z3;
            int i3;
            Integer num;
            int iY;
            Integer numValueOf;
            Integer numValueOf2;
            raq0 raq0Var;
            int i4 = kak0Var.d1;
            Integer num2 = kak0Var.z1;
            Integer num3 = kak0Var.y1;
            int i5 = h4k0Var.b;
            boolean z4 = h4k0Var.c;
            ijf1 ijf1Var = h4k0Var.a;
            lhg1 lhg1Var = kak0Var.S0;
            ruq0 ruq0Var = lhg1Var.b;
            ruq0 ruq0Var2 = lhg1Var.b;
            Integer num4 = ruq0Var.N0;
            int iIntValue = num4 != null ? num4.intValue() : 0;
            if (h4k0Var.d) {
                return x1p1.B(x1p1.C(x1p1.w(x1p1.F(z(kak0Var, h4k0Var), kak0Var))));
            }
            boolean z5 = ruq0Var.O0;
            if (iIntValue == 0 || !z5) {
                return z4 ? v(kak0Var) : x1p1.t(x1p1.B(x1p1.C(x1p1.w(x1p1.F(z(kak0Var, h4k0Var), kak0Var)))), 3);
            }
            int iOrdinal3 = ijf1Var.ordinal();
            if (iOrdinal3 == 0) {
                next = null;
                uia uiaVar = kak0Var.h1;
                saq0Var = new saq0(uiaVar != null ? uiaVar.b : null, i4);
            } else {
                if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                next = null;
                uia uiaVar2 = kak0Var.i1;
                saq0Var = new saq0(uiaVar2 != null ? uiaVar2.b : null, kak0Var.e1);
            }
            List list = saq0Var.a;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return z4 ? v(kak0Var) : x1p1.t(x1p1.B(x1p1.C(x1p1.w(x1p1.F(z(kak0Var, h4k0Var), kak0Var)))), 3);
            }
            int i6 = h4k0Var.e;
            boolean z6 = i6 == 2 && !kak0Var.x1;
            g1k0 g1k0Var = g1k0.a;
            Set set = w7x.a;
            if (z4) {
                if (z6) {
                    raq0Var = new raq0(set, num3, num2);
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int iOrdinal4 = ijf1Var.ordinal();
                    if (iOrdinal4 == 0) {
                        num = num3;
                    } else {
                        if (iOrdinal4 != 1) {
                            eg.o();
                            return next;
                        }
                        num = num2;
                    }
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        iY = i5 >= iIntValue2 ? j2p1.y(i5, list) - j2p1.y(iIntValue2, list) : j2p1.u(iIntValue2, list) - j2p1.u(i5, list);
                    } else {
                        iY = 0;
                    }
                    int iMin2 = Math.min(iY, 3);
                    for (int i7 = 0; i7 < iMin2; i7++) {
                        linkedHashSet.add(g1k0Var);
                    }
                    if (num == null || iY > 0) {
                        int iOrdinal5 = ijf1Var.ordinal();
                        if (iOrdinal5 == 0) {
                            numValueOf = Integer.valueOf(i5);
                            numValueOf2 = num2;
                        } else {
                            if (iOrdinal5 != 1) {
                                eg.o();
                                return next;
                            }
                            numValueOf2 = Integer.valueOf(i5);
                        }
                        raq0Var = new raq0(linkedHashSet, numValueOf, numValueOf2);
                    } else {
                        numValueOf2 = num2;
                    }
                    numValueOf = num3;
                    raq0Var = new raq0(linkedHashSet, numValueOf, numValueOf2);
                }
                boolean zJ = u890.j(raq0Var.b, num3);
                Set set2 = raq0Var.a;
                if (zJ && u890.j(raq0Var.c, num2) && set2.isEmpty()) {
                    return Next.j();
                }
                kak0 kak0VarA = kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, raq0Var.b, raq0Var.c, -1, 262143);
                return !set2.isEmpty() ? Next.i(kak0VarA, set2) : Next.h(kak0VarA);
            }
            int i8 = ruq0Var.X;
            boolean z7 = i6 == 2;
            boolean z8 = i6 == 2;
            int i9 = kak0Var.n1;
            boolean z9 = z8;
            int i10 = i4 - i8;
            int i11 = iIntValue;
            int iMax2 = Math.max(0, i10);
            int iOrdinal6 = ijf1Var.ordinal();
            int i12 = saq0Var.b;
            if (iOrdinal6 != 0) {
                i = i12;
                if (iOrdinal6 != 1) {
                    eg.o();
                    return next;
                }
                z = z6;
                iMax = Math.max(-i8, Math.min(0, (ruq0Var2.i - i4) - i9));
            } else {
                i = i12;
                z = z6;
                int i13 = (i / 2) + 15000;
                iMax = i - i8;
                if (i13 <= iMax) {
                    iMax = i13;
                }
            }
            int iOrdinal7 = ijf1Var.ordinal();
            if (iOrdinal7 == 0) {
                z2 = false;
                iMin = Math.min(i4, Math.max(Math.max(0, i10), i4 + i9 + ruq0Var2.t));
            } else {
                if (iOrdinal7 != 1) {
                    eg.o();
                    return next;
                }
                iMin = ((i / 2) - 15000) - i8;
                if (iMin < 0) {
                    iMin = 0;
                }
                z2 = false;
            }
            int iMax3 = Math.max(Math.min(i5, iMin), iMax);
            yu91 yu91Var = new yu91(iMax3, i8, z2);
            if (list2 != null && !list2.isEmpty() && i5 > iMax && i5 < iMin && (hiaVarW = j2p1.w(iMax3, list, z7)) != null) {
                int iY2 = h7p1.y(hiaVarW);
                if (!z9) {
                    if (j2p1.r(kak0Var).b.O0) {
                        int i14 = j2p1.r(kak0Var).b.X;
                        Integer num5 = j2p1.r(kak0Var).b.N0;
                        int iIntValue3 = num5 != null ? num5.intValue() : 1;
                        if (iIntValue3 < 1) {
                            iIntValue3 = 1;
                        }
                        i3 = i14 / iIntValue3;
                    } else {
                        i3 = i8 / i11;
                    }
                    if (Math.abs(iY2 - iMax3) <= (i3 * kak0Var.f1) / 100) {
                        if (iY2 >= iMax) {
                            iOrdinal = ijf1Var.ordinal();
                            if (iOrdinal != 0) {
                                i2 = 1;
                                if (iOrdinal == 1) {
                                    eg.o();
                                    return next;
                                }
                                if (iMax3 < 0) {
                                    r2 = i2;
                                } else {
                                    r2 = z2;
                                }
                            } else {
                                i2 = 1;
                                if (iMax3 > iMax2) {
                                    r2 = i2;
                                } else {
                                    r2 = z2;
                                }
                            }
                            iOrdinal2 = ijf1Var.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 == i2) {
                                    eg.o();
                                    return next;
                                }
                                if (iY2 >= 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                            } else if (iY2 <= iMax2) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (r2 != 0) {
                                yu91Var = new yu91(iY2, i8, true);
                            } else {
                                yu91Var = new yu91(iY2, i8, true);
                            }
                        }
                    }
                } else if (iY2 >= iMax && iY2 <= iMin) {
                    iOrdinal = ijf1Var.ordinal();
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal == 1) {
                            eg.o();
                            return next;
                        }
                        if (iMax3 < 0) {
                            r2 = i2;
                        } else {
                            r2 = z2;
                        }
                    } else {
                        i2 = 1;
                        if (iMax3 > iMax2) {
                            r2 = i2;
                        } else {
                            r2 = z2;
                        }
                    }
                    iOrdinal2 = ijf1Var.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == i2) {
                            eg.o();
                            return next;
                        }
                        if (iY2 >= 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                    } else if (iY2 <= iMax2) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (r2 != 0 || !z3) {
                        yu91Var = new yu91(iY2, i8, true);
                    }
                }
            }
            Set setSingleton = (z || !yu91Var.c) ? set : Collections.singleton(g1k0Var);
            ijf1 ijf1Var2 = ijf1.a;
            int i15 = yu91Var.a;
            int i16 = ijf1Var == ijf1Var2 ? i15 : ruq0Var.i;
            if (ijf1Var != ijf1.b) {
                i15 = ruq0Var.t;
            }
            kak0 kak0VarA2 = kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, i16, i15, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 523519), false, false, 13), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 262143);
            return x1p1.t(x1p1.B(x1p1.C(x1p1.w(x1p1.F(!setSingleton.isEmpty() ? Next.i(kak0VarA2, setSingleton) : Next.h(kak0VarA2), kak0Var)))), 3);
        }

        public static Next z(kak0 kak0Var, h4k0 h4k0Var) {
            int i;
            int iP;
            lhg1 lhg1Var = kak0Var.S0;
            int i2 = kak0Var.n1;
            int i3 = kak0Var.d1;
            ruq0 ruq0Var = lhg1Var.b;
            ijf1 ijf1Var = h4k0Var.a;
            int i4 = h4k0Var.b;
            int iOrdinal = ijf1Var.ordinal();
            if (iOrdinal == 0) {
                i = i3;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                i = kak0Var.e1;
            }
            int iOrdinal2 = ijf1Var.ordinal();
            if (iOrdinal2 == 0) {
                int i5 = ruq0Var.X;
                int i6 = (i / 2) + 15000;
                int i7 = i - i5;
                if (i6 > i7) {
                    i6 = i7;
                }
                iP = yoi1.p(i4, i6, Math.min(i3, Math.max(Math.max(0, i3 - i5), i2 + i3 + ruq0Var.t)));
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                int i8 = ruq0Var.X;
                int i9 = ((i / 2) - 15000) - i8;
                if (i9 < 0) {
                    i9 = 0;
                }
                iP = yoi1.p(i4, Math.max(-i8, Math.min(0, (ruq0Var.i - i3) - i2)), i9);
            }
            int i10 = ijf1Var == ijf1.a ? iP : ruq0Var.i;
            if (ijf1Var != ijf1.b) {
                iP = ruq0Var.t;
            }
            return Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, i10, iP, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 523519), false, false, 13), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 262143));
        }
    }
