package p;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t55 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ v55 a;

    public t55(v55 v55Var) {
        this.a = v55Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        this.a.N();
        v55 v55Var = this.a;
        synchronized (v55Var.e) {
            if (v55Var.t) {
                v55Var.t = false;
                ArrayList arrayList = v55Var.g;
                v55Var.g = v55Var.h;
                v55Var.h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.N();
        v55 v55Var = this.a;
        synchronized (v55Var.e) {
            if (v55Var.g.isEmpty()) {
                v55Var.c.removeFrameCallback(this);
                v55Var.t = false;
            }
        }
    }
}
