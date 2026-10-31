package p;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m191 extends k611 implements j611 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b = motionEvent.getPointerId(0);
            this.c = (int) (motionEvent.getX() + 0.5f);
            this.d = (int) (motionEvent.getY() + 0.5f);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.b);
            if (iFindPointerIndex >= 0 && this.a != 1) {
                int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                this.e = x - this.c;
                this.f = y - this.d;
            }
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.b = motionEvent.getPointerId(actionIndex);
            this.c = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.d = (int) (motionEvent.getY(actionIndex) + 0.5f);
        }
        return false;
    }

    public final void c(RecyclerView recyclerView, int i) {
        a layoutManager;
        boolean zQ;
        boolean zR;
        int i2 = this.a;
        this.a = i;
        if (i2 != 0 || i != 1 || (layoutManager = recyclerView.getLayoutManager()) == null || (zQ = layoutManager.q()) == (zR = layoutManager.r())) {
            return;
        }
        if ((!zQ || Math.abs(this.f) <= Math.abs(this.e)) && (!zR || Math.abs(this.e) <= Math.abs(this.f))) {
            return;
        }
        recyclerView.B0();
    }

    public final void d(boolean z) {
    }

    public final void f(MotionEvent motionEvent) {
    }
}
