package p;

import android.view.ActionMode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rm implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void dispose() {
        byte b = this.a;
        rih1 rih1Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vm) obj).a.invoke();
                return;
            case 1:
                rh0 rh0Var = ((lh0) obj).a;
                if (rh0Var != null) {
                    rh0Var.b();
                    rih1Var = rih1.a;
                }
                if (rih1Var != null) {
                    return;
                }
                eg.m("Launcher has not been initialized");
                return;
            case 2:
                nt0 nt0Var = (nt0) obj;
                faa0 faa0Var = nt0Var.u;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                nt0Var.u = null;
                return;
            case 3:
                ((ec2) obj).d(false);
                return;
            case 4:
                c4u c4uVar = (c4u) obj;
                c4uVar.dismiss();
                c4uVar.g.l();
                return;
            case 5:
                View view = (ifv0) obj;
                view.l();
                x9p1.p(view, (iac0) null);
                ((ifv0) view).T0.removeViewImmediate(view);
                return;
            case 6:
                d45 d45Var = (d45) obj;
                gw91 gw91Var = d45Var.e;
                gw91Var.f();
                gw91Var.a();
                ActionMode actionMode = d45Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                d45Var.h = null;
                return;
            case 7:
                smo1.p(((yfr) obj).g, (CancellationException) null);
                return;
            case 8:
                smo1.p(((l96) obj).d, (CancellationException) null);
                return;
            case 9:
                ((ll9) obj).e.stop();
                return;
            case 10:
                ((acq0) ((csj1) obj).b).L(519);
                return;
            case 11:
                io9 io9Var = (io9) obj;
                io9Var.f.stop();
                if (io9Var.c.isChangingConfigurations()) {
                    return;
                }
                io9Var.b.b();
                return;
            case 12:
                ot9 ot9Var = (ot9) ((et9) obj).e;
                ot9Var.c = 1;
                ot9Var.d = null;
                return;
            case 13:
                ((eu9) obj).e();
                return;
            case 14:
                fea feaVar = (fea) ((gea) obj).c.getValue();
                if (feaVar != null) {
                    feaVar.close();
                    return;
                }
                return;
            case 15:
                r7e1 r7e1Var = (r7e1) obj;
                r7e1Var.d.a();
                r7e1Var.k = null;
                return;
            case 16:
                ((w5f1) obj).b();
                return;
            case 17:
                lub lubVar = (lub) obj;
                mub mubVar = lubVar.a;
                mub mubVar2 = lubVar.a;
                t480 t480Var = lubVar.d;
                if (t480Var != null) {
                    mubVar.b.o(t480Var, mub.d);
                }
                lubVar.d = null;
                t480 t480Var2 = lubVar.e;
                if (t480Var2 != null) {
                    mubVar2.b.o(t480Var2, mub.d);
                }
                lubVar.e = null;
                t480 t480Var3 = lubVar.f;
                if (t480Var3 != null) {
                    mubVar2.b.o(t480Var3, mub.d);
                }
                lubVar.f = null;
                t480 t480Var4 = lubVar.g;
                if (t480Var4 != null) {
                    mubVar2.b.o(t480Var4, mub.d);
                }
                lubVar.g = null;
                return;
            case 18:
                znb0 znb0Var = (znb0) obj;
                if (znb0Var.isInitialized()) {
                    ((rzq) znb0Var.getValue()).l();
                    return;
                }
                return;
            case 19:
                xab1 xab1Var = ((bmh1) obj).e;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                    return;
                }
                return;
            case 20:
                ((pd8) obj).d(false);
                return;
            case 21:
                lqg lqgVar = (lqg) obj;
                snc0 snc0Var = lqgVar.f;
                if (snc0Var != null) {
                    if (snc0Var == null) {
                        u890.C("listContentRuntime");
                        throw null;
                    }
                    snc0Var.destroy();
                }
                xab1 xab1Var2 = lqgVar.j;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                    return;
                }
                return;
            case 22:
                ((jzg) obj).b.b = null;
                return;
            case 23:
                j1r0 j1r0Var = (j1r0) obj;
                ArrayList arrayList = j1r0Var.b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j1r0Var.a.getLifecycle().d((hac0) it.next());
                }
                arrayList.clear();
                return;
            case 24:
                ((sfn0) obj).c();
                return;
            case 25:
                ((f4h1) obj).stop();
                return;
            case 26:
                jqd0 jqd0Var = ((mtm) obj).m;
                if (jqd0Var.b) {
                    return;
                }
                i8h1 i8h1Var = (i8h1) ((ynb0) jqd0Var.c).get();
                x6h1 x6h1VarC = ((txk0) jqd0Var.d).b.c();
                x6h1VarC.i.add(new a7h1("outside_area", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 27:
                ((x6e1) obj).m();
                return;
            case 28:
                ((knn) obj).f.a.l((Object) null);
                return;
            default:
                llm llmVar = (llm) ((res) obj).h;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                    return;
                } else {
                    u890.C("scope");
                    throw null;
                }
        }
    }
}
