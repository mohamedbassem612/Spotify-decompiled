package p;

import android.os.SystemClock;
import android.view.Choreographer;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cfx0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ l0x0 f;

    public cfx0(l0x0 l0x0Var, long j, float f, long j2, long j3, int i) {
        this.f = l0x0Var;
        this.a = j;
        this.b = f;
        this.c = j2;
        this.d = j3;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Choreographer.FrameCallback frameCallback;
        int iElapsedRealtime = (int) (((SystemClock.elapsedRealtime() - this.a) * this.b) + this.c);
        l0x0 l0x0Var = this.f;
        ((ProgressBar) l0x0Var.b).setProgress(iElapsedRealtime);
        if (iElapsedRealtime >= this.d || (frameCallback = (od5) l0x0Var.d) == null) {
            return;
        }
        ((Choreographer) l0x0Var.c).postFrameCallbackDelayed(frameCallback, this.e);
    }
}
