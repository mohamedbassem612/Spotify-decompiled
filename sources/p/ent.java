package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ent extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ent(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        long j;
        tfv tfvVar = (tfv) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        vfv vfvVar = (vfv) this.b;
        int iC = l1d.C(vfvVar.a);
        if (iC == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1315358732);
            uwr uwrVar = cbx.a;
            j = cbx.a(x340Var2).b.a;
            x340Var2.r(false);
        } else {
            if (iC != 1) {
                throw p3d1.k(x340Var, 1315356752, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1315360495);
            uwr uwrVar2 = cbx.a;
            j = cbx.a(x340Var3).b.b;
            x340Var3.r(false);
        }
        mue1.c(tfvVar.b, vfvVar.b, j, (qim0) null, x340Var, 0);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        whv whvVar = (whv) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        if (whvVar.a.length() > 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1085938177);
            men1.d(whvVar.a, whvVar.b, ((yhv) this.b).b, whvVar.c, (qim0) null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1086124611);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = ((m980) ((cm0) this.b).e).b;
        qsx qsxVar = qsx.c;
        qim0 qim0VarN = anm1.N("EDIT_CURATION_ACTION_BUTTON", nim0.a);
        String strO0 = cwl1.o0(x340Var, z ? 2131954736 : 2131954729);
        String strO1 = cwl1.o0(x340Var, z ? 2131954735 : 2131954728);
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new q7u(iu30Var, (byte) 10);
            x340Var2.s0(objT);
        }
        kyo1.c(strO0, qsxVar, (Function0) objT, qim0VarN, false, strO1, (v2g) null, (vu30) null, x340Var2, qsx.d << 3, 208);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        otw.c((e2w) ((jd6) this.b).f, (c2w) obj2, (qim0) null, (ipb1) null, (b0k) obj4, iIntValue & 112, 12);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v4w v4wVar = (v4w) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        if (v4wVar instanceof t4w) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-913164143);
            ((nm1) this.b).g(((t4w) v4wVar).a, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1756729296);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        e5w e5wVar = (e5w) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        el9 el9Var = (el9) this.b;
        xgc xgcVar = (xgc) el9Var.i;
        w4w w4wVar = e5wVar.c;
        if (w4wVar != null) {
            if (w4wVar instanceof w4w) {
                x340 x340Var2 = x340Var;
                x340Var2.i0(1277595601);
                String str = e5wVar.a;
                List list = w4wVar.a;
                Integer num = e5wVar.d;
                int i = (iIntValue & 896) ^ 384;
                boolean zI = (((48 ^ (iIntValue & 112)) > 32 && x340Var2.i(e5wVar)) || (iIntValue & 48) == 32) | x340Var2.i(el9Var) | x340Var2.i(w4wVar) | ((i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    objT = new ssm(el9Var, (y4w) w4wVar, e5wVar, iu30Var);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean zI2 = ((i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.i(w4wVar);
                Object objT2 = x340Var2.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new f2t(iu30Var, w4wVar, (byte) 25);
                    x340Var2.s0(objT2);
                }
                xgcVar.f(str, list, num, function0, (Function0) objT2, apo.r(487855200, new g5w(el9Var, e5wVar, (byte) 0), x340Var2), x340Var2, 196608);
                x340Var2.r(false);
            } else {
                if (!w4wVar.equals(x4w.a)) {
                    throw p3d1.k(x340Var, -235883115, false);
                }
                x340 x340Var3 = x340Var;
                x340Var3.i0(1278224777);
                xgcVar.j(e5wVar.a, apo.r(1558698579, new g5w(el9Var, e5wVar, (byte) 1), x340Var3), x340Var3, 48);
                x340Var3.r(false);
            }
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        o5w o5wVar = (o5w) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        if (o5wVar instanceof m5w) {
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.i0(361600587);
            ((hw2) this.b).f(((m5w) o5wVar).a, b0kVar2, 0);
            b0kVar2.r(false);
        } else {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1675230307);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = oi7.a;
        h6w h6wVar = (h6w) this.b;
        mod.b(kivVar.a((gw70) h6wVar.i), apo.r(-471850041, new g6w((d6w) obj2, (iu30) obj3, h6wVar, (byte) 0), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a((gw70) ((hw2) this.b).g), apo.r(1914134179, new o1t((f7w) obj2, (iu30) obj3, (byte) 22), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b1x b1xVar;
        ad80 ad80Var = (g0x) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        pzw pzwVar = (pzw) this.b;
        if (ad80Var instanceof ad80) {
            ad80 ad80Var2 = ad80Var;
            boolean z = ad80Var2.g;
            x340 x340Var2 = x340Var;
            boolean zH = x340Var2.h(z);
            Object objT = x340Var2.T();
            if (zH || objT == fkj0.X) {
                xpw xpwVar = null;
                if (z) {
                    ji0 ji0Var = ad80Var2.a;
                    Object obj6 = ad80Var2.h;
                    q7u q7uVar = new q7u(iu30Var, (byte) 17);
                    Iterator it = ((List) pzwVar.i).iterator();
                    do {
                        if (!it.hasNext()) {
                            hhg1.o(ji0Var, "No matching element provider found for ");
                            return null;
                        }
                        b1xVar = (b1x) it.next();
                    } while (!b1xVar.b(ji0Var));
                    xpwVar = (xpw) b1xVar.c().invoke(((gzw) pzwVar.d).a, obj6, q7uVar);
                }
                objT = v8r.q(xpwVar);
                x340Var2.s0(objT);
            }
            mod.b(oi7.a.a((gw70) pzwVar.g), apo.r(46142915, new n7m((Object) ad80Var, iu30Var, (xpw) pzwVar, (ven0) objT, (byte) 27), x340Var2), x340Var2, 56);
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = ((k9x) obj2).a;
        nim0 nim0Var = nim0.a;
        if (z || !((o9x) this.b).c.a.a()) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-20812867);
            jap1.l(uyn1.y(u291.d(nim0Var, 1.0f), 16.0f, 16.0f), (qim0) null, cwl1.o0(x340Var2, z ? 2131963980 : 2131963978), (String) null, (String) null, (gbx) null, (yf) null, (vu30) null, x340Var2, 0, 506);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-20393654);
            String strO0 = cwl1.o0(x340Var3, 2131963973);
            String strO1 = cwl1.o0(x340Var3, 2131963972);
            String strO2 = cwl1.o0(x340Var3, 2131963971);
            String strO3 = cwl1.o0(x340Var3, 2131963970);
            boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var3.T();
            if (z2 || objT == fkj0.X) {
                objT = new q7u(iu30Var, (byte) 21);
                x340Var3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            jap1.l(u291.d(uyn1.y(anm1.N("cold_start_empty_view_element_test_tag", nim0Var), 32.0f, 16.0f), 1.0f), anm1.N("cold_start_add_button_element_test_tag", nim0Var), strO0, strO1, strO2, new gbx(new y50(strO3), function0), new idx(), (vu30) null, x340Var3, 0, 384);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        long jE;
        v9y v9yVar = (v9y) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        z9y z9yVar = (z9y) this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        byte b = 1;
        if (objT == m4cVar) {
            jdp jdpVar = z9yVar.b;
            q7u q7uVar = new q7u(iu30Var, (byte) 27);
            v2y v2yVar = new v2y(iu30Var, b);
            jdpVar.getClass();
            objT = new c8h(q7uVar, v2yVar);
            x340Var.s0(objT);
        }
        c8h c8hVar = (c8h) objT;
        Object objT2 = x340Var.T();
        byte b2 = 2;
        if (objT2 == m4cVar) {
            kdp kdpVar = z9yVar.c;
            q7u q7uVar2 = new q7u(iu30Var, (byte) 28);
            v2y v2yVar2 = new v2y(iu30Var, b2);
            kdpVar.getClass();
            objT2 = new q180(q7uVar2, v2yVar2);
            x340Var.s0(objT2);
        }
        q180 q180Var = (q180) objT2;
        Object objT3 = x340Var.T();
        byte b3 = 4;
        if (objT3 == m4cVar) {
            ldp ldpVar = z9yVar.d;
            y9y y9yVar = new y9y(iu30Var, (byte) 0);
            y9y y9yVar2 = new y9y(iu30Var, (byte) 1);
            y9y y9yVar3 = new y9y(iu30Var, (byte) 2);
            v2y v2yVar3 = new v2y(iu30Var, b3);
            ldpVar.getClass();
            objT3 = new v0e1(y9yVar, y9yVar2, y9yVar3, v2yVar3);
            x340Var.s0(objT3);
        }
        v0e1 v0e1Var = (v0e1) objT3;
        Object objT4 = x340Var.T();
        byte b4 = 3;
        if (objT4 == m4cVar) {
            mdp mdpVar = z9yVar.e;
            d0r d0rVar = z9yVar.a;
            v2y v2yVar4 = new v2y(iu30Var, b4);
            q7u q7uVar3 = new q7u(iu30Var, (byte) 29);
            mdpVar.getClass();
            objT4 = new pxb1(d0rVar, v2yVar4, q7uVar3);
            x340Var.s0(objT4);
        }
        pxb1 pxb1Var = (pxb1) objT4;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT5 = x340Var.T();
        if (z || objT5 == m4cVar) {
            objT5 = new q7u(iu30Var, (byte) 26);
            x340Var.s0(objT5);
        }
        w3p1.a((Function0) objT5, apo.r(-815193446, new ozw(v9yVar, iu30Var, (byte) 20), x340Var), x340Var, 48);
        l1f1 l1f1Var = v9yVar.h;
        int i = l1f1Var == null ? -1 : x9y.a[l1f1Var.ordinal()];
        rih1 rih1Var = rih1.a;
        if (i == -1) {
            x340Var.i0(1774799427);
            x340Var.r(false);
            return rih1Var;
        }
        if (i == 1) {
            x340Var.i0(1774758862);
            List list = v9yVar.f;
            lsd lsdVar = v9yVar.g;
            if (lsdVar instanceof lsd) {
                jE = lsdVar.a.a;
            } else if (lsdVar instanceof ksd) {
                jE = z4p1.e(((ksd) lsdVar).a.c);
            } else {
                if (lsdVar != null) {
                    eg.o();
                    return null;
                }
                d9h d9hVar = (d9h) o7h.s0(list);
                jE = d9hVar != null ? d9hVar.a : u7h.j;
            }
            otw.c(c8hVar, new z7h(jE, list), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
            return rih1Var;
        }
        if (i == 2) {
            x340Var.i0(1774779590);
            otw.c(q180Var, new o180(v9yVar.X, v9yVar.b()), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
            return rih1Var;
        }
        if (i == 3) {
            x340Var.i0(1774788134);
            otw.c(v0e1Var, new u0e1(v9yVar.Y, v9yVar.Z, v9yVar.N0), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
            return rih1Var;
        }
        if (i != 4) {
            throw p3d1.k(x340Var, 1774757366, false);
        }
        x340Var.i0(1774797331);
        otw.c(pxb1Var, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
        x340Var.r(false);
        return rih1Var;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((iu30) this.b).invoke(new o9y(((Number) obj).intValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue(), ((Number) obj4).floatValue(), ((Number) obj5).floatValue()));
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jey jeyVar = (jey) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        rj01 rj01Var = jeyVar.a;
        boolean z = jeyVar.c;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new y9y(iu30Var, (byte) 10);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        br0 br0Var = ((key) this.b).c;
        ArrayList arrayList = rj01Var.i;
        fuo1.f(rj01Var, z, function0, br0Var, new dey(arrayList, rj01Var.X, jeyVar.d, arrayList.isEmpty() ? 2 : 1, rj01Var.Y), x340Var2, 0, 0);
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(0, (wux) null, apo.r(1613791913, new egy((fgy) this.b, (ksw) obj, (cgy) obj2, (iu30) obj3, (byte) 1), b0kVar), b0kVar, 3072, 7);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:373:0x0c2c A[PHI: r1
      0x0c2c: PHI (r1v22 p.iu30) = (r1v14 p.iu30), (r1v23 p.iu30) binds: [B:372:0x0c2a, B:368:0x0c23] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:379:0x0c39  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        iu30 iu30Var;
        boolean z;
        Object objT;
        int i2;
        kuw0 kuw0Var;
        x340 x340Var;
        p1v k1vVar;
        g451 g451Var;
        tao0 tao0Var;
        long j;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                dnt dntVar = (dnt) obj2;
                x340 x340Var2 = (b0k) obj4;
                ((Number) obj5).intValue();
                qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                z70 z70Var = (z70) obj6;
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                x340Var4.i0(-1487914721);
                for (ql71 ql71Var : z70Var.b) {
                    if (ql71Var.a()) {
                        x340Var4.i0(-1706153100);
                        i = 0;
                        eso1.i(u291.f(nim0Var, 1.0f), x340Var2, 0);
                        x340Var4.r(false);
                    } else {
                        i = 0;
                        x340Var4.i0(-1706079103);
                        x340Var4.r(false);
                    }
                    ggo1.p(ql71Var, dntVar.a, (qim0) null, x340Var2, i);
                }
                x340Var4.r(false);
                x340Var4.r(true);
                return rih1Var;
            case 1:
                bqt bqtVar = (bqt) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(x340Var5).g, 32, qim0VarF);
                ldo ldoVar = (ldo) obj6;
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var5, qim0VarP);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA2, x340Var5, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var5, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var5, lljVar3);
                nko1.F(x340Var5);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var5, lljVar4);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                gra graVar = een.h;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM3 = x340Var7.m();
                qim0 qim0VarE3 = zr7.E(x340Var5, qim0VarF2);
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(gfh0VarC, x340Var5, lljVar);
                nko1.H(xos0VarM3, x340Var5, lljVar2);
                i3a.l(iHashCode3, x340Var5, lljVar3, x340Var5);
                nko1.H(qim0VarE3, x340Var5, lljVar4);
                olx olxVar = olx.c;
                jsl jslVar = new jsl(cwl1.o0(x340Var5, 2131951704));
                gra graVar2 = een.g;
                h2c h2cVar = h2c.a;
                qim0 qim0VarA = h2cVar.a(nim0Var, graVar2);
                if (((iIntValue & 896) ^ 384) > 256) {
                    if (x340Var7.g(iu30Var)) {
                        iu30Var = iu30Var2;
                        z = true;
                    }
                    objT = x340Var7.T();
                    if (z || objT == fkj0.X) {
                        objT = new hbs(iu30Var, (byte) 22);
                        x340Var7.s0(objT);
                    }
                    qim0 qim0VarX = bin.x(qim0VarA, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var5).b;
                    cvx cvxVar2 = cbx.b(x340Var5).b;
                    w0h1.a(olxVar, jslVar, anm1.N("context-menu-back-button", uyn1.y(qim0VarX, 12.0f, 8.0f)), 0L, 0L, true, x340Var5, olx.d | 196608, 24);
                    uwo1.e(bqtVar.a.b, anm1.N("context-menu-selected-device-name", h2cVar.a(nim0Var, graVar)), cbx.d(x340Var5).e, cbx.a(x340Var5).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2032);
                    x340Var7.r(true);
                    ldoVar.g(bqtVar, x340Var5, (iIntValue >> 3) & 14);
                    x340Var7.r(true);
                    return rih1Var;
                }
                iu30Var = iu30Var2;
                iu30Var = iu30Var2;
                if ((iIntValue & 384) == 256) {
                    iu30Var = iu30Var2;
                    z = true;
                } else {
                    z = false;
                }
                objT = x340Var7.T();
                if (z) {
                    objT = new hbs(iu30Var, (byte) 22);
                    x340Var7.s0(objT);
                } else {
                    objT = new hbs(iu30Var, (byte) 22);
                    x340Var7.s0(objT);
                }
                qim0 qim0VarX2 = bin.x(qim0VarA, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var5).b;
                cvx cvxVar4 = cbx.b(x340Var5).b;
                w0h1.a(olxVar, jslVar, anm1.N("context-menu-back-button", uyn1.y(qim0VarX2, 12.0f, 8.0f)), 0L, 0L, true, x340Var5, olx.d | 196608, 24);
                uwo1.e(bqtVar.a.b, anm1.N("context-menu-selected-device-name", h2cVar.a(nim0Var, graVar)), cbx.d(x340Var5).e, cbx.a(x340Var5).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2032);
                x340Var7.r(true);
                ldoVar.g(bqtVar, x340Var5, (iIntValue >> 3) & 14);
                x340Var7.r(true);
                return rih1Var;
            case 2:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                xfx xfxVar = ((d7u) obj6).a;
                l7u l7uVar = new l7u(((k8t0) obj2).b.a);
                qim0 qim0VarA2 = uyn1.A(anm1.N("disclaimer", nim0Var), 16.0f, 8.0f, 16.0f, 8.0f);
                boolean z2 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var8.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT2 = x340Var9.T();
                if (z2 || objT2 == fkj0.X) {
                    objT2 = new hws(iu30Var3, (byte) 8);
                    x340Var9.s0(objT2);
                }
                d4o1.d(xfxVar, l7uVar, qim0VarA2, (iu30) objT2, x340Var9, 0);
                return rih1Var;
            case 3:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                int i3 = ((p7u) obj2).a;
                n7u n7uVar = (n7u) ((tm) obj6).d;
                x340 x340Var11 = x340Var10;
                x340Var11.i0(1121458552);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var11).b;
                x340Var11.r(false);
                x340 x340Var12 = x340Var10;
                x340Var12.i0(1121461464);
                cvx cvxVar6 = cbx.b(x340Var12).b;
                x340Var12.r(false);
                fra fraVar = een.Z;
                qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 8.0f, 8.0f, 0.0f, 9);
                int iC = l1d.C(n7uVar.b);
                if (iC == 0) {
                    x340 x340Var13 = x340Var10;
                    x340Var13.i0(1121473100);
                    cvx cvxVar7 = cbx.b(x340Var13).b;
                    kuw0 d36Var = new d36(8.0f, true, new g21(een.R0, (byte) 29));
                    i2 = 0;
                    x340Var13.r(false);
                    kuw0Var = d36Var;
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var10, 1121469853, false);
                    }
                    x340 x340Var14 = x340Var10;
                    x340Var14.i0(1121476787);
                    i2 = 0;
                    x340Var14.r(false);
                    kuw0Var = h36.b;
                }
                jw31 jw31VarA = ew31.a(kuw0Var, fraVar, x340Var10, i2);
                x340 x340Var15 = x340Var10;
                int iHashCode4 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM4 = x340Var15.m();
                qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarB);
                hzj.A.getClass();
                x340 x340Var16 = x340Var10;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(jw31VarA, x340Var10, y580.O0);
                nko1.H(xos0VarM4, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE4, x340Var10, y580.Y);
                if (i3 != 2) {
                    x340Var16.i0(541532492);
                    b7u b7uVar = new b7u((Context) x340Var16.k(AndroidCompositionLocals_androidKt.b), (byte) 0);
                    a7u a7uVar = new a7u(n7uVar.a);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    otw.c(b7uVar, a7uVar, new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), (ipb1) null, x340Var10, 0, 8);
                    x340Var = x340Var10;
                    x340Var16.r(false);
                } else {
                    x340Var = x340Var10;
                    x340Var16.i0(542057198);
                    x340Var16.r(false);
                }
                long jK = f5p1.k(x340Var, 2131102468);
                int i4 = n7uVar.b;
                String strO0 = cwl1.o0(x340Var, 2131954987);
                boolean z3 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var16.g(iu30Var4)) || (iIntValue3 & 384) == 256;
                Object objT3 = x340Var16.T();
                if (z3 || objT3 == fkj0.X) {
                    objT3 = new q7u(iu30Var4, (byte) 0);
                    x340Var16.s0(objT3);
                }
                h7w.h(i4, strO0, (Function0) objT3, apo.r(1519328941, new sre((byte) 14, jK), x340Var), x340Var, 24576);
                x340Var16.r(true);
                return rih1Var;
            case 4:
                ksw kswVar = (ksw) obj;
                ziu ziuVar = (ziu) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                fiu fiuVar = (fiu) obj6;
                x340 x340Var17 = (b0k) obj4;
                Object objT4 = x340Var17.T();
                m4c m4cVar = fkj0.X;
                if (objT4 == m4cVar) {
                    objT4 = v8r.q(Boolean.FALSE);
                    x340Var17.s0(objT4);
                }
                ven0 ven0Var = (ven0) objT4;
                boolean zI = x340Var17.i(ven0Var) | x340Var17.i(fiuVar) | ((((iIntValue4 & 896) ^ 384) > 256 && x340Var17.g(iu30Var5)) || (iIntValue4 & 384) == 256);
                Object objT5 = x340Var17.T();
                if (zI || objT5 == m4cVar) {
                    objT5 = new m3n((Object) fiuVar, (Object) iu30Var5, (Object) ven0Var, (byte) 18);
                    x340Var17.s0(objT5);
                }
                n9p1.e(kswVar, (iu30) objT5, x340Var17, iIntValue4 & 14);
                mod.c(new ely0[]{oi7.a.a(fiuVar.c), qp0.a.a(fiuVar.a)}, apo.r(-905538461, new n7m((Object) ziuVar, iu30Var5, (xpw) fiuVar, ven0Var, (byte) 20), x340Var17), x340Var17, 56);
                return rih1Var;
            case 5:
                ksw kswVar2 = (ksw) obj;
                aju ajuVar = (aju) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                int iIntValue5 = ((Number) obj5).intValue();
                tm tmVar = (tm) obj6;
                i01 i01Var = (i01) tmVar.d;
                x340 x340Var18 = (b0k) obj4;
                boolean zI2 = x340Var18.i(i01Var);
                Object objT6 = x340Var18.T();
                if (zI2 || objT6 == fkj0.X) {
                    objT6 = new r1t(1, i01Var, i01.class, "onVisibilityChanged", "onVisibilityChanged(I)V", 0, (byte) 6);
                    x340Var18.s0(objT6);
                }
                n9p1.e(kswVar2, (iu30) objT6, x340Var18, iIntValue5 & 14);
                mod.b(oi7.a.a((gw70) tmVar.e), apo.r(164920307, new kiu(ajuVar, iu30Var6, tmVar), x340Var18), x340Var18, 56);
                return rih1Var;
            case 6:
                xru xruVar = (xru) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                int iIntValue6 = ((Number) obj5).intValue();
                x340 x340Var19 = (b0k) obj4;
                Object objT7 = x340Var19.T();
                m4c m4cVar2 = fkj0.X;
                if (objT7 == m4cVar2) {
                    objT7 = v8r.q(Boolean.FALSE);
                    x340Var19.s0(objT7);
                }
                ven0 ven0Var2 = (ven0) objT7;
                int i5 = (iIntValue6 & 896) ^ 384;
                boolean zI3 = x340Var19.i(xruVar) | x340Var19.i(ven0Var2) | ((i5 > 256 && x340Var19.g(iu30Var7)) || (iIntValue6 & 384) == 256);
                Object objT8 = x340Var19.T();
                if (zI3 || objT8 == m4cVar2) {
                    objT8 = new ssm((Object) xruVar, (Object) iu30Var7, (Object) ven0Var2, (byte) 18);
                    x340Var19.s0(objT8);
                }
                wro1.h(new gbx(z50.c, (Function0) objT8), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, zji.a, x340Var19, 0, 6, 1020);
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    x340Var19.i0(821529025);
                    nu nuVar = ((zru) obj6).c;
                    int size = xruVar.a.size();
                    int size2 = xruVar.b.size();
                    boolean zI4 = x340Var19.i(ven0Var2);
                    Object objT9 = x340Var19.T();
                    if (zI4 || objT9 == m4cVar2) {
                        objT9 = new iwr(ven0Var2, (byte) 5);
                        x340Var19.s0(objT9);
                    }
                    Function0 function0 = (Function0) objT9;
                    boolean zI5 = x340Var19.i(ven0Var2) | ((i5 > 256 && x340Var19.g(iu30Var7)) || (iIntValue6 & 384) == 256);
                    Object objT10 = x340Var19.T();
                    if (zI5 || objT10 == m4cVar2) {
                        objT10 = new wq9(iu30Var7, ven0Var2, (byte) 14);
                        x340Var19.s0(objT10);
                    }
                    Function0 function1 = (Function0) objT10;
                    boolean zI6 = x340Var19.i(ven0Var2);
                    Object objT11 = x340Var19.T();
                    if (zI6 || objT11 == m4cVar2) {
                        objT11 = new iwr(ven0Var2, (byte) 6);
                        x340Var19.s0(objT11);
                    }
                    otw.c(nuVar, new hyu(size, size2, function0, function1, (Function0) objT11), (qim0) null, (ipb1) null, x340Var19, 0, 12);
                    x340Var19.r(false);
                } else {
                    x340Var19.i0(822036433);
                    x340Var19.r(false);
                }
                return rih1Var;
            case 7:
                euu euuVar = (euu) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                u601 u601VarC = gfe0.c(x340Var20);
                luu luuVar = (luu) obj6;
                fuu fuuVar = euuVar.f;
                fuu fuuVar2 = fuu.c;
                if (fuuVar.equals(fuuVar2) || euuVar.g.equals(fuuVar2)) {
                    k1vVar = f1v.a;
                } else {
                    e2v e2vVar = euuVar.a;
                    if (e2vVar.equals(c2v.a)) {
                        k1vVar = i1v.a;
                    } else if (e2vVar.equals(d2v.a)) {
                        k1vVar = l1v.a;
                    } else if (e2vVar instanceof e2v) {
                        k1vVar = new k1v(Float.valueOf(e2vVar.a));
                    } else if (e2vVar.equals(f2v.a)) {
                        k1vVar = h1v.a;
                    } else {
                        if (!e2vVar.equals(g2v.a)) {
                            eg.o();
                            return null;
                        }
                        k1vVar = n1v.a;
                    }
                }
                sru sruVar = new sru(k1vVar, euuVar.b, (String) null, euuVar.c, 4);
                x340 x340Var21 = x340Var20;
                boolean zI7 = x340Var21.i(luuVar) | x340Var21.i(euuVar) | ((((iIntValue7 & 896) ^ 384) > 256 && x340Var21.g(iu30Var8)) || (iIntValue7 & 384) == 256) | x340Var21.i(u601VarC);
                Object objT12 = x340Var21.T();
                if (zI7 || objT12 == fkj0.X) {
                    objT12 = new jlm(luuVar, euuVar, iu30Var8, u601VarC);
                    x340Var21.s0(objT12);
                }
                hqq0.f(sruVar, new gbx(z50.c, (Function0) objT12), null, x340Var21, 0, 4);
                return rih1Var;
            case 8:
                ((xvu) obj6).f(((hvu) obj2).a, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 112);
                return rih1Var;
            case 9:
                ((br0) obj6).e((evu) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 10:
                rdv rdvVar = (rdv) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                int iIntValue8 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                hdv hdvVar = (hdv) obj6;
                x340 x340Var22 = (b0k) obj4;
                boolean zI8 = x340Var22.i(hdvVar) | ((((iIntValue8 & 896) ^ 384) > 256 && x340Var22.g(iu30Var9)) || (iIntValue8 & 384) == 256);
                Object objT13 = x340Var22.T();
                byte b2 = 20;
                if (zI8 || objT13 == m4cVar3) {
                    objT13 = new wrs(hdvVar, iu30Var9, b2);
                    x340Var22.s0(objT13);
                }
                iu30 iu30Var10 = (iu30) objT13;
                ven0 ven0VarS = v8r.s(iu30Var10, x340Var22);
                int i6 = (iIntValue8 & 112) ^ 48;
                boolean zI9 = x340Var22.i(hdvVar) | ((i6 > 32 && x340Var22.i(rdvVar)) || (iIntValue8 & 48) == 32) | x340Var22.i(ven0VarS);
                Object objT14 = x340Var22.T();
                if (zI9 || objT14 == m4cVar3) {
                    objT14 = new ssm(hdvVar, rdvVar, ven0VarS, b2);
                    x340Var22.s0(objT14);
                }
                Function0 function2 = (Function0) objT14;
                qdv qdvVarD = rdvVar.d();
                boolean zI10 = x340Var22.i(hdvVar) | ((i6 > 32 && x340Var22.i(rdvVar)) || (iIntValue8 & 48) == 32);
                Object objT15 = x340Var22.T();
                if (zI10 || objT15 == m4cVar3) {
                    objT15 = new nnu(hdvVar, rdvVar, lnmVar, (byte) 10);
                    x340Var22.s0(objT15);
                }
                qxd0.t(qdvVarD, x340Var22, (vu30) objT15);
                xtb0 xtb0VarA = aub0.a(0, x340Var22, 3);
                boolean z4 = (rdvVar.d() == null && rdvVar.j >= 6) || rdvVar.a.length() > 0;
                Object objT16 = x340Var22.T();
                if (objT16 == m4cVar3) {
                    objT16 = hdvVar.d.a(iu30Var10);
                    x340Var22.s0(objT16);
                }
                mv51 mv51Var = (mv51) objT16;
                Object objT17 = x340Var22.T();
                if (objT17 == m4cVar3) {
                    ecp ecpVar = hdvVar.e;
                    v0j v0jVar = new v0j(iu30Var10, (byte) 24);
                    switch (ecpVar.a) {
                        case 0:
                            tao0Var = new tao0(v0jVar);
                            break;
                        case 1:
                            tao0Var = new tao0(v0jVar);
                            break;
                        case 2:
                            tao0Var = new tao0(v0jVar);
                            break;
                        default:
                            tao0Var = new tao0(v0jVar);
                            break;
                    }
                    objT17 = tao0Var;
                    x340Var22.s0(objT17);
                }
                tao0 tao0Var2 = (tao0) objT17;
                Object objT18 = x340Var22.T();
                if (objT18 == m4cVar3) {
                    fcp fcpVar = hdvVar.g;
                    switch (fcpVar.a) {
                        case 0:
                            g451Var = new g451(iu30Var10, (bha1) ((jly0) ((e93) ((lbp) fcpVar.b).c).Z).get());
                            break;
                        case 1:
                            g451Var = new g451(iu30Var10, (bha1) fcpVar.b.c.v1.get());
                            break;
                        case 2:
                            g451Var = new g451(iu30Var10, (bha1) fcpVar.b.d.z9.get());
                            break;
                        default:
                            g451Var = new g451(iu30Var10, (bha1) fcpVar.b.c.a.h4.get());
                            break;
                    }
                    objT18 = g451Var;
                    x340Var22.s0(objT18);
                }
                g451 g451Var2 = (g451) objT18;
                hdvVar.e(iu30Var10, x340Var22, 0);
                mr20 mr20Var = hdvVar.c;
                boolean zI11 = x340Var22.i(hdvVar) | x340Var22.i(ven0VarS);
                Object objT19 = x340Var22.T();
                if (zI11 || objT19 == m4cVar3) {
                    objT19 = new ymu(hdvVar, ven0VarS, null, (byte) 10);
                    x340Var22.s0(objT19);
                }
                qxd0.t(mr20Var, x340Var22, (vu30) objT19);
                boolean z5 = hdvVar.X || !rdvVar.b.isEmpty();
                boolean zG = x340Var22.g(function2);
                Object objT20 = x340Var22.T();
                if (zG || objT20 == m4cVar3) {
                    objT20 = new z9t(function2, (byte) 14);
                    x340Var22.s0(objT20);
                }
                q3p1.b(0, 0, (Function0) objT20, x340Var22, z5);
                if (rdvVar.c() instanceof kdv) {
                    x340Var22.i0(-478597416);
                    w6d1.c(x340Var22, 0);
                    x340Var22.r(false);
                } else {
                    x340Var22.i0(-478495333);
                    qim0 qim0VarN = anm1.N("dsl_lazy_column", u291.d(nim0Var, 1.0f));
                    boolean zH = x340Var22.h(z4) | x340Var22.i(g451Var2) | ((i6 > 32 && x340Var22.i(rdvVar)) || (iIntValue8 & 48) == 32) | x340Var22.i(hdvVar) | x340Var22.i(mv51Var) | x340Var22.i(tao0Var2);
                    Object objT21 = x340Var22.T();
                    if (zH || objT21 == m4cVar3) {
                        objT21 = new gdv((byte) 0, rdvVar, mv51Var, g451Var2, hdvVar, tao0Var2, z4);
                        x340Var22.s0(objT21);
                    }
                    ujo1.d(qim0VarN, xtb0VarA, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT21, x340Var22, 0, 508);
                    x340Var22.r(false);
                }
                return rih1Var;
            case 11:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                xdv xdvVar = (xdv) obj6;
                irn1.u(voo1.y(u291.d(nim0Var, 1.0f), voo1.f), apo.r(-1539636765, new o1t(xdvVar, (wdv) obj2, (byte) 14), b0kVar), (vu30) null, (erl1) null, apo.r(169793577, new oat(xdvVar, (byte) 12), b0kVar), b0kVar, 24624, 12);
                return rih1Var;
            case 12:
                aev aevVar = (aev) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                int iIntValue9 = ((Number) obj5).intValue();
                umf0 umf0Var = (umf0) obj6;
                x340 x340Var23 = (b0k) obj4;
                Object objT22 = x340Var23.T();
                j06 j06Var = x340Var23.a;
                m4c m4cVar4 = fkj0.X;
                if (objT22 == m4cVar4) {
                    objT22 = ((ybp) umf0Var.e).a(new v0j(iu30Var11, (byte) 25));
                    x340Var23.s0(objT22);
                }
                qao0 qao0Var = (qao0) objT22;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var23, 0);
                int iHashCode5 = Long.hashCode(x340Var23.T);
                xos0 xos0VarM5 = x340Var23.m();
                qim0 qim0VarE5 = zr7.E(x340Var23, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var23.m0();
                if (x340Var23.S) {
                    x340Var23.l(n4kVar);
                } else {
                    x340Var23.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA3, x340Var23, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM5, x340Var23, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var23, lljVar7);
                nko1.F(x340Var23);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE5, x340Var23, lljVar8);
                j2i j2iVarR = apo.r(655200616, new utt(aevVar, (byte) 12), x340Var23);
                boolean z6 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var23.g(iu30Var11)) || (iIntValue9 & 384) == 256;
                Object objT23 = x340Var23.T();
                if (z6 || objT23 == m4cVar4) {
                    objT23 = new q7u(iu30Var11, (byte) 9);
                    x340Var23.s0(objT23);
                }
                bzn1.e((qim0) null, j2iVarR, false, (vu30) null, (sgr0) null, (ngr0) null, (ygr0) null, (Function0) objT23, x340Var23, 48, 125);
                fra fraVar2 = een.N0;
                uwr uwrVar4 = cbx.a;
                cvx cvxVar8 = cbx.b(x340Var23).b;
                d36 d36Var2 = new d36(12.0f, true, new um5(false));
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                cvx cvxVar9 = cbx.b(x340Var23).b;
                cvx cvxVar10 = cbx.b(x340Var23).b;
                cvx cvxVar11 = cbx.b(x340Var23).b;
                cvx cvxVar12 = cbx.b(x340Var23).b;
                qim0 qim0VarA3 = uyn1.A(qim0VarF3, 16.0f, 4.0f, 16.0f, 8.0f);
                jw31 jw31VarA2 = ew31.a(d36Var2, fraVar2, x340Var23, 0);
                int iHashCode6 = Long.hashCode(x340Var23.T);
                xos0 xos0VarM6 = x340Var23.m();
                qim0 qim0VarE6 = zr7.E(x340Var23, qim0VarA3);
                x340Var23.m0();
                if (x340Var23.S) {
                    x340Var23.l(n4kVar);
                } else {
                    x340Var23.v0();
                }
                nko1.H(jw31VarA2, x340Var23, lljVar5);
                nko1.H(xos0VarM6, x340Var23, lljVar6);
                x0d.q(iHashCode6, x340Var23, lljVar7, x340Var23);
                nko1.H(qim0VarE6, x340Var23, lljVar8);
                uwo1.e(cwl1.o0(x340Var23, 2131955153), new wnb0(1.0f, true), cbx.d(x340Var23).f, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(2), 0, (qx8) null, x340Var23, 0, 0, 1720);
                otw.c(qao0Var, new pao0(aevVar.b), (qim0) null, (ipb1) null, x340Var23, 0, 12);
                x340Var23.r(true);
                x340Var23.r(true);
                return rih1Var;
            case 13:
                mfv mfvVar = (mfv) obj2;
                x340 x340Var24 = (b0k) obj4;
                ((Number) obj5).intValue();
                pfv pfvVar = (pfv) obj6;
                int iC2 = l1d.C(pfvVar.b);
                if (iC2 == 0) {
                    x340 x340Var25 = x340Var24;
                    x340Var25.i0(-2083339488);
                    uwr uwrVar5 = cbx.a;
                    j = cbx.a(x340Var25).b.a;
                    x340Var25.r(false);
                } else {
                    if (iC2 != 1) {
                        throw p3d1.k(x340Var24, -2083341468, false);
                    }
                    x340 x340Var26 = x340Var24;
                    x340Var26.i0(-2083337725);
                    uwr uwrVar6 = cbx.a;
                    j = cbx.a(x340Var26).b.b;
                    x340Var26.r(false);
                }
                mue1.c(mfvVar.b, pfvVar.c, j, (qim0) null, x340Var24, 0);
                return rih1Var;
            case 14:
                return a(obj, obj2, obj3, obj4, obj5);
            case 15:
                return d(obj, obj2, obj3, obj4, obj5);
            case 16:
                return e(obj, obj2, obj3, obj4, obj5);
            case 17:
                return f(obj, obj2, obj3, obj4, obj5);
            case 18:
                return g(obj, obj2, obj3, obj4, obj5);
            case 19:
                return h(obj, obj2, obj3, obj4, obj5);
            case 20:
                return i(obj, obj2, obj3, obj4, obj5);
            case 21:
                return j(obj, obj2, obj3, obj4, obj5);
            case 22:
                return k(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return m(obj, obj2, obj3, obj4, obj5);
            case 24:
                return n(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return o(obj, obj2, obj3, obj4, obj5);
            case 26:
                return p(obj, obj2, obj3, obj4, obj5);
            case 27:
                return q(obj, obj2, obj3, obj4, obj5);
            case 28:
                return r(obj, obj2, obj3, obj4, obj5);
            default:
                pgy pgyVar = (pgy) obj2;
                x340 x340Var27 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (pgyVar instanceof ngy) {
                    x340 x340Var28 = x340Var27;
                    x340Var28.i0(61287985);
                    x340Var28.r(false);
                } else {
                    if (!(pgyVar instanceof ogy)) {
                        throw p3d1.k(x340Var27, 1387449869, false);
                    }
                    x340 x340Var29 = x340Var27;
                    x340Var29.i0(61337182);
                    ldo ldoVar2 = (ldo) obj6;
                    Object objT24 = x340Var29.T();
                    if (objT24 == fkj0.X) {
                        objT24 = ((bzo) ((mjv) ldoVar2.d).b).a(new dgy(3, (Integer) null, (Integer) null));
                        x340Var29.s0(objT24);
                    }
                    ogy ogyVar = (ogy) pgyVar;
                    otw.c((xpw) objT24, new cgy(nhc1.Y(ogyVar.a, "spotify:artist:", false) ? "artist_page:entity_explorer" : "author_page:entity_explorer", ogyVar.b), (qim0) null, (ipb1) null, x340Var29, 64, 12);
                    x340Var29.r(false);
                }
                return rih1Var;
        }
    }
}
