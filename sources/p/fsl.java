package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fsl implements g4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public fsl(muz0 muz0Var, t01 t01Var, kt91 kt91Var, yir yirVar, lzn0 lzn0Var, cir0 cir0Var) {
        this.a = (byte) 4;
        this.c = muz0Var;
        this.d = t01Var;
        this.e = kt91Var;
        this.f = yirVar;
        this.g = lzn0Var;
        this.b = cir0Var;
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                return new gzj(context, new j2i(912371612, new esl((cir0) obj6, (gsl) obj5, (d0r) obj4, (qim0) obj3, (qxl) obj2, (j2i) obj, (byte) 1), true));
            case 1:
                iac0 iac0VarH = x9p1.h(viewGroup);
                qe41 qe41VarW = hm5.w(viewGroup);
                if (iac0VarH == null) {
                    hhg1.n("Page should have lifecycleOwner");
                    return null;
                }
                if (qe41VarW == null) {
                    hhg1.n("Page should have SavedStateRegistry");
                    return null;
                }
                CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131626290, viewGroup, false);
                x9p1.p(coordinatorLayoutInflate, iac0VarH);
                ((hoc) obj2).b(coordinatorLayoutInflate);
                return new kqw((String) obj6, coordinatorLayoutInflate, (gqw) obj3, (fqw) obj4, (op80) obj5, qe41VarW, (mr20) obj, bundle);
            case 2:
                qzh qzhVarA = ((bgx) obj6).a((l0i) null);
                View view = (ConstraintLayout) ((ur00) ((ver) qzhVarA).b).b;
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
                return new cwd0(frameLayout, qzhVarA, (tjq) obj5, (ptf1) obj4, (fdc) obj3, (wmy) obj2, ((bwd0) obj).b);
            case 3:
                return new x3p0((u4p0) ((kly0) obj6).get(), (Completable) obj5, (lzn0) obj4, (e5p0) obj3, (ljg) obj2, (Flowable) obj, context, layoutInflater);
            default:
                return new n830(this, context, viewGroup);
        }
    }

    public /* synthetic */ fsl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
