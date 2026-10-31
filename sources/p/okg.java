package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.podcastinteractivity.commentssheetimpl.page.ContextMenuAuthor;
import com.spotify.searchview.proto.Entity;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class okg extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ okg(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarX = uyn1.x(u291.d(nim0Var, 1.0f), 8.0f);
        ws00 ws00Var = (ws00) this.b;
        List list = ws00Var.c;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
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
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        pbh pbhVar = pbh.a;
        if (list == null || list.size() != 2) {
            x340Var3.i0(-1224104775);
            op71.g(x340Var, pbhVar.a(1.0f, u291.f(nim0Var, 1.0f), true));
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1224267773);
            i3p1.i(mqo1.A(list), uyn1.z(0.0f, 4.0f, 1, pbhVar.a(1.0f, u291.f(nim0Var, 1.0f), true)), x340Var, 0);
            x340Var3.r(false);
        }
        String str = ws00Var.b;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        uwo1.e(str, qim0VarF, cbx.d(x340Var).k, 0L, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1704);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = ((xxe0) this.b).a;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).b.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(str, uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        era eraVar = een.Q0;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = dug.e(u291.f(nim0Var, 1.0f), (mic0) this.b, (hw61) null, 0.0f, 6);
        uwr uwrVar = cbx.a;
        float f = cbx.b(x340Var).b.b;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarY = uyn1.y(qim0VarE, 16.0f, f);
        mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
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
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE2, x340Var, y580.Y);
        cvx cvxVar2 = cbx.b(x340Var).b;
        qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
        cvx cvxVar3 = cbx.b(x340Var).b;
        rhx0.a(u291.r(qim0VarB, 16.0f), 0L, 0.0f, 0L, 0, 0.0f, x340Var, 0, 62);
        uwo1.e(cwl1.o0(x340Var, 2131963010), anm1.N("synchronizing_message", nim0Var), cbx.d(x340Var).g, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        String str = ((tfe1) this.b).a;
        cjc0 cjc0Var = new cjc0(1);
        uwr uwrVar = cbx.a;
        uwo1.e(str, (qim0) null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar, 0, 0, 1714);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        uwo1.e(((q2k1) this.b).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            z0o1.a((xim) this.b, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj3).intValue();
        ((wtw) this.b).c.c.invoke((yyq) obj, (b0k) obj2, Integer.valueOf(iIntValue & 14));
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            cir0 cir0Var = (cir0) x340Var2.k(k2r0.a);
            iac0 iac0Var = (iac0) x340Var2.k(jfe0.a);
            qe41 qe41Var = (qe41) x340Var2.k(lge0.a);
            i0k i0kVar = (i0k) this.b;
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                toj0 toj0Var = i0kVar.b;
                mr20 mr20VarI = cir0Var.i();
                jto jtoVarI = ((ham) toj0Var.e).i();
                x8c0 lifecycle = ((iac0) toj0Var.f).getLifecycle();
                lifecycle.a(new zh0(new l1k(0, jtoVarI, jto.class, "dispose", "dispose()V", 0, (byte) 0), lifecycle, (byte) 2));
                String str = ((l0k) toj0Var.b).a;
                h3h1 h3h1Var = new h3h1(new mwh(toj0Var, (byte) 10));
                z060 z060Var = (z060) toj0Var.d;
                m1k m1kVar = new m1k(jtoVarI);
                hoc hocVar = (hoc) toj0Var.g;
                FrameLayout frameLayout = new FrameLayout(context);
                x9p1.p(frameLayout, iac0Var);
                hm5.J(frameLayout, qe41Var);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                iac0 iac0VarH = x9p1.h(frameLayout);
                qe41 qe41VarW = hm5.w(frameLayout);
                if (iac0VarH == null) {
                    hhg1.n("Page should have lifecycleOwner");
                    return null;
                }
                if (qe41VarW == null) {
                    hhg1.n("Page should have SavedStateRegistry");
                    return null;
                }
                CoordinatorLayout coordinatorLayoutInflate = layoutInflaterFrom.inflate(2131626290, (ViewGroup) frameLayout, false);
                x9p1.p(coordinatorLayoutInflate, iac0VarH);
                hocVar.b(coordinatorLayoutInflate);
                kqw kqwVar = new kqw(str, coordinatorLayoutInflate, m1kVar, z060Var, h3h1Var, qe41VarW, mr20VarI, null);
                x340Var2.s0(kqwVar);
                objT = kqwVar;
            }
            f4h1 f4h1Var = (f4h1) objT;
            boolean zI = x340Var2.i(f4h1Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new h0k(f4h1Var, (byte) 0);
                x340Var2.s0(objT2);
            }
            qxd0.i(f4h1Var, (iu30) objT2, x340Var2);
            boolean zI2 = x340Var2.i(f4h1Var);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new h0k(f4h1Var, (byte) 1);
                x340Var2.s0(objT3);
            }
            dm5.a((iu30) objT3, (qim0) null, (iu30) null, x340Var2, 0, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        hqk hqkVar = (hqk) obj;
        tqw tqwVar = (tqw) obj3;
        if (tqwVar != null) {
            ((tgk) this.b).c.a(hqkVar.a, n3o1.y(tqwVar), (Bundle) null);
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        nli0 nli0Var = (nli0) obj2;
        if (nli0Var instanceof nli0) {
            ((yjf0) this.b).invoke(Boolean.valueOf(nli0Var.a));
            return rih1.a;
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        i8h1 i8h1Var;
        y7e1 y7e1Var;
        Function0 function0;
        tob1 tob1Var;
        boolean z;
        ContextMenuAuthor.User show;
        String str;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                nkg nkgVar = (nkg) obj;
                mkg mkgVar = (mkg) obj2;
                tqw tqwVar = (tqw) obj3;
                iu30 iu30Var = (iu30) ((qj0) obj4).e;
                String str2 = nkgVar.e;
                String str3 = nkgVar.a;
                if (mkgVar.equals(jkg.a)) {
                    iu30Var.invoke(new dz41(str3, str2, tqwVar != null ? n3o1.y(tqwVar) : null));
                } else if (mkgVar.equals(lkg.a)) {
                    iu30Var.invoke(new j151(str2.concat(" ")));
                } else {
                    if (!mkgVar.equals(kkg.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new fz41(str3));
                }
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                Object obj5 = fkj0.X;
                bng bngVar = (bng) obj4;
                jmg jmgVar = (jmg) rwq.h(((sng) obj).g, x340Var, 0).getValue();
                String str4 = jmgVar.a;
                String str5 = jmgVar.a;
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(str4);
                Object objT = x340Var2.T();
                if (zG || objT == obj5) {
                    objT = v8r.q(str5);
                    x340Var2.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                y7e1 y7e1VarD = c4p1.D(0, 2, str5, x340Var2);
                WeakHashMap weakHashMap = osl1.x;
                boolean zF = lhc.g(x340Var2).c.f();
                Object objT2 = x340Var2.T();
                if (objT2 == obj5) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT2);
                }
                ven0 ven0Var2 = (ven0) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == obj5) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT3);
                }
                ven0 ven0Var3 = (ven0) objT3;
                Object objT4 = x340Var2.T();
                if (objT4 == obj5) {
                    objT4 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT4);
                }
                ven0 ven0Var4 = (ven0) objT4;
                Object objT5 = x340Var2.T();
                if (objT5 == obj5) {
                    objT5 = yv91.a(new zmg(y7e1VarD, ven0Var, (byte) 0));
                    x340Var2.s0(objT5);
                }
                tob1 tob1Var2 = (tob1) objT5;
                Object objT6 = x340Var2.T();
                if (objT6 == obj5) {
                    objT6 = yv91.a(new zmg(y7e1VarD, ven0Var2, (byte) 1));
                    x340Var2.s0(objT6);
                }
                tob1 tob1Var3 = (tob1) objT6;
                kiv kivVar = k2r0.a;
                i8h1 i8h1VarH = cwl1.H(((cir0) x340Var2.k(kivVar)).g());
                dng dngVar = bngVar.c;
                String str6 = dngVar.a;
                boolean zG2 = x340Var2.g(dngVar.a);
                Object objT7 = x340Var2.T();
                if (zG2 || objT7 == obj5) {
                    objT7 = new vwk0(str6);
                    x340Var2.s0(objT7);
                }
                vwk0 vwk0Var = (vwk0) objT7;
                boolean zG3 = x340Var2.g(str6);
                Object objT8 = x340Var2.T();
                if (zG3 || objT8 == obj5) {
                    wwk0 wwk0Var = new wwk0(vwk0Var.b());
                    x340Var2.s0(wwk0Var);
                    objT8 = wwk0Var;
                }
                wwk0 wwk0Var2 = (wwk0) objT8;
                Object objT9 = x340Var2.T();
                if (objT9 == obj5) {
                    objT9 = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(objT9);
                }
                c9n c9nVar = (c9n) objT9;
                k6a1 k6a1Var = (k6a1) x340Var2.k(t4k.q);
                boolean zI = x340Var2.i(bngVar);
                Object objT10 = x340Var2.T();
                if (zI || objT10 == obj5) {
                    objT10 = new lwe(bngVar, (byte) 21);
                    x340Var2.s0(objT10);
                }
                Function0 function1 = (Function0) objT10;
                boolean zI2 = x340Var2.i(ven0Var2) | x340Var2.i(i8h1VarH) | x340Var2.i(vwk0Var) | x340Var2.i(y7e1VarD) | x340Var2.i(c9nVar) | x340Var2.i(k6a1Var) | x340Var2.i(bngVar) | x340Var2.i(ven0Var) | x340Var2.g(function1);
                Object objT11 = x340Var2.T();
                if (zI2 || objT11 == obj5) {
                    objT11 = new ang(i8h1VarH, vwk0Var, y7e1VarD, c9nVar, ven0Var2, k6a1Var, bngVar, function1, ven0Var);
                    i8h1Var = i8h1VarH;
                    y7e1Var = y7e1VarD;
                    function0 = function1;
                    x340Var2.s0(objT11);
                } else {
                    function0 = function1;
                    y7e1Var = y7e1VarD;
                    i8h1Var = i8h1VarH;
                }
                Function0 function2 = (Function0) objT11;
                boolean zI3 = x340Var2.i(tob1Var2) | x340Var2.i(ven0Var4) | x340Var2.i(ven0Var3) | x340Var2.g(function0);
                Object objT12 = x340Var2.T();
                if (zI3 || objT12 == obj5) {
                    tob1Var = tob1Var2;
                    objT12 = new f80((Object) function0, (Object) tob1Var, (Object) ven0Var4, (Object) ven0Var3, (byte) 20);
                    x340Var2.s0(objT12);
                } else {
                    tob1Var = tob1Var2;
                }
                Function0 function3 = (Function0) objT12;
                boolean zI4 = x340Var2.i(i8h1Var) | x340Var2.i(vwk0Var) | x340Var2.g(function3);
                Object objT13 = x340Var2.T();
                if (zI4 || objT13 == obj5) {
                    objT13 = new d1c(i8h1Var, vwk0Var, function3, (byte) 20);
                    x340Var2.s0(objT13);
                }
                Function0 function4 = (Function0) objT13;
                ven0 ven0VarS = v8r.s(function3, x340Var2);
                Boolean bool = (Boolean) tob1Var.getValue();
                bool.getClass();
                ven0 ven0VarS2 = v8r.s(bool, x340Var2);
                los losVar = bngVar.d;
                boolean zI5 = x340Var2.i(bngVar) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var4) | x340Var2.i(ven0VarS);
                Object objT14 = x340Var2.T();
                if (zI5 || objT14 == obj5) {
                    objT14 = new xmg(bngVar, ven0VarS2, ven0Var4, ven0VarS, (byte) 1);
                    x340Var2.s0(objT14);
                }
                qxd0.i(losVar, (iu30) objT14, x340Var2);
                cir0 cir0Var = (cir0) x340Var2.k(kivVar);
                boolean zI6 = x340Var2.i(ven0VarS) | x340Var2.i(cir0Var);
                Object objT15 = x340Var2.T();
                if (zI6 || objT15 == obj5) {
                    objT15 = new w9f(cir0Var, ven0VarS, (byte) 13);
                    x340Var2.s0(objT15);
                }
                qxd0.i(cir0Var, (iu30) objT15, x340Var2);
                qim0 qim0VarN = anm1.N("clip_title_editing_editor", voo1.y(u291.f(nim0Var, 1.0f), voo1.f));
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
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
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                m1p1.b(0, function4, function2, x340Var2, zF, ((Boolean) tob1Var3.getValue()).booleanValue());
                String str7 = jmgVar.c;
                boolean z2 = jmgVar.d;
                String str8 = jmgVar.b;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                y7e1 y7e1Var2 = y7e1Var;
                qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, nim0Var), 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13);
                boolean zI7 = x340Var2.i(bngVar);
                Object objT16 = x340Var2.T();
                if (zI7 || objT16 == obj5) {
                    objT16 = new syf(bngVar, (byte) 13);
                    x340Var2.s0(objT16);
                }
                n1p1.b(str7, z2, y7e1Var2, qim0VarB, str8, (y7e1) null, (iu30) null, (iu30) null, (iu30) objT16, x340Var2, 0, 224);
                if (zF) {
                    z = true;
                    x340Var2.i0(-1492952501);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1493251372);
                    z = true;
                    m1p1.p(0, function2, x340Var2, uyn1.z(0.0f, cbx.b(x340Var2).b.d, 1, new tq60(een.Q0)), ((Boolean) tob1Var3.getValue()).booleanValue());
                    x340Var2.r(false);
                }
                x340Var2.r(z);
                if (!((Boolean) ven0Var3.getValue()).booleanValue()) {
                    x340Var2.i0(2112921813);
                    x340Var2.r(false);
                    return rih1Var;
                }
                x340Var2.i0(2111516831);
                boolean zI8 = x340Var2.i(i8h1Var) | x340Var2.i(wwk0Var2);
                Object objT17 = x340Var2.T();
                if (zI8 || objT17 == obj5) {
                    objT17 = new pid(i8h1Var, wwk0Var2, (lnm) null, (byte) 17);
                    x340Var2.s0(objT17);
                }
                qxd0.t(rih1Var, x340Var2, (vu30) objT17);
                boolean zI9 = x340Var2.i(i8h1Var) | x340Var2.i(wwk0Var2) | x340Var2.i(ven0Var3);
                Object objT18 = x340Var2.T();
                if (zI9 || objT18 == obj5) {
                    objT18 = new d1c(i8h1Var, wwk0Var2, ven0Var3, (byte) 19);
                    x340Var2.s0(objT18);
                }
                Function0 function5 = (Function0) objT18;
                boolean zI10 = x340Var2.i(i8h1Var) | x340Var2.i(wwk0Var2) | x340Var2.i(ven0Var4) | x340Var2.i(ven0Var3) | x340Var2.i((Object) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0d52: ARITH (r8v27 'zI10' boolean) = (wrap boolean:0x0d4d: ARITH (wrap boolean:0x0d48: ARITH (wrap boolean:0x0d43: ARITH (wrap boolean:0x0d3e: ARITH (wrap boolean:0x0d36: INVOKE (r1v7 'x340Var2' p.x340), (r4v8 'i8h1Var' p.i8h1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:3383)) | (wrap boolean:0x0d3a: INVOKE (r1v7 'x340Var2' p.x340), (r0v14 'wwk0Var2' p.wwk0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:3387)) A[DONT_WRAP, WRAPPED] (LINE:3391)) | (wrap boolean:0x0d3f: INVOKE (r1v7 'x340Var2' p.x340), (r2v10 'ven0Var4' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:3392)) A[DONT_WRAP, WRAPPED] (LINE:3396)) | (wrap boolean:0x0d44: INVOKE (r1v7 'x340Var2' p.x340), (r10v3 'ven0Var3' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:3397)) A[DONT_WRAP, WRAPPED] (LINE:3401)) | (wrap boolean:0x0d49: INVOKE (r1v7 'x340Var2' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r22v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:3402)) A[DONT_WRAP, WRAPPED] (LINE:3406)) | (wrap boolean:0x0d4e: INVOKE (r1v7 'x340Var2' p.x340), (r7v6 'function0' kotlin.jvm.functions.Function0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:3407)) A[DECLARE_VAR] (LINE:3411) in method: p.okg.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes11.dex
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
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 3654
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.okg.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }
