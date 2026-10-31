package p;

import com.spotify.upsells.v1.proto.GatedFeatureContext;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j370 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ yfu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j370(yfu yfuVar, onm onmVar) {
        super(onmVar);
        this.b = yfuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f((GatedFeatureContext) null, (e2i1) null, (fyl) null, this);
    }
}
