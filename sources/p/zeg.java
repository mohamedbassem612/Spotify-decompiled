package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zeg extends onm {
    public g7m1 a;
    public pe b;
    public StoryCard c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cfg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeg(cfg cfgVar, onm onmVar) {
        super(onmVar);
        this.e = cfgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, null, null, null, this);
    }
}
