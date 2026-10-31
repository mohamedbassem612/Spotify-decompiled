package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t2e0 extends onm {
    public Effect.LoadHomeStructure a;
    public Throwable b;
    public ice0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ y2e0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2e0(y2e0 y2e0Var, onm onmVar) {
        super(onmVar);
        this.e = y2e0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
