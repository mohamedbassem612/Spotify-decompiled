package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wro1 {
    public static b180 a;

    public static final void A(vp71 vp71Var, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        gw70 gw70Var2;
        qim0 qim0Var2;
        String strK;
        Function0 function0;
        m4c m4cVar = fkj0.X;
        boolean z = vp71Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(199930150);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vp71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gw70Var2 = gw70Var;
            i2 |= x340Var.i(gw70Var2) ? 32 : 16;
        } else {
            gw70Var2 = gw70Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 2048 : 1024;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            List list = vp71Var.b;
            String strO = iro1.o(list);
            if (z) {
                x340Var.i0(-1000166947);
                Integer numR = sto1.r(vp71Var.d);
                if (numR == null) {
                    x340Var.i0(-1000166948);
                    x340Var.r(false);
                    strK = null;
                } else {
                    strK = kk0.k(x340Var, -1000166947, numR, x340Var, false);
                }
                x340Var.r(false);
            } else {
                strK = x0d.k(x340Var, -1000116634, 2131962351, x340Var, false);
            }
            gpx gpxVar = gpx.c;
            String strO0 = cwl1.o0(x340Var, 2131962350);
            int i3 = i2 & 896;
            boolean z2 = (i3 == 256) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new k7a1(iu30Var, vp71Var, (byte) 20);
                x340Var.s0(objT);
            }
            rgi1 rgi1Var = new rgi1(list, strO, strK, new mgi1(new pgi1(strO0, gpxVar, (Function0) objT)));
            if (z) {
                x340Var.i0(-999550016);
                boolean z3 = i3 == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new pba1(iu30Var, (byte) 29);
                    x340Var.s0(objT2);
                }
                x340Var.r(false);
                function0 = (Function0) objT2;
            } else {
                x340Var.i0(-999485722);
                x340Var.r(false);
                function0 = null;
            }
            ero1.f(rgi1Var, function0, gw70Var2, qim0Var2, x340Var, ((i2 << 3) & 896) | (i2 & 7168), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, vp71Var, gw70Var, iu30Var, qim0Var, (byte) 2);
        }
    }

    public static final void B(ArrayList arrayList, boolean z, iu30 iu30Var, vu30 vu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        vu30 vu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-173340427);
        int i3 = i & 6;
        pbh pbhVar = pbh.a;
        if (i3 == 0) {
            i2 = (x340Var.i(pbhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(arrayList) : x340Var.i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 24576) == 0) {
            vu30Var2 = vu30Var;
            i2 |= x340Var.i(vu30Var2) ? 16384 : 8192;
        } else {
            vu30Var2 = vu30Var;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(function0) ? 131072 : 65536;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, f));
            int i5 = i4 >> 6;
            s(arrayList, iu30Var2, vu30Var2, pbhVar.a(1.0f, nim0Var, false), apo.r(-612855363, new epe0((byte) 14, z), x340Var), x340Var, (14 & (i4 >> 3)) | 24576 | (i5 & 112) | (i5 & 896));
            if (function0 != null) {
                x340Var.i0(-1433445389);
                z(function0, x340Var, (i4 & 14) | ((i4 >> 12) & 112));
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0Var, 16.0f, x340Var, false);
            } else {
                x340Var.i0(-1433328147);
                x340Var.r(false);
            }
            C(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(arrayList, z, iu30Var, vu30Var, function0, i);
        }
    }

    public static final void C(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1133554101);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            String strO0 = cwl1.o0(x340Var, 2131963642);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarF, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var, 0, 0, 1696);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 28);
        }
    }

    public static final void D(nbh nbhVar, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-289313255);
        if ((i & 48) == 0) {
            i2 = (x340Var.h(z) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.d;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, f));
            if (z) {
                x340Var.i0(1068346057);
                uwo1.e(cwl1.o0(x340Var, 2131963660), u291.f(nim0Var, 1.0f), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 8.0f));
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = kei1.b1;
                    x340Var.s0(objT);
                }
                yto1.e(1, 48, 0, x340Var, s161.b(nim0Var, false, (iu30) objT));
                cvx cvxVar2 = cbx.b(x340Var).b;
                x0d.s(nim0Var, 16.0f, x340Var, false);
            } else {
                x340Var.i0(1068868841);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new se5(nbhVar, z, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void E(coi1 coi1Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, b5i1 b5i1Var, vu30 vu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        Function0 function4;
        qim0 qim0Var2;
        Function0 function5 = function2;
        Function0 function6 = function3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1851248778);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(coi1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function5) ? 16384 : 8192) | (x340Var.i(function6) ? 131072 : 65536) | 1572864 | (x340Var.g(b5i1Var) ? 8388608 : 4194304) | (x340Var.i(vu30Var) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.4f;
            gra graVar = een.h;
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            boolean z = coi1Var instanceof aoi1;
            qim0 qim0VarThen = dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a).then(z ? u291.j(f, 0.0f, 2, qim0Var2) : qim0Var2);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarThen);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            float f2 = cbx.b(x340Var).b.d;
            qim0 qim0VarW = uyn1.w(qim0VarF2, new zzq0(16.0f, f2, 16.0f, f2));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarW);
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
            boolean z3 = coi1Var instanceof xni1;
            if (z3 || (coi1Var instanceof yni1)) {
                x340Var.i0(1569772556);
                g(b5i1Var, x340Var, (i2 >> 21) & 14);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x0d.s(qim0Var2, 16.0f, x340Var, false);
            } else {
                x340Var.i0(1569891720);
                x340Var.r(false);
            }
            c(6, apo.r(-456580019, new e9f1(coi1Var, (byte) 26), x340Var), x340Var);
            if (z) {
                x340Var.i0(1851804995);
                y(function6, x340Var, ((i2 >> 12) & 112) | 6);
                x340Var.r(false);
            } else {
                if (coi1Var instanceof boi1) {
                    x340Var.i0(1851808328);
                    boi1 boi1Var = (boi1) coi1Var;
                    B(boi1Var.a, boi1Var.b, iu30Var, vu30Var, function3, x340Var, ((i2 << 6) & 7168) | 6 | ((i2 >> 12) & 57344) | (i2 & 458752));
                    function6 = function3;
                    x340Var.r(false);
                } else if (coi1Var instanceof zni1) {
                    x340Var.i0(1851817691);
                    function4 = function1;
                    t(function4, function6, x340Var, ((i2 >> 6) & 112) | 6 | ((i2 >> 9) & 896));
                    x340Var.r(false);
                    function5 = function2;
                } else {
                    function4 = function1;
                    if (z3) {
                        x340Var.i0(1851821802);
                        int i3 = i2 >> 6;
                        int i4 = 6 | (i3 & 896) | (i3 & 7168);
                        function5 = function2;
                        e(cwl1.o0(x340Var, 2131963637), function5, function6, x340Var, i4);
                        x340Var.r(false);
                        function0 = function0;
                    } else {
                        function5 = function2;
                        if (!(coi1Var instanceof yni1)) {
                            throw p3d1.k(x340Var, 1851803611, false);
                        }
                        x340Var.i0(1851830945);
                        int i5 = ((i2 >> 6) & 7168) | (i2 & 896) | 6;
                        function0 = function0;
                        e(cwl1.o0(x340Var, 2131963651), function0, function6, x340Var, i5);
                        x340Var.r(false);
                    }
                }
                x340Var.r(true);
                x340Var.r(true);
            }
            function4 = function1;
            function5 = function2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            function0 = function0;
            function4 = function1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(coi1Var, iu30Var, function0, function4, function5, function6, qim0Var2, b5i1Var, vu30Var, i);
        }
    }

    public static final b6r0 F(j5t j5tVar, o7r0 o7r0Var, dg0 dg0Var, j7p j7pVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        dg30 dg30Var = (dg30) x340Var.k(mce0.a);
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        q7r0 q7r0VarG = cir0Var.g();
        boolean zG = x340Var.g(j5tVar) | x340Var.g(o7r0Var) | x340Var.g(dg0Var) | x340Var.g(dg30Var) | x340Var.g(cir0Var) | x340Var.g(q7r0VarG) | x340Var.g(j7pVar);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            qe41 qe41VarD = cir0Var.d();
            mr30 mr30Var = new mr30(dg30Var, false);
            Observable observableA = dg0Var.a(dg30Var);
            pa2 pa2Var = new pa2((byte) 4);
            Observable observableJust = Observable.just(Boolean.TRUE);
            b6r0 b6r0Var = new b6r0(dg30Var, qe41VarD, o7r0Var, mr30Var, (wbr0) null, (sbr0) null, new qa2(q7r0VarG, (byte) 13), s5o0.a, observableA, observableJust, pa2Var, j5tVar, new j3m(j7pVar, (byte) 27), 240);
            x340Var.s0(b6r0Var);
            objT = b6r0Var;
        }
        return (b6r0) objT;
    }

    public static final xu30 G(xk90 xk90Var, hwq hwqVar, x340 x340Var) {
        x340Var.i0(1785965740);
        if (xk90Var == null) {
            x340Var.r(false);
            return null;
        }
        String strB = xk90Var.b(hwqVar, false, x340Var, 48);
        if (strB == null) {
            x340Var.r(false);
            return null;
        }
        boolean zG = x340Var.g(strB) | x340Var.g(hwqVar);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new j2i(-493941105, new lp7(new tk90(xk90Var, strB, hwqVar), hwqVar, (byte) 0), true);
            x340Var.s0(objT);
        }
        xu30 xu30Var = (xu30) objT;
        x340Var.r(false);
        return xu30Var;
    }

    public static vzh H(String str, String str2) {
        h19 h19Var = new h19(str, str2);
        hzh hzhVarA = vzh.a(h19.class);
        hzhVarA.e = true;
        hzhVarA.f = new bzh(h19Var);
        return hzhVarA.b();
    }

    public static final String I(b5i1 b5i1Var) {
        String username;
        if (b5i1Var == null || (b5i1Var instanceof s4i1) || (b5i1Var instanceof o4i1)) {
            username = b5i1Var != null ? b5i1Var.getUsername() : null;
            return username == null ? "" : username;
        }
        if (!(b5i1Var instanceof q4i1)) {
            eg.o();
            return null;
        }
        q4i1 q4i1Var = (q4i1) b5i1Var;
        String str = q4i1Var.b.a;
        if (str != null) {
            username = ihc1.y0(str) ? null : str;
            if (username != null) {
                return username;
            }
        }
        return q4i1Var.a;
    }

    public static final xu30 J(dob1 dob1Var, maa maaVar, iu30 iu30Var, x340 x340Var) {
        x340Var.i0(-1560443242);
        Object objInvoke = iu30Var.invoke(dob1Var);
        if (objInvoke == null) {
            x340Var.r(false);
            return null;
        }
        boolean zG = x340Var.g(maaVar) | x340Var.g(objInvoke);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new j2i(-1754636103, new wf((Object) maaVar, objInvoke, (byte) 25), true);
            x340Var.s0(objT);
        }
        xu30 xu30Var = (xu30) objT;
        x340Var.r(false);
        return xu30Var;
    }

    public static vzh K(String str, k220 k220Var) {
        hzh hzhVarA = vzh.a(h19.class);
        hzhVarA.e = true;
        hzhVarA.a(wct.a(Context.class));
        hzhVarA.f = new x8a0(str, k220Var, (byte) 1);
        return hzhVarA.b();
    }

    public static final zb71 L(bc71 bc71Var) {
        if (bc71Var instanceof zb71) {
            return (zb71) bc71Var;
        }
        if (bc71Var instanceof sb71) {
            return ((sb71) bc71Var).b;
        }
        return null;
    }

    public static final boolean M(nji0 nji0Var) {
        return (nji0Var instanceof lji0) && ((lji0) nji0Var).a;
    }

    public static final mr61 N(mr61 mr61Var, String str) {
        zq61 zq61Var = mr61Var.d;
        List<i281> list = zq61Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (i281 i281Var : list) {
            if (i281Var.a.equals(str)) {
                i281Var = new i281(i281Var.a, i281Var.b, i281Var.c, i281Var.d, !i281Var.e, i281Var.f, i281Var.g);
            }
            arrayList.add(i281Var);
        }
        return mr61.a(mr61Var, (ir61) null, false, (eq61) null, new zq61(zq61Var.a, zq61Var.b, zq61Var.c, arrayList), 7);
    }

    public static final void a(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1634229871);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(-1740470212, new b4(str2, str), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1149984757);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarM = u291.m(qim0Var, 40.0f);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarM, cr31Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarE = d1u.E(2.51f, cbx.a(x340Var).a.a.a(), dug.f(qim0VarQ, cbx.a(x340Var).a.a.c(), d4o1.a), cr31Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, y580.Y);
            w0h1.a(vjx.c, isl.a, u291.r(nim0.a, 20.0f), cbx.a(x340Var).c.c, 0L, false, x340Var, vjx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 26);
        }
    }

    public static final void c(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(643814116);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = kei1.V0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            j2iVar.invoke(pbh.a, x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j2r0(j2iVar, i, (byte) 28);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(910372590);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            eso1.h(i3o1.n(2131233744, x340Var, 0), isl.a, i1p1.q(k1u.u(u291.m(qim0Var, 50.0f), -10.73f), er31.b(4.0f)), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var, 224312, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 27);
        }
    }

    public static final void e(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1125636317);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(pbh.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(nim0.a, cbx.b(x340Var).b.c));
            int i3 = i2;
            foo1.c(new gbx(z50.c, function0), new idx(13), null, null, yla.r(x340Var), null, null, null, null, null, apo.r(1210787676, new zsd1(str, (byte) 18), x340Var), x340Var, 0, 48, 2012);
            z(function1, x340Var, (i3 & 14) | ((i3 >> 6) & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mi2(i, str, function0, function1);
        }
    }

    public static final void f(nbh nbhVar, String str, String str2, b0k b0kVar, int i) {
        int i2;
        String str3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(693733743);
        if ((i & 48) == 0) {
            i2 = (b0kVar3.g(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= b0kVar3.g(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 145) != 144)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, qim0VarF, cbx.d(b0kVar3).d, cbx.a(b0kVar3).b.a, new a0e1(3), null, 2, false, new cjc0(3), 0, null, b0kVar2, (i2 >> 3) & 14, 0, 1696);
            uwo1.e(str3, ab80.o(nim0Var, cbx.b(b0kVar2).b.c, b0kVar2, nim0Var, 1.0f), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, new a0e1(3), null, 2, false, new cjc0(3), 0, null, b0kVar2, (i2 >> 6) & 14, 0, 1696);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jni1(nbhVar, str, str2, i, (byte) 0);
        }
    }

    public static final void g(b5i1 b5i1Var, b0k b0kVar, int i) {
        int i2;
        Uri uri;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2049865270);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(b5i1Var) : x340Var.i(b5i1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            af afVarB = ef.b(x340Var);
            boolean zE = x340Var.e(afVarB.ordinal());
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                objT = afVarB.a() ? hcx.e : hcx.f;
                x340Var.s0(objT);
            }
            hcx hcxVar = (hcx) objT;
            q4i1 q4i1Var = b5i1Var instanceof q4i1 ? (q4i1) b5i1Var : null;
            if (q4i1Var == null || (str = q4i1Var.b.b) == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            String username = b5i1Var != null ? b5i1Var.getUsername() : null;
            if (username == null) {
                username = "";
            }
            bmq0.a(uri, (qim0) null, hcxVar, username, I(b5i1Var), 0L, 0L, false, x340Var, 0, 226);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(b5i1Var, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:118:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x015c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x0173  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:141:0x0206  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    public static final void h(gbx gbxVar, yf yfVar, qim0 qim0Var, max maxVar, gdx gdxVar, vzq0 vzq0Var, boolean z, idn0 idn0Var, ga80 ga80Var, vu30 vu30Var, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        int i6;
        max maxVar2;
        int i7;
        gdx gdxVarR;
        vzq0 vzq0Var2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        idn0 idn0Var2;
        ga80 ga80Var2;
        max maxVar3;
        qim0 qim0Var3;
        gdx gdxVar2;
        vzq0 vzq0Var3;
        boolean z3;
        h311 h311VarV;
        vzq0 zzq0Var;
        idn0 idn0VarY;
        max maxVar4;
        vzq0 vzq0Var4;
        ga80 vchVar;
        boolean z4;
        idn0 idn0Var3;
        int i11;
        int i12;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-157495542);
        if ((i & 6) == 0) {
            i4 = (x340Var.g(gbxVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= x340Var.g(yfVar) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.g(qim0Var2) ? 256 : 128;
            }
            i5 = i4 | 3072;
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    maxVar2 = maxVar;
                    if (x340Var.g(maxVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        gdxVarR = gdxVar;
                        int i14 = x340Var.g(gdxVarR) ? 131072 : 65536;
                        i5 |= i14;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    i5 |= i14;
                } else {
                    gdxVarR = gdxVar;
                }
                if ((1572864 & i) == 0) {
                    if ((i3 & 64) == 0) {
                        vzq0Var2 = vzq0Var;
                        int i15 = x340Var.g(vzq0Var2) ? 1048576 : 524288;
                        i5 |= i15;
                    } else {
                        vzq0Var2 = vzq0Var;
                    }
                    i5 |= i15;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (x340Var.h(z)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i5 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i5 |= ((i3 & 256) == 0 || !x340Var.g(idn0Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    i5 |= 268435456;
                }
                if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i10 = i2 | i12;
                } else {
                    i10 = i2;
                }
                if ((i5 & 306783379) == 306783378 || (i10 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i5 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i13 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i6 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            gdxVarR = yla.r(x340Var);
                        }
                        if ((i3 & 64) != 0) {
                            float f = gdxVarR.b;
                            zzq0Var = new zzq0(f, f, f, f);
                            i5 &= -3670017;
                        } else {
                            zzq0Var = vzq0Var2;
                        }
                        boolean z5 = i8 == 0 ? z : true;
                        if ((i3 & 256) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i5 &= -234881025;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        int i16 = (-1879048193) & i5;
                        maxVar4 = maxVar2;
                        vzq0Var4 = zzq0Var;
                        vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                        z4 = z5;
                        idn0Var3 = idn0VarY;
                        i11 = i16;
                    } else {
                        x340Var.b0();
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i3 & 256) != 0) {
                            i5 &= -234881025;
                        }
                        i11 = i5 & (-1879048193);
                        z4 = z;
                        vchVar = ga80Var;
                        maxVar4 = maxVar2;
                        vzq0Var4 = vzq0Var2;
                        idn0Var3 = idn0Var;
                    }
                    gdx gdxVar3 = gdxVarR;
                    x340Var.s();
                    int i17 = i11 >> 6;
                    int i18 = i11 >> 3;
                    boo1.a(gbxVar, yfVar, maxVar4, gdxVar3, vzq0Var4, idn0Var3, vchVar, qim0Var2, z4, null, apo.r(-1429699194, new gjx(gdxVar3, vu30Var), x340Var), x340Var, (i18 & 7168) | (i11 & 14) | (i17 & 112) | ((i11 << 3) & 896) | (57344 & i18) | (458752 & i18) | (3670016 & i17) | ((i11 << 18) & 234881024) | ((i11 << 6) & 1879048192), 1024);
                    idn0 idn0Var4 = idn0Var3;
                    gdxVar2 = gdxVar3;
                    qim0Var3 = qim0Var2;
                    z3 = z4;
                    idn0Var2 = idn0Var4;
                    ga80Var2 = vchVar;
                    vzq0Var3 = vzq0Var4;
                    maxVar3 = maxVar4;
                } else {
                    x340Var.b0();
                    idn0Var2 = idn0Var;
                    ga80Var2 = ga80Var;
                    maxVar3 = maxVar2;
                    qim0Var3 = qim0Var2;
                    gdxVar2 = gdxVarR;
                    vzq0Var3 = vzq0Var2;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hjx(gbxVar, yfVar, qim0Var3, maxVar3, gdxVar2, vzq0Var3, z3, idn0Var2, ga80Var2, vu30Var, i, i2, i3);
                }
            }
            i5 = i4 | 27648;
            maxVar2 = maxVar;
            if ((196608 & i) == 0) {
                if ((i3 & 32) == 0) {
                    gdxVarR = gdxVar;
                    if (x340Var.g(gdxVarR)) {
                    }
                    i5 |= i14;
                } else {
                    gdxVarR = gdxVar;
                }
                i5 |= i14;
            } else {
                gdxVarR = gdxVar;
            }
            if ((1572864 & i) == 0) {
                if ((i3 & 64) == 0) {
                    vzq0Var2 = vzq0Var;
                    if (x340Var.g(vzq0Var2)) {
                    }
                    i5 |= i15;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                i5 |= i15;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i8 = i3 & 128;
            if (i8 != 0) {
                i5 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (x340Var.h(z)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i5 |= i9;
            }
            if ((i & 100663296) != 0) {
                i5 |= ((i3 & 256) == 0 || !x340Var.g(idn0Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                i5 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i10 = i2 | i12;
            } else {
                i10 = i2;
            }
            if ((i5 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var.Y(i5 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i6 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        gdxVarR = yla.r(x340Var);
                    }
                    if ((i3 & 64) != 0) {
                        float f2 = gdxVarR.b;
                        zzq0Var = new zzq0(f2, f2, f2, f2);
                        i5 &= -3670017;
                    } else {
                        zzq0Var = vzq0Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i5 &= -234881025;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    int i19 = (-1879048193) & i5;
                    maxVar4 = maxVar2;
                    vzq0Var4 = zzq0Var;
                    vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                    z4 = z5;
                    idn0Var3 = idn0VarY;
                    i11 = i19;
                } else {
                    if (i13 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i6 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        gdxVarR = yla.r(x340Var);
                    }
                    if ((i3 & 64) != 0) {
                        float f3 = gdxVarR.b;
                        zzq0Var = new zzq0(f3, f3, f3, f3);
                        i5 &= -3670017;
                    } else {
                        zzq0Var = vzq0Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i5 &= -234881025;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    int i110 = (-1879048193) & i5;
                    maxVar4 = maxVar2;
                    vzq0Var4 = zzq0Var;
                    vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                    z4 = z5;
                    idn0Var3 = idn0VarY;
                    i11 = i110;
                }
                gdx gdxVar4 = gdxVarR;
                x340Var.s();
                int i111 = i11 >> 6;
                int i112 = i11 >> 3;
                boo1.a(gbxVar, yfVar, maxVar4, gdxVar4, vzq0Var4, idn0Var3, vchVar, qim0Var2, z4, null, apo.r(-1429699194, new gjx(gdxVar4, vu30Var), x340Var), x340Var, (i112 & 7168) | (i11 & 14) | (i111 & 112) | ((i11 << 3) & 896) | (57344 & i112) | (458752 & i112) | (3670016 & i111) | ((i11 << 18) & 234881024) | ((i11 << 6) & 1879048192), 1024);
                idn0 idn0Var5 = idn0Var3;
                gdxVar2 = gdxVar4;
                qim0Var3 = qim0Var2;
                z3 = z4;
                idn0Var2 = idn0Var5;
                ga80Var2 = vchVar;
                vzq0Var3 = vzq0Var4;
                maxVar3 = maxVar4;
            } else {
                x340Var.b0();
                idn0Var2 = idn0Var;
                ga80Var2 = ga80Var;
                maxVar3 = maxVar2;
                qim0Var3 = qim0Var2;
                gdxVar2 = gdxVarR;
                vzq0Var3 = vzq0Var2;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hjx(gbxVar, yfVar, qim0Var3, maxVar3, gdxVar2, vzq0Var3, z3, idn0Var2, ga80Var2, vu30Var, i, i2, i3);
            }
        }
        i4 |= 384;
        qim0Var2 = qim0Var;
        i5 = i4 | 3072;
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                maxVar2 = maxVar;
                if (x340Var.g(maxVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i3 & 32) == 0) {
                    gdxVarR = gdxVar;
                    if (x340Var.g(gdxVarR)) {
                    }
                    i5 |= i14;
                } else {
                    gdxVarR = gdxVar;
                }
                i5 |= i14;
            } else {
                gdxVarR = gdxVar;
            }
            if ((1572864 & i) == 0) {
                if ((i3 & 64) == 0) {
                    vzq0Var2 = vzq0Var;
                    if (x340Var.g(vzq0Var2)) {
                    }
                    i5 |= i15;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                i5 |= i15;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i8 = i3 & 128;
            if (i8 != 0) {
                i5 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (x340Var.h(z)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i5 |= i9;
            }
            if ((i & 100663296) != 0) {
                i5 |= ((i3 & 256) == 0 || !x340Var.g(idn0Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                i5 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i10 = i2 | i12;
            } else {
                i10 = i2;
            }
            if ((i5 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var.Y(i5 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i6 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        gdxVarR = yla.r(x340Var);
                    }
                    if ((i3 & 64) != 0) {
                        float f4 = gdxVarR.b;
                        zzq0Var = new zzq0(f4, f4, f4, f4);
                        i5 &= -3670017;
                    } else {
                        zzq0Var = vzq0Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i5 &= -234881025;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    int i113 = (-1879048193) & i5;
                    maxVar4 = maxVar2;
                    vzq0Var4 = zzq0Var;
                    vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                    z4 = z5;
                    idn0Var3 = idn0VarY;
                    i11 = i113;
                } else {
                    if (i13 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i6 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        gdxVarR = yla.r(x340Var);
                    }
                    if ((i3 & 64) != 0) {
                        float f5 = gdxVarR.b;
                        zzq0Var = new zzq0(f5, f5, f5, f5);
                        i5 &= -3670017;
                    } else {
                        zzq0Var = vzq0Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i5 &= -234881025;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    int i114 = (-1879048193) & i5;
                    maxVar4 = maxVar2;
                    vzq0Var4 = zzq0Var;
                    vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                    z4 = z5;
                    idn0Var3 = idn0VarY;
                    i11 = i114;
                }
                gdx gdxVar5 = gdxVarR;
                x340Var.s();
                int i115 = i11 >> 6;
                int i116 = i11 >> 3;
                boo1.a(gbxVar, yfVar, maxVar4, gdxVar5, vzq0Var4, idn0Var3, vchVar, qim0Var2, z4, null, apo.r(-1429699194, new gjx(gdxVar5, vu30Var), x340Var), x340Var, (i116 & 7168) | (i11 & 14) | (i115 & 112) | ((i11 << 3) & 896) | (57344 & i116) | (458752 & i116) | (3670016 & i115) | ((i11 << 18) & 234881024) | ((i11 << 6) & 1879048192), 1024);
                idn0 idn0Var6 = idn0Var3;
                gdxVar2 = gdxVar5;
                qim0Var3 = qim0Var2;
                z3 = z4;
                idn0Var2 = idn0Var6;
                ga80Var2 = vchVar;
                vzq0Var3 = vzq0Var4;
                maxVar3 = maxVar4;
            } else {
                x340Var.b0();
                idn0Var2 = idn0Var;
                ga80Var2 = ga80Var;
                maxVar3 = maxVar2;
                qim0Var3 = qim0Var2;
                gdxVar2 = gdxVarR;
                vzq0Var3 = vzq0Var2;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hjx(gbxVar, yfVar, qim0Var3, maxVar3, gdxVar2, vzq0Var3, z3, idn0Var2, ga80Var2, vu30Var, i, i2, i3);
            }
        }
        i5 = i4 | 27648;
        maxVar2 = maxVar;
        if ((196608 & i) == 0) {
            if ((i3 & 32) == 0) {
                gdxVarR = gdxVar;
                if (x340Var.g(gdxVarR)) {
                }
                i5 |= i14;
            } else {
                gdxVarR = gdxVar;
            }
            i5 |= i14;
        } else {
            gdxVarR = gdxVar;
        }
        if ((1572864 & i) == 0) {
            if ((i3 & 64) == 0) {
                vzq0Var2 = vzq0Var;
                if (x340Var.g(vzq0Var2)) {
                }
                i5 |= i15;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i5 |= i15;
        } else {
            vzq0Var2 = vzq0Var;
        }
        i8 = i3 & 128;
        if (i8 != 0) {
            i5 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (x340Var.h(z)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i5 |= i9;
        }
        if ((i & 100663296) != 0) {
            i5 |= ((i3 & 256) == 0 || !x340Var.g(idn0Var)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i5 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            if (x340Var.i(vu30Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i2 | i12;
        } else {
            i10 = i2;
        }
        if ((i5 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var.Y(i5 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i6 != 0) {
                    maxVar2 = jax.a;
                }
                if ((i3 & 32) != 0) {
                    i5 &= -458753;
                    gdxVarR = yla.r(x340Var);
                }
                if ((i3 & 64) != 0) {
                    float f6 = gdxVarR.b;
                    zzq0Var = new zzq0(f6, f6, f6, f6);
                    i5 &= -3670017;
                } else {
                    zzq0Var = vzq0Var2;
                }
                if (i8 == 0) {
                }
                if ((i3 & 256) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i5 &= -234881025;
                } else {
                    idn0VarY = idn0Var;
                }
                int i117 = (-1879048193) & i5;
                maxVar4 = maxVar2;
                vzq0Var4 = zzq0Var;
                vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                z4 = z5;
                idn0Var3 = idn0VarY;
                i11 = i117;
            } else {
                if (i13 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i6 != 0) {
                    maxVar2 = jax.a;
                }
                if ((i3 & 32) != 0) {
                    i5 &= -458753;
                    gdxVarR = yla.r(x340Var);
                }
                if ((i3 & 64) != 0) {
                    float f7 = gdxVarR.b;
                    zzq0Var = new zzq0(f7, f7, f7, f7);
                    i5 &= -3670017;
                } else {
                    zzq0Var = vzq0Var2;
                }
                if (i8 == 0) {
                }
                if ((i3 & 256) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i5 &= -234881025;
                } else {
                    idn0VarY = idn0Var;
                }
                int i118 = (-1879048193) & i5;
                maxVar4 = maxVar2;
                vzq0Var4 = zzq0Var;
                vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                z4 = z5;
                idn0Var3 = idn0VarY;
                i11 = i118;
            }
            gdx gdxVar6 = gdxVarR;
            x340Var.s();
            int i119 = i11 >> 6;
            int i1110 = i11 >> 3;
            boo1.a(gbxVar, yfVar, maxVar4, gdxVar6, vzq0Var4, idn0Var3, vchVar, qim0Var2, z4, null, apo.r(-1429699194, new gjx(gdxVar6, vu30Var), x340Var), x340Var, (i1110 & 7168) | (i11 & 14) | (i119 & 112) | ((i11 << 3) & 896) | (57344 & i1110) | (458752 & i1110) | (3670016 & i119) | ((i11 << 18) & 234881024) | ((i11 << 6) & 1879048192), 1024);
            idn0 idn0Var7 = idn0Var3;
            gdxVar2 = gdxVar6;
            qim0Var3 = qim0Var2;
            z3 = z4;
            idn0Var2 = idn0Var7;
            ga80Var2 = vchVar;
            vzq0Var3 = vzq0Var4;
            maxVar3 = maxVar4;
        } else {
            x340Var.b0();
            idn0Var2 = idn0Var;
            ga80Var2 = ga80Var;
            maxVar3 = maxVar2;
            qim0Var3 = qim0Var2;
            gdxVar2 = gdxVarR;
            vzq0Var3 = vzq0Var2;
            z3 = z;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hjx(gbxVar, yfVar, qim0Var3, maxVar3, gdxVar2, vzq0Var3, z3, idn0Var2, ga80Var2, vu30Var, i, i2, i3);
        }
    }

    public static final void i(boolean z, iu30 iu30Var, yf yfVar, qim0 qim0Var, yf yfVar2, max maxVar, gdx gdxVar, vzq0 vzq0Var, boolean z2, idn0 idn0Var, ga80 ga80Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        iu30 iu30Var2;
        yf yfVar3;
        yf yfVar4;
        vzq0 zzq0Var;
        ga80 ga80Var2;
        vzq0 vzq0Var2;
        idn0 idn0Var2;
        int i4;
        idn0 idn0Var3;
        ga80 vchVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1251811980);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i3 |= x340Var.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            yfVar3 = yfVar;
            i3 |= x340Var.g(yfVar3) ? 256 : 128;
        } else {
            yfVar3 = yfVar;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            yfVar4 = yfVar2;
            i3 |= x340Var.g(yfVar4) ? 16384 : 8192;
        } else {
            yfVar4 = yfVar2;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.g(maxVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var.g(gdxVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                zzq0Var = vzq0Var;
                int i5 = x340Var.g(zzq0Var) ? 8388608 : 4194304;
                i3 |= i5;
            } else {
                zzq0Var = vzq0Var;
            }
            i3 |= i5;
        } else {
            zzq0Var = vzq0Var;
        }
        if ((100663296 & i) == 0) {
            i3 |= x340Var.h(z2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= 268435456;
        }
        if (x340Var.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 128) != 0) {
                    float f = gdxVar.b;
                    i3 &= -29360129;
                    zzq0Var = new zzq0(f, f, f, f);
                }
                idn0 idn0VarY = zso1.Y(x340Var);
                i4 = i3 & (-1879048193);
                yf yfVar5 = z ? yfVar4 : yfVar3;
                idn0Var3 = idn0VarY;
                vchVar = new vch(vno1.o((hw61) yfVar5.b, x340Var, 0));
            } else {
                x340Var.b0();
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                }
                i4 = i3 & (-1879048193);
                idn0Var3 = idn0Var;
                vchVar = ga80Var;
            }
            x340Var.s();
            int i6 = i4 >> 3;
            yf yfVar6 = yfVar3;
            vzq0 vzq0Var3 = zzq0Var;
            boo1.b(z, iu30Var2, yfVar6, yfVar2, maxVar, gdxVar, vzq0Var3, idn0Var3, vchVar, qim0Var, z2, null, apo.r(66198281, new ozw(gdxVar, j2iVar, (byte) 15), x340Var), x340Var, (i6 & 3670016) | (i6 & 7168) | (i4 & 1022) | (57344 & i6) | (458752 & i6) | (1879048192 & (i4 << 18)), ((i4 >> 24) & 14) | 384, 2048);
            idn0Var2 = idn0Var3;
            ga80Var2 = vchVar;
            vzq0Var2 = vzq0Var3;
        } else {
            x340Var.b0();
            ga80Var2 = ga80Var;
            vzq0Var2 = zzq0Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ijx(z, iu30Var, yfVar, qim0Var, yfVar2, maxVar, gdxVar, vzq0Var2, z2, idn0Var2, ga80Var2, j2iVar, i, i2);
        }
    }

    public static final void j(gdx gdxVar, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1039709831);
        int i2 = (x340Var.g(gdxVar) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            float f = gdxVar.d;
            qim0 qim0VarU = u291.u(nim0.a, 0.0f, 0.0f, f, f, 3);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
            us71.j((i2 >> 3) & 14, vu30Var, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gjx(gdxVar, vu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void k(gbx gbxVar, qim0 qim0Var, max maxVar, gdx gdxVar, idn0 idn0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        max maxVar2;
        gdx gdxVar2;
        boolean z;
        b0k b0kVar2;
        idn0 idn0Var2;
        h311 h311VarV;
        max maxVar3;
        gdx gdxVarR;
        int i4;
        max maxVar4;
        gdx gdxVar3;
        idn0 idn0VarY;
        int i5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(636338064);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                maxVar2 = maxVar;
                i3 |= b0kVar3.g(maxVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    gdxVar2 = gdxVar;
                    int i7 = b0kVar3.g(gdxVar2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    gdxVar2 = gdxVar;
                }
                i3 |= i7;
            } else {
                gdxVar2 = gdxVar;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i6 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar2;
                    }
                    if ((i2 & 8) != 0) {
                        gdxVarR = yla.r(b0kVar3);
                        i3 &= -7169;
                    } else {
                        gdxVarR = gdxVar2;
                    }
                    i4 = i3 & (-57345);
                    maxVar4 = maxVar3;
                    gdxVar3 = gdxVarR;
                    idn0VarY = zso1.Y(b0kVar3);
                } else {
                    b0kVar3.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3 & (-57345);
                    idn0VarY = idn0Var;
                    maxVar4 = maxVar2;
                    gdxVar3 = gdxVar2;
                }
                b0kVar3.s();
                int i8 = i4 << 6;
                b0kVar2 = b0kVar3;
                h(gbxVar, new idx(19), qim0Var, maxVar4, gdxVar3, null, false, idn0VarY, null, j2iVar, b0kVar2, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i8) | (i8 & 458752), (i4 >> 15) & 14, 712);
                maxVar2 = maxVar4;
                gdxVar2 = gdxVar3;
                idn0Var2 = idn0VarY;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(gbxVar, qim0Var, maxVar2, gdxVar2, idn0Var2, j2iVar, i, i2, (byte) 6);
            }
        }
        i3 |= 384;
        maxVar2 = maxVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                gdxVar2 = gdxVar;
                if (b0kVar3.g(gdxVar2)) {
                }
                i3 |= i7;
            } else {
                gdxVar2 = gdxVar;
            }
            i3 |= i7;
        } else {
            gdxVar2 = gdxVar;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    maxVar3 = jax.a;
                } else {
                    maxVar3 = maxVar2;
                }
                if ((i2 & 8) != 0) {
                    gdxVarR = yla.r(b0kVar3);
                    i3 &= -7169;
                } else {
                    gdxVarR = gdxVar2;
                }
                i4 = i3 & (-57345);
                maxVar4 = maxVar3;
                gdxVar3 = gdxVarR;
                idn0VarY = zso1.Y(b0kVar3);
            } else {
                if (i6 != 0) {
                    maxVar3 = jax.a;
                } else {
                    maxVar3 = maxVar2;
                }
                if ((i2 & 8) != 0) {
                    gdxVarR = yla.r(b0kVar3);
                    i3 &= -7169;
                } else {
                    gdxVarR = gdxVar2;
                }
                i4 = i3 & (-57345);
                maxVar4 = maxVar3;
                gdxVar3 = gdxVarR;
                idn0VarY = zso1.Y(b0kVar3);
            }
            b0kVar3.s();
            int i9 = i4 << 6;
            b0kVar2 = b0kVar3;
            h(gbxVar, new idx(19), qim0Var, maxVar4, gdxVar3, null, false, idn0VarY, null, j2iVar, b0kVar2, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i9) | (i9 & 458752), (i4 >> 15) & 14, 712);
            maxVar2 = maxVar4;
            gdxVar2 = gdxVar3;
            idn0Var2 = idn0VarY;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            idn0Var2 = idn0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(gbxVar, qim0Var, maxVar2, gdxVar2, idn0Var2, j2iVar, i, i2, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void l(gbx gbxVar, qim0 qim0Var, max maxVar, gdx gdxVar, idn0 idn0Var, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        max maxVar2;
        int i5;
        gdx gdxVar2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        max maxVar3;
        gdx gdxVar3;
        idn0 idn0Var2;
        h311 h311VarV;
        qim0 qim0Var4;
        max maxVar4;
        gdx gdxVarR;
        int i6;
        qim0 qim0Var5;
        max maxVar5;
        gdx gdxVar4;
        idn0 idn0VarY;
        int i7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(521411788);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    maxVar2 = maxVar;
                    if (b0kVar3.g(maxVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        gdxVar2 = gdxVar;
                        int i9 = b0kVar3.g(gdxVar2) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        gdxVar2 = gdxVar;
                    }
                    i3 |= i9;
                } else {
                    gdxVar2 = gdxVar;
                }
                if ((i & 24576) == 0) {
                    i3 |= 8192;
                }
                if ((196608 & i) != 0) {
                    if (b0kVar3.i(vu30Var)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i8 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if ((i2 & 8) != 0) {
                            gdxVarR = yla.r(b0kVar3);
                            i3 &= -7169;
                        } else {
                            gdxVarR = gdxVar2;
                        }
                        i6 = i3 & (-57345);
                        qim0Var5 = qim0Var4;
                        maxVar5 = maxVar4;
                        gdxVar4 = gdxVarR;
                        idn0VarY = zso1.Y(b0kVar3);
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i6 = i3 & (-57345);
                        idn0VarY = idn0Var;
                        qim0Var5 = qim0Var2;
                        maxVar5 = maxVar2;
                        gdxVar4 = gdxVar2;
                    }
                    b0kVar3.s();
                    int i10 = i6 << 6;
                    b0kVar2 = b0kVar3;
                    h(gbxVar, ldx.c, qim0Var5, maxVar5, gdxVar4, null, false, idn0VarY, null, vu30Var, b0kVar2, (i6 & 14) | 48 | ((i6 << 3) & 896) | (57344 & i10) | (i10 & 458752), (i6 >> 15) & 14, 712);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar5;
                    gdxVar3 = gdxVar4;
                    idn0Var2 = idn0VarY;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar3 = gdxVar2;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new bd5(gbxVar, qim0Var3, maxVar3, gdxVar3, idn0Var2, vu30Var, i, i2, (byte) 7);
                }
            }
            i3 |= 384;
            maxVar2 = maxVar;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    gdxVar2 = gdxVar;
                    if (b0kVar3.g(gdxVar2)) {
                    }
                    i3 |= i9;
                } else {
                    gdxVar2 = gdxVar;
                }
                i3 |= i9;
            } else {
                gdxVar2 = gdxVar;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((196608 & i) != 0) {
                if (b0kVar3.i(vu30Var)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if ((i2 & 8) != 0) {
                        gdxVarR = yla.r(b0kVar3);
                        i3 &= -7169;
                    } else {
                        gdxVarR = gdxVar2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    maxVar5 = maxVar4;
                    gdxVar4 = gdxVarR;
                    idn0VarY = zso1.Y(b0kVar3);
                } else {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if ((i2 & 8) != 0) {
                        gdxVarR = yla.r(b0kVar3);
                        i3 &= -7169;
                    } else {
                        gdxVarR = gdxVar2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    maxVar5 = maxVar4;
                    gdxVar4 = gdxVarR;
                    idn0VarY = zso1.Y(b0kVar3);
                }
                b0kVar3.s();
                int i11 = i6 << 6;
                b0kVar2 = b0kVar3;
                h(gbxVar, ldx.c, qim0Var5, maxVar5, gdxVar4, null, false, idn0VarY, null, vu30Var, b0kVar2, (i6 & 14) | 48 | ((i6 << 3) & 896) | (57344 & i11) | (i11 & 458752), (i6 >> 15) & 14, 712);
                qim0Var3 = qim0Var5;
                maxVar3 = maxVar5;
                gdxVar3 = gdxVar4;
                idn0Var2 = idn0VarY;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                maxVar3 = maxVar2;
                gdxVar3 = gdxVar2;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(gbxVar, qim0Var3, maxVar3, gdxVar3, idn0Var2, vu30Var, i, i2, (byte) 7);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                maxVar2 = maxVar;
                if (b0kVar3.g(maxVar2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    gdxVar2 = gdxVar;
                    if (b0kVar3.g(gdxVar2)) {
                    }
                    i3 |= i9;
                } else {
                    gdxVar2 = gdxVar;
                }
                i3 |= i9;
            } else {
                gdxVar2 = gdxVar;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((196608 & i) != 0) {
                if (b0kVar3.i(vu30Var)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if ((i2 & 8) != 0) {
                        gdxVarR = yla.r(b0kVar3);
                        i3 &= -7169;
                    } else {
                        gdxVarR = gdxVar2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    maxVar5 = maxVar4;
                    gdxVar4 = gdxVarR;
                    idn0VarY = zso1.Y(b0kVar3);
                } else {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if ((i2 & 8) != 0) {
                        gdxVarR = yla.r(b0kVar3);
                        i3 &= -7169;
                    } else {
                        gdxVarR = gdxVar2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    maxVar5 = maxVar4;
                    gdxVar4 = gdxVarR;
                    idn0VarY = zso1.Y(b0kVar3);
                }
                b0kVar3.s();
                int i12 = i6 << 6;
                b0kVar2 = b0kVar3;
                h(gbxVar, ldx.c, qim0Var5, maxVar5, gdxVar4, null, false, idn0VarY, null, vu30Var, b0kVar2, (i6 & 14) | 48 | ((i6 << 3) & 896) | (57344 & i12) | (i12 & 458752), (i6 >> 15) & 14, 712);
                qim0Var3 = qim0Var5;
                maxVar3 = maxVar5;
                gdxVar3 = gdxVar4;
                idn0Var2 = idn0VarY;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                maxVar3 = maxVar2;
                gdxVar3 = gdxVar2;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(gbxVar, qim0Var3, maxVar3, gdxVar3, idn0Var2, vu30Var, i, i2, (byte) 7);
            }
        }
        i3 |= 384;
        maxVar2 = maxVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                gdxVar2 = gdxVar;
                if (b0kVar3.g(gdxVar2)) {
                }
                i3 |= i9;
            } else {
                gdxVar2 = gdxVar;
            }
            i3 |= i9;
        } else {
            gdxVar2 = gdxVar;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) != 0) {
            if (b0kVar3.i(vu30Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if ((i2 & 8) != 0) {
                    gdxVarR = yla.r(b0kVar3);
                    i3 &= -7169;
                } else {
                    gdxVarR = gdxVar2;
                }
                i6 = i3 & (-57345);
                qim0Var5 = qim0Var4;
                maxVar5 = maxVar4;
                gdxVar4 = gdxVarR;
                idn0VarY = zso1.Y(b0kVar3);
            } else {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if ((i2 & 8) != 0) {
                    gdxVarR = yla.r(b0kVar3);
                    i3 &= -7169;
                } else {
                    gdxVarR = gdxVar2;
                }
                i6 = i3 & (-57345);
                qim0Var5 = qim0Var4;
                maxVar5 = maxVar4;
                gdxVar4 = gdxVarR;
                idn0VarY = zso1.Y(b0kVar3);
            }
            b0kVar3.s();
            int i13 = i6 << 6;
            b0kVar2 = b0kVar3;
            h(gbxVar, ldx.c, qim0Var5, maxVar5, gdxVar4, null, false, idn0VarY, null, vu30Var, b0kVar2, (i6 & 14) | 48 | ((i6 << 3) & 896) | (57344 & i13) | (i13 & 458752), (i6 >> 15) & 14, 712);
            qim0Var3 = qim0Var5;
            maxVar3 = maxVar5;
            gdxVar3 = gdxVar4;
            idn0Var2 = idn0VarY;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            maxVar3 = maxVar2;
            gdxVar3 = gdxVar2;
            idn0Var2 = idn0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(gbxVar, qim0Var3, maxVar3, gdxVar3, idn0Var2, vu30Var, i, i2, (byte) 7);
        }
    }

    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public static final void m(t710 t710Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        pl3 pl3Var;
        vu30 vu30Var;
        qim0 qim0Var4;
        Function0 function0;
        float f;
        llj lljVar;
        ?? r3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-280489957);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(t710Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean z = t710Var.e;
            qim0 qim0Var5 = nim0.a;
            if (z) {
                x340Var.i0(1930331224);
                long j = ((vex) zex.a.e).c;
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarF = dug.f(qim0Var5, j, er31.b(16.0f));
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
                x340Var.r(false);
                qim0Var3 = qim0VarX;
            } else {
                x340Var.i0(1930598661);
                x340Var.r(false);
                qim0Var3 = qim0Var5;
            }
            boolean z2 = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new yx00(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("external-link-container", bin.x(qim0Var3, false, null, null, null, (Function0) objT, 15));
            pl3 pl3Var2 = een.N0;
            jw31 jw31VarA = ew31.a(d36Var, pl3Var2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z3) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar2);
            vu30 vu30Var2 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, false, new g21(pl3Var2, (byte) 28)), een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, vu30Var2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str = t710Var.c;
            if (str == null) {
                x340Var.i0(-131453781);
                x340Var.r(false);
                vu30Var = vu30Var2;
                pl3Var = pl3Var2;
                r3 = 0;
                qim0Var4 = qim0Var5;
                f = 4.0f;
                lljVar = lljVar3;
                function0 = function1;
            } else {
                x340Var.i0(-131453780);
                pl3Var = pl3Var2;
                vu30Var = vu30Var2;
                qim0Var4 = qim0Var5;
                function0 = function1;
                f = 4.0f;
                lljVar = lljVar3;
                r3 = 0;
                uwo1.e(str, anm1.N("external-link-domain", qim0Var5), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1712);
                x340Var = x340Var;
                x340Var.r(false);
            }
            cvx cvxVar4 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(f, true, new um5((boolean) r3)), pl3Var, x340Var, (int) r3);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar2);
            nko1.H(xos0VarM3, x340Var, vu30Var);
            x0d.q(iHashCode3, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            boolean z4 = t710Var.d;
            isl islVar = isl.a;
            if (z4) {
                x340Var.i0(737963073);
                clx clxVar = clx.c;
                long j2 = cbx.a(x340Var).b.b;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(clxVar, islVar, anm1.N("external-link-chain-icon", u291.r(qim0Var4, 12.0f)), j2, 0L, false, x340Var, clx.d | 48, 48);
                x340Var.r((boolean) r3);
            } else {
                x340Var.i0(738226697);
                x340Var.r((boolean) r3);
            }
            String strH0 = ihc1.H0(ihc1.H0(t710Var.b, "https://"), "http://");
            char[] cArr = new char[1];
            cArr[r3] = '/';
            String strG1 = ihc1.g1(strH0, cArr);
            lee1 lee1Var = cbx.d(x340Var).j;
            long j3 = cbx.a(x340Var).b.b;
            cjc0 cjc0Var = new cjc0(1);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            x340 x340Var2 = x340Var;
            uwo1.e(strG1, anm1.N("external-link-url", new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), lee1Var, j3, null, null, 2, false, cjc0Var, 0, null, x340Var2, 0, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
            dnx dnxVar = dnx.c;
            long j4 = cbx.a(x340Var).b.a;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            w0h1.a(dnxVar, islVar, anm1.N("external-link-icon", u291.r(qim0Var4, 16.0f)), j4, 0L, false, x340Var, dnx.d | 48, 48);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(t710Var, qim0Var2, iu30Var, i, (byte) 29);
        }
    }

    public static final void n(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-14149356);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarR = u291.r(qim0Var, 57.41f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            eso1.h(i3o1.n(2131233745, x340Var, 0), isl.a, k1u.u(u291.m(nim0.a, 74.0f), 9.28f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var, 224312, 384);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 28);
        }
    }

    public static final void o(nbh nbhVar, String str, String str2, b0k b0kVar, int i) {
        String str3;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(143904120);
        if ((i & 48) == 0) {
            str3 = str;
            i2 = (x340Var2.g(str3) ? 32 : 16) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(str2) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 145) != 144)) {
            nim0 nim0Var = nim0.a;
            int i3 = i2;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            x340Var = x340Var2;
            uwo1.e(str3, qim0VarF, cbx.d(x340Var2).d, cbx.a(x340Var2).b.a, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var, (i3 >> 3) & 14, 0, 1696);
            if (str2 != null) {
                x340Var.i0(670660426);
                cvx cvxVar = cbx.b(x340Var).b;
                uwo1.e(str2, ab80.o(nim0Var, 16.0f, x340Var, nim0Var, 1.0f), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var, (i3 >> 6) & 14, 0, 1696);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(671029450);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jni1(nbhVar, str, str2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void p(c380 c380Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        vu30 vu30Var2;
        boolean z;
        vu30 vu30Var3;
        h311 h311VarV;
        vu30 vu30Var4;
        boolean z2;
        boolean z3;
        Object objT;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2121964363);
        int i3 = (x340Var.g(c380Var) ? 4 : 2) | i;
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                vu30Var2 = vu30Var;
                i3 |= x340Var.i(vu30Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = oq50.b1;
                        x340Var.s0(objT2);
                    }
                    vu30Var4 = (vu30) objT2;
                } else {
                    vu30Var4 = vu30Var2;
                }
                uwr uwrVar = cbx.a;
                qim0 qim0VarJ = u291.j(if71.c, 0.0f, 2, qim0Var);
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                zzq0 zzq0Var = new zzq0(12.0f, 8.0f, 12.0f, 8.0f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 896) == 256);
                objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new zq60(c380Var, vu30Var4, (byte) 0);
                    x340Var.s0(objT);
                }
                s3o1.e(qim0VarJ, null, zzq0Var, d36Var, null, null, null, (iu30) objT, x340Var, 0, 234);
                vu30Var3 = vu30Var4;
            } else {
                x340Var.b0();
                vu30Var3 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dg6(c380Var, qim0Var, vu30Var3, i, i2, (byte) 4);
            }
        }
        i3 |= 384;
        vu30Var2 = vu30Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = oq50.b1;
                    x340Var.s0(objT2);
                }
                vu30Var4 = (vu30) objT2;
            } else {
                vu30Var4 = vu30Var2;
            }
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarJ2 = u291.j(if71.c, 0.0f, 2, qim0Var);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            zzq0 zzq0Var2 = new zzq0(12.0f, 8.0f, 12.0f, 8.0f);
            cvx cvxVar6 = cbx.b(x340Var).b;
            d36 d36Var2 = new d36(8.0f, true, new um5(false));
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | ((i3 & 896) == 256);
            objT = x340Var.T();
            if (z3) {
                objT = new zq60(c380Var, vu30Var4, (byte) 0);
                x340Var.s0(objT);
            } else {
                objT = new zq60(c380Var, vu30Var4, (byte) 0);
                x340Var.s0(objT);
            }
            s3o1.e(qim0VarJ2, null, zzq0Var2, d36Var2, null, null, null, (iu30) objT, x340Var, 0, 234);
            vu30Var3 = vu30Var4;
        } else {
            x340Var.b0();
            vu30Var3 = vu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(c380Var, qim0Var, vu30Var3, i, i2, (byte) 4);
        }
    }

    public static final void q(me90 me90Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1244481844);
        int i2 = i | (b0kVar3.e(me90Var.ordinal()) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = me90Var == me90.c;
            boolean z2 = me90Var == me90.b;
            idx idxVar = new idx(6);
            gdx gdxVarS = yla.s(b0kVar3);
            j2i j2iVar = z ? tpj.c : null;
            boolean zH = b0kVar3.h(z2) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (zH || objT == fkj0.X) {
                objT = new zt2(z2, function0, (byte) 7);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.d(z, (iu30) objT, idxVar, qim0Var, null, null, gdxVarS, null, null, null, null, j2iVar, apo.r(1283661812, new xix(z2, z, (byte) 3), b0kVar3), b0kVar2, (i2 << 3) & 7168, 384, 1968);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) me90Var, (Object) function0, (Object) qim0Var, i, (byte) 19);
        }
    }

    public static final void r(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1253337339);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131959721);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = w0q0.c1;
                x340Var.s0(objT);
            }
            hdx hdxVar = new hdx(0, (vu30) objT, (vu30) null, (vu30) null, (hw61) null, 29);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), hdxVar, null, null, null, null, null, null, null, null, apo.r(-515835334, new psr0(strO0, (byte) 9), x340Var), x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 24, i, function0, false);
        }
    }

    public static final void s(ArrayList arrayList, iu30 iu30Var, vu30 vu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        j2i j2iVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(83729889);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(arrayList) : b0kVar3.i(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            j2iVar2 = j2iVar;
            i2 |= b0kVar3.i(j2iVar2) ? 16384 : 8192;
        } else {
            j2iVar2 = j2iVar;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            b0kVar3.i0(-1139945847);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            uwr uwrVar = cbx.a;
            float fX0 = watVar.X0(cbx.b(b0kVar3).b.c);
            b0kVar3.r(false);
            qim0 qim0VarR = exd0.r(i541.D(u291.f(qim0Var, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new ik6(fX0, xtb0VarA.d(), (byte) 5));
            cvx cvxVar = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && b0kVar3.i(arrayList))) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 57344) == 16384);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                m9i1 m9i1Var = new m9i1(arrayList, vu30Var, iu30Var2, j2iVar2, (byte) 1);
                b0kVar3.s0(m9i1Var);
                objT = m9i1Var;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarR, xtb0VarA, null, false, d36Var, null, null, false, null, (iu30) objT, b0kVar2, 0, 492);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 17, i, (Object) arrayList, (Object) vu30Var, (Object) j2iVar, iu30Var, qim0Var);
        }
    }

    public static final void t(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2028710508);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(pbh.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(nim0.a, cbx.b(x340Var).b.c));
            int i3 = i2;
            foo1.c(new gbx(z50.c, function0), new idx(6), null, null, yla.r(x340Var), null, null, null, null, null, tpj.a, x340Var, 0, 48, 2012);
            z(function1, x340Var, (i3 & 14) | ((i3 >> 3) & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k16(function0, function1, i, (byte) 6);
        }
    }

    public static final void u(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1798136503);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = u291.n(nim0Var, 142.76f, 61.24f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            n(eqr0.C(nim0Var, 85.35f, 1.16f), x340Var, 0);
            b(lrn1.x(eqr0.C(nim0Var, 50.72f, 21.12f), 1.0f), x340Var, 0);
            d(lrn1.x(eqr0.C(nim0Var, 4.22f, 4.22f), 2.0f), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 6);
        }
    }

    public static final void v(String str, cns0 cns0Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String strK;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-259151855);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.e(cns0Var.ordinal()) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarZ);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            u(b0kVar3, 0);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarO = ab80.o(qim0Var3, 16.0f, b0kVar3, qim0Var3, 1.0f);
            lee1 lee1VarA = lee1.a(cbx.d(b0kVar3).e, 0L, fc11.G(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
            long j = cbx.a(b0kVar3).b.a;
            int i3 = i2 >> 3;
            if (cns0Var == cns0.c) {
                b0kVar3.i0(-1076428002);
                strK = cwl1.n0(2131959720, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            } else {
                strK = x0d.k(b0kVar3, -1076324431, 2131959722, b0kVar3, false);
            }
            qim0Var2 = qim0Var3;
            uwo1.e(strK, qim0VarO, lee1VarA, j, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            uwo1.e(cwl1.n0(2131959719, new Object[]{str}, b0kVar3), ab80.o(qim0Var2, 6.0f, b0kVar3, qim0Var2, 1.0f), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, u291.h(qim0Var2, cbx.b(b0kVar2).b.b));
            x(cns0Var, function0, b0kVar2, i3 & 126);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(qim0Var2, 16.0f));
            r(function1, b0kVar2, (i2 >> 9) & 14);
            x0d.s(qim0Var2, cbx.b(b0kVar2).b.c, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 19, i, str, cns0Var, function0, function1, qim0Var2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static final void w(int i, int i2, iu30 iu30Var, hc01 hc01Var, qim0 qim0Var, b0k b0kVar, int i3) {
        x340 x340Var;
        x340 x340Var2;
        qim0 qim0Var2;
        ?? r5;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1791595587);
        int i4 = i3 | (x340Var3.e(i) ? 4 : 2) | (x340Var3.e(i2) ? 32 : 16) | (x340Var3.i(iu30Var) ? 256 : 128) | (x340Var3.e(hc01Var.ordinal()) ? 2048 : 1024) | (x340Var3.i(qim0Var) ? 16384 : 8192);
        if (x340Var3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("ereader_page_slider", uyn1.z(cbx.b(x340Var3).e.c, 0.0f, 2, u291.f(qim0Var, 1.0f)));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarN);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            qim0 qim0Var3 = nim0.a;
            if (i2 > 1) {
                x340Var3.i0(-2095753397);
                float f = i;
                jsg jsgVar = new jsg(1.0f, i2);
                long j = hc01Var.b;
                long jB = u7h.b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                boolean z = ((i4 & 112) == 32) | ((i4 & 896) == 256);
                Object objT = x340Var3.T();
                if (z || objT == fkj0.X) {
                    objT = new z0e(iu30Var, i2, (byte) 6);
                    x340Var3.s0(objT);
                }
                qim0Var2 = qim0Var3;
                r5 = 1;
                luo1.e(f, (iu30) objT, qim0VarF, false, jsgVar, 0, null, j, jB, null, 0L, 0L, 0L, x340Var3, 0, 7784);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                qim0Var2 = qim0Var3;
                r5 = 1;
                x340Var2.i0(-2095411095);
                x340Var2.r(false);
            }
            x340 x340Var4 = x340Var2;
            uwo1.e(cy30.i(i, "Page ", i2, " of "), anm1.N("ereader_page_indicator", qim0Var2), new lee1(0L, fc11.G(11), (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777213), u7h.b(hc01Var.b, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 0, false, new cjc0((int) r5), 0, null, x340Var4, 0, 0, 1776);
            x340Var = x340Var4;
            x340Var.r((boolean) r5);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(i, i2, iu30Var, hc01Var, qim0Var, i3, (byte) 15);
        }
    }

    public static final void x(cns0 cns0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(252562782);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(cns0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.g(13, apo.r(-879849653, new ql(cns0Var == cns0.c ? x0d.k(x340Var, -684714391, 2131959718, x340Var, false) : x0d.k(x340Var, -684618415, 2131959723, x340Var, false), function0, (byte) 27), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(cns0Var, function0, i, (byte) 29);
        }
    }

    public static final void y(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-48227097);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(pbh.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, f));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = kei1.a1;
                x340Var.s0(objT);
            }
            yto1.e(2, 48, 0, x340Var, s161.b(nim0Var, false, (iu30) objT));
            z(function0, x340Var, i2 & 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 26, i, function0, false);
        }
    }

    public static final void z(Function0 function0, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        wk1 wk1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1415555567);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(function0) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            if (function0 == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    wk1Var = new wk1((byte) 27, i, function0, false);
                }
            } else {
                uwr uwrVar = cbx.a;
                op71.g(x340Var, u291.h(nim0.a, cbx.b(x340Var).b.b));
                foo1.c(new gbx(z50.c, function0), jdx.c, null, null, yla.r(x340Var), null, null, null, null, null, tpj.b, x340Var, 0, 48, 2012);
            }
            h311VarV.d = wk1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            wk1Var = new wk1((byte) 28, i, function0, false);
            h311VarV.d = wk1Var;
        }
    }
}
