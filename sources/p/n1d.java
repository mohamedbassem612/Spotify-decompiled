package p;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n1d implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public final Object d;

    public n1d(xwn0 xwn0Var, boolean z, Function0 function0) {
        this.a = (byte) 3;
        this.c = xwn0Var;
        this.b = z;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc9 jc9Var;
        switch (this.a) {
            case 0:
                ((g661) this.c).execute(new fe(this, (byte) 14));
                return;
            case 1:
                if (((wtg) this.c).Y) {
                    return;
                }
                ttg ttgVar = (ttg) ((wtg) this.c).f.get((String) this.d);
                if (ttgVar != null) {
                    ttgVar.f = this.b;
                }
                if (this.b && ttgVar != null) {
                    wtg wtgVar = (wtg) this.c;
                    String str = (String) this.d;
                    wtgVar.g = str;
                    lag lagVar = wtgVar.e;
                    jtg jtgVar = (jtg) lagVar.b;
                    gtg gtgVar = (gtg) jtgVar.d.a.getValue();
                    itg itgVar = (itg) jtgVar.b.get(str);
                    if (itgVar != null) {
                        long j = jtgVar.c + 1;
                        jtgVar.c = j;
                        itgVar.c = j;
                        if (!u890.j(((gtg) jtgVar.a.getValue()).a, str)) {
                            jtgVar.a(str);
                        }
                    }
                    gtg gtgVar2 = (gtg) jtgVar.d.a.getValue();
                    if (!u890.j(gtgVar2, gtgVar)) {
                        ((ftg) lagVar.c).a(gtgVar2);
                    }
                    if (u890.j(((gtg) jtgVar.d.a.getValue()).a, str)) {
                        lagVar.s(str);
                    }
                    ((wtg) this.c).c();
                }
                ((wtg) this.c).d();
                return;
            case 2:
                avn avnVar = (avn) this.d;
                h72 h72Var = avnVar.U0;
                int iIntValue = ((Number) avnVar.Y0.getValue()).intValue();
                boolean z = this.b;
                BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
                if (!z) {
                    behaviorRetainingAppBarLayout.getBehavior().v(iIntValue);
                    return;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(behaviorRetainingAppBarLayout.getBehavior().t(), iIntValue);
                valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.addUpdateListener(new f360(h72Var));
                valueAnimatorOfInt.start();
                return;
            case 3:
                xwn0 xwn0Var = (xwn0) this.c;
                try {
                    th30 th30Var = xwn0Var.b;
                    if (!th30Var.L && (this.b || !th30Var.U())) {
                        Function0 function0 = (Function0) this.d;
                        int i = xwn0Var.e;
                        xwn0Var.e = 2;
                        try {
                            function0.invoke();
                            xwn0Var.e = i;
                        } catch (Throwable th) {
                            xwn0Var.e = i;
                            throw th;
                        }
                    }
                    xwn0Var.d--;
                    return;
                } catch (Throwable th2) {
                    xwn0Var.d--;
                    throw th2;
                }
            case 4:
                if (this.b) {
                    return;
                }
                ((tac0) this.c).g((k8c0) this.d);
                this.b = true;
                return;
            default:
                View view = (View) this.c;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.d;
                k8k1 k8k1Var = swipeDismissBehavior.a;
                if (k8k1Var != null && k8k1Var.g()) {
                    WeakHashMap weakHashMap = b8k1.a;
                    view.postOnAnimation(this);
                    return;
                } else {
                    if (!this.b || (jc9Var = swipeDismissBehavior.b) == null) {
                        return;
                    }
                    jc9Var.p(view);
                    return;
                }
        }
    }

    public /* synthetic */ n1d(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public n1d(tac0 tac0Var, k8c0 k8c0Var) {
        this.a = (byte) 4;
        this.c = tac0Var;
        this.d = k8c0Var;
    }

    public n1d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = (byte) 5;
        this.d = swipeDismissBehavior;
        this.c = view;
        this.b = z;
    }

    public n1d(o1d o1dVar, g661 g661Var) {
        this.a = (byte) 0;
        this.d = o1dVar;
        this.b = false;
        this.c = g661Var;
    }
}
