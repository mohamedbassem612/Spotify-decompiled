package p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bn90 implements j611 {
    public final /* synthetic */ fn90 a;

    public bn90(fn90 fn90Var) {
        this.a = fn90Var;
    }

    @Override // p.j611
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        fn90 fn90Var = this.a;
        ((GestureDetector) fn90Var.W0.b).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        cn90 cn90Var = null;
        if (actionMasked == 0) {
            fn90Var.X = motionEvent.getPointerId(0);
            fn90Var.d = motionEvent.getX();
            fn90Var.e = motionEvent.getY();
            VelocityTracker velocityTracker = fn90Var.S0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            fn90Var.S0 = VelocityTracker.obtain();
            if (fn90Var.c == null) {
                ArrayList arrayList = fn90Var.O0;
                if (!arrayList.isEmpty()) {
                    View viewN = fn90Var.n(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        cn90 cn90Var2 = (cn90) arrayList.get(size);
                        if (cn90Var2.e.a == viewN) {
                            cn90Var = cn90Var2;
                            break;
                        }
                    }
                }
                if (cn90Var != null) {
                    w611 w611Var = cn90Var.e;
                    fn90Var.d -= cn90Var.i;
                    fn90Var.e -= cn90Var.j;
                    fn90Var.m(w611Var, true);
                    if (fn90Var.a.remove(w611Var.a)) {
                        fn90Var.Y.a(fn90Var.Q0, w611Var);
                    }
                    fn90Var.r(cn90Var.f, w611Var);
                    fn90Var.t(fn90Var.N0, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            fn90Var.X = -1;
            fn90Var.r(0, null);
        } else {
            int i = fn90Var.X;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                fn90Var.k(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = fn90Var.S0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return fn90Var.c != null;
    }

    @Override // p.j611
    public final void d(boolean z) {
        if (z) {
            this.a.r(0, null);
        }
    }

    @Override // p.j611
    public final void f(MotionEvent motionEvent) {
        fn90 fn90Var = this.a;
        an90 an90Var = fn90Var.R0;
        ((GestureDetector) fn90Var.W0.b).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = fn90Var.S0;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (fn90Var.X == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(fn90Var.X);
        if (iFindPointerIndex >= 0) {
            fn90Var.k(actionMasked, iFindPointerIndex, motionEvent);
        }
        w611 w611Var = fn90Var.c;
        if (w611Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    fn90Var.t(fn90Var.N0, iFindPointerIndex, motionEvent);
                    fn90Var.q(w611Var);
                    fn90Var.Q0.removeCallbacks(an90Var);
                    an90Var.run();
                    fn90Var.Q0.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == fn90Var.X) {
                    fn90Var.X = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    fn90Var.t(fn90Var.N0, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = fn90Var.S0;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        fn90Var.r(0, null);
        fn90Var.X = -1;
    }
}
