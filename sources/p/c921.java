package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import androidx.compose.material.AnchoredDragFinishedSignal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class c921 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object A(Function0 function0, vu30 vu30Var, onm onmVar) {
        o14 o14Var;
        if (onmVar instanceof o14) {
            o14Var = (o14) onmVar;
            int i = o14Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                o14Var.b = i - Integer.MIN_VALUE;
            } else {
                o14Var = new o14(onmVar);
            }
        } else {
            o14Var = new o14(onmVar);
        }
        Object obj = o14Var.a;
        int i2 = o14Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                w14 w14Var = new w14(function0, vu30Var, (lnm) null, (byte) 0);
                o14Var.b = 1;
                Object objS = smo1.s(w14Var, o14Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return rih1.a;
    }

    public static final Object B(o8n o8nVar, vu30 vu30Var) {
        return jo31.t(o8nVar, vu30Var);
    }

    public static void C(vu30 vu30Var) throws Throwable {
        jo31.t(o6x.a, vu30Var);
    }

    public static Object D(vu30 vu30Var) {
        return jo31.t(o6x.a, vu30Var);
    }

    public static final def0 E(ojf0 ojf0Var) {
        if (ojf0Var.Z) {
            return p(ojf0Var);
        }
        return null;
    }

    public static er60 F(laa laaVar) {
        return new er60(laaVar, nim0.a);
    }

    public static final qim0 G(qim0 qim0Var, nml nmlVar, r1t r1tVar, r1t r1tVar2) {
        return qim0Var.then(new mj40(nmlVar, r1tVar, r1tVar2));
    }

    public static final Object H(o8n o8nVar, vu30 vu30Var, lnm lnmVar) {
        return fn31.Y(o8nVar, vu30Var, lnmVar);
    }

    public static final void a(String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1549045105);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            b0kVar2 = b0kVar3;
            ni7 ni7VarA = oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            p3v p3vVar = new p3v(40.0f);
            cua cuaVar = cbx.b(b0kVar2).f;
            cua cuaVar2 = cbx.b(b0kVar2).f;
            eso1.h(ni7VarA, isl.a, null, p3vVar, new zvx(), null, mif1.P0, null, null, b0kVar2, 48, 420);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pji(str, i, (byte) 18);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(kdl kdlVar, Function0 function0, Function0 function1, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        qim0 qim0Var2;
        gbx gbxVar;
        boolean z;
        qim0 qim0VarB;
        int i2;
        m4c m4cVar = fkj0.X;
        cdl cdlVar = kdlVar.f;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1255247344);
        int i3 = i | (x340Var2.i(kdlVar) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | (x340Var2.i(function1) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String strO0 = cwl1.o0(x340Var2, 2131952809);
            String strO1 = cwl1.o0(x340Var2, 2131952814);
            zcl zclVar = zcl.a;
            boolean zEquals = cdlVar.equals(zclVar);
            adl adlVar = adl.a;
            z50 z50Var = z50.c;
            if (zEquals) {
                x340Var2.i0(-593095348);
                boolean z2 = (i3 & 112) == 32;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar) {
                    objT = new ugj(function0, (byte) 21);
                    x340Var2.s0(objT);
                }
                gbxVar = new gbx(z50Var, (Function0) objT);
                x340Var2.r(false);
            } else if (cdlVar.equals(adlVar)) {
                x340Var2.i0(-593091817);
                if (ihc1.y0(strO1)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return;
                }
                y50 y50Var = new y50(strO1);
                boolean z3 = (i3 & 896) == 256;
                Object objT2 = x340Var2.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new ugj(function1, (byte) 22);
                    x340Var2.s0(objT2);
                }
                gbxVar = new gbx(y50Var, (Function0) objT2);
                x340Var2.r(false);
            } else {
                if (!(cdlVar instanceof bdl)) {
                    throw p3d1.k(x340Var2, -593097902, false);
                }
                x340Var2.i0(-593087740);
                boolean zI = ((i3 & 7168) == 2048) | x340Var2.i(cdlVar);
                Object objT3 = x340Var2.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new gmj(iu30Var, cdlVar, (byte) 17);
                    x340Var2.s0(objT3);
                }
                gbxVar = new gbx(z50Var, (Function0) objT3);
                x340Var2.r(false);
            }
            gbx gbxVar2 = gbxVar;
            boolean zEquals2 = cdlVar.equals(zclVar);
            qim0 qim0Var3 = nim0.a;
            if (zEquals2) {
                x340Var2.i0(-593080855);
                Object objT4 = x340Var2.T();
                if (objT4 == m4cVar) {
                    objT4 = tqk.Y0;
                    x340Var2.s0(objT4);
                }
                qim0VarB = s161.b(qim0Var3, true, (iu30) objT4);
                x340Var2.r(false);
            } else if (cdlVar.equals(adlVar)) {
                x340Var2.i0(-593077070);
                boolean zG = x340Var2.g(strO0);
                Object objT5 = x340Var2.T();
                if (zG || objT5 == m4cVar) {
                    objT5 = new kak(strO0, (byte) 8);
                    x340Var2.s0(objT5);
                }
                qim0VarB = s161.b(qim0Var3, true, (iu30) objT5);
                x340Var2.r(false);
            } else {
                if (!(cdlVar instanceof bdl)) {
                    throw p3d1.k(x340Var2, -593083554, false);
                }
                x340Var2.i0(-593070819);
                boolean zI2 = x340Var2.i(cdlVar);
                Object objT6 = x340Var2.T();
                if (zI2 || objT6 == m4cVar) {
                    z = true;
                    objT6 = new v7l(cdlVar, (byte) 1);
                    x340Var2.s0(objT6);
                } else {
                    z = true;
                }
                qim0VarB = s161.b(qim0Var3, z, (iu30) objT6);
                x340Var2.r(false);
            }
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(6.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            qim0 qim0VarN = anm1.N("connector-app-row-".concat(kdlVar.a), u291.f(qim0Var3, 1.0f).then(qim0VarB));
            ogx ogxVar = ogx.e;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0Var2 = qim0Var3;
            jto1.b(qim0VarN, new uvx(0, ogxVar, 2, (vzq0) null, (zzq0) null, (tvx) null, er31.b(16.0f), 0, (p3v) null, 441), (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, apo.r(-101240976, new jdl(kdlVar, (byte) 0), x340Var2), (xu30) null, (xu30) null, apo.r(-1038374994, new jdl(kdlVar, (byte) 1), x340Var2), apo.r(1921218573, new jdl(kdlVar, (byte) 2), x340Var2), (xu30) null, (xu30) null, apo.r(-2084902614, new jdl(kdlVar, (byte) 3), x340Var2), x340Var2, 100663360, 197040, 26300);
            x340Var = x340Var2;
            int i4 = kdlVar.h;
            if (i4 == 0) {
                x340Var.i0(-259159084);
                x340Var.r(false);
            } else {
                x340Var.i0(-259159083);
                int iC = l1d.C(i4);
                if (iC == 0) {
                    i2 = 2131952806;
                } else if (iC == 1) {
                    i2 = 2131952805;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    i2 = 2131952816;
                }
                uwo1.e(cwl1.o0(x340Var, i2), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).c.e, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 7, i, kdlVar, function0, function1, iu30Var, qim0Var2);
        }
    }

    public static final void c(j3v j3vVar, kly0 kly0Var, iac0 iac0Var, dgy dgyVar, boolean z, ksw kswVar, cgy cgyVar, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        k0t k0tVar;
        ljj1 ljj1Var;
        boolean z2;
        boolean z3;
        long j;
        afx afxVar;
        y6l1 y6l1Var = cgyVar.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(254353643);
        int i2 = i | (b0kVar3.i(j3vVar) ? 4 : 2) | (b0kVar3.i(kly0Var) ? 32 : 16) | (b0kVar3.i(iac0Var) ? 256 : 128) | (b0kVar3.g(dgyVar) ? 2048 : 1024) | (b0kVar3.h(z) ? 16384 : 8192) | (b0kVar3.g(kswVar) ? 131072 : 65536) | (b0kVar3.i(cgyVar) ? 1048576 : 524288) | (b0kVar3.i(iu30Var) ? 8388608 : 4194304);
        byte b = 0;
        if (b0kVar3.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = (k0t) kly0Var.get();
                b0kVar3.s0(objT);
            }
            k0t k0tVar2 = (k0t) objT;
            boolean zI = b0kVar3.i(k0tVar2);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hgy(k0tVar2, b);
                b0kVar3.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, b0kVar3);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = new d7v(ven0Var, (byte) 18);
                b0kVar3.s0(objT4);
            }
            n9p1.e(kswVar, (iu30) objT4, b0kVar3, ((i2 >> 15) & 14) | 48);
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = new kgy(k0tVar2);
                b0kVar3.s0(objT5);
            }
            kgy kgyVar = (kgy) objT5;
            boolean zI2 = b0kVar3.i(iac0Var);
            Object objT6 = b0kVar3.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new nnu(iac0Var, kgyVar, (lnm) null, (byte) 22);
                b0kVar3.s0(objT6);
            }
            qxd0.t(kgyVar, b0kVar3, (vu30) objT6);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zI3 = b0kVar3.i(k0tVar2);
            Object objT7 = b0kVar3.T();
            if (zI3 || objT7 == m4cVar) {
                objT7 = new igy(k0tVar2, ven0Var, null, (byte) 0);
                b0kVar3.s0(objT7);
            }
            qxd0.t(bool, b0kVar3, (vu30) objT7);
            boolean zG = b0kVar3.g(y6l1Var);
            Object objT8 = b0kVar3.T();
            if (zG || objT8 == m4cVar) {
                e7l1 e7l1Var = y6l1Var.g;
                int iC = l1d.C(e7l1Var.b);
                if (iC == 0) {
                    objT8 = new jjj1(e7l1Var.c, e7l1Var.d, e7l1Var.a);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    objT8 = new kjj1(e7l1Var.c, e7l1Var.d, e7l1Var.a);
                }
                b0kVar3.s0(objT8);
            }
            ljj1 ljj1Var2 = (ljj1) objT8;
            boolean zI4 = b0kVar3.i(k0tVar2) | b0kVar3.i(ljj1Var2) | b0kVar3.i(j3vVar);
            Object objT9 = b0kVar3.T();
            if (zI4 || objT9 == m4cVar) {
                k0tVar = k0tVar2;
                ljj1Var = ljj1Var2;
                z2 = false;
                z3 = true;
                piu piuVar = new piu(k0tVar, ljj1Var, j3vVar, (lnm) null, (byte) 8);
                b0kVar3.s0(piuVar);
                objT9 = piuVar;
            } else {
                ljj1Var = ljj1Var2;
                k0tVar = k0tVar2;
                z2 = false;
                z3 = true;
            }
            qxd0.t(ljj1Var, b0kVar3, (vu30) objT9);
            w6l1 w6l1Var = y6l1Var.k;
            String str = y6l1Var.h.a;
            String str2 = y6l1Var.e;
            boolean z4 = w6l1Var != null ? z3 : z2;
            if (w6l1Var == null || (afxVar = w6l1Var.c) == null) {
                uwr uwrVar = cbx.a;
                j = ((yex) zex.a.d).g;
            } else {
                j = afxVar.b.b;
            }
            j2i j2iVarR = apo.r(-1415616902, new ozw(k0tVar, ven0Var), b0kVar3);
            if ((i2 & 29360128) != 8388608) {
                z3 = z2;
            }
            Object objT10 = b0kVar3.T();
            if (z3 || objT10 == m4cVar) {
                objT10 = new y9y(iu30Var, (byte) 11);
                b0kVar3.s0(objT10);
            }
            b0kVar2 = b0kVar3;
            ot11.a(dgyVar, str, str2, z, z4, j, j2iVarR, (Function0) objT10, (qim0) null, b0kVar2, ((i2 >> 9) & 14) | 1572864 | ((i2 >> 3) & 7168));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(j3vVar, kly0Var, iac0Var, dgyVar, z, kswVar, cgyVar, iu30Var, i);
        }
    }

    public static final void d(int i, b0k b0kVar, iu30 iu30Var, k5a0 k5a0Var, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        String strK;
        String str;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(101754049);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(k5a0Var) : b0kVar3.i(k5a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        boolean z = true;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = ((i2 >> 3) & 112) | (i2 & 14);
            if (!(k5a0Var instanceof i5a0) || (str = ((i5a0) k5a0Var).c) == null) {
                strK = x0d.k(b0kVar3, 1341845126, 2131957151, b0kVar3, false);
            } else {
                b0kVar3.i0(1341842614);
                strK = cwl1.n0(2131957149, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            }
            if ((((i3 & 112) ^ 48) <= 32 || !b0kVar3.g(iu30Var)) && (i3 & 48) != 32) {
                z = false;
            }
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ux90(iu30Var, (byte) 14);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strK), function0);
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(u291.j(65.0f, 0.0f, 2, u291.f(anm1.N("device-picker-ui-header-jam-entrypoint", qim0Var), 1.0f)), graVar, (hw61) null, ogx.e, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(1000127658, new h6a0(k5a0Var, gbxVar, (byte) 0), b0kVar3), b0kVar2, 0, 48, 1508);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new i6a0(k5a0Var, qim0Var, iu30Var, i);
        }
    }

    public static final void e(int i, b0k b0kVar, iu30 iu30Var, k5a0 k5a0Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1691118451);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(k5a0Var) : x340Var.i(k5a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896);
            qim0 qim0Var2 = nim0.a;
            d(i4, x340Var, iu30Var, k5a0Var, qim0Var2);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i6a0(k5a0Var, iu30Var, qim0Var, i);
        }
    }

    public static final void f(String str, if5 if5Var, String str2, boolean z, gbx gbxVar, boolean z2, boolean z3, String str3, iu30 iu30Var, qim0 qim0Var, lax laxVar, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        qim0 qim0Var3;
        j2i j2iVarR;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2055777859);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(if5Var) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | (x340Var2.h(z) ? 2048 : 1024) | (x340Var2.i(gbxVar) ? 16384 : 8192) | (x340Var2.h(z2) ? 131072 : 65536) | (x340Var2.h(z3) ? 1048576 : 524288) | (x340Var2.g(str3) ? 8388608 : 4194304) | (x340Var2.i(iu30Var) ? 67108864 : 33554432) | 805306368;
        char c = x340Var2.g(laxVar) ? (char) 4 : (char) 2;
        if (x340Var2.Y(i2 & 1, ((306783379 & i2) == 306783378 && (c & 3) == 2) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var2.b0();
                qim0Var3 = qim0Var;
            }
            x340Var2.s();
            uvx uvxVarB = uvx.b((uvx) x340Var2.k(vvx.a), 0, (tvx) null, (p3v) null, 30);
            List listSingletonList = (z3 && z2) ? Collections.singletonList(new m4d1(1)) : z6x.a;
            x340Var2.i0(-82409324);
            uwr uwrVar = cbx.a;
            List list = listSingletonList;
            boolean z4 = true;
            j2i j2iVarB = if5Var.b((qim0) null, cbx.d(x340Var2).j, (u7h) null, x340Var2, 4096 | ((i2 << 6) & 7168), 5);
            x340Var2.r(false);
            if (j2iVarB == null) {
                x340Var2.i0(1740328070);
                x340Var2.r(false);
                j2iVarR = null;
            } else {
                x340Var2.i0(1740328071);
                j2iVarR = apo.r(-697027311, new ak10(j2iVarB, (byte) 27), x340Var2);
                x340Var2.r(false);
            }
            j2i j2iVarZ = i9p1.z(list, j2iVarR);
            qim0 qim0VarQ = m0p1.q(u291.f(qim0Var3, 1.0f), laxVar, iu30Var);
            boolean z5 = ((i2 & 7168) == 2048) | ((29360128 & i2) == 8388608);
            if ((((c & 14) ^ 6) <= 4 || !x340Var2.i(laxVar)) && (c & 6) != 4) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object objT = x340Var2.T();
            if (z6 || objT == fkj0.X) {
                objT = new c30(str3, z, laxVar, (byte) 26);
                x340Var2.s0(objT);
            }
            jto1.b(anm1.N("MultipleChoiceOptionRow", s161.b(qim0VarQ, false, (iu30) objT)), uvxVarB, mmo1.z(laxVar, x340Var2), false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, (xu30) null, (xu30) null, j2iVarZ, apo.r(-601233302, new yxm0(z3, z2, z), x340Var2), (xu30) null, (xu30) null, apo.r(-858937977, new xo6(str, str2, (byte) 9), x340Var2), x340Var2, 64 | ((i2 << 6) & 3670016), 196992, 26552);
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vii0(str, if5Var, str2, z, gbxVar, z2, z3, str3, iu30Var, qim0Var2, laxVar, i);
        }
    }

    public static final void g(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-452506672);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            af5 af5VarK = bro1.k(str, str2, x340Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            qim0 qim0Var3 = nim0.a;
            uwo1.f(af5VarK, qim0Var3, lee1Var, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 48, 0, 4088);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:107:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0156  */
    /* JADX WARN: Code duplicated, block: B:111:0x0192  */
    /* JADX WARN: Code duplicated, block: B:113:0x0199  */
    /* JADX WARN: Code duplicated, block: B:114:0x019f  */
    /* JADX WARN: Code duplicated, block: B:117:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0203  */
    /* JADX WARN: Code duplicated, block: B:125:0x021b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0286  */
    /* JADX WARN: Code duplicated, block: B:133:0x029d  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
    /* JADX WARN: Code duplicated, block: B:96:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141  */
    public static final void h(String str, if5 if5Var, c380 c380Var, qim0 qim0Var, if5 if5Var2, lax laxVar, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        qim0 qim0Var3;
        boolean z4;
        if5 if5Var3;
        h311 h311VarV;
        int i7;
        qim0 qim0Var4;
        if5 if5Var4;
        boolean z5;
        int i8;
        boolean z6;
        Object objT;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z7;
        boolean z8;
        xu30 xu30Var;
        Object objT2;
        boolean z9;
        boolean z10;
        if5 if5Var5;
        Iterator it;
        lax laxVar2;
        lax laxVar3;
        String str2;
        boolean zI;
        int i9;
        int i10;
        boolean zI2;
        if5 if5Var6 = if5Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1769423186);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(if5Var) : x340Var.i(if5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(c380Var) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i10 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI2 = x340Var.g(if5Var6);
                    } else {
                        zI2 = x340Var.i(if5Var6);
                    }
                    if (zI2) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                }
                i3 |= i10;
            }
            if ((i & 196608) == 0) {
                if ((262144 & i) == 0) {
                    zI = x340Var.g(laxVar);
                } else {
                    zI = x340Var.i(laxVar);
                }
                if (zI) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i6 & 1, z3)) {
                    x340Var.d0();
                    i7 = i & 1;
                    qim0Var4 = nim0.a;
                    if (i7 != 0 || x340Var.E()) {
                        if (i11 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            if5Var6 = new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15);
                        }
                        if5Var4 = if5Var6;
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        i8 = i6;
                    } else {
                        x340Var.b0();
                        if5Var4 = if5Var6;
                        qim0Var2 = qim0Var2;
                        i8 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                        z5 = z2;
                    }
                    x340Var.s();
                    qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                    z6 = (((i8 & 458752) ^ 196608) <= 131072 && x340Var.i(laxVar)) || (i8 & 196608) == 131072;
                    objT = x340Var.T();
                    if (z6 || objT == m4cVar) {
                        objT = new xkm0(laxVar, (byte) 7);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarF2 = nho1.F(anm1.N("MultipleChoiceSettingRow", s161.b(qim0VarF, false, (iu30) objT)));
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
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
                    if (if5Var == null) {
                        x340Var.i0(533419951);
                        x340Var.r(false);
                        z8 = false;
                        z7 = true;
                        xu30Var = null;
                    } else {
                        x340Var.i0(-1229718894);
                        z7 = true;
                        z8 = false;
                        xu30 xu30VarB = if5Var.b((qim0) null, (lee1) null, (u7h) null, x340Var, 4096 | ((i8 << 6) & 7168), 7);
                        x340Var.r(false);
                        xu30Var = xu30VarB;
                    }
                    if (str == null || xu30Var != null) {
                        x340Var.i0(533500118);
                        max maxVarZ = mmo1.z(laxVar, x340Var);
                        qim0 qim0VarF3 = u291.f(qim0Var4, 1.0f);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = xjm0.Y0;
                            x340Var.s0(objT2);
                        }
                        z9 = z8;
                        jto1.b(s161.b(qim0VarF3, z7, (iu30) objT2), (uvx) null, maxVarZ, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(279944195, new qdg0(str, (byte) 11), x340Var), x340Var, 0, 196608, 30714);
                        z10 = z7;
                        if5Var5 = if5Var4;
                        cso1.s(if5Var5, (qim0) null, laxVar, (hux) null, x340Var, ((i8 >> 12) & 14) | 8 | ((i8 >> 9) & 896), 10);
                        x340Var.r(z9);
                    } else {
                        x340Var.i0(533815326);
                        x340Var.r(z8);
                        z9 = z8;
                        z10 = z7;
                        if5Var5 = if5Var4;
                    }
                    x340Var.i0(-1229705065);
                    it = c380Var.iterator();
                    while (it.hasNext()) {
                        zxm0 zxm0Var = (zxm0) it.next();
                        String str3 = zxm0Var.a;
                        if5 if5Var7 = zxm0Var.b;
                        String str4 = zxm0Var.c;
                        boolean z11 = zxm0Var.d;
                        gbx gbxVar = zxm0Var.e;
                        laxVar2 = zxm0Var.g;
                        if (!(laxVar2 instanceof gax)) {
                            laxVar2 = null;
                        }
                        if (laxVar2 == null) {
                            laxVar3 = laxVar;
                        } else {
                            laxVar3 = laxVar2;
                        }
                        if (z5 || str == null || (ihc1.y0(str) ^ z10) != z10) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        f(str3, if5Var7, str4, z11, gbxVar, zxm0Var.h, zxm0Var.i, str2, zxm0Var.f, null, laxVar3, x340Var, 64);
                    }
                    x340Var.r(z9);
                    x340Var.r(z10);
                    qim0Var3 = qim0Var2;
                    if5Var3 = if5Var5;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    if5Var3 = if5Var6;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zc5(str, if5Var, c380Var, qim0Var3, if5Var3, laxVar, z4, i, i2);
                }
            }
            i3 |= 1572864;
            z2 = z;
            i6 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                x340Var.d0();
                i7 = i & 1;
                qim0Var4 = nim0.a;
                if (i7 != 0) {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        if5Var6 = new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15);
                    }
                    if5Var4 = if5Var6;
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    i8 = i6;
                } else {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        if5Var6 = new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15);
                    }
                    if5Var4 = if5Var6;
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    i8 = i6;
                }
                x340Var.s();
                qim0 qim0VarF4 = u291.f(qim0Var2, 1.0f);
                if (((i8 & 458752) ^ 196608) <= 131072) {
                }
                objT = x340Var.T();
                if (z6) {
                    objT = new xkm0(laxVar, (byte) 7);
                    x340Var.s0(objT);
                } else {
                    objT = new xkm0(laxVar, (byte) 7);
                    x340Var.s0(objT);
                }
                qim0 qim0VarF5 = nho1.F(anm1.N("MultipleChoiceSettingRow", s161.b(qim0VarF4, false, (iu30) objT)));
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF5);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (if5Var == null) {
                    x340Var.i0(533419951);
                    x340Var.r(false);
                    z8 = false;
                    z7 = true;
                    xu30Var = null;
                } else {
                    x340Var.i0(-1229718894);
                    z7 = true;
                    z8 = false;
                    xu30 xu30VarB2 = if5Var.b((qim0) null, (lee1) null, (u7h) null, x340Var, 4096 | ((i8 << 6) & 7168), 7);
                    x340Var.r(false);
                    xu30Var = xu30VarB2;
                }
                if (str == null) {
                    x340Var.i0(533500118);
                    max maxVarZ2 = mmo1.z(laxVar, x340Var);
                    qim0 qim0VarF6 = u291.f(qim0Var4, 1.0f);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = xjm0.Y0;
                        x340Var.s0(objT2);
                    }
                    z9 = z8;
                    jto1.b(s161.b(qim0VarF6, z7, (iu30) objT2), (uvx) null, maxVarZ2, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(279944195, new qdg0(str, (byte) 11), x340Var), x340Var, 0, 196608, 30714);
                    z10 = z7;
                    if5Var5 = if5Var4;
                    cso1.s(if5Var5, (qim0) null, laxVar, (hux) null, x340Var, ((i8 >> 12) & 14) | 8 | ((i8 >> 9) & 896), 10);
                    x340Var.r(z9);
                } else {
                    x340Var.i0(533500118);
                    max maxVarZ3 = mmo1.z(laxVar, x340Var);
                    qim0 qim0VarF7 = u291.f(qim0Var4, 1.0f);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = xjm0.Y0;
                        x340Var.s0(objT2);
                    }
                    z9 = z8;
                    jto1.b(s161.b(qim0VarF7, z7, (iu30) objT2), (uvx) null, maxVarZ3, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(279944195, new qdg0(str, (byte) 11), x340Var), x340Var, 0, 196608, 30714);
                    z10 = z7;
                    if5Var5 = if5Var4;
                    cso1.s(if5Var5, (qim0) null, laxVar, (hux) null, x340Var, ((i8 >> 12) & 14) | 8 | ((i8 >> 9) & 896), 10);
                    x340Var.r(z9);
                }
                x340Var.i0(-1229705065);
                it = c380Var.iterator();
                while (it.hasNext()) {
                    zxm0 zxm0Var2 = (zxm0) it.next();
                    String str5 = zxm0Var2.a;
                    if5 if5Var8 = zxm0Var2.b;
                    String str6 = zxm0Var2.c;
                    boolean z12 = zxm0Var2.d;
                    gbx gbxVar2 = zxm0Var2.e;
                    laxVar2 = zxm0Var2.g;
                    if (!(laxVar2 instanceof gax)) {
                        laxVar2 = null;
                    }
                    if (laxVar2 == null) {
                        laxVar3 = laxVar;
                    } else {
                        laxVar3 = laxVar2;
                    }
                    if (z5) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    f(str5, if5Var8, str6, z12, gbxVar2, zxm0Var2.h, zxm0Var2.i, str2, zxm0Var2.f, null, laxVar3, x340Var, 64);
                }
                x340Var.r(z9);
                x340Var.r(z10);
                qim0Var3 = qim0Var2;
                if5Var3 = if5Var5;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
                if5Var3 = if5Var6;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zc5(str, if5Var, c380Var, qim0Var3, if5Var3, laxVar, z4, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i10 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zI2 = x340Var.g(if5Var6);
                } else {
                    zI2 = x340Var.i(if5Var6);
                }
                if (zI2) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
            }
            i3 |= i10;
        }
        if ((i & 196608) == 0) {
            if ((262144 & i) == 0) {
                zI = x340Var.g(laxVar);
            } else {
                zI = x340Var.i(laxVar);
            }
            if (zI) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                x340Var.d0();
                i7 = i & 1;
                qim0Var4 = nim0.a;
                if (i7 != 0) {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        if5Var6 = new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15);
                    }
                    if5Var4 = if5Var6;
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    i8 = i6;
                } else {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        if5Var6 = new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15);
                    }
                    if5Var4 = if5Var6;
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    i8 = i6;
                }
                x340Var.s();
                qim0 qim0VarF8 = u291.f(qim0Var2, 1.0f);
                if (((i8 & 458752) ^ 196608) <= 131072) {
                }
                objT = x340Var.T();
                if (z6) {
                    objT = new xkm0(laxVar, (byte) 7);
                    x340Var.s0(objT);
                } else {
                    objT = new xkm0(laxVar, (byte) 7);
                    x340Var.s0(objT);
                }
                qim0 qim0VarF9 = nho1.F(anm1.N("MultipleChoiceSettingRow", s161.b(qim0VarF8, false, (iu30) objT)));
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF9);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (if5Var == null) {
                    x340Var.i0(533419951);
                    x340Var.r(false);
                    z8 = false;
                    z7 = true;
                    xu30Var = null;
                } else {
                    x340Var.i0(-1229718894);
                    z7 = true;
                    z8 = false;
                    xu30 xu30VarB3 = if5Var.b((qim0) null, (lee1) null, (u7h) null, x340Var, 4096 | ((i8 << 6) & 7168), 7);
                    x340Var.r(false);
                    xu30Var = xu30VarB3;
                }
                if (str == null) {
                    x340Var.i0(533500118);
                    max maxVarZ4 = mmo1.z(laxVar, x340Var);
                    qim0 qim0VarF10 = u291.f(qim0Var4, 1.0f);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = xjm0.Y0;
                        x340Var.s0(objT2);
                    }
                    z9 = z8;
                    jto1.b(s161.b(qim0VarF10, z7, (iu30) objT2), (uvx) null, maxVarZ4, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(279944195, new qdg0(str, (byte) 11), x340Var), x340Var, 0, 196608, 30714);
                    z10 = z7;
                    if5Var5 = if5Var4;
                    cso1.s(if5Var5, (qim0) null, laxVar, (hux) null, x340Var, ((i8 >> 12) & 14) | 8 | ((i8 >> 9) & 896), 10);
                    x340Var.r(z9);
                } else {
                    x340Var.i0(533500118);
                    max maxVarZ5 = mmo1.z(laxVar, x340Var);
                    qim0 qim0VarF11 = u291.f(qim0Var4, 1.0f);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = xjm0.Y0;
                        x340Var.s0(objT2);
                    }
                    z9 = z8;
                    jto1.b(s161.b(qim0VarF11, z7, (iu30) objT2), (uvx) null, maxVarZ5, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(279944195, new qdg0(str, (byte) 11), x340Var), x340Var, 0, 196608, 30714);
                    z10 = z7;
                    if5Var5 = if5Var4;
                    cso1.s(if5Var5, (qim0) null, laxVar, (hux) null, x340Var, ((i8 >> 12) & 14) | 8 | ((i8 >> 9) & 896), 10);
                    x340Var.r(z9);
                }
                x340Var.i0(-1229705065);
                it = c380Var.iterator();
                while (it.hasNext()) {
                    zxm0 zxm0Var3 = (zxm0) it.next();
                    String str7 = zxm0Var3.a;
                    if5 if5Var9 = zxm0Var3.b;
                    String str8 = zxm0Var3.c;
                    boolean z13 = zxm0Var3.d;
                    gbx gbxVar3 = zxm0Var3.e;
                    laxVar2 = zxm0Var3.g;
                    if (!(laxVar2 instanceof gax)) {
                        laxVar2 = null;
                    }
                    if (laxVar2 == null) {
                        laxVar3 = laxVar;
                    } else {
                        laxVar3 = laxVar2;
                    }
                    if (z5) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    f(str7, if5Var9, str8, z13, gbxVar3, zxm0Var3.h, zxm0Var3.i, str2, zxm0Var3.f, null, laxVar3, x340Var, 64);
                }
                x340Var.r(z9);
                x340Var.r(z10);
                qim0Var3 = qim0Var2;
                if5Var3 = if5Var5;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
                if5Var3 = if5Var6;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zc5(str, if5Var, c380Var, qim0Var3, if5Var3, laxVar, z4, i, i2);
            }
        }
        i3 |= 1572864;
        z2 = z;
        i6 = i3;
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i6 & 1, z3)) {
            x340Var.d0();
            i7 = i & 1;
            qim0Var4 = nim0.a;
            if (i7 != 0) {
                if (i11 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                    if5Var6 = new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15);
                }
                if5Var4 = if5Var6;
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                i8 = i6;
            } else {
                if (i11 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                    if5Var6 = new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15);
                }
                if5Var4 = if5Var6;
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                i8 = i6;
            }
            x340Var.s();
            qim0 qim0VarF12 = u291.f(qim0Var2, 1.0f);
            if (((i8 & 458752) ^ 196608) <= 131072) {
            }
            objT = x340Var.T();
            if (z6) {
                objT = new xkm0(laxVar, (byte) 7);
                x340Var.s0(objT);
            } else {
                objT = new xkm0(laxVar, (byte) 7);
                x340Var.s0(objT);
            }
            qim0 qim0VarF13 = nho1.F(anm1.N("MultipleChoiceSettingRow", s161.b(qim0VarF12, false, (iu30) objT)));
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF13);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            if (if5Var == null) {
                x340Var.i0(533419951);
                x340Var.r(false);
                z8 = false;
                z7 = true;
                xu30Var = null;
            } else {
                x340Var.i0(-1229718894);
                z7 = true;
                z8 = false;
                xu30 xu30VarB4 = if5Var.b((qim0) null, (lee1) null, (u7h) null, x340Var, 4096 | ((i8 << 6) & 7168), 7);
                x340Var.r(false);
                xu30Var = xu30VarB4;
            }
            if (str == null) {
                x340Var.i0(533500118);
                max maxVarZ6 = mmo1.z(laxVar, x340Var);
                qim0 qim0VarF14 = u291.f(qim0Var4, 1.0f);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = xjm0.Y0;
                    x340Var.s0(objT2);
                }
                z9 = z8;
                jto1.b(s161.b(qim0VarF14, z7, (iu30) objT2), (uvx) null, maxVarZ6, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(279944195, new qdg0(str, (byte) 11), x340Var), x340Var, 0, 196608, 30714);
                z10 = z7;
                if5Var5 = if5Var4;
                cso1.s(if5Var5, (qim0) null, laxVar, (hux) null, x340Var, ((i8 >> 12) & 14) | 8 | ((i8 >> 9) & 896), 10);
                x340Var.r(z9);
            } else {
                x340Var.i0(533500118);
                max maxVarZ7 = mmo1.z(laxVar, x340Var);
                qim0 qim0VarF15 = u291.f(qim0Var4, 1.0f);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = xjm0.Y0;
                    x340Var.s0(objT2);
                }
                z9 = z8;
                jto1.b(s161.b(qim0VarF15, z7, (iu30) objT2), (uvx) null, maxVarZ7, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(279944195, new qdg0(str, (byte) 11), x340Var), x340Var, 0, 196608, 30714);
                z10 = z7;
                if5Var5 = if5Var4;
                cso1.s(if5Var5, (qim0) null, laxVar, (hux) null, x340Var, ((i8 >> 12) & 14) | 8 | ((i8 >> 9) & 896), 10);
                x340Var.r(z9);
            }
            x340Var.i0(-1229705065);
            it = c380Var.iterator();
            while (it.hasNext()) {
                zxm0 zxm0Var4 = (zxm0) it.next();
                String str9 = zxm0Var4.a;
                if5 if5Var10 = zxm0Var4.b;
                String str10 = zxm0Var4.c;
                boolean z14 = zxm0Var4.d;
                gbx gbxVar4 = zxm0Var4.e;
                laxVar2 = zxm0Var4.g;
                if (!(laxVar2 instanceof gax)) {
                    laxVar2 = null;
                }
                if (laxVar2 == null) {
                    laxVar3 = laxVar;
                } else {
                    laxVar3 = laxVar2;
                }
                if (z5) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                f(str9, if5Var10, str10, z14, gbxVar4, zxm0Var4.h, zxm0Var4.i, str2, zxm0Var4.f, null, laxVar3, x340Var, 64);
            }
            x340Var.r(z9);
            x340Var.r(z10);
            qim0Var3 = qim0Var2;
            if5Var3 = if5Var5;
            z4 = z5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            z4 = z2;
            if5Var3 = if5Var6;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zc5(str, if5Var, c380Var, qim0Var3, if5Var3, laxVar, z4, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(i541 i541Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, Function0 function7, Function0 function8, String str, String str2, String str3, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1343102551);
        int i2 = i | (x340Var.g(i541Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | (x340Var.i(function3) ? 16384 : 8192) | (x340Var.i(function4) ? 131072 : 65536) | (x340Var.i(function5) ? 1048576 : 524288) | (x340Var.i(function6) ? 8388608 : 4194304) | (x340Var.i(function7) ? 67108864 : 33554432) | (x340Var.i(function8) ? 536870912 : 268435456);
        int i3 = (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 8.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (i541Var instanceof apq0) {
                x340Var.i0(-1961865745);
                apq0 apq0Var = (apq0) i541Var;
                ot11.e(apq0Var.d, (i2 >> 15) & 896, function6, x340Var, (qim0) null, apq0Var.e);
                x340Var.r(false);
                z = true;
            } else {
                if (i541Var instanceof bpq0) {
                    x340Var.i0(-688077430);
                    Context context = ((View) x340Var.k(AndroidCompositionLocals_androidKt.f)).getContext();
                    boolean z2 = ((bpq0) i541Var).d;
                    boolean zI = x340Var.i(context) | ((i2 & 234881024) == 67108864);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new shq0(context, function7, (byte) 1);
                        x340Var.s0(objT);
                    }
                    int i4 = i3 << 9;
                    zho1.j(z2, function6, (Function0) objT, str, str2, str3, x340Var, ((i2 >> 18) & 112) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752));
                    x340Var.r(false);
                } else if (i541Var instanceof gpq0) {
                    x340Var.i0(-1961841263);
                    qxy0.f(function8, function0, function1, function2, function3, function4, function5, (gpq0) i541Var, (qim0) null, x340Var, ((i2 >> 27) & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 57344) | (i2 & 458752) | (3670016 & i2) | ((i2 << 21) & 29360128));
                    x340Var.r(false);
                } else {
                    if (!i541Var.equals(cpq0.d)) {
                        throw p3d1.k(x340Var, -1961866669, false);
                    }
                    x340Var.i0(-686962081);
                    x340Var.r(false);
                }
                z = true;
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new woq0(i541Var, function0, function1, function2, function3, function4, function5, function6, function7, function8, str, str2, str3, qim0Var2, i, (byte) 0);
        }
    }

    public static final void j(z6x0 z6x0Var, iu30 iu30Var, sdx0 sdx0Var, v7x0 v7x0Var, o3x0 o3x0Var, kt91 kt91Var, b0k b0kVar, int i) {
        int i2;
        z6x0 z6x0Var2;
        iu30 iu30Var2;
        x340 x340Var;
        wat watVar;
        boolean z;
        boolean z2;
        Object obj = fkj0.X;
        wbk1 wbk1Var = z6x0Var.Y;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2115462105);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(z6x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(sdx0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var2.g(v7x0Var) : x340Var2.i(v7x0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? x340Var2.g(o3x0Var) : x340Var2.i(o3x0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(kt91Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 74899) != 74898)) {
            boolean zG = x340Var2.g(z6x0Var);
            Object objT = x340Var2.T();
            if (zG || objT == obj) {
                objT = ob51.o(z6x0Var);
                x340Var2.s0(objT);
            }
            r7x0 r7x0Var = (r7x0) objT;
            ven0 ven0VarG = rwq.g(sdx0Var.i, z6x.a, (o8n) null, x340Var2, 48, 2);
            Object objT2 = x340Var2.T();
            if (objT2 == obj) {
                objT2 = yoi1.g(sdx0Var.j.distinctUntilChanged());
                x340Var2.s0(objT2);
            }
            ven0 ven0VarG2 = rwq.g((mr20) objT2, Boolean.TRUE, (o8n) null, x340Var2, 48, 2);
            List list = (List) ven0VarG.getValue();
            boolean zG2 = x340Var2.g(list);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == obj) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((odx0) it.next()).b());
                }
                objT3 = o7h.j0(arrayList);
                x340Var2.s0(objT3);
            }
            List list3 = (List) objT3;
            boolean zG3 = x340Var2.g(list3);
            Object objT4 = x340Var2.T();
            if (zG3 || objT4 == obj) {
                Iterator it2 = list3.iterator();
                int iE = 0;
                while (it2.hasNext()) {
                    iE = ((z511) it2.next()).e() + iE;
                }
                objT4 = bb00.h(iE, x340Var2);
            }
            err0 err0Var = (hdn0) objT4;
            boolean zI = x340Var2.i(err0Var) | x340Var2.i(list3);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == obj) {
                objT5 = new hzu0(list3, err0Var, (byte) 27);
                x340Var2.s0(objT5);
            }
            qxd0.i(list3, (iu30) objT5, x340Var2);
            int iS = err0Var.s();
            Object objT6 = x340Var2.T();
            if (objT6 == obj) {
                objT6 = new lww0();
                x340Var2.s0(objT6);
            }
            lww0 lww0Var = (lww0) objT6;
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            wat watVar2 = (wat) x340Var2.k(t4k.h);
            int i4 = i3 & 112;
            boolean zI2 = x340Var2.i(z6x0Var) | x340Var2.i(kt91Var) | x340Var2.i(context) | (i4 == 32);
            Object objT7 = x340Var2.T();
            if (zI2 || objT7 == obj) {
                watVar = watVar2;
                z = false;
                vvu0 vvu0Var = new vvu0(z6x0Var, kt91Var, context, iu30Var, (byte) 5);
                x340Var2.s0(vvu0Var);
                objT7 = vvu0Var;
            } else {
                watVar = watVar2;
                z = false;
            }
            qxd0.i(wbk1Var, (iu30) objT7, x340Var2);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarL = bmq0.L(dug.f(qim0VarD, cbx.a(x340Var2).a.c, d4o1.a), lww0Var.e, (g6o0) null);
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarL);
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
            zzq0 zzq0VarJ = uyn1.j(0.0f, watVar.N0(lww0Var.c.s() + lww0Var.a.s()), 0.0f, 0.0f, 13);
            u85 u85Var = (erl1) x340Var2.k(szf0.b);
            if (u85Var == null) {
                x340Var2.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var2).g;
                z2 = false;
            } else {
                z2 = false;
                x340Var2.i0(-241885792);
            }
            x340Var2.r(z2);
            hdh hdhVarN = lnn1.n(zzq0VarJ, hqq0.C(u85Var, x340Var2));
            boolean zI3 = x340Var2.i(ven0VarG) | x340Var2.e(iS) | x340Var2.i(ven0VarG2) | x340Var2.i(z6x0Var) | x340Var2.i(context) | (i4 == 32) | ((i3 & 57344) == 16384 || ((i3 & 32768) != 0 && x340Var2.i(o3x0Var)));
            Object objT8 = x340Var2.T();
            if (zI3 || objT8 == obj) {
                ovj ovjVar = new ovj(iS, ven0VarG, ven0VarG2, z6x0Var, context, iu30Var, o3x0Var);
                z6x0Var2 = z6x0Var;
                iu30Var2 = iu30Var;
                x340Var2.s0(ovjVar);
                objT8 = ovjVar;
            } else {
                iu30Var2 = iu30Var;
                z6x0Var2 = z6x0Var;
            }
            ujo1.d((qim0) null, (xtb0) null, hdhVarN, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT8, x340Var2, 0, 507);
            x340Var = x340Var2;
            if (r7x0Var != null) {
                x340Var.i0(634599021);
                boolean z3 = wbk1Var == wbk1.c;
                boolean zJ = u890.j(z6x0Var2.f, Boolean.TRUE);
                String str = z6x0Var2.g;
                boolean z4 = i4 == 32;
                Object objT9 = x340Var.T();
                if (z4 || objT9 == obj) {
                    objT9 = new ppv0(iu30Var2, (byte) 8);
                    x340Var.s0(objT9);
                }
                iu30 iu30Var3 = (iu30) objT9;
                boolean z5 = i4 == 32;
                Object objT10 = x340Var.T();
                if (z5 || objT10 == obj) {
                    objT10 = new h7w0(iu30Var2, (byte) 5);
                    x340Var.s0(objT10);
                }
                Function0 function0 = (Function0) objT10;
                boolean z6 = i4 == 32;
                Object objT11 = x340Var.T();
                byte b = 9;
                if (z6 || objT11 == obj) {
                    objT11 = new ppv0(iu30Var2, b);
                    x340Var.s0(objT11);
                }
                iu30 iu30Var4 = (iu30) objT11;
                boolean z7 = i4 == 32;
                Object objT12 = x340Var.T();
                if (z7 || objT12 == obj) {
                    objT12 = new h7w0(iu30Var2, (byte) 6);
                    x340Var.s0(objT12);
                }
                otw.c(v7x0Var, new t7x0(r7x0Var, lww0Var, z3, zJ, str, iu30Var3, function0, iu30Var4, (Function0) objT12), (qim0) null, (ipb1) null, x340Var, ((i3 >> 9) & 14) | 72, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(635190997);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            z6x0Var2 = z6x0Var;
            iu30Var2 = iu30Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(z6x0Var2, iu30Var2, sdx0Var, v7x0Var, o3x0Var, kt91Var, i, (byte) 18);
        }
    }

    public static final void k(c380 c380Var, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1368803878);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            l(c380Var, vu30Var, x340Var, i2 & 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt31(c380Var, vu30Var, i, (byte) 1);
        }
    }

    public static final void l(c380 c380Var, vu30 vu30Var, b0k b0kVar, int i) {
        j06 j06Var;
        vu30 vu30Var2 = vu30Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1697361171);
        j06 j06Var2 = x340Var.a;
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(vu30Var2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(uha1.a((uha1) it.next(), false, (qha1) null, 15));
                    j06Var2 = j06Var2;
                }
                j06Var = j06Var2;
                uha1[] uha1VarArr = (uha1[]) arrayList.toArray(new uha1[0]);
                objT = v8r.p(Arrays.copyOf(uha1VarArr, uha1VarArr.length));
                x340Var.s0(objT);
            } else {
                j06Var = j06Var2;
            }
            bw91 bw91Var = (bw91) objT;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            g36 g36Var = h36.c;
            mbh mbhVarA = jbh.a(g36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            String strO0 = cwl1.o0(x340Var, 2131955976);
            uwr uwrVar = cbx.a;
            bw91 bw91Var2 = bw91Var;
            g36 g36Var2 = g36Var;
            float f = 1.0f;
            uwo1.e(strO0, qim0VarF, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            x340Var.i0(122692612);
            ListIterator listIterator = bw91Var2.listIterator();
            while (true) {
                ek60 ek60Var = (ek60) listIterator;
                if (!ek60Var.hasNext()) {
                    break;
                }
                uha1 uha1Var = (uha1) ek60Var.next();
                qim0 qim0VarF2 = u291.f(nim0Var, f);
                g36 g36Var3 = g36Var2;
                mbh mbhVarA2 = jbh.a(g36Var3, eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                uvx uvxVar = new uvx((pgx) null, 2, (tvx) null, (p3v) null, 27);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                bw91 bw91Var3 = bw91Var2;
                boolean zI = ((i2 & 112) == 32) | x340Var.i(bw91Var3) | x340Var.i(uha1Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new m551(bw91Var3, uha1Var, vu30Var, (byte) 15);
                    x340Var.s0(objT2);
                }
                g36Var2 = g36Var3;
                x340 x340Var2 = x340Var;
                jto1.b(qim0VarF3, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-595134043, new aja1(uha1Var, (byte) 0), x340Var), apo.r(275687556, new aja1(uha1Var, (byte) 1), x340Var), (xu30) null, (xu30) null, apo.r(-1406814943, new aja1(uha1Var, (byte) 2), x340Var), x340Var2, 64, 197040, 26556);
                x340Var = x340Var2;
                x340Var.r(true);
                function0 = function0;
                f = 1.0f;
                bw91Var2 = bw91Var3;
            }
            vu30Var2 = vu30Var;
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt31(c380Var, vu30Var2, i, (byte) 2);
        }
    }

    public static final void m(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2085271968);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            w2g0.c((qim0) null, (tl3) null, apo.r(-618516234, new p8e1((Context) x340Var.k(AndroidCompositionLocals_androidKt.b), (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a), j2iVar, (byte) 13), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p6k1(j2iVar, i, (byte) 2);
        }
    }

    public static final ang0 n() {
        return new ang0(b7x.a);
    }

    public static final def0 p(ojf0 ojf0Var) {
        String str;
        a9h a9hVar;
        fef0 fef0Var;
        List list;
        xng1 xng1Var = ojf0Var.h;
        Object obj = null;
        xng1 xng1Var2 = xng1Var instanceof xng1 ? xng1Var : null;
        if (xng1Var2 == null || (str = xng1Var2.a) == null) {
            return null;
        }
        vpf0 vpf0Var = ojf0Var.c;
        vpf0 vpf0Var2 = vpf0Var instanceof vpf0 ? vpf0Var : null;
        if (vpf0Var2 == null || (a9hVar = vpf0Var2.a) == null || (fef0Var = a9hVar.a) == null || (list = fef0Var.c) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (nhc1.S(((def0) obj2).a, str, true)) {
                obj = obj2;
                break;
            }
        }
        return (def0) obj;
    }

    public static final String r(String str) {
        mbh0 mbh0VarM = mno1.m(Pattern.compile("checkout\\.vendorData\\[(.*)]").matcher(str), 0, str);
        return mbh0VarM != null ? (String) ((kbh0) mbh0VarM.a()).get(1) : nhc1.W(nhc1.W(str, "[", "_"), "]", "");
    }

    public static jgw s(ccs0 ccs0Var, String str, String str2) {
        ee30 ee30VarB = ccs0Var.b();
        String str3 = ee30VarB != null ? ee30VarB.a : null;
        i3g1 i3g1Var = ccs0Var.X;
        return new jgw(i3g1Var.a, i3g1Var.b, str3, r(str), str2);
    }

    public static final ogw t(ccs0 ccs0Var, int i) {
        i3g1 i3g1Var = ccs0Var.X;
        String str = i3g1Var.a;
        String str2 = ccs0Var.b;
        String str3 = i3g1Var.c;
        ee30 ee30VarB = ccs0Var.b();
        return new ogw(str, str2, str3, ee30VarB != null ? ee30VarB.a : null, i3g1Var.b, zjy.g(i));
    }

    public static final poz0 u(xwp0 xwp0Var, boolean z) {
        g1v g1vVar = g1v.b;
        g1v g1vVar2 = g1v.f;
        g1v g1vVar3 = g1v.c;
        if (!z) {
            return g1v.e;
        }
        if (!(xwp0Var instanceof hwp0)) {
            if (xwp0Var instanceof jwp0) {
                float f = ((jwp0) xwp0Var).a / 100.0f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                return new j1v(f);
            }
            if (xwp0Var instanceof lwp0) {
                return g1v.d;
            }
            if (!(xwp0Var instanceof nwp0)) {
                if ((xwp0Var instanceof pwp0) || (xwp0Var instanceof rwp0)) {
                    return g1vVar;
                }
                if (!(xwp0Var instanceof twp0)) {
                    if (!(xwp0Var instanceof vwp0)) {
                        eg.o();
                        return null;
                    }
                }
            }
            return g1vVar2;
        }
        return g1vVar3;
    }

    public static final ArrayList v(ccs0 ccs0Var) {
        c380 c380Var = ccs0Var.a.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (((xbs0) obj).b != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007b, B:29:0x0083, B:30:0x008e, B:37:0x009e, B:24:0x006a, B:39:0x00a1, B:41:0x00a6, B:42:0x00a7, B:23:0x0064, B:31:0x008f, B:33:0x0095), top: B:57:0x0021, outer: #0, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #3 {, blocks: (B:31:0x008f, B:33:0x0095), top: B:61:0x008f, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007b, B:29:0x0083, B:30:0x008e, B:37:0x009e, B:24:0x006a, B:39:0x00a1, B:41:0x00a6, B:42:0x00a7, B:23:0x0064, B:31:0x008f, B:33:0x0095), top: B:57:0x0021, outer: #0, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Path cross not found for [B:33:0x0095, B:36:0x009d], limit reached: 61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:27:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object w(p.onm r10) {
        /*
            boolean r0 = r10 instanceof p.tv40
            if (r0 == 0) goto L13
            r0 = r10
            p.tv40 r0 = (p.tv40) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.tv40 r0 = new p.tv40
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            p.d9n r1 = p.d9n.a
            int r2 = r0.f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            p.uac r2 = r0.d
            p.jfe r6 = r0.c
            p.iv91 r7 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L31
            goto L7b
        L31:
            r10 = move-exception
            goto Lb3
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L3a:
            p.hm5.M(r10)
            r10 = 6
            p.bbc r6 = p.mno1.a(r5, r3, r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r3)
            p.zf10 r2 = new p.zf10
            r7 = 27
            r2.<init>(r10, r6, r7)
            java.lang.Object r7 = p.pv91.c
            monitor-enter(r7)
            java.util.List r8 = p.pv91.i     // Catch: java.lang.Throwable -> Lbd
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> Lbd
            java.util.ArrayList r8 = p.o7h.O0(r2, r8)     // Catch: java.lang.Throwable -> Lbd
            p.pv91.i = r8     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r7)
            p.pv91.c()
            p.iv91 r7 = new p.iv91
            r7.<init>(r2, r5)
            p.uac r2 = new p.uac     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r10
        L6a:
            r0.a = r8     // Catch: java.lang.Throwable -> L31
            r0.b = r7     // Catch: java.lang.Throwable -> L31
            r0.c = r6     // Catch: java.lang.Throwable -> L31
            r0.d = r2     // Catch: java.lang.Throwable -> L31
            r0.f = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L7b
            return r1
        L7b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto La8
            java.lang.Object r10 = r2.c()     // Catch: java.lang.Throwable -> L31
            p.rih1 r10 = (p.rih1) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = p.pv91.c     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            p.rv40 r9 = p.pv91.j     // Catch: java.lang.Throwable -> La5
            p.oen0 r9 = r9.h     // Catch: java.lang.Throwable -> La5
            if (r9 == 0) goto L9d
            boolean r9 = r9.h()     // Catch: java.lang.Throwable -> La5
            if (r9 != r5) goto L9d
            r9 = r5
            goto L9e
        L9d:
            r9 = r3
        L9e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6a
            p.pv91.c()     // Catch: java.lang.Throwable -> L31
            goto L6a
        La5:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        La8:
            r6.d(r4)     // Catch: java.lang.Throwable -> Lb1
            r7.a()
            p.rih1 r10 = p.rih1.a
            return r10
        Lb1:
            r10 = move-exception
            goto Lb9
        Lb3:
            throw r10     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r0 = move-exception
            p.ulo1.j(r6, r10)     // Catch: java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.Throwable -> Lb1
        Lb9:
            r7.a()
            throw r10
        Lbd:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c921.w(p.onm):java.lang.Object");
    }

    public static final xab1 x(o8n o8nVar, int i, vu30 vu30Var) {
        return fn31.S(ov40.a, o8nVar, i, vu30Var);
    }

    public static final c9 z(ojf0 ojf0Var, Collection collection) {
        def0 def0VarE = E(ojf0Var);
        if (def0VarE == null) {
            return fg91.b;
        }
        List list = ojf0Var.c.a.a.a;
        List listZ0 = o7h.Z0(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            aef0 aef0Var = (aef0) o7h.t0(iIntValue, list);
            String opf0Var = null;
            if (aef0Var != null) {
                String str = aef0Var.b;
                String str2 = (String) o7h.t0(iIntValue, def0VarE.b);
                if (str2 != null && !ihc1.y0(str2)) {
                    opf0Var = str2;
                }
                opf0Var = new opf0(str, opf0Var);
            }
            if (opf0Var != null) {
                arrayList.add(opf0Var);
            }
        }
        return mqo1.F(arrayList);
    }
}
