package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ohk0 extends onm {
    public brv a;
    public wd21 b;
    public List c;
    public /* synthetic */ Object d;
    public final /* synthetic */ phk0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohk0(phk0 phk0Var, onm onmVar) {
        super(onmVar);
        this.e = phk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
