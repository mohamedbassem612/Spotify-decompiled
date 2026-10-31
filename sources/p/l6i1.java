package p;

import android.content.Context;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l6i1 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6i1(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        vhj1 vhj1Var = (vhj1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(vhj1Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            ((yxb0) this.b).g(vhj1Var, iu30Var, x340Var2, (i >> 3) & 126);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a((gw70) ((suh1) this.b).f), apo.r(-1830226049, new eii1((njj1) obj2, (iu30) obj3, (byte) 12), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        lkj1 lkj1Var = (lkj1) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        mkj1 mkj1Var = (mkj1) this.b;
        if (lkj1Var.equals(kkj1.a)) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1774059462);
            mkj1Var.e(x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (!(lkj1Var instanceof jkj1)) {
                throw p3d1.k(x340Var, 1774058438, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1774061346);
            if (mkj1Var.e != null) {
                x340Var3.i0(-838639485);
                otw.c(mkj1Var.e, new i3k1(((jkj1) lkj1Var).a, 6), (qim0) null, (ipb1) null, x340Var3, 8, 12);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-838478998);
                x340Var3.r(false);
            }
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        jzj1 jzj1Var = (jzj1) this.b;
        czj1 czj1Var = ((gzj1) obj2).a;
        if (!czj1Var.b.isEmpty() || czj1Var.e > 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(2099678110);
            scx scxVarM = pno1.m(x340Var2);
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(l1d.c(czj1Var.d, 4) >= 0);
            boolean zI = x340Var2.i(czj1Var) | x340Var2.i(scxVarM);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new t6j1(czj1Var, scxVarM, (lnm) null, (byte) 9);
                x340Var2.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                quq quqVar = jzj1Var.a;
                otj1 otj1Var = new otj1(iu30Var, (byte) 4);
                goq goqVar = (goq) quqVar.a.c;
                pzj1 pzj1Var = new pzj1((d0r) ((jly0) goqVar.b).get(), (wzj1) ((jly0) goqVar.c).get(), otj1Var);
                x340Var2.s0(pzj1Var);
                objT2 = pzj1Var;
            }
            pzj1 pzj1Var2 = (pzj1) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                vzj1 vzj1Var = new vzj1((wzj1) ((jly0) ((goq) jzj1Var.b.a.c).c).get(), new izj1(iu30Var, (byte) 0));
                x340Var2.s0(vzj1Var);
                objT3 = vzj1Var;
            }
            vzj1 vzj1Var2 = (vzj1) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                wxj1 wxj1Var = new wxj1((wzj1) ((jly0) ((goq) jzj1Var.c.a.c).c).get(), new y0j1(iu30Var, (byte) 29));
                x340Var2.s0(wxj1Var);
                objT4 = wxj1Var;
            }
            wxj1 wxj1Var2 = (wxj1) objT4;
            if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT5 = x340Var2.T();
            if (z || objT5 == m4cVar) {
                objT5 = new y0j1(iu30Var, (byte) 28);
                x340Var2.s0(objT5);
            }
            x74.f((Function0) objT5, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.FALSE, false, false, apo.r(-1053071435, new pej1(czj1Var, wxj1Var2, jzj1Var, (byte) 6), x340Var2), apo.r(-485873152, new n2y0(czj1Var, iu30Var, pzj1Var2, vzj1Var2, jzj1Var), x340Var2), x340Var2, 113270784, 54, 620);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(2101502088);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ecx ecxVarD;
        h3k1 h3k1Var = (h3k1) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        qlb qlbVar = (qlb) this.b;
        String str = h3k1Var.a;
        boolean z = h3k1Var.b;
        int iC = l1d.C(h3k1Var.c);
        if (iC == 0) {
            cbx.a.getClass();
            ecxVarD = uwr.d();
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            cbx.a.getClass();
            ecxVarD = uwr.a();
        }
        qlbVar.m(str, z, ecxVarD, b0kVar, 0);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        o6k1 o6k1Var = (o6k1) this.b;
        nyx.a(2, (wux) null, apo.r(86535383, new y46(o6k1Var, (iu30) obj3, (n6k1) obj2, (byte) 7), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Function0 function0;
        hek1 hek1Var = (hek1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        pt ptVar = (pt) this.b;
        b0k b0kVar = (x340) ((b0k) obj4);
        Object objT = b0kVar.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(Boolean.FALSE);
            b0kVar.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean z = hek1Var.b;
        float f = z ? 1.0f : 0.0f;
        boolean z2 = true;
        if (z) {
            b0kVar.i0(-1832839338);
            boolean zI = ((((iIntValue & 112) ^ 48) > 32 && b0kVar.g(hek1Var)) || (iIntValue & 48) == 32) | ((((iIntValue & 896) ^ 384) > 256 && b0kVar.g(iu30Var)) || (iIntValue & 384) == 256) | b0kVar.i(ptVar) | b0kVar.i(ven0Var);
            Object objT2 = b0kVar.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new o8e1(hek1Var, iu30Var, ptVar, ven0Var);
                b0kVar.s0(objT2);
            }
            function0 = (Function0) objT2;
            b0kVar.r(false);
        } else {
            b0kVar.i0(-1832531012);
            Object objT3 = b0kVar.T();
            if (objT3 == m4cVar) {
                objT3 = kvj1.X;
                b0kVar.s0(objT3);
            }
            function0 = (Function0) objT3;
            b0kVar.r(false);
        }
        qim0 qim0VarK = d9y0.k(nim0.a, f);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(((x340) b0kVar).T);
        xos0 xos0VarM = b0kVar.m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarK);
        hzj.A.getClass();
        if (((x340) b0kVar).a == null) {
            tgp1.p();
            throw null;
        }
        b0kVar.m0();
        if (((x340) b0kVar).S) {
            b0kVar.l(hmb0.t1);
        } else {
            b0kVar.v0();
        }
        nko1.H(gfh0VarC, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        if (hek1Var.a && hek1Var.g && hek1Var.f) {
            b0kVar.i0(720441400);
            ptVar.y(function0, b0kVar, 0);
            b0kVar.r(false);
        } else if (hek1Var.c.length() > 0) {
            b0kVar.i0(720443645);
            ptVar.t(function0, hek1Var, b0kVar, iIntValue & 112);
            b0kVar.r(false);
        } else {
            b0kVar.i0(720445368);
            ptVar.s(function0, hek1Var, b0kVar, iIntValue & 112);
            b0kVar.r(false);
        }
        b0kVar.r(true);
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            b0kVar.i0(-1832197297);
            xq81 xq81Var = (xq81) ptVar.f;
            boolean zI2 = b0kVar.i(ven0Var);
            if ((((iIntValue & 896) ^ 384) <= 256 || !b0kVar.g(iu30Var)) && (iIntValue & 384) != 256) {
                z2 = false;
            }
            boolean z3 = zI2 | z2;
            Object objT4 = b0kVar.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new rc21(iu30Var, ven0Var, (byte) 17);
                b0kVar.s0(objT4);
            }
            Function0 function1 = (Function0) objT4;
            boolean zI3 = b0kVar.i(ven0Var);
            Object objT5 = b0kVar.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new mek1(ven0Var, (byte) 0);
                b0kVar.s0(objT5);
            }
            xq81Var.a(dqh1.a, function1, (Function0) objT5, b0kVar, 0);
            b0kVar.r(false);
        } else {
            b0kVar.i0(-1831888816);
            b0kVar.r(false);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xjk1 xjk1Var = (xjk1) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        if (xjk1Var.a) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-898830069);
            otw.c((maa) ((qlb) this.b).e, xjk1Var.b, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-898762799);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        float f;
        dnk1 dnk1Var = (dnk1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        fnk1 fnk1Var = dnk1Var.a;
        hok1 hok1Var = (hok1) this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            ty60 ty60Var = hok1Var.g;
            objT = hu20.e(rqt0.u(yoi1.g(ty60Var.a.k)), new qt((lnm) null, ty60Var, (byte) 16));
            x340Var.s0(objT);
        }
        mr20 mr20Var = (mr20) objT;
        enk1 enk1Var = hok1Var.t;
        float f2 = enk1Var.c;
        if (p3v.c(enk1Var.b, Float.NaN)) {
            x340Var.i0(-913176132);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            x340Var.r(false);
            f = 16.0f;
        } else {
            x340Var.i0(-913177991);
            x340Var.r(false);
            f = enk1Var.b;
        }
        if (p3v.c(f2, Float.NaN)) {
            f2 = 40.0f;
        }
        float f3 = f2;
        if (!enk1Var.d && (fnk1Var instanceof gnk1)) {
            fnk1Var = fnk1.a;
        }
        boolean z = hok1Var.Y;
        boolean z2 = dnk1Var.c;
        boolean z3 = enk1Var.f;
        long j = enk1Var.a;
        umk1 umk1Var = enk1Var.e;
        int i = (iIntValue & 896) ^ 384;
        boolean z4 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var.T();
        if (z4 || objT2 == m4cVar) {
            objT2 = new izj1(iu30Var, (byte) 7);
            x340Var.s0(objT2);
        }
        Function0 function0 = (Function0) objT2;
        boolean z5 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var.T();
        if (z5 || objT3 == m4cVar) {
            objT3 = new izj1(iu30Var, (byte) 8);
            x340Var.s0(objT3);
        }
        Function0 function1 = (Function0) objT3;
        boolean z6 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT4 = x340Var.T();
        if (z6 || objT4 == m4cVar) {
            objT4 = new izj1(iu30Var, (byte) 9);
            x340Var.s0(objT4);
        }
        Function0 function2 = (Function0) objT4;
        boolean z7 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT5 = x340Var.T();
        if (z7 || objT5 == m4cVar) {
            objT5 = new izj1(iu30Var, (byte) 10);
            x340Var.s0(objT5);
        }
        pok1.k(fnk1Var, j, f, f3, (qim0) null, mr20Var, z, z2, z3, umk1Var, function0, function1, function2, (Function0) objT5, x340Var, 0);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a(((lfo) this.b).c), apo.r(2039205181, new eii1((r5l1) obj2, (iu30) obj3, (byte) 26), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g6l1 g6l1Var = (g6l1) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        List list = g6l1Var.b;
        if (list.isEmpty()) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1006936913);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1006069130);
            nm1 nm1Var = (nm1) this.b;
            Object objT = x340Var3.T();
            if (objT == fkj0.X) {
                objT = ((b8l1) nm1Var.g).a((iac0) nm1Var.c, (Function0) nm1Var.f, (Function0) nm1Var.h);
                x340Var3.s0(objT);
            }
            otw.c((a8l1) objT, new y7l1(new x7l1(g6l1Var.a, list, g6l1Var.d), g6l1Var.c, g6l1Var.e, (String) null, g6l1Var.f, g6l1Var.g, 8), (qim0) null, (ipb1) null, x340Var3, 72, 12);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        k7l1 k7l1Var = (k7l1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        Integer num = k7l1Var.i;
        n0o n0oVar = (n0o) this.b;
        x340 x340Var = (b0k) obj4;
        boolean z = true;
        boolean zI = x340Var.i(n0oVar) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.g(k7l1Var)) || (iIntValue & 48) == 32);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new t6j1(n0oVar, k7l1Var, (lnm) null, (byte) 16);
            x340Var.s0(objT);
        }
        qxd0.t(num, x340Var, (vu30) objT);
        if (!k7l1Var.o || k7l1Var.c.length() <= 0) {
            x340Var.i0(-1793800445);
            x340Var.r(false);
        } else {
            x340Var.i0(-1794036851);
            ttq ttqVar = (ttq) n0oVar.g;
            bpb1 bpb1Var = (bpb1) n0oVar.h;
            if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new izj1(iu30Var, (byte) 24);
                x340Var.s0(objT2);
            }
            upf.c(k7l1Var, ttqVar, bpb1Var, (Function0) objT2, x340Var, (iIntValue >> 3) & 14);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        a8l1 a8l1Var = (a8l1) this.b;
        qtg.f((z7l1) obj2, a8l1Var.a, a8l1Var.e, a8l1Var.c, a8l1Var.d, (ksw) obj, a8l1Var.b, (qim0) null, (b0k) obj4, ((iIntValue >> 3) & 14) | ((iIntValue << 15) & 458752));
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        udl1 udl1Var = (udl1) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        uia uiaVar = udl1Var.a;
        int i = udl1Var.b;
        float f = udl1Var.c;
        jel1 jel1Var = udl1Var.d;
        int i2 = udl1Var.e;
        lel1 lel1Var = udl1Var.f;
        jti0 jti0Var = udl1Var.g;
        int i3 = udl1Var.h;
        zge1 zge1Var = udl1Var.i;
        float f2 = udl1Var.j;
        float f3 = udl1Var.k;
        vdl1 vdl1Var = (vdl1) this.b;
        yto.i(uiaVar, i, f, i2, lel1Var, jti0Var, i3, vdl1Var.a, (qim0) null, jel1Var, zge1Var, f2, f3, udl1Var.l, udl1Var.m, vdl1Var.b, apo.r(1800527405, new g2j1(vdl1Var, (byte) 24), b0kVar), b0kVar, 0);
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d5m1 d5m1Var = (d5m1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        quc0 quc0Var = (quc0) ((vbe1) this.b).d;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new wel1(iu30Var, (byte) 9);
            x340Var2.s0(objT);
        }
        mue1.s(d5m1Var, quc0Var, (Function0) objT, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        ((n5m1) this.b).e((hwq) obj2, (b0k) obj4, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        ((suh1) this.b).f((s5m1) obj2, (iu30) obj3, (b0k) obj4, (iIntValue >> 3) & 126);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:302:0x0839  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String str;
        String str2;
        int i;
        boolean z;
        boolean z2;
        m4c m4cVar;
        boolean z3;
        Object objT;
        List list;
        byte b = this.a;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                i6i1 i6i1Var = (i6i1) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                m6i1 m6i1Var = (m6i1) obj6;
                if (i6i1Var instanceof f6i1) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1303193507);
                    x340Var2.r(false);
                } else if (i6i1Var instanceof h6i1) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1343440182);
                    j2i j2iVarR = apo.r(-1331335820, new xaf1(m6i1Var, i6i1Var, (byte) 26), x340Var3);
                    boolean z4 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
                    Object objT2 = x340Var3.T();
                    if (z4 || objT2 == m4cVar2) {
                        objT2 = new uyh1(iu30Var, (byte) 2);
                        x340Var3.s0(objT2);
                    }
                    o6i1.c(6, (Function0) objT2, j2iVarR, x340Var3, null);
                    x340Var3.r(false);
                } else {
                    if (!(i6i1Var instanceof g6i1)) {
                        throw p3d1.k(x340Var, 1343434937, false);
                    }
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(-1302794165);
                    g6i1 g6i1Var = (g6i1) i6i1Var;
                    if (g6i1Var.d) {
                        str = null;
                        str2 = null;
                    } else {
                        hhd0 hhd0VarA = m6i1Var.a.a(g6i1Var.a, true);
                        String str3 = hhd0VarA.a;
                        str2 = hhd0VarA.b;
                        str = str3;
                    }
                    String str4 = g6i1Var.e;
                    String str5 = g6i1Var.f;
                    String str6 = g6i1Var.g;
                    boolean z5 = g6i1Var.d;
                    List list2 = g6i1Var.h;
                    if (list2.contains(ell.d)) {
                        i = 1;
                    } else {
                        i = list2.contains(ell.b) ? 2 : 0;
                    }
                    z5i1 z5i1Var = g6i1Var.c;
                    t5i1 t5i1Var = z5i1Var instanceof t5i1 ? (t5i1) z5i1Var : null;
                    String str7 = t5i1Var != null ? t5i1Var.b : null;
                    int i2 = (iIntValue & 896) ^ 384;
                    boolean zI = x340Var4.i(i6i1Var) | ((i2 > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256);
                    Object objT3 = x340Var4.T();
                    if (zI || objT3 == m4cVar2) {
                        objT3 = new mah1(iu30Var, i6i1Var, (byte) 7);
                        x340Var4.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    j2i j2iVarR2 = apo.r(2029243827, new wpg1(m6i1Var, i6i1Var, iu30Var, (byte) 13), x340Var4);
                    boolean z6 = (i2 > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
                    Object objT4 = x340Var4.T();
                    if (z6 || objT4 == m4cVar2) {
                        objT4 = new uyh1(iu30Var, (byte) 3);
                        x340Var4.s0(objT4);
                    }
                    o6i1.b(str4, z5, str6, i, function0, j2iVarR2, (Function0) objT4, null, str7, str5, str, str2, x340Var4, 196608);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 1:
                o7i1 o7i1Var = (o7i1) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                u7i1 u7i1Var = (u7i1) obj6;
                w4i1 w4i1Var = u7i1Var.c;
                ic9 ic9Var = u7i1Var.a;
                Context context = (Context) ic9Var.b;
                yoo1.u(w4i1Var.b, iu30Var2, (qim0) null, x340Var5, (iIntValue2 >> 3) & 112);
                voo1 voo1Var = o7i1Var.a;
                if (voo1Var == null) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(2081466360);
                    z = false;
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(2081466361);
                    if (voo1Var.equals(n7i1.i)) {
                        x340Var7.i0(-1351961959);
                        String str8 = w4i1Var.b;
                        boolean z7 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var7.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT5 = x340Var7.T();
                        if (z7 || objT5 == m4cVar3) {
                            objT5 = new uyh1(iu30Var2, (byte) 4);
                            x340Var7.s0(objT5);
                        }
                        ic9Var.q(context.getString(2131953692, str8), (Function0) objT5);
                        z = false;
                        x340Var7.r(false);
                    } else {
                        x340Var7.i0(-1351856373);
                        boolean z8 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var7.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT6 = x340Var7.T();
                        if (z8 || objT6 == m4cVar3) {
                            objT6 = new uyh1(iu30Var2, (byte) 5);
                            x340Var7.s0(objT6);
                        }
                        ic9Var.q(context.getString(2131958525), (Function0) objT6);
                        z = false;
                        x340Var7.r(false);
                    }
                    x340Var7.r(z);
                }
                too1 too1Var = o7i1Var.b;
                x340 x340Var8 = x340Var5;
                if (too1Var == null) {
                    x340Var8.i0(2081739067);
                    x340Var8.r(z);
                } else {
                    x340Var8.i0(2081739068);
                    if (too1Var.equals(k7i1.b)) {
                        x340Var8.i0(-2142883178);
                        String str9 = w4i1Var.b;
                        int i3 = (iIntValue2 & 896) ^ 384;
                        boolean z9 = (i3 > 256 && x340Var8.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT7 = x340Var8.T();
                        if (z9 || objT7 == m4cVar3) {
                            objT7 = new uyh1(iu30Var2, (byte) 6);
                            x340Var8.s0(objT7);
                        }
                        Function0 function1 = (Function0) objT7;
                        boolean z10 = (i3 > 256 && x340Var8.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT8 = x340Var8.T();
                        if (z10 || objT8 == m4cVar3) {
                            objT8 = new uyh1(iu30Var2, (byte) 7);
                            x340Var8.s0(objT8);
                        }
                        z2 = false;
                        r2p1.f(str9, function1, (Function0) objT8, x340Var8, 0);
                        x340Var8.r(false);
                    } else if (too1Var.equals(j7i1.b)) {
                        x340Var8.i0(-2142874922);
                        String str10 = w4i1Var.b;
                        int i4 = (iIntValue2 & 896) ^ 384;
                        boolean z11 = (i4 > 256 && x340Var8.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT9 = x340Var8.T();
                        if (z11 || objT9 == m4cVar3) {
                            objT9 = new uyh1(iu30Var2, (byte) 8);
                            x340Var8.s0(objT9);
                        }
                        Function0 function2 = (Function0) objT9;
                        boolean z12 = (i4 > 256 && x340Var8.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT10 = x340Var8.T();
                        if (z12 || objT10 == m4cVar3) {
                            objT10 = new uyh1(iu30Var2, (byte) 9);
                            x340Var8.s0(objT10);
                        }
                        z2 = false;
                        uap1.a(str10, function2, (Function0) objT10, x340Var8, 0);
                        x340Var8.r(false);
                    } else {
                        if (!too1Var.equals(l7i1.b)) {
                            throw p3d1.k(x340Var8, -2142884303, false);
                        }
                        x340Var8.i0(-2142866083);
                        c681 c681Var = u7i1Var.b;
                        String str11 = w4i1Var.b;
                        int i5 = (iIntValue2 & 896) ^ 384;
                        boolean z13 = (i5 > 256 && x340Var8.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT11 = x340Var8.T();
                        if (z13 || objT11 == m4cVar3) {
                            objT11 = new uyh1(iu30Var2, (byte) 10);
                            x340Var8.s0(objT11);
                        }
                        Function0 function3 = (Function0) objT11;
                        boolean z14 = (i5 > 256 && x340Var8.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                        Object objT12 = x340Var8.T();
                        if (z14 || objT12 == m4cVar3) {
                            objT12 = new uyh1(iu30Var2, (byte) 11);
                            x340Var8.s0(objT12);
                        }
                        c681Var.r(str11, function3, (Function0) objT12, x340Var8, 0);
                        z2 = false;
                        x340Var8.r(false);
                    }
                    x340Var8.r(z2);
                }
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a((gw70) ((e27) obj6).c), apo.r(261577081, new sdi1((rdi1) obj2, (iu30) obj3, (byte) 1), b0kVar), b0kVar, 56);
                return rih1Var;
            case 3:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((ovi1) obj6).b), apo.r(-191934210, new eii1((lvi1) obj2, (iu30) obj3, (byte) 3), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 4:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                suh1 suh1Var = (suh1) obj6;
                mod.b(oi7.a.a((gw70) suh1Var.e), apo.r(472180790, new wpg1((tvi1) obj2, (iu30) obj3, suh1Var, (byte) 20), b0kVar3), b0kVar3, 56);
                return rih1Var;
            case 5:
                f2j1 f2j1Var = (f2j1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var9).b.a, 0.0f, 2, qim0VarD);
                era eraVar = een.Q0;
                h2j1 h2j1Var = (h2j1) obj6;
                mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var9, 0);
                x340 x340Var10 = x340Var9;
                int iHashCode = Long.hashCode(x340Var10.T);
                xos0 xos0VarM = x340Var10.m();
                qim0 qim0VarE = zr7.E(x340Var9, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var11 = x340Var9;
                if (x340Var11.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var11.m0();
                boolean z15 = x340Var11.S;
                n4k n4kVar = hmb0.t1;
                if (z15) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var9, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var9, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var9, lljVar3);
                nko1.F(x340Var9);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var9, lljVar4);
                qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var9).b.a, 0.0f, 2, u291.f(nim0Var, 1.0f));
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var9, 0);
                int iHashCode2 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM2 = x340Var11.m();
                qim0 qim0VarE2 = zr7.E(x340Var9, qim0VarZ2);
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(mbhVarA2, x340Var9, lljVar);
                nko1.H(xos0VarM2, x340Var9, lljVar2);
                i3a.l(iHashCode2, x340Var9, lljVar3, x340Var9);
                nko1.H(qim0VarE2, x340Var9, lljVar4);
                g0p1.r(f2j1Var.a, (qim0) null, 0, 0L, x340Var9, 0, 14);
                op71.g(x340Var9, u291.h(nim0Var, cbx.b(x340Var9).b.b));
                zzo1.i(mqo1.A(f2j1Var.b), u291.f(nim0Var, 1.0f), (lee1) null, cbx.a(x340Var9).b.b, 3, h2j1Var.c, x340Var9, 0, 4);
                op71.g(x340Var9, u291.h(nim0Var, cbx.b(x340Var9).b.b));
                int i6 = (iIntValue3 & 896) ^ 384;
                boolean z16 = (i6 > 256 && x340Var11.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT13 = x340Var11.T();
                if (!z16) {
                    m4cVar = m4cVar4;
                    if (objT13 == m4cVar) {
                    }
                    z50 z50Var = z50.c;
                    foo1.c(new gbx(z50Var, (Function0) objT13), new idx(8), uyn1.z(cbx.b(x340Var9).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, dqj.a, x340Var9, 0, 48, 2040);
                    cvx cvxVar = cbx.b(x340Var9).b;
                    op71.g(x340Var9, u291.h(nim0Var, 16.0f));
                    z3 = (i6 <= 256 && x340Var11.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                    objT = x340Var11.T();
                    if (z3 || objT == m4cVar) {
                        objT = new y0j1(iu30Var3, (byte) 6);
                        x340Var11.s0(objT);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT), ldx.c, uyn1.z(cbx.b(x340Var9).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, dqj.b, x340Var9, 0, 48, 2040);
                    x340Var11.r(true);
                    x340Var11.r(true);
                    return rih1Var;
                }
                m4cVar = m4cVar4;
                objT13 = new y0j1(iu30Var3, (byte) 5);
                x340Var11.s0(objT13);
                z50 z50Var2 = z50.c;
                foo1.c(new gbx(z50Var2, (Function0) objT13), new idx(8), uyn1.z(cbx.b(x340Var9).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, dqj.a, x340Var9, 0, 48, 2040);
                cvx cvxVar2 = cbx.b(x340Var9).b;
                op71.g(x340Var9, u291.h(nim0Var, 16.0f));
                if (i6 <= 256) {
                }
                objT = x340Var11.T();
                if (z3) {
                    objT = new y0j1(iu30Var3, (byte) 6);
                    x340Var11.s0(objT);
                } else {
                    objT = new y0j1(iu30Var3, (byte) 6);
                    x340Var11.s0(objT);
                }
                foo1.c(new gbx(z50Var2, (Function0) objT), ldx.c, uyn1.z(cbx.b(x340Var9).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, dqj.b, x340Var9, 0, 48, 2040);
                x340Var11.r(true);
                x340Var11.r(true);
                return rih1Var;
            case 6:
                x2j1 x2j1Var = (x2j1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                y2j1 y2j1Var = (y2j1) obj6;
                jtl1 jtl1Var = y2j1Var.a;
                ven0 ven0VarK = f4p1.k(jtl1Var.b, (iac0) null, x340Var12, 7);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                mbh mbhVarA3 = jbh.a(f36Var, een.Q0, x340Var12, 0);
                x340 x340Var13 = x340Var12;
                int iHashCode3 = Long.hashCode(x340Var13.T);
                xos0 xos0VarM3 = x340Var13.m();
                qim0 qim0VarE3 = zr7.E(x340Var12, qim0VarF);
                hzj.A.getClass();
                x340 x340Var14 = x340Var12;
                if (x340Var14.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(hmb0.t1);
                } else {
                    x340Var14.v0();
                }
                nko1.H(mbhVarA3, x340Var12, y580.O0);
                nko1.H(xos0VarM3, x340Var12, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var12, y580.R0);
                nko1.F(x340Var12);
                nko1.H(qim0VarE3, x340Var12, y580.Y);
                String str12 = x2j1Var.a;
                String str13 = x2j1Var.b;
                c380 c380VarA = mqo1.A(x2j1Var.c);
                htl1 htl1Var = (htl1) ven0VarK.getValue();
                int i7 = u890.j(htl1Var != null ? htl1Var.b : null, brl1.b) ? 1 : 3;
                j2i j2iVarR3 = apo.r(1712503038, new sgi1(y2j1Var, iu30Var4, (byte) 6), x340Var12);
                boolean z17 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var14.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                Object objT14 = x340Var14.T();
                if (z17 || objT14 == fkj0.X) {
                    objT14 = new ceg1(iu30Var4, (byte) 18);
                    x340Var14.s0(objT14);
                }
                yzo1.i(jtl1Var, str12, str13, c380VarA, i7, j2iVarR3, (qim0) null, (String) null, (a0e1) null, (TextUnit) null, (iu30) objT14, x340Var12, 196608, 960);
                x340Var14.r(true);
                return rih1Var;
            case 7:
                i3j1 i3j1Var = (i3j1) obj2;
                i0p1.f(i3j1Var.b, (iu30) obj3, (i8h1) ((hw2) obj6).g, i3j1Var.a, (qim0) null, (qn30) null, i3j1Var.d, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 112, 48);
                return rih1Var;
            case 8:
                i3j1 i3j1Var2 = (i3j1) obj2;
                i0p1.f(i3j1Var2.b, (iu30) obj3, (i8h1) ((rwj) obj6).f, i3j1Var2.a, (qim0) null, i3j1Var2.c, i3j1Var2.d, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 112, 16);
                return rih1Var;
            case 9:
                ksw kswVar = (ksw) obj;
                fdj1 fdj1Var = (fdj1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                pt ptVar = (pt) obj6;
                lbj1 lbj1Var = (lbj1) ptVar.g;
                int i8 = (iIntValue5 & 896) ^ 384;
                boolean z18 = (i8 > 256 && x340Var15.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                x340 x340Var16 = x340Var15;
                boolean zI2 = z18 | x340Var16.i(ptVar);
                Object objT15 = x340Var16.T();
                if (zI2 || objT15 == m4cVar5) {
                    objT15 = new rzf1(iu30Var5, ptVar, (byte) 23);
                    x340Var16.s0(objT15);
                }
                n9p1.e(kswVar, (iu30) objT15, x340Var16, iIntValue5 & 14);
                boolean zB = ((crl1) x340Var16.k(t4k.u)).b();
                Boolean boolValueOf = Boolean.valueOf(zB);
                boolean zH = ((i8 > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256) | x340Var16.h(zB);
                Object objT16 = x340Var16.T();
                if (zH || objT16 == m4cVar5) {
                    objT16 = new ag21(iu30Var5, zB, (byte) 7);
                    x340Var16.s0(objT16);
                }
                qxd0.C(boolValueOf, (Function0) objT16, x340Var16);
                Object objT17 = x340Var16.T();
                if (objT17 == m4cVar5) {
                    objT17 = ((g9c0) ptVar.f).a(lbj1Var.d);
                    x340Var16.s0(objT17);
                }
                woa woaVar = (woa) objT17;
                jbj1 jbj1Var = lbj1Var.b;
                j2i j2iVarR4 = apo.r(-1298550581, new wpg1(ptVar, fdj1Var, iu30Var5, (byte) 28), x340Var16);
                boolean zI3 = x340Var16.i(woaVar) | x340Var16.i(ptVar);
                Object objT18 = x340Var16.T();
                if (zI3 || objT18 == m4cVar5) {
                    objT18 = new rzf1(woaVar, ptVar, (byte) 24);
                    x340Var16.s0(objT18);
                }
                iu30 iu30Var6 = (iu30) objT18;
                boolean z19 = (i8 > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT19 = x340Var16.T();
                if (z19 || objT19 == m4cVar5) {
                    objT19 = new y0j1(iu30Var5, (byte) 16);
                    x340Var16.s0(objT19);
                }
                Function0 function4 = (Function0) objT19;
                boolean z20 = (i8 > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT20 = x340Var16.T();
                if (z20 || objT20 == m4cVar5) {
                    objT20 = new y0j1(iu30Var5, (byte) 17);
                    x340Var16.s0(objT20);
                }
                Function0 function5 = (Function0) objT20;
                boolean z21 = (i8 > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT21 = x340Var16.T();
                if (z21 || objT21 == m4cVar5) {
                    objT21 = new y0j1(iu30Var5, (byte) 18);
                    x340Var16.s0(objT21);
                }
                Function0 function6 = (Function0) objT21;
                boolean z22 = (i8 > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT22 = x340Var16.T();
                if (z22 || objT22 == m4cVar5) {
                    objT22 = new y0j1(iu30Var5, (byte) 19);
                    x340Var16.s0(objT22);
                }
                Function0 function7 = (Function0) objT22;
                boolean z23 = (i8 > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT23 = x340Var16.T();
                if (z23 || objT23 == m4cVar5) {
                    objT23 = new y0j1(iu30Var5, (byte) 20);
                    x340Var16.s0(objT23);
                }
                Function0 function8 = (Function0) objT23;
                boolean z24 = (i8 > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT24 = x340Var16.T();
                if (z24 || objT24 == m4cVar5) {
                    objT24 = new y0j1(iu30Var5, (byte) 15);
                    x340Var16.s0(objT24);
                }
                Function0 function9 = (Function0) objT24;
                qim0 qim0VarZ3 = u291.z(u291.f(anm1.N(czd1.a, nim0Var), 1.0f), (fra) null, 3);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var16).b;
                p1p1.u(fdj1Var, jbj1Var, j2iVarR4, iu30Var6, function4, function5, function6, function7, function8, function9, uyn1.y(qim0VarZ3, 16.0f, cbx.b(x340Var16).b.b), x340Var16, ((iIntValue5 >> 3) & 14) | 384);
                return rih1Var;
            case 10:
                ksw kswVar2 = (ksw) obj;
                afj1 afj1Var = (afj1) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                int iIntValue6 = ((Number) obj5).intValue();
                yej1 yej1Var = afj1Var.a;
                hw2 hw2Var = (hw2) obj6;
                x340 x340Var17 = (b0k) obj4;
                Object objT25 = x340Var17.T();
                m4c m4cVar6 = fkj0.X;
                if (objT25 == m4cVar6) {
                    objT25 = ((b6j1) hw2Var.g).b;
                    x340Var17.s0(objT25);
                }
                zau0 zau0Var = (zau0) objT25;
                Object objT26 = x340Var17.T();
                if (objT26 == m4cVar6) {
                    objT26 = ((vtm0) hw2Var.i).a((a9l1) hw2Var.h);
                    x340Var17.s0(objT26);
                }
                xtm0 xtm0Var = (xtm0) objT26;
                boolean zG = x340Var17.g(yej1Var.a);
                Object objT27 = x340Var17.T();
                if (zG || objT27 == m4cVar6) {
                    objT27 = v8r.q(Boolean.FALSE);
                    x340Var17.s0(objT27);
                }
                ven0 ven0Var = (ven0) objT27;
                y9l1 y9l1Var = ((ul7) x340Var17.k(vl7.a)).a;
                if (y9l1Var == null) {
                    u890.C("attentionTracker");
                    throw null;
                }
                String str14 = yej1Var.a;
                boolean zI4 = x340Var17.i(ven0Var);
                Object objT28 = x340Var17.T();
                if (zI4 || objT28 == m4cVar6) {
                    objT28 = new aya1(ven0Var, (byte) 25);
                    x340Var17.s0(objT28);
                }
                Function0 function10 = (Function0) objT28;
                boolean zI5 = x340Var17.i(ven0Var) | x340Var17.i(xtm0Var);
                Object objT29 = x340Var17.T();
                if (zI5 || objT29 == m4cVar6) {
                    objT29 = new mah1(xtm0Var, ven0Var, (byte) 18);
                    x340Var17.s0(objT29);
                }
                i1o1.b(kswVar2, y9l1Var, str14, function10, (Function0) objT29, x340Var17, iIntValue6 & 14, 0);
                boolean zI6 = x340Var17.i(ven0Var) | x340Var17.i(afj1Var) | x340Var17.i(xtm0Var) | x340Var17.i(zau0Var);
                Object objT30 = x340Var17.T();
                if (zI6 || objT30 == m4cVar6) {
                    objT30 = new nsf1(ven0Var, afj1Var, xtm0Var, zau0Var, (lnm) null, (byte) 11);
                    x340Var17.s0(objT30);
                }
                qxd0.t(afj1Var, x340Var17, (vu30) objT30);
                boolean zI7 = x340Var17.i(xtm0Var);
                Object objT31 = x340Var17.T();
                if (zI7 || objT31 == m4cVar6) {
                    objT31 = new xaj1(xtm0Var, (byte) 6);
                    x340Var17.s0(objT31);
                }
                qxd0.i(rih1Var, (iu30) objT31, x340Var17);
                ven0 ven0VarG = rwq.g(xtm0Var.i, Boolean.FALSE, (o8n) null, x340Var17, 48, 2);
                String str15 = afj1Var.b;
                String str16 = afj1Var.d;
                if (str16 == null) {
                    str16 = "";
                }
                String str17 = str16;
                String str18 = afj1Var.f;
                boolean zBooleanValue = ((Boolean) ven0VarG.getValue()).booleanValue();
                Float f = afj1Var.e;
                cr31 cr31VarB = er31.b(16.0f);
                qim0 qim0VarR = d7e.r(yej1Var.f, nim0Var, false);
                boolean z25 = (((iIntValue6 & 896) ^ 384) > 256 && x340Var17.g(iu30Var7)) || (iIntValue6 & 384) == 256;
                Object objT32 = x340Var17.T();
                if (z25 || objT32 == m4cVar6) {
                    objT32 = new y0j1(iu30Var7, (byte) 21);
                    x340Var17.s0(objT32);
                }
                Function0 function11 = (Function0) objT32;
                boolean zI8 = x340Var17.i(ven0Var) | x340Var17.i(xtm0Var);
                Object objT33 = x340Var17.T();
                if (zI8 || objT33 == m4cVar6) {
                    objT33 = new rzf1(xtm0Var, ven0Var, (byte) 29);
                    x340Var17.s0(objT33);
                }
                xto.f(str15, str17, str18, function11, qim0VarR, cr31VarB, (String) null, f, zBooleanValue, (String) null, (String) null, (iu30) objT33, (Function0) null, x340Var17, 0, 5696);
                return rih1Var;
            case 11:
                ((g2z) obj6).q((zej1) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 12:
                return a(obj, obj2, obj3, obj4, obj5);
            case 13:
                return d(obj, obj2, obj3, obj4, obj5);
            case 14:
                return e(obj, obj2, obj3, obj4, obj5);
            case 15:
                return f(obj, obj2, obj3, obj4, obj5);
            case 16:
                return g(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return i(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return j(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return k(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return m(obj, obj2, obj3, obj4, obj5);
            case 22:
                return n(obj, obj2, obj3, obj4, obj5);
            case 23:
                return o(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return p(obj, obj2, obj3, obj4, obj5);
            case 25:
                return q(obj, obj2, obj3, obj4, obj5);
            case 26:
                return r(obj, obj2, obj3, obj4, obj5);
            case 27:
                return s(obj, obj2, obj3, obj4, obj5);
            case 28:
                return t(obj, obj2, obj3, obj4, obj5);
            default:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                m4c m4cVar7 = fkj0.X;
                vbe1 vbe1Var = (vbe1) obj6;
                ven0 ven0VarH = rwq.h((wen0) vbe1Var.f, x340Var18, 0);
                ven0 ven0VarG2 = rwq.g((mr20) vbe1Var.g, new x7m1(z6x.a, false), (o8n) null, x340Var18, 0, 2);
                ven0 ven0VarH2 = rwq.h(((o7m1) vbe1Var.e).h, x340Var18, 0);
                boolean z26 = ((x7m1) ven0VarG2.getValue()).a;
                boolean zBooleanValue2 = ((Boolean) ven0VarH.getValue()).booleanValue();
                int i9 = (iIntValue7 & 896) ^ 384;
                boolean z27 = (i9 > 256 && x340Var18.g(iu30Var8)) || (iIntValue7 & 384) == 256;
                x340 x340Var19 = x340Var18;
                Object objT34 = x340Var19.T();
                if (z27 || objT34 == m4cVar7) {
                    objT34 = new wel1(iu30Var8, (byte) 12);
                    x340Var19.s0(objT34);
                }
                Function0 function12 = (Function0) objT34;
                l7m1 l7m1Var = (l7m1) ven0VarH2.getValue();
                if (l7m1Var == null || (list = l7m1Var.a) == null) {
                    list = ((x7m1) ven0VarG2.getValue()).b;
                }
                List list3 = list;
                boolean z28 = ((l7m1) ven0VarH2.getValue()) != null;
                boolean z29 = (i9 > 256 && x340Var19.g(iu30Var8)) || (iIntValue7 & 384) == 256;
                Object objT35 = x340Var19.T();
                if (z29 || objT35 == m4cVar7) {
                    objT35 = new otj1(iu30Var8, (byte) 8);
                    x340Var19.s0(objT35);
                }
                men1.j(z26, zBooleanValue2, function12, list3, z28, (iu30) objT35, null, x340Var19, 0);
                return rih1Var;
        }
    }
}
