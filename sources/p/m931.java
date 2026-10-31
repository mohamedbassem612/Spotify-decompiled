package p;

import com.spotify.campaignsservice.retrieval.v1.Retrieval;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m931 extends onm {
    public Retrieval a;
    public o931 b;
    public o931 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o931 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m931(o931 o931Var, onm onmVar) {
        super(onmVar);
        this.e = o931Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
