package p;

import android.view.MotionEvent;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rpj0 extends pql1 {
    public final /* synthetic */ dif1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpj0(Window.Callback callback, dif1 dif1Var) {
        super(callback);
        this.b = dif1Var;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        dif1 dif1Var = this.b;
        if (dif1Var.d != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            dif1Var.f = -1;
                            dif1Var.i = false;
                            dif1Var.j = 0L;
                        } else if (actionMasked == 6 && !dif1Var.i && motionEvent.getPointerId(motionEvent.getActionIndex()) == dif1Var.f) {
                            int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                            dif1Var.f = motionEvent.getPointerId(i);
                            dif1Var.g = motionEvent.getX(i);
                            dif1Var.h = motionEvent.getY(i);
                        }
                    } else if (!dif1Var.i && (iFindPointerIndex = motionEvent.findPointerIndex(dif1Var.f)) >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex) - dif1Var.g;
                        float y = motionEvent.getY(iFindPointerIndex) - dif1Var.h;
                        if ((y * y) + (x * x) > dif1Var.c) {
                            dif1Var.i = true;
                        }
                    }
                } else if (dif1Var.f != -1) {
                    boolean z = dif1Var.i && dif1Var.k == null;
                    dif1Var.f = -1;
                    dif1Var.i = false;
                    dif1Var.j = 0L;
                    if (z) {
                        dif1Var.j = ((Number) dif1Var.a.invoke()).longValue() + 100;
                    }
                }
            } else {
                dif1Var.f = -1;
                dif1Var.i = false;
                dif1Var.j = 0L;
                dif1Var.f = motionEvent.getPointerId(0);
                dif1Var.g = motionEvent.getX();
                dif1Var.h = motionEvent.getY();
            }
        }
        return ((pql1) this).a.dispatchTouchEvent(motionEvent);
    }
}
