package p;

import com.spotify.ondemandtrials.configimpl.OnDemandTrialFetchEndWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v3q0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ OnDemandTrialFetchEndWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3q0(OnDemandTrialFetchEndWorker onDemandTrialFetchEndWorker, onm onmVar) {
        super(onmVar);
        this.b = onDemandTrialFetchEndWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(this);
    }
}
