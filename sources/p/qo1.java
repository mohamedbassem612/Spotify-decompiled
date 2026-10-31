package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qo1 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ so1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo1(so1 so1Var, onm onmVar) {
        super(onmVar);
        this.c = so1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n((List) null, this);
    }
}
