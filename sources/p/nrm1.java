package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nrm1 implements l5r0 {
    public final zrj1 a;
    public final cik1 b;
    public final erm1 c;
    public final orm1 d;
    public p1f0 e;
    public MobiusLoop.Controller f;

    public nrm1(zrj1 zrj1Var, cik1 cik1Var, erm1 erm1Var, orm1 orm1Var) {
        this.a = zrj1Var;
        this.b = cik1Var;
        this.c = erm1Var;
        this.d = orm1Var;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        View view2;
        View view3;
        List list = (List) prm1.e.getValue();
        List list2 = (List) qrm1.e.getValue();
        orm1 orm1Var = this.d;
        frm1 frm1Var = new frm1(list, list2, orm1Var.a, orm1Var.b, orm1Var.c);
        erm1 erm1Var = this.c;
        dr41 dr41Var = erm1Var.a;
        ep31 ep31Var = erm1Var.b;
        lzn0 lzn0Var = erm1Var.c;
        Scheduler scheduler = erm1Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(tqm1.class, new rdj1(dr41Var, (byte) 17));
        subtypeEffectHandlerBuilderC.c(uqm1.class, new rdj1(ep31Var, (byte) 18));
        subtypeEffectHandlerBuilderC.c(qqm1.class, vrk1.t);
        subtypeEffectHandlerBuilderC.b(oqm1.class, new g5b(lzn0Var, (byte) 6), scheduler);
        subtypeEffectHandlerBuilderC.a(rqm1.class, ps4.c1);
        subtypeEffectHandlerBuilderC.a(sqm1.class, ps4.d1);
        subtypeEffectHandlerBuilderC.d(pqm1.class, new f5b(lzn0Var, (byte) 21), scheduler);
        this.f = Mobius.b(l1d.g(Mobius.d(drm1.b, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{Observable.empty()}))), frm1Var, crm1.a, MainThreadWorkRunner.a());
        zrj1 zrj1Var = this.a;
        p1f0 p1f0Var = new p1f0(layoutInflater, viewGroup, (xfx) zrj1Var.b, (h5a1) zrj1Var.c, (gqm1) zrj1Var.d);
        idd1 idd1Var = (idd1) p1f0Var.c;
        idd1 idd1Var2 = (idd1) p1f0Var.d;
        this.e = p1f0Var;
        cik1 cik1Var = this.b;
        cn3 cn3Var = (cn3) cik1Var.b;
        oh20 oh20Var = (oh20) cik1Var.c;
        mxa1 mxa1Var = (mxa1) cik1Var.d;
        z4m0 z4m0Var = (z4m0) mxa1Var.d;
        i8h1 i8h1Var = (i8h1) mxa1Var.b;
        urm1 urm1Var = new urm1(p1f0Var, cn3Var, oh20Var, mxa1Var, (t8h1) cik1Var.e);
        qzh qzhVar = (qzh) ((idd1) p1f0Var.g).getValue();
        if (qzhVar != null && (view3 = qzhVar.getView()) != null) {
            p1f0Var.n().addView(((qzh) idd1Var2.getValue()).getView());
            View view4 = ((qzh) idd1Var2.getValue()).getView();
            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            ric0 ric0Var = layoutParams instanceof ric0 ? (ric0) layoutParams : null;
            if (ric0Var != null) {
                ((LinearLayout.LayoutParams) ric0Var).topMargin = view4.getResources().getDimensionPixelSize(2131167025);
                view4.setLayoutParams(ric0Var);
            }
            p1f0Var.n().addView(view3);
            int iA = urm1Var.a(view3);
            z4m0Var.getClass();
            x6h1 x6h1VarC = z4m0Var.a.c();
            x6h1VarC.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            Integer numValueOf = Integer.valueOf(iA);
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA2;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = z4m0Var.b;
            i8h1Var.f(k7h1Var.a(), (Set) null);
        }
        p1f0Var.n().addView(((qzh) idd1Var.getValue()).getView());
        View view5 = ((qzh) idd1Var.getValue()).getView();
        ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
        ric0 ric0Var2 = layoutParams2 instanceof ric0 ? (ric0) layoutParams2 : null;
        if (ric0Var2 != null) {
            ((LinearLayout.LayoutParams) ric0Var2).topMargin = view5.getResources().getDimensionPixelSize(2131167025);
            view5.setLayoutParams(ric0Var2);
        }
        qzh qzhVar2 = (qzh) ((idd1) p1f0Var.e).getValue();
        if (qzhVar2 != null && (view2 = qzhVar2.getView()) != null) {
            p1f0Var.n().addView(view2);
            int iA2 = urm1Var.a(view2);
            z4m0Var.getClass();
            x6h1 x6h1VarC3 = z4m0Var.a.c();
            x6h1VarC3.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            Integer numValueOf2 = Integer.valueOf(iA2);
            x6h1 x6h1VarC4 = y6h1VarA3.c();
            x6h1VarC4.i.add(new a7h1("item", (String) null, numValueOf2, (String) null, (String) null));
            x6h1VarC4.j = true;
            y6h1 y6h1VarA4 = x6h1VarC4.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA4;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var2.e = z4m0Var.b;
            i8h1Var.f(k7h1Var2.a(), (Set) null);
        }
        qzh qzhVar3 = (qzh) ((idd1) p1f0Var.f).getValue();
        if (qzhVar3 != null && (view = qzhVar3.getView()) != null) {
            p1f0Var.n().addView(view);
            int iA3 = urm1Var.a(view);
            z4m0Var.getClass();
            x6h1 x6h1VarC5 = z4m0Var.a.c();
            x6h1VarC5.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            y6h1 y6h1VarA5 = x6h1VarC5.a();
            Integer numValueOf3 = Integer.valueOf(iA3);
            x6h1 x6h1VarC6 = y6h1VarA5.c();
            x6h1VarC6.i.add(new a7h1("item", (String) null, numValueOf3, (String) null, (String) null));
            x6h1VarC6.j = true;
            y6h1 y6h1VarA6 = x6h1VarC6.a();
            k7h1 k7h1Var3 = new k7h1();
            ((xjn) k7h1Var3).a = y6h1VarA6;
            ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var3.e = z4m0Var.b;
            i8h1Var.f(k7h1Var3.a(), (Set) null);
        }
        MobiusLoop.Controller controller = this.f;
        if (controller != null) {
            controller.c(urm1Var);
        } else {
            u890.C("loopController");
            throw null;
        }
    }

    public final View getView() {
        p1f0 p1f0Var = this.e;
        if (p1f0Var != null) {
            return (View) ((idd1) p1f0Var.a).getValue();
        }
        return null;
    }

    public final void start() {
        MobiusLoop.Controller controller = this.f;
        if (controller != null) {
            if (controller == null) {
                u890.C("loopController");
                throw null;
            }
            if (controller.isRunning()) {
                return;
            }
            MobiusLoop.Controller controller2 = this.f;
            if (controller2 != null) {
                controller2.start();
            } else {
                u890.C("loopController");
                throw null;
            }
        }
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.f;
        if (controller != null) {
            if (controller == null) {
                u890.C("loopController");
                throw null;
            }
            if (controller.isRunning()) {
                MobiusLoop.Controller controller2 = this.f;
                if (controller2 != null) {
                    controller2.stop();
                } else {
                    u890.C("loopController");
                    throw null;
                }
            }
        }
    }
}
