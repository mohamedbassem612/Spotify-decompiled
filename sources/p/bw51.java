package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bw51 extends onm {
    public Set a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g931 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw51(g931 g931Var, onm onmVar) {
        super(onmVar);
        this.c = g931Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.p(this);
    }
}
