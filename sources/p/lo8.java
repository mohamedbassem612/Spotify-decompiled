package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lo8 implements l4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ lo8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        jdg kdgVar;
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 2;
        byte b4 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                po8 po8Var = (po8) obj3;
                mr20 mr20VarI = ((cir0) obj2).i();
                cnc0 cnc0Var = (cnc0) po8Var.i.get();
                String str = po8Var.c.a;
                h3h1 h3h1Var = new h3h1(new mo8(po8Var, b4));
                no8 no8Var = new no8(po8Var);
                oo8 oo8Var = new oo8(cnc0Var, po8Var);
                hoc hocVar = po8Var.h;
                iac0 iac0VarH = x9p1.h(viewGroup);
                qe41 qe41VarW = hm5.w(viewGroup);
                if (iac0VarH == null) {
                    hhg1.n("Page should have lifecycleOwner");
                } else {
                    if (qe41VarW != null) {
                        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131626290, viewGroup, false);
                        x9p1.p(coordinatorLayoutInflate, iac0VarH);
                        hocVar.b(coordinatorLayoutInflate);
                        return new kqw(str, coordinatorLayoutInflate, oo8Var, no8Var, h3h1Var, qe41VarW, mr20VarI, bundle);
                    }
                    hhg1.n("Page should have SavedStateRegistry");
                }
                return null;
            case 1:
                s5e s5eVarA = j4p.a((j4p) obj3, (List) obj, (Bundle) null, ((oto0) obj2).a.e(), 2);
                s5eVarA.c(context, layoutInflater, viewGroup);
                int i = kgr0.T0;
                View view = s5eVarA.getView();
                if (view != null) {
                    return new v5e(s5eVarA, xyn1.z(view), (byte) 0);
                }
                hhg1.n("Required value was null.");
                return null;
            case 2:
                View viewInflate = layoutInflater.inflate(2131623993, viewGroup, false);
                l4p l4pVar = (l4p) obj3;
                viewInflate.getClass();
                l4pVar.getClass();
                bk7 bk7Var = new bk7();
                z6x z6xVar = z6x.a;
                bk7Var.e = z6xVar;
                bk7Var.f = j8y0.N0;
                q4e q4eVar = new q4e();
                q4eVar.e = z6xVar;
                q4eVar.f = j8y0.Z;
                wzn wznVar = (wzn) l4pVar.a.c;
                Context context2 = (Context) ((lee) wznVar.a).d.get();
                c8o.l(context2);
                j1e j1eVar = new j1e(context2, (byte) 9);
                m4p m4pVar = (m4p) ((jly0) wznVar.c).get();
                lee leeVar = (lee) wznVar.a;
                i8h1 i8h1Var = (i8h1) leeVar.f.get();
                c8o.l(i8h1Var);
                kdy0 kdy0Var = new kdy0(i8h1Var, cwl1.G((q7r0) wznVar.b));
                dg30 dg30Var = (dg30) leeVar.e.get();
                c8o.l(dg30Var);
                return new qee(new h72(bk7Var, q4eVar, j1eVar, m4pVar, kdy0Var, dg30Var, viewInflate, (String) obj, (cfd) obj2));
            case 3:
                ddg ddgVar = (edg) obj;
                cce cceVar = ((ldg) obj3).c;
                cir0 cir0Var = (cir0) obj2;
                if (ddgVar instanceof bdg) {
                    tnm tnmVar = (tnm) ((c6p) cceVar.b).a.c;
                    lzn0 lzn0Var = (lzn0) ((rls0) tnmVar.c).b.get();
                    c8o.l(lzn0Var);
                    rls0 rls0Var = (rls0) tnmVar.c;
                    mdg mdgVar = (mdg) tnmVar.b;
                    i8h1 i8h1Var2 = (i8h1) rls0Var.i.get();
                    c8o.l(i8h1Var2);
                    cfd cfdVar = new cfd(mdgVar, i8h1Var2);
                    xfx xfxVar = (xfx) rls0Var.j.get();
                    c8o.l(xfxVar);
                    t8x t8xVar = new t8x(xfxVar.f, b2);
                    lzn0 lzn0Var2 = (lzn0) rls0Var.b.get();
                    c8o.l(lzn0Var2);
                    kdgVar = new jdg(lzn0Var, cfdVar, t8xVar, new pzn0(lzn0Var2, mdgVar), cir0Var, context, (bdg) ddgVar);
                } else {
                    if (ddgVar instanceof cdg) {
                        lzn0 lzn0Var3 = (lzn0) ((rls0) ((tnm) ((g6p) cceVar.d).a.c).c).b.get();
                        c8o.l(lzn0Var3);
                        return new qdg(lzn0Var3, context, (cdg) ddgVar);
                    }
                    if (!(ddgVar instanceof ddg)) {
                        eg.o();
                        return null;
                    }
                    tnm tnmVar2 = (tnm) ((d6p) cceVar.c).a.c;
                    kdgVar = new kdg((e6p) ((jly0) tnmVar2.e).get(), (f6p) ((jly0) tnmVar2.f).get(), context, cir0Var, layoutInflater, viewGroup, ddgVar);
                }
                return kdgVar;
            case 4:
                k8m0 k8m0Var = (k8m0) obj;
                l6p l6pVar = (l6p) obj3;
                CoordinatorLayout coordinatorLayoutInflate2 = layoutInflater.inflate(2131624345, (ViewGroup) null, false);
                CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate2;
                int i2 = 2131428618;
                View viewT = m5n1.t(coordinatorLayoutInflate2, 2131428618);
                if (viewT != null) {
                    i2 = 2131430614;
                    RecyclerView recyclerViewT = m5n1.t(coordinatorLayoutInflate2, 2131430614);
                    if (recyclerViewT != null) {
                        lag lagVar = new lag((Object) coordinatorLayout, (Object) coordinatorLayout, (Object) viewT, (Object) recyclerViewT, (byte) 12);
                        kp5 kp5Var = (kp5) l6pVar.a.c;
                        kly0 kly0Var = ((k2h) kp5Var.a).g;
                        xfx xfxVar2 = (xfx) kly0Var.get();
                        c8o.l(xfxVar2);
                        pp ppVar = new pp(xfxVar2.c, (byte) 10);
                        xfx xfxVar3 = (xfx) kly0Var.get();
                        c8o.l(xfxVar3);
                        yfx yfxVar = new yfx(xfxVar3.e, (byte) 1);
                        xfx xfxVar4 = (xfx) kly0Var.get();
                        c8o.l(xfxVar4);
                        g0h g0hVar = new g0h(ppVar, yfxVar, new zfx(xfxVar4.c, (byte) 28), new mka((byte) 28), new cce(u1n0.z((q7r0) kp5Var.c), new bqk0((byte) 26), kp5Var.p()));
                        k2h k2hVar = (k2h) kp5Var.a;
                        Context context3 = (Context) k2hVar.a.get();
                        c8o.l(context3);
                        cce cceVar2 = new cce(u1n0.z((q7r0) kp5Var.c), new bqk0((byte) 26), kp5Var.p());
                        xfx xfxVar5 = (xfx) k2hVar.g.get();
                        c8o.l(xfxVar5);
                        sp spVar = new sp(context3, cceVar2, new pfx(xfxVar5.d, (byte) 0));
                        xfx xfxVar6 = (xfx) k2hVar.g.get();
                        c8o.l(xfxVar6);
                        return new m2h(new cr6(lagVar, g0hVar, spVar, new t8x(xfxVar6.f, (byte) 2)), k8m0Var, (v9k1) obj2);
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate2.getResources().getResourceName(i2)));
                return null;
            case 5:
                return new gzj(context, 2131428350, new j2i(489224813, new bwj((zu30) obj3, obj, (Function0) obj2, (byte) 2), true));
            case 6:
                return new gzj(context, new j2i(-274781518, new jnl((cir0) obj2, (knl) obj3, (nnl) obj, (byte) 1), true));
            case 7:
                return new gzj(context, new j2i(1855442382, new v2o((cir0) obj2, (w2o) obj3, (y2o) obj, (byte) 1), true));
            case 8:
                return new yfo(bundle == null ? mno1.g() : bundle, (re70) obj, (lgo) obj3, (wfo) obj2);
            case 9:
                List list = (List) obj;
                Bundle bundle2 = new Bundle();
                qi50 qi50Var = (qi50) obj2;
                bi90 bi90Var = qi50Var.a;
                if (bi90Var != null) {
                    bundle2.putParcelable("SELECTED_GROUP_ITEM", bi90Var);
                }
                String str2 = qi50Var.b;
                if (str2 != null) {
                    bundle2.putString("SELECTED_GROUP_ITEM_KEY", str2);
                }
                String str3 = qi50Var.c;
                if (str3 != null) {
                    bundle2.putString("SELECTED_GROUP_ITEM_URI", str3);
                }
                s5e s5eVarA2 = j4p.a((j4p) obj3, list, bundle2, false, 4);
                s5eVarA2.c(context, layoutInflater, viewGroup);
                View view2 = s5eVarA2.getView();
                if (view2 == null) {
                    hhg1.n("CategoriesPage view must not be null after initView");
                    return null;
                }
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                int i3 = kgr0.T0;
                return new v5e(s5eVarA2, xyn1.z(view2), (byte) 1);
            case 10:
                yyc0 yyc0Var = (yyc0) obj3;
                return (f4h1) yyc0Var.a.c(h5d0.h1, new dy7(yyc0Var, (zou0) obj, viewGroup, bundle, layoutInflater, (cir0) obj2, (byte) 8));
            case 11:
                int i4 = kgr0.T0;
                return new z6e0(xyn1.z(layoutInflater.inflate(2131625216, viewGroup, false)), (t2b) obj3, (le90) obj, (vnd1) obj2);
            case 12:
                r8e0 r8e0Var = (r8e0) obj3;
                r8e0Var.b(layoutInflater, viewGroup);
                int i5 = kgr0.T0;
                View view3 = r8e0Var.f;
                view3.getClass();
                return new awa(xyn1.z(view3), (q8e0) obj2, (o9v0) obj, b3);
            case 13:
                List list2 = (List) obj;
                yvo0 yvo0VarA = list2.isEmpty() ? ((ztp) obj2).a() : ((ytp) obj3).a(list2);
                yvo0VarA.c(context, layoutInflater, viewGroup);
                int i6 = kgr0.T0;
                View view4 = yvo0VarA.getView();
                view4.getClass();
                return new l59(xyn1.z(view4), yvo0VarA, (byte) 5);
            case 14:
                Bundle bundle3 = bundle != null ? bundle.getBundle("view_bundle") : null;
                Bundle bundle4 = bundle != null ? bundle.getBundle("presenter_bundle") : null;
                p4h1 p4h1Var = (p4h1) ((zu30) obj3).J(context, layoutInflater, viewGroup, bundle3);
                return new huf0(p4h1Var, (o4h1) ((xu30) obj2).invoke(p4h1Var, obj, bundle4));
            default:
                j1o j1oVar = (j1o) obj;
                s880 s880Var = (s880) obj3;
                mr20 mr20Var = (mr20) obj2;
                o1o o1oVar = new o1o(context, bundle, s880Var.h(((ddr0) j1oVar.m().getValue()).b(), j1oVar.l(), layoutInflater, viewGroup, bundle, mr20Var), o4p1.r(new f6w(z4p1.v(j1oVar.m(), 1), j1oVar, s880Var, context, layoutInflater, viewGroup, bundle, mr20Var), (q8n) s880Var.a), (l1o) s880Var.b, (frr) s880Var.g, (q8n) s880Var.a);
                l9p l9pVar = (l9p) s880Var.f;
                bpb1 bpb1VarK = j1oVar.k();
                String str4 = ((vfr0) ((ddr0) j1oVar.m().getValue()).b().a(qcr0.a)).a;
                x290 x290Var = (x290) ((i1o) ((u9p) l9pVar.a.c).C).s0.get();
                c8o.l(x290Var);
                return new zcy(x290Var, brt.x(), context, str4, bpb1VarK, o1oVar);
        }
    }

    public /* synthetic */ lo8(cir0 cir0Var, h0r0 h0r0Var, byte b) {
        this.a = b;
        this.c = cir0Var;
        this.b = h0r0Var;
    }
}
