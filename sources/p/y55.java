package p;

import android.view.Choreographer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y55 implements Choreographer.FrameCallback {
    public final /* synthetic */ ohd a;
    public final /* synthetic */ iu30 b;

    public y55(ohd ohdVar, a65 a65Var, iu30 iu30Var) {
        this.a = ohdVar;
        this.b = iu30Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object m231Var;
        try {
            m231Var = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        this.a.resumeWith(m231Var);
    }
}
