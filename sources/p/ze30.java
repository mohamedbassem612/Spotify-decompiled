package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ze30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af30 b;

    public /* synthetic */ ze30(af30 af30Var, byte b) {
        this.a = b;
        this.b = af30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        af30 af30Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = af30Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                af30Var.a();
                View view = af30Var.d;
                if (view.isEnabled() && !view.isLongClickable() && af30Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    af30Var.g = true;
                    break;
                }
                break;
        }
    }
}
