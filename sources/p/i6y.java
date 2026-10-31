package p;

import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterClearer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i6y extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ EngageContinuationClusterClearer b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6y(EngageContinuationClusterClearer engageContinuationClusterClearer, onm onmVar) {
        super(onmVar);
        this.b = engageContinuationClusterClearer;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.D((vuk) null, this);
    }
}
