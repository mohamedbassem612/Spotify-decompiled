package p;

import com.spotify.campfire.datasource.impl.proto.ContributionPayload;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kad extends onm {
    public nad a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nad c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kad(nad nadVar, onm onmVar) {
        super(onmVar);
        this.c = nadVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.A((String) null, false, (ContributionPayload.Builder[]) null, this);
    }
}
