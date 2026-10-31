package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnectionFactory;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wzn implements HttpConnectionFactory {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public wzn(Map map, yf4 yf4Var, d0r d0rVar) {
        this.a = map;
        this.b = yf4Var;
        this.c = d0rVar;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.l(new l4r(new wlu(jd11Var.b(hzy.class)), 1, rwn.Z, new j4r(rwn.i), rwn.N0), new l4r(new wlu(jd11Var.b(jo70.class)), 1, rwn.O0, new j4r(rwn.t), rwn.P0), new l4r(hvm.d, 3, rwn.Q0, new j4r(rwn.X), rwn.R0), new l4r(hvm.b, 3, rwn.S0, new j4r(rwn.Y), rwn.T0), cnn.g);
    }

    public static final void b(wzn wznVar, cir0 cir0Var) {
        es20 es20Var = (es20) wznVar.a;
        es20Var.b();
        es20Var.i.l((Object) null);
        bpb1 bpb1Var = es20Var.e;
        gw20 gw20Var = (gw20) bpb1Var.getValue();
        if (gw20Var.b.size() <= 1) {
            cir0Var.g().c("");
        } else {
            bpb1Var.m((Object) null, gw20.a(gw20Var, null, o7h.l0(1, gw20Var.b), false, 5));
        }
    }

    public static wzn d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new wzn((Integer) bundle.get("android.support.customtabs.extra.TOOLBAR_COLOR"), (Integer) bundle.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"));
    }

    public static wzn e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131624492, viewGroup, false);
        int i = 2131427920;
        RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131427920);
        if (recyclerViewT != null) {
            i = 2131428438;
            TextView textView = (TextView) m5n1.t(viewInflate, 2131428438);
            if (textView != null) {
                i = 2131431356;
                TextView textView2 = (TextView) m5n1.t(viewInflate, 2131431356);
                if (textView2 != null) {
                    return new wzn((LinearLayout) viewInflate, recyclerViewT, textView, textView2);
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0300  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [int] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public void a(fso fsoVar, fw20 fw20Var, qim0 qim0Var, b0k b0kVar, int i) {
        wzn wznVar;
        qim0 qim0Var2;
        cir0 cir0Var;
        boolean z;
        int i2;
        boolean z2;
        qfq0 qfq0Var;
        lvb1 lvb1Var;
        String str;
        ?? r10;
        mso lsoVar;
        int i3;
        Object obj = this.a;
        es20 es20Var = (es20) obj;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1605116795);
        int i4 = i | (b0kVar2.i(fsoVar) ? 4 : 2) | (b0kVar2.i(fw20Var) ? 32 : 16) | 384 | (b0kVar2.i(this) ? 2048 : 1024);
        if (b0kVar2.Y(i4 & 1, (i4 & 1171) != 1170)) {
            ven0 ven0VarH = rwq.h(es20Var.f, b0kVar2, 0);
            ven0 ven0VarH2 = rwq.h(es20Var.h, b0kVar2, 0);
            ven0 ven0VarH3 = rwq.h(es20Var.j, b0kVar2, 0);
            Object obj2 = this.b;
            ven0 ven0VarH4 = rwq.h(((s0s) obj2).b, b0kVar2, 0);
            cir0 cir0Var2 = (cir0) b0kVar2.k(k2r0.a);
            boolean zI = b0kVar2.i(this) | b0kVar2.i(fsoVar) | b0kVar2.i(fw20Var);
            Object objT = b0kVar2.T();
            lnm lnmVar = null;
            if (zI || objT == m4cVar) {
                cir0Var = cir0Var2;
                gke gkeVar = new gke(this, fsoVar, fw20Var, lnmVar, (byte) 19);
                b0kVar2.s0(gkeVar);
                objT = gkeVar;
            } else {
                cir0Var = cir0Var2;
            }
            qxd0.s(es20Var, fsoVar, (vu30) objT, b0kVar2);
            nv20 nv20Var = (nv20) ven0VarH2.getValue();
            boolean zI2 = b0kVar2.i(ven0VarH2) | b0kVar2.i(cir0Var);
            Object objT2 = b0kVar2.T();
            Object obj3 = objT2;
            if (zI2 || objT2 == m4cVar) {
                eum eumVar = new eum(ven0VarH2, cir0Var, (lnm) null, (byte) 13);
                b0kVar2.s0(eumVar);
                obj3 = eumVar;
            }
            qxd0.t(nv20Var, b0kVar2, (vu30) obj3);
            List list = ((gw20) ven0VarH.getValue()).b;
            boolean z3 = list.size() > 1 && ((nv20) ven0VarH2.getValue()) == null;
            boolean zI3 = b0kVar2.i(this) | b0kVar2.i(cir0Var);
            Object objT3 = b0kVar2.T();
            Object obj4 = objT3;
            if (zI3 || objT3 == m4cVar) {
                pso psoVar = new pso(this, cir0Var);
                b0kVar2.s0(psoVar);
                obj4 = psoVar;
            }
            q3p1.b(0, 0, (Function0) obj4, b0kVar2, z3);
            evb1 evb1Var = (evb1) o7h.C0(list);
            if (evb1Var == null) {
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new won(this, fsoVar, fw20Var, i, (byte) 3);
                    return;
                }
                return;
            }
            wznVar = this;
            String str2 = evb1Var.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(b0kVar2).a.a.a(), d4o1.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str3 = ((q260) ven0VarH4.getValue()).a;
            int i5 = list.size() == 1 ? 2 : 1;
            boolean zI4 = b0kVar2.i(wznVar) | b0kVar2.i(cir0Var);
            Object objT4 = b0kVar2.T();
            Object obj5 = objT4;
            if (zI4 || objT4 == m4cVar) {
                sqm sqmVar = new sqm((Object) wznVar, (Object) cir0Var, (byte) 15);
                b0kVar2.s0(sqmVar);
                obj5 = sqmVar;
            }
            ufq0 ufq0Var = new ufq0(i5, (Function0) obj5);
            gv50 gv50Var = ((q260) ven0VarH4.getValue()).b;
            if (gv50Var == null) {
                b0kVar2.i0(1512400405);
                b0kVar2.r(false);
                qfq0Var = null;
                z2 = false;
                z = true;
            } else {
                b0kVar2.i0(1512400406);
                int iOrdinal = gv50Var.ordinal();
                if (iOrdinal != 0) {
                    z = true;
                    if (iOrdinal != 1) {
                        eg.o();
                        return;
                    }
                    i2 = 2;
                } else {
                    z = true;
                    i2 = 1;
                }
                boolean z4 = ((gw20) ven0VarH.getValue()).c;
                s0s s0sVar = (s0s) obj2;
                boolean zI5 = b0kVar2.i(s0sVar);
                Object objT5 = b0kVar2.T();
                if (zI5 || objT5 == m4cVar) {
                    objT5 = new l1k(0, s0sVar, s0s.class, "performAction", "performAction()V", 0, (byte) 18);
                    b0kVar2.s0(objT5);
                }
                qfq0 qfq0Var2 = new qfq0(i2, (Function0) objT5, z4);
                z2 = false;
                b0kVar2.r(false);
                qfq0Var = qfq0Var2;
            }
            boolean z5 = z2;
            boolean z6 = z;
            crm0.j(str3, (qim0) null, ufq0Var, qfq0Var, b0kVar2, 0, 2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(new jvb1(((evb1) it.next()).a));
            }
            List listW = fsoVar.w();
            Map map = ((gw20) ven0VarH.getValue()).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                jvb1 jvb1Var = (jvb1) entry.getKey();
                String str4 = jvb1Var.a;
                if (linkedHashSet.contains(jvb1Var)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayListW = myo1.w(listW, myo1.t(linkedHashMap.values()));
            asn asnVar = (asn) wznVar.c;
            int i6 = -1;
            if (evb1Var.b instanceof m4z0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : arrayListW) {
                    if (((evb1) obj6).b instanceof m4z0) {
                        arrayList.add(obj6);
                    }
                }
                Iterator it2 = arrayList.iterator();
                ?? r11 = z5;
                while (true) {
                    if (!it2.hasNext()) {
                        r11 = -1;
                        break;
                    } else if (u890.j(((evb1) it2.next()).a, str2)) {
                        break;
                    } else {
                        r11 = (r11 == true ? 1 : 0) + 1;
                    }
                }
                if (r11 >= 0) {
                    lvb1Var = new lvb1(r11 + (z6 ? 1 : 0), arrayList.size());
                } else {
                    lvb1Var = null;
                }
            } else {
                lvb1Var = null;
            }
            s0s s0sVar2 = (s0s) obj2;
            mvb1 mvb1Var = (mvb1) ((gw20) ven0VarH.getValue()).a.get(new jvb1(str2));
            boolean zI6 = b0kVar2.i(wznVar) | b0kVar2.i(evb1Var);
            Object objT6 = b0kVar2.T();
            Object obj7 = objT6;
            if (zI6 || objT6 == m4cVar) {
                y0o y0oVar = new y0o(wznVar, evb1Var, (byte) 7);
                b0kVar2.s0(y0oVar);
                obj7 = y0oVar;
            }
            asnVar.a(evb1Var, lvb1Var, s0sVar2, mvb1Var, (iu30) obj7, b0kVar2, 0);
            b0kVar2 = b0kVar2;
            b0kVar2.r(z6);
            qs20 qs20Var = (qs20) ven0VarH3.getValue();
            if (qs20Var == null) {
                b0kVar2.i0(-2128386890);
                b0kVar2.r(z5);
            } else {
                b0kVar2.i0(-2128386889);
                l2u l2uVar = (l2u) wznVar.d;
                GenerationServiceException generationServiceException = qs20Var.a;
                GenerationServiceException generationServiceException2 = generationServiceException instanceof GenerationServiceException ? generationServiceException : null;
                if (generationServiceException2 == null || (str = generationServiceException2.a) == null || ihc1.y0(str)) {
                    str = null;
                }
                if (generationServiceException2 != null) {
                    i3 = generationServiceException2.b;
                } else {
                    r10 = z5;
                }
                if (r10 != 0) {
                    r10 = i3;
                    i6 = nso.a[l1d.C((int) r10)];
                }
                switch (i6) {
                    case -1:
                    case 8:
                        lsoVar = new lso(str);
                        break;
                    case 0:
                    default:
                        eg.o();
                        return;
                    case 1:
                        lsoVar = new jso(str);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        lsoVar = new kso(str);
                        break;
                }
                es20 es20Var2 = (es20) obj;
                boolean zI7 = b0kVar2.i(es20Var2);
                Object objT7 = b0kVar2.T();
                if (zI7 || objT7 == m4cVar) {
                    l1k l1kVar = new l1k(0, es20Var2, es20.class, "retry", "retry()V", 0, (byte) 19);
                    b0kVar2.s0(l1kVar);
                    objT7 = l1kVar;
                }
                Function0 function0 = (Function0) objT7;
                es20 es20Var3 = (es20) obj;
                boolean zI8 = b0kVar2.i(es20Var3);
                Object objT8 = b0kVar2.T();
                if (zI8 || objT8 == m4cVar) {
                    l1k l1kVar2 = new l1k(0, es20Var3, es20.class, "dismissFailure", "dismissFailure()V", 0, (byte) 20);
                    b0kVar2.s0(l1kVar2);
                    objT8 = l1kVar2;
                }
                l2uVar.a(lsoVar, function0, (Function0) objT8, b0kVar2, 0);
                b0kVar2.r(z5);
            }
            qim0Var2 = qim0Var3;
        } else {
            wznVar = this;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new n7m(i, wznVar, fsoVar, fw20Var, qim0Var2, (byte) 11);
        }
    }

    public ObservableTransformer c() {
        j21 j21Var = (j21) this.a;
        br81 br81Var = j21Var.k;
        x2g1 x2g1Var = j21Var.h;
        a911 a911Var = j21Var.i;
        String str = j21Var.n;
        String str2 = j21Var.o;
        jqt jqtVar = j21Var.p;
        hj01 hj01Var = j21Var.j;
        ar81 ar81Var = new ar81(br81Var, x2g1Var, a911Var, str, str2, jqtVar, hj01Var, ((kp5) this.b).l());
        km8 km8Var = new km8(j21Var.l);
        mq91 mq91Var = new mq91(hj01Var);
        mce mceVar = (mce) j21Var.d.createWebgateService(mce.class, "android-login-adaptiveauthentication");
        ou71 ou71Var = j21Var.e;
        x01 x01Var = j21Var.f;
        oj80 oj80Var = (oj80) this.c;
        wf8 wf8Var = (wf8) oj80Var.b;
        c8o.l(wf8Var);
        ynb0 ynb0VarA = xqu.a((jwo) this.d);
        vf8 vf8Var = j21Var.c;
        vxe0 vxe0Var = j21Var.b;
        rp5 rp5Var = new rp5(j21Var.a.getApplicationContext());
        ai8 ai8Var = (ai8) oj80Var.c;
        c8o.l(ai8Var);
        u11 u11Var = new u11(ar81Var, km8Var, mq91Var, mceVar, ou71Var, x01Var, wf8Var, ynb0VarA, vf8Var, vxe0Var, rp5Var, ai8Var, hj01Var, jqtVar);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(il40.class, new i11(u11Var));
        subtypeEffectHandlerBuilderC.g(zfg.class, new d11(u11Var));
        subtypeEffectHandlerBuilderC.g(b411.class, new m11(u11Var));
        subtypeEffectHandlerBuilderC.g(ja41.class, new p11(u11Var));
        subtypeEffectHandlerBuilderC.c(ia41.class, new o11(u11Var));
        subtypeEffectHandlerBuilderC.g(z0f0.class, new b11(u11Var));
        subtypeEffectHandlerBuilderC.g(ni8.class, new s11(u11Var));
        subtypeEffectHandlerBuilderC.g(ka41.class, new r11(u11Var));
        subtypeEffectHandlerBuilderC.g(c411.class, new n11(u11Var));
        subtypeEffectHandlerBuilderC.g(oi8.class, new t11(u11Var));
        subtypeEffectHandlerBuilderC.g(jxe0.class, new q11(u11Var));
        subtypeEffectHandlerBuilderC.g(exe0.class, new j11(u11Var));
        subtypeEffectHandlerBuilderC.g(fxe0.class, l11.a);
        subtypeEffectHandlerBuilderC.g(b1f0.class, new k11(u11Var));
        subtypeEffectHandlerBuilderC.g(a1f0.class, new h11(u11Var));
        subtypeEffectHandlerBuilderC.g(cxe0.class, new f11(u11Var));
        subtypeEffectHandlerBuilderC.g(bp81.class, new zq81(ar81Var));
        subtypeEffectHandlerBuilderC.g(oo81.class, new vq81(ar81Var));
        subtypeEffectHandlerBuilderC.g(ap81.class, new yq81(ar81Var));
        subtypeEffectHandlerBuilderC.g(eyh.class, new tq81(ar81Var));
        subtypeEffectHandlerBuilderC.g(no81.class, new uq81(ar81Var));
        subtypeEffectHandlerBuilderC.g(po81.class, new wq81(ar81Var));
        subtypeEffectHandlerBuilderC.g(zwe0.class, new jm8(km8Var));
        subtypeEffectHandlerBuilderC.c(ywe0.class, im8.a);
        subtypeEffectHandlerBuilderC.g(hxe0.class, new kq91(mq91Var));
        subtypeEffectHandlerBuilderC.g(ixe0.class, lq91.a);
        subtypeEffectHandlerBuilderC.g(gxe0.class, jq91.a);
        subtypeEffectHandlerBuilderC.g(bxe0.class, hq91.a);
        subtypeEffectHandlerBuilderC.g(dxe0.class, iq91.a);
        subtypeEffectHandlerBuilderC.g(axe0.class, gq91.a);
        return subtypeEffectHandlerBuilderC.h();
    }

    public HttpConnectionDelegate createDelegate() {
        h8o h8oVar = (h8o) this.a;
        CronetEngine cronetEngine = (CronetEngine) h8oVar.a.get();
        return cronetEngine != null ? new v7o(cronetEngine, h8oVar, (yqg) this.c, (String) ((idd1) this.d).getValue()) : ((HttpConnectionFactory) this.b).createDelegate();
    }

    public fv21 f(l1o l1oVar, bw21 bw21Var) {
        Map map = (Map) this.a;
        if (bw21Var.b) {
            return dv21.a;
        }
        if (l1oVar.b == 2 || !((yf4) this.b).a()) {
            ebr0 ebr0Var = (ebr0) map.get(h1o.class);
            if (ebr0Var != null) {
                return new ev21(new lzh(ebr0Var, l1oVar));
            }
            eg.m("No page provider found for CreatorPage");
            return null;
        }
        int i = bw21Var.a;
        if ((i == 0 ? -1 : uzn.a[l1d.C(i)]) == 1) {
            ebr0 ebr0Var2 = (ebr0) map.get(i0k.class);
            if (ebr0Var2 != null) {
                return new ev21(new lzh(ebr0Var2, new l0k(l1oVar.a, l1oVar.c)));
            }
            eg.m("No page provider found for ComposerPage");
            return null;
        }
        ebr0 ebr0Var3 = (ebr0) map.get(h1o.class);
        if (ebr0Var3 != null) {
            return new ev21(new lzh(ebr0Var3, l1oVar));
        }
        eg.m("No page provider found for CreatorPage");
        return null;
    }

    public wzn(h8o h8oVar, HttpConnectionFactory httpConnectionFactory, yqg yqgVar) {
        this.a = h8oVar;
        this.b = httpConnectionFactory;
        this.c = yqgVar;
        this.d = new idd1(new z5o(this, (byte) 1));
    }

    public wzn(q8n q8nVar, pbr0 pbr0Var, yqg yqgVar, cir0 cir0Var) {
        this.a = q8nVar;
        this.b = pbr0Var;
        this.c = yqgVar;
        this.d = cir0Var.h().a(uj1.s, new wj1(this, (byte) 16));
    }

    public wzn(es20 es20Var, s0s s0sVar, asn asnVar, yla ylaVar, l2u l2uVar) {
        this.a = es20Var;
        this.b = s0sVar;
        this.c = asnVar;
        this.d = l2uVar;
    }

    public /* synthetic */ wzn(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public wzn(nzp nzpVar, qop qopVar, jbt jbtVar) {
        this.a = jbtVar;
        this.b = qopVar;
        this.c = nzpVar;
        this.d = new jwo(this, (byte) 14);
    }

    public wzn(yu3 yu3Var) {
        this.a = yu3Var;
        this.b = iy81.a(new fwo(this, 0, (byte) 21));
        this.c = iy81.a(new fwo(this, 2, (byte) 21));
        this.d = iy81.a(new fwo(this, 1, (byte) 21));
    }

    public wzn(lzp lzpVar, bct bctVar) {
        this.a = bctVar;
        this.b = lzpVar;
        this.c = iy81.a(new ewo(this, 1, (byte) 9));
        this.d = iy81.a(new ewo(this, 0, (byte) 9));
    }

    public wzn(ot0 ot0Var, q7r0 q7r0Var) {
        this.a = ot0Var;
        this.b = q7r0Var;
        this.c = iy81.a(new ewo(this, 0, (byte) 1));
        this.d = new ewo(this, 1, (byte) 1);
    }

    public wzn(w52 w52Var, x52 x52Var) {
        this.a = w52Var;
        this.b = x52Var;
        this.c = xqu.b(new ewo(this, 1, (byte) 2));
        this.d = new ewo(this, 0, (byte) 2);
    }

    public wzn(k0b k0bVar, l0b l0bVar) {
        this.a = k0bVar;
        this.b = l0bVar;
        this.c = iy81.a(new ewo(this, 0, (byte) 14));
        this.d = iy81.a(new ewo(this, 1, (byte) 14));
    }

    public wzn(nqg nqgVar, pqg pqgVar, q7r0 q7r0Var) {
        this.a = pqgVar;
        this.b = nqgVar;
        this.c = q7r0Var;
        this.d = xqu.b(new z1p(this, (byte) 25));
    }

    public wzn(zwg zwgVar) {
        this.a = zwgVar;
        this.b = iy81.a(new fwo(this, 0, (byte) 23));
        this.c = iy81.a(new fwo(this, 1, (byte) 23));
        this.d = new fwo(this, 2, (byte) 23);
    }

    public wzn(n0q n0qVar, qop qopVar, bct bctVar) {
        this.a = n0qVar;
        this.b = qopVar;
        this.c = iy81.a(new ewo(this, 0, (byte) 15));
        this.d = new ewo(this, 1, (byte) 15);
    }

    public wzn(r2 r2Var, u2 u2Var) {
        this.a = u2Var;
        this.b = r2Var;
        this.c = xqu.b(new ewo(this, 0, (byte) 0));
        this.d = xqu.b(new ewo(this, 1, (byte) 0));
    }

    public wzn(zwg zwgVar, boolean z) {
        this.a = zwgVar;
        byte b = 25;
        this.b = new b2p(this, 0, b);
        this.c = new b2p(this, 1, b);
        this.d = new b2p(this, 2, b);
    }

    public wzn(omf omfVar, pmf pmfVar) {
        this.a = omfVar;
        this.b = pmfVar;
        this.c = new ewo(this, 0, (byte) 23);
        this.d = iy81.a(new ewo(this, 1, (byte) 23));
    }

    public wzn(xyf xyfVar, lyf lyfVar, q7r0 q7r0Var) {
        this.a = lyfVar;
        this.b = q7r0Var;
        this.c = iy81.a(new ewo(this, 0, (byte) 24));
        this.d = new ewo(this, 1, (byte) 24);
    }

    public wzn(j21 j21Var, oj80 oj80Var, kp5 kp5Var) {
        this.a = j21Var;
        this.b = kp5Var;
        this.c = oj80Var;
        this.d = new jwo(this, (byte) 3);
    }

    public wzn(do6 do6Var, eo6 eo6Var, q7r0 q7r0Var) {
        this.a = do6Var;
        this.b = q7r0Var;
        this.c = new ewo(this, 1, (byte) 7);
        this.d = iy81.a(new ewo(this, 0, (byte) 7));
    }

    public wzn(ml9 ml9Var, ryj ryjVar) {
        this.a = ml9Var;
        byte b = 3;
        this.b = xqu.b(new b2p(this, 0, b));
        this.c = xqu.b(new b2p(this, 1, b));
        this.d = xqu.b(new b2p(this, 2, b));
    }

    public wzn(lee leeVar, nee neeVar, q7r0 q7r0Var) {
        this.a = leeVar;
        this.b = q7r0Var;
        this.c = iy81.a(new ewo(this, 1, (byte) 20));
        this.d = iy81.a(new ewo(this, 0, (byte) 20));
    }

    public wzn(ar6 ar6Var, ryj ryjVar, br6 br6Var, q7r0 q7r0Var) {
        this.a = ar6Var;
        this.b = q7r0Var;
        this.c = new ewo(this, 1, (byte) 8);
        this.d = iy81.a(new ewo(this, 0, (byte) 8));
    }

    public wzn(cng cngVar, ivj ivjVar, dng dngVar, q7r0 q7r0Var) {
        this.a = dngVar;
        this.b = cngVar;
        this.c = iy81.a(new ewo(this, 0, (byte) 25));
        this.d = xqu.b(new ewo(this, 1, (byte) 25));
    }

    public wzn(kw3 kw3Var, mw3 mw3Var, q7r0 q7r0Var) {
        this.a = kw3Var;
        this.b = xqu.b(new fwo(this, 0, (byte) 16));
        this.c = iy81.a(new fwo(this, 1, (byte) 16));
        this.d = iy81.a(new fwo(this, 2, (byte) 16));
    }

    public wzn(fme fmeVar, gme gmeVar, q7r0 q7r0Var) {
        this.a = fmeVar;
        byte b = 14;
        this.b = xqu.b(new b2p(this, 0, b));
        this.c = xqu.b(new b2p(this, 1, b));
        this.d = iy81.a(new b2p(this, 2, b));
    }

    public wzn(amh amhVar, ivj ivjVar, hmh hmhVar, q7r0 q7r0Var) {
        this.a = q7r0Var;
        this.b = amhVar;
        this.c = xqu.b(new ewo(this, 0, (byte) 26));
        this.d = iy81.a(new ewo(this, 1, (byte) 26));
    }
}
