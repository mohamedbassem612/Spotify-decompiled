package p;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wil extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ConstraintTrackingWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wil(ConstraintTrackingWorker constraintTrackingWorker, onm onmVar) {
        super(onmVar);
        this.b = constraintTrackingWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.i(null, null, null, this);
    }
}
