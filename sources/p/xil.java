package p;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xil extends onm {
    public z8d0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ConstraintTrackingWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xil(ConstraintTrackingWorker constraintTrackingWorker, onm onmVar) {
        super(onmVar);
        this.c = constraintTrackingWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.j(this);
    }
}
