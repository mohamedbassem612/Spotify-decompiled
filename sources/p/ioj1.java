package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ioj1 {
    public Disposable A;
    public Disposable B;
    public boolean C;
    public coj1 D;
    public final FlowableMap a;
    public final yjj1 b;
    public final BehaviorProcessor c;
    public final NowPlayingScrollView d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final View g;
    public final View h;
    public final List i;
    public final View j;
    public final boolean k;
    public final OverlayHidingFrameLayout l;
    public final v9d1 m;
    public final View n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f34p;
    public final FlowableDistinctUntilChanged q;
    public final dtw r;
    public final u9c0 s;
    public final q8n t;
    public final joj1 u;
    public final r0y v;
    public xab1 w;
    public xab1 x;
    public Disposable y;
    public Disposable z;

    public ioj1(FlowableMap flowableMap, yjj1 yjj1Var, BehaviorProcessor behaviorProcessor, NowPlayingScrollView nowPlayingScrollView, ViewGroup viewGroup, ViewGroup viewGroup2, View view, View view2, List list, View view3, boolean z, OverlayHidingFrameLayout overlayHidingFrameLayout, v9d1 v9d1Var, View view4, View view5, boolean z2, FlowableDistinctUntilChanged flowableDistinctUntilChanged, dtw dtwVar, u9c0 u9c0Var, q8n q8nVar, joj1 joj1Var, r0y r0yVar) {
        this.a = flowableMap;
        this.b = yjj1Var;
        this.c = behaviorProcessor;
        this.d = nowPlayingScrollView;
        this.e = viewGroup;
        this.f = viewGroup2;
        this.g = view;
        this.h = view2;
        this.i = list;
        this.j = view3;
        this.k = z;
        this.l = overlayHidingFrameLayout;
        this.m = v9d1Var;
        this.n = view4;
        this.o = view5;
        this.f34p = z2;
        this.q = flowableDistinctUntilChanged;
        this.r = dtwVar;
        this.s = u9c0Var;
        this.t = q8nVar;
        this.u = joj1Var;
        this.v = r0yVar;
    }

    public final void a(ynj1 ynj1Var) {
        boolean zEquals = ynj1Var.equals(xnj1.a);
        NestedScrollView nestedScrollView = this.d;
        if (zEquals) {
            nestedScrollView.o();
            return;
        }
        if (!ynj1Var.equals(wnj1.a)) {
            eg.o();
            return;
        }
        int scrollY = nestedScrollView.getScrollY();
        int bottom = this.h.getBottom();
        if (scrollY < bottom) {
            nestedScrollView.C(0 - nestedScrollView.getScrollX(), bottom - nestedScrollView.getScrollY(), false);
        }
    }

    public final void b(int i, boolean z, boolean z2, boolean z3) {
        r0y r0yVar = this.v;
        idd1 idd1Var = r0yVar.c;
        Iterator it = this.i.iterator();
        while (true) {
            int i2 = 8;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if (z) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
        boolean z4 = z3 && (z2 || !z);
        this.n.setVisibility(!z4 ? 0 : 8);
        this.o.setVisibility(z4 ? 0 : 8);
        int iC = l1d.C(i);
        b7x b7xVar = b7x.a;
        OverlayHidingFrameLayout overlayHidingFrameLayout = this.l;
        if (iC == 0) {
            overlayHidingFrameLayout.c(true);
            if (this.C) {
                i8h1 i8h1Var = (i8h1) idd1Var.getValue();
                g5l0 g5l0VarF = r0yVar.f();
                x6h1 x6h1VarC = g5l0VarF.c.c();
                x6h1VarC.i.add(new a7h1("overlay_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), g5l0VarF.b, System.currentTimeMillis()), (xj61) null);
            }
        } else if (iC == 1) {
            overlayHidingFrameLayout.a(false);
            if (this.C) {
                i8h1 i8h1Var2 = (i8h1) idd1Var.getValue();
                g5l0 g5l0VarF2 = r0yVar.f();
                x6h1 x6h1VarC2 = g5l0VarF2.c.c();
                x6h1VarC2.i.add(new a7h1("overlay_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), g5l0VarF2.b, System.currentTimeMillis()), (xj61) null);
            }
        } else if (iC != 2) {
            eg.o();
            return;
        }
        this.C = true;
    }
}
