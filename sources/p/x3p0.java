package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x3p0 implements f4h1 {
    public final u4p0 a;
    public final Completable b;
    public final lzn0 c;
    public final e5p0 d;
    public final ljg e;
    public final Flowable f;
    public final tdl0 g = new tdl0((byte) 12);
    public final rku h = new rku();
    public final rku i = new rku();
    public final ViewGroup t;

    public x3p0(u4p0 u4p0Var, Completable completable, lzn0 lzn0Var, e5p0 e5p0Var, ljg ljgVar, Flowable flowable, Context context, LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayout;
        this.a = u4p0Var;
        this.b = completable;
        this.c = lzn0Var;
        this.d = e5p0Var;
        this.e = ljgVar;
        this.f = flowable;
        ConstraintLayout coordinatorLayout = new CoordinatorLayout(context);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dg30 dg30Var = context instanceof dg30 ? (dg30) context : null;
        if (dg30Var != null && bqn1.z(dg30Var) && xoi1.a(context)) {
            constraintLayout = new ConstraintLayout(context);
            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            constraintLayout.setId(View.generateViewId());
            View view = new View(context);
            view.setId(View.generateViewId());
            coordinatorLayout.setId(View.generateViewId());
            constraintLayout.addView(view);
            constraintLayout.addView(coordinatorLayout);
            kil kilVar = new kil();
            kilVar.f(constraintLayout);
            kilVar.l(view.getId()).e.c = 0;
            kilVar.i(view.getId(), 0);
            kilVar.g(view.getId(), 6, 0, 6);
            kilVar.g(view.getId(), 3, 0, 3);
            kilVar.g(view.getId(), 4, 0, 4);
            kilVar.l(view.getId()).e.e0 = 0.5f;
            kilVar.l(coordinatorLayout.getId()).e.c = 0;
            kilVar.i(coordinatorLayout.getId(), 0);
            kilVar.g(coordinatorLayout.getId(), 6, view.getId(), 7);
            kilVar.g(coordinatorLayout.getId(), 7, 0, 7);
            kilVar.g(coordinatorLayout.getId(), 3, 0, 3);
            kilVar.g(coordinatorLayout.getId(), 4, 0, 4);
            kilVar.b(constraintLayout);
            coordinatorLayout.setPaddingRelative((int) (16.0f * context.getResources().getDisplayMetrics().density), 0, 0, 0);
        } else {
            constraintLayout = coordinatorLayout;
        }
        this.t = constraintLayout;
        u4p0Var.c(context, layoutInflater, coordinatorLayout);
        ViewGroup view2 = u4p0Var.getView();
        if (view2 == null) {
            hhg1.n("NowPlayingPageElement view not initialized");
            throw null;
        }
        coordinatorLayout.addView(view2);
        j7p1.y(coordinatorLayout, new ivn0(this, (byte) 19));
        h3n layoutParams = view2.getLayoutParams();
        h3n h3nVar = layoutParams instanceof h3n ? layoutParams : null;
        e3n e3nVar = h3nVar != null ? h3nVar.a : null;
        BottomSheetBehavior bottomSheetBehavior = e3nVar instanceof BottomSheetBehavior ? (BottomSheetBehavior) e3nVar : null;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.L(3);
        bottomSheetBehavior.t(new jph(this, (byte) 5));
    }

    public final Object getView() {
        return this.t;
    }

    public final void start() {
        this.a.start();
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((qyo0) ((ynb0) it.next()).get()).c();
        }
        this.h.b(this.b.subscribe(new wqd0(this, (byte) 12)));
        this.i.b(new FlowableSingleSingle(new FlowableTake(this.f)).onErrorReturn(ok10.Q0).flatMapCompletable(new yfc0(this, (byte) 26)).subscribe());
    }

    public final void stop() {
        this.i.a();
        this.h.a();
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((qyo0) ((ynb0) it.next()).get()).d();
        }
        this.a.stop();
    }
}
