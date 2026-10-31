package p;

import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v6y extends onm {
    public Exception a;
    public /* synthetic */ Object b;
    public final /* synthetic */ EngageRecommendationsClusterPublisher c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6y(EngageRecommendationsClusterPublisher engageRecommendationsClusterPublisher, onm onmVar) {
        super(onmVar);
        this.c = engageRecommendationsClusterPublisher;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.D((kb61) null, this);
    }
}
