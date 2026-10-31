package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class atj0 extends onm {
    public g7m1 a;
    public SceneTemplate.MinutesListenedContent.Reveal b;
    public qj41 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ se8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atj0(se8 se8Var, onm onmVar) {
        super(onmVar);
        this.f = se8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
