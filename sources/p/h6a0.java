package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h6a0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6a0(jgf0 jgf0Var, iu30 iu30Var, ogf0 ogf0Var) {
        super(3);
        this.a = (byte) 18;
        this.b = jgf0Var;
        this.c = iu30Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.c;
        if (((ine0) this.b).d) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(2134330525);
            String strO0 = cwl1.o0(x340Var2, 2131961173);
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new ijd0(iu30Var, (byte) 12);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            wro1.l(new gbx(new y50(strO0), function0), anm1.N("RemoveButton", nim0.a), (max) null, (gdx) null, (idn0) null, lxi.b, x340Var2, 196608, 28);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(2134823518);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarD = u291.d(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        qim0 qim0VarW = uyn1.w(dug.f(qim0VarD, u7h.b(cbx.a(b0kVar).a.c, 0.95f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), (vzq0) obj);
        are0 are0Var = (are0) this.b;
        j2i j2iVar = (j2i) this.c;
        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar, 0);
        x340 x340Var = (x340) b0kVar;
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarW);
        hzj.A.getClass();
        x340 x340Var2 = (x340) b0kVar;
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
        nko1.H(mbhVarA, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        String strA = are0Var.a.b.a();
        if (strA == null) {
            x340Var2.i0(1813987970);
            x340Var2.r(false);
        } else {
            x340Var2.i0(1813987971);
            ti5.a(apo.r(-162658982, new y5d0(strA, (byte) 11), b0kVar), (qim0) null, (vu30) null, (xu30) null, 0.0f, (erl1) null, kkn.l(cbx.a(b0kVar).c.d, 0L, 0L, b0kVar, 30), b0kVar, 6, 190);
            b0kVar = b0kVar;
            x340Var2.r(false);
        }
        j2iVar.invoke(b0kVar, 0);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        kiv kivVar = t4k.h;
        b0k b0kVar = (x340) ((b0k) obj2);
        float fX0 = ((wat) b0kVar.k(kivVar)).X0(((i2c) obj).d());
        float fX1 = ((wat) b0kVar.k(kivVar)).X0(24.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        float fX2 = ((wat) b0kVar.k(kivVar)).X0(8.0f);
        float fX3 = ((wat) b0kVar.k(kivVar)).X0(60.0f);
        ven0 ven0Var = (ven0) this.c;
        boolean zG = b0kVar.g((List) ven0Var.getValue()) | b0kVar.d(fX0) | b0kVar.d(fX1) | b0kVar.d(fX2);
        Object objT = b0kVar.T();
        float f = 0.0f;
        Object obj4 = objT;
        if (zG || objT == m4cVar) {
            ArrayList arrayList = new ArrayList();
            List<fpv0> list = (List) ven0Var.getValue();
            list.getClass();
            float fMin = 0.0f;
            for (fpv0 fpv0Var : list) {
                fMin += Math.min(fpv0Var.b * (fX1 / fpv0Var.c), fX3) + fX2;
                if (fMin > fX0) {
                    break;
                }
                arrayList.add(fpv0Var);
            }
            b0kVar.s0(arrayList);
            obj4 = arrayList;
        }
        List list2 = (List) obj4;
        qim0 qim0Var = nim0.a;
        qim0 qim0VarH = u291.h(qim0Var, 24.0f);
        boolean z = false;
        jw31 jw31VarA = ew31.a(new d36(8.0f, true, new g21((nl3) this.b, (byte) 29)), een.N0, b0kVar, 0);
        int iHashCode = Long.hashCode(((x340) b0kVar).T);
        xos0 xos0VarM = b0kVar.m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarH);
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
        nko1.H(jw31VarA, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        b0kVar.i0(-176695938);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            fpv0 fpv0Var2 = (fpv0) it.next();
            Object objT2 = b0kVar.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Uri uri = Uri.parse(fpv0Var2.a);
            boolean zI = b0kVar.i(ven0Var2);
            Object objT3 = b0kVar.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new sqa0(ven0Var2, (byte) 2);
                b0kVar.s0(objT3);
            }
            b0k b0kVar2 = b0kVar;
            float f2 = f;
            Iterator it2 = it;
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT3, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 126974);
            qim0 qim0VarK = d9y0.k(qim0Var, f2);
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                qim0VarK = null;
            }
            if (qim0VarK == null) {
                qim0VarK = qim0Var;
            }
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarK, er31.b(2.0f)), u7h.f, d4o1.a);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            b0kVar = b0kVar2;
            cwl1.f(ni7VarA, (String) null, u291.h(u291.x(f2, 60.0f, 1, uyn1.x(qim0VarF, 2.0f)), 24.0f), (tl3) null, mif1.Q0, 0.0f, (ColorFilter) null, b0kVar, 48, 104);
            it = it2;
            f = f2;
            z = false;
        }
        b0kVar.r(z);
        b0kVar.r(true);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        cgf0 cgf0Var = (cgf0) obj;
        ((Number) obj3).intValue();
        jgf0 jgf0Var = (jgf0) this.b;
        x340 x340Var = (b0k) obj2;
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        iu30 iu30Var = (iu30) this.c;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            apf0 apf0Var = new apf0(cir0Var, new jwa0(iu30Var, (byte) 26));
            x340Var.s0(apf0Var);
            objT = apf0Var;
        }
        apf0 apf0Var2 = (apf0) objT;
        xmx xmxVar = xmx.c;
        String strO0 = cwl1.o0(x340Var, cgf0Var.a);
        boolean zI = x340Var.i(jgf0Var) | x340Var.g(iu30Var) | x340Var.i(apf0Var2) | x340Var.i(cgf0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            jzm jzmVar = new jzm(jgf0Var, iu30Var, apf0Var2, cgf0Var, (byte) 28);
            x340Var.s0(jzmVar);
            objT2 = jzmVar;
        }
        r4o1.p(xmx.d, strO0, (Function0) objT2, x340Var, xmxVar, (qim0) null);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        rcx rcxVar = (rcx) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        List list = (List) this.c;
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(rcxVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var2, 2131957885);
            String strO1 = cwl1.o0(x340Var2, 2131957869);
            scx scxVar = (scx) this.b;
            boolean zG = x340Var2.g(scxVar);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                p350 p350Var = new p350(0, scxVar, scx.class, "dismiss", "dismiss()V", 0, (byte) 29);
                x340Var2.s0(p350Var);
                objT = p350Var;
            }
            tm80.k(strO0, strO1, (Function0) objT, x340Var2, 0, 0);
            qim0 qim0VarN = anm1.N("lyrics-formatting-tips-content", rcxVar.a(1.0f, u291.f(nim0.a, 1.0f), true));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            float f = cbx.b(x340Var2).b.a;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            zzq0 zzq0Var = new zzq0(16.0f, f, 16.0f, cbx.b(x340Var2).b.b);
            boolean zG2 = x340Var2.g(list);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new nec0(list, (byte) 4);
                x340Var2.s0(objT2);
            }
            ujo1.d(qim0VarN, (xtb0) null, zzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT2, x340Var2, 0, 506);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ng20 ng20Var = (ng20) this.b;
        iu30 iu30Var = (iu30) this.c;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new uef0(iu30Var, (byte) 20);
            x340Var.s0(objT);
        }
        ng20Var.g(0, (Function0) objT, x340Var, (qim0) null);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        v0g0 v0g0Var = (v0g0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(v0g0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            x340Var2.b0();
        } else if (v0g0Var.equals(u0g0.b)) {
            x340Var2.i0(-77191939);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-77341855);
            int i = iIntValue & 14;
            boolean z = i == 4;
            p0g0 p0g0Var = (p0g0) this.c;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new j6r0(yoi1.i(new b8d0(p0g0Var.b, v0g0Var, (byte) 16), o6x.a));
                x340Var2.s0(objT);
            }
            ((j0g0) this.b).a(v0g0Var, (j6r0) objT, x340Var2, i);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        xxr0 xxr0Var = (xxr0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(xxr0Var) : x340Var.i(xxr0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            otw.c((d621) this.b, new c621(xxr0Var.a, ((h7g0) this.c).c, xxr0Var.i), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((cx0) ((pbq) this.b).h, new rh51((String) ((vu30) this.c).invoke(x340Var2, 0), true), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            qj0 qj0Var = (qj0) ((bjx) this.b).b;
            b9g0 b9g0Var = (b9g0) this.c;
            fy3 fy3Var = new fy3(b9g0Var.a, b9g0Var.b);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            otw.c(qj0Var, fy3Var, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 16.0f, 5), (ipb1) null, x340Var2, 0, 8);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((f2f0) this.b, new d2f0(((bx) this.c).a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((h7l) this.b, new g7l(((bx) this.c).f), (qim0) null, (ipb1) null, x340Var2, 6, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((es00) this.b, new ds00(1, ((bx) this.c).c, false), (qim0) null, (ipb1) null, x340Var2, 6, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        float f3;
        n8b1 n8b1Var;
        ven0 ven0Var;
        Object sqa0Var;
        d0r d0rVar;
        String str;
        qim0 qim0Var;
        boolean z;
        q7r0 q7r0Var;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                era eraVar = een.Q0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                k5a0 k5a0Var = (k5a0) obj5;
                gbx gbxVar = (gbx) obj4;
                mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (k5a0Var instanceof i5a0) {
                    x340Var3.i0(1900870974);
                    x2g0.i(((i5a0) k5a0Var).b, anm1.N("device-picker-ui-header-face-pile-icon", nim0Var), hcx.b, hrx.c, 0, gbxVar, gbxVar.c, x340Var, (hrx.d << 9) | 384, 16);
                    uwo1.e(cwl1.o0(x340Var, 2131957152), anm1.N("device-picker-ui-header-start-jam-label", nim0Var), cbx.d(x340Var).m, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1712);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(1901613362);
                    tnx tnxVar = tnx.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0 qim0VarV = u291.v(nim0Var, 24.0f);
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    w0h1.a(tnxVar, isl.a, anm1.N("device-picker-ui-header-start-jam-icon", u291.h(qim0VarV, 24.0f)), cbx.a(x340Var).b.a, 0L, false, x340Var, tnx.d | 196656, 16);
                    uwo1.e(cwl1.o0(x340Var, 2131957151), anm1.N("device-picker-ui-header-start-jam-label", nim0Var), cbx.d(x340Var).m, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1712);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String str3 = ((sna0) obj4).a;
                    otw.c((xho) obj5, new uho(str3, str3, (tho) null, lho.a, (String) null, (Function0) null, 244), (qim0) null, (ipb1) null, x340Var5, 8, 12);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 2:
                qim0 qim0Var2 = (qim0) obj;
                ((Number) obj3).intValue();
                xta0 xta0Var = (xta0) obj4;
                x340 x340Var6 = (b0k) obj2;
                x340Var6.i0(1082400923);
                Object objT = x340Var6.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = qxd0.M(o6x.a, x340Var6);
                    x340Var6.s0(objT);
                }
                c9n c9nVar = (c9n) objT;
                wat watVar = (wat) x340Var6.k(t4k.h);
                Object objT2 = x340Var6.T();
                if (objT2 == m4cVar) {
                    objT2 = new mqa0();
                    x340Var6.s0(objT2);
                }
                mqa0 mqa0Var = (mqa0) objT2;
                ven0 ven0VarS = v8r.s((Function0) obj5, x340Var6);
                ven0 ven0VarS2 = v8r.s(xta0Var, x340Var6);
                Object objT3 = x340Var6.T();
                if (objT3 == m4cVar) {
                    objT3 = kaa0.h(0L, x340Var6);
                }
                ven0 ven0Var2 = (ven0) objT3;
                uwr uwrVar2 = cbx.a;
                xpv0 xpv0Var = cbx.c(x340Var6).c;
                n8b1 n8b1VarL0 = irn1.l0(pto1.q(950, 2, 96.0f), 950.0f, (Object) null, 4);
                int iH = (int) jfv.h(cbx.c(x340Var6).b.a);
                ceo ceoVar = ((jhx) cbx.c(x340Var6).a.c).a;
                boolean zE = x340Var6.e(iH) | x340Var6.g(ceoVar);
                Object objT4 = x340Var6.T();
                if (zE || objT4 == m4cVar) {
                    objT4 = irn1.o0(iH, 0, ceoVar, 2);
                    x340Var6.s0(objT4);
                }
                pxg1 pxg1Var = (pxg1) objT4;
                float fX0 = watVar.X0(80.0f);
                float fX1 = watVar.X0(600.0f);
                float fX2 = watVar.X0(60.0f);
                float fS = mqa0Var.a.s();
                boolean zD = x340Var6.d(fX0) | x340Var6.d(fX1) | x340Var6.d(fX2) | x340Var6.g(pxg1Var) | x340Var6.g(n8b1VarL0);
                Object objT5 = x340Var6.T();
                if (zD || objT5 == m4cVar) {
                    objT5 = new yqa0(mqa0Var, fX2, fX0, fX1, pxg1Var, n8b1VarL0, ven0VarS);
                    f = fX2;
                    f2 = fX0;
                    f3 = fX1;
                    n8b1Var = n8b1VarL0;
                    ven0Var = ven0VarS;
                    x340Var6.s0(objT5);
                } else {
                    f = fX2;
                    f3 = fX1;
                    f2 = fX0;
                    n8b1Var = n8b1VarL0;
                    ven0Var = ven0VarS;
                }
                yqa0 yqa0Var = (yqa0) objT5;
                boolean zI = x340Var6.i(mqa0Var);
                Object objT6 = x340Var6.T();
                if (zI || objT6 == m4cVar) {
                    objT6 = new lqa0(mqa0Var, (byte) 2);
                    x340Var6.s0(objT6);
                }
                qim0 qim0VarU = lrn1.u(qim0Var2, (iu30) objT6);
                boolean zI2 = x340Var6.i(ven0Var2);
                Object objT7 = x340Var6.T();
                if (zI2 || objT7 == m4cVar) {
                    sqa0Var = new sqa0(ven0Var2, (byte) 0);
                    x340Var6.s0(sqa0Var);
                } else {
                    sqa0Var = objT7;
                }
                qim0 qim0VarL = bmq0.L(ern1.x(qim0VarU, (iu30) sqa0Var), yqa0Var, (g6o0) null);
                float f4 = f;
                boolean zI3 = x340Var6.i(ven0Var2) | x340Var6.i(ven0VarS2) | x340Var6.i(mqa0Var) | x340Var6.d(f4) | x340Var6.i(c9nVar) | x340Var6.d(f2) | x340Var6.d(f3) | x340Var6.i(pxg1Var) | x340Var6.i(n8b1Var) | x340Var6.i(ven0Var);
                Object objT8 = x340Var6.T();
                if (zI3 || objT8 == m4cVar) {
                    vqa0 vqa0Var = new vqa0(ven0VarS2, mqa0Var, f4, c9nVar, ven0Var2, f2, f3, pxg1Var, n8b1Var, ven0Var);
                    x340Var6.s0(vqa0Var);
                    objT8 = vqa0Var;
                }
                qim0 qim0VarB = f8d1.b(qim0VarL, xta0Var, (PointerInputEventHandler) objT8);
                boolean zD2 = x340Var6.d(fS);
                Object objT9 = x340Var6.T();
                if (zD2 || objT9 == m4cVar) {
                    objT9 = new jc5((byte) 26, fS);
                    x340Var6.s0(objT9);
                }
                qim0 qim0VarC = i541.C(qim0VarB, (iu30) objT9);
                x340Var6.r(false);
                return qim0VarC;
            case 3:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                dab0 dab0Var = (dab0) obj5;
                anm1.c(dab0Var.c, (iu30) obj4, anm1.N(dab0Var.c ? "labeled.switch.on" : "labeled.switch.off", nim0Var), (max) null, (idn0) null, b0kVar, 0, 24);
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                Object obj6 = fkj0.X;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(anm1.N("landing_page", qim0Var3), 1.0f);
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var7).e.c, 0.0f, 2, qim0VarF);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(x340Var7).g, 32, qim0VarZ);
                era eraVar2 = een.Q0;
                qab0 qab0Var = (qab0) obj5;
                psy psyVar = (psy) obj4;
                q7r0 q7r0Var2 = (q7r0) psyVar.X;
                d0r d0rVar2 = psyVar.b;
                mbh mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var7, 0);
                x340 x340Var8 = x340Var7;
                int iHashCode2 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM2 = x340Var8.m();
                qim0 qim0VarE2 = zr7.E(x340Var7, qim0VarP);
                hzj.A.getClass();
                x340 x340Var9 = x340Var7;
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA2, x340Var7, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var7, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var7, lljVar3);
                nko1.F(x340Var7);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var7, lljVar4);
                x340Var9.i0(1448949853);
                List list = qab0Var.i;
                String str4 = qab0Var.a;
                String str5 = qab0Var.b;
                if (list.isEmpty()) {
                    x340Var9.r(false);
                } else {
                    if (list.contains(tab0.a)) {
                        x340Var9.i0(1448961787);
                        if (qab0Var.f) {
                            x340Var9.i0(1448966127);
                            cvx cvxVar2 = cbx.b(x340Var7).b;
                            op71.g(x340Var7, u291.h(qim0Var3, 16.0f));
                            cua cuaVar = cbx.b(x340Var7).f;
                            qim0 qim0VarO = sto1.o(qim0Var3, 8.0f, er31.b(6.0f), false, 0L, 0L, 28);
                            qim0Var = qim0Var3;
                            gfh0 gfh0VarC = t1c.c(een.d, false);
                            int iHashCode3 = Long.hashCode(x340Var9.T);
                            xos0 xos0VarM3 = x340Var9.m();
                            qim0 qim0VarE3 = zr7.E(x340Var7, qim0VarO);
                            x340Var9.m0();
                            if (x340Var9.S) {
                                x340Var9.l(n4kVar);
                            } else {
                                x340Var9.v0();
                            }
                            nko1.H(gfh0VarC, x340Var7, lljVar);
                            nko1.H(xos0VarM3, x340Var7, lljVar2);
                            i3a.l(iHashCode3, x340Var7, lljVar3, x340Var7);
                            nko1.H(qim0VarE3, x340Var7, lljVar4);
                            Object objT10 = x340Var9.T();
                            if (objT10 == obj6) {
                                objT10 = ((axo) psyVar.i).a(d0rVar2, u291.r(qim0Var, 88.0f));
                                x340Var9.s0(objT10);
                            }
                            str = str5;
                            i1o1.e((e37) objT10, new w27(str), d0rVar2, (qim0) null, (ipb1) null, sui.a, (xu30) null, 0, (xu30) null, x340Var7, 196616, 236);
                            d0rVar = d0rVar2;
                            x340Var9.r(true);
                            x340Var9.r(false);
                        } else {
                            d0rVar = d0rVar2;
                            str = str5;
                            qim0Var = qim0Var3;
                            x340Var9.i0(1449729161);
                            x340Var9.r(false);
                        }
                        cvx cvxVar3 = cbx.b(x340Var7).b;
                        op71.g(x340Var7, u291.h(qim0Var, 16.0f));
                        Object objT11 = x340Var9.T();
                        if (objT11 == obj6) {
                            objT11 = ((bxo) psyVar.e).a(d0rVar, true);
                            x340Var9.s0(objT11);
                        }
                        i1o1.e((ugx0) objT11, new qgx0(str), d0rVar, (qim0) null, (ipb1) null, sui.b, (xu30) null, 0, (xu30) null, x340Var7, 196616, 236);
                        cvx cvxVar4 = cbx.b(x340Var7).b;
                        op71.g(x340Var7, u291.h(qim0Var, 12.0f));
                        qab0Var = qab0Var;
                        String str6 = qab0Var.e;
                        if (str6 == null) {
                            x340Var9.i0(1450281890);
                            x340Var9.r(false);
                            z3 = false;
                        } else {
                            x340Var9.i0(1450281891);
                            Object objT12 = x340Var9.T();
                            if (objT12 == obj6) {
                                objT12 = ((cxo) psyVar.f).a(d0rVar);
                                x340Var9.s0(objT12);
                            }
                            z3 = false;
                            i1o1.e((jle) objT12, new hle(str6, false), d0rVar, (qim0) null, (ipb1) null, sui.c, (xu30) null, 0, (xu30) null, x340Var7, 196616, 236);
                            x340Var9.r(false);
                        }
                        x340Var9.r(z3);
                    } else {
                        list = list;
                        q7r0Var2 = q7r0Var2;
                        d0rVar = d0rVar2;
                        str = str5;
                        qim0Var = qim0Var3;
                        x340Var9.i0(1450666601);
                        x340Var9.r(false);
                    }
                    List list2 = list;
                    if (list2.contains(tab0.b)) {
                        x340Var9.i0(1450755013);
                        uwo1.e(eqq.n(qim0Var, cbx.b(x340Var7).b.a, x340Var7, 2131959501, x340Var7), (qim0) null, cbx.d(x340Var7).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2026);
                        cvx cvxVar5 = cbx.b(x340Var7).b;
                        uwo1.e(eqq.n(qim0Var, 8.0f, x340Var7, 2131959500, x340Var7), (qim0) null, cbx.d(x340Var7).g, cbx.a(x340Var7).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2018);
                        z = false;
                        x340Var9.r(false);
                    } else {
                        z = false;
                        x340Var9.i0(1451373897);
                        x340Var9.r(false);
                    }
                    op71.g(x340Var7, u291.h(qim0Var, cbx.b(x340Var7).b.a));
                    x340Var9.i0(1453353929);
                    x340Var9.r(z);
                    if (list2.contains(tab0.c)) {
                        x340Var9.i0(1453432824);
                        Object objT13 = x340Var9.T();
                        if (objT13 == obj6) {
                            ((ilp) psyVar.g).getClass();
                            q7r0Var = q7r0Var2;
                            objT13 = new eh41(q7r0Var);
                            x340Var9.s0(objT13);
                        } else {
                            q7r0Var = q7r0Var2;
                        }
                        str2 = str4;
                        otw.c((eh41) objT13, new dh41(str2, qab0Var.h), (qim0) null, (ipb1) null, x340Var7, 72, 12);
                        x340Var9.r(false);
                    } else {
                        q7r0Var = q7r0Var2;
                        str2 = str4;
                        x340Var9.i0(1453818185);
                        x340Var9.r(false);
                    }
                    if (list2.contains(tab0.d)) {
                        x340Var9.i0(1453896987);
                        cvx cvxVar6 = cbx.b(x340Var7).b;
                        op71.g(x340Var7, u291.h(qim0Var, 16.0f));
                        Object objT14 = x340Var9.T();
                        if (objT14 == obj6) {
                            ((jlp) psyVar.h).getClass();
                            objT14 = new jh41(d0rVar, q7r0Var);
                            x340Var9.s0(objT14);
                        }
                        otw.c((jh41) objT14, new hh41(str2, str), (qim0) null, (ipb1) null, x340Var7, 8, 12);
                        z2 = false;
                        x340Var9.r(false);
                    } else {
                        z2 = false;
                        x340Var9.i0(1454279465);
                        x340Var9.r(false);
                    }
                    x340Var9.i0(1454735785);
                    x340Var9.r(z2);
                    cvx cvxVar7 = cbx.b(x340Var7).b;
                    ydh.l(qim0Var, 8.0f, x340Var7, x340Var9, z2);
                }
                x340Var9.r(true);
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                boolean z5 = ((bfb0) obj5).a;
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var10 = (b0k) obj2;
                boolean zG = x340Var10.g(iu30Var);
                Object objT15 = x340Var10.T();
                if (zG || objT15 == fkj0.X) {
                    objT15 = new jwa0(iu30Var, (byte) 3);
                    x340Var10.s0(objT15);
                }
                anm1.c(z5, (iu30) objT15, anm1.N("larger_npb_setting_element_switch", nim0Var), (max) null, (idn0) null, x340Var10, 0, 24);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                qlb qlbVar = (qlb) obj5;
                i1o1.e((jd6) qlbVar.e, new r7k0(((pib0) obj4).a), qlbVar.b, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, (b0k) obj2, 64, 252);
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                fli0 fli0Var = (fli0) obj5;
                x340 x340Var12 = x340Var11;
                boolean zY = x340Var12.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16);
                j06 j06Var = x340Var12.a;
                if (zY) {
                    qim0 qim0VarZ2 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(z4p1.e(fli0Var.g), 1.0f, 0.0f, 0.0f, 0.0f, 14)));
                    Float fValueOf = Float.valueOf(1.0f);
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarE4 = dug.e(qim0VarZ2, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(cbx.a(x340Var12).a.c))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
                    ob9 ob9Var = (ob9) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM4 = x340Var12.m();
                    qim0 qim0VarE5 = zr7.E(x340Var12, qim0VarE4);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(gfh0VarC2, x340Var12, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM4, x340Var12, lljVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf2, x340Var12, lljVar7);
                    nko1.F(x340Var12);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE5, x340Var12, lljVar8);
                    mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var12, 0);
                    int iHashCode5 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM5 = x340Var12.m();
                    qim0 qim0VarE6 = zr7.E(x340Var12, nim0Var);
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(mbhVarA3, x340Var12, lljVar5);
                    nko1.H(xos0VarM5, x340Var12, lljVar6);
                    x0d.q(iHashCode5, x340Var12, lljVar7, x340Var12);
                    nko1.H(qim0VarE6, x340Var12, lljVar8);
                    wat watVar2 = (wat) x340Var12.k(t4k.h);
                    Context context = (Context) x340Var12.k(AndroidCompositionLocals_androidKt.b);
                    Object objT16 = x340Var12.T();
                    if (objT16 == fkj0.X) {
                        objT16 = ktd.k(watVar2.M0(h4o1.n(context.getResources())), x340Var12);
                    }
                    op71.g(x340Var12, u291.f(u291.h(nim0Var, 56.0f + ((p3v) objT16).a), 1.0f));
                    otw.c(ob9Var, new mb9(fli0Var.d, "", fli0Var.b), (qim0) null, (ipb1) null, x340Var12, 6, 12);
                    x340Var12.r(true);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                x340 x340Var13 = (b0k) obj2;
                Object objT17 = x340Var13.T();
                if (objT17 == fkj0.X) {
                    objT17 = hyb0.U0;
                    x340Var13.s0(objT17);
                }
                qim0 qim0VarA = s161.a(nim0Var, (iu30) objT17);
                rbc0 rbc0Var = (rbc0) obj5;
                jmb1 jmb1Var = (jmb1) obj4;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var13, 0);
                int iHashCode6 = Long.hashCode(x340Var13.T);
                xos0 xos0VarM6 = x340Var13.m();
                qim0 qim0VarE7 = zr7.E(x340Var13, qim0VarA);
                hzj.A.getClass();
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(jw31VarA, x340Var13, y580.O0);
                nko1.H(xos0VarM6, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE7, x340Var13, y580.Y);
                xpw xpwVar = (xpw) rbc0Var.b;
                if (xpwVar == null) {
                    x340Var13.i0(-473567386);
                    z4 = false;
                } else {
                    z4 = false;
                    x340Var13.i0(-473567385);
                    otw.c(xpwVar, jmb1Var.a, (qim0) null, (ipb1) null, x340Var13, 0, 12);
                }
                x340Var13.r(z4);
                kpg0 kpg0Var = (kpg0) rbc0Var.d;
                x340Var13.i0(-473482073);
                otw.c(kpg0Var, jmb1Var.a, (qim0) null, (ipb1) null, x340Var13, 0, 12);
                x340Var13.r(z4);
                x340Var13.r(true);
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj5;
                x340 x340Var14 = (b0k) obj2;
                boolean zG2 = x340Var14.g(iu30Var2);
                Object objT18 = x340Var14.T();
                if (zG2 || objT18 == fkj0.X) {
                    objT18 = new sya0(iu30Var2, (byte) 19);
                    x340Var14.s0(objT18);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT18);
                lex lexVarZ = yoo1.z(x340Var14);
                oex oexVar = new oex(0, oec0.d, oec0.b, oec0.c, 1);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar8 = cbx.b(x340Var14).b;
                poo1.e(gbxVar2, oexVar, lexVarZ, anm1.N("graduation_chip", nim0Var), 0, (String) null, (max) null, jvi.a, (vu30) null, (idn0) null, (ga80) null, false, uyn1.h(2, 16.0f, 0.0f), apo.r(-905000062, new yd2((Context) obj4, (byte) 5), x340Var14), x340Var14, 12585984, 3072, 3952);
                return rih1Var;
            case 10:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                sdd0 sdd0Var = (sdd0) obj5;
                pt ptVar = sdd0Var.d;
                tdd0 tdd0Var = (tdd0) obj4;
                String str7 = tdd0Var.a;
                String str8 = tdd0Var.b;
                if (str8 == null) {
                    str8 = str7;
                }
                otw.c(ptVar, new bz40(str7, str8, sdd0Var.h.g, tdd0Var.d), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                return rih1Var;
            case 11:
                x340 x340Var15 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                String str9 = (String) obj5;
                LocalDateTime localDateTime = (LocalDateTime) obj4;
                gra graVar = een.d;
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                x340 x340Var16 = x340Var15;
                int iHashCode7 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM7 = x340Var16.m();
                qim0 qim0VarE8 = zr7.E(x340Var15, qim0VarF2);
                hzj.A.getClass();
                x340 x340Var17 = x340Var15;
                if (x340Var17.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var17.m0();
                if (x340Var17.S) {
                    x340Var17.l(n4kVar);
                } else {
                    x340Var17.v0();
                }
                nko1.H(gfh0VarC3, x340Var15, y580.O0);
                nko1.H(xos0VarM7, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE8, x340Var15, y580.Y);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                uwr uwrVar6 = cbx.a;
                cua cuaVar2 = cbx.b(x340Var15).f;
                qim0 qim0VarK = xcg1.k(cbx.a, i1p1.q(qim0VarF3, er31.b(8.0f)));
                Uri uri = Uri.parse(str9 != null ? str9 : "");
                jsl jslVar = new jsl(cwl1.o0(x340Var15, 2131957475));
                as80 as80Var = mif1.P0;
                box boxVar = box.c;
                eso1.e(uri, jslVar, qim0VarK, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new nux(boxVar, boxVar), false, false, x340Var15, 1073741824, 0, 3512);
                LocalDate localDate = localDateTime.toLocalDate();
                qim0 qim0VarA2 = h2c.a.a(nim0Var, graVar);
                cvx cvxVar9 = cbx.b(x340Var15).b;
                cvx cvxVar10 = cbx.b(x340Var15).b;
                u0p1.c(localDate, uyn1.B(qim0VarA2, 6.0f, 6.0f, 0.0f, 0.0f, 12), x340Var15, 0);
                x340Var17.r(true);
                return rih1Var;
            case 12:
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar7 = cbx.a;
                cvx cvxVar11 = cbx.b(x340Var18).b;
                rv21 rv21Var = (rv21) obj5;
                dc81 dc81Var = (dc81) obj4;
                mbh mbhVarA4 = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var18, 0);
                x340 x340Var19 = x340Var18;
                int iHashCode8 = Long.hashCode(x340Var19.T);
                xos0 xos0VarM8 = x340Var19.m();
                qim0 qim0VarE9 = zr7.E(x340Var18, nim0Var);
                hzj.A.getClass();
                x340 x340Var20 = x340Var18;
                if (x340Var20.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(mbhVarA4, x340Var18, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM8, x340Var18, lljVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode8);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf3, x340Var18, lljVar11);
                nko1.F(x340Var18);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE9, x340Var18, lljVar12);
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA2 = ew31.a(h36.g, een.N0, x340Var18, 0);
                int iHashCode9 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM9 = x340Var20.m();
                qim0 qim0VarE10 = zr7.E(x340Var18, qim0VarF4);
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(jw31VarA2, x340Var18, lljVar9);
                nko1.H(xos0VarM9, x340Var18, lljVar10);
                i3a.l(iHashCode9, x340Var18, lljVar11, x340Var18);
                nko1.H(qim0VarE10, x340Var18, lljVar12);
                uwo1.e(dc81Var.a, new wnb0(1.0f, true), cbx.d(x340Var18).m, cbx.a(x340Var18).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var18, 0, 0, 1776);
                plx plxVar = plx.c;
                long j = cbx.a(x340Var18).b.b;
                zov0 zov0Var3 = cbx.b(x340Var18).g;
                w0h1.a(plxVar, isl.a, u291.r(nim0Var, 12.0f), j, 0L, false, x340Var18, plx.d | 48, 48);
                x340Var20.r(true);
                String str10 = rv21Var != null ? rv21Var.c : null;
                if (str10 == null) {
                    str10 = "";
                }
                s1p1.b(0, str10, x340Var18, (qim0) null, nhc1.Y(dc81Var.c, "spotify:artist:", false));
                s1p1.o(dc81Var.d, dc81Var.e, 0, x340Var18, (qim0) null);
                String str11 = rv21Var != null ? rv21Var.a : null;
                uwo1.e(str11 == null ? "" : str11, (qim0) null, cbx.d(x340Var18).d, cbx.a(x340Var18).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var18, 0, 0, 1714);
                x340Var20.r(true);
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                e0e0.c((List) obj5, (j2i) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 14:
                x340 x340Var21 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    eso1.h(oi7.a(Uri.parse(((zzz0) obj5).c), (gw70) null, (xb10) obj4, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var22, 0, 0, 131062), isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var22, 48, 508);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                return d(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return e(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return f(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return g(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                long j2 = ((hjl) obj3).a;
                float fFloatValue = ((Number) ((Function0) obj5).invoke()).floatValue();
                q5t0 q5t0VarH = ((afh0) obj2).H(j2);
                return ((ifh0) obj).S(q5t0VarH.a, jch0.U(q5t0VarH.b * fFloatValue), b7x.a, new ulf0(q5t0VarH, fFloatValue, (flb0) obj4, (byte) 1));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return h(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return k(obj, obj2, obj3);
            case 25:
                return m(obj, obj2, obj3);
            case 26:
                return n(obj, obj2, obj3);
            case 27:
                return o(obj, obj2, obj3);
            case 28:
                return p(obj, obj2, obj3);
            default:
                x340 x340Var23 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    otw.c((sij1) obj5, new rij1(((bx) obj4).d), (qim0) null, (ipb1) null, x340Var24, 6, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6a0(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
