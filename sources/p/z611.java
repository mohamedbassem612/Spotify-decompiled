package p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z611 implements j611 {
    public final GestureDetector a;
    public final c20 b;

    public z611(GestureDetector gestureDetector, c20 c20Var) {
        this.a = gestureDetector;
        this.b = c20Var;
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.a.onTouchEvent(motionEvent)) {
            return false;
        }
        this.b.onClick(recyclerView);
        return true;
    }

    public final void d(boolean z) {
    }

    public final void f(MotionEvent motionEvent) {
    }
}
