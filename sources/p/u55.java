package p;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u55 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ w55 a;

    public u55(w55 w55Var) {
        this.a = w55Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        this.a.N();
        w55 w55Var = this.a;
        synchronized (w55Var.e) {
            if (w55Var.t) {
                w55Var.t = false;
                ArrayList arrayList = w55Var.g;
                w55Var.g = w55Var.h;
                w55Var.h = arrayList;
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
        w55 w55Var = this.a;
        synchronized (w55Var.e) {
            if (w55Var.g.isEmpty()) {
                w55Var.c.removeFrameCallback(this);
                w55Var.t = false;
            }
        }
    }
}
