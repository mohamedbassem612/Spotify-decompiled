package p;

import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l6y extends onm {
    public Exception a;
    public /* synthetic */ Object b;
    public final /* synthetic */ EngageContinuationClusterPublisher c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6y(EngageContinuationClusterPublisher engageContinuationClusterPublisher, onm onmVar) {
        super(onmVar);
        this.c = engageContinuationClusterPublisher;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.D((kb61) null, this);
    }
}
