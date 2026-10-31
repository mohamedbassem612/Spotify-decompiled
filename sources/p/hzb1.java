package p;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzb1 implements isw {
    public final ConstraintLayout a;
    public final int b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final ConstraintLayout h;

    public hzb1(Context context, w2s w2sVar, iu30 iu30Var) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.a = constraintLayout;
        this.b = Color.argb(160, 0, 0, 0);
        dx0 dx0Var = (dx0) w2sVar.e;
        jpf1 jpf1Var = new jpf1();
        tka0 tka0Var = dtw.C;
        this.c = mhc.b(constraintLayout.getContext(), constraintLayout, dx0Var, jpf1Var, (ipb1) null, 112).w;
        this.d = xfo1.m((jpg0) w2sVar.f, constraintLayout).w;
        this.e = xfo1.m((wpw) w2sVar.b, constraintLayout).w;
        wpw wpwVar = (wpw) w2sVar.g;
        this.f = wpwVar != null ? xfo1.m(wpwVar, constraintLayout).w : null;
        wpw wpwVar2 = (wpw) w2sVar.h;
        this.g = wpwVar2 != null ? xfo1.m(wpwVar2, constraintLayout).w : null;
        constraintLayout.setOnClickListener(new zl51(iu30Var, (byte) 11));
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new x22(this, w2sVar));
        this.h = constraintLayout;
    }

    public final void a(Object obj, ysw yswVar) {
        azb1 azb1Var = (azb1) obj;
        int i = uah.i(this.b, azb1Var.b.a);
        ConstraintLayout constraintLayout = this.a;
        constraintLayout.setBackgroundColor(i);
        boolean z = azb1Var.a;
        boolean z2 = azb1Var.c;
        if (z) {
            dgo1.r(constraintLayout, true);
            wyb1.a(constraintLayout, 200L, 0L);
            wyb1.a(this.c, 200L, 100L);
            wyb1.a(this.e, 100L, 200L);
            View view = this.f;
            if (view != null) {
                wyb1.b(view, 200L);
            }
            wyb1.b(this.d, 300L);
            return;
        }
        if (!z2) {
            dgo1.r(constraintLayout, false);
            return;
        }
        gga1 gga1Var = new gga1(constraintLayout, (byte) 26);
        PathInterpolator pathInterpolator = wyb1.a;
        xy2 xy2Var = new xy2(constraintLayout, (byte) 12);
        oek1 oek1VarC = b8k1.c(constraintLayout);
        WeakReference weakReference = oek1VarC.a;
        oek1VarC.a(1.0f);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().setStartDelay(0L);
        }
        oek1VarC.d(200L);
        xy2Var.invoke(oek1VarC);
        oek1VarC.b(-1.0f);
        is3 is3Var = new is3(gga1Var, (byte) 11);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().withEndAction(is3Var);
        }
        oek1VarC.g();
    }

    public final View getView() {
        return this.h;
    }
}
