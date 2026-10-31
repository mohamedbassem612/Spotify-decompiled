package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rhd0 extends onm {
    public SceneTemplate.ListeningAgeContent.Card1 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ se8 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhd0(se8 se8Var, onm onmVar) {
        super(onmVar);
        this.d = se8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
