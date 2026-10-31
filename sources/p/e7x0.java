package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e7x0 implements Connectable {
    public final qzh X;
    public final FrameLayout Y;
    public boolean Z;
    public final cbr0 a;
    public final o3x0 b;
    public final oxi0 c;
    public final kt91 d;
    public final idd1 e;
    public final Context f;
    public final qzh g;
    public final idd1 h = new idd1(new d7x0(this, (byte) 0));
    public final w2z i;
    public final FrameLayout t;

    public e7x0(LayoutInflater layoutInflater, ViewGroup viewGroup, cbr0 cbr0Var, z6x0 z6x0Var, o3x0 o3x0Var, hvp0 hvp0Var, oxi0 oxi0Var, nfx nfxVar, t8x t8xVar, kt91 kt91Var, ynb0 ynb0Var) {
        this.a = cbr0Var;
        this.b = o3x0Var;
        this.c = oxi0Var;
        this.d = kt91Var;
        this.e = new idd1(new dl3(ynb0Var, (byte) 6));
        this.f = viewGroup.getContext();
        View viewInflate = layoutInflater.inflate(2131624691, (ViewGroup) null, false);
        int i = 2131428212;
        if (((FrameLayout) m5n1.t(viewInflate, 2131428212)) != null) {
            i = 2131428214;
            FrameLayout frameLayout = (FrameLayout) m5n1.t(viewInflate, 2131428214);
            if (frameLayout != null) {
                i = 2131428250;
                CoordinatorLayout coordinatorLayoutT = m5n1.t(viewInflate, 2131428250);
                if (coordinatorLayoutT != null) {
                    i = 2131430614;
                    RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131430614);
                    if (recyclerViewT != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        w2z w2zVar = new w2z(frameLayout2, frameLayout, coordinatorLayoutT, recyclerViewT);
                        recyclerViewT.getContext();
                        recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                        rwq0.s(recyclerViewT, new a7x0(recyclerViewT, (byte) 0));
                        vis visVarA = nfxVar.a((l0i) null);
                        coordinatorLayoutT.addView((BehaviorRetainingAppBarLayout) visVarA.b.b);
                        ((BackButtonView) visVarA.b.e).setAccessibilityTraversalAfter(coordinatorLayoutT.getId());
                        this.g = visVarA;
                        if (z6x0Var != null) {
                            b(z6x0Var);
                        }
                        this.i = w2zVar;
                        this.t = frameLayout2;
                        nzj nzjVar = new nzj(t8xVar.b.a);
                        frameLayout.addView(nzjVar.d);
                        this.X = nzjVar;
                        this.Y = frameLayout;
                        this.Z = true;
                        return;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        this.X.n(new c7x0(this, consumer, (byte) 0));
        this.g.n(new c7x0(this, consumer, (byte) 1));
        PublishSubject publishSubject = new PublishSubject();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.f(new Disposable[]{publishSubject.distinctUntilChanged(new uic(this, (byte) 20)).subscribe(new b7x0(this, (byte) 0)), publishSubject.distinctUntilChanged(new ulc(this, (byte) 20)).subscribe(new b7x0(this, (byte) 1)), ((sdx0) this.e.getValue()).j.distinctUntilChanged().subscribe(new b7x0(this, (byte) 2)), publishSubject.distinctUntilChanged(new eoc(this, (byte) 20)).subscribe(new z0u0(this, consumer, (byte) 6))});
        return new ibn(publishSubject, this, compositeDisposable, (byte) 7);
    }

    public final void a() {
        this.Y.setVisibility((((m5k) this.h.getValue()).e() != 0 || this.Z) ? 8 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    public final void b(z6x0 z6x0Var) {
        u17 u17Var;
        vik1 vik1Var;
        oxi0 oxi0Var = this.c;
        n7h1 n7h1Var = oxi0Var.b;
        r7x0 r7x0VarO = ob51.o(z6x0Var);
        if (r7x0VarO == null) {
            return;
        }
        m3x0 m3x0Var = z6x0Var.a;
        qzh qzhVar = this.g;
        qzhVar.f(r7x0VarO);
        if (z6x0Var.i) {
            String strG = pcf.g(m3x0Var.a);
            if (!strG.equals(oxi0Var.h)) {
                t480 t480Var = oxi0Var.g;
                if (t480Var != null && n7h1Var != null) {
                    n7h1Var.e(t480Var);
                }
                oxi0Var.g = null;
                oxi0Var.h = strG;
            }
            View viewFindViewById = qzhVar.getView().findViewById(2131429965);
            if (viewFindViewById != null) {
                d7x0 d7x0Var = new d7x0(this, (byte) 1);
                if (n7h1Var != null && (oxi0Var.f != viewFindViewById || (vik1Var = oxi0Var.e) == null || vik1Var.c == null)) {
                    vik1 vik1Var2 = oxi0Var.e;
                    if (vik1Var2 != null) {
                        vik1Var2.b();
                    }
                    oxi0Var.e = null;
                    oxi0Var.f = null;
                    t480 t480Var2 = oxi0Var.g;
                    if (t480Var2 != null && n7h1Var != null) {
                        n7h1Var.e(t480Var2);
                    }
                    oxi0Var.g = null;
                    oxi0Var.f = viewFindViewById;
                    ien0 ien0Var = xhk1.a;
                    op80 op80VarA = xhk1.a(viewFindViewById);
                    vik1 vik1Var3 = new vik1();
                    vik1Var3.e(viewFindViewById, d7x0Var, qon1.x(op80VarA), new lbc0(1, oxi0Var, oxi0.class, "onVisibilityChanged", "onVisibilityChanged(I)V", 0, (byte) 21), (r1t) null);
                    oxi0Var.e = vik1Var3;
                }
            }
        } else {
            vik1 vik1Var4 = oxi0Var.e;
            if (vik1Var4 != null) {
                vik1Var4.b();
            }
            oxi0Var.e = null;
            oxi0Var.f = null;
            t480 t480Var3 = oxi0Var.g;
            if (t480Var3 != null && n7h1Var != null) {
                n7h1Var.e(t480Var3);
            }
            oxi0Var.g = null;
        }
        yxe1 yxe1Var = new yxe1(new ehc1(z6x0Var.Z));
        cbr0 cbr0Var = this.a;
        cbr0Var.a(yxe1Var);
        String str = m3x0Var.d;
        if (str == null) {
            u17 u17Var2 = u17.b;
            hg10 hg10Var = new hg10(this.f, m3x0Var.a, m3x0Var.c, Integer.valueOf(m3x0Var.O0));
            hg10Var.h.c(hg10.i[0], hg10Var, Boolean.FALSE);
            u17Var = new u17(new tz6(hg10Var));
        } else {
            String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                u17 u17Var3 = u17.b;
                u17Var = kno1.y(str2);
            } else {
                u17 u17Var4 = u17.b;
                hg10 hg10Var2 = new hg10(this.f, m3x0Var.a, m3x0Var.c, Integer.valueOf(m3x0Var.O0));
                hg10Var2.h.c(hg10.i[0], hg10Var2, Boolean.FALSE);
                u17Var = new u17(new tz6(hg10Var2));
            }
        }
        cbr0Var.a(u17Var);
    }
}
