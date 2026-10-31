package p;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ooz0 implements View.OnTouchListener {
    public final p700 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View.OnTouchListener d;

    public ooz0(p700 p700Var, View view, View view2) {
        this.a = p700Var;
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        this.d = ibk1.g(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = (View) this.c.get();
        View view3 = (View) this.b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            uwg.c(this.a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
